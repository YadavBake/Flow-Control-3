
														Flow-Control Part-5 || Iterative Statements : for, for-each Loops
													========================================================================

----------------
   for Loop 
----------------

 -> for loop is the commanlly used loop in java.
 
 -> If we know number of iterations in advance then for loop is the best choice.

					1					2,5,8<------------------4,7<------<<---------<<----
		for (intialization_section ; Conditinal_check ; Increment|Decrement_section) {	  |	
										|												  |
			//Loop Body 3,6,9-------------------------------------------------------------
			
		}
 
 
					1	 2,5,8	  4,7
		for (int i = 0; i<10;	 i++){
			
			System.out.println("Hello"); 3,6
			
		}
		
 -> Currly braces are optional and without currly braces we can take only one statement under for loop, which should not be declarative statement.

	Ex.
	
	for(int i=0; true; i++)					for(int i=0; i<10; i++);	for(int i=0; i<=10; i++)
		System.out.println("Hello");        	                        	int  x = 10;
	
	// valid										valid 					invlaid 
	
	
	
   Initialization_section 
 --------------------------

 -> These part will be executed only once in loop life_cycle.
 
 -> Here we can declare and initialize locale variables of for loop.
 
 -> Here we can declare any number of variables but should be of the same type. By mistake IF we are trying to declare different data type variables then we will get compile 
	time error.
	
	Ex.
 
	int i = 0; j= 0; // valid 
	int i = 0; String s = "Druga"; //invalid 
	int i = 0; int j = 0; //invalid 

-> In the initialization_section we can take any valid java statement including SOP.

	Ex.
	
	int i =0;
	for(System.out.println("Hello boss you are sleeping"); i<3; i++){
		
		System.out.println("No Boss you only Sleeping");
	} //valid 
	/*o/p: Hello boss you are sleeping
		   No Boss you only Sleeping	
		   No Boss you only Sleeping
		   No Boss you only Sleeping*/	


-----------------------
   Conditional_check
-----------------------   

 -> Here we can take any valid java expression but should be of the type boolean.
 
 -> These part is optional and If we are not taking anything then compiler will always place true.
 
 -------------------------------
   Increment|Decrement_section
 -------------------------------
 
 ->  In the Increment|Decrement_section we can take any valid java statement including SOP.
		
		Ex. 

		int i = 0;
		for(System.out.println("Hello"); i<3; System.out.println("Hi")){
			
			i++;
		}//valid 
		o/p: Hello
			 Hi
			 Hi
			 Hi
	
->  All three part of for loop are independent of each other and optional. 


	------------------------------------------------------------
	|	for(; ;)							|	for( ; ;);     |
	|	{                                   |                  |
	|		System.out.println("Hell");     |                  |
	|	}                                   |                  |
	|                                       |                  |
	------------------------------------------------------------
		Both are valid and Infinite loops also.
		
		
		
 Ex.

																															int a = 10; b = 20;
	for(int i= 0;  true; i++)				for(int i= 0;  false; i++)				for(int i= 0; ; i++)					for(int i= 0;  a<b; i++)
	{                                       {	                                    {                                       {
		System.out.println("Hello");        	System.out.println("Hello");        	System.out.println("Hello");        	System.out.println("Hello");
	}                                       }                                       }                                       }
	System.out.println("Hi");               System.out.println("Hi");               System.out.println("Hi");               System.out.println("Hi");
	//invalid 								invalid 								invalid									valid 
	// unreachable statement				unreachable statement {					unreachable statement					Hello print infinite number of time 
	

	int a = 10; b = 20;						final int a = 10; b = 20;				final int a = 10; b = 20;
    for(int i= 0;  a>b; i++)                for(int i= 0;  a<b; i++)                for(int i= 0;  a>b; i++)
    {                                       {                                       {
    	System.out.println("Hello");        	System.out.println("Hello");        	System.out.println("Hello");
    }                                       }                                       }
    System.out.println("Hi");               System.out.println("Hi");               System.out.println("Hi");
	//valid									// invalid 	 							invalid 
    // Hi 									unreachable statement					unreachable statement {	

---------------------------------------------
  for-each Loop | Enhanced for-looop (1.5v)
