package com.demo.task1.branching.looping;

public class BellowedPattern1 {
	
   public static void main(String[] args) {

	for (int i=5; i>0; i--) {
		
		for (int j=i; j>0; j--)
			System.out.println(j);
		for(int j=i; j>0; j--)
			System.out.println(i);
		System.out.println();
	}
}
}

