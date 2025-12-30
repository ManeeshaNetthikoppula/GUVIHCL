import java.util.Scanner;

public class SurfaceAreaandVolumeofcuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        sc.close();

        int surfaceArea = 2 * (L * B + B * H + H * L);
        int volume = L * B * H;

        System.out.print(surfaceArea + " " + volume);
    }
}
