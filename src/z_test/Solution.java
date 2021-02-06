package z_test;

import java.util.Arrays;


public class Solution {

	public static void main(String[] args) {
		int[] answer = new Solution().solution(new int[]{4,3,2,1});
		System.out.println(answer);
	}
	
	public int[] solution(int[] arr) {
		if(arr.length == 1){
			return new int[]{-1};
		}
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		int[] answer = new int[arr.length - 1];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != min){
				answer[index++] = arr[i];
			}
		}
		
		return answer;
	}

}





