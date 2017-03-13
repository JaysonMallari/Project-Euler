package com.PrimeFactors;
/*
 * 

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
public class PrimeFactors {
	
	public static boolean isPrime(long num){
		for (long i=2, max=num/2;i<max;i++){
			if(num % i == 0){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args){
		long time = System.nanoTime();
		long max = 600851475143L, result = 0;
		
		for(int i = 1; i < max; i++){
			if(max%i == 0 && isPrime(max/i)){
				result = max/i;
				break;
			}
		}
		
		System.out.println(result);
		System.out.println(System.nanoTime() - time);
	}

}
