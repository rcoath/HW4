<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Movie</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h1>Add A New Movie</h1>
        
        <form name="addForm" action="addMovie" method="get">
        
            <label>Movie ID:</label>
            <input type="text" name="ID" value="" />
            <br>
            <label>Movie Name:</label>
            <input type="text" name="Name" value="" />
            <br>
            <label>Release Date:</label>
            <input type="text" name="Date" value="" />
            <br>
            <label>Lead:</label>
            <input type="text" name="Lead" value="" />
            <br>
            <label>Director:</label>
            <input type="text" name="Director" value="" />
            <br>
            <div>
            <input type="submit" name="submit" value="Submit" />
            <input type="reset" name="clear" value="Clear" />
            </div>
        </form>
    </body>
</html>