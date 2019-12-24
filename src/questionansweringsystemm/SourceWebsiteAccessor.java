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
public class SourceWebsiteAccessor {
    private static SourceWebsiteAccessor instance = null;
    
    private SourceWebsiteAccessor(){
        
    }
    
    public static SourceWebsiteAccessor getSourceWebsiteAccessor(){
        if(instance==null){
            instance = new SourceWebsiteAccessor();
        }
        
        return instance;
    }
    
 
    public ArrayList<Movie> findMovies(ArrayList<String> candidates){
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        
       
        return movieList;
    }
}
