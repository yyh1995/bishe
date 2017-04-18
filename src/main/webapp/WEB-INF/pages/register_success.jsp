<%--
  Created by IntelliJ IDEA.
  User: yyh
  Date: 2017/4/11
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册成功</title>

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
    <div class="form-top" style="background-size:cover;background-image:url(../../common/images/1.jpg)">
       <div class="form-top-left">
          <h3>Step 3 / 3</h3>
          <p><b>注册成功:</b></p>
       </div>
       <div class="form-top-right">
          <i class="fa fa-twitter"></i>
       </div>
    </div>
<div class="form-bottom">
    <a href="/main/user.do"><b>恭喜你注册成功</b></a>
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
