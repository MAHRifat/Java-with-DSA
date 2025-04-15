package Array;

public class buy_sell_stock {
    public static void main(String[] args) {
        int prices[] = {9,1,4,9,0};
        // int prices[] = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        int profit = 0;
        int max_profit = 0;

        for(int i=1;i<prices.length;i++){
            buyPrice = Math.min(buyPrice, prices[i-1]);
            sellPrice = prices[i];
            profit = sellPrice - buyPrice;
            if(profit < 0){
                continue;
            }
            max_profit = Math.max(max_profit, profit);
        }


        System.out.println(max_profit);
    }
}
