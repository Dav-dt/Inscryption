package inscryption.carte;

public class CarteAnimal extends Carte
{
    protected int m_attk;
    protected int m_gouttesDeSang;
    protected int m_os;
    protected boolean m_bVolant;

    public CarteAnimal(String nom, int pv, int attaque, int gouttes,
                       int os, boolean volant) {
        super(nom, pv);
        m_attk = attaque;
        m_gouttesDeSang = gouttes;
        m_os = os;
        m_bVolant = volant;

    }

    public int getOs()
    {
        return m_os;
    }

    public int getGouttesDeSang()
    {
        return m_gouttesDeSang;
    }

    public int getAtt()
    {
        return m_attk;
    }

    @Override
    public String getInfos() {
        return "["+m_nom+"] PV: "+m_pv+ " Att: "+m_attk+
                (m_bVolant ? " Volant" : " Non Volant");
    }

    @Override
    public String getToutesInfosCarte(){
        return m_nom + nbEspacesMots(this) + "  PV: "+
                m_pv+ "    Att: "+m_attk+
                "   Gouttes de sang: "+ m_gouttesDeSang+
                "   Os: "+m_os +
                (m_bVolant ? "   Volant" : "   Non Volant");
    }
}
