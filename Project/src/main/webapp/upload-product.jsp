<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="seller-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
		<div class="col-12">
			<h2 class="contact-title">Seller Upload Product</h2>
		</div>
		<div class="col-lg-8">
			<form action="ProductController" method="post" enctype="multipart/form-data">
				<div class="row">

					<input type="hidden" name="sid" value="<%=s.getId()%>">
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="image" id="subject"
								type="file">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pname" id="subject"
								type="text" placeholder="Product Name">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pprice" id="subject"
								type="text" placeholder="Product Price">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pcategory" id="subject"
								type="text" placeholder="Product Category">
						</div>
					</div>
					<div class="col-8">
						<div class="form-group">
							<input class="form-control" name="pdesc" id="subject"
								type="text" placeholder="Product Description">
						</div>
					</div>
				</div>
				<div class="form-group mt-3">
					<button type="submit" class="button button-contactForm boxed-btn"
						name="action" value="upload product">Upload</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>