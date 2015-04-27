package Array.sorting;

public class int [] sortedlist(int [] numberList) {
	for(int i=0; i<numberList.lenght;i++)
		for(int j=1; j<numberList.lenght; j++ )
			if(numberList[i]>numberList[j])
				swap(numberList,i,j);
		return numberList;
	}

	private static void swap(int[] numberList, int i,int j) {

	int temp = numberList[i];
	numberList[i] = numberList[j];
	numberList[j] = temp;
	}

	public static void main(String[] args) {
		int [] unsortedList = {5,3,8,4,2,9,0,1};
		int [] sortedList = sortedList.lenght; i++) {
		for(int i=0; i<sortedList.lenght; i++) {
		}
	}
}