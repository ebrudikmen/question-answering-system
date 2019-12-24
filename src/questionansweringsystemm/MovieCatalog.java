/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionansweringsystemm;

import java.util.ArrayList;

/**
 *
 * @author gnl
 */
public class MovieCatalog {
    private static MovieCatalog instance = null;
    private ArrayList<Movie> movieList;
    private DatabaseAccessor dbAccessor = DatabaseAccessor.getDatabaseAccessor();
    private MovieListCatalog movieCatalog = MovieListCatalog.getMovieListCatalog();
  
    
    private MovieCatalog(){
        //create movie list
        movieList = new ArrayList<Movie>();
        
        //add all movie from other catalogs
        movieList.addAll(movieCatalog.getAllMovie());
        
       
    }
    
    public static MovieCatalog getMovieCatalog(){
        if(instance==null){
            instance= new MovieCatalog();
        }
        
        return instance;
    }

    
    //finds movie and returns them
    //if can't find asks to database accessor
    //if database accessor finds, movie catalog adds them into catalogs
    public ArrayList<Movie> movieFoods(ArrayList<String> candidates){
        ArrayList<Movie> resultMovieList = new ArrayList<Movie>();
        ArrayList<String> removeList = new ArrayList<>();
        for (Movie movies : movieList) {
            for(String word : candidates){
                if(word.equals(movies.getName().toLowerCase())){
                    resultMovieList.add(movies);
                    removeList.add(word);
                }
            }
        }
        
        //delete candidate words if found
        candidates.removeAll(removeList);
        
        if(candidates.size()>0){
            //still candidates remains, so asks them to database
            ArrayList<Movie> additions = dbAccessor.findMovies(candidates);
            
            //add new movie to catalogs
            movieList.addAll(additions);
            
            for(Movie movie : additions){
                if(movie instanceof MovieList){
                    movieCatalog.addToCatalog(movie);
               
            }
            
            resultMovieList.addAll(additions);
        }
        
        
    }
    
   return resultMovieList;
    }
    /**
     *
     * @return
     */
    public ArrayList<Movie> getAllMovie()
    {
        return  movieList;
    }
}

