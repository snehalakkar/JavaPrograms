package com.bridgelabz.programs;

public class StopwatchBussiness {
    long starttime=0;
	long stoptime=0;
	long elapsedtime=0;
	boolean running=false;
	public  long start()
	{    
		 starttime =System.currentTimeMillis();
		
		running= true;
		return starttime;
	}
	
	public  long stop(){    
		 stoptime =System.currentTimeMillis();
		
		running=  false;
		return stoptime;
	}
	
	public long timeelapsed(){
		if(running){
			elapsedtime=((System.currentTimeMillis()-starttime)/1000);
			
			System.out.println(elapsedtime);
		}
		else {
		elapsedtime=stoptime-starttime;
		System.out.println("elapsed time between start and stop is: "+(elapsedtime/1000));
		
		}
		return elapsedtime;
	}
}



