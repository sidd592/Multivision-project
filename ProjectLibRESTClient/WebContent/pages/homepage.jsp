<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Homepage</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.css"/>
</head>
<body>
<br>
<br>
<a href="/ProjectLibRESTClient/pages/create.jsp"> Create Book</a>
<br>
<br>
<br>
<table class="table table-striped">
<tr>
<th> title</th>
<th> author </th>
<th> year </th>
<th></th>
<th></th>
</tr>

<c:forEach items="${books }" var ="book">
<tr>
<td><c:out value="${ book.getTitle()}"></c:out></td>
<td><c:out value="${ book.getAuthor()}"></c:out></td>
<td><c:out value="${ book.getYear()}"></c:out></td>
<td>
<form method="post" action="${ pageContext.request.contextPath }/editme">
<input type="hidden" name="title" value="${ book.getTitle()}">
<input type="hidden" name="author" value="${ book.getAuthor()}">
<input type="hidden" name="year" value="${ book.getYear()}">
<input type="hidden" name="bid" value="${ book.getId()}">
<input type="submit" id="edit" value="Edit"  > 
</form>
</td>
<td>
<form method="post" action="${ pageContext.request.contextPath }/delete">
<input type="hidden" name="title" value="${ book.getTitle()}">
<input type="hidden" name="author" value="${ book.getAuthor()}">
<input type="hidden" name="year" value="${ book.getYear()}">
<input type="hidden" name="bid" value="${ book.getId()}">
<input type="submit" id="delete"  value="Delete">
</form>
</td>
</tr>
</c:forEach>

</table>



</body>
</html>