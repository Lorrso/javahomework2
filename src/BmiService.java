public class BmiService {
    public int calculate(double m, double kg) {
        double result = (kg / (m * m));
        int bmi = (int) result;
        return bmi;
    }
}
