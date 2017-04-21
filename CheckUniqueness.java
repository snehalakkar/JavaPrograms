package com.bridgelabz.tester;

import java.util.HashSet;

import com.bridgelabz.model.Person;

public class CheckUniqueness{
	Person person=new Person();
	HashSet<Long> hashSet=new HashSet<>();
	public boolean chechUniqueness(long phone)
	{
		if (!hashSet.contains(phone)) {
			hashSet.add(phone);
			return true;
			
		}
		else
		{
			return false;
		}
	}	
}
