package inscryption.carte;

public class CarteObstacle extends Carte
{
    public CarteObstacle(String nom, int pv) {
        super(nom, pv);
    }

    @Override
    public String getInfos() {
        return "["+m_nom+"] PV:"+m_pv;
    }
}
