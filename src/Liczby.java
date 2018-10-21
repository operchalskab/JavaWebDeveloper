public class Liczby {
    public static void main(String[] args) {
        int i = 18;

        System.out.println("dziesiętny: " + i);

        System.out.println("binarny: " + Integer.toBinaryString(i));

        System.out.println("szesnatskowy: " + Integer.toHexString(i));

        System.out.println("ósemkowy: " + Integer.toOctalString(i));
    }
}
