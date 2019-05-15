package Subway;

 

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;

import java.util.Set;
import java.util.HashMap;

import java.util.LinkedHashSet;

import java.util.Map;

import java.util.ArrayList;

import java.util.LinkedHashSet;

import java.util.List;

/**

 * desc:�������ݹ�ϵ�����Ͼ�����վ1\2\3\10����Ϊ����

 * @author chaisson

 * @since 2015-5-31 ����10:23:52

 *

 */

class DataBuilder {

	

	public static List<Station> line1 = new ArrayList<Station>();//1����

	public static List<Station> line2 = new ArrayList<Station>();//2����

	public static List<Station> line3 = new ArrayList<Station>();//3����

	public static List<Station> line10 = new ArrayList<Station>();//10����

	public static List<Station> lineS1 = new ArrayList<Station>();//s1����

	public static List<Station> lineS8 = new ArrayList<Station>();//s8����

	public static Set<List<Station>> lineSet = new HashSet<List<Station>>();//�����߼���

	public static int totalStaion = 0;//�ܵ�վ������

	static {		

		//1����

		String line1Str = "������վ����ɽ����԰վ���Ͼ�վ����ģ����·վ��������վ����¥վ���齭·վ���½ֿ�վ���Ÿ�԰վ����ɽ��վ���л���վ��������վ����¡��վ��������վ��������վ���Ͼ���վ��˫�����վ���Ӷ���վ��ʤ̫·վ���ټҺ�վ��С����վ����ɽ·վ����ӡ���վ�����ߴ��վ����ҽ�󡤽��վ�óѧԺվ���Ͼ���Ժվ���й�ҩ�ƴ�ѧվ";

		String[] line1Arr = line1Str.split("��");

		for(String s : line1Arr){

			line1.add(new Station(s,"1"));

		}

		for(int i =0;i<line1.size();i++){

			if(i<line1.size()-1){

				line1.get(i).next = line1.get(i+1);

				line1.get(i+1).prev = line1.get(i);

			}

		}

		

		/*******************************************************************************/

		//2����

		String line2Str = "�ͷ���վ��������վ��Ԫͨվ�����嶫վ����¡���վ�������Ŵ��վ���ƽ�·վ��Ī���վ��������վ���Ϻ�·վ���½ֿ�վ�����й�վ��������վ�����ʹ�վ����ޣ԰վ������վ��Т����վ�������վ����Ⱥվ������·վ���ɺ���վ��ѧ��·վ����������վ����ɽ��԰վ���ϴ�����У��վ������·վ";

		String[] line2Arr = line2Str.split("��");

		for(String s : line2Arr){

			line2.add(new Station(s,"2"));

		}

		for(int i =0;i<line2.size();i++){

			if(i<line2.size()-1){

				line2.get(i).next = line2.get(i+1);

				line2.get(i+1).prev = line2.get(i);

			}

		}

		

		/*******************************************************************************/

		//3����

		String line3Str = "�ֳ�վ���ǻ�·վ���������ѧԺվ��̩��·վ�������վ�����޶�·վ����Ԫ��վ�������㳡վ��С��վ���Ͼ�վ���Ͼ���ҵ��ѧ����ׯվ��������վ������վ�����й�վ��������վ��������վ���䶨��վ���껨��վ��������վ������·վ�������㳡վ���Ͼ���վ�����˴��վ��ʤ̫��·վ����Ԫ��·վ��������վ�����Ŵ��վ�����������У��վ�����ܶ�·վ";

		String[] line3Arr = line3Str.split("��");

		for(String s : line3Arr){

			line3.add(new Station(s,"3"));

		}

		for(int i =0;i<line3.size();i++){

			if(i<line3.size()-1){

				line3.get(i).next = line3.get(i+1);

				line3.get(i+1).prev = line3.get(i);

			}

		}

		

        /*******************************************************************************/		

		//10����

		String line10Str = "��ɽ·վ���ĵ�·վ������·վ���Ͼ���ҵ��ѧվ���ֿ�����վ���ٽ�վ��������վ���̲�԰վ���ζ����վ����������վ��Ԫͨվ����ʤվ��С��վ��������վ";

		String[] line10Arr = line10Str.split("��");

		for(String s : line10Arr){

			line10.add(new Station(s,"10"));

		}

		for(int i =0;i<line10.size();i++){

			if(i<line10.size()-1){

				line10.get(i).next = line10.get(i+1);

				line10.get(i+1).prev = line10.get(i);

			}

		}

		

		/*******************************************************************************/		

		//s1����

		String lineS1Str = "�Ͼ���վ������ɽվ���Ӻ���ѧ�������·վ����ӡ���վ��������·վ������·��վ������·��վ��»�ڻ���վ";

		String[] lineS1Arr = lineS1Str.split("��");

		for(String s : lineS1Arr){

			lineS1.add(new Station(s,"s1"));

		}

		for(int i =0;i<lineS1.size();i++){

			if(i<lineS1.size()-1){

				lineS1.get(i).next = lineS1.get(i+1);

				lineS1.get(i+1).prev = lineS1.get(i);

			}

		}

		

		/*******************************************************************************/		

		//s8����

		String lineS8Str = "̩ɽ�´�վ��̩��·վ�����¿�����վ����Ϣ���̴�ѧվ��ж�׵�վ����վ������վ����«վ������԰վ�����Ͽ�����վ������վ������վ�����ɽ��԰վ�����ݹ㳡վ������վ���˰���վ����ţ��վ";

		String[] lineS8Arr = lineS8Str.split("��");

		for(String s : lineS8Arr){

			lineS8.add(new Station(s,"s8"));

		}

		for(int i =0;i<lineS8.size();i++){

			if(i<lineS8.size()-1){

				lineS8.get(i).next = lineS8.get(i+1);

				lineS8.get(i+1).prev = lineS8.get(i);

			}

		}

		

		lineSet.add(line1);

		lineSet.add(line2);

		lineSet.add(line3);

		lineSet.add(line10);

		lineSet.add(lineS1);

		lineSet.add(lineS8);

		totalStaion  = line1.size() + line2.size() + line3.size() + line10.size() + lineS1.size() + lineS8.size();

		System.out.println("�ܵ�վ��������"+totalStaion);

	}

}

