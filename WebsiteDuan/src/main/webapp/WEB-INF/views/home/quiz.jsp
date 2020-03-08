<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Quiz</title>
    <link rel="stylesheet" type="text/css" href="css/quiz.css">
</head>
<body>
    <div class="grid">
        <div id="quiz">
            <h1>Kiểm tra từ vựng N1</h1>
            <hr style="margin-bottom: 20px">

            <p id="question"></p>

            <div class="buttons">
                <button id="btn0"><span id="choice0"></span></button>
                <button id="btn1"><span id="choice1"></span></button>
                <button id="btn2"><span id="choice2"></span></button>
                <button id="btn3"><span id="choice3"></span></button>
            </div>

            <hr style="margin-top: 50px">
            <footer>
                <p id="progress">Question x of y</p>
            </footer>
        </div>
    </div>

<script src="js/quiz.js"></script>
<script src="js/question.js"></script>
<script src="js/app.js"></script>
</body>
</html>