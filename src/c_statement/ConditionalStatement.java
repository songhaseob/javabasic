package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할때 if 뒤에 추가한다.
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
		int a = 1;

		//정렬 : Ctrl + Shift + f
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가  false이면 수행되지 않는다.");
		}
		
		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 70;
		
		if(60 <= score){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		//성적에 등급을 부여하는 프로그램을 작성해주세요.
		score = 80;
		String grade = null;
		
		if(90 <= score && score <= 100){
			grade = "A";
		}else if(80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println(score + "점에 대한 등급은 " + grade + " 입니다.");
		
		score = 100;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else{
			grade = "F";
		}
		System.out.println(score + "점에 대한 등급은 " + grade + " 입니다.");
		
		/*
		 * switch문
		 * - switch(int/String){ case 1: break; }
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 4;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("a가 1,2,3이 아닌 경우에 하고싶은 것");
		}
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("그외의 경우에 하고싶은 것");
			break;
		}
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		score = 90;
		grade = null;
		switch(score / 10){
		case 9: case 10: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
		System.out.println(score + "점에 대한 등급는 " + grade + "입니다.");
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요>");
//		int num = Integer.parseInt(s.nextLine());
//		
//		if(num == 0){
//			System.out.println("0 입니다.");
//		}else{
//			System.out.println("0이 아닙니다.");
//		}
//		
//		switch(num){
//		case 0:
//			System.out.println("0입니다.");
//			break;
//		default:
//			System.out.println("0이 아닙니다.");
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
//		System.out.print("숫자를 입력해주세요>");
//		int num = Integer.parseInt(s.nextLine());
//		
//		if(num % 2 == 0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//		}
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
//		System.out.print("국어>");
//		int kor = Integer.parseInt(s.nextLine());
//		System.out.print("영어>");
//		int eng = Integer.parseInt(s.nextLine());
//		System.out.print("수학>");
//		int math = Integer.parseInt(s.nextLine());
//		
//		int sum = kor + eng + math;
//		double avg = sum / 3.0;
//		grade = null;
//		
//		if(90 <= avg){
//			grade = "A";
//			if(97 <= avg){
//				grade += "+";
//			}else if(avg <= 93){
//				grade += "-";
//			}
//		}else if(80 <= avg){
//			grade = "B";
//			if(87 <= avg){
//				grade += "+";
//			}else if(avg <= 83){
//				grade += "-";
//			}
//		}else if(70 <= avg){
//			grade = "C";
//			if(77 <= avg){
//				grade += "+";
//			}else if(avg <= 73){
//				grade += "-";
//			}
//		}else if(60 <= avg){
//			grade = "D";
//			if(67 <= avg){
//				grade += "+";
//			}else if(avg <= 63){
//				grade += "-";
//			}
//		}else{
//			grade = "F";
//		}
//		
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + avg);
//		System.out.println("등급 : " + grade);
		
		//숫자 3개를 입력받아 오름차순으로 출력해주세요.
		//a b c
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요>");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("두번째 숫자를 입력해주세요>");
		int y = Integer.parseInt(s.nextLine());
		System.out.print("세번째 숫자를 입력해주세요>");
		int z = Integer.parseInt(s.nextLine());
		
		if(x > y){
			int t = x;
			x = y;
			y = t;
		}
		
		if(x > z){
			int t = x;
			x = z;
			z = t;
		}
		
		if(y > z){
			int t = y;
			y = z;
			z = t;
		}
		System.out.println(x + ", " + y + ", " + z);
		
	}

}










