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
public class Answerer {
    private static Answerer instance = null;
    
    private Answerer(){
        
    }
    
    public static Answerer getAnswererInstance(){
        if(instance==null){
            instance = new Answerer();
        }
        
        return instance;
    }
    
    //creates answer about related question category and returns it
    public String getAnswer(QuestionPattern pattern, ArrayList<Movie> movieList){
        String answer ="";
        
        switch(pattern.getCategory()){
            
            case QuestionPattern.yil:
                if(movieList.size()==0) return "Böyle bir film bulamadım";
                
                for(Movie movie : movieList){
                        answer+= movie.getName()+" "+movie.getYil()+"yılında çekilmiştir";
                               
                    }
                    
                return answer;
                    
            case QuestionPattern.ulke:

                
                if(movieList.size()==0) return "Böyle bir film bulamadım";
                
                for(Movie movie : movieList){
                        answer+= movie.getName()+" "+movie.getUlke()+"çekilmiştir";
                               
                    }
                    
                return answer;
                
                  case QuestionPattern.score:
                if(movieList.size()==0) return "Böyle bir film bulamadım";
                
                for(Movie movie : movieList){
                        answer+= movie.getName()+" "+movie.getScore()+" puan almıştır";
                               
                    }
                    
                return answer;
                      
                        case QuestionPattern.lang:
                if(movieList.size()==0) return "Böyle bir film bulamadım";
                
                for(Movie movie : movieList){
                        answer+= movie.getName()+" "+movie.getLang()+"dilinde çekilmiştir";
                               
                    }
                    
                return answer;
                            
                    case QuestionPattern.actor:
                if(movieList.size()==0) return "Böyle bir film bulamadım";
                
                for(Movie movie : movieList){
                        answer+= movie.getName()+" "+movie.getActor()+"rol almıştır";
                               
                    }
                    
                return answer;
        }
        
        return answer;
    }
    
}
