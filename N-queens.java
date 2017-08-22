import java.util.*;

public class Solution {
	/*public void backtracking(List<List<Integer>> result, int k,int n){
        List<Integer> com=new ArrayList<>();
        sumUp(result,com,k,1,n);
    }
    public void sumUp(List<List<Integer>> result,List<Integer> com,int k,int start,int n){
        if(com.size() == k && n == 0){
            ArrayList<Integer> li=new ArrayList<>(com);
            result.add(li);
            return ;
        }
        for(int i=start;i<=9;i++){
            com.add(i);
            sumUp(result,com,k,i+1,n-i);
            com.remove(com.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> result=new ArrayList<>();
       backtracking(result,k,n);
       return result;
    }*/
	public boolean is_attacked(int i,int j,int[][] checkboard) {
		for(int coloum=0;coloum<checkboard[0].length;coloum++) {
			if(checkboard[i][coloum] == 1) {
				return true;
			}
		}
		for(int row=0;row< checkboard.length;row++) {
			if(checkboard[row][j] == 1) {
				return true;
			}
		}
		for(int row=0;row<checkboard.length;row++) {
			for(int coloum=0;coloum<checkboard[0].length;coloum++) {
				if(checkboard[row][coloum] == 1 && (row+coloum) == (i+j)) {
					return true;
				}else if(checkboard[row][coloum] == 1 && (row-coloum) == (i-j)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean queens(int[][] checkboard,int N){
		if(N == 0) {
			return true;
		}
		for(int i=0;i<checkboard.length;i++) {
			for(int j=0;j<checkboard.length;j++) {
				if(is_attacked(i,j,checkboard)) {
					continue;
				}
				checkboard[i][j] = 1;
				if(queens(checkboard,N-1)) {
					return true;
				}
				checkboard[i][j]=0;
			}
		}
		return false;
	}
    public static void main(String args[]) {
    		/*Solution test=new Solution();
    		List<List<Integer>> result=test.combinationSum3(3, 7);
    		for(int i=0;i<result.size();i++) {
    			System.out.println(result.get(i));
    		}*/
    		int[][] checkboard=new int[8][8];
    		Solution test=new Solution();
    		test.queens(checkboard,8);
    		for(int i=0;i<checkboard.length;i++) {
    			for(int j=0;j<checkboard.length;j++) {
    				System.out.print(checkboard[i][j]+" ");
    			}
    			System.out.println();
    		}
    }
}