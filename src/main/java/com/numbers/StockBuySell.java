package com.numbers;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
    private int buy;
    private int sell;

    private static void stockBuySell(int[] price, int n) {
        List<StockBuySell> sol = new ArrayList<>();
        int count = 0;
        int i=0;

        while(i < n-1) {
            StockBuySell stock = new StockBuySell();
            while ((i < n) && (price[i] >= price[i + 1])){
                i++;
            }
            stock.buy = i++;

            while ((i < n) && (price[i] >= price[i - 1])) {
                i++;
            }
            stock.sell = i - 1;

            sol.add(stock);
            count++;
        }

        if (count == 0) {
            System.out.println("There is no day when buying the stock will make profit");

        } else {
            sol.forEach(stock -> System.out.println("Buy on day: " + stock.buy + " " + "Sell on day : " + stock.sell));
        }
    }

    public static void main(String args[]) {
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        stockBuySell(price, price.length);
    }
}