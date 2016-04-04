//U10416030 陳子勤

import java.util.*;
import java.lang.*;

public class BigNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two number: ");		
		String number1 = input.next();
		String number2 = input.next();
		
		System.out.println(number1 + " " + number2);
	}
}

class BigDigit {
	int bigSize;
	int smallSize;
	
	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	ArrayList<Integer> arrayPlus = new ArrayList<Integer>();
	
	BigDigit(String a, String b) {
		setArray1(a);
		setArray2(b);
	}
	
	public void setArray1(String a) {
		for(int i = a.length() - 1; i >= 0; i--) {
			array1.add((int)a.charAt(i));
		}
	}
	public void setArray2(String b) {
		for(int i = b.length() - 1; i >= 0; i--) {
			array2.add((int)b.charAt(i));
		}		
	}
	
	public void bigSize() {
		if(array1.size() > array2.size()) {
			bigSize = array1.size();
			smallSize = array2.size();
		}
		else if(array2.size() > array1.size()) {
			bigSize = array2.size();
			smallSize = array1.size();
		}
		else {
			bigSize = array1.size();
			smallSize = array1.size();
		}
	}
}
