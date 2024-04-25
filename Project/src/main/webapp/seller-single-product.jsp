<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int id = Integer.parseInt(request.getParameter("id")); %>
<%Product p = ProductDAO.getProductById(id); %>
	<div class="col-12">
			<h2 class="contact-title">Seller Manage Product</h2>
		</div>
		<div class="col-lg-8">
			<form action="ProductController" method="post" enctype="multipart/form-data">
				<div class="row">

					<input type="hidden" name="pid" value="<%=p.getPid()%>">
					<div class="col-8">
						<img src="images/<%=p.getPimage()%>" height="200" width="200">
						<div class="form-group">
							<input class="form-control" name="image" id="subject"
								type="file">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pname" id="subject"
								type="text" value="<%=p.getPname()%>">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pprice" id="subject"
								type="text" value="<%=p.getPprice()%>">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pcategory" id="subject"
								type="text" value="<%=p.getPcategory()%>">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pdesc" id="subject"
								type="text" value="<%=p.getPdesc()%>">
						</div>
					</div>
				</div>
				<div class="form-group mt-3">
					<button type="submit" class="button button-contactForm boxed-btn"
						name="action" value="update product">Update</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>