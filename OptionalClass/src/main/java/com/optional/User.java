package com.optional;

import java.util.Optional;

public class User {
	
	public Optional<String> getUsernameById(Integer id)
	{
		String name=null;
		if(id==100)
		name="Raju";
		else if(id==101)
		name="Rani";
		else if(id==102)
		name="John";
		//return Optional.ofNullable(name);
		return Optional.ofNullable(name);
	}

}
