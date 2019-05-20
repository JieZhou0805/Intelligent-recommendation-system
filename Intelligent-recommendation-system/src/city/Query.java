package city;

import java.sql.*;
import java.util.*;

public class Query {
	String datasourceName = "";
	String tableName = "";
	String SQL;
	
	public Query(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.print(e);
		}
	}
	public void setDatasourceName(String s){
		datasourceName = s.trim();
	}
	public void setTableName(String s){
		tableName = s.trim();
	}
	public void setSQL(String SQL){
		this.SQL = SQL.trim();
	}
	public void inputQueryResult(){
		Connection con;
		Statement sql;
		ResultSet rs;
		try{
			String url = "jdbc:mysql://localhost:3306/project";
			String id = "root";
			String password = "123456";
			//con = DriverManager.getConnection(url,id,password);
			con = DriverManager.getConnection(url, "root", "123456");
			DatabaseMetaData metadata = con.getMetaData();
			ResultSet rsl = metadata.getColumns(null, null, tableName, null);
			int �ֶθ��� = 0;
			while(rsl.next()){
				�ֶθ���++;
			}
			sql = con.createStatement();
			rs = sql.executeQuery(SQL);
			while(rs.next()){
				for(int k=1;k<=�ֶθ���;k++){
					System.out.print("   "+rs.getString(k)+"   ");
				}
				System.out.println("");
			}
			con.close();
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}
	
	
	public static void main(String args[]){
		Query query = new Query();
		String dataSource = "project";
		String tableName = "�������Ϻ�����";
		query.setDatasourceName(dataSource);
		query.setTableName(tableName);
		query.setSQL("SELECT * FROM  �������Ϻ�����   WHERE ����ʱ > '21:00:00';");
		query.inputQueryResult();
	}
}


