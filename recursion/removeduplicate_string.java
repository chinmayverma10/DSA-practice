public class removeduplicate_string {
    public static void removeduplicate(String str,StringBuilder newstr,int idx,boolean arr[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        if(arr[str.charAt(idx)-'a'] == true){
            removeduplicate(str, newstr, ++idx, arr);
        }else{
            arr[str.charAt(idx)-'a'] = true;
            removeduplicate(str, newstr.append(str.charAt(idx)), ++idx, arr);
        }
    }
    public static void main(String[] args) {
        removeduplicate("apnacollege", new StringBuilder(""), 0, new boolean[26]);
    }
}
