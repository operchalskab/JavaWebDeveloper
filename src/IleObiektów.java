public class IleObiektów {

    public static void main(String[] args) {

        Ile c1 = new Ile();
        Ile c2 = new Ile();

        System.out.println("Stworzono " + Ile.counter +"obiektów.");

        Ile c3 = new Ile();
        Ile c4 = new Ile();
        Ile c5 = new Ile();

        System.out.println("Stworzono " + Ile.counter +"obiektów.");
    }
}
class Ile{
    static int counter;
    public Ile(){
        counter++;
        System.out.println("Tworzę nowy obiekt!");
    }
}
