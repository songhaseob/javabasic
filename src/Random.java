import java.util.ArrayList;
import java.util.List;


public class Random {

	public static void main(String[] args) {
		/*
		 * 345 : 0S 2B 1O
		 * 572 : 0S 0B 3O
		 * 134 : 1S 1B 1O
		 * 634 : 1S 1B 1O
		 * 439 : 2S 0B 1O
		 * 438 : 3S 0B 0O
		 */
		List<String> students = new ArrayList<>();
		
		students.add("김건호");
		students.add("김선중");
		students.add("이수훈");
		students.add("오제현");
		students.add("박소영");
		students.add("유동기");
		students.add("김수연");
		students.add("이수정");
		students.add("유승종");
		students.add("김도영");
		students.add("전영헌");
		students.add("김준혁");
		students.add("이건영");
		students.add("송하섭");
		students.add("이예슬");
		students.add("백수진");
		students.add("이연승");
		students.add("최동준");
		students.add("김강영");
		students.add("김우성");
		students.add("황시연");
		students.add("김경찬");
		students.add("김보연");
		students.add("김형석");
		students.add("안용현");
		
		int random = (int)(Math.random() * students.size());
		
		System.out.println(students.get(random));
	}

}






