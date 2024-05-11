<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
					<div class="col-12">
						<h2 class="contact-title">Seller Verify OTP</h2>
					</div>
					<div class="col-lg-8">
						<form action="SellerController" method="post">
							<div class="row">
								<%String email =(String)request.getAttribute("email"); %>
								<%int otp = (Integer)(request.getAttribute("otp")); %>
									<div class="col-sm-6">
									<input type="hidden" name="email" value="<%=email%>">
									<input type="hidden" name="otp1" value="<%=otp%>">
									<div class="form-group">
										<input class="form-control valid" name="otp2" id="name" type="text" 
											placeholder="Enter your OTP">
									</div>
								</div>
								
							</div>
							<div class="form-group mt-3">
								<button type="submit"
									class="button button-contactForm boxed-btn" name="action" value="verify">Verify</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>