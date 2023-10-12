<%-- 
    Document   : Q2
    Created on : Apr 28, 2022, 10:18:35 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="jquery.js"></script>
        <script>
            $(document).ready(function(){
               $.ajax({
                    url:'S2',
                    type: 'POST',
                    dataType: 'HTML',
                    data:{
                        option:'charge'
                    },
                    success:function(r){ 
                        if (r!==null) {
                            $("#liste1").append(r);
                        }
                        else{
                            $("#message").html("Erreur") ;                                                                                                         
                        }
                    }
               }); 
               $(document).on('change','#liste1',function(event){
                   
                   $.ajax({
                        url:'S2',
                        type:'POST',
                        dataType: 'HTML',
                        data:{
                            id:$('#liste1').val(),
                            option:'change'
                        },
                        success: function (r) {
                            $("#liste2").html(r);
                        }
                   });
               });
           });
        </script>
    </head>
    <body>
        <select id="liste1">
            
        </select>
        <select id="liste2"></select>
        <div id="message"></div>
        
       <%
            ResultSet r=MyUtil.seConnecter().executeQuery("select p.* from affectation f,projet p where f.date_affectation+2>sysdate and p.code_projet=f.code_projet");
        %>
        <select id="poste">
            <%
                while(r.next()){
            %>
            <option><%=r.getString(1)%></option>
            <%
                }
            %>
        </select><%
            ResultSet r=MyUtil.seConnecter().createStatement().executeQuery("select p.* from affectation f,projet p where f.date_aff+2>sysdate and p.codeprj=f.codeprj");
        %>
        <select id="post">
            <%
                while(r.next()){
            %>
            <option><%=r.getString(1)%></option>
            <%
                }
            %>
        </select>
    </body>
</html>
