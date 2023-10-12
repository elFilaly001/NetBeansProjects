<%-- 
    Document   : mise_jour
    Created on : Apr 20, 2022, 9:03:43 AM
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
        <script src="jquery.js"></script>
        <script>
            $(document).ready(function (){
                $('#aj').click(function (){
                    $.ajax({
                    url:'mise_jour',
                    data:'noper='+$('#noper').val()+'&nom='+$('#nom').val()+'&pre='+$('#pre').val()+'&email='+$('#email').val()+'&mdp='+$('#mdp').val()+'&op=aj',
                    datatype:'html',
                    type:'post',
                    success:function (r){
                        if(r!==0){
                            $('#T').append("<tr id='"+$('#noper').val()+"'><td>"+$('#noper').val()+"</td><td>"+$('#nom').val()+"</td><td>"+$('#pre').val()+"</td><td>"+$('#email').val()+"</td><td>"+$('#mdp').val()+"</td></tr>");
                            $('#mes').html("ok");
                    }else{
                        $('#mes').html("pb");
                    }}
                    });
                });
            });
            $(document).ready(function (){
                $('#sp').click(function (){
                    $.ajax({
                    url:'mise_jour',
                    data:'noper='+$('#noper').val()+'&op=sup',
                    datatype:'html',
                    type:'post',
                    success:function (r){
                        if(r!=0){
                            console.log('#'+$('#noper').val());
                            $('#'+$('#noper').val()+'').remove();
                            $('#mes').html("ok");
                    }else{
                        $('#mes').html("pb");
                    }}
                    });
                });
            });
        </script>
    </head>
    <body>
        <label>no permit</label><br>
        <input type="text" id="noper"><br>
        <label>nom conducteur</label><br>
        <input type="text" id="nom"><br>
        <label>prenom conducteur</label><br>
        <input type="text" id="pre"><br>
        <label>email</label><br>
        <input type="text" id="email"><br>
        <label> mot de pass</label><br>
        <input type="text" id="mdp"><br>
        <input type="submit" id="aj" value="AJOUTER"><br>
        <input type="submit" id="sp" value="SUPRIMER"><br>
        <% ResultSet rs= MyUtil.seConnecter().createStatement().executeQuery("select * from conducteur ");%>
        <table border="2px" id="T">
             <tr>
                <td>no permit</td>
                <td>nom</td>
                <td>prenom</td>
                <td>email</td>
                <td>mdp</td>
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
        <div id="mes"></div>
    </body>
</html>
