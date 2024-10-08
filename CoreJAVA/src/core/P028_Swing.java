package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

class ErrorFrame {
	public ErrorFrame() {
		JFrame fr1 = new JFrame("Error");
		fr1.setVisible(true);
		fr1.setSize(300, 200);
		fr1.setLayout(null);

		JLabel l = new JLabel("Data not Found");
		l.setBounds(50, 50, 120, 20);
		fr1.add(l);
	}
}

class SwingDemo implements ActionListener {
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2, b3, b4;

	public SwingDemo() {
		JFrame fr = new JFrame("MyApp");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);

		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);

		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);

		l3 = new JLabel("Contact : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);

		l4 = new JLabel("Address : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);

		t1 = new JTextField();
		t1.setBounds(230, 100, 120, 20);
		fr.add(t1);

		t2 = new JTextField();
		t2.setBounds(230, 130, 120, 20);
		fr.add(t2);

		t3 = new JTextField();
		t3.setBounds(230, 160, 120, 20);
		fr.add(t3);

		t4 = new JTextField();
		t4.setBounds(230, 190, 120, 20);
		fr.add(t4);

		b1 = new JButton("Insert");
		b1.setBounds(100, 250, 120, 20);
		fr.add(b1);

		b2 = new JButton("Search");
		b2.setBounds(250, 250, 120, 20);
		fr.add(b2);

		b3 = new JButton("Update");
		b3.setBounds(100, 280, 120, 20);
		fr.add(b3);

		b4 = new JButton("Delete");
		b4.setBounds(250, 280, 120, 20);
		fr.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	public static Connection driverConnection() {
		Connection conn = null;
		try {
			// driver name -> forName responsible to load driver into project
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connectivity URL
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("insert button clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			System.out.println(id + name + contact + address);
			try {
				Connection conn = SwingDemo.driverConnection();
				String sql = "insert into user(id,name,contact,address) values(?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setLong(3, contact);
				pst.setString(4, address);
				pst.executeUpdate();
				System.out.println("data inserted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
//				executeUpdate -> DML
//				executeQuery -> DQL
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else if (e.getSource() == b2) {
			System.out.println("search button clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn = SwingDemo.driverConnection();
				String sql = "select * from user where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					t1.setText(String.valueOf(rs.getInt("id")));
					t2.setText(rs.getString("name"));
					t3.setText(String.valueOf(rs.getLong("contact")));
					t4.setText(rs.getString("address"));
				} else {
					System.out.println("data not found");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					new ErrorFrame();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (e.getSource() == b3) {
			System.out.println("update button clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			try {
				Connection conn = SwingDemo.driverConnection();
				String sql = "update user set name=?,contact=?,address=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, name);
				pst.setLong(2, contact);
				pst.setString(3, address);
				pst.setInt(4, id);
				pst.executeUpdate();
				System.out.println("data updated");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else if (e.getSource() == b4) {
			System.out.println("delete button clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn = SwingDemo.driverConnection();
				String sql = "delete from user where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("data deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

public class P028_Swing {
	public static void main(String[] args) {
		new SwingDemo();
	}
}
