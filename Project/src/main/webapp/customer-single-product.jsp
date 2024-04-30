<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="customer-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int id = Integer.parseInt(request.getParameter("id")); %>
<%Product p = ProductDAO.getProductById(id); %>
		<div class="services-area2 pt-50">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="row">
							<div class="col-xl-12">

								<div class="single-services d-flex align-items-center mb-0">
									<div class="features-img">
										<img src="images/<%=p.getPimage() %>" alt>
									</div>
									<div class="features-caption">
										<h3><%=p.getPname() %></h3>
										<p><%=p.getPcategory() %></p>
										<div class="price">
											<span><%=p.getPprice() %></span>
										</div>
										
										<a href="add-to-cart.jsp" class="white-btn mr-10">Add to Cart</a> 
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>