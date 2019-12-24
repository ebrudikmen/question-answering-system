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
public class QuestionAnsweringController {
    private static QuestionAnsweringController instance = null;
    
    private QuestionParser parser;
    
    private QuestionAnsweringController(){
        parser = QuestionParser.getParser(); 
    }
    
    public static QuestionAnsweringController getController(){
        if(instance==null){
            instance = new QuestionAnsweringController();
        }
        
        return instance;
    }

    public String askQuestion(String question){
        String answerResult = parser.MatchQuestion(question);
        
        return answerResult;
    }
}
