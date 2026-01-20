public class IndexDiffMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 1; i <= N; i++) {
            int val = sc.nextInt();

            if (val < min) {
                min = val;
                minIndex = i;
            }

            if (val > max) {
                max = val;
                maxIndex = i;
            }
        }

        System.out.println(Math.abs(maxIndex - minIndex));
    }
    
}
