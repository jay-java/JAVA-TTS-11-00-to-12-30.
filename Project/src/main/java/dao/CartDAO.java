package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Cart;

public class CartDAO {
	public static void insertIntoCart(Cart c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="insert into cart(cusid,pid,qty,pprice,total_price,payment_status) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCus_id());
			pst.setInt(2,c.getPid());
			pst.setInt(3, c.getQty());
			pst.setInt(4, c.getPprice());
			pst.setInt(5,c.getTotal_price());
			pst.setString(6, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("added to cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
