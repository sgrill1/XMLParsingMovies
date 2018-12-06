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

* When the MovieFactory class is instantiated it creates an XMLFileReader object and uses a getter to get the XMLFile Document object
