import inscryption.engine.Input;
import inscryption.engine.Joueur;
import inscryption.engine.Plateau;
import org.junit.Test;

import static org.junit.Assert.*;

public class PiocheTest
{
    @Test
    public void testPioche1()
    {
        Joueur j = new Joueur();
        j.piocher();
        assertEquals(5, j.getNbCarteMain());
    }

    @Test
    public void testPasPioche()
    {
        Joueur j = new Joueur();
        assertEquals(4, j.getNbCarteMain());
    }

    @Test
    public void testPioche2()
    {
        Joueur j = new Joueur();
        j.piocher();
        j.piocher();
        assertEquals(6, j.getNbCarteMain());
    }




}
