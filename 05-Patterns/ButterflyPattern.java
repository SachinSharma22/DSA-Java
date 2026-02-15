public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
