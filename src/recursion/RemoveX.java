package recursion;

public class RemoveX {

    public static void main(String[] args) {

        String string="xxnxxxaxx";
        String output=removeX(string);
        System.out.println(output);
    }
    private static String removeX(String s){
        String ans="";
        if(s.length()==0){
            return s;
        }
        if(s.charAt(0)!='x'){
            ans=ans+s.charAt(0);
        }
       String Smallans=removeX(s.substring(1));

        return ans+Smallans;
    }
}
