package inscryption.engine;

public final class Game
{
    private final int NB_DE_PARTIES_POUR_GAGNER = 3;
    private final int NB_DE_POINTS_POUR_GAGNER_PARTIE = 5;
    
    public Game() {};

    public void lancerJeu()
    {
        Joueur joueur = new Joueur();
        Plateau plateau = new Plateau();

        plateau.afficherPlateau();

        joueur.afficherMain();

    };

}
