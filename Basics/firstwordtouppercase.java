public class firstwordtouppercase {
    public static String toupper(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1) == ' ' && i<str.length()-1){
                char ch2 = Character.toUpperCase(str.charAt(i));
                sb.append(ch2);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        String st = sb.toString();
        return st;

    }
    public static void main(String[] args) {
        String str = "hello my name is chinmay verma";
        String ans = toupper(str);
        System.out.println(ans);
    }
}
