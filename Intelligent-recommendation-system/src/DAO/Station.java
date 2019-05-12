package DAO;
 
 
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Util.JDBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
  
/**
 * desc������վ����
 * @author chaisson
 * @since 2015-5-31 ����10:22:44
 *
 */
class Station {
     
    private String name; //����վ���ƣ�����߱�Ψһ��
     
    public Station prev; //��վ��lineNo�������ǰһ��վ
     
    public Station next; //��վ��lineNo������ĺ�һ��վ
     
    //��վ��ĳһ��Ŀ��վ(key)������������վ����(value)������ǰ��˳��
    private Map<Station,LinkedHashSet<Station>> orderSetMap = new HashMap<Station,LinkedHashSet<Station>>();
     
    public Station (String name){
        this.name = name;
    }
  
    public Station  () {
        // TODO Auto-generated constructor stub
    }
 
    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
     
    public LinkedHashSet<Station> getAllPassedStations(Station station) {
        if(orderSetMap.get(station) == null){
            LinkedHashSet<Station> set = new LinkedHashSet<Station>(); 
            set.add(this);
            orderSetMap.put(station, set);
        }
        return orderSetMap.get(station);
    }
  
    public Map<Station, LinkedHashSet<Station>> getOrderSetMap() {
        return orderSetMap;
    }
     
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else if(obj instanceof Station){
            Station s = (Station) obj;
            if(s.getName().equals(this.getName())){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
     
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
}
  
/**
 * desc������Dijkstra�㷨���������վ����·�������Ͼ�����Ϊ��
 * @author chaisson
 * @since 2015-5-31 ����9:43:38
 *
 */
class Subway {
     
    private List<Station> outList = new ArrayList<Station>();//��¼�Ѿ���������վ��
     
    //�����s1վ��s2վ����̾���·��
    public void calculate(Station s1,Station s2){
        if(outList.size() == Subwayline.totalStaion){
            System.out.println("�ҵ�Ŀ��վ�㣺"+s2.getName()+"��������"+(s1.getAllPassedStations(s2).size()-1)+"վ");
            for(Station station : s1.getAllPassedStations(s2)){
                System.out.print(station.getName()+"->");
            }
            return;
        }
        if(!outList.contains(s1)){
            outList.add(s1);
        }
        //������վ��OrderSetMapΪ�գ����һ�������վ��ǰ��վ���ʼ��֮
        if(s1.getOrderSetMap().isEmpty()){
            List<Station> Linkedstations = getAllLinkedStations(s1);
            for(Station s : Linkedstations){
                s1.getAllPassedStations(s).add(s);
            }
        }
        Station parent = getShortestPath(s1);//��ȡ�������վs1�����һ��վ���ж���Ļ�������ȡһ����
        if(parent == s2){
            System.out.println("�ҵ�Ŀ��վ�㣺"+s2+"��������"+(s1.getAllPassedStations(s2).size()-1)+"վ");
            for(Station station : s1.getAllPassedStations(s2)){
                System.out.print(station.getName()+"->");
            }
            return;
        }
        for(Station child : getAllLinkedStations(parent)){
            if(outList.contains(child)){
                continue;
            }
            int shortestPath = (s1.getAllPassedStations(parent).size()-1) + 1;//ǰ�����1��ʾ����·����Ҫȥ������վ�㣬�������1��ʾ������1վ����
            if(s1.getAllPassedStations(child).contains(child)){
                //���s1�Ѿ����������child�ľ������룬��ô�Ƚϳ���С�ľ���
                if((s1.getAllPassedStations(child).size()-1) > shortestPath){
                    //����S1����Χ��վ����С·��
                    s1.getAllPassedStations(child).clear();
                    s1.getAllPassedStations(child).addAll(s1.getAllPassedStations(parent));
                    s1.getAllPassedStations(child).add(child);
                }
            } else {
                //���s1��û�м��������child�ľ�������
                s1.getAllPassedStations(child).addAll(s1.getAllPassedStations(parent));
                s1.getAllPassedStations(child).add(child);
            }
        }
        outList.add(parent);
        calculate(s1,s2);//�ظ����㣬������վ����չ
    }
     
    //ȡ����station������վ����̾��룬���1վ������Ϊ1����������
    private Station getShortestPath(Station station){
        int minPatn = Integer.MAX_VALUE;
        Station rets = null;
        for(Station s :station.getOrderSetMap().keySet()){
            if(outList.contains(s)){
                continue;
            }
            LinkedHashSet<Station> set  = station.getAllPassedStations(s);//����station��s������������վ��ļ���
            if(set.size() < minPatn){
                minPatn = set.size();
                rets = s;
            }
        }
        return rets;
    }
     
    //��ȡ����stationֱ������������վ�����������������վ
    private List<Station> getAllLinkedStations(Station station){
        List<Station> linkedStaions = new ArrayList<Station>();
        for(List<Station> line : Subwayline.lineSet){
            if(line.contains(station)){//���ĳһ���߰����˴�վ��ע��������д��hashcode������ֻ��name��ͬ������Ϊ��ͬһ������
                Station s = line.get(line.indexOf(station));
                if(s.prev != null){
                    linkedStaions.add(s.prev);
                }
                if(s.next != null){
                    linkedStaions.add(s.next);
                }
            }
        }
        return linkedStaions;
    }
  
    /**
     * desc: How to use the method
     * author chaisson
     * since 2015-5-31
     * version 1.0
     */
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        Subway sw = new Subway();
        sw.calculate(new Station("����ɽ"), new Station("����"));
        long t2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("��ʱ��"+(t2-t1)+"ms");
    }
}



 
class Subwayline {
    public static List<Station> line1 = new ArrayList<Station>();//1����
    public static List<Station> line2 = new ArrayList<Station>();//2����
    public static List<Station> line3 = new ArrayList<Station>();//3����
    public static List<Station> line4 = new ArrayList<Station>();//10����
    public static List<Station> line5 = new ArrayList<Station>();//s1����
    public static List<Station> line6 = new ArrayList<Station>();//s8����
    public static Set<List<Station>> lineSet = new HashSet<List<Station>>();//�����߼���
    public static int totalStaion = 0;//�ܵ�վ������
    static Connection conn;
    static PreparedStatement ps = null;
    static ResultSet rs;
    static String sql = "select * from line1";
    //1����
     
        public static List<Station> load1(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line1 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
        public static List<Station> load2(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line2 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
        public static List<Station> load3(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line3 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
        public static List<Station> load4(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line4 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
        public static List<Station> load5(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line5 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
        public static List<Station> load6(){
            conn=JDBUtil.getConn();
            ps=null;
            ResultSet rs=null;
            String id;
            sql="select name from line6 ";
//          sql="select * from station where Id between ? and ? order by Id";
            List<Station> users=new ArrayList<Station>();
            Station user=null;
            try {
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()) {
                    user=new Station();
                    user.setName(rs.getString("name"));
                    users.add(user);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                     if(ps!=null)ps.close();
                     if(conn!=null)conn.close();
                 }catch(Exception e2) {
                     e2.printStackTrace();
                 }
            }
            return users;
        }
         
         
         
        static {
     
            line1=load1();
            line2=load2();
            line3=load3();
            line4=load4();
            line5=load5();
            line6=load6();
        lineSet.add(line1);
        lineSet.add(line2);
        lineSet.add(line3);
        lineSet.add(line4);
        lineSet.add(line5);
        lineSet.add(line6);
        totalStaion  = line1.size() + line2.size() + line3.size() + line4.size() + line5.size() + line6.size();
        System.out.println("�ܵ�վ��������"+totalStaion);
    //}
        }
}
