<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Product</title>
</head>
<body>

<form:form action="/addProduct?shop=${shop}" modelAttribute="product">

    <label>Packaging: </label><br>
    <form:input type="text" path="packaging"/>
    <form:errors path="packaging"/>

    <br><br>

    <label>Product Supplier: </label><br>
    <form:input type="text" path="supplier"/>
    <form:errors path="supplier"/>


    <br><br>

    <label>Wares:</label><br>
    <form:input type="text" path="wares"/>
    <form:errors path="wares"/>

    <br><br>

    <label>Price:</label><br>
    <form:input type="number" path="price"/>
    <form:errors path="price"/>

    <br><br>

    <input type="submit">
</form:form>
</body>
</html>