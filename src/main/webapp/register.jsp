<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<html lang="en" dir="ltr">
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>
<div class="center">
    <h1>Регистрация</h1>
    <form action="/register" method="post">
        <div class="txt_field">
            <input type="text" name="firstName" placeholder="Имя">
        </div>
        <div class="txt_field">
            <input type="text" name="lastName" placeholder="Фамилия">
        </div>
        <div class="txt_field">
            <input type="text" name="login" placeholder="Логин">
        </div>
        <div class="txt_field">
            <input type="password" name="password" placeholder="Пароль">
        </div>
        <div class="txt_field">
            <input type="text" name="phone" placeholder="Телефон">
        </div>
        <div class="txt_field">
            <input type="text" name="faculty_name" placeholder="Факультет">
        </div>
        <input type="submit" value="Зарегистрироваться">
        <div class="signup_link">Есть аккаунт?
            <a href="/login">Войти</a>
        </div>
    </form>
</div>
</body>
</html>

