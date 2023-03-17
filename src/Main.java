public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bodyMassIndex = service.calculate(weightInKg, heightInMeters);

        System.out.println("Ваш индекс массы тела:" + bodyMassIndex);

        System.out.println();
        System.out.println("50/1.6");
        System.out.println(service.calculate(50, 1.6));

        System.out.println();
        System.out.println("120/1.8");
        System.out.println(service.calculate(120, 1.8));

        System.out.println();
        System.out.println("80/1.76");
        System.out.println(service.calculate(80, 1.76));
    }
}