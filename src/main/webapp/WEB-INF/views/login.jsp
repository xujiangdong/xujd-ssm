<%@ page contentType="text/html;charset=UTF-8"%>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>登入页面</title>
</head>
<body>
    <div>
        <form action="<%=basePath%>user/login" method="post">
            <div style="text-align: center;margin-top: 100px;">
                <h3>${msg}</h3>
                <input type="text" name="loginName" placeholder="LoginName">
                <input type="password" name="password" placeholder="password">
                <input type="submit" value="登入">
            </div>
        </form>
    </div>
</body>
</html>
