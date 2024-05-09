<%@page import="dao.WishLIstDAO"%>
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
int wid = Integer.parseInt(request.getParameter("wid"));
WishLIstDAO.removeItem(wid);
response.sendRedirect("wishlist.jsp");
%>
</body>
</html>