import java.util.ArrayList;
import java.util.Arrays;

//import javax.management.openmbean.OpenDataException;

public class Hello {

    public static void changer(int n) {
        System.out.println("n came in as " + n);
        n++;
        System.out.println("n changed to " + n);
    }

    public static int[] nearestDiagOffBoard(int r, int c, int n, int r_dir, int c_dir) {

        while (r > 0 && r < n + 1 && c > 0 && c < n + 1) {
            r += r_dir;
            c += c_dir;
        }

        int[] diag_coords = { r, c };
        return diag_coords;
    }

    public static void main(String[] args) {
        String x = "Hello World!";
        System.out.println(x);
        String y = x;
        System.out.println(x + "   " + y);
        x = "Funkyfluff!";
        System.out.println(x + "   " + y);

        // HelloFumble hf = new HelloFumble();
        HelloFumble.zipZip();

        OneBlueHeron bh1 = OneBlueHeron.getInstance();
        bh1.switchStance();
        OneBlueHeron bh2 = OneBlueHeron.getInstance();
        bh2.switchStance();

        ArrayList<Integer> boog = new ArrayList<Integer>();
        ArrayList<Integer> boog2 = new ArrayList<>(Arrays.asList(1, 2));

        System.out.println(boog + " " + boog2);

        int n = 8;
        System.out.println("main n before changer " + n);
        changer(n);
        System.out.println("main n after changer " + n);

        int[][] dobule = { { 0, 1 }, { 9, 8 } };

        System.out.println(Arrays.deepToString(dobule));

        System.out.println(Arrays.toString(nearestDiagOffBoard(3, 1, 4, 1, 1)));
        System.out.println(Arrays.toString(nearestDiagOffBoard(1, 2, 4, 1, 1)));
        System.out.println(Arrays.toString(nearestDiagOffBoard(3, 1, 4, -1, 1)));
        System.out.println(Arrays.toString(nearestDiagOffBoard(3, 1, 4, -1, -1)));
        System.out.println(Arrays.toString(nearestDiagOffBoard(3, 1, 4, 1, -1)));

        int[][] obs = { { 1, 2 }, nearestDiagOffBoard(3, 1, 4, 1, 1) };

        System.out.println(Arrays.deepToString(obs));

        System.out.println(Math.abs(-999));

        int thee = 9;
        thee = Math.min(12, thee);
        System.out.println("thee " + thee);
        thee = Math.min(7, thee);
        System.out.println("thee " + thee);

        dobule[1][0] = Math.min(5, dobule[1][0]);
        System.out.println("dobule[1][0] " + dobule[1][0]);
        System.out.println("-dobule[1][0] " + -dobule[1][0]);

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }

        String[] muggles = { "Filch", "Vernon", "Dudley" };
        System.out.println(muggles);

    }
}