/**
 * desc������վ����
 */

class Station {
	private String name; //����վ���ƣ�����߱�Ψһ��
	public Station prev; //��վ��lineNo�������ǰһ��վ
	public Station next; //��վ��lineNo������ĺ�һ��վ

	public String num; 

	//��վ��ĳһ��Ŀ��վ(key)������������վ����(value)������ǰ��˳��

	private Map<Station,LinkedHashSet<Station>> orderSetMap = new HashMap<Station,LinkedHashSet<Station>>();
	public Station (String name,String num){
		this.name = name;
		this.num = num;
	}

 

	public String getName() {

		return name;

	}
 
	public void setName(String name) {

		this.name = name;

	}
	
	public String getNum() {
		return num+"����";

	}
	
	public void setNum(String num) {

		this.num = num;
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

public class Subway {

	

	private List<Station> outList = new ArrayList<Station>();//��¼�Ѿ���������վ��

	

	//�����s1վ��s2վ����̾���·��

	public void calculate(Station s1,Station s2){

		if(outList.size() == DataBuilder.totalStaion){

			System.out.println("�ҵ�Ŀ��վ�㣺"+s2.getName()+"��������"+(s1.getAllPassedStations(s2).size()-1)+"վ");
			int i=0;
			for(Station station : s1.getAllPassedStations(s2)){
				if(i==0){
					System.out.print(station.getName()+"->");
					i++;
				}
				else{
					
						System.out.print(station.getNum()+station.getName()+"->");
						i++;
						
				}
				

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

		for(List<Station> line : DataBuilder.lineSet){

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

		sw.calculate(new Station("��ɽ����԰վ",""), new Station("�ƽ�·վ",""));

		long t2 = System.currentTimeMillis();

		System.out.println();

		System.out.println("��ʱ��"+(t2-t1)+"ms");

	}

}

