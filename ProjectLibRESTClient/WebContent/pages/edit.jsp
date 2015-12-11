<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.css"/>
</head>
<body>




<form method="post" action="${ pageContext.request.contextPath }/edit" class="form-horizontal">
  <div class="control-group">
    <label class="control-label" for="inputTitle">Title</label>
    <div class="controls">
      <input type="text" id="inputTitle" name="title" placeholder="Title" value="${ title }">
    </div>
    ${ errortitle }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputAuthor">Author</label>
    <div class="controls">
      <input type="text" id="inputAuthor" name="author" placeholder="Author" value="${ author }">
    </div>
    ${errorauthor }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputYear">Year</label>
    <div class="controls">
      <input type="text" id="inputYear" placeholder="year" name="year" value="${ year }">
    </div>
    ${erroryear }
  </div>
  <input type="hidden" name="bid" value="${ bid }">
  <div class="control-group">
    <div class="controls">
      
      <button type="submit" class="btn">Submit</button>
    </div>
  </div>
</form>

</body>
</html>