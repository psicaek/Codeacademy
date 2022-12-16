package LanguageFamilies;

public class Mayan extends Language {
    Mayan(){
        super("Achi",82600,"Central America","verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(name+" is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+" .The language follows the word order: "+wordOrder+".");
    }
}
