package lab03;

public class ArrayTester{
	public static void main(String[] args){
		int count = args.length;
		if (count == 1){
			ArrayFromFile arrayObject = new ArrayFromFile(args[0]);
		System.out.println(count);
		System.out.println(arrayObject);

		}else{
			throw new IllegalArgumentException("Not taking an argument not equal to one");
			}
	}

}
