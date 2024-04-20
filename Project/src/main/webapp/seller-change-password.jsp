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
			<h2 class="contact-title">Seller Change Password</h2>
		</div>
		<%
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
		%>
		<div class="col-12">
			<h4 class="contact-title">
				<%
				out.print(msg);
				%>
			</h4>
		</div>
		<%
		}
		%>
		<%
		String msg1 = (String) request.getAttribute("msg1");
		if (msg1 != null) {
		%>
		<div class="col-12">
			<h4 class="contact-title">
				<%
				out.print(msg1);
				%>
			</h4>
		</div>
		<%
		}
		%>
		<div class="col-lg-8">
			<form action="SellerController" method="post">
				<div class="row">

					<input type="hidden" name="id" value="<%=s.getId()%>">
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="op" id="subject"
								type="password" placeholder="Old Password">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="np" id="subject"
								type="password" placeholder="New Password">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="cnp" id="subject"
								type="password" placeholder="Confirm New Password">
						</div>
					</div>
				</div>
				<div class="form-group mt-3">
					<button type="submit" class="button button-contactForm boxed-btn"
						name="action" value="cp">Change Password</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>