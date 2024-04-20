package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Seller;

public class SellerDAO {
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="select * from seller where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void insertSeller(Seller s) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "insert into seller(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setString(5, s.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Seller sellerLogin(Seller s)
	{
		Seller s1 = null;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from seller where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s1 = new Seller();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
	public static void updateProfile(Seller s) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "update seller set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setInt(5, s.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkOP(int id,String op) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from seller where id=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void updatePassword(int id,String np) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "update seller set password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("pass updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
