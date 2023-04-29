<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="/css/main.css" rel="stylesheet"></link>
</head>
<body>
	<!-- //localhost:9096 - POST -->

	<form:form method="POST" modelAttribute="employee">
		<table>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Text:</td>
				<td><form:input path="text" /></td>
				<td><form:errors path="text" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>