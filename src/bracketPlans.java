

import java.util.ArrayList;

public class bracketPlans {

    public static void main(String[] args){
        System.out.println(bracketCheck("()"));
    }

    public static boolean bracketCheck(String str){
        boolean flag = false;

        ArrayList<String> start = new ArrayList<String>();
        ArrayList<String> end = new ArrayList<String>();


        // iterate through the array.
        for(int i =0; i <str.length()/2; i++){
            if(str.charAt(i)==(str.charAt(str.length()-1-i))){
                flag=true;
            };
        }


        return flag;

    }
}
