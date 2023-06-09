package Easy;

import java.util.*;

class pascals_triangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i, j;
        System.out.println("enter the length of pascal triangle");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if ((j == 1) || (j == i)) {
                    System.out.print("1 ");
                } else {
                    if ((i % 2 == 0) && (j != ((i / 2) + 1)))
                        System.out.print((i - 1) + " ");
                    else
                        System.out.print((i) + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
