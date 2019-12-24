/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionansweringsystemm;

import java.util.Scanner;

/**
 *
 * @author gnl
 */
public class QuestionAnsweringSystemm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String question = "a";
        
        //creating all static objects in the beginning
        QuestionAnsweringController controller = QuestionAnsweringController.getController();
        QuestionParser.getParser();
        PatternCatalog.getPatternCatalog();
        MovieListCatalog.getMovieListCatalog();
        MovieCatalog.getMovieCatalog();
       
        DatabaseAccessor.getDatabaseAccessor();
        SourceWebsiteAccessor.getSourceWebsiteAccessor();
        Answerer.getAnswererInstance();
        
        //User Interface
        while (!question.equals("q")) {            
            Scanner input = new Scanner(System.in,"ISO-8859-9");
            System.out.println("Merhaba, benden filmler hakkında bilgi alabilirsiniz. Sorunuz nedir?(Çıkış: q)");
            question = input.nextLine();
            
            String answer = controller.askQuestion(question);
            System.out.println(answer);
        }
    }
    
}
