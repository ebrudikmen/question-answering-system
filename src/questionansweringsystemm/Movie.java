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
public class Movie {
    private String name;
    private int yil;
    private String ulke;
    private double score;
    private String lang;
    private String actor;
       
    
    public Movie(){
        name = "";
        yil=0;
        ulke="";
        score=0.0;
        lang="";
        actor="";
        
    }

    public Movie(String name, int yil, String ulke, double score, String lang,String actor) {
        this.name = name;
        this.yil=yil;
        this.ulke=ulke;
        this.score=score;
        this.lang=lang;
        this.actor=actor;
       
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the yil
     */
    public int getYil() {
        return yil;
    }

    /**
     * @param yil the yil to set
     */
    public void setYil(int yil) {
        this.yil = yil;
    }

    /**
     * @return the ulke
     */
    public String getUlke() {
        return ulke;
    }

    /**
     * @param ulke the ulke to set
     */
    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return the actor
     */
    public String getActor() {
        return actor;
    }

    /**
     * @param actor the actor to set
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    

   
}
