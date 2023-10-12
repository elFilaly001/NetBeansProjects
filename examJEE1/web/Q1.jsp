<%-- 
    Document   : Q1
    Created on : Apr 28, 2022, 9:00:50 AM
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
        <form action="S1" method="post">
        <label>Matricule</label><br>
        <input type="text" name="matr"><br>
        <label>code poste</label><br>
        <input type="text" name="codep"><br>
        <label>code projet</label><br>
        <input type="text" name="codeprj"><br>
        <input type="submit" name="op" value="MODIFIER POSTS">
        <input type="submit" name="op" value="AJOUTER PROJET">
         <% ResultSet rs = MyUtil.seConnecter().createStatement().executeQuery("select matricule,nom,prenom,code_poste,projet from employe");%>
         <table border="2px solid">
            <tr>
                <td>Matricule</td>
                <td>nom</td>
                <td>prenom</td>
                <td>poste</td>
                <td>projet</td>
                
            </tr>
            <%while(rs.next()){%>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
            </tr>
            <%}%>
        </table>
        </form>
    </body>
</html>
