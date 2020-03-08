<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bài học</title>
    <!-- baihocminnacss -->
 
    <!-- bangchucaicss -->
        <link rel="stylesheet" href="css/baihoc.css">
    <link rel="stylesheet" href="css/chucai.css">
    <link rel="stylesheet" href="css/footer.css" />
    <%@include file="includes/heatag.jsp"%>

</head>

<body>
    <!-- ############################################################## SECTION ########################################################## -->
    <%@include file="includes/header.jsp"%>
    <section  class="bg-light ">
    <div class="col-12 col-sm-12 col-md-12" > 
     <div class="col-12 col-sm-2 col-md-2"></div>
     <div  class="col-12 col-sm-10 col-md-10">
     	<div class="container" style="width: 70%;">
   <form class="form-inline md-form form-sm mt-0">
  <i class="fas fa-search" aria-hidden="true"></i>
  <input id="search" name="search" class="form-control  ml-3 w-75" type="text" placeholder="Tìm Kiếm(探している).   .   .   .   .   .    .   .   .   .   ."
    aria-label="Search" >
</form>
		
	</div>
     </div>
      </div>
        <div class="row">
            <div class="col-12 col-sm-2 col-md-2">
                <ul id="lista"class="list-group list-group-flush" style="margin-right: -20px;">
                    <li id="bccid" class="list-group-item danh-muc-bang-chu-cai list-li "> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0010_Group-1-copy.png " alt=""><a autofocus   href="#bcc" > Bảng chữ cái</a></li>
                    <li id="minaid" class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0009_Layer-2.png" alt=""> <a  href="#baimina" > 50 Bài Minna</a></li>
                    <li class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0007_Layer-4.png" alt=""> <a href="#" > 512 từ Kanjo cơ bản</a> </li>
                    <li class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0006_Layer-5.png" alt=""> <a href="#" > 1945 từ Kanji nâng cao</a></li>
                    <li class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0008_Layer-3.png" alt=""> <a href="#" > 1000 mẫu câu giao tiếp</a></li>
                    <li class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0004_Layer-7.png" alt=""> <a href="#" > Luyện thi JLPN N1 -> N5</a></li>
                    <li class="list-group-item danh-muc-bang-chu-cai list-li"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0000_Layer-10.png" alt=""><a href="#" > Thông tin tham khảo</a> </li>
                </ul>
            </div>
            <div hidden id="ketquatk" class="col-12 col-12-7 col-md-7 ml4">
            <br>
		<ul  style="background-color: white" class="list-group striped-list" id="result2"></ul>
		<br/>
            </div>
            <!-- start bai hoc mina -->
       
            <div id="mina01" class="col-12 col-sm-2 col-md-2 ml-4 " >
                <div class="row">
                    <div class="card col-12 col-sm-12 col-md-12">
                        <div class="card-body">
                            <center><span class="tu-moi">Từ mới</span></center>
                        </div>
                    </div>
                </div>
                <!-- List bar -->
                <div class="row mt-2">
                    <div class="card col-12 col-sm-12 col-md-12">
                        <div class="card-body">
                            <div class="list-group pl-4 pr-4 pt-2 card example-1 square scrollbar-dusty-grass square thin"
                                id="list-bar1">
                                <!-- show bh ở đây -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="mina02" class="col-12 col-sm-7 col-md-7">
                <div class="container">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class="nav-item">
                            <a class="nav-link active content-tab-title" data-toggle="tab" href="#home">Từ mới</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu1">Ngữ pháp</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu2">Kaiwa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu3">Mondai</a>
                        </li>
                    </ul>
                    <!-- Tab panes -->
                    <div class="tab-content content-of-tab">

                        <div id="home" class="container tab-pane active"><br>
                            <ol class="row p-5" id="tv">
                                <ul class="row">
                                    <li class="col-12 col-sm-4 col-md-4 container" id="audiotv" style="list-style-type: none;padding-top:none;margin-top:none">
                             
                                            <audio controls>
                                                <source
                                                    src="https://translate.google.com/translate_tts?ie=UTF-8&tl=ja&client=tw-ob&q=aa"
                                                    type="audio/ogg">
                                            </audio>

                                    
                                    </li>

                                </ul>
                                <!-- Show từ mới ở đây nè -->
                               
                            </ol>
                        </div>
                        <div id="menu1" class="container tab-pane fade"><br>
                            <ol class="row p-5" id="np">
                              <!-- show từ vựng ở đây nè -->

                            </ol>
                        </div>
                        <div id="menu2" class="container tab-pane fade"><br>
                            <div class="list-group">
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <center>
                                        <audio controls>
                                            <source src="http://eup.mobi/apps/mina/listen/4 - 4 - Kaiwa.mp3"
                                                type="audio/ogg">
                                        </audio>

                                    </center>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <center>ABC</center>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>


                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <!-- end bai hoc mina -->
          <!--start chu cai-->
    
            <div id="fullbcc01" class="col-12 col-sm-7 col-md-7">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs bg-info">
                    <li class="nav-item  o-chua-tab-title">
                        <a id="tabhira" class="nav-link active tab-title" data-toggle="tab" href="#menu00">Hiragana</a>
                    </li>
                    <li class="nav-item o-chua-tab-title">
                        <a id="tabkata" class="nav-link  tab-title" data-toggle="tab" href="#menu01">Katakana</a>
                    </li>
                    <li class="nav-item  o-chua-tab-title">
                        <a id="tabkt" class="nav-link  tab-title" data-toggle="tab" href="#menu02">Kiểm tra</a>
                    </li>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content" id="content-textbcc">
                    <div id="menu00" class="container tab-pane active"><br>
                        <div class="row" id="chu-hira">
                           <!-- show hira đây -->
                               
                        </div>
                    </div>
                    <div id="menu01" class="container tab-pane fade"><br>
                        <div class="row" id="chu-kata">		
                              <!-- show kata -->
                        </div>
                    </div>
                    <div id="menu02" class="container tab-pane fade"><br>
                        <div class="progress  mt-1">
   					<div id="myProgress">
  						<div id="myBar"></div>
					</div>
  				</div>
   					 <div id="demo" class="carousel slide mt-2"data-interval="false" data-ride="carousel">

			        <!-- Indicators -->
			        <ul id="stt-slide" class="carousel-indicators" hidden><!-- show stt slide --> </ul>
			 
			        <!-- The slideshow -->
			        <div id="item-quiz" class="carousel-inner">
			        <!-- show item -->
				        </div>
				        <!-- Left and right controls
				        <a class="carousel-control-prev"  href="#demo" data-slide="prev">
				            <span class="carousel-control-prev-icon" style="background-color:red"></span>
				        </a>
				        <a class="carousel-control-next"  href="#demo" data-slide="next">
				            <span class="carousel-control-next-icon"style="background-color:red"></span>
				        </a> -->
				    </div>
                    </div>
                </div>
            </div>
            <div id="fullbcc02" class="col-12 col-sm-3 col-md-3">
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-8 col-sm-10 col-md-10 mt-1 mb-2 bg-light"> Phát âm</div>

							 <!--  <source id="say" src="${showDetailBCC.linkamthanh}" type="audio/ogg" hidden> -->
							
                            <div  class="col-4 col-sm-2 col-md-2 mt-1 mb-2"> 
                            	<button onclick="document.getElementById('audio').play()"><i class="fas fa-volume-up"></i></button>                        
                            </div>
                            <div id="button-phatam"> <!-- audio ở đây --></div>
                           
                            <div class="col-12 col-sm-12 col-md-12 mt-1 mb-2 bg-light"> Cách viết</div>
                            <div id="cachviet" class="col-12 col-sm-12 col-md-12 mt-1 mb-2 ">                       
                                 	<!-- hình vẽ ở đây -->                         
                            </div>
                            <div class="col-12 col-sm-12 col-md-12 mt-1 mb-2 bg-light"> Ví dụ</div>
                              <div id="vidu" class="col-12 col-sm-12 col-md-12 mt-1 mb-2 mt-2 mb-2"></div>                         
                        </div>
                    </div>
                </div>
            <!--end chu cai-->   
        </div>
    </section>
   
