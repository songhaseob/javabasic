package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 135
		 * 123 : 1S 1B 1O
		 * 345 : 1S 1B 1O
		 * 147 : 1S 0B 2O
		 * 
		 * 0 ~ 1.0미만
		 * 0 ~ 9.999999
		 * -1 ~ 8.9
		 */
		//숫자야구 게임을 만들어주세요.
		double a1 = (int)(Math.random() * 9) + 1;
		int a2;
		int a3;
		
		do{
			a2 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2);
		
		do{
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a3 || a2 == a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("3자리의 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : " + strike + "S " + ball + "B " + out +"O");
			System.out.println("----------------------------");
			if(strike == 3){
				System.out.println("정답입니다!!");
				break;
			}
		}
	}

}
