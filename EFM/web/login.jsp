<%-- 
    Document   : login
    Created on : Jun 30, 2021, 9:43:41 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
            label{
                width: 100px;
                display: inline-block;
            }
            input[type=text],[type=password]{
               margin-bottom: 10px; 
               width: 160px
            }
            input[type=submit]{
                margin-left: 60px;
            }
            
        </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Authentification</h1>
         <%
            if(request.getAttribute("ErrorMsg")!=null){
            %>
            <h3 style="color:red"><%=request.getAttribute("ErrorMsg")%></h3>
            <%}%>
        <form action="/EFM/Login" method="post">
            <label>user name :</label>
            <input type="text" name="login"/><br>
            <label>password :</label>
            <input type="password" name="mdp"/><br>
            <input type="submit" value="Login">
            
        </form>
    </body>
</html>
