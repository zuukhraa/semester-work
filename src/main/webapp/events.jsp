<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <title>Мероприятия</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<%@include file="/WEB-INF/head.jsp" %>
<div class="container-fluid bg-3 text-center">
    <div class="jumbotron">
        <h1>Мероприятия на ближайшую неделю</h1>
    </div>
    <div class="row">
        <div class="col-sm-4">
            <h3>Стартовал литературно-творческий конкурс КФУ, посвященный Великой Победе</h3>
            <p>Сотрудники, их дети и внуки, а также обучающиеся Казанского федерального университета приглашаются к участию в литературно-творческом конкурсе, посвященном Победе в Великой Отечественной войне 1941–1945 годов, – «Огонь Победы в памяти поколений». Цели конкурса – формирование представления об общенациональном патриотизме гражданина России, осознание, понимание и осмысление зависимости настоящего и будущего страны.
            </p>
            <img src="images/event1.jpeg" alt="Image" style="width:80%">
        </div>
        <div class="col-sm-4">
            <h3>«Казанские юлбарсы» представят Россию на спартакиаде в Белоруссии</h3>
            <p>«Подготовку к данной спартакиаде мы начали с августа. Именно тогда сформировался список команд-участников. Мы с гордостью говорим, что "Казанские юлбарсы" – единственные представители вузов, которые выступают во всех видах программы. Получение такого права связано с тем, что в суперфинале наша команда показала высокие результаты», – отметил начальник отдела организации физкультурно-массовой и спортивной работы Департамента по молодежной политике Алексей Леванов.</p>
            <img src="images/event2.jpeg" alt="Image" style="width:85%">
        </div>
        <div class="col-sm-4">
            <h3>В университете проходит прием заявок на традиционный конкурс «Студент года КФУ».</h3>
            <p>Продолжается прием заявок на ежегодный конкурс, который продлится до 15 ноября. Принять участие могут студенты, которые не только хорошо учатся, но и принимают активное участие в общественной, научной, спортивной и культурно-массовой жизни университета. Участникам необходимо собрать электронное портфолио. Заявки принимаются по электронной почте studentgodakfu@gmail.com. На втором этапе запланированы очные встречи с участниками конкурса в формате собеседования.</p>
            <img src="images/event3.jpeg" alt="Image" style="width:85%">
        </div>
    </div>
</div>
<style>
    .bg-4 {
        background-color: white;
        color: white;
    }
</style>
<footer class="container-fluid bg-4 text-center">
    <p></p>
</footer>
</body>
</html>
