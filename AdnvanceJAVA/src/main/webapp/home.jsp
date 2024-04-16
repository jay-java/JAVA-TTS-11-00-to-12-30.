<%@page import="java.util.List"%>
<%@page import="dao.UserDAO"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache"); 
response.setHeader ("Expires", "0"); //prevents caching at the proxy server
%>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	}
	%>

	<h1>User Data</h1>
	<h3>
		Id :
		<%=u.getId()%></h3>
	<h3>
		Name :
		<%=u.getName()%></h3>
	<h3>
		Contact :
		<%=u.getContact()%></h3>
	<h3>
		Address :
		<%=u.getAddress()%></h3>
	<h3>
		Email :
		<%=u.getEmail()%></h3>


	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Email</th>
					<th>Password</th>
					<th>EDIT</th>
					<th>Delete</th>
				</tr>
			</thead>
			<%List<User> list = UserDAO.getAllUser(); %>
			<tbody>
			<%for(User u1:list){ %>
				<tr>
					<td><%=u1.getId() %></td>
					<td><%=u1.getName()%></td>
					<td><%=u1.getContact() %></td>
					<td><%=u1.getAddress() %></td>
					<td><%=u1.getEmail() %></td>
					<td><%=u1.getPassword() %></td>
					<td>
						<form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=u1.getId() %>">
							<input type="submit" name="action" value="edit">
						</form>
					</td>
					<td>
						<form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=u1.getId() %>">
							<input type="submit" name="action" value="delete">
						</form>
					</td>
				
				</tr>
				<%} %>
			</tbody>
		</table>
		<h1><a href="logout.jsp">Logout</a></h1>
	</div>
</body>
</html>