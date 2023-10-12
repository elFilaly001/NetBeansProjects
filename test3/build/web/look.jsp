<%-- 
    Document   : look
    Created on : Apr 13, 2022, 9:40:14 AM
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
        <form action="look" method="post">
            <input type="radio" name="ck" value="theme">
            <label>Par theme</label><br>
            <input type="text" name="them">
            <br>
            <input type="radio" name="ck" value="date">
            <label>Par date</label><br>
            <label>date debut</label>
            <input type="text" name="dt1">
            <label>date fin</label>
            <input type="text" name="dt2">
            <br>
            <input type="submit" name="cherch" value="cherche">
            <table border="2px">
             <tr>
                <td>idcon</td>
                <td>nom </td>
                <td>them</td>
                <td>date debut</td>
                <td>nbr jour</td>
            </tr>
             <%if(request.getAttribute("R")!=null){
            ResultSet rs= (ResultSet) request.getAttribute("R");
            while(rs.next()){%>
                <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><a href="look?idc=<%=rs.getString(1)%>">participer</a></td>
            </tr>
            <%}
        }%>   
            </table>
        </form>
    </body>
</html>
