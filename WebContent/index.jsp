<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="xdpaiy.common.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta property="wb:webmaster" content="28e612b10f8dae5c" />
<title>行动pay</title>
</head>
<body>
hello world!
<% MySQLManager man=new MySQLManager();
    man.test();
%>

<form action="${basePath}/sayHello" method="post">

请输入您的名字：

<input type="text" name="userName" />

<input type="submit" value="确定"/>

</form>
</body>
</html>