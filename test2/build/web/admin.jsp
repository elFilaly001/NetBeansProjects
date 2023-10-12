<%-- 
    Document   : admin
    Created on : Mar 15, 2022, 3:17:45 PM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="P.MyUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <form action="ajou" method="post">
         <label>nom article</label><br>
        <input name="noma" type="text" /><br>
        <label>couleur</label><br>
        <input name="coul" type="text"/><br>
        <label>prixachat</label><br>
        <input name="prixa" type="text"/><br>
        <label>prixvente</label><br>
        <input name="prixv" type="text"/><br>
        <label>qte</label><br>
        <input name="qte" type="text"/><br>
        <input type="submit"  name="op" value="ajouter" />
        <input type="submit"  name="op" value="modifier"/>
        <input type="submit"  name="op" value="suprimer" onclick="return confirm('Are you sure you want to delete this item?');"/>
        <br>
        </form>
        <% ResultSet rs = MyUtil.seConnecter().createStatement().executeQuery("select * from article");%>
        <table border="2px solid">
            <tr>
                <td>code art</td>
                <td>nom art</td>
                <td>couleur</td>
                <td>prix achat</td>
                <td>prix vente</td>
                <td>qte</td>
            </tr>
            <%while(rs.next()){%>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
