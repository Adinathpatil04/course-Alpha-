public class stocks {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyStock(prices));
    }
    
    public static int buyStock(int price[]) {  // return type changed to int
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = price.length;  // fixed variable name

        for (int i = 0; i < n; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit; // now valid
    }
}

