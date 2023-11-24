
													Flow-Control Part-6 || Transfer statements : break and continue
												======================================================================
 
 -----------------------
   Transfer statements	
 ----------------------

 1. break  
----------

	-> We can use break statement in the following places.
	
		1. Inside switch :- To stop fall-through.
		
		2. Inside Loops :- To Break loop exicution based on some condition.
		
		3. Inside Labeled Blocks:- To Break block exicution based on some condition.
	
	
		1. Inside switch :								2. Inside Loop:									3. Inside Labeled block:
		                                                                                                
		int x = 0;                                  	for (int i = 0; i<10; i++)                      class Test {
		switch(x) {                                 	{                                               	
			case 0 :                                		if(i=5)                                     	public static void main(String args[]){
				System.out.println("0");            			break;                                  		
			case 1 :                                		System.out.println(i);                      		int x = 10;
				System.out.println("1");            	}                                               		l1:
				break;                                                                                  		{
			case 2 :                                                                                    			System.out.println("Being");
				System.out.println("2");                                                                			if(x==10)
			                                                                                            				break l1;
			default :                                                                                   			System.out.println("End");
				System.out.println("def");                                                              		}
		}                                                                                               		System.out.println("Hello");
		                                                                                                	}
		                                                                                                }
		0/p: 0 1										o/p: 0,1,2,3,4									 o/P: being  Hello 

 -> These are the only places where we can use break statement If we are using any where Else we will get compile time error. Saying break outside switch or Loops.


		class Test {
			
			public static void main(String args[]){
				
				int x =10;
				if(x==10)
					break;
				System.out.println("Hello");
			}
		}
		//CE: break outside switch or loop.
		

  2. continue statement	
-------------------------

 -> We can use continue statement inside Loops to skip current iteration and Continue For the next iteration.
	
	Ex. 
	
	for(int i =0; i<10; i++)
	{
		if(i % 2 == 0 )
			continue;
		System.out.println(i);
	} o/p: 1,3,5,7,9
		
-> We can use continue statements only inside loops IF we are using any where Else we will get compile time error  saying continue outside of loops.


			class Test {
				
				public static void main(String args[]) {
					
					int x =10;
					if(x ==10)
						continue
					System.out.println("Hello");
				}
			}
			//CE: continue outside loop.
					
		
	labeled  break and continue
----------------------------------

 -> we can use labeled break and continue to Break or Continue a particular in nested loops.

	Ex.
	
		l1:
		for(-------------)
		{
			l2: 
			for(--------------)
			{
				for(-------------)
				{
					break l1;
					break l2;
					break;
				}
			}
		}
		
		
-> 

	l1:																break;							break l1;
	for(int i = 0 ; i<3 ;i++)						                1--0
	{                                                               2--0							no-o/p
		for(int j = 0 ; j<3; j++)                                   2--1
		{                                                           continue;						continue l1;
			if(i==j);                                               0--1							1---0
			break;                                                  0--2							2---0
			System.out.println(i+"...."+j);                         1--0							2---1
		}                                                           1--2
	}                                                               2--0
	                                                                2--1
	
	
   do-while vs continue[dangerious combination]
-------------------------------------------------

 ->    
	
	
	int x = 0;									x= 0
	do {										1 7	
												2 8
   |--->x++;									3 9
   ^	System.out.println(x);					4 10
   |	if(++x<5)								5 11
   |		continue;---------------			6
   ^	x++;					   | 			    
   |	System.out.println(x);	   |==> continue control comes down 	
   ---}while(++x<10);<----------------					
	
	o/p: 1
		 4
		 6
		 8
		10
    
	
	
	













		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		