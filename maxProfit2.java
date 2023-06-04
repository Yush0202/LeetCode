class maxProfit2 {
    public int maxProfit(int[] prices) {
      int l=prices.length;
      int maxProfit = 0;
    
      for(int i=0; i<l-1; i++) {
        for(int j=i+1; j<l; j++) {
          int diff = prices[j] - prices[i];
          if (diff > maxProfit) {
            maxProfit = diff;
          }
        }
      }
      
      return maxProfit;
    }
    
    }