package Model;
import java.lang.Math.*;

import static java.lang.Math.exp;
import static java.lang.Math.pow;


public class MM1K extends FileDAttente{

    public MM1K(int nbr_clients)
    {
        setNbr_clients(nbr_clients);
        setNbr_serveurs(1);
    }

    @Override
    public double calculate_q0() {
       double rho = calculate_rho();
       int k = getNbr_clients();

       if(rho==1)
           return 1/(k+1);
       else
           return (1-rho)/(1-pow(rho,k+1));
    }

    @Override
    public double calculate_qj(int j) {
        double rho = calculate_rho();
        int k = getNbr_clients();

        if(rho==1)
            return 1/(k+1);
        else
            return ((1-rho)*pow(rho,j))/(1-pow(rho,k+1));
    }

    @Override
    public double calculate_L() {
        double rho = calculate_rho();
        int k = getNbr_clients();

        if(rho == 1)
            return getNbr_clients()/2;
        else
            return rho*((1 - (k+1) * pow(rho,k) + k * pow(rho,(k+1)))/((1-rho) * (1-pow(rho,k+1))));
    }

    @Override
    public double calculate_Lq() {
        return calculate_L()-(1-calculate_q0());
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
