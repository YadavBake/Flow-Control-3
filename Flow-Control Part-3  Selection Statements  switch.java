
												Flow-Control Part-3 || Selection Statements : switch
											     ==========================================================

-----------------------
   switch Statements	
-----------------------

 -> If several options are available then it is not recommanded to use nested if-else, because it radueced readability.
 
 -> To handle these requirement we should go For switch statement.
 
 
	Syntax				   switch(x)								if(x==1) {								  
	                                    {                                                       			System.out.println("JAN");           
		switch(x)                       	case 1 :                                            		}                                        
		{                               		 System.out.println("JAN");                     	else if (x==2){                      
			case 1 :                    		 break;                                         		System.out.println("FAB");       
				 Action-1;              	                                                    	}                                    
				 break;                 	case 2 :                                            	else if(x==3){                       
			                            		 System.out.println("FAB");                     		System.out.println("MARCH");     
			case 2 :                    		 break;                                         	}                                    
				 Action-2;              		                                                	else if(x==4){                       
				 break;                 	case 3 :                                            		System.out.println("APRIL");     
				                        		 System.out.println("MAR");                     	}                                    
			case n :                    		 break;                                                                            
				 Action-n;              									// Not recommanded
				 break;                 	case 12 :
			                            		 System.out.println("DEC");
			default :                   		 break;
				default Action;         }
		}						//recommanded
		

  -> The allowed arguments type For the switch are byte,short,char,int until 1.4v version. But from 1.5v version onwords currsponding wrapper classes and enum type also allowed.

  -> From 1.7v version onwords String type also allowed.

	-------------------------------------------
	|	1.4v 	|	1.5v	|  1.7v    |
	|---------------|---------------|----------|	
	|	        |               |          |
	|	byte 	|   Byte 	|          | 
	|           	|               |          |
	|	short 	|  Short        |	   |
	|		|		|   String |
	|	char 	| Character     |          |
	|	        |               |          |
	|	int 	| Integer       |          |
	|               |               |          |
	|		| enum          |          |
	--------------------------------------------

	
-> 	Curly braces are mandatory except switch every where curly braces are optional.   

-> Both case and default are optional. That is an empty switch statement is valid java syntax.
				
	Ex. 
   
	int x =10;                       
	switch(x) {                       
	                       
	}                 
	                  
 -> Inside switch every statement should be under some case or default. That is independent statement are not allowed inside switch otherwise we will get compile time error.					  
	  
	int x =10;
	switch(x){
		System.out.println("Hello");
	}//CE: case,default, or } expected.
	                       
						   
 -> Every case label should be compile time constant(That is constant expression);
 
	EX. 

	int x = 10;
	int y=  20;
	switch(x) {
		
		case 10:
			System.out.println(10);
			break;
			 
			 |<---------------//CE: constant expression required 
		case y:
			 System.out.println(20);
			 breakl
	}
			
	  - If we declare 'y' as final we won't get any compile time error.


-> Both switch arguments and case lable can be expressions but case lable should be constant expression.

	Ex. 

	int x = 10;
    
	switch(x+1) {
	                       
	     case 10:                  
          System.out.println(10);
		  break;
		 
		 case 10+20+30:
              System.out.println(60);
	}
        
 -> Every case label should be in the range of switch arguments type otherwise we will get compile time error.
 
	Ex. 
	
	
	byte b =10;					   byte b =10;
		|---->byte 					    |=========> int 
	switch(b){                                          switch(b+1){
		                                                	
		case 10:                                        	case 10:
		  System.out.println(10);                       	  System.out.println(10);
		  break;                                        	  break;
		                                                	  
		case 100:                                       	case 100: 
          System.out.println(100);                            System.out.println(100);
          break;                                              break;
		                                                	  
		case 1000:                                      	case 1000:  
          System.out.println(1000);                           System.out.println(1000);
          break;                                               break;
		//PLP found: int required byte  
		}  						}
	
	 // invalid 							valid 
	 
	 
-> Duplicate case labels are not allowed . Otherwise we will get compile time error 

	int x = 10;
	
	switch(x) 
	{
		
		case 97:
			System.out.println(97);
			break;
			
	    case 98:
	    	System.out.println(98);
	    	break;
	 
		case 99:
	    	System.out.println(99);
	    	break;
	 
		case 'a':
	    	System.out.println('a');
	    	break;
	}//invalid CE: duplicate case label
	 
	 
	 
-> 	
				|=> It should be constant expression 
				|
				|=> The value should be in the range of switch arguments types
	case label ========== > |
				|=> Duplicate case labels are not allowed 
				|
				
	 
------------------------------	 
 Fall-through inside a switch 
-------------------------------

 ->  Within the switch If any Case is matched from that Case onwords all statement will be executed until break or end of the switch. These called fall-through inside a switch.
 
 -> The main advantage of fall-through inside a switch is we can define command action For multiple cases (Code re-useability).
 
 
	switch(x){
		
		case 1:
		case 2:
		case 3:
			System.out.println(Q-4);
			break;
		
		case 4:
		case 5: 
		case 6: 
			System.out.println(Q-1);
			break;
	}	
 
 
 
	switch(x)
	{
		case 0:
	    	System.out.println(0);
	    	
	 
		case 1:					x = 0 				x = 1 
	    	System.out.println(1);                  
        	break;                                  0 ,1 				1
		                                            
		case 2:                                 x = 2				x = 3
        	System.out.println(2);                  
        	                                        2 ,def				def 
		
		default:
			System.out.println{"def");
	}
	
	
	
-> Within the switch we can take default Case at most once.

-> default Case will be executed if and only if there is no Case matched .

-> within the switch we can write default Case any where but it is recommanded to write as last Case.
	
	Ex. 

		switch(x){
			
			default :
				System.out.println("Def");
						
			    
	    	case 0:
	        	System.out.println(0);
	        	break;
         
        	case 1:					x = 0 				x = 1 
            	System.out.println(1);           
							0 				1 2 
        	                                            
        	case 2:                                x = 2				x = 3
            	System.out.println(2);                  
            	                                         2				def 0 
        	
        }


