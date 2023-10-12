<%-- 
    Document   : mise
    Created on : Apr 12, 2022, 11:03:43 AM
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
    <style>
        table{
            float:left;
            margin-left: 50px;
        }
    </style>
    <body>
        <form method="post" action="mise"> <h3>CHERCHEUR</h3>
        <table>
            <tr> 
                <td><label>Id Chercheur</label> </td>
                <td><input type="text" name="idc"></td>
            </tr>
            <tr>
                <td><label>Nom</label></td>
                <td><input type="text" name="nom"> </td>
            </tr>
            <tr>
                <td><label>Designation</label> </td>
                <td><input type="text" name="des"> </td>
            </tr>
            <tr>
                <td><label>Laboratoire</label> </td>
                <td><input type="text" name="lab"> </td>
            </tr>
            <tr>
                <td><label>Pass</label></td>
                <td><input type="text" name="pas"> </td>
            </tr>
                     
        </table>
        <% ResultSet rs= MyUtil.seConnecter().createStatement().executeQuery("select * from chercheur ");%>
        <table border="2px">
             <tr>
                <td>idch</td>
                <td>nom </td>
                <td>desingnation</td>
                <td>laboratoit</td>
                <td>pass</td>
                
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
                
            </tr>
            <%}%> 
            <tr>
                <td><input type="submit" name="op" value="ajouter"></td>
                <td><input type="submit" name="op" value="modifier"></td>
                <td><input type="submit" name="op" value="suprimer"></td>
            </tr>   
        </table>
        </form>
    </body>
</html>
