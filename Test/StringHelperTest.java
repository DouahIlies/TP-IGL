import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mac on 15/10/2017.
 */
class StringHelperTest {
    @Test
    void joinString() {
        String [] mots={"moumen","ilies","douah"};
        assertEquals(StringHelper.joinString(mots),"moumen,ilies,douah");

    }

    @Test
    void fractionString() {

        assertArrayEquals(StringHelper.fractionString("Moumen est un etudiant",' ').toArray(),new String []{"Moumen","est","un","etudiant"});
    }

    @Test
    void structurerText() {

        assertEquals(StringHelper.structurerText("ilies est un etUDiAnt.douah blalbe.okfkdof. "),"Ilies est un etudiant.Douah blalbe.Okfkdof. " );
    }

    @Test
    void occurenceMot() {
        assertEquals(StringHelper.occurenceMot("tp tp igl tp tp samedi","tp"),4);
    }

    @Test
    void elimierMotsVides() {
       assertEquals(StringHelper.elimierMotsVides("moumen est ou un etdiant et non pas un ouvrier à"),"moumen est un etdiant pas un ouvrier");
    }

    @Test
    void remplacerAvecCharSuivant() {

        assertEquals(StringHelper.remplacerAvecCharSuivant("abcdef"),"bcdefg");
    }

}