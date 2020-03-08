<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Từ điển</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <script src="https://kit.fontawesome.com/4d64ca3050.js"></script>
    <style>
        #result {
            position: absolute;
            width: 100%;
            max-width: 870px;
            cursor: pointer;
            overflow-y: auto;
            max-height: 400px;
            box-sizing: border-box;
            z-index: 1001;
        }

        .link-class:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>

<body class="container">
<br>
    <div class="row"> 
            <input class="col-12 col-sm-10 col-md-10 form-control" type="text" name="search" id="search"
                placeholder="Tìm Kiếm(探している).   .   .   .   .   .    .   .   .   .   ." class="form-control" />
                <div class="col-12 col-sm-2 col-md-2">
                 <button  class="btn btn-outline-secondary"><b>Tìm kiếm</b> <i class="fas fa-search" aria-hidden="true"></i></button>
              </div>
    </div>
    <div class="row mt-2">
        <ul class="list-group" id="result"></ul>
        <ul style="background-color:  #58FAF4" class="list-group-item" id="result2"></ul>
    </div>
    
</body>


<script>
    $(document).ready(function () {
        $.ajaxSetup({
            type: "POST",
            headers: {
                "cache-control": "no-cache"
            }
        });
        $("#search").keyup(function () {
            $("#result").html("");
            $("#state").val("");
            var searchField = $("#search").val();
            var expression = new RegExp(searchField, "i");
            $.getJSON("http://localhost:8888/rest/employee/getAll", function (data) {
                $.each(data, function (key, value) {
                    if (
                        value.nghiatvmin.search(expression) != -1 ||
                        value.tvjpmin.search(expression) != -1
                    ) {
                        $("#result").append(
                            '<br><li class="list-group-item link-class">' +
                            value.nghiatvmin +
                            " .<br> " +
                            value.tvjpmin +
                            ' <span class="text-muted">[' +
                            value.tvkanjimin +
                            "]</span></li> "
                        );
                    }
                });
            });
        });

        $("#result").on("click", "li", function () {
            var click_text = $(this)
                .text()
                .split(".");
            $("#search").val($.trim(click_text[0]));
            $("#result").html("");
        });
        //timkiem
        $("button").click(function () {
            $("result2").html("");
            // if(counter<=0){
            var searchField = $("#search").val();
            var expression = new RegExp(searchField, "i");

            $.getJSON("http://localhost:8888/rest/employee/getAll", function (data) {
                $("li").remove();
                $.each(data, function (key, value) {
                    if (
                        value.nghiatvmin.search(expression) != -1 ||
                        value.tvjpmin.search(expression) != -1
                    ) {
                        $("#result2").append(
                            '<li class="list-group-item link-class" style="background-color:#58FAF4;">' +
                            value.nghiatvmin +
                            ". <br> " +
                            value.tvjpmin +
                            ' <span class="text-muted">[' +
                            value.tvkanjimin.toString() +
                            ']</span><a href="#" class="say"> <i style="font-size:24px" class="fa"> &#xf028;</i></a><audio id="audi" src=""  class="speech" hidden ></audio></li> '
                        );
                        //
                        $(function () {
                            $("a.say").on("click", function (e) {
                                e.preventDefault();
                                var text = value.tvjpmin;
                                text = encodeURIComponent(text);
                                console.log(text);
                                var url =
                                    "https://translate.google.com/translate_tts?ie=UTF-8&tl=ja&client=tw-ob&q=" +
                                    text +
                                    " ";
                                $("audio")
                                    .attr("src", url)
                                    .get(0)
                                    .play();
                            });
                        });
                        //
                    }
                });
            });
        });
    });
</script>

</html>