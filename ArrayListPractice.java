package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListPractice{

	public static int intRemoveAll(List<Integer>arr, int e){
		Iterator<Integer> iter = arr.iterator();
		int count = 0;
		while(iter.hasNext()){
		    if((Integer) iter.next() == e){
			iter.remove(); 
			count++;
		    }
		}
		return count;
	}

	public boolean isEqual(List<Integer>alpha, List<Integer>other){
		if(alpha.size() != other.size()){
			return false;
		}else{
			boolean returnValue = true;
			for(int i = 0; i < alpha.size(); i++){	
				if (alpha.get(i) == other.get(i)) {
					returnValue = true;
				}else{
					returnValue = false;
				}
			}
			return returnValue;
		}
		
	}

	public void appendArray(List<Integer>arrList, int[] arr){
			if (arr == null){
				System.out.println("IllegalArgumentException. No null values accepted");
			}
			for(int i = 0; i < arr.length; i++){
				arrList.add(arr[i]);
			}
	}
	
	public void sumElementWise(List<Integer>arr1, List<Integer>arr2){
		List<Integer>firstArr;
		List<Integer>secondArr;
		if (arr1.size() > arr2.size()){
			firstArr = arr1;
			SecondArr = arr2;
		}else{
			firstArr = arr2;
			secondArr = arr1;
		}
	}
		

}
