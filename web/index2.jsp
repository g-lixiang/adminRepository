<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>
<html>
  <head>
      <base href="<%=basePath%>">
    <title>test1</title>
      <script src="js/jquery-1.8.3.min.js"></script>
      <script>
          $(function(){
              $("#bjBtn").click(function () {
                  $.ajax({
                      url:"myServlet02.do",
                      type:"get",
                      dataType:"json",
                      success:function (data) {
                          console.log(data)
                          $("#msg").html(data.str2);
                      }
                  })

              });
          })
      </script>
  </head>
  <body>
    <button id="bjBtn">点击</button>
    <br><br>
    <div id="msg" style="width: 200px;height: 200px;background-color: pink">

    </div>
    <br><br>
    <div style="width: 200px;height: 200px;background-color: pink">
        abcdef
    </div>
  </body>
</html>
