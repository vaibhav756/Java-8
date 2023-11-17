package com.stream.parallel;

import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		System.out.println("================Serial Stream===============");
		Stream<Integer> serialStream = Stream.of(1,2,3,4,5);
		serialStream.forEach(i->System.out.println(i+" - "+Thread.currentThread()));
		
		System.out.println("================Parallel Stream===============");
		Stream<Integer> parallelStream = Stream.of(1,2,3,4,5);
		parallelStream.parallel().forEach(i->System.out.println(i+" - "+Thread.currentThread()));
		
	}

}
