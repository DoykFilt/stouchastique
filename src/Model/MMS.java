package Model;

public class MMS extends FileDAttente {

    public MMS(int nbr_serveurs)
    {
        setNbr_clients(-1);
        setNbr_serveurs(nbr_serveurs);
    }

    @Override
    public double calculate_q0() {
        return 0;
    }

    @Override
    public double calculate_qlambda() {
        return 0;
    }

    @Override
    public double calculate_L() {
        return 0;
    }

    @Override
    public double calculate_Lq() {
        return 0;
    }

    @Override
    public double calculate_W() {
        return 0;
    }

    @Override
    public double calculate_Wq() {
        return 0;
    }

    @Override
    public double calculate_nombreMoyenClient(double heure) {
        return 0;
    }

    @Override
    public int nbrServeurs_sansEngorgement() {
        return 0;
    }
}
