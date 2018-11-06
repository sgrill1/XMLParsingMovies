package xml_parsing_movies;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class MovieFactory {

    private Document movieList;
    private NodeList allRecords; //xmls work on parent-child nodes


    public MovieFactory(String movieXML){
        XMLFileReader movieFile = new XMLFileReader (movieXML);
        movieList = movieFile.getXMLFile ();
        setAllRecords();

    }

    public NodeList getAllRecords(){return allRecords;}

    public void setAllRecords() {
        this.allRecords = movieList.getElementsByTagName("record");
    }

    public void printAllMoviesNames(){
        for (int i = 0; i < allRecords.getLength (); i++) {
            Node movies = allRecords.item(i);
            Element movieName = (Element) movies;
            System.out.println(movieName.getElementsByTagName("movie_name").item(0).getTextContent());
        }
    }

    public boolean allRecordsHave3Elements(){

    }
    public boolean noNullMovieNames(){

    }
    public boolean noNullMovieGenres(){

    }
    public boolean noNullPrices(){

    }
    public boolean noNullRecords(){

    }
    public boolean noMoreThanThreeGenres(){

    }
    public boolean allPricesHaveOnlyTwoDecimalsPlaces(){

    }


}
