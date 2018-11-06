package xml_parsing_movies;

import xml_parsing_movies.MovieFactory;

public class Main
{
    public static void main( String[] args ){
        MovieFactory movies = new MovieFactory("resources/movies.xml");
        movies.printAllMoviesNames ();

    }
}
