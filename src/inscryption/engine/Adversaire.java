package inscryption.engine;

import inscryption.carte.Carte;
import inscryption.carte.CarteAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Adversaire extends Entite{

    private List<CarteAnimal> m_main = new ArrayList<CarteAnimal>();
    private Pioche m_pioche = new Pioche();

    private Optional<CarteAnimal>[] m_prochaineAction;

    public Adversaire()
    {
        m_score = 0;
        m_prochaineAction = new Optional[Plateau.NB_CARTES_PAR_LIGNE];
        reinitialiserProchain();
    }

    private boolean peutPlacerCarte(CarteAnimal c, Plateau p, Position pos) throws Exception
    {
        boolean valide = false;
        if ( !p.getPlateau().containsKey(pos) )
            throw new Exception("La position n'existe pas !");

        if ( p.getPlateau().get(pos).isPresent() )
            return valide;

        valide = true;

        return valide;
    }

    private void reinitialiserProchain()
    {
        for ( int i = 0; i < m_prochaineAction.length; i++ ) {
            m_prochaineAction[i] = Optional.empty();
        }
    }

    public void afficherProchain()
    {
        System.out.print(" || ");
        for (int i = 0; i < m_prochaineAction.length; i++ )
        {
            if ( m_prochaineAction[i].isPresent() )
                System.out.print(m_prochaineAction[i].get().getInfos());
            else
                System.out.print("Aucun");
            System.out.print( " || ");
        }
        System.out.println("");
        System.out.println("    v       v       v       v");
    }
}
