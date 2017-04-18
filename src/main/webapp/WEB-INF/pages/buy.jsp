<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Bootstrap Wizard Example</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

    <link href="../../common/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <style>body{padding-top: 60px;}</style>
    <link href="../../common/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
    <link href="../../common/bwizard/css/bwizard.min.css" rel="stylesheet" />
</head>
<body>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="#">Bootstrap Wizard</a>
        </div>
    </div>
</div>

<div class="container">
    <h2>认购</h2>
    <div id="wizard">
        <ol>
            <li>申请</li>
            <li>付款</li>
            <li>结果</li>
        </ol>

        <div class="container">
            <h2>申请</h2>
        </div>

        <div class="container">
            <h2>付款</h2>
        </div>

        <div class="container">
            <h2>结果</h2>
        </div>
    </div>
</div>

<script src="../../common/jquery.min.js"></script>
<script src="../../common/bootstrap/js/bootstrap.min.js"></script>
<script src="../../common/bwizard/js/bwizard.min.js" type="text/javascript"></script>
<script type="text/javascript">
    $("#wizard").bwizard();
</script>
</body>
</html>
