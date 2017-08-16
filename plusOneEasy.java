public class Solution {
	public int[] plusOne(int[] digits) {
		boolean carry=false;
        boolean finalCarry=false;
        if(digits[digits.length-1]+1 >= 10){
            digits[digits.length-1]=(digits[digits.length-1]+1) % 10;
            carry=true;
            if(digits.length == 1) {
            		finalCarry=true;
            }
        }else{
            digits[digits.length-1] = digits[digits.length-1]+1;
            return digits;
        }
        if(carry){
            for(int i=digits.length-2;i>=0;i--){
                if(digits[i] + 1 >= 10){
                    digits[i]=(digits[i]+1)%10;
                    if(i== 0 ){
                        finalCarry=true;
                    }
                }else{
                    digits[i]=digits[i]+1;
                    break;
                }
            }
        }
        if(finalCarry){
            int[] finalDigits=new int[digits.length+1];
            for(int i=digits.length-1;i>=0;i--){
                finalDigits[i+1]=digits[i];
            }
            finalDigits[0]=1;
            return finalDigits;
        }
        return digits;
    }
    public static void main(String args[]) {
    		int[] digits= {9,9};
    		Solution test=new Solution();
    		int[] result=test.plusOne(digits);
    		for(int i=0;i<result.length;i++) {
    			System.out.print(result[i]+",");
    		}
    }
}