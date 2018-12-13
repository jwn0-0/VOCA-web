package VOCA;



public class edit {
   public static int M[][] = new int[100][100];

   public static int getMin(int a, int b, int c) {
      int min = a;
      if (min > b)
         min = b;
      if (min > c)
         min = c;
      return min;
   }

   public static int getDistance (String a, String b) {
       for (int i = 0; i < a.length(); i++) {
         M[i][0] = i;
      }
      for (int j = 0; j < b.length(); j++) {
         M[0][j] = j;
      }
      for (int i = 1; i < a.length(); i++) {
         for (int j = 1; j < b.length(); j++) {
            if (a.charAt(i) == b.charAt(j)) {
               M[i][j] = M[i - 1][j - 1];
            } else {
               M[i][j] = getMin(M[i - 1][j], M[i - 1][j - 1], M[i][j - 1]) + 1;
            }
         }
      }
      return M[a.length()-1][b.length()-1];
   }

   public static void main(String[] args) {
      
   }
}
