<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${products }<br>
<table>
<thead>
<tr>
<th>ID</th>
<th>ProductName</th>
<th>Price</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${products }" var="p">
<tr>
<td>${p.id }</td>
<td>${p.productname }</td>
<td>${p.price }</td>
<td></td>
<tr>
</c:forEach>
</tbody>
</table>
</body>
</html>