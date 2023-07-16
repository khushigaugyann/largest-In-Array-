public class LargestinAarry {
    static int max(int a[]) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return (m);
    }

    public static void main(String[] args) {
        int[] x = new int[] { 5, 3, 2, 6, 1 };
        System.out.println(max(x));
    }
}
