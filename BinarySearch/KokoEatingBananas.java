import java.util.*;
public class KokoEatingBananas {
    public static int EatingSpeed(int[] piles,int h){
        int low=1;
        int high=MaxElement(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(HoursNeeded(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static double HoursNeeded(int[] piles,int h){
        double total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/h);
        }
        return total;
    }
    public static int MaxElement(int[] piles){
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] piles={30,11,23,4,5};
        int h=5;
        int k=EatingSpeed(piles, h);
        System.out.println(k);
    }
}
