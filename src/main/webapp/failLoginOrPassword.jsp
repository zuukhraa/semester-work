<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html>
<head>
    <title>modal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/modal.css">
</head>
<body>
<button id="open">
    Нажми
</button>
<div class="modal-container" id="modal_container">
    <div class="modal">
        <h1>Уведомление</h1>
        <p>
            Неправильно набран логин/пароль! Пароль должен быть от 4-12 символов, содержать заглавную букву. Логин от 3 до 15 символов, содержать только строчные буквы!
        </p>
        <button id="close">
            Закрыть
        </button>
    </div>
</div>
</body>
<script src="modal.js">
</script>
</html>
