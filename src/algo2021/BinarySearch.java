/**
 * from princeton COS226 - static binary search method, non-recursive
 */
package algo2021;

import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class BinarySearch {
    private BinarySearch() { }  // prevent instantiation

    /**
     * Returns the index of the specified key in the specified aray.
     *
     * @param a the array of integers, must be sorted in ascending order
     * @param key the search key
     * @retun index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) throws java.io.FileNotFoundException{
        ArrayList<Integer> ia = new ArrayList<Integer>();
        String inputFile = "algo2021/resources/integer_list.txt";
        int searchKey = 32;

        if (args.length>0) {
            searchKey = Integer.parseInt(args[0]);
        }
        if (args.length>1) {
            inputFile = args[1];
        }

        File inFile = new File(inputFile);
        Scanner inFileScanner = new Scanner(inFile);

        while (inFileScanner.hasNextInt()) {
            int num = inFileScanner.nextInt();
            ia.add(num);
        }
        Object[] ia2 = ia.toArray();
        int[] ia3 = new int[ia2.length];
        for (int i=0 ; i<ia.size(); i++) {
            ia3[i] = (int) ia2[i];
        }
        System.out.println("b4 sort - int array: ");
        for (int i=0; i<ia3.length;i++) {
            System.out.print(ia3[i] + " ");
        }
        Arrays.sort(ia3);
        System.out.println("int array: ");
        for (int i=0; i<ia3.length;i++) {
            System.out.print(ia3[i] + " ");
        }
        System.out.println();

        System.out.printf("Searching for: %d - index: %d", searchKey, BinarySearch.indexOf(ia3, searchKey));
    }
}
