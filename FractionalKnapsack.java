import java.util.*;
public class FractionalKnapsack {
    public static double fractionalKnapsack(int W,int[] value,int[] weight){
        int n = value.length;
        double[][] items = new double[n][3];
        // items[i][0] = value
        // items[j][1] = weight
        // items[i][2] = ratio (value/weight)/
        for(int i = 0;i < n;i++){
            items[i][0] = value[i];
            items[i][1] = weight[i];
            items[i][2] = (double) value[i]/weight[i];
        }
        Arrays.sort(items,(a,b) ->Double.compare(b[2],a[2]));
        double totalValue = 0.0;
        for(int i = 0;i < n && W > 0; i++){
            if(items[i][1] <= W){
                totalValue += items[i][0];
                W -= items[i][1];
            }
            else{
                totalValue += items[i][2] * W;
                W = 0;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        System.out.println("Maximum value =" + fractionalKnapsack(W, value, weight));
    }
    
}
