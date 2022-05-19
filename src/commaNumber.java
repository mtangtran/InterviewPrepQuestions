/**
 * Interview question that I was asked by a recruiter. Ericsson.
 * Completed question with solution.
 * */

public class commaNumber {

    public static void main(String[] args) {
        System.out.println(commaInteger(12345678));

    }

    public static String commaInteger(int num){

        // Convert the string to an integer and maintain container strings.
        String commanumber = "";
        String reverse = "";
        String stringnum = Integer.toString(num);

        // Iterate through the string.
        for (int i = stringnum.length()-1; i >= 0; i-- ){

            // Every third character will receive a comma if it is not the first digit.
            if ((stringnum.length()-i)%3 == 0 && i != 0){

                commanumber = commanumber + stringnum.charAt(i);
                commanumber = commanumber + ",";
            }

            // Otherwise append the character to the string
            else {
                commanumber = commanumber + stringnum.charAt(i);
            }
        }
        // Reverse the string.
        reverse = reverseString(commanumber);

        // Return the string.
        return reverse;
    }

    // Reverse the string.
    public static String reverseString(String str){
        String anotherstr = "";

        for (int i = 0; i < str.length(); i ++) {
            anotherstr = anotherstr + str.charAt(str.length()-i-1);
        }

        return anotherstr;
    }
}
