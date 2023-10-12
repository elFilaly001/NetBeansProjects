<%-- 
    Document   : commande
    Created on : Mar 24, 2022, 4:18:05 PM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="P.MyUtil"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gscome</title>
    </head>
    <body>
        <form action="s1" method="post" >
        <label>num commande</label>
        <input type="text" name="numcmd"><br>
        <label>nom client</label>
        <% ResultSet rs= MyUtil.seConnecter().createStatement().executeQuery("select codeclt,nom from client");%>
        <select name="nomclt">
            <%while(rs.next()){%>
            <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
            <%}%>
        </select><br>
        <label>date</label>
        <input type="text" name="datea"><br>
        <input type="submit" name="ajtcmd" value="ajouter">
        
        </form>
    </body>
</html>
