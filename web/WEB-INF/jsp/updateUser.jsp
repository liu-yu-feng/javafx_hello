<%--
  Created by IntelliJ IDEA.
  User: yufeng
  Date: 2020/3/7
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新用户信息</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">

            <h1 class="page-header">更改用户</h1>

        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <form action="${pageContext.request.contextPath}/user/updateUser" method="post">
                <input type="hidden" name="id" value="${user.id}">
                <div class="form-group">
                    <label>用户昵称</label>
                    <input type="text" name="username" class="form-control" value="${user.username}" placeholder="${user.username}" required>
                </div>
                <div class="form-group">
                    <label>用户密码</label>
                    <input type="password" name="password" value="${user.password}" class="form-control" placeholder="${user.password}" required>
                </div>
                <div class="form-group">
                    <label>电话</label>
                    <input type="tel" name="tel" value="${user.tel}" class="form-control" placeholder="${user.tel}" required>
                </div>
                <div class="form-group">
                    <label>邮箱</label>
                    <input type="email" name="email" value="${user.email}" class="form-control" placeholder="${user.email}" required>
                </div>

                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
