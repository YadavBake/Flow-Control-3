
											Flow-Control Part-4 || Iterative Statements: while,do-while
										     ==================================================================

------------------------
  Iterative Statements	
------------------------

 1. While() 
------------

  -> If we don't know number of iteration in advance then we should go for while loop.

															syntax
	  while(rs.next()) {			while(e.hasMoreElements())  {		while(itr.hasNext()) {		      |-----> // should be boolean type 	
           	                        	                                	                            	while(b)
           }                           			}                                   	                            	{
                                                                          				 }                       //action 
                                                                                                        			}

  -> The argument should be boolean type If we are trying to provide any other type then we will get compile time error. 
	
		      |---------->// CE: incompatible found :int required: boolean.
		while(1){
			
			System.out.println("Hello");
		}
 
 -> Currly braces are optional and without currly braces we can take only one statment and under while which should not be declarative statment.
 
	while(true)						while(true);					while(true)					while(true){
		System.out.println("hollo");									 int x =10;					int x = 10;
																					}
		//valid 					valid 						invalid						valid  		


-> 
	
											int a = 10, b = 20;		       int a = 10, b = 20;
	while(true)				      while(false)			while(a<b)                             while(a>b)
	{                                           |{                                   {                                       {
		System.out.println("Hello");     ---|	System.out.println("Hello");    	System.out.println("Hello");        	System.out.println("Hello");
	}                                        |  |}                                   }                                       }
	System.out.println("Hi");                |   System.out.println("Hi");           System.out.println("Hi");               System.out.println("Hi");
			|			 |	
	//invalid 	|			 |	invalid 				valid 					valid 
	//CE unreachable statment		 |-->CE unreachable statment '{'	    	o/p Hello infinite time 	        o/p Hi		


    final int a = 10, b = 20;		    final int a = 10, b = 20;
    while(a<b)                              while(a>b)
    {                                         | {
    	System.out.println("Hello");       ---| 	System.out.println("Hello");
    }                                      |  | }
    System.out.println("Hi");              |    System.out.println("Hi");
			|                  |	
	//invalid       |		   |	invalid
			|                      |-->//CE: unreachable statment '{'
    // CE: unreachable statment


Note: 

	-> Every final variable will be replaced by the value at compile time only.

	I)
	
	
	final int a = 10;
	int b =20;		| After compilation 		System.out.println(10);
	System.out.println(a);  |=====================> 
	System.out.println(b);  |				System.out.println(b);

	-> If every argument is a final variable(compile time constant then that operation should be performed at compile time only).

	II)
	
		final int a = 10, b = 20;
		      int c = 20;	
		System.out.println(a+b);|					System.out.println(30);
		System.out.println(a+c);| After compilation			System.out.println(10+c);
		System.out.println(a<b);|=========================> 		System.out.println(true);
		System.out.println(a<c);|					System.out.println(10<c);
		

-> If we know number iteration in advance then we should go For for() loop.		                    		
		
		for(int i = 0 ; i<10; i++) {	
			                         
			System.out.println(i);   
		}                            
		
 

  2. do-while 
----------------
 
 -> If we want to execute loop body at list once then we should go For do-while loop. 
 
		Syntax 
		
			do 
			{
				body
			}
			while (b);---> // Semicolane is mandatory
				   ^	
				   |--->// should be boolean type.
 
 Ex.
 
	-> Currly braces are optional and without currly braces we can take only one statment between do and while which should not be declarative statment.
 
	do {				 	do; 			do 			do {			  do 												
						while(true);	    	                 				while(true);	                                                   
	System.out.println("Hello");    			       int x = 10;     		int x = 10;         	
		                                    	                	                	                    	                                                   
	}while(true);                                                  while(true);        	} while(true);                                                    
 
 
	// valid				valid			invalid			valid			  invalid
 
 
 Ex.
 
 
	do while (true)				do
	   System.out.println("Hello");        	   while(true)
	while (false);                             System.out.println("Hello");
                                             while(true);
								
					    o/p: Hello infinite number of time print 
	
	
Ex.

										   int a = 10, b = 20;		       int a = 10, b = 20;					
	do {				      do {				   do {                                do {
		                                	                                	                                	
	  System.out.println("Hello");        System.out.println("Hello");        System.out.println("Hello");        System.out.println("Hello");
	}while(true);                       }while(false);                      }while(a<b);                        }while(a>b);
	System.out.println("hi");           System.out.println("hi");           System.out.println("hi");           System.out.println("hi");
	
	//invalid 				valid 				valid 					valid 
	//unreachable statment			Hello ,hi			Hello infinite number of times 		Hello,hi
 
 
     final int a = 10, b = 20;			final int a = 10, b = 20;
    do {                                        do {
    	                                        	
      System.out.println("Hello");                System.out.println("Hello");
    }while(a<b);                                }while(a>b);
    System.out.println("hi");                   System.out.println("hi");
 
	// invalid 				valid 
	//CE: unreachable statment		Hello ,hi
 
 
 
 
 
 
 
 
 
 
 
 
 
 




		
		
		
		
		
		
