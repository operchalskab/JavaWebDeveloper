public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja";
        opportunity.speed = 5;
        opportunity.temperature = -80;

        opportunity.showAttributes();
        System.out.println("zwiększamy prędkość do 6.");
        opportunity.speed = 6;
        opportunity.showAttributes();
        System.out.println("zmiana tempratury na -90.");
        opportunity.temperature = -90;
        opportunity.showAttributes();
        System.out.println("sprawdzenie temperatury");
        opportunity.checkTemperature();
        opportunity.showAttributes();




    }
}
