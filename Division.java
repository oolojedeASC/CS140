package lab05;
import java.util.*;

public class Division{
	private List<Double> list = new ArrayList<>();
	
	public Division(double[] array){
		if(array == null || array.length == 0){
			throw new IllegalArgumentException("Need to enter an array with at least one double");
		}else{	
			for(double i: array){
				list.add(i);
			}
		}
	}
	
	public void removeZeroes(){
		if(list == null || list.size() == 0){
			throw new IllegalArgumentException("Need to enter an array with at least one double");
		}else{
			for(double i: list){	
				if(i==0){	
					list.remove(i);	
				}
			}
		}
	}
	
	public void divide(int divisor){
			if(divisor == 0){
				throw new IllegalArgumentException("Cannot Divide by zero");
			}else{
			for(int i= 0; i < list.size(); i++){
				list.set(i, (list.get(i)/divisor));
			}
			}
	}
	
	public String toString(){
		return list.toString();
	}
	
}