<%@include file="includes/footer.jsp"%>
</body>
<script>
$(document).ready(function () {
	$('#lista a').click(function(){
			$('#ketquatk').hide();
		});
	//onload
	$('#mina01').hide();
    	$('#mina02').hide();
    	$('#fullbcc01').show();
    	$('#fullbcc02').show();
    	//show hira
    	 $.getJSON('http://localhost:8888/rest/mina_hira/getAll', function(data){
    		 $.each(data,function(key,value){ 
    	    		$('#chu-hira').append('<div  class="col-6 col-sm-2 col-md-2 mb-3"><div class="card noidung-hienthi"><div id="click1"  class="card-body"><h1 hidden>'+value.idbang+'</h1><div class="row"><div class="col-12 col-sm-12 col-md-12"><a id="img-hira" href="#"><img src="/images/bangchucai/chucai/'+value.chucai+'"class="img-fluid mx-auto" alt="chucai" title="Chữ cái"></a></div><div class="col-12 col-sm-12 col-md-12"> <div  class="row"> <div class="col-12 col-sm-12 col-md-12"> <a  class="text-body" href="#"> <span  class="phat-am">'+value.romajji+'</span> </a> </div> </div> </div> </div> </div> </div> </div>');                     	    		
    		 });    	
    	 });
    	//show kata
    	 $.getJSON('http://localhost:8888/rest/mina_kata/getAll', function(data){
    		 $.each(data,function(key,value){
    			 console.log(value.linkamthanh);
    			 $('#chu-kata').append('<div  class="col-6 col-sm-2 col-md-2 mb-3"><div class="card noidung-hienthi"><div id="click1" class="card-body"><h1 hidden>'+value.idbang+'</h1><div class="row"><div class="col-12 col-sm-12 col-md-12"><a  href="#"><img src="/images/bangchucai/chucai/'+value.chucai+'"class="img-fluid mx-auto" alt="chucai" title="Chữ cái"></a></div><div class="col-12 col-sm-12 col-md-12"> <div  class="row"> <div class="col-12 col-sm-12 col-md-12"> <a  class="text-body" href="#"> <span  class="phat-am">'+value.romajji+'</span> </a> </div> </div> </div> </div> </div> </div> </div>');                  
     	    	
    		 });	  	 
    	 });
    	//
    		////////////////////////////Bài học Mina//////////////////////
//show bài học
  for (var i = 1; i <= 50; i++) {
      $('#list-bar1').append('<a autofocus id="'+i+'" href="#" class="list-group-item list-group-item-action ">Bài '+i+' </a> ');   
  }
    //show data khi click bài học

    
    $('#list-bar1 a,#minaid').click(function(){ 
    	$('#fullbcc01').hide();
    	$('#fullbcc02').hide();
    	$('#mina01').show();
    	$('#mina02').show();
    	var texta=$(this).text();
    	var idmina= texta.split("i")[1];
     $("#list-bar1 a").css("background-color","");
   
      //clear từ mới
      $('#tv').html("");
      //clear ngữ pháp
      $('#np').html("");
    //  var lc=$(this).attr('href');
    //  var idmina= lc.split("#")[1];
      console.log('http://localhost:8888/rest/mina_tv/'+idmina+'');
      //TAB từ vựng
      $.getJSON('http://localhost:8888/rest/mina_tv/'+idmina+'', function(data) {
    	 $('#tv').append('<ul class="row"><li class="col-12 col-sm-4 col-md-4 container" id="audiotv" style="list-style-type: none;padding-top:none;margin-top:none"><audio controls><source src="https://translate.google.com/translate_tts?ie=UTF-8&tl=ja&client=tw-ob&q=aa" type="audio/ogg"></audio></li></ul>');
      $.each(data,function(key,value){
      	   $('#tv').append(' <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung" id="tvli"><span>'+value[2]+' <br>'+value[1]+'</span> </li>')
      })	  		   		  		  
    });
      //TAB ngữ pháp
      $.getJSON('http://localhost:8888/rest/mina_nguphap/'+idmina+'', function(data) {
       $.each(data,function(key,value){
       	   $('#np').append(' <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung" id="npli"><a style="text-decoration:none;color:blue" href="#ndnp">'+value[1]+'</a><br><span style="display:none" id="ndnp1" >'+value[2]+'</span> </li>')
       })	  		   		  		  
     });
   });
	    // function click ngữ pháp toggle
    $(document).on('click', '#npli a', function() {
    	console.log("hey hey");
    	$('#npli span').each(function(){
    		  if($('#npli span').is(":visible")){
    		    	 $('#npli span').hide();
    		    	 }else if($('#npli span').is(":hidden")){
    		    	 $('#npli span').show();
    		    	 }
    	    	});
    	

    
    	 
    	  });
	   //////end function np
/////////////////////////////Bảng chữ cái///////////////////////

    $('#bccid').on('click',function () {
  
    	$('#mina01').hide();
    	$('#mina02').hide();
    	$('#fullbcc01').show();
    	$('#fullbcc02').show();
    	//show hira
    	 $.getJSON('http://localhost:8888/rest/mina_hira/getAll', function(data){
    		 $.each(data,function(key,value){
    	    		$('#chu-hira').append('<div  class="col-6 col-sm-2 col-md-2 mb-3"><div class="card noidung-hienthi"><div id="click1" " class="card-body"><h1 hidden>'+value.idbang+'</h1><div class="row"><div class="col-12 col-sm-12 col-md-12"><a id="img-hira" href="#"><img src="/images/bangchucai/chucai/'+value.chucai+'"class="img-fluid mx-auto" alt="chucai" title="Chữ cái"></a></div><div class="col-12 col-sm-12 col-md-12"> <div  class="row"> <div class="col-12 col-sm-12 col-md-12"> <a  class="text-body" href="#"> <span  class="phat-am">'+value.romajji+'</span> </a> </div> </div> </div> </div> </div> </div> </div>');                  
    	    		
    		 });
  
    	
    	 });
    	//show kata
    	 $.getJSON('http://localhost:8888/rest/mina_kata/getAll', function(data){
    		 $.each(data,function(key,value){
    			 console.log(value.idbang);
    			    $('#chu-kata').append('<div  class="col-6 col-sm-2 col-md-2 mb-3"><div class="card noidung-hienthi"><div id="click1" class="card-body"><h1 hidden>'+value.idbang+'</h1><div class="row"><div class="col-12 col-sm-12 col-md-12"><a  href="#"><img src="/images/bangchucai/chucai/'+value.chucai+'"class="img-fluid mx-auto" alt="chucai" title="Chữ cái"></a></div><div class="col-12 col-sm-12 col-md-12"> <div  class="row"> <div class="col-12 col-sm-12 col-md-12"> <a  class="text-body" href="#"> <span  class="phat-am">'+value.romajji+'</span> </a> </div> </div> </div> </div> </div> </div> </div>');                  
     	    	  
    		 });	  	 
    	 });
    	//

    });
	// show onclick từng thẻ 
	 $(document).on('click', '#click1', function() {
		 //clear data cũ
		 $('#button-phatam').html("");
		 $('#cachviet').html("");
		 $('#vidu').html("");
	      var idcc=$(this).find("h1").text();
	      console.log("id chữ cái:"+idcc);
	    //show data onclick chữ cái
	    	 $.getJSON('http://localhost:8888/rest/mina_bcc/'+idcc+'', function(data){
	    			$('#button-phatam').append(' <audio controls id="audio" src="'+data.linkamthanh+'"  preload="auto" hidden></audio>');
	    		    $('#cachviet').append('<img class="img-fluid mx-auto d-block" width="80%"  title="cachviet" src="/images/bangchucai/detailchucai/'+data.linkhinhanh+'">');
	    		    $('#vidu').append('<span>'+data.vidu1+'</span><br><span>'+data.vidu2+'</span><br><span>'+data.vidu3+'</span>');
	  	 
	    	 });
	});

	// end click
	//////////////////////////QUIZ/////////////////
	
	$('#tabkt').click(function(){
		$('#fullbcc02').hide();
	});
	$('#tabhira').click(function(){
		$('#fullbcc02').show();
	});
	$('#tabkata').click(function(){
		$('#fullbcc02').show();
	});
	var widthpg=0;
    	$('#myBar').css("width", widthpg+"%");
    	var socau=0;
	$('#myBar').text(socau+"/20");
        ////////
        //show quiz
        $.getJSON('http://localhost:8888/rest/quiz/quizhiragetAll', function(data){
   		 $.each(data,function(key,value){
   			$('#stt-slide').append(' <li data-target="#demo" data-slide-to="'+value.id+'" ></li>');  
   			$('#item-quiz').append(' <div class="carousel-item "> <div class="container" style="background-color:white;width: 100%;height: 500px;"> <div class="container col-xs-12 col-sm-12 col-md-12 row"> <div class="col-xs-12 col-sm-3 col-md-3"></div> <div class="col-xs-12 col-sm-6 col-md-6"> <center><span class="font-weight-bolder" id="idcauhoi">Câu '+value.id+'</span> <p id="text-cauhoi" class="pt-2 pb-2 font-italic " style="padding-top:100px;"><h5>'+value.cauhoi+'</h5></p><br> <button  class="mr-2"  style="width:45%;height:50px;">'+value.a+'</button> <button  style="width:45%;height:50px;">'+value.b+'</button> <button  class="mt-3 mr-2" style="width:45%;height:50px;">'+value.c+'</button> <button  class="mt-3" style="width:45%;height:50px;">'+value.d+'</button><input id="kiemtra" type="button" value="Kiểm tra" class="btn btn-success mt-5 " disabled><input  id="tieptuc" hidden href="#demo" data-slide="next" type="button" value="Tiếp tục" class="btn btn-success mt-5 " ><input id="hoanthanh" type="button" value="Hoàn thành" class="btn btn-success mt-5 " hidden>  </center> </div> </div> <div class="col-xs-12 col-sm-3 col-md-3"></div> </div>  </div>');  
   			$('.carousel-item').first().addClass('active');
   			$(".carousel-inner").next().addClass('active');
   		 });
 
   	
   	 });
//click button đáp án
var kq;
var id;var button;
$(document).on('click', '.carousel-item button', function() {
	button=$(this);
	 $('.carousel-item').off("click",button);
	 $('.carousel-item button').css("background-color","");
	 $(this).css("background-color","orange");
	 $('.carousel-item input').removeAttr('disabled');
	kq=$(this).text();

	//console.log("kq: "+kq);
	var idcauhoi=$(this).parent().find('span').text();
	id= idcauhoi.split("u")[1];
	 //console.log("id là: "+id);
	 
});
	 $(document).on('click', '#kiemtra', function() {
		  
		 $(this).off("click",button);
		 $.getJSON('http://localhost:8888/rest/quiz/quizhiragetbyid/'+id+'', function(data){
			var	dapan=data.traloi;
				button.parent().find('#kiemtra').hide();
				button.parent().find('#tieptuc').removeAttr('hidden');
				 if(dapan===kq){
					// console.log("Lựa chọn :"+kq);
					// console.log("Đáp án :"+data.traloi);
					button.css({background:'linear-gradient(green, orange)'});
				//	button.css("background-color","linear-gradient(green, orange)");
					button.addClass("true-button");
					//set progressbar
					widthpg=widthpg+5;
					socau=socau+1;
					console.log(socau);
					$('#myBar').css("width", widthpg+"%");
					$('#myBar').text(socau+"/20");
				 }else{
					$(".carousel-item button:contains('" + dapan + "')").addClass("true-button");
					 button.css("background-color","orange");
				
				 };
				 //
				 if ($('.carousel-inner .carousel-item:last').hasClass('active')) {
					 button.parent().find('#kiemtra').hide();
					 button.parent().find('#tieptuc').hide();
					 button.parent().find('#hoanthanh').removeAttr('hidden');
            }
		
	 });
	 });
	//button tiếp tục
	  $(document).on('click', '#tieptuc', function() {
		// $( ".carousel-inner" ).children().hide();
		$('.carousel-item input').attr('disabled','disabled');
		$('.carousel-item button').css("background-color","");
		$('.carousel-item button').removeClass("true-button");
		console.log("tiếp tục");
	 });
//button hoàn thành:
	 $(document).on('click', '#hoanthanh', function() {
		// $( ".carousel-inner" ).children().hide();
		 $( ".carousel-inner" ).html("");
		 $('#item-quiz').append('<center>Bạn đã hoàn thành '+socau+' câu!</center>');
	 });

	//SLIDE
        $('#demo').on('slid.bs.carousel', '', function () {
            var $this = $(this);
            if ($('.carousel-inner .carousel-item:first').hasClass('active')) {
                $(".carousel-item input").show();
                $(".carousel-item input").prop("disabled", true);
                $("#tieptuc").hide();
                console.log("slide1");
            }
            else if ($('.carousel-inner .carousel-item:last').hasClass('active')) {
                console.log('last slide');
                $(".carousel-item input").show();
                $(".carousel-item input").prop("disabled", true);
                $("#tieptuc").hide();
                console.log("cuooi");
            }else {
                $(".carousel-item input").show();
                $(".carousel-item input").prop("disabled", true);
                $("#tieptuc").hide();
                console.log("giua~");
            }

        });//
//////////////////TÌM KIẾM/////////////////////
  	  $.ajaxSetup({
  	    type: "POST",
  	    headers: {
  	      "cache-control": "no-cache"
  	    }
  	  });
  	  $("#search").keyup(function() {
  	    $("#result2").html("");
  	    $("#state").val("");
  	    var searchField = $("#search").val();
  	    searchField=jQuery.trim(searchField); //////////
  	    var expression = new RegExp(searchField, "i");
  	    $.getJSON("http://localhost:8888/rest/employee/getAll", function(data) {
  	      $.each(data, function(key, value) {
  	        if (
  	          value.nghiatvmin.search(expression) != -1 ||
  	          value.tvjpmin.search(expression) != -1
  	        ) {
  	        	$("#ketquatk").show();
  	        	$('#fullbcc01').hide();
  	        	$('#fullbcc02').hide();
  	        	$('#mina01').hide();
  	        	$('#mina02').hide();
  	        	$('#ketquatk').removeAttr('hidden');
  	            $("#result2").append(
  	    	            '<li class="list-group-item link-class" style="background-color:white">' +
  	    	              value.nghiatvmin +
  	    	              ". <br> " +
  	    	              value.tvjpmin +
  	    	              ' <span class="text-muted">[' +
  	    	              value.tvkanjimin.toString() +
  	    	              ']</span><a href="#" class="say"> <i style="font-size:24px;float:right" class="fa"> &#xf028;</i></a><audio id="audi" src=""  class="speech" hidden ></audio></li><hr> '
  	    	          );
  	        }
  	      });
  	    });
  	  });
  		///end Tìm kiếm
  	
   
});
</script>
</html>