<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="fontawesome/css/all.min.css">
     <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div class="container">
    <div class="header">
        <h1>Вход</h1>
    </div>
    <div class="main">
        <form action="${pageContext.request.contextPath}/login" method="post">
            <span>
        <i class="fa fa-user"></i>
        <input type="text" placeholder="Логин" name="login">
    </span><br>
            <span>
        <i class="fa fa-lock"></i>
         <input type="password" placeholder="Пароль" name="password">
    </span>
            <br>
            <button>Войти</button>
        </form>
    </div>
</div>
</body>
</html>