---------------------------------------------

 -> Introduced in 1.5v version.

 -> It is specially designed loop to retrive elements of array and collections.

 Ex. To print elements of one-dimensional Arrays.
																		--------------------
							int [] x = {10,20,30,40};			 x----> | 10 | 20 | 30| 40 |
										|								--------------------
			-----------------------------------------------------------------
			|																|
			|																|
      Normal for loop													for-each 
	
	for(int i = 0; i<xlength; i++){								for(x1 :x)										
																{
		System.out.println(x[i]);									System.out.println(x1)	
	}															}


 Ex. To print elements of two dimensional array:
																							
																							
										int[][] x = { { 10,20,30}, {40,50}};						
															|																	   ------------														
							-----------------------------------------------------------------								x----->|    |	  |														
							|																|									    ------------												
							|																|                              x1         |       |                                         
					Normal for loop													  for-each loop 					----------------	------------						                                                                         
																														|10	 |20  |  30 |	| 40 | 50  |		
					for(int i = 0; i<xlength; i++){									for(int[]x1:x)						----------------	------------
																					{
							for(int j=0; j<x[i].lemgth; j++){						  for(int x2:x1)
																						{
								System.out.println(x[i][j]);								System.out.println(x2);
							}																}
					}																	}
				
 
 
  -> how To print a elements of  three dimensional array by using for-each loop? 
		
		Ex. 
										
												   ------------			
											x----->|    |	  |										for(int [] [] x1:x) 
													------------		                            {
												x1  |       |                                       	for(int[]x2:x1)
											-----------	------------                                	{
								  ---------|	 |    | |    |     |-----------                     		for(int x3:x2)
								  |		   ------------	------------          |                     		{
							  x2  |			       |      |                   |                     			System.out.println(x3);
							------------  ------------ ----------------	------------                		}
		                    | 10 | 20  |  | 30 | 40  | |50	 |60  | 70|  | 80 | 90 |                	}
                            ------------  ------------ ---------------- ------------                }
 
 -> for-each loop is the best choice to retrive elements of arrays and collections but it's a limitation is it is applicable only for and array's and collections and a it is not 
	a general purpose loop.
	
 
		Ex. 
  
		for(int i=0; i<10; i++){  |
			                      |
			System.out.println(i);|==> we can't write equivalent for-each loop directly  
		}                         | 
		
 -> By using normal for-loop we can print array elements either in origenal order or in reverse order. But by using for-each loop we can print array elements in only in origenal
	order but not in reverse order.

	Ex. 
	
		int [] x = { 10,20,30,40,50};			|
		                                        |
			for(int i = x.length-1 ; i>=0;i--){ |==> we can't write equivalent for-each loop directly  
				System.out.println(x[i]);       |
			}                                   |
			o/p; 50
				 40
				 30
				 20
				 10
		

-------------------------		
   Iterable(interface)	
--------------------------

 -> The target element in for-each loop should be iterable object.

 -> An object is said to be iterable if and only if currusponding class implements java.lang.Iterable interface.

 -> Iterable interface introduced in 1.5v version and it containes only one method iterator() method : public Iterator iterator ().
 
 -> All array releated classes and collection implemented classes already implemented interable interface beaing programmer we are not required to do anything just we should 
	awayre the point.

	Ex. 
																								
	Syntax:                                                                                     				Iterable
							|-------->// Array|Collection                                       				   |	
		for(eachitem x : target ){                                                              				colletion 
							|-------->//should be Iterable Object                               				    |
			                                                                                       ---------------------------------	
		}								// java.lang.Iterable(I) must implements these             |			|				   |
                                                                                                List(I)		  Set(I)			Queue(I)

		
 -> Difference between iterator and interable.
 
 
		-----------------------------------------------------------------------------------------------------
		|				Iterator (I) 					  |					Iterable(I)						|
		----------------------------------------------------------------------------------------------------|
		|	1. It is releated to  collections 			  |	1. It is releated to for-each loop.             |
		|	                                              |                                                 |
		|	2. we can use to retrieve to the elements of  |	2. The target element in for-each loop should   |
		|	   collections one by one.					  |		Iterable.                                   |
		|	                                              |                                                 |
		|	3. It is prasent in java.util package 		  |	3. It is prasent int java.lang package.         |
		|	                                              |                                                 |
		|	4. It containes 3 Method are there 			  |	4. It containes  1 method is.                   |
		|		I. hasNext().							  |			I. iterator().	                        |
		|	   II.next().                                 |                                                 |
		|	  III. remove().	                          |                                                 |
		|                                                 |                                                 |
		-----------------------------------------------------------------------------------------------------
		
	    




























   
		
		
		
		
		
 
 
 
 
 
 
 


















































 