package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int one = number % 10;
        int two = (number / 10) % 10;
        int three = (number / 100) % 10;
        int four = (number / 1000) % 10;
        int sum = one + two + three + four;
        System.out.println(sum);
    }
}
