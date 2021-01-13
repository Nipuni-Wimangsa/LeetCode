class Solution {
    public int reverse(int x) {
        String s = ""; //get the reversed number as a string
        char[] characters = String.valueOf(x).toCharArray();
        int reversedInteger;

        for(int i = characters.length - 1; i >= 0 ; i--) {
            s += characters[i];
        }

        if(x < 0) {
            s = s.substring(0,s.length()-1); //since the negative sign is also included in the end.
            reversedInteger = Integer.parseInt(s) * -1;
        }
        else
            reversedInteger = Integer.parseInt(s);


        if(reversedInteger < Math.pow(-2,31) || reversedInteger > (Math.pow(2,31) - 1)) //To detect the overflows and underflows.
            return 0;

        return reversedInteger;
    }
}
