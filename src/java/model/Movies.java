
package model;

public class Movies {
  
    private int movieID;
    private String movieName;
    private String releaseDate;
    private String lead;
    private String director;

    public Movies() {
        this.movieID = 0;
        this.movieName = "";
        this.releaseDate = "";
        this.lead = "";
        this.director = "";
    }
    
   public Movies(int movieID, String movieName, String releaseDate, String lead, String director) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.lead = lead;
        this.director = director;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movies{" + "movieID=" + movieID + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", lead=" + lead + ", director=" + director + '}';
    }
    
    
}
