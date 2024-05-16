<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@page import="dao.CartDAO"%>
<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<main>

		<div class="hero-area section-bg2">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="slider-area">
							<div
								class="slider-height2 slider-bg4 d-flex align-items-center justify-content-center">
								<div class="hero-caption hero-caption2">
									<h2>Cart</h2>
									<nav aria-label="breadcrumb">
										<ol class="breadcrumb justify-content-center">
											<li class="breadcrumb-item"><a href="index-2.html">Home</a></li>
											<li class="breadcrumb-item"><a href="#">Cart</a></li>
										</ol>
									</nav>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<section class="cart_area">
			<div class="container">
				<div class="cart_inner">
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Product</th>
									<th scope="col">Price</th>
									<th scope="col">Quantity</th>
									<th scope="col">Total</th>
								</tr>
							</thead>
							<tbody>
								<%
								List<Cart> list = CartDAO.getCartByCusId(s.getId());
								%>
								<%
								int subtotal = 0;
								%>
								<%
								for (Cart c : list) {
								%>
								<%
								subtotal = subtotal + c.getTotal_price();
								%>
								<%
								Product p = ProductDAO.getProductById(c.getPid());
								%>

								<tr>
									<td>
										<div class="media">
											<div class="d-flex">
												<img src="assets/img/gallery/best-books1.html" alt />
											</div>
											<div class="media-body">
												<p><%=p.getPname()%></p>
											</div>
										</div>
									</td>
									<td>
										<h5><%=c.getPprice()%></h5>
									</td>
									<td>
										<div class="product_count">
											<form action="CartController" method="post">
												<input type="hidden" name="cart_id"
													value="<%=c.getCart_id()%>"> <input
													class="input-number" type="number" name="qty"
													value="<%=c.getQty()%>" onchange="this.form.submit();">

											</form>
										</div>
									</td>
									<td>
										<h5><%=c.getTotal_price()%></h5>
									</td>
								</tr>
								<%
								}
								%>

								<tr>
									<td></td>
									<td></td>
									<td>
										<h5>Subtotal</h5>
									</td>
									<td>
										<h5><%=subtotal%></h5>
									</td>
								</tr>

							</tbody>
						</table>
						<%Cart c = CartDAO.getSingleCartByCusId(s.getId()); %>
						
						<form method="post"
							action="payment.jsp?amount=<%=subtotal%>&cid=<%=c.getCart_id()%>">
							<table border="1">
								<tbody>
									<tr>
										<th>S.No</th>
										<th>Label</th>
										<th>Value</th>
									</tr>

									<tr>
										<td>1</td>
										<td><label>txnAmount*</label></td>
										<td><input title="TXN_AMOUNT" tabindex="10" type="text"
											name="TXN_AMOUNT" value="<%=subtotal%>"></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td><input value="CheckOut" type="submit" onclick=""></td>
									</tr>
								</tbody>
							</table>
							* - Mandatory Fields
						</form>
					</div>
				</div>
			</div>
		</section>

	</main>
</body>
</html>