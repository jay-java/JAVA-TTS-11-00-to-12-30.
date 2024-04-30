package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.WishList;

public class WishLIstDAO {
	public static void insertWishList(WishList w) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "insert into wishlist(cusid,pid) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getCustid());
			pst.setInt(2, w.getPid());
			pst.executeUpdate();
			System.out.println("prodcut added to wishlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<WishList> getWishListByCusId(int id){
		List<WishList> list =new ArrayList<WishList>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from wishlist where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				WishList w = new WishList();
				w.setWid(rs.getInt("wid"));
				w.setCustid(rs.getInt("cusid"));
				w.setPid(rs.getInt("pid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
