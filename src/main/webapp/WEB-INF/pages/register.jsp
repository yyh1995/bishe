<%--
注册页面
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册页面</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="../../common/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../common/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../common/css/form-elements.css">
    <link rel="stylesheet" href="../../common/css/style.css">

    <!-- Favicon and touch icons -->
<%--    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">--%>

</head>

<body>

<!-- Top menu -->
<%--<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">Bootstrap Multi Step Registration Form Template</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="top-navbar-1">
            <ul class="nav navbar-nav navbar-right">
                <li>
							<span class="li-text">
								Put some text or
							</span>
                    <a href="#"><strong>links</strong></a>
							<span class="li-text">
								here, or some icons:
							</span>
							<span class="li-social">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-envelope"></i></a>
								<a href="#"><i class="fa fa-skype"></i></a>
							</span>
                </li>
            </ul>
        </div>
    </div>
</nav>--%>

<!-- Top content -->
<div class="top-content" style="background-size:cover;background-image:url(../../common/images/1.jpg)">
    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>Bootstrap</strong> 注册页面</h1>
                    <div class="description">
                        <p>
                            基金网站个人注册页面 <a href="http://azmind.com"><strong>AZMIND</strong></a>, customize and use it as you like!
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">

                    <form role="form" action="" method="post" class="registration-form">

                        <fieldset>
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Step 1 / 3</h3>
                                    <p><b>获取验证码:</b></p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-user"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <div class="form-group">
                                    <label  for="form-email">邮箱：</label>
                                    <input type="text" name="form-email" placeholder="邮箱" class="form-email form-control" id="form-email">
                                </div>
                                <div class="form-group">
                                    <label  for="form-yzm">验证码:</label>
                                    <input type="text" name="form-yzm" placeholder="验证码" class="form-yzm form-control" id="form-yzm">
                                </div>
                                <button type="button" class="btn btn-next">Next</button>
                            </div>
                        </fieldset>


                        <fieldset>
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Step 2 / 3</h3>
                                    <p><b>设置密码:</b></p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <div class="form-group">
                                    <label  for="form-password">Email</label>
                                    <input type="text" name="form-password" placeholder="密码" class="form-email form-control" id="form-password">
                                </div>
                                <div class="form-group">
                                    <label  for="form-repeat-password">Password</label>
                                    <input type="password" name="form-password" placeholder="重新输入密码" class="form-password form-control" id="form-repeat-password">
                                </div>
                                <button type="button" class="btn btn-previous">Previous</button>
                                <button type="button" class="btn btn-next">Next</button>
                            </div>
                        </fieldset>

                        <fieldset>
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Step 3 / 3</h3>
                                    <p><b>注册成功:</b></p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-twitter"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <a href="/main/user.do"><b>返回个人主页</b></a>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- Javascript -->
<script src="../../common/jquery-3.2.0.min.js"></script>
<script src="../../common/bootstrap/js/bootstrap.min.js"></script>
<script src="../../common/js/jquery.backstretch.min.js"></script>
<script src="../../common/js/retina-1.1.0.min.js"></script>
<script src="../../common/js/scripts.js"></script>

<!--[if lt IE 10]>
<script src="../../common/js/placeholder.js"></script>
<![endif]-->

</body>

</html>