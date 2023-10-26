import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

        //First Requirement
        static int[] insertAt(int[] ar,int element, int pos){
            int[] ret = new int[ar.length];
        if(pos < 0 || pos >= ar.length){
            System.out.println("Out of range");
        }
        else {
//        ret = ar;
            ret = Arrays.copyOf(ar, ar.length + 1);
            for (int i = 0; i < ret.length; i++) {
                if (i == pos) {
                    for (int j = ret.length - 1; j > pos; j--) {
                        int temp = ret[j];
                        ret[j] = ret[j - 1];
                        ret[j - 1] = temp;
                    }
                    ret[pos] = element;
                }
            }
        }
            return ret;
    }

    static ArrayList<Integer> findPrimes(int[] ar){
            ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int k : ar) {
            boolean flag = true;
            for (int j = 2; j <= k / j; j++) {
                if (k % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && k > 1)
                ret.add(k);
        }
        return ret;
    }

    static ArrayList<Integer> factors(int x){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if(x % i == 0) {
                ret.add(i);
                ret.add(i % 2);
            }
        }
        return ret;
    }
    static ArrayList<ArrayList<Integer>> getFactors(int[] ar){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        for (int j : ar) {
            ret.add(factors(j));
        }
        return ret;
    }
    public static void main(String[] args) {
            // Testing First Requirement

//        Scanner cin = new Scanner(System.in);
//        System.out.println("Pleas enter the length of the array");
//        int n,e,p;
//        n = cin.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Pleas enter the array elements");
//        for (int i = 0; i < n; i++) {
//            int elem = cin.nextInt();
//            arr[i] = elem;
//        }
//        System.out.println("Please enter the Element u wanna insert and a valid position");
//        e = cin.nextInt();
//        p = cin.nextInt();
//        int[] afterInsert = insertAt(arr,e,p);
//        for (int j : afterInsert) {
//            System.out.print(j + " ");
//        }

            // Testing Second Requirement

//        Scanner cin = new Scanner(System.in);
//        System.out.println("Please enter the size of the array");
//        int n = cin.nextInt();
//        int[] ar = new int[n];
//        System.out.println("Please enter the array elements");
//        for (int i = 0; i < n; i++) {
//            int elem = cin.nextInt();
//            ar[i] = elem;
//        }
//        ArrayList <Integer> primes = new ArrayList<>();
//        primes = findPrimes(ar);
//        System.out.println("The prime number in the array is");
//        for (int i: primes) {
//            System.out.print(i + " ");
//        }

        Scanner cin = new Scanner(System.in);
        System.out.println("Pleas Enter the size ot the array");
        int n = cin.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter The Arrays elements");
        for (int i = 0; i < n; i++) {
            int elem = cin.nextInt();
            arr[i] = elem;
        }
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al = getFactors(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(al.get(i));
        }
    }
}