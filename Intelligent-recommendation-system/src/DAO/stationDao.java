package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javabean.station;


public class stationDao {

	public ArrayList queryTime(String stationname,String stationnum)  throws Exception {
		Connection conn = null;
		ArrayList stations= new ArrayList();
		try {
			//获取连接
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/project?useSSL=false";
			conn = DriverManager.getConnection(url, "root", "123456");
			// 运行SQL语句
			String sql = "SELECT *  from line WHERE 车站 LIKE '%" + stationname + "%' AND 地铁线 LIKE '%" + stationnum + "%' ";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
                //实例化VO
				station station = new station();
				station.setSubwayLine(rs.getString("地铁线"));
				station.setStation(rs.getString("车站"));
				station.setEndTime(rs.getInt("末车时间"));
				station.setStartTime(rs.getInt("首车时间"));
				stations.add(station);
			}
			rs.close();
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {// 关闭连接
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
			}
		}
		return stations;
	}
	
	
	
	
}
