public class BmiService {
    public double calculate (double mass, double height) {
        double i = height * height;
        double index = mass / i;
        return index;
    }
}
