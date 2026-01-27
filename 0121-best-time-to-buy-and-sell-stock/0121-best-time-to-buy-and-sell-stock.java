class Solution {
    public int maxProfit(int[] prices) {
        int buyp = Integer.MAX_VALUE;
        int maxprofit = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(buyp<prices[i]){
                int profit = prices[i]-buyp;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyp = prices[i];
            }
        }
        return maxprofit;
    }
}