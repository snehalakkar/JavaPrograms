package com.bridgelabz.tester;

import java.util.HashSet;

import com.bridgelabz.model.Person;

public class CheckUniqueness{
	Person person=new Person();
	HashSet<Long> hashSet=new HashSet<>();
	public Person chechUniqueness(long phone)
	{
		if(!hashSet.contains(phone)){
    		hashSet.add(phone);
    		for(Object hs:hashSet){
    			long num=(long)hs;
    			System.out.println(hs);
    			person.setPhone(num);
    		}
    		return person;
	}
		else{
			System.out.println("your phone number is already registered,you must provide unique mobile number ");

			return null;
		}

	}
}
