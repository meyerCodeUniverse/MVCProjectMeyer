<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Product Entry Form</h2>
<mvc:form modelAttribute="product" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="productname">Product Name</mvc:label></td>
	        <td><mvc:input path="productname" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="cost">Product Cost</mvc:label></td>
	        <td><mvc:input path="cost" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="retail">Product Retail</mvc:label></td>
	        <td><mvc:input path="retail" /></td>
	    </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Products</a>
</body>
</html>