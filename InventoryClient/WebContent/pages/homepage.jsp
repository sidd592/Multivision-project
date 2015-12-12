<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Items Homepage</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<br>
<br>
<a href="/InventoryClient/pages/add.jsp"> Add Item</a>
<br>
<br>
<br>
<table class="table table-striped">
<tr>
<th> item</th>
<th> category </th>
<th> number </th>
<th> dateRcvd</th>
<th> placeShipped </th>
</tr>

<c:forEach items="${items }" var ="item">
<tr>
<td><c:out value="${ item.getItem()}"></c:out></td>
<td><c:out value="${ item.getCategory()}"></c:out></td>
<td><c:out value="${ item.getNumber()}"></c:out></td>
<td><c:out value="${item.getDateRcvd()}"></c:out></td>
<td><c:out value="${ item.getPlaceShiped()}"></c:out></td>
<td>
<form method="post" action="${ pageContext.request.contextPath }/edititem">
<input type="hidden" name="id" value="${ item.getId()}">
<input type="hidden" name="item" value="${ item.getItem()}">
<input type="hidden" name="category" value="${ item.getCategory()}">
<input type="hidden" name="number" value="${ item.getNumber()}">
<input type="hidden" name="dateRcvd" value="${item.getDateRcvd()}">
<input type="hidden" name="placeShiped" value="${ item.getPlaceShiped()}">
<input type="submit" id="edititem" value="Update"  > 
</form>
</td>
<td>
<form method="post" action="${ pageContext.request.contextPath }/removeitem">
<input type="hidden" name="id" value="${ item.getId()}">
<input type="hidden" name="item" value="${ item.getItem()}">
<input type="hidden" name="category" value="${ item.getCategory()}">
<input type="hidden" name="number" value="${ item.getNumber()}">
<input type="hidden" name="dateRcvd" value="${ item.getDateRcvd()}">
<input type="hidden" name="placeShiped" value="${ item.getPlaceShiped()}">
<input type="submit" id="delete"  value="Remove">
</form>
</td>
</tr>
</c:forEach>

</table>


</body>
</html>