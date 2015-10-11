<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 08.10.15
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit address</title>
</head>
<body>
<div>

    <form name="add_address" method="POST">
        Address: <input id="address" maxlength="40" name="address" placeholder="Enter address..." size="40" value="">
        Phone 1: <input class="phone" maxlength="15" name="phone1" placeholder="Enter phone..." size="40" value="">
        Phone 2: <input class="phone" maxlength="15" name="phone2" placeholder="Enter phone..." size="40" value="">
        Phone 3: <input class="phone" maxlength="15" name="phone3" placeholder="Enter phone..." size="40" value="">
        Phone 4: <input class="phone" maxlength="15" name="phone4" placeholder="Enter phone..." size="40" value="">
        Phone 5: <input class="phone" maxlength="15" name="phone5" placeholder="Enter phone..." size="40" value="">
    </form>
</div>
</body>
</html>
