package com.dsandalgos.mustdobasics;

public class MustDoBasics {

	
	
//	  PRIME:
//		1. Check Prime or Not
//		2. find Prime Numbers from 1 to n
//		3. Find Prime Numbers from a to b
//		4. Find Pairs of Prime and Non-Prime (prime, non-prime) between 1 to n
//		5. Find Pairs of Prime and Non-Prime (prime, non-prime) between a to b
	
	
	public boolean checkPrimeOrNot(int num) {
		boolean isPrime = true;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		System.out.println("Is " +num+ " prime? " +isPrime);
		return false;
	}
	
	public void printPrimeNumbersBetweenAandB(int num1, int num2) {
		
		for(int i = num1; i <= num2; i++) {
			int flag = 1;
			
			for(int j = 2 ; j <= i / 2; j++) {
				if( i % j == 0) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				System.out.println(i);
			}
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MustDoBasics mustDoBasics = new MustDoBasics();
		//mustDoBasics.checkPrimeOrNot(11);
		mustDoBasics.printPrimeNumbersBetweenAandB(110, 120);
	}

}
