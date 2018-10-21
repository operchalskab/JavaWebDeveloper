public class Casting {
    public static void main(String[] args) {

        double d= 4.45;
        short s = 8;
        int i;

        i = (int)d;
        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;

        veep = (VicePresident) emp;

        Float f1 = 2.23F;
        Float f2 = (Float)(float)6.34F; // - tutaj może być też Float f2=6.34F - tutaj nie trzeba sie bawić w tą konwerscje, albo razej unboxing.

        Integer obj =null;

        System.out.println(Math.min(f1,f2));

        //Integer ii = new Integer; //tak nie trzeba robić, bo klasa Integer jest TĄ wyjątkowa, wystarczy zapicać Integer ii = 3;
    }
}

class Employee{}
class VicePresident extends Employee{}