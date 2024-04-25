<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file = "seller-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<section class="cart_area">
			<div class="container">
				<div class="cart_inner">
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Image</th>
									<th scope="col">Product Name</th>
									<th scope="col">Product Price</th>
									<th scope="col">Product Category</th>
									<th scope="col">Product Description</th>
									<th scope="col">Edit</th>
									<th scope="col">Delete</th>
								</tr>
							</thead>
							<tbody>
							<%List<Product> list = ProductDAO.getProductsBySid(s.getId()); %>
								<%for(Product p:list){ %>
								<tr>
									<td>
										<div class="media">
											<div class="d-flex">
												<img src="images/<%=p.getPimage() %>" alt />
											</div>
											
										</div>
									</td>
									<td>
										<h5><%=p.getPname() %></h5>
									</td>
									<td>
										<h5><%=p.getPprice() %></h5>
									</td>
									<td>
										<h5><%=p.getPcategory() %></h5>
									</td>
									<td>
										<h5><%=p.getPdesc() %></h5>
									</td>
									<td><a class="btn" href="seller-single-product.jsp?id=<%=p.getPid()%>">Edit</a></td>
									<td><a class="btn" href="seller-delete-product.jsp?id=<%=p.getPid()%>">Delete</a></td>
								</tr>
								<%} %>
								
							</tbody>
						</table>
					
					</div>
				</div>
			</div>
		</section>
</body>
</html>