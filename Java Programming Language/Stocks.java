public class Stocks 
{
    public static int BuyandSellStocks(int prices[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(buyprice<prices[i])
            {
                int profit=(prices[i]-buyprice);//todays profit
                maxprofit=Math.max(maxprofit, profit); //global profit           
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String arg[])
    {
        int prices[]={7,1,5,3,6,4};
        System.out.println(BuyandSellStocks(prices));
    } 
    
}
