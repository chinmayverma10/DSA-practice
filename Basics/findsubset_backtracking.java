public class findsubset_backtracking {
    public static void subset(String str,String ans,int index) {
        if(index == str.length()){
            System.out.print(ans+" ");
            return;
        }
        //YES
        subset(str, ans+str.charAt(index), index+1);
        //NO
        subset(str, ans, index+1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        subset(str, " ", 0);
    }
}
