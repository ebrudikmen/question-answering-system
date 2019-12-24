/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionansweringsystemm;

/**
 *
 * @author gnl
 */
public class QuestionPattern {
    
    //question categories
    //there can be more than one pattern for each
    public static final int yil= 0;
    public static final int ulke= 1;
    public static final int score = 2;
    public static final int lang = 3;
    public static final int actor = 4;
  
    
    private String regex;
    private int category;
    
    public QuestionPattern(String regex, int category){
        this.regex = regex;
        this.category = category;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    
    
}
