package j_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new ArrayList());
		
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		//따라서 제네릭의 사용이 권장된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
//		list.add("abc"); //컴파일 에러 발생
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40); //1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list);
		
		Integer before = list.set(2, 50); //2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2); //list[2]
		System.out.println(integer);
		
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);
//		}
//		System.out.println(list);
		
		//값을 제거 할때는 뒤에서부터 제거해야 한다.
		for(int i = list.size() - 1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		//list[0][0][0]  list.get(0).get(0).get(0)
		
		//list에 1 ~ 100사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++){
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) < min){
				min = list.get(i);
			}
			if(max < list.get(i)){
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++){
			min = i;
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		System.out.println(list);
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		Integer integer2 = list2.get(1).get(1);
		System.out.println(integer2);
	}

}










