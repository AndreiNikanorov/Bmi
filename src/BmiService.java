public class BmiService {
    public double calculate(double w, double h) {
        double x = Math.pow(h, 2);
        double result = w / x;
        return result;
    }
}
