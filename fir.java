import java.util.Scanner;

public class fir {
    public static void main(String[] args) {
        double sum = 0.0;

        if (args.length > 0) {
            for (String a : args) {
                try {
                    sum += Double.parseDouble(a);
                } catch (NumberFormatException e) {
                    System.err.println("Skipping non-number argument: " + a);
                }
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String token = scanner.next();
                try {
                    sum += Double.parseDouble(token);
                } catch (NumberFormatException e) {
                    // ignore non-numeric tokens
                }
            }
            scanner.close();
        }

        System.out.println(sum);
    }
}