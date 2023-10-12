<%-- 
    Document   : create
    Created on : Apr 14, 2022, 11:43:17 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="create" method="post">
        <label>no permit</label><br>
        <input type="text" name="noper"><br>
        <label>nom conducteur</label><br>
        <input type="text" name="nomcond"><br>
        <label>prenom conducteur</label><br>
        <input type="text" name="prenomcond"><br>
        <label>email</label><br>
        <input type="text" name="email"><br>
        <label> mot de pass</label><br>
        <input type="text" name="mdp"><br>
        <label>confirmer mot de pass</label><br>
        <input type="text" name="cmdp"><br>
        <input type="submit" name="create" value="VALIDER" onclick="conf()"><br>
        </form>
        
    </body>
    <script>
        function conf() {
    var a = document.getElementsByName("mdp").value;
    var b = document.getElementsByName("cmdp").value;
    
    if(a!=b){
        alert("mot de pass correspondent");
        return false;
    }
}
    </script>
</html>
