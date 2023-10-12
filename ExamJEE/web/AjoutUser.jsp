<%-- 
    Document   : AjoutUser
    Created on : Jul 1, 2021, 2:14:06 PM
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
        <h1>Ajouter un Utilisateur</h1>
        <form method="post" action="/GestionPersonneAjax/AjouterPersonne">
            <table>
                <tr><td>Nom :</td><td><input type="text" name="nom" id="nom"/></td></tr>
                <tr> <td>Prenom :</td><td><input type="text" name="prenom" id="prenom"/></td></tr>
                <tr> <td>email:</td><td><input type="text" name="email" id="email"/></td></tr>
                <tr> <td>tel :</td><td><input type="text" name="tel" id="tel"/></td></tr>
                <tr><td>mote de passe :</td><td><input type="text" name="mdp" value="mdp"/></td></tr>
                <tr><td>valider mote de passe :</td><td><input type="text" name="vmdp" value="vmdp"/></td></tr>
                <tr><td><input type="submit" name="envoyer" value="Ajouter" onclick="valide()" /></td></tr>
            </table>
        </form>
    </body>
    <script>
        var b,c,d,e,f,g;
        b=document.getElementById(nom);
        c=document.getElementById(prenom);
        d=document.getElementById(email);
        e=document.getElementById(tel);
        f=document.getElementById(mdp);
        g=document.getElementById(vmdp);
        
        function valide(){
            function empty(){
                if(b.value===""){
                    alert("entrez le nom");
                }
                if(c.value===""){
                    alert("entrez le prenom");
                }
                if(d.value===""){
                    alert("entrez le email");
                }
                if(e.value===""){
                    alert("entrez le tel");
                }
                if(f.value===""){
                    alert("entrez le mod de passe");
                }
            }
             let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            if (!mail.match(regexEmail)) {
                valide = false;
            }
            function mdp(){
                if(f.value!==g.value){
                    alert("votre mot de passe n'est pas valide");
                }
            }
        }
    </script>
</html>
