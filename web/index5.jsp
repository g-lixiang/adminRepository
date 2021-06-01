<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>
<html>
  <head>
      <base href="<%=basePath%>">
    <title>test1</title>
  </head>
  <body>
    <h3>学生管理系统</h3>
    <a href="student/save.do">添加</a>
    <a href="student/update.do">修改</a>
    <a href="student/delete.do">删除</a>
    <a href="student/select.do">查询</a>
  </body>
</html>
