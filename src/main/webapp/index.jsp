<meta charset="UTF-8">
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>~Website design</title>
    <link rel="stylesheet" href="css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
</head>
<body>
<div class="main">
    <form action="/main" method="post">
        <div class="container">
            <div class="navbar">
                <nav>
                    <ul>
                        <li><a href="/profile">Личный кабинет</a></li>
                        <li><a href="login.jsp">Вход</a></li>
                        <li><a href="/register">Регистрация</a></li>
                        <li><a href="">Контакты</a></li>
                    </ul>
                </nav>
                <img src="menu.png" class="menu-icon">
            </div>
            <div class="row">
                <div class="col">
                    <h1>Казанский Федеральный Университет</h1>
                    <p></p>
                    <button type="button">Поиск</button>
                </div>
                <div class="col">
                    <a href="events.jsp">
                        <div class="card card1">
                            <h5>Мероприятия</h5>
                            <p></p>
                        </div>
                    </a>
                    <a href="inst.html">
                        <div class="card card2">
                            <h5>Институты</h5>
                            <p></p>
                        </div>
                    </a>
                    <a href="abit.html">
                        <div class="card card3">
                            <h5>Абитуриент</h5>
                            <p></p>
                        </div>
                    </a>
                    <div class="card card4">
                        <h5>История университета</h5>
                        <p></p>

                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>
