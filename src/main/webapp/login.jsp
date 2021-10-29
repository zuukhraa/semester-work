<%@ page import="java.util.Objects" %>
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<html>
<head>
    <title>login</title>
<%--    <link rel="stylesheet" type="text/css" href="fontawesome/css/all.min.css">--%>
<%--     <link rel="stylesheet" type="text/css" href="css/login.css">--%>
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>

<%
    Cookie[] cookies=request.getCookies();
    String login= "", password = "",rememberMe="";
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login")) {
                login = cookie.getValue();
            }
            if(cookie.getName().equals("password")){
                password = cookie.getValue();
            }
            if(cookie.getName().equals("remember")){
                rememberMe = cookie.getValue();
            }
        }
    }
%>
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
            <p class="lead">
                <label><input type="checkbox" value="rememberMe"> Запомнить меня?</label>
            </p>
            <br>
            <button>Войти</button>
        </form>
    </div>
</div>
</body>
</html>