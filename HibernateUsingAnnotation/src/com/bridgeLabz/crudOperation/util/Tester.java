package com.bridgeLabz.crudOperation.util;

import org.apache.log4j.chainsaw.Main;

import com.bridgeLabz.crudOperation.dao.StudentDao;
import com.bridgeLabz.crudOperation.dto.Student;

public class Tester {
public static void main(String[] args) {
	Student s1=new Student();
//no need to set id bcoz it is primary key and already set using annotation id and generated
	
	s1.setBranch("java");
	s1.setName("snel");
	
	StudentDao sdao=new StudentDao();
	sdao.save(s1);
	
	sdao.update(6,"yash");

	sdao.delete(4);
	
	sdao.displayAll();
	
	sdao.displayParticular(1);
}
}
