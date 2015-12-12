<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit item</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>

  
<form method="post" action="${ pageContext.request.contextPath }/edititem" class="form-horizontal">
  <div class="control-group">
    <label class="control-label" for="inputItem">Item</label>
    <div class="controls">
      <input type="text" id="inputItem" name="item" placeholder="Item" value="${ item }">
    </div>
    ${ erroritem }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputCategory">Category</label>
    <div class="controls">
      <input type="text" id="inputCategory" name="category" placeholder="Category" value="${ category }">
    </div>
    ${errorcategory }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputPlace">Place Shipped</label>
    <div class="controls">
      <input type="text" id="inputPlace" placeholder="Place Shipped" name="placeShiped" value="${ placeShiped }">
    </div>
    ${errorplaceShiped }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputNumber">Number</label>
    <div class="controls">
      <input type="text" id="inputNumber" name="number" placeholder="Number" value="${ number }">
    </div>
    ${numberError }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputDate">Date Rcvd</label>
    <div class="controls">
      <input type="text" id="inputDate" name="dateRcvd" placeholder="Date Rcvd" value="${ dateRcvd }">
    </div>
    ${dateError }
  </div>
  <div class="control-group">
    <label class="control-label" for="inputid">Id</label>
    <div class="controls">
      <input type="text" id="inputid" name="Id" placeholder="Id" value="${ id }">
    </div>
  </div>
  
  <div class="control-group">
    <div class="controls">
      
      <button type="submit" class="btn">Submit</button>
    </div>
  </div>
</form>

</body>
</html>