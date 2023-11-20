
															Flow-Control Part-2 || Selection Statements : if-else
														============================================================
-----------------------
  Selection Statement 	
-----------------------

 1. if-else  
------------

 Syntax: 
		|--------------// Must be boolean type
	if (b) {
		
		//Action if b is true 
	}else {
		
		//Action if b is false 
	}
	 
-> The argument to the if statement should be boolean type by mistake if we are trying to provide any other type then we will get compile time error.


	Ex. 
	
		int x = 0;																	int x = 10;
			|-----------// CE: incompatible type found:int required:boolean             |----------//CE: incompatible type found:int required:boolean
		if(x){                                                                      if(x=20){
			                                                                        	System.out.println("HellO");
			System.out.println("Hello");                                            }else{
		}else {                                                                     	
			System.out.println("hi");                                               	System.out.println("Hi");
		}                                                                           }
		
		
				
		int x =10;								boolean b = true;						boolean b = false;
		                                                                                
		if(x==20) {                             f(b=false){                             f(b==false){
			                                    	System.out.println("Hello");        	System.out.println("Hello");
			System.out.pritln("Hello");         }else {                                 }else {
		}else{                                  	System.out.println("Hi");           	System.out.println("Hi");
			System.out.println("Hi");           } //Hi                                  } //Hello
		}//hi
		
		
  2. else 
-----------

	-> 'else' part curly braces are optional without '{' curly braces only one statement is allowed under 'if' which should not be declerative statement.
	
	 if(true)									if(true);						if(true)					if(true)				
																											{
		System.out.println("Hello");											int x = 10;						int x = 10;
																											}
	 // valid 									CE: valid							invalid 					valid	
																			
		
 Note: 

	-> ';' semicolan is a valid java statement which is also known as empty statement.
	
	

 -> There is no dangling else problem in java.
 
 -> Every else is mapped or matched to the nearest if statement.

	Ex.

	if(true)
		
		if(true)
			System.out.println("Hello");
		else 
			System.out.println("Hi");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	