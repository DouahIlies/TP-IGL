import java.util.ArrayList;

/**
 * Created by mac on 12/10/2017.
 */
public class StringHelper {

    public static String joinString(String tab[]){
        String result="";
        for (int i=0;i<tab.length-1;i++
             ) {
            result+=tab[i]+",";
        }
        result+=tab[tab.length-1];
        return result;
    }

    public static ArrayList<String> fractionString(String chaine,char separateur){
        ArrayList<String> listChaine = new ArrayList<String>();
        String mot="";
        for(int i=0;i<chaine.length();i++){
            if(chaine.charAt(i) != separateur)
            mot+=chaine.charAt(i);
            else {
                listChaine.add(mot);
                mot="";
            }
        }
        listChaine.add(mot);
        return listChaine;
    }

    public static String elimineMotVide(String chaine){

        return "";
    }

    public static String structurerText(String text){
        String chaine="";
        chaine+=Character.toUpperCase(text.charAt(0));
        for(int i=1;i<text.length();i++){
            if(text.charAt(i-1)=='.'){
                chaine+=Character.toUpperCase(text.charAt(i));
            }
            else chaine+=Character.toLowerCase(text.charAt(i));
        }
        return chaine;

    }

    public static int occurenceMot(String chaine, String mot){
        chaine=chaine+"i";
        String [] tb=chaine.split(mot);
        return tb.length-1;
    }

    public static String elimierMotsVides(String string){
        String[] tmp = string.split(" ");
        String result="";
        for (String s :tmp) {
            if (!s.equalsIgnoreCase("ou") && !s.equalsIgnoreCase("et") && !s.equalsIgnoreCase("à") && !s.equalsIgnoreCase("non")){
                result+=s+" ";
            }
        }
        return result;
    }

    public static String remplacerAvecCharSuivant(String string){

        String result="";
        for (char charactere:string.toCharArray()) {
            result+=++charactere;
        }
        return result;
    }





}
