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
						<h2 class="contact-title">Seller Forgot Password</h2>
					</div>
					<%
					String msg = (String)request.getAttribute("msg");
					if(msg!=null){
						%>
						<div class="col-12">
						<h4 class="contact-title"><%out.print(msg);%></h4>
					</div>
						<%
					}
					%>
				
					<div class="col-lg-8">
						<form 
							action="SellerController"
							method="post">
							<div class="row">
								<%String email =(String)request.getAttribute("email"); %>
									<div class="col-sm-6">
									<input type="hidden" name="email" value="<%=email %>">
									<div class="form-group">
										<input class="form-control valid" name="np" id="name"
											type="password" 
											placeholder="New Password">
									</div>
									<div class="form-group">
										<input class="form-control valid" name="cnp" id="name"
											type="password" 
											placeholder="Confirm New Password">
									</div>
								</div>
							
								
							</div>
							<div class="form-group mt-3">
								<button type="submit"
									class="button button-contactForm boxed-btn" name="action" value="new_p">New Password</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>