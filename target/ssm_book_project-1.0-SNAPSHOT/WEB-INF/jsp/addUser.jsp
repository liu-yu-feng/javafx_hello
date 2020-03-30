
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">

                <h1 class="page-header">添加用户</h1>

        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <form action="${pageContext.request.contextPath}/user/addUser" method="post">
                <div class="form-group">
                    <label>用户昵称</label>
                    <input type="text" name="username" class="form-control" placeholder="用户昵称" required>
                </div>
                <div class="form-group">
                    <label>用户密码</label>
                    <input type="password" name="password" class="form-control" placeholder="密码" required>
                </div>
                <div class="form-group">
                    <label>电话</label>
                    <input type="tel" name="tel" class="form-control" placeholder="电话" required>
                </div>
                <div class="form-group">
                    <label>邮箱</label>
                    <input type="email" name="email" class="form-control" placeholder="邮箱" required>
                </div>

                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
