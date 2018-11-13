package Model;

public abstract class FileDAttente {

    private int nbr_serveurs;
    private int nbr_clients;

    protected double lambda;
    protected double mu;

    public double calculate_rho(){
        return this.lambda / (this.mu * this.nbr_serveurs);
    }
    public abstract double calculate_q0();
    public abstract double calculate_qj(int j);

    public abstract double calculate_L();
    public abstract double calculate_Lq();
    public abstract double calculate_W();
    public abstract double calculate_Wq();
    public abstract double calculate_nombreMoyenClient(double heure);
    public abstract int nbrServeurs_sansEngorgement();

    public int getNbr_serveurs() {
        return nbr_serveurs;
    }

    public void setNbr_serveurs(int nbr_serveurs) {
        this.nbr_serveurs = nbr_serveurs;
    }

    public int getNbr_clients() {
        return nbr_clients;
    }

    public void setNbr_clients(int nbr_clients) {
        this.nbr_clients = nbr_clients;
    }

    public double getLambda() {
        return lambda;
    }

    public double getMu() {
        return mu;
    }
}
