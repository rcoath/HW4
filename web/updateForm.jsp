<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Movies"%>
<% Movies movie = (Movies) request.getAttribute("movie"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Movie</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h1>Update A Movie</h1>
        
         <form name="updateForm" action="updateMovie" method="get">
            
            <table class="update"
                <tr>
                    <td class="right">Movie ID:</td>
                    <td> <input type="text" name="name" value="<%= movie.getMovieID() %>" /></td>
                </tr>
                <tr>
                    <td class="right">Movie Name:</td>
                    <td><input type="text" name="name" value="<%= movie.getMovieName() %>" /></td>
                </tr>
                <tr>
                    <td class="right">Release Date:</td>
                    <td><input type="text" name="basexp" value="<%= movie.getReleaseDate() %>" /></td>
                </tr>
                <tr>
                    <td class="right">Lead:</td>
                    <td><input type="text" name="type" value="<%= movie.getLead()%>" /></td>
                </tr>
                <tr>
                    <td class="right">Director:</td>
                    <td><input type="text" name="species" value="<%= movie.getDirector()%>" /></td>
                </tr>
              
            </table>
            <br>
            <div>
            <input type="submit" name="submit" value="Update" />
            <input type="reset" name="clear" value="Clear" />
            </div>
        </form>
    </body>
</html>