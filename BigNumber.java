//U10416030 陳子勤

import java.util.*;
import java.lang.*;

public class BigNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two number: ");		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.println(number1 + " " + number2);
	}
}

class BigDigit {
	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	ArrayList<Integer> arrayPlus = new ArrayList<Integer>();
	
	BigDigit(int a, int b) {
		setArray1(a);
		setArray2(b);
	}
	
	public void setArray1(String a) {
		for(int i = a.length() - 1; i >= 0; i--) {
			array1.add((int)a.charAt(i)- 48);
		}
	}
	public void setArray2(String b) {
		for(int i = b.length() - 1; i >= 0; i--) {
			array2.add((int)b.charAt(i)- 48);
		}		
	}
}
