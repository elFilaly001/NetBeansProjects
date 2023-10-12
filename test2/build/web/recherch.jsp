<%-- 
    Document   : recherch
    Created on : Mar 23, 2022, 9:05:52 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="P.MyUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <form action="cherche" method="post">
            
        <input type="checkbox" name="R" value="nomart">
        <label>nom art</label>
        <input type="text" name="nomart" />
        <input type="checkbox" name="R" value="coul">
        <label>couleur</label>
        <input type="text" name="coul" /><br>
        <input type="submit" name="rechercher" value="rechercher">
        <table border="2px" >
            <tr>
                <td>code art</td>
                <td>nom art</td>
                <td>couleur</td>
                <td>prix achat</td>
                <td>prix vente</td>
                <td>qte</td>
            </tr>
            <%if( request.getAttribute("R")!=null){
            ResultSet rs= (ResultSet) request.getAttribute("R");
            while(rs.next()){%>
                <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
            </tr>
            <%}
        }%>   
        </table>
        
        </form>
    </body>
</html>
