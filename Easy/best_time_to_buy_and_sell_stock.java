package Easy;

import java.util.*;

public class best_time_to_buy_and_sell_stock {
    public static int buyandsell(int prices[]) {
        int n = prices.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0, profit = 0;
        for (int i = 0; i < n; i++) {
            if (buyprice < prices[i]) {
                profit = prices[i] - maxprofit;
                if (profit > maxprofit)
                    maxprofit = profit;
            } else
                buyprice = prices[i];
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter the days for stocks calculation");
        n = in.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        System.out.println("Max. profit from stocks is " + buyandsell(prices));
        in.close();
    }
}