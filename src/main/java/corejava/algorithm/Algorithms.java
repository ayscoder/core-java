package corejava.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Have possible algorithms for Java Interview
 * 
 * @author ayush Dec 23, 2017
 */
public class Algorithms {

	public Algorithms() {
	}

	public static void printAllSubArray() {

		int[] arr = new int[] { 1, 2, 3, 4 };

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println("");
			}
		}
	}

	/*
	 * 1. Get the sum of numbers total = n*(n+1)/2 2. Subtract all the numbers
	 * from sum and you will get the missing number.
	 */
	public static void printMissingNumber() {

		int[] a = new int[] { 1, 2, 4 };
		int n = a.length;
		int t = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < a.length; i++) {
			t -= a[i];
		}
		System.out.println("Missing no=" + t);

	}

	/**
	 * Method 2 (Use temporary array) K largest elements from arr[0..n-1]
	 * 
	 * 1) Store the first k elements in a temporary array temp[0..k-1]. 
	 * 2) Find the smallest element in temp[], let the smallest element be min. 
	 * 3) For each element x in arr[k] to arr[n-1] If x is greater than the min then
	 * remove min from temp[] and insert x. 4) 
	 * Print final k elements of temp[]
	 */
	public static void topK(int k) {
		int[] a = { 1, 2, 3};
		List<Integer> t=new ArrayList<>();
		for (int i = 0; i < k; i++) {
			 t.add(a[i]);
		}
		for(int i=k;i<a.length;i++){
			//find smallest in t
			int index=findMinIndex(t);
			int min=t.get(index);
			if(a[i]>min){
				t.remove(index);
				t.add(a[i]);
			}
		}
		System.out.println(t);
	}
	
	private static int findMinIndex(List<Integer> a){
		int min=0;
		for(int i=0;i<a.size();i++){
			if(a.get(i)<min){
				min=i;
			}
		}
		return min;
	}

	public static void removeDup() {
		int[] a = new int[] { 1, 2, 2, 3, 3, 4 };
		int t = a[0];
		for (int i = 1; i < a.length; i++) {
			if (t == a[i]) {
				a[i] = 0;
			} else {
				t = a[i];
			}
		}

		// print array
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

	public static void findPairWhoseSumIsK(int[] arr, int k) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == k) {
				System.out.println("[" + arr[i] + "," + arr[j] + "]");
				i++;
				j--;
			} else if (arr[i] + arr[j] < k) {
				i++;
			} else {
				j--;
			}
		}
	}

	public static boolean findTripletWhoseSumIsK(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] == n) {
					System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
					j++;
					k--;
				} else if (arr[i] + arr[j] + arr[k] < n) {
					j++;
				} else {
					k--;
				}
			}
		}
		return false;
	}

	public static void isPrime(int n) {
		boolean b = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Not PRIME");
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("PRIME");
		}
	}

	public static void reverseString(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
			chars[i] = (char) ((int) chars[i] + (int) chars[j]);
			chars[j] = (char) ((int) chars[i] - (int) chars[j]);
			chars[i] = (char) ((int) chars[i] - (int) chars[j]);
		}
		String string = new String(chars);
		System.out.println(string);
	}

	public static void checkAnagram(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		if (str1.length() != str2.length()) {
			System.out.println("NOT ANAGRAM");
			return;
		}
		int s1 = 0, s2 = 0;
		for (int i = 0; i < c1.length; i++) {
			s1 += (int) c1[i];
			s2 += (int) c2[i];
		}
		if (s1 == s2) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGRAM");
		}
	}

	public static void frequencyKeeper(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		System.out.println(map);
	}

	public static void printFibonacci(int times) {
		int p = 1;
		int c = 1;
		int n = 2;
		System.out.print(p + " " + c + " ");
		while (n <= times - 1) {
			int next = p + c;
			p = c;
			c = next;
			System.out.print(next + " ");
			n++;
		}
	}

	public static void factorial(int n) {
		int r = 1;
		while (n != 0) {
			r *= n;
			n--;
		}
		System.out.println(r);
	}

	public static void top2(int[] arr) {
		int h1 = 0;
		int h2 = 0;
		for (int n : arr) {
			if (n > h1) {
				h2 = h1;
				h1 = n;
			} else if (n > h2) {
				h2 = n;
			}
		}
		System.out.println("H1=" + h1);
		System.out.println("H2=" + h2);
	}

	public static int binarySearch(int[] a, int searchItem) {
		int mid = 0;
		int startIndex = 0;
		int endIndex = a.length - 1;

		while (startIndex <= endIndex) {
			mid = (startIndex + endIndex) / 2;
			if (searchItem < a[mid]) {
				endIndex = mid - 1;
			} else if (searchItem > a[mid]) {
				startIndex = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/*
	 * 1) Store the first k elements in a temporary array temp[0..k-1]. 2) Find
	 * the smallest element in temp[], let the smallest element be min. 3) For
	 * each element x in arr[k] to arr[n-1] If x is greater than the min then
	 * remove min from temp[] and insert x. 4) Print final k elements of temp[]
	 */
	public static void findTopK() {
		int k = 3;
		int[] arr = new int[] { 1, 23, 12, 9, 30, 2, 50 };
		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		int min = 1;

		for (int i = k; i < arr.length - 1; i++) {
			if (arr[i] > min) {

			}
		}

	}

	public static void main(String[] args) {
		// printAllSubArray();
		// removeDup();
		// printMissingNumber();
		// findPairWhoseSumIsK(new int[] { 2, 3, 4, 1 }, 5);
		// findTripletWhoseSumIsK(new int[] { 1, 7, 1, 3, 4, 2, 5 }, 9);
		// isPrime(7);
		// reverseString("AYUSH");
		// checkAnagram("ASD", "DSw");
		// frequencyKeeper(new int[] { 1, 1, 2, 2, 2, 4, 5, 6, 6, 6, 7, 8 });
		// printFibonacci(5);
		// factorial(5);
		// top2(new int[] { 1, 2, 3, 4 });
		// selectionSort(new int[] { 3, 2, 1 });
//		printAllSubArray();
//		topK(2);
		printMissingNumber();
	}


}
