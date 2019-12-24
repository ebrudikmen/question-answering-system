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
public class MovieListCatalog {
    private static MovieListCatalog instance = null;
    private ArrayList<MovieList> MovieList;
    
    private MovieListCatalog(){
        MovieList = new ArrayList<MovieList>();
                      
        MovieList.add(new MovieList("Club", 1999, "Amerika", 8.7, "İngilizce","Brad Pitt"));
        MovieList.add(new MovieList("Club", 1999, "Amerika", 8.7, "İngilizce","Brad Pitt"));
        
    }
    
    public static MovieListCatalog getMovieListCatalog(){
        if(instance==null){
            instance = new MovieListCatalog();
        }
        
        return instance;
    }
    
    public ArrayList<MovieList> getAllMovie(){
        return MovieList;
    }
    
    //downcasts food object that comes from database or website (in upcasted form)
    //and adds to the catalog
    public void addToCatalog(Movie movies){
        MovieList.add((MovieList) movies);
    }
}
