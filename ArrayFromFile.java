package lab03;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayFromFile{
	private int[] array;
	public ArrayFromFile(String filename) {
    		// try-with-resources block (sc is the resource we are 			trying to use)
    		try (Scanner sc = new Scanner(new File(filename))) {
			int length = (sc.nextInt());
			array = new int[length];
			for (int i = 0; i < array.length; i++){
				array[i] += sc.nextInt();
				
			}
    } 	catch (Exception e) {
		array = new int[0];

    		}
	}
	public int[] getArray(){
		return array;
		}
	
	public String toString(){
		return Arrays.toString(array);
		}
}
