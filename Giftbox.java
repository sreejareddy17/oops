package epam.maven;
import java.util.*;

public class Giftbox {
	public static void main(String[] args)
	{
		int total_weight = 0,qnt = 0,wt = 0,totalbox_wt = 0,i=0,totwt=0;
		String s[]= {"Dairymilk","Gulabjam","Rasgulla","snickers"};
		int[] a = new int[4];
        char n1;
        sweets collect;
        Boolean n=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("select different sweets which are given below");
        while(n)
        {
        	System.out.println("Available Sweets:");
        	System.out.println("1.Dairymilk");
        	System.out.println("2.Gulabjam");
        	System.out.println("3.Rasgulla");
        	System.out.println("4. snickers");
        	System.out.println("Select from the above sweets");
        	switch(sc.next().charAt(0))
        	{
        	case '1': System.out.println("Enter the quantity of Dairymilk: ");
        			  qnt=sc.nextInt();
        			  System.out.println("Enter the weight in grams: ");
        			  wt=sc.nextInt();
        			  collect= new Dairymilk();
        			  totwt=qnt*wt;
        			  total_weight=collect.totalwt( qnt, wt);
        			  totalbox_wt=totalbox_wt+total_weight;
        			  System.out.println("Total weight of the box:" + total_weight);
        			  a[0]+=totwt;

        			  totwt=0;
        			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        			  System.out.println("do you want to add any other item (y/n)");
   	        	      n1=sc.next().charAt(0);
   	        	      if(n1=='y'|| n1=='Y')
   	        	        { 
   	        	    	  n=true;
   	        	          break;
   	        	        }
   	        	     else
   	        		    {
   	        	    	 n=false;
   	                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
   	                     break;
   	                    }
        	case '2': System.out.println("Enter the quantity of Gulabjam: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new Gulabjam();
			  total_weight=collect.totalwt( qnt, wt);
			  a[1]+=qnt*wt;
			  totwt=0;
			  totalbox_wt=totalbox_wt+total_weight;
			  System.out.println("Total weight of the box:" + total_weight);
			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                  break;
                 }

        	case '3': System.out.println("Enter the quantity of Rasgulla: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new Rasgulla();
			  total_weight=collect.totalwt( qnt, wt);
			  totalbox_wt=totalbox_wt+total_weight;
			  a[2]+=qnt*wt;
			  totwt=0;
			  System.out.println("Total weight of the box:" + total_weight);
			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                break;
               }	  

        case '4': System.out.println("Enter the quantity of snickers: ");
		  qnt=sc.nextInt();
		  System.out.println("Enter the weight in grams: ");
		  wt=sc.nextInt();
		  collect= new snickers();
		  total_weight=collect.totalwt( qnt, wt);
		  a[3]+=qnt*wt;
		  totwt=0;
		  totalbox_wt=totalbox_wt+total_weight;
		  System.out.println("Total weight of the box:" + total_weight);
		  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
		  System.out.println("do you want to add any other item (y/n)");
	      n1=sc.next().charAt(0);
	      if(n1=='y'|| n1=='Y')
	        { 
	    	  n=true;
	          break;
	        }
	     else
		    {
	    	 n=false;
            System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            break;
           }
	      default: System.out.println("Please select correct option from 1 to 4");
        }

        }
        System.out.println("Enter the range in which you need to have total weights of the sweets");
        int w=sc.nextInt();
        int k=sc.nextInt();

        for( i=0;i<=3;i++)
        {
        	if(a[i]<=k && a[i]>=w)
        	{
        		System.out.println(s[i]+" :" + a[i]+"\n");
        	}
        }
        sc.close();
	}
}
