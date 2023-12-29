public class printascnumber_recursion {
    public static void Ascorder(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        Ascorder(n-1);     
        System.out.println(n);
        return;

    }
    public static void main(String[] args) {
        Ascorder(10);
    }
}
