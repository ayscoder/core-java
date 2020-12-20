package corejava.algorithm;

import java.util.Arrays;

/**
 * @author user created on 26/10/2020
 */
public class ArraysAlgorithms {

    /**
     * The complexity of this solution would be O(NlogN) due to sorting.
     */
    public static void print_pair_whose_sum_is_given_k(int[] a, int k) {
        Arrays.sort(a);
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == k) {
                System.out.println("(" + a[left] + "," + a[right] + ") ");
                left++;
                right--;
            }
            else if (sum < k) {
                left++;
            }
            else {
                right--;
            }
        }
    }

    public static void find_largest_smallest_in_unsorted_array(int[] a) {
        int smallest = a[0];
        int largest = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
            else if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Smallest:" + smallest);
        System.out.println("Largest:" + largest);
    }

    public static void main(String[] args) {
        //print_pair_whose_sum_is_given_k(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
        find_largest_smallest_in_unsorted_array(new int[] { 2, 4, 7, 5, 9, 10, -1 });
    }
}
