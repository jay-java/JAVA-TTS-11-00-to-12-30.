package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Cart;

public class CartDAO {
	public static void insertIntoCart(Cart c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="insert into cart(cusid,pid,qty,pprice,total_price,subtotal,payment_status) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCus_id());
			pst.setInt(2,c.getPid());
			pst.setInt(3, c.getQty());
			pst.setInt(4, c.getPprice());
			pst.setInt(5,c.getTotal_price());
			pst.setInt(6, c.getSubtotal());
			pst.setString(7, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("added to cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Cart> getCartByCusId(int id){
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="select * from cart where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Cart c = new Cart();
				c.setCart_id(rs.getInt("cart_id"));
				c.setCus_id(rs.getInt("cusid"));
				c.setPid(rs.getInt("pid"));
				c.setQty(rs.getInt("qty"));
				c.setPprice(rs.getInt("pprice"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setSubtotal(rs.getInt("subtotal"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Cart getCartByCartId(int cart_id){
		Cart c = null;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="select * from cart where cart_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cart_id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				c = new Cart();
				c.setCart_id(rs.getInt("cart_id"));
				c.setCus_id(rs.getInt("cusid"));
				c.setPid(rs.getInt("pid"));
				c.setQty(rs.getInt("qty"));
				c.setPprice(rs.getInt("pprice"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setSubtotal(rs.getInt("subtotal"));
				c.setPayment_status(rs.getString("payment_status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	public static void updateCart(Cart c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="update cart set qty=?,total_price=?,subtotal=? where cart_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getQty());
			pst.setInt(2,c.getTotal_price());
			pst.setInt(3, c.getSubtotal());
			pst.setInt(4, c.getCart_id());
			pst.executeUpdate();
			System.out.println("cart updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
