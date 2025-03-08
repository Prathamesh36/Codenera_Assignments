package JAN3.Que12;

public class Movie {
    private String movie;
    private int release_date;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public Movie(String movie, int release_date) {
        this.movie = movie;
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "\n{" +
                "movie='" + movie + '\'' +
                ", release_date=" + release_date +
                '}';
    }
}
