 
public class byet_number{
    // public static int addSum(int n){
    //     if(n%2!=0){
    //         n=n-1;
    //     }
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+addSum(n-2);
    // }
public int maxProfit(int[] prices) {
    int min=Integer.MAX_VALUE;
    int diff=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        if(min<prices[i]){
            int currdiff=prices[i]-min;
            if(diff<currdiff){
                diff=currdiff;
            }
        }
    }
    return diff;
}
}