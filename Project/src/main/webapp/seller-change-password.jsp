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
								
								
								<div class="col-8">
									<div class="form-group">
										<input class="form-control" name="op" id="subject"
											type="password" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter Subject'"
											placeholder="old Password">
									</div>
								</div>
								<div class="col-8">
									<div class="form-group">
										<input class="form-control" name="np" id="subject"
											type="password" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter Subject'"
											placeholder="New Password">
									</div>
								</div>
								<div class="col-8">
									<div class="form-group">
										<input class="form-control" name="cnp" id="subject"
											type="password" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter Subject'"
											placeholder="Confirm New Password">
									</div>
								</div>
							</div>	
							<div class="form-group mt-3">
								<button type="submit"
									class="button button-contactForm boxed-btn" name="action" value="cp">Change Password</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>