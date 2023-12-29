public class print_subset {
    public static void printstr(String str,int idx,String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);
        //Taking value at idx
        printstr(str, idx+1, newStr+ch);
        //Not taking Value at idx
        printstr(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "ab";
        printstr(str, 0, "");
    }
}
