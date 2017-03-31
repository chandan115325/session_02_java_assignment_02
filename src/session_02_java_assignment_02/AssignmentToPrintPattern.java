package session_02_java_assignment_02;

public class AssignmentToPrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=0,col=0,size=5;
		
		for ( row = 0; row < size; row++) 
		{//System.out.print(" ");
	        for (col = 0; col < size; col++) 
	        {System.out.print(" ");
	            if ((row + col)%2 == 0 )
				{
	            	if((row+col==(size-1)/2))
	            			{
	            				System.out.print("a");
	            				//System.out.print(" ");
	            			}
	            	else if((row+col>2) && (row!=0 && col!=0) && (row+col<=6) && row!=col)
	            	{
	            		System.out.print("a");
	            		//System.out.print(" ");
	            	}
	            	
	            	else if(row==col && row%2!=0)
	            	{
	            		System.out.print("a");
	            		//System.out.print(" ");
	            	}
	            	
	            	else if(row==col && row%2==0 && row== (size-1)/2)
	            	{
	            		System.out.print("c");
	            	}
	            	
	            	System.out.print(" ");
	           }
	           
	            else if((row+col)%2!=0)
					{
						if( row+col>=(size-1)/2 && row+col<(size+1)&& row!=0 && col!=0 && row<=((size-1)/2+1) && col<=((size-1)/2+1))
						{
							System.out.print("b");
							//System.out.print(" ");
						}
						System.out.print(" ");
					}
	                    	
	            
	           	                       
	            else
	            {
	            	System.out.print(" ");
	            }
	         }
	        System.out.println();
	      }
	        
		/* int no=5;//Integer.parseInt(args[0]);
         for(int i=1;i<=no;i++)
             {
             //for(int k=1;k<=no-i;k++)
               //  {
                // System.out.print(" ");
                 //}
                 for(int j=1;j<=i;j++)
                     {
                         System.out.print(" *");
                     }
             System.out.println(" ");
             }*/
        /* for(int i=no-1;i>=1;i--)
             {
             for(int k=1;k<=no-i;k++)
                 {
                     System.out.print(" ");
                 }
                 for(int j=1;j<=i;j++)
                     {
                         System.out.print(" *");
                     }
             System.out.println(" ");
             }    
         for(int i=1;i<=no-3;i++)
             {
             for(int k=1;k<=no-i;k++)
                 {
                     System.out.print(" ");
                 }
                 for(int j=1;j<=i;j++)
                     {
                         System.out.print(" *");
                     }
             System.out.println(" ");
             }*/
	}

}
