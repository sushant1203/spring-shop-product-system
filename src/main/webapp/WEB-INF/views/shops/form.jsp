<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Shop</title>
</head>
<body>
<form:form action="/addShop" modelAttribute="shop">

    <label>Shop id:</label><br>
    <form:input type="number" path="id"/>
    <form:errors path="id"/>
    <br><br>

    <label>City where shop is located:</label><br>
    <form:input type="text" path="city"/>
    <form:errors path="city"/>
    <br><br>

    <label>Founder of shop:</label><br>
    <form:input type="text" path="founder"/>
    <form:errors path="founder"/>
    <br><br>

    <input type="submit">
</form:form>
</body>
</html>