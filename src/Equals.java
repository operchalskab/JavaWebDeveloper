import java.util.Objects;

public class Equals {
    public static void main(String[] args) {

        String str1, str2;
        str1 = new String("To jest jakiś tekst");
        str2 = new String("To jest jakiś tekst");
//        str1  = "To jest jakiś tekst";
//        str2 = " To jest jakiś tekst";

//        if (str1 == str2){
//            System.out.println("Równe!");
        System.out.println(str1);
        System.out.println(str2);

        if (str1.equals(str2)){
            System.out.println("równe!!");
        }
    A a = new A();
        B b = new B();

                if (a.equals(b)){
                    System.out.println("Równe są nasze klasy!!!");
                }
        }
    }

class A extends Object {} // to jest robione niejawnie czyli exten
class B {}