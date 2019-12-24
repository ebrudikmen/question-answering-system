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
public class DatabaseAccessor {
    private static DatabaseAccessor instance = null;
    private SourceWebsiteAccessor webAccessor = SourceWebsiteAccessor.getSourceWebsiteAccessor();
    
    private DatabaseAccessor(){
        
    }
    
    public static DatabaseAccessor getDatabaseAccessor(){
        if(instance == null){
            instance = new DatabaseAccessor();
        }
        return instance;
    }
    
    //finds movie from database registers
    //if can't find, asks to source web site accessor
    //if web site accessor returns movie adds them to the database
    public ArrayList<Movie> findMovies(ArrayList<String> candidates){
        ArrayList<Movie> foodList = new ArrayList<Movie>();
        
        //code that finds movie from database and creates foods,
        //finds the type of movie and creates, then upcasts to movie and adds to list
        //deletes from candidates list
        
        if(candidates.size()>0){
            //web site accessor's returns
            ArrayList<Movie> additions = webAccessor.findMovies(candidates);
            
            for(Movie movie : additions){
                
                //code that adds new database registers for new foods
            }
            
            foodList.addAll(additions);
        }
        
        return foodList;
    }
    
}
