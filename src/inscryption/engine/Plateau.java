package inscryption.engine;

import inscryption.carte.Carte;
import inscryption.carte.CarteAnimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Map.entry;

public class Plateau
{
    private final int NB_CARTES_PAR_LIGNE = 4;

    private Map<Position, Optional<Carte>> m_plateau = Map.ofEntries(
        entry(Position.A1, Optional.empty()),
        entry(Position.A2, Optional.empty()),
        entry(Position.A3, Optional.empty()),
        entry(Position.A4, Optional.empty()),
        entry(Position.B1, Optional.empty()),
        entry(Position.B2, Optional.empty()),
        entry(Position.B3, Optional.empty()),
        entry(Position.B4, Optional.empty()));

     public Plateau() {}


    public void afficherPlateau()
    {
        Position[] ligneAdversaire = {Position.A1, Position.A2, Position.A3,
                Position.A4};

        Position[] ligneJoueur = {Position.B1, Position.B2, Position.B3,
                Position.B4};

        System.out.print("Adversaire : ");

        for ( int i = 0; i < NB_CARTES_PAR_LIGNE; i++ )
        {
            Position pos = ligneAdversaire[i];
            Optional<Carte> carteOpt = m_plateau.get(pos);

            System.out.print(" || ");

            if (carteOpt.isPresent())
            {
                Carte carte = carteOpt.get();

                System.out.print(carte.getInfos());
            }
            else
            {
                System.out.print(pos.name());
            }

            System.out.print(" || ");
        }

        System.out.println();
        System.out.print("Joueur     : ");

        for ( int i = 0; i < NB_CARTES_PAR_LIGNE; i++ )
        {
            Position pos = ligneJoueur[i];
            Optional<Carte> carteOpt = m_plateau.get(pos);

            System.out.print(" || ");

            if (carteOpt.isPresent())
            {
                Carte carte = carteOpt.get();

                System.out.print(carte.getInfos());
            }
            else
            {
                System.out.print(pos.name());
            }

            System.out.print(" || ");
        }

        System.out.println();
    }

}
