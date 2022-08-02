public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 75;
        double height = 1.72;
        double index = service.calculate(mass, height);
        System.out.println("Body Mass Index = " + index);
    }
}
