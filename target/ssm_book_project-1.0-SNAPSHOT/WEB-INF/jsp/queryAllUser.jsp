<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询全部用户</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>--%>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 ">
            <div class="page-header">
                <h1>用户信息展示</h1>
            </div>

        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <a class="btn btn-default" href="${pageContext.request.contextPath}/user/toAddUser">添加用户</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <td>用户姓名</td>
                    <td>用户密码</td>
                    <td>用户电话</td>
                    <td>用户邮箱</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${userResultSet}" var="user">
                    <tr>
                        <td>${user.username}</td>
                        <td>${user.password}</td>
                        <td>${user.tel}</td>
                        <td>${user.email}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/user/deleteUser?id=${user.id}">删除</a> |
                            <a href="${pageContext.request.contextPath}/user/toUpdateUser?id=${user.id}">修改</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
