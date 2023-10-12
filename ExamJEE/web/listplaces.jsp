<%-- 
    Document   : listplaces
    Created on : Jul 1, 2021, 3:08:41 PM
    Author     : ABDOU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="models.MyUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script src="/ExamJEE/js/jquery.js"></script>
    <body>
        
        <h1>List des places</h1>
        <%
            if (request.getAttribute("msg") != null) {
        %>
        <h3 style="color:green"><%=request.getAttribute("msg")%></h3>
        <%}%>
        <div id="divRech">
            <form action="/ExamJEE/SupprimerPersonne" method="post">
                <table id="tab">
                    <tr>
                        <th>Idplace </th>
                        <th>type</th>
                        <th>etat </th>
                        <th>prix </th>
                       </tr>

                    <%
                        Connection con = MyUtil.connect();
                        ResultSet rs = con.createStatement().executeQuery("select * from placeStationnement");
                    %>

                    <%
                        while (rs.next()) {
                    %>

                    <tr id="<%=rs.getString(1)%>">
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        
                        
                        <td><a href="#" onclick="deletePerson('<%=rs.getString(1)%>')">supprimer</a></td>
                    </tr>
                    <%}%>
                </table>
                <input type="submit" name="delete" value="supprimer tous"/><br>
            </form>
        </div> 
    </body>
    <script>
        function deletePerson(cin) {
            
            $.ajax({

                url: '/ExamJEE/SupprimerPersonne',
                type: 'GET',
                dataType: 'html',
                data: 'idplace=' + idplace,
                success: function (data, statut) {
                  alert('suppission avec succes');
                  //location.reload();
                  $("#"+cin+"").remove();
                },

                error: function (resultat, statut, erreur) {
                    alert(erreur);
                }

            });
        }
    </script>
</html>
