<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/head.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <@title></@title>
</head>
<body>
<div class="navbar">
    <nav>
        <ul>
            <li><a href="index.jsp">Главная страница</a></li>
            <li><a href="/profile">Личный кабинет</a></li>
            <li><a href="login.jsp">Вход</a></li>
            <li><a href="/register">Регистрация</a></li>
            <li><a href="">Контакты</a></li>
        </ul>
    </nav>
    <img src="menu.png" class="menu-icon">
</div>
<div class="mainer">
    <main role="main" class="container">
        <@content></@content>
    </main>
</div>
</body>
</html>
