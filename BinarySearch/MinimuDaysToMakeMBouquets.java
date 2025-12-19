
//This is a Brute-Force Approach
public class MinimuDaysToMakeMBouquets {
    public static boolean FlowerValid(int[] arr,int m,int k,int days){
        int bouquets=0;
        int flowers=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            }else{
                flowers=0;
            }
        }
        return bouquets>=m;
        
    }  
    public static int Bouqets(int[] arr,int m,int k){
        for(int i=1;i<=MaxElement(arr);i++){
            if(FlowerValid(arr, m, k, i)){
                return i;
            }
        }
        return -1;
    }

    public static int MaxElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={7,7,7,7,12,7,7};
        int m=2;
        int k=3;
        int l=Bouqets(arr, m, k);
        System.out.println(l);
    }
}
