public class WitchNumberIsLarger {
    public static void main(String[] args) {
        int i = 1, j = 4, k = 3;
        if (i < j || i < k) {
            if (j < k) {
                int n = k;
                System.out.println(k + " is larger then " + i + " and " + j);
            } else {
                int n = j;
                System.out.println(j + " is larger then " + i + " and " + k);
            }
        } else {
            int n = i;
            System.out.println(i + " is larger then " + j + " and " + k);
        }
    }
}
