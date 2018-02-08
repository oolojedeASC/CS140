package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		List<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer> other = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(arrList == other); //prints false. test for yourself if you'd like
	}
}
