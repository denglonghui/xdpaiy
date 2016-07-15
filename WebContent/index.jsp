<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="xdpaiy.common.*,xdpaiy.webo.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta property="wb:webmaster" content="28e612b10f8dae5c" />
<title>行动pay</title>
</head>
<body>

<a href="<%=WeboManager.getWeboLoginURL() %>" >微博登录</a>
<% out.print(request.getParameter("code")); %>
</body>
</html>