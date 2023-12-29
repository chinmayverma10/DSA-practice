public class but_sell_stocks {
    public static int max_profit(int arr[]) {
        int max_value = arr[1];
        int pos =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value = arr[i];
                pos = i;
            }
        }
        int min_value = Integer.MIN_VALUE;
        for(int i=0;i<pos;i++){
            min_value = Math.min(min_value, arr[i]);
        }
        if(min_value==Integer.MIN_VALUE){
            return 0;
        }
        return max_value - min_value;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,5,4,3,2,1};
        int ans = max_profit(prices);
        System.out.println(ans);
    }
}
