package app;

public class Lesson6 {
    public static void main(String[] args) {

        int[] digits = new int[6];
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            digits[i-1] = i;
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);

        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}