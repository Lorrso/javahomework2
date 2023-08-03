public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mbi = (int) service.calculate(1.87, 98);
        System.out.println(mbi);
    }
}