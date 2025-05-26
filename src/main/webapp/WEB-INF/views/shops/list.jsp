<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Shops</title>
</head>
<body>
<h3>Shops List </h3> <br>
<c:forEach items="${shops}" var="shop">
    <b>Shop ${shop.getId()}</b><br>
    <p>Location: ${shop.getCity()}</p>
    <p>Founder: ${shop.getFounder()}</p>
    <a href="/products?shop=${shop.getId()}">Link to products of shop</a>
    <br><br><br>
</c:forEach>

</body>
</html>