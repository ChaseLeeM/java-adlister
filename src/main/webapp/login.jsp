<%@ page import="java.io.IOException" %><%--
  Created by IntelliJ IDEA.
  User: chase
  Date: 3/9/23
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<Java Code>--%>
<%

  String username = request.getParameter("username");
  String password = request.getParameter("password");
  if (username == null || password == null) {
    username = "";
  } else if (username.equals("admin") && password.equals("password")){
    response.sendRedirect("/profile.jsp");
    System.out.println(username);
  } else {
    response.sendRedirect(("/login.jsp"));
  }

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
  <style type="text/css">
    body {
      background-color: lightslategrey;
      color: #FFFFFF;
    }
  </style>

</head>
<body>

<%--<form action="login" method="post">--%>
<form action="${pageContext.request.contextPath}/login.jsp" method="post">
  <h1>Login Page</h1>

  <h4>Username:</h4>
  <label>
    <input type="text" class="username" name="username"/>
  </label>
  <h4>Password:</h4>
  <label>
    <input type="password" class="password" name="password"/>
  </label>
  <button name="submit">Submit</button>
</form>

<%--//  class LoginServlet extends HttpServlet {--%>
<%--//    @Override--%>
<%--//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {--%>
</body>
</html>
