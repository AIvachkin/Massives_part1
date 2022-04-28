public class Main {
    public static void main(String[] args) {
        int [] first = new int[] {1,2,3};
        float [] second = new float[] {1.57f, 7.654f, 9.986f} ;
        int[] third = {2, 6, 10, 15};
        //System.out.println(first.length);
        for (int i = first.length - 1; i >= 0; i--) {
          if (i == 0) {
                System.out.print(first[i]); }
            else {
                System.out.print(first[i] + ", ");
        }}
        System.out.println();
            for (int a = second.length - 1; a >= 0; a--) {
          if (a == 0) {
                System.out.print(second[a]); }
            else {
              System.out.print(second[a] + ", ");
          }}
              System.out.println();
            for (int b = third.length - 1; b >= 0 ; b--) {
          if (b == 0) {
                System.out.print(third[b]); }
            else {
                System.out.print(third[b] + ", ");
           }}}}