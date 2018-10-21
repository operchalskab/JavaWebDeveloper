public class operatobitowy {
    public static void main(String[] args) {
// & - iloczy bitowy
//     | - suma bitowa
//        1 1 -> 1
//        0 0 -> 0
//        ^ - XOR (eXclussive OR)
//        1 1 -> 0
//        ~ - negacja bitowa
//        00110101
//        11001010

//        >> przesuniecie w prawo
//        << przesuniecie w lewo

        System.out.printf("%10s\n", Integer.toBinaryString(5));
        System.out.printf("%10s\n", Integer.toBinaryString(5 >> 3));

        System.out.println("negacja 5:" + (~5));

        int a = 5;
        int b = 6;
//        int c = a & b;

//        System.out.printf("%10s\n", Integer.toBinaryString(a));
//        System.out.printf("%10s\n", Integer.toBinaryString(b));
//        System.out.println("-----------------");
//        System.out.printf("%10s\n", Integer.toBinaryString(c));
//        System.out.println(c);

        int c = calculate(a, b);
        show(a,b,c);
    }

    static void show(int a, int b, int c){
        System.out.println("operacja: " + a + " & " + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("-----------------");
        System.out.printf("%10s\n", Integer.toBinaryString(c));
        System.out.println(c);
    }

    static int calculate (int a, int b){
        return a ^ b;
    }
}
