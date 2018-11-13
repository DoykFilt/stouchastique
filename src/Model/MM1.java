package Model;

import static java.lang.Math.pow;

public class MM1 extends FileDAttente{

    public MM1()
    {
        setNbr_clients(-1);
        setNbr_serveurs(1);

    }

    @Override
    public double calculate_q0() {
        return 1-calculate_rho();
    }

    @Override
    public double calculate_qj(int j) {
        return pow(calculate_rho(),j)*(1-calculate_rho());
    }

    @Override
    public double calculate_L() {
        return this.getLambda()/(this.getMu()-this.getLambda());
    }

    @Override
    public double calculate_Lq() {
        return (this.getLambda()*this.getLambda())/(this.getMu()*(this.getMu()-this.getLambda()));
    }

    @Override
    public double calculate_W() {
        return 1/(this.getMu()-this.getLambda());
    }

    @Override
    public double calculate_Wq() {
        return calculate_W()-(1/this.getMu());
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
