<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<!doctype html>
<html class="no-js" lang="zxx">

<!-- Mirrored from preview.colorlib.com/theme/capitalshop/ by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 16 Apr 2024 07:05:24 GMT -->
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Shop | eCommers</title>
<meta name="description" content>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/x-icon"
	href="assets/img/icon/favicon.png">

<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/owl.carousel.min.css">
<link rel="stylesheet" href="assets/css/slicknav.css">
<link rel="stylesheet" href="assets/css/flaticon.css">
<link rel="stylesheet" href="assets/css/animate.min.css">
<link rel="stylesheet" href="assets/css/price_rangs.css">
<link rel="stylesheet" href="assets/css/magnific-popup.css">
<link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
<link rel="stylesheet" href="assets/css/themify-icons.css">
<link rel="stylesheet" href="assets/css/slick.css">
<link rel="stylesheet" href="assets/css/nice-select.css">
<link rel="stylesheet" href="assets/css/style.css">
<script nonce="f068fdb2-59a1-45af-9c5f-01747b334d41">try{(function(w,d){!function(dr,ds,dt,du){dr[dt]=dr[dt]||{};dr[dt].executed=[];dr.zaraz={deferred:[],listeners:[]};dr.zaraz.q=[];dr.zaraz._f=function(dv){return async function(){var dw=Array.prototype.slice.call(arguments);dr.zaraz.q.push({m:dv,a:dw})}};for(const dx of["track","set","debug"])dr.zaraz[dx]=dr.zaraz._f(dx);dr.zaraz.init=()=>{var dy=ds.getElementsByTagName(du)[0],dz=ds.createElement(du),dA=ds.getElementsByTagName("title")[0];dA&&(dr[dt].t=ds.getElementsByTagName("title")[0].text);dr[dt].x=Math.random();dr[dt].w=dr.screen.width;dr[dt].h=dr.screen.height;dr[dt].j=dr.innerHeight;dr[dt].e=dr.innerWidth;dr[dt].l=dr.location.href;dr[dt].r=ds.referrer;dr[dt].k=dr.screen.colorDepth;dr[dt].n=ds.characterSet;dr[dt].o=(new Date).getTimezoneOffset();if(dr.dataLayer)for(const dE of Object.entries(Object.entries(dataLayer).reduce(((dF,dG)=>({...dF[1],...dG[1]})),{})))zaraz.set(dE[0],dE[1],{scope:"page"});dr[dt].q=[];for(;dr.zaraz.q.length;){const dH=dr.zaraz.q.shift();dr[dt].q.push(dH)}dz.defer=!0;for(const dI of[localStorage,sessionStorage])Object.keys(dI||{}).filter((dK=>dK.startsWith("_zaraz_"))).forEach((dJ=>{try{dr[dt]["z_"+dJ.slice(7)]=JSON.parse(dI.getItem(dJ))}catch{dr[dt]["z_"+dJ.slice(7)]=dI.getItem(dJ)}}));dz.referrerPolicy="origin";dz.src="../../cdn-cgi/zaraz/sd0d9.js?z="+btoa(encodeURIComponent(JSON.stringify(dr[dt])));dy.parentNode.insertBefore(dz,dy)};["complete","interactive"].includes(ds.readyState)?zaraz.init():dr.addEventListener("DOMContentLoaded",zaraz.init)}(w,d,"zarazData","script");})(window,document)}catch(e){throw fetch("/cdn-cgi/zaraz/t"),e;};</script>
</head>
<body>
	<div class="row">
		<div class="col-12">
			<h2 class="contact-title">Customer Registration</h2>
		</div>
		<div class="col-lg-8">
			<form action="CustomerController" method="post">
				<div class="row">
					<div class="col-sm-6">
						<div class="form-group">
							<input class="form-control valid" name="name" id="name"
								type="text" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter your name'"
								placeholder="Enter your name">
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<input class="form-control valid" name="contact" id="name"
								type="text" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter your name'"
								placeholder="Enter your name">
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<input class="form-control valid" name="address" id="name"
								type="text" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter your name'"
								placeholder="Enter your name">
						</div>
					</div>
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
					<button type="submit" name="action" value="register" class="button button-contactForm boxed-btn">Register</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>