public class Main {
    public static void main(String[] args) {
        int a[] = {4,4,6,11,-2,3};
        int b[] = {5,11,11,-3,3,5};
        int symDiff[] = {0,0,0,0,0,0,0};
        int count = 0;

        for (int i=0;i<=5;i++) {
            int sim = 0;
            for (int j = 5; j >=0; j--) {
                if (a[i] != b[j]) {
                    sim++;
                }
            }
            if (sim==6) {
                symDiff[count] = a[i];
                count++;
            }
        }

        for (int i=0;i<=5;i++) {
            int sim = 0;
            for (int j = 5; j >=0; j--) {
                if (b[i] != a[j]) {
                    sim++;
                }
            }
            if (sim==6) {
                symDiff[count] = b[i];
                count++;
            }
        }

        System.out.print("sym diff: ");

        for (int i=0;i<symDiff.length;i++)
            System.out.print(symDiff[i] + " ");
    }
}