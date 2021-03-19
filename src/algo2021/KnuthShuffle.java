package algo2021;

public class KnuthShuffle {

    private KnuthShuffle() {}

    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i=0; i<n; i++) {
            int r = (int) (Math.random() * (i+1));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }

    public static void main(String[] args) {
        int sz = 10;
        String[] arrayStr = new String[sz];
        for (int i=0 ; i<sz; i++) {
            arrayStr[i] = Integer.toString(i);
        }
        System.out.println("b4: " + java.util.Arrays.toString(arrayStr));
        shuffle(arrayStr);
        System.out.println("af: " + java.util.Arrays.toString(arrayStr));
    }
}
