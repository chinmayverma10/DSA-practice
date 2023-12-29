public class bitman_operations {
    public static void getith(int n,int i) {
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            System.out.println(0);
        } else{
            System.out.println(1);
        }
        
    }

    public static void setith(int n,int i) {
        int bitmask = 1<<i;
        System.out.println(n | bitmask);
        return;
        
    }

    public static int clearith(int n,int i) {
        int bitmask = ~(1<<i);
        // System.out.println(n & bitmask);
        return (n & bitmask);   
    }
    public static void updatebit(int n,int i,int index) {
        if(i == 0){
            clearith(n, index);
        } else{
            setith(n, index);
        }
        return;
    }
    public static int clearibits(int n,int index) {
        int newbit = n;
        for(int i=0;i<=index;i++){
            newbit = clearith(newbit, i);
        }
        return newbit;
    }
    public static int rangebits(int n,int indexstart,int indexend) {
        int newbit = n;
        for(int i=indexstart;i<=indexend;i++){
            newbit = clearith(newbit, i);
        }
        return newbit;
    }
    public static void checkpoweroftwo(int n) {
        int z = n & (n-1);
        if(z == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        // getith(6, 0);
        // setith(6, 0);
        // clearith(7,0 );
        // updatebit(7, 0, 2);
        // int ans = clearibits(7, 1);
        // int ans = rangebits(2515,2,7);
        // System.out.println(ans);
        checkpoweroftwo(5);

    }
}
