public class grid_ways {
    public static int ways(int N,int M){
        //Base case
        if(N==1 && M == 1){
            return 1;
        } else if(N == 0 || M == 0){
            return 0;
        }
        //Recursion
        return ways(N, M-1) + ways(N-1, M);
    }
    public static void main(String[] args) {
        int N = 4;
        int M = 5;
        System.out.println(ways(3, 3));
    }
}
