package day05;

public class Imdb {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1992);
        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(3));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 5);
        System.out.println(movie.getAvgRating());
    }
}
