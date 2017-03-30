<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <base href="<%=basePath%>">
    <title>基金网站</title>

    <!--CSS -->
    <link href="../../common/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../common/swiper/css/swiper.min.css" rel="stylesheet">

    <script src="../../common/swiper/js/swiper.min.js"></script>
    <!-- STYLE-->
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

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">基金行情网</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">登陆</button>
                <a href="#" class="btn btn-info active" role="button">注册</a>
            </form>
        </div>
    </div>
</nav>



<!--<div class=section-header style="position:relative;display:table;table-layout:fixed;height:100%;width:100%" id=header>
    <div class=crp-showcase style="width:100%;vertical-align:middle;display:table-cell;height:680px;padding:0;border:0">
        <div class=container>
            <div class=row>
                <div class=col-sm-12>
                    <h1 class="sourehan text-center animated fadeInDown">基金行情网</h1>
                    <h3 class="text-center animated fadeInDown">
                        <span id=video-start> <img src="http://www.leyu.net/file/yi/images/play.svg">基金行情展示，基金申购，快速交易</span> </h3>
                    <div class="text-center actions animated fadeInDown delay2" id=dashboard>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
-->
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


<!--展示模块-->
<div class="container">
    <table style="width:80%;height: 700px; " class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>基金名称</th>
            <th>基金代码</th>
            <th>净值日期</th>
            <th>累计净值</th>
            <th>日涨跌</th>
            <th>今年收益</th>
            <th>累计收益</th>
            <th>申购</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="funds" items="${fundsList}">
        <tr>
            <td>${funds.fname}</td>
            <td>${funds.fcode}</td>
            <td>${funds.fnetdate}</td>
            <td>${funds.fanet}</td>
            <td>${funds.fdhl}</td>
            <td>${funds.fyearnings}</td>
            <td>${funds.faincome}</td>
            <td>${funds.ftype}</td></tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!--横线-->
<hr style="height:3px;border:none;border-top:3px double #3276ff;" />

<!--新闻模块-->
<div class="container">
    <!-- Example row of columns -->
    <div class="row">
        <div class="col-md-4">
            <h2>信息安全风口将至长盛信息安全基金抢占先“基”</h2>
            <p>近日，擅长主题投资的长盛基金再度抢占先机，率先在业内推出首只聚焦信息安全的主题基金——长盛信息安全量化混合型基金，并于3月20日起全面发售。</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2>央行徐忠：货币政策以控制通胀为主 兼顾金融改革</h2>
            <p>中国央行工作论文：货币政策以控制通胀为主，兼顾转型发展和金融改革；应尽快明确新的短端货币政策利率和目标水平；要进一步完善公开市场操作一级交易商制度，在一定标准下扩大公开市场操作和SLF交易对象范围，完善操作流程，减少市场资金套利机会，降低市场结构因素导致的流动性冲击放大效应，有效开展利率引导。在均衡水平政策利率基础上，探索完善合格抵押品机制，结合MPA等宏观审慎政策，进行贷款便利操作，以确保中央银行资金安全，有效抑制金融机构道德风险。</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2>李克强：力争今年减税降费能够达到万亿元人民币</h2>
            <p>3月15日上午十二届全国人大五次会议闭幕后，国务院总理李克强会见中外记者并回答记者提出的问题。李克强答问时表示，我们就是要用政府的“痛”换来企业的“顺”，让企业轻装上阵，提高竞争力。我们还要通过像降网费、电费、物流成本等措施，力争今年减税降费能够达到万亿元人民币。当然，根本上还要降低制度性交易成本。</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
    </div>

    <!--横线-->
    <hr style="height:3px;border:none;border-top:3px double #3276ff;" />

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