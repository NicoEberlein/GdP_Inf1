package de.eberln.gdp.uebung.methoden;

public class MathArray{

	int[] values;

	public MathArray() {
	
	}

	public MathArray(int[] values) {
		this.values = values;
	}	

	public void setValues(int[] values) {		
		this.values = values;
	}

	public int[] getValues() {
		return values;
	}

	public void addValue(int add) {
		
		if(values != null) {
			
			int[] newArray = new int[values.length + 1];	
			for(int i=0;i<values.length;i++) {
				newArray[i] = values[i];
			}
			newArray[values.length] = add;
			values = newArray;
		}else{
			values = new int[]{add};
		}

	}

	public float avg() {
		return (float)sum() / (float)values.length;
	}

	public int sum() {

		int sum = 0;

		for(int i=0;i<values.length;i++) {
			sum += values[i];			
		}

		return sum;
	}

	public int prod() {

		if(values == null) {
			return 0;
		}

		int prod = 1;

		for(int i=0;i<values.length;i++) {
			prod = prod * values[i];
		}

		return prod;

	}

	public int max() {

		int max = values[0];

		if(values == null) {
			return 0;
		}

		for(int i=1;i<values.length;i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}

		return max;

	}

	public int min() {

		int min = values[0];

		if(values == null) {
			return 0;
		}

		for(int i=1;i<values.length;i++) {
			if(values[i] < min) {
				min = values[i];
			}
		}

		return min;

	}




	public int[] sort() {

		return mergeSort(values);

	}

	private int[] mergeSort(int[] arr) {

		if(arr.length == 1) {
			return arr;
		}else{
			int cutIndex = arr.length / 2;
			int[] leftArr = mergeSort(copyArrayinRange(arr, 0, cutIndex-1));
			int[] rightArr = mergeSort(copyArrayinRange(arr, cutIndex, arr.length-1));

			int originalArrIndex = 0;
			int i = 0;
			
			while(i<leftArr.length || rightArr.length != 0) {

				if(rightArr.length == 0) {
					for(int j=i;j<leftArr.length;j++) {
						arr[originalArrIndex] = leftArr[j];
						originalArrIndex++;
					}
					break;
				}
				if(i == leftArr.length && rightArr.length > 0) {

					for(int j=0;j<rightArr.length;j++) {
						arr[originalArrIndex] = rightArr[j];
						originalArrIndex++;
					}
					break;
				}

				if(leftArr[i] <= rightArr[0]) {
					arr[originalArrIndex] = leftArr[i];
					originalArrIndex++;
					i++;
				}else{
					arr[originalArrIndex] = rightArr[0];
					originalArrIndex++;
					rightArr = copyArrayinRange(rightArr, 1, rightArr.length-1);
				
				}
			

			}

			return arr;

		}

	}

	private int[] copyArrayinRange(int[] arr, int start, int stop) {

		int[] copyArray = new int[stop-start+1];

		for(int i=start;i<=stop;i++) {
			copyArray[i-start] = arr[i];
		}

		return copyArray;

	}


}
