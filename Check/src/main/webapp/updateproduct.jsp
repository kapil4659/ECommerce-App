<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<c:url value='/admin/updateproduct' var="url"></c:url>
	<form:form modelAttribute="product" action="${url }">
	<table>
	<tr>
	<td></td>
	<td><form:hidden path="id"></form:hidden></td>
	</tr>
	<tr>
	<td>Enter Product name</td>
	<td>
	<form:input path="productname"/>
	
	</td></tr>
	
	
	<tr>
	<form:textarea path="productdesc"/>
	<form:errors path="productdesc" cssStyle="color:red"></form:errors>
	</td>
	<tr>
	<td>EnterProduct Price</td>
	<td>
	<form:input path="price"/>
	<form:errors path="price" cssStyle="color:red"></form:errors>
	</td>
	<tr>
		<td>Enter Product Quantity</td>
	<td>
		<form:input action="quantity"></form:input>
		<form:errors path="quantity" cssStyle="color:red"></form:errors>
	</td>
	</tr><tr><td>
	</td>
	</tr>
</table>
</div>
</body>
</html>