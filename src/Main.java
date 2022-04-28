public class Main {
    public static void main(String[] args) {
        int [] first = new int[] {1,2,3};
        float [] second = new float[] {1.57f, 7.654f, 9.986f} ;
        int[] third = {2, 6, 10, 15};
        //System.out.println(first.length);
        for (int i = 0; i < first.length; i++) {
          if (i == first.length) {
              if (first[i]%2 == 0) {
                System.out.print(first[i]); }
                    else {
                first[i] = first[i] + 1;
                  System.out.print(first[i]);
              } }else { if (first[i]%2 == 0) {
                System.out.print(first[i] + ", ");}
                    else {
                        first [i] = first [i] + 1;
                  System.out.print(first[i] + ", ");
              }}
        }}
        }