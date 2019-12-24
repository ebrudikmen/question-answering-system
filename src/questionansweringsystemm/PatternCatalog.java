/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionansweringsystemm;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author gnl
 */
public class PatternCatalog {
    private static PatternCatalog instance =null;
    private ArrayList<QuestionPattern> patternList;

    
    private PatternCatalog(){
        patternList = new ArrayList<QuestionPattern>();
        
        //adding new patterns
        patternList.add(new QuestionPattern("kaç yılında çekilmiştir", QuestionPattern.yil));
        patternList.add(new QuestionPattern("yılı kaçtır", QuestionPattern.yil));
        patternList.add(new QuestionPattern("ülkesi neresidir", QuestionPattern.ulke));
        patternList.add(new QuestionPattern("ülke", QuestionPattern.ulke));
        patternList.add(new QuestionPattern("dil", QuestionPattern.lang));
        patternList.add(new QuestionPattern("imdb", QuestionPattern.score));
        patternList.add(new QuestionPattern("oyuncular", QuestionPattern.actor));

   
    }
    
    public static PatternCatalog getPatternCatalog(){
        if(instance==null){
            instance = new PatternCatalog();
        }
        
        return instance;
    }
    
    //find pattern that matches the question
    public QuestionPattern findPattern(String question){
        Pattern currentPattern;
        Matcher matcher;
        for(QuestionPattern pattern : patternList){
            currentPattern = Pattern.compile(pattern.getRegex());
            matcher = currentPattern.matcher(question);
            if(matcher.find()){
                return pattern;
            }
        }
        return null;
    }
    
}
