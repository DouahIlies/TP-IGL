import java.util.ArrayList;

/**
 * Created by mac on 12/10/2017.
 */

public class main {
    public static void main (String[] args){
        //Test fonction 1
        String [] tab={"Ilies","Douah","Facebook","blalbal"};
        //System.out.println( StringHelper.joinString(tab));


        //Test fonction 2
        ArrayList<String> list=StringHelper.fractionString("ilies Douah est blablalba",' ');
        for (String mot:list
             ) {
            //System.out.println(mot);
        }


        //Test fonction 4
        //System.out.println( StringHelper.structurerText("douah ilies est un etudiant..il HABITE A oran.ILL douah JHFD.jkfdf"));

        //Test fonction 5
        System.out.println(StringHelper.occurenceMot("ilies douah ilies ilies balblk iliesilies","ilies"));
    }
}
