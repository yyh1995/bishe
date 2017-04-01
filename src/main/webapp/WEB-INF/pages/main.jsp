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
    <style>
        /*左侧菜单*/
        .sidebar-menu{
            border-right: 1px solid #c4c8cb;
        }
        /*一级菜单*/
        .menu-first{
            height:45px;
            line-height:45px;
            background-color: #e9e9e9;
            border-top: 1px solid #efefef;
            border-bottom: 1px solid #e1e1e1;
            padding: 0;
            font-size: 14px;
            font-weight: normal;
            text-align: center;
        }
        /*一级菜单鼠标划过状态*/
        .menu-first:hover{
            text-decoration: none;
            background-color: #d6d4d5;
            border-top: 1px solid #b7b7b7;
            border-bottom: 1px solid #acacac;
        }
        /*二级菜单*/
        .menu-second li a{
            background-color: #f6f6f6;
            height:31px;
            line-height:31px;
            border-top: 1px solid #efefef;
            border-bottom: 1px solid #efefef;
            font-size: 12px;
            text-align:center;
        }
        /*二级菜单鼠标划过样式*/
        .menu-second li a:hover {
            text-decoration: none;
            background-color: #66c3ec;
            border-top: 1px solid #83ceed;
            border-bottom: 1px solid #83ceed;
            border-right: 3px solid #f8881c;
            border-left: 3px solid #66c3ec;
        }
        /*二级菜单选中状态*/
        .menu-second-selected {
            background-color: #66c3ec;
            height:31px;
            line-height:31px;
            border-top: 1px solid #83ceed;
            border-bottom: 1px solid #83ceed;
            border-right: 3px solid #f8881c;
            border-left: 3px solid #66c3ec;
            text-align:center;
        }
        /*覆盖bootstrap的样式*/
        .nav-list,.nav-list li a{
            padding: 0px;
            margin: 0px;
        }
    </style>

</head>

<body>
<!--导航条-->
<nav class="navbar navbar-inverse ">
    <div class="container">
        <div class="navbar-header ">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand navbar-left" style="font-weight:bold;font-size:25px;" href="http://localhost:8081/">基金行情网</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form action="user.do" method="post" class="navbar-form navbar-right">
                <a href="/user.do" class="btn btn-info active" style="font-size: 17px;font-weight:bold" role="button">个人主页</a>
            </form>
        </div>
</nav>
</br>
</br>
</br>
</br>
<!--展示模块-->
<div class="container">
    <table style="width: 1200px;height:800px; " class="table table-striped table-hover table-bordered">
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