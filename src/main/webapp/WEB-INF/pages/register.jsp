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

    <script type="text/javascript" src="../../common/jquery-3.2.0.min.js"></script>
    <script type="text/javascript" src="../../common/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../common/bootstrap/js/bootstrapValidator.js"></script>


</head>

<body>
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

                    <form id="registration-form" role="form"  method="post" class="registration-form" action="/register.do">

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
                                    <label  for="name">用户名：</label>
                                    <input type="text" name="name" value="${user.uname}" placeholder="用户名" class="name form-control" id="name">
                                </div>
                                <div class="form-group">
                                    <label  for="email">邮箱：</label>
                                    <input type="email" name="email" value="${user.uemail}" placeholder="邮箱" class="email form-control" id="email">
                                </div>
                                <div class="form-group">
                                    <label  for="yzm">验证码:</label>
                                    <input type="text" name="yzm" placeholder="验证码" class="yzm form-control" id="yzm">
                                </div>
                                <button type="submit" class="btn btn-next">下一步</button>
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
                                    <label  for="password">密码：</label>
                                    <input type="password" name="password" placeholder="密码" class="password form-control" id="password">
                                </div>
                                <div class="form-group">
                                    <label  for="comfirm_password">确认密码：</label>
                                    <input type="password" name="comfirm_password" placeholder="重新输入密码" class="comfirm_password form-control" id="comfirm_password">
                                </div>
                                <button type="submit" class="btn btn-next">下一步</button>
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
<script type="text/javascript"  src="../../common/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"  src="../../common/js/jquery.backstretch.min.js"></script>
<script type="text/javascript"  src="../../common/js/retina-1.1.0.min.js"></script>
<script type="text/javascript"  src="../../common/js/scripts.js"></script>

<!--bootstrap 验证-->
<script type="text/javascript">
    $(document).ready(function() {
        $('#registration-form').bootstrapValidator({
//        live: 'disabled',
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                name: {
                    message: '用户名不能为空',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            min: 3,
                            max: 6,
                            message: '用户名3~6个字符'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/,
                            message: '用户名只能包含字母，数字'
                        },
                        different: {
                            field: 'password',
                            message: '用户名和密码不能一样'
                        }
                    }
                },
                email: {
                    validators: {
                        notEmpty: {
                            message: '邮箱不能为空'
                        },
                        emailAddress: {
                            message: '邮箱地址无效'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        different: {
                            field: 'name',
                            message: '密码不能和用户名一致'
                        }
                    }
                },
                comfirm_password: {
                    validators: {
                        notEmpty: {
                            message: '确认密码不能为空'
                        },
                        identical: {
                            field: 'password',
                            message: '密码不一致'
                        }
                    }
                }

            }
        });

    });
</script>
</body>

</html>
