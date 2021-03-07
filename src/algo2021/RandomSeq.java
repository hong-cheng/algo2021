package algo2021;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * Generate N random numbers between a high and low input
 * Usage: java RandomSeq 6 100.0 200.0
 */

public class RandomSeq {
    private RandomSeq() {}  // prevent instantiation

    public static void genSeq(int num, double lo, double hi) {
        System.out.printf("num: %d  lo: %7.2f  hi:%7.2f \n", num, lo, hi);

        DoubleStream ds = new Random().doubles(num, lo, hi);
        ds.forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: <howmany-to-gen> <low> <high>");
            System.exit(1);
        }

        int how_many = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        RandomSeq.genSeq(how_many, lo, hi);
    }
}
