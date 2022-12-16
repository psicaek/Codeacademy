package LanguageFamilies;

public class SinoTibetan extends Language {
    public SinoTibetan(String languageName, int speakers){
        super(languageName, speakers, "Asia", "subject-object-verb");
        if(languageName.contains("Chinese")){
            this.wordOrder="subject-verb-object";
        }
    }
    public void getInfo(){

        System.out.println(name+" is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+" .The language follows the word order: "+wordOrder+".");
    }
}
