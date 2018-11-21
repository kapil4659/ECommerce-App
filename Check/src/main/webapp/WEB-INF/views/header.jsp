<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<link rel="stylesheet" href="<c:url value='/resources/css/registrationform.css'></c:url>">
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<link href="https://fonts.googleapis.com/css?family=Racing+Sans+One" rel="stylesheet">
<title>Insert title here</title>
</head>

<body>
	<nav class="navbar navbar-light " style="background-color:#02e3fc; ">
	<div class="container-fluid">
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="<c:url value='/home'></c:url>"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span> Home <span
						class="sr-only">(current)</span></a></li>
				<li><a href="<c:url value='/admin/addproduct'></c:url>"><span
						class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add
						products </a></li>
				<li><a href="<c:url value='/all/getallproducts'></c:url>"><span
						class="glyphicon glyphicon-plus" aria-hidden="true"></span> Browse
						all products </a></li>
				<li><a href="Sign_up.jsp">SignUp & Login</a></li>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
				</button>
			</form>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="navbar-brand">
					<div id="change">
						<span class="glyphicon glyphicon-phone" aria-hidden="true"></span>MobKart
						<span class="glyphicon glyphicon-headphones" aria-hidden="true"></span>
					</div>
				</div>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Wishlist<span
						class="glyphicon glyphicon-heart" aria-hidden="true"></span></a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Cart</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">More <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Contact Us</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Reviews</a></li>
						<li><a href="#"></a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	</nav>

	<nav class="navbar navbar-default">
	<ul class="nav navbar-nav">
		<li class="dropdown"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Shop by Brands<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="#">APPLE</a></li>
				<li role="separator" class="divider"></li>
				<li><a href="#">SAMSUNG</a></li>
				<li><a href="#">MOTOROLA</a></li>
				<li><a href="#">ASUS</a></li>
				<li><a href="#">MI</a></li>
				<li><a href="#">OPPO</a></li>
				<li><a href="#">VIVO</a></li>
			</ul></li>
	</ul>
	<ul class="nav navbar-nav">
		<li class="dropdown"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown" id="dropdrownMenu1" role="button"
			aria-haspopup="true" aria-expanded="true">Mobile Accessories <span
				class="caret"></span></a>
			<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				<li><a href="#">Earphones</a></li>
				<li><a href="#">Charger</a></li>
				<li><a href="#">Backcovers</a></li>
				<li><a href="#">Screen guards</a></li>
				<li><a href="#">Headphones</a></li>
				<li><a href="#">Power Banks</a></li>
				<li><a href="#">Mobile Cables</a></li>
			</ul></li>
	</ul>



	<!-- 			<li class="dropdown"> --> <!--           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a> -->
	<!--           <ul class="dropdown-menu"> --> <!--             <li><a href="#">Action</a></li> -->
	<!--             <li><a href="#">Another action</a></li> --> <!--             <li><a href="#">Something else here</a></li> -->
	<!--             <li role="separator" class="divider"></li> --> <!--             <li><a href="#">Separated link</a></li> -->
	<!--             <li role="separator" class="divider"></li> --> <!--             <li><a href="#">One more separated link</a></li> -->
	<!--           </ul> --> <!--         </li> --> </nav>
</body>
</html>