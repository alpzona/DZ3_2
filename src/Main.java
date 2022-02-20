public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(91.2f, 1.8f);
        System.out.println("Ваш индекс массы тела = " + bmi + " кг/м2");
    }
}
