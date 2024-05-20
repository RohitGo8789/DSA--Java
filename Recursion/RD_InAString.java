public class RD_InAString {
    public static void RD(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            RD(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            RD(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        int idx = 0;
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        RD(str, idx, newStr, map);
    }
}
