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
<div class="row">
					<div class="col-12">
						<h2 class="contact-title">Seller Registration</h2>
					</div>
					<div class="col-lg-8">
						<form 
							action="SellerController"
							method="post">
							<div class="row">
							<input type="hidden" name="id" value="<%=s.getId()%>">
								<div class="col-sm-6">
									<div class="form-group">
										<input class="form-control valid" name="name" id="name"
											type="text" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter your name'"
											value="<%=s.getName()%>">
									</div>
								</div>
									<div class="col-sm-6">
									<div class="form-group">
										<input class="form-control valid" name="contact" id="name"
											type="text" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter your name'"
											value="<%=s.getContact()%>">
									</div>
								</div>
									<div class="col-sm-6">
									<div class="form-group">
										<input class="form-control valid" name="address" id="name"
											type="text" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter your name'"
											value="<%=s.getAddress()%>">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<input class="form-control valid" name="email" id="email"
											type="email" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter email address'"
											value="<%=s.getEmail()%>">
									</div>
								</div>
							</div>
							<div class="form-group mt-3">
								<button type="submit"
									class="button button-contactForm boxed-btn" name="action" value="update">Update</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>