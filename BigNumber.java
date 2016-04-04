//U10416030 陳子勤

import java.util.*;
import java.lang.*;

public class BigNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two integer: ");	//enter two integer
		String number1 = input.next();
		String number2 = input.next();		
		
		BigDigit bigNumber = new BigDigit(number1,number2);
		
		bigNumber.Print();	//to print out final answer
	}
}

class BigDigit{
	int bigSize;
	int smallSize;
	
	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	ArrayList<Integer> arrayPlus = new ArrayList<Integer>();

	BigDigit(String a, String b){
		setArray1(a);
		setArray2(b);
		bigSize();
		cal_arrayPlus();
	}
	
	public void setArray1(String a) {	//set number1 into array1
		for(int i = a.length() - 1; i >= 0; i--) {
			array1.add((int)a.charAt(i) - 48);
		}
	}
	public void setArray2(String b) {	//set number2 into array2
		for(int i = b.length() - 1; i >= 0; i--) {
			array2.add((int)b.charAt(i) - 48);
		}		
	}
	
	public void bigSize() {		//find which array is bigger
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
	
	public void cal_arrayPlus(){	//calculate answer
		int N = 0;
		int number1;
		int number2;
		
		for(int i = 0; i < smallSize; i++){
			number1 = array1.get(i);
			number2 = array2.get(i);
			arrayPlus.add((number1 + number2 + N) % 10);
			if((number1 + number2 + N) / 10 == 1) {
				N = 1;
			}
			else {
				N = 0;
			}
		}
		
		if(bigSize == array1.size() && N == 1) {	//if array1 is bigger and there is a carry
			number1 = array1.get(smallSize) + N;
			arrayPlus.add(number1 % 10);
			if((number1 / 10) == 1) {
				N = 1;
			}
			else {
				N = 0;
			}
			for(int i = smallSize + 1; i < bigSize; i++){
				number1 = array1.get(i) + N;
				arrayPlus.add(number1 % 10);
				if(number1 / 10 == 1) {
					N = 1;
				}
				else {
					N = 0;
				}
			}
		}
		else if(bigSize == array2.size() && N == 1) {	//if array2 is bigger and there is a carry
			number2 = array2.get(smallSize) + N;
			arrayPlus.add(number2 % 10);
			if(number2 / 10 == 1) {
				N = 1;
			}
			else {
				N = 0;
			}
			for(int i = smallSize + 1; i < bigSize; i++) {
				number2 = array2.get(i);
				arrayPlus.add(number2 % 10);
				if(number2 / 10 == 1) {
					N = 1;
				}
				else {	
					N = 0;
				}
			}
		}
		if(N == 1) {
			arrayPlus.add(N);
		}
	}
	
	public void Print() {	//print the answer
		String print = "";
		for(int i = arrayPlus.size() - 1; i >= 0; i--){
			print += String.valueOf(arrayPlus.get(i));
		}
		System.out.println(print);		
	}	
}
