<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Products</title>
</head>
<body>
<h3>Products List </h3> <br>
<c:forEach items="${products}" var="product">
    <b>Packaging: ${product.getPackaging()}</b><br>
    <p>Supplier: ${product.getSupplier()}</p>
    <p>Wares: ${product.getWares()}</p>
    <p>Price: ${product.getPrice()}</p>
    <br>
</c:forEach>
    <a href="/newProduct?shop=${shopId}">Add new product</a>
</body>
</html>