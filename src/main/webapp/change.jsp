<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html>
<head>
    <title>Изменение данных</title>
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>
<div class="position-absolute">
    <h1>Введите новые данные. Не оставляйте поля пустыми. Если не хотите менять логин/пароль введите старое значение</h1>
    <br>
    <form method="post" action="/change">
        <p class="lead">
            <label>
                <input type="text" name="login" placeholder="Новый логин">
            </label>
        </p>
        <p class="lead">
            <label>
                <input type="password" name="password" placeholder="Новый пароль">
            </label>
        </p>
        <br>
        <p class="lead">
            <button type="submit" class="btn btn-outline-dark btn-sm btn-block">Сохранить</button>
        </p>
    </form>
</div>
</body>
</html>
