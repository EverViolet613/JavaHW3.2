public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {

        return (int) (weightInKg / heightInMeters / heightInMeters);
    }

}
