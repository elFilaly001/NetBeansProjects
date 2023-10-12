<%-- 
    Document   : ajoutVEHIC
    Created on : Jul 1, 2021, 3:35:46 PM
    Author     : ABDOU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="models.MyUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ajouter vehicule</h1>
        <form action="/ExamHEE/ajoutervehicule" method="post"></form>
            <h1>Stationner </h1>
            <select name="matricule" id="mat">
                <%
                    Connection con = MyUtil.connect();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from vehicule");
                    ResultSet rs1 = st.executeQuery("select * from utilisateur");
                    while (rs.next()) {
                %>
                <option value="<%=rs.getString(1)%>"><%=rs.getString(3)%></option>
                <%
                    }
                %>
            </select>
            <br>
            <select name="vehicule" class="txt" id="vehicule">
                <%
                    st = con.createStatement();
                    rs = st.executeQuery("select * from vehicule");
                    while (rs.next()) {
                %>
                <option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
                <%
                    }
                %>
            </select>
            <br>
            <select name="uti" id="uti">
                <%
                    st = con.createStatement();
                    rs1 = st.executeQuery("select * from utilisateur");
                    while (rs1.next()) {
                %>
                <option value="<%=rs1.getInt(1)%>"><%=rs1.getString(2)%></option>
                <%
                    }
                %>
            </select>

            <br>
            <input type="submit" value="Valider">
            <script>
                function ajouter() {
                    $.ajax({
                        url: '/nomprojet/ajoutervehicule',
                        type: 'Post',
                        dataType: 'html',
                        data: 'matricule=' + $("#mat").val() + 'type=' + $("#type").val() + '&utilisateur=' + $("#uti").val(),
                        success: function (code_html, stauts) {
                            alert(code_html);
                            location.reload();
                        },
                        error: function (html, erreur, code) {
                            alert(erreur);
                        }
                    })
                }
            </script>
    </body>
</html>
