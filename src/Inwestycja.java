public class Inwestycja {
    public static void main(String[] args) {

        int inw = 14000;
        System.out.println("Ile zainwestowano: " + inw);

        double opr1 = 1.4;

        System.out.println("Po roku: " + inw * opr1);

        int strata = 1500;
        double inw2 = inw * opr1 - strata;
        System.out.println("Po drugim roku: " + inw2);

        double opr2 = 1.12;
        double inw3 = inw2*opr2;
        System.out.printf("Po trzecim roku: %.2f",inw3);
    }
}
