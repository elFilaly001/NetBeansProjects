<%-- 
    Document   : cmd
    Created on : Mar 24, 2022, 5:01:56 PM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="P.MyUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cmd</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <form action="cmd" method="get">
        <% ResultSet rs= MyUtil.seConnecter().createStatement().executeQuery("select * from article ");%>
        <table border="2px">
             <tr>
                <td>code art</td>
                <td>nom art</td>
                <td>couleur</td>
                <td>prix achat</td>
                <td>prix vente</td>
                <td>qte</td>
            </tr>
            <%int i=0;
                while(rs.next()){
                i++;%>
                <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
                <td><input type="checkbox" name="choix" value="<%=rs.getString(1)%>"></td>
                <td><a href="cmd?supp=<%=rs.getString(1)%>" name="supp" value="<%=rs.getString(1)%>">suprimer</a></td>
            </tr>
            <%}%>  
        </table>
        <input type="submit" name="sup" value="suprimer"><br>
            <%=i%>
       </form>
    </body>
</html>
