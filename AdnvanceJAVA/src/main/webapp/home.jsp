<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
User u = null;
if(session.getAttribute("data")!=null){
 	u = (User)session.getAttribute("data");
}
%>

<h1>User Data </h1>
<h3>Id : <%=u.getId() %></h3>
<h3>Name : <%=u.getName() %></h3>
<h3>Contact : <%=u.getContact() %></h3>
<h3>Address : <%=u.getAddress() %></h3>
<h3>Email : <%=u.getEmail() %></h3>
</body>
</html>