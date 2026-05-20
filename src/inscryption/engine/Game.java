package inscryption.engine;

import java.util.Scanner;

public final class Game
{
    private final int NB_DE_PARTIES_POUR_GAGNER = 3;
    private final int NB_DE_POINTS_POUR_GAGNER_PARTIE = 5;
    Joueur m_joueur = new Joueur();
    Plateau m_plateau = new Plateau();

    public Game() {};

    public void lancerJeu() {
        boolean gameRunning = true;

        while ( gameRunning ) {

            m_plateau.afficherPlateau();

            m_joueur.afficherMain();

            System.out.println("Actions possibles : ");
            System.out.println("[fin] Terminer votre tour");
            System.out.println("[piocher] Piocher une carte");
            System.out.println("[placer] <numero carte> <position> Placer " +
                    "une carte sur la plateau");

            Scanner sc = new Scanner(System.in);
            Input input = new Input(sc.nextLine());

            while ( !input.tryExecuteInput() )
            {
                input.changerInput(sc.nextLine());
            }

        }
    }
}
