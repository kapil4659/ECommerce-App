<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value='/resource/css/bootstrap.css'></c:url>">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="js/bootstrap.js"></script>
	<link href="https://fonts.googleapis.com/css?family=Racing+Sans+One" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">CarShow</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <li><a href="<c:url value='/home'></c:url>"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li> 
        <li><a href="#"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>About Us</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>Contact Us</a></li>
         <li><a href="#"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Add Product</a></li>
         <li><a href="<c:url value='/all/getallproducts'></c:url>">Browse all products</a></li> 
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Select a Category <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#"><a href="https://www.bmw.in/en/all-models.html">BMW Models</a></li>
            <li><a href="#"><a href="https://www.zigwheels.com/newcars/Lamborghini">Lamborgini Models</a></li>
            <li><a href="#"><a href="https://www.zigwheels.com/newcars/MINI">Minicooper Models</a></li>
            <li><a href="#"><a href="https://www.zigwheels.com/newcars/Nissan">Nissan Models</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#"><a href="https://www.zigwheels.com/newcars/Honda">Other Suv</a></li>
          </ul>
        </li>
      </ul>
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>Sign Up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>Sign Out</a></li>
        </ul>
        </div>
        </div>
        </nav>

</body>
</html>