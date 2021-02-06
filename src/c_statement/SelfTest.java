package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("질문~(Y/N)");
		String answer = s.nextLine();
		if(answer.equals("Y")) count++;
		
		System.out.print("질문~(Y/N)");
		answer = s.nextLine();
		if(answer.equals("Y")) count++;
		
		System.out.print("질문~(Y/N)");
		answer = s.nextLine();
		if(answer.equals("Y")) count++;
		
		if(count <= 3){
			System.out.println("결과");
		}else if(4 <= count && count <= 7){
			
		}else{
			
		}
	}

}











