<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <title>基金网站</title>

    <!--CSS -->
    <link href="../../common/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../common/swiper/css/swiper.min.css" rel="stylesheet">

    <script src="../../common/swiper/js/swiper.min.js"></script>


    <!-- 轮番图STYLE-->
    <style>
        html, body {
            position: relative;
            height: 100%;
        }
        body {
            background: #eee;
            font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
            font-size: 14px;
            color:#000;
            margin: 0;
            padding: 0;
        }
        .swiper-container {
            width: 100%;
            height: 100%;
        }
        .swiper-slide {
            background-position: center;
            background-size: cover;
        }
        .swiper-slide .title {
            font-size: 80px;
            font-weight: 300;
        }
        .swiper-slide .subtitle {
            font-size: 40px;
        }
        .swiper-slide .text {
            font-size: 30px;
            max-width: 400px;
            line-height: 1.3;
        }
    </style>
</head>

<body>
<!--导航条-->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="font-weight:bold;font-size:25px;" href="http://localhost:8081/">基金行情网</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form action="login.do" method="post" class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="邮箱/手机" class="form-control" value="${uaccount}">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="密码" class="form-control" value="${upassword}">
                </div>
                <button type="submit" class="btn btn-success" style="font-size: 17px;font-weight:bold">登陆</button>
                <a href="/register.do" class="btn btn-info active" style="font-size: 17px;font-weight:bold" role="button">注册</a>
            </form>
        </div>
    </div>
</nav>


<!-- Swiper -->
<div class="swiper-container">
    <div class="swiper-wrapper">
        <div class="swiper-slide" style="background-image:url(../../common/images/1.jpg)">
            <div class="title" data-swiper-parallax="-100">.</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-300">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>

        <div class="swiper-slide" style="background-image:url(../../common/images/2.jpg)">
            <div class="title" data-swiper-parallax="-100">.</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-300">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>

        <div class="swiper-slide" style="background-image:url(../../common/images/3.jpg)">
            <div class="title" data-swiper-parallax="-4500">.</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-4500">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination swiper-pagination-white"></div>
    <!-- Add Arrows -->
    <div class="swiper-button-next swiper-button-white"></div>
    <div class="swiper-button-prev swiper-button-white"></div>
</div>

<!--横线-->
<hr style="height:3px;border:none;border-top:3px double #3276ff;" />

<!--新闻模块-->
<div class="container">
    <!-- Example row of columns -->
    <div class="row">
        <div class="col-md-4">
            <h2>常见问题</h2>
            <a style=" color:#1420ff;  font-size:20px;" href="#">网上交易常见问题汇总</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">哪些银行卡可以在南方e站通网上交易系统开通定投业务？</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">南方e站通网上交易密码遗失如何处理？</a></br>
        </div>

        <div class="col-md-4">
            <h2>交易动态</h2>
            <a style=" color:#1420ff;  font-size:20px;" href="#">关于暂停支付宝渠道部分业务的提示</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">电子直销部分产品认申购费率实施0费率</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">关于电子直销实时赎回业务临时暂停的通知</a></br>
            <a style=" color:#1420ff;; font-size:20px;" href="#">关于调整e智定投业务参照指数的服务提示</a></br>
        </div>

        <div class="col-md-4">
            <h2>理财服务</h2>
            <a style=" color:#1420ff;  font-size:20px;" href="#">您的基金买贵了吗?</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">闲钱如何不闲置？</a></br>
            <a style=" color:#1420ff;  font-size:20px;" href="#">闲钱如何不闲置？</a></br>
            <!--<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>-->
        </div>
    </div>

    <footer>
        <p>&copy;严胤浩 yyh</p>
    </footer>
</div> <!-- /container -->



<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../../common/jquery-3.2.0.min.js"></script>
<script src="../../common/bootstrap/js/bootstrap.min.js"></script>
<!-- Initialize Swiper -->
<script>
    var swiper = new Swiper('.swiper-container', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        spaceBetween: 30,
        effect: 'fade'
    });
</script>

</body>
</html>