
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    
    
    public ReadQuery() {
    
    
    Properties props = new Properties();
    InputStream instr;
        instr = getClass().getResourcesAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        public void doRead
                
                String query = "Select * from movie"
                        PreparedStatement ps = conn.prepareStatement(query);
                        this.results= ps.executeQuery();
                        
    Public String get HTMLTable() {
        
   String table = "";
   table += "<table border=1>";
   
   while(this.results.next()){
   
       
       Movies movie = new Movie();
       movie.setMovieID(this.results.getInt("movieID"));
         movie.setMovieName(this.results.getInt("movieName"));
          movie.setReleaseDAte(this.results.getInt("releaseDate"));
          movie.setLead(this.results.getInt("lead"));
          movie.setDirector(this.results.getInt("director"));
   
   table += "<tr>";
        table += "<td>";
            table 
   
   }
   
           
           
           
           
       
   
   table += "</table>";
   
           return table;
           
            
    }
}
