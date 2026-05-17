public class CumulativeSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int passengers = (int)(Math.random() * 10) + 1;
            sum = sum + passengers;
            System.out.println("Passengers on bus " + i + ": " + passengers);
        }
        System.out.println("Total passengers: " + sum);
    }
}