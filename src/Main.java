public class Main {
    public static void main(String[] args) {
        int a[] = {4,4,6,11,-2,3};
        int b[] = {5,11,11,-3,3,5};
        int symDiff[] = new int [a.length + b.length];
        int count = 0;

        for (int i=0;i<=a.length-1;i++) {
            int sim = 0;
            for (int j = b.length-1; j >=0; j--) {
                if (a[i] != b[j]) {
                    sim++;
                }
            }
            if (sim==b.length) {
                symDiff[count] = a[i];
                count++;
            }
        }

        for (int i=0;i<=b.length-1;i++) {
            int sim = 0;
            for (int j = a.length-1; j >=0; j--) {
                if (b[i] != a[j]) {
                    sim++;
                }
            }
            if (sim==a.length) {
                symDiff[count] = b[i];
                count++;
            }
        }

        System.out.print("sym diff: ");

        for (int i=0;i<symDiff.length;i++)
            if (symDiff[i] != 0) {
                System.out.print(symDiff[i] + " ");
            }
    }
}