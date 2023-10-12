<%-- 
    Document   : rechercher
    Created on : Jun 30, 2021, 10:03:54 AM
    Author     : ABDOU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="model.MYutile"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        table,tr,td,th{
            border:solid 1px black;
            border-collapse: collapse;
        }

    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div id="divRech">
        <form action="/GestionPersonneAjax/SupprimerPersonne" method="post">
            <table id="tab">
                <tr>
                    <th>id trajet </th>
                    <th>depart </th>
                    <th>destination </th>
                    <th>date </th>
                    <th>montant </th>
                    <th>id proprietaire </th>


                </tr>

                <%
                   String adressDep =request.getParameter("adresse_depart");
                   String adressDes =request.getParameter("adresse_destination");
                    Connection con = MYutile.connect();
                    ResultSet rs = con.createStatement().executeQuery("select * from personne where lower(adresse_depart) like '%"+adressDep.toLowerCase()+"% and lower(adresse_destination) like '%"+adressDes.toLowerCase()+"%'");
                %>

                <%
                    while (rs.next()) {
                %>

                <tr>
                    <td><%=rs.getInt(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getDate(4)%></td>
                    <td><%=rs.getInt(5)%></td>
                    <td><%=rs.getInt(6)%></td>
                   
                    
                    <td><a href="/GestionPersonneAjax/SupprimerPersonne?cin=<%=rs.getString(1)%>">supprimer</td>
                    <td><a href="/GestionPersonneAjax/FormModifierPersonne.jsp?cin=<%=rs.getString(1)%>">modifier</td>
                    <td><input type="checkbox" name="cins" value="<%=rs.getString(1)%>"/></td>
                </tr>
                <%}%>
            </table>
            <input type="submit" name="delete" value="supprimer tous"/><br>
        </form>
            </div>
            
    </body>
</html>
