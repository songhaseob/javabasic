package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
//		printRank(arr); //석차구하기
//		selectSort(arr); //선택정렬
//		bubbleSort(arr); //버블정렬
//		insertSort(arr); //삽입정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	//삽입정렬
	private static void insertSort(int[] arr) {
		/* i,j
		 * 1,0
		 * 2,1  2,0
		 * 3,2  3,1  3,0
		 * 4,3  4,2  4,1  4,0
		 * 5,4  5,3  5,2  5,1  5,0
		 * 6,5  6,4  6,3  6,2  6,1  6,0
		 * 7,6  7,5  7,4  7,3  7,2  7,1  7,0
		 * 8,7  8,6  8,5  8,4  8,3  8,2  8,1  8,0
		 * 9,8  9,7  9,6  9,5  9,4  9,3  9,2  9,1  9,0
		 */
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < arr[j]){
					arr[j + 1] = arr[j];
				}else{
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	//버블정렬
	private static void bubbleSort(int[] arr) {
		/*
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7
		 * 0,1  1,2  2,3  3,4  4,5  5,6
		 * 0,1  1,2  2,3  3,4  4,5
		 * 0,1  1,2  2,3  3,4
		 * 0,1  1,2  2,3
		 * 0,1  1,2
		 * 0,1
		 */
		for(int i = 0; i < arr.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	//선택정렬
	private static void selectSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	//석차구하기
	private static void printRank(int[] arr) {
		//석차를 저장할 배열을 생성한다.
		int[] rank = new int[arr.length];
		//석차를 저장할 배열의 모든 인덱스를 1로 초기화한다.
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		//점수를 비교해 작은 점수의 석차를 증가시킨다.
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}

}






