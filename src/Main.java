public class Main {
    public static void main(String[] args) {
        int [] first = new int[] {1,2,3};
        float [] second = new float[] {1.57f, 7.654f, 9.986f} ;
        int[] third = {2, 6, 10, 15};
        //System.out.println(first.length);
        for (int i = 0; i < first.length; i++) {
          if (i == first.length - 1) {
                System.out.print(first[i]); }
            else {
                System.out.print(first[i] + ", ");
        }}
        System.out.println();
            for (int a = 0; a < second.length; a++) {
          if (a == second.length - 1) {
                System.out.print(second[a]); }
            else {
              System.out.print(second[a] + ", ");
          }}
              System.out.println();
            for (int b = 0; b < third.length; b++) {
          if (b == third.length - 1) {
                System.out.print(third[b]); }
            else {
                System.out.print(third[b] + ", ");
           }}}}