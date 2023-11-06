package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,25,78,45,95,14,26,78,71,11);
		System.out.println("Before sort : "+list);
		//Without Lambda
		Collections.sort(list,new sorting());
		System.out.println("After sort : "+list);
		//With Lambda
		//Ascending Order
		Collections.sort(list,(i,j)->i.compareTo(j));
		System.out.println("Ascending Order using lambda : "+list);
		//Descending Order
		Collections.sort(list,(i,j)->(i>j)?-1:1);
		System.out.println("Descending Order using lambda : "+list);
		
		Comparator<Integer> comp=(i,j)->
		{
			if(i>j)
			return 1;
			else
			return -1;
		};
		Collections.sort(list,comp);
		System.out.println(list);
	}
}
class sorting implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
		return -1;
		else
		return 1;
	}	
}