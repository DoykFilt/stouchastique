package Model;

public class MM1K extends FileDAttente{

    public MM1K(int nbr_clients){
        setNbr_clients(nbr_clients);
        setNbr_serveurs(1);
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