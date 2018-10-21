import java.util.StringTokenizer;

public class ZmianaDaty {
    public static void main(String[] args) {
        StringTokenizer st1;

        String quote1 = "29/04/2009";
        st1 = new StringTokenizer(quote1,"/");

        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc : " + st1.nextToken());
        System.out.println("Rok : " + st1.nextToken());
    }
}