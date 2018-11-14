package Model;

import static java.lang.Math.pow;

public class MMS extends FileDAttente {

    public MMS(int nbr_serveurs)
    {
        setNbr_clients(-1);
        setNbr_serveurs(nbr_serveurs);
    }

    static int fact(int n) {
        return n > 1?n * fact(n-1):1;
    }

    @Override
    public double calculate_q0() {
        int s = getNbr_serveurs();
        double rho = calculate_rho();

        double somme = 0 ;
        for(int i = 0; i < s ; i++)
        {
            somme += (pow(rho*s,i))/fact(i);
        }
        double denom = somme + pow(rho*s,s)/(fact(s)*(1-rho));

        return 1/denom;
    }

    @Override
    public double calculate_qj(int j) {
        double rho = calculate_rho();
        int s = getNbr_serveurs();

        if(j>=0 && j < s){
            return (pow(rho*s,j)/fact(j))*calculate_q0();
        }
        else if(j>=s)
        {
            return ((pow(s,s)*pow(rho,j))/fact(s))*calculate_q0();
        }
        else
            return -1;
    }

    @Override
    public double calculate_L() {
        return calculate_Lq()+(getLambda()/getMu());
    }

    @Override
    public double calculate_Lq() {
        double rho = calculate_rho();
        int s = getNbr_serveurs();

        return calculate_q0()*((pow(rho*s,s)*rho)/(fact(s)*(pow(1-rho,2))));
    }

    @Override
    public double calculate_W() {
        return calculate_Wq()+(1/getMu());
    }

    @Override
    public double calculate_Wq() {
        return calculate_Lq()/getLambda();
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
