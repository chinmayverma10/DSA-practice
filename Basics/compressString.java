public class compressString {
    public static String compress(String str) {
        String str2 = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str2 += str.charAt(i);
            if(count>1){
                str2 += count.toString();
            }
        }
        return str2;
        
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String ans = compress(str);
        System.out.println(ans );
    }
}
