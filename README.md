# XMLParsingMovies

## Aim
To parse an xml file and access the infomation stored in its nodes

## How It Works

### XMLFileReader

* The constructor accepts a string of the file pith and uses it to create a File object called movielxml.
* Then we instantiate a DocumentBuilderfactory called moviexmlfactory.
* This class has a method to create a DocumentBuilder object called movieBuilder.
* Then we parse the moviexml file into the movie builder to create a Document object called XMLFile.

### MovieFactory

* When the MovieFactory class is instantiated it creates an XMLFileReader object and uses a getter to get the XMLFile Document object.
* It also creates the NodeList allRecords, this creates a list of all the nodes with the tag name "record".
* The public method printAllMoviesNames iterates through that list and grabs all the elements of the record with tag name "movie_record"

### Document vs. File Objects
We use the File class as it allows the JVM access to files via a file path. We then use the Document interface as it extends the interface for nodes. This makes it more suitable for accessing data stored in a xml file that uses a parent-child node format.
