<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Product Add Result</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${p.productname}</td>
        </tr>
        <tr>
            <td>Product Cost</td>
            <td>${p.cost}</td>
        </tr>
        <tr>
            <td>Product Retail</td>
            <td>${p.retail}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View all Products</a>
</body>
</html>