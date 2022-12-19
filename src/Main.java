public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();
        int weight = 100;
        float height = 1.7F;
        float bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + bmi  );

    }
}