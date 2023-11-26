package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOStreams {

	public static void main(String[] args) throws Exception{

		//Normal Approach
		FileReader fr=new FileReader(new File("C:\\Java\\Java 8\\NeshronEnginCode.js"));
		BufferedReader br=new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		System.out.println("================================================");
		//I/O Stream Approach
		String file="C:\\Java\\Java 8\\NeshronEnginCode.js";
		//Try with resource concept use to close file automatically when try block operation is done.
		try(Stream<String> stream=Files.lines(Paths.get(file)))
		{
			//Find line starts with 'v'
			stream.filter(lin->lin.startsWith("v")).forEach(lines->System.out.println(lines));
			//List<String> collect = stream.collect(Collectors.toList());
			//collect.forEach(lines->System.out.println(lines));
			//System.out.println(collect);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
