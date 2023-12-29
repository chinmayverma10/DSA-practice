public class printnumber_increasingorder {
    public static void increasing(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        increasing(10);
        
    }
}
