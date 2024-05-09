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
	<div class="listing-area pt-50 pb-50">
			<div class="container">
				<div class="row">

					<div class="col-xl-9 col-lg-8 col-md-8">
						<div class="latest-items latest-items2">
							<div class="row">
							<%List<WishList> list = WishLIstDAO.getWishListByCusId(s.getId()); %>
							<%for(WishList w :list){ %>
								<%Product p = ProductDAO.getProductById(w.getPid()); %>
								<div class="col-xl-4 col-lg-6 col-md-6 col-sm-6">
									<div class="properties pb-30">
										<div class="properties-card">
											<div class="properties-img">
												<a href="pro-details.html"><img
													src="images/<%=p.getPimage() %>" height="200" width="100"></a>
											</div>
											<div class="properties-caption properties-caption2">
												<h3>
													<%=p.getPname() %>
												</h3>
												<div class="properties-footer">
													<div class="price">
														<span><%=p.getPprice() %><span>
													</div>
												</div>
											</div>
											<h3>
													<a href="remove-from-wishlist.jsp?wid=<%=w.getWid()%>">Remove From WishList</a>
												</h3>
										</div>
									</div>
								</div>
				<%} %>
							
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>