package Model;

public class Main {
    public static void main (String[] args){

        MM1 testMM1 = new MM1();
        testMM1.lambda= 10;
        testMM1.mu=12;
        System.out.println("***** M|M|1 *****");
        System.out.println("RHO = " + testMM1.calculate_rho());
        System.out.println("q0 = " + testMM1.calculate_q0());
        System.out.println("L = " + testMM1.calculate_L());
        System.out.println("Lq = " + testMM1.calculate_Lq());
        System.out.println("W = " + testMM1.calculate_W());
        System.out.println("Wq = " + testMM1.calculate_Wq());


        MM1K testMM1K = new MM1K(3);
        testMM1K.lambda= 3;
        testMM1K.mu=4;
        System.out.println("***** M|M|1|K *****");
        System.out.println("RHO = " + testMM1K.calculate_rho());
        System.out.println("q0 = " + testMM1K.calculate_q0());
        System.out.println("L = " + testMM1K.calculate_L());
        System.out.println("Lq = " + testMM1K.calculate_Lq());
        System.out.println("q3 = " + testMM1K.calculate_qj(3));

        MMS testMMS = new MMS(2);
        testMMS.lambda= 10;
        testMMS.mu=12;
        System.out.println("***** M|M|S *****");
        System.out.println("RHO = " + testMMS.calculate_rho());
        System.out.println("q0 = " + testMMS.calculate_q0());
        System.out.println("L = " + testMMS.calculate_L());
        System.out.println("Lq = " + testMMS.calculate_Lq());
        System.out.println("W = " + testMMS.calculate_W());
        System.out.println("Wq = " + testMMS.calculate_Wq());

    }
}
