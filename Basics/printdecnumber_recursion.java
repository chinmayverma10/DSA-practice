public class printdecnumber_recursion {
    public static void Decorder(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Decorder(n-1);        
    }
    public static void main(String[] args) {
        Decorder(10);
    }
}
