<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: chase
  Date: 3/10/23
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Product p1 = new Product("Chicken", 9.99);
    Product p2 = new Product("Fish", 19.99);
    Product p3 = new Product("Steak", 29.99);

    List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3));
    request.setAttribute("products", products);

%>
<html>
<head>
    <title>Products</title>
</head>
<body>
  <h1>Products</h1>

    <c:choose>
        <c:when test="${products.isEmpty()}">
            <p>No products</p>
        </c:when>
        <c:otherwise>
            <c:forEach var="product" items="${products}">
                <div>
                <h4>${product.name}</h4>
                <h4>$${product.cost}</h4>
                </div>
            </c:forEach>
        </c:otherwise>
    </c:choose>

</body>
</html>
