package java_challenges;

public class MaximumProfit {
    public static void main(String[] args) {


        // day1      day2        day3        day4        day5        day6        day7

        int[] priceList = {7, 6, 5, 4, 3, 2, 1};

        int buyingPrice = priceList[0];
        int maxProfit = 0;

        for (int i = 1; i< priceList.length ; i++ ){

            if(buyingPrice>priceList[i]){
                buyingPrice = priceList[i];
            }

            if ((priceList[i] - buyingPrice > maxProfit)){
                maxProfit = priceList[i] - buyingPrice;
            }
        }

        System.out.println(maxProfit);


    }
}
