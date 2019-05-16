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

	public ArrayList queryAllStudents() throws Exception {
		Connection conn = null;
		ArrayList stations= new ArrayList();
		try {
			//��ȡ����
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/project";
			conn = DriverManager.getConnection(url, "root", "123456");
			// ����SQL���
			String sql = "SELECT ������  from line";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
                //ʵ����VO
				station station = new station();
				station.setSubwayLine(rs.getString("������"));
				stations.add(station);
			}
			rs.close();
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {// �ر�����
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
