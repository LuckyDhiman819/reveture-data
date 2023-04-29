<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add product Form</h1>

<form:form action="saveProduct" modelAttribute="product">
    <form:errors path="*" class="error"></form:errors>
    <br/>
    <br/>
      Product Id : <form:input path="productId" /><form:errors path="productId" class="error" /><br/>
      Product Name : <form:input path="productName" /><form:errors path="productName" class="error" /><br/>
      Quantity On hand : <form:input path="quantityOnHand" /><form:errors path="quantityOnHand" class="error"  /><br/>
      Price : <form:input path="price" /><form:errors path="price"  class="error" /><br/>
      <input type="submit" value="Save Product">
  </form:form>

</body>
</html>