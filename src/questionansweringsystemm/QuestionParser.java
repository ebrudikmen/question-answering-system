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
public class QuestionParser{
    private static QuestionParser instance = null;
    private PatternCatalog patternCatalog;
    private MovieCatalog catalog;
    private Answerer answerer;
    
    private QuestionParser(){
        patternCatalog = PatternCatalog.getPatternCatalog();
        catalog = MovieCatalog.getMovieCatalog();
        answerer = Answerer.getAnswererInstance();
    }
    
    public static QuestionParser getParser(){
        if(instance == null){
            instance = new QuestionParser();
        }
        
        return instance;
    }
    
    //parses question into keywords and candidate words
    public String MatchQuestion(String question){
        QuestionPattern matchedPattern = patternCatalog.findPattern(question);
        String answer;
        String[] words;
        ArrayList<String> candidateWords;
        ArrayList<Movie> movieResults;
        if(matchedPattern != null){
            switch(matchedPattern.getCategory()){
                
                case QuestionPattern.yil:
                    
                    words = question.split(" ");
                
                    candidateWords = cleanKeywords(words, matchedPattern.getRegex());

                    movieResults = catalog.movieFoods(candidateWords);                            

                    answer = answerer.getAnswer(matchedPattern, movieResults);
                    
                    return answer;
               case QuestionPattern.ulke:
                    
                    words = question.split(" ");
                
                    candidateWords = cleanKeywords(words, matchedPattern.getRegex());

                    movieResults = catalog.movieFoods(candidateWords);                            

                    answer = answerer.getAnswer(matchedPattern, movieResults);
                    
                    return answer;
                case QuestionPattern.score:
                    
                    words = question.split(" ");
                
                    candidateWords = cleanKeywords(words, matchedPattern.getRegex());

                    movieResults = catalog.movieFoods(candidateWords);                            

                    answer = answerer.getAnswer(matchedPattern, movieResults);
                    
                    return answer;
                    
               case QuestionPattern.lang:
                    
                    words = question.split(" ");
                
                    candidateWords = cleanKeywords(words, matchedPattern.getRegex());

                    movieResults = catalog.movieFoods(candidateWords);                            

                    answer = answerer.getAnswer(matchedPattern, movieResults);
                    
                    return answer;
               case QuestionPattern.actor:
                    
                    words = question.split(" ");
                
                    candidateWords = cleanKeywords(words, matchedPattern.getRegex());

                    movieResults = catalog.movieFoods(candidateWords);                            

                    answer = answerer.getAnswer(matchedPattern, movieResults);
                    
                    return answer;
                
                
            }
            
        }
        
        return "Ne sorduğunuzu anlamadım.";
    }
    
    //cleans questions words from keywords in pattern regex
    public ArrayList<String> cleanKeywords(String[] arrayWithKeywords, String regex){
        String[] regexParts = regex.split(" ");
        ArrayList<String> movieCandidates = new ArrayList<String>();
        
        for(int i = 0; i<arrayWithKeywords.length; i++){
            for(String regPart : regexParts){
                if(arrayWithKeywords[i].startsWith(regPart)){
                    arrayWithKeywords[i] = "";
                }
            }           
        }
        
        for(String word : arrayWithKeywords){
            if(!word.equals("")){
                movieCandidates.add(word);
            }
        }
        
        return movieCandidates;
    }
    
}
