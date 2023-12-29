public class string_palindrome {
    public static String palindrome(String str) {
        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                continue;
            }
            else{
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        String str = "moon";
        String ans = palindrome(str);
        System.out.println(ans);
    }
}
