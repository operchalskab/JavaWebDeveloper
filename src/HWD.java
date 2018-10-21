import java.awt.*;

public class HWD {
    public static void main(String[] args) {

        W punkt = new W();
        punkt.d = 8;
        punkt.h = 9;
        punkt.w = 9;

        System.out.println("Wysokość: " + punkt.d);
        System.out.println("Szerokość: " + punkt.h);
        System.out.println("Głębokość: " + punkt.w);
    }

}
class W{
    int h, w, d;
}

