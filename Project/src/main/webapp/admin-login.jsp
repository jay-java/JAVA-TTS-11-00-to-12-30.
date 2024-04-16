<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
					<div class="col-12">
						<h2 class="contact-title">Admin Login</h2>
					</div>
					<div class="col-lg-8">
						<form class="form-contact contact_form"
							action="https://preview.colorlib.com/theme/capitalshop/contact_process.php"
							method="post" id="contactForm" novalidate="novalidate">
							<div class="row">
								
								<div class="col-sm-6">
									<div class="form-group">
										<input class="form-control valid" name="email" id="email"
											type="email" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter email address'"
											placeholder="Email">
									</div>
								</div>
								<div class="col-12">
									<div class="form-group">
										<input class="form-control" name="password" id="subject"
											type="text" onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Enter Subject'"
											placeholder="Enter Password">
									</div>
								</div>
							</div>
							<div class="form-group mt-3">
								<button type="submit"
									class="button button-contactForm boxed-btn">Login</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>