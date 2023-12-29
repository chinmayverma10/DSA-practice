public class bitman_evenodd {
    public static void evenorodd(int n) {
        if((n & 1) == 1){
            System.out.println("ODD");
        }
        else if((n & 1)== 0){
            System.out.println("EVEN");
        }
    }
    public static void main(String[] args) {
        evenorodd(5);
        evenorodd(10);
    }
}
