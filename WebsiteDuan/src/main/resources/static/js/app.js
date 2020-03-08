function populate() {
    if(quiz.isEnded()) {
        showScores();
    }
    else {
        // show question
        var element = document.getElementById("question");
        element.innerHTML = quiz.getQuestionIndex().text;

        // show options
        var choices = quiz.getQuestionIndex().choices;
        for(var i = 0; i < choices.length; i++) {
            var element = document.getElementById("choice" + i);
            element.innerHTML = choices[i];
            guess("btn" + i, choices[i]);
        }

        showProgress();
    }
};


function guess(id, guess) {
    var button = document.getElementById(id);
    button.onclick = function() {
        quiz.guess(guess);
        populate();
    }
};


function showProgress() {
    var currentQuestionNumber = quiz.questionIndex + 1;
    var element = document.getElementById("progress");
    element.innerHTML = "Câu hỏi " + currentQuestionNumber + " trong " + quiz.questions.length;
};

function showScores() {
    var gameOverHTML = "<h1>Kết quả</h1>";
    gameOverHTML += "<h2 id='score'> Điểm của bạn là: " + quiz.score + "</h2>";
    var element = document.getElementById("quiz");
    element.innerHTML = gameOverHTML;
};

// create questions
var questions = [
    new Question("おはようございます", ["Chào buổi sáng", "Chào buổi tối","chào buổi trưa", "Chào buổi chiều"], "Chào buổi sáng"),
    new Question("すみません", ["Xin lỗi", "Cảm ơn", "Xin chào", "Tạm biệt"], "Xin lỗi"),
    new Question("きり_", ["せん", "ます","ん", "つ"], "つ"),
    new Question("いただきます", ["Mời ăn uống", "Mời đi ngủ", "Mời đi chơi", "Tất cả"], "All"),
    new Question("Chúc ngủ ngon", ["お休みなさい", "また 後で", "気をつけて", "Tất cả đáp án"], "お休みなさい")
];




// create quiz
var quiz = new Quiz(questions);

// display quiz
populate();


