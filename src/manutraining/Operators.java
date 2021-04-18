package manutraining;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//Arithmetic operators-------> + ,-. * , / , %
		System.out.println("Sum of a and b:"+(a+b));
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//Relational Operators ------> == ,< > ,<=  ,>=  !=
        // Always returns boolean value
		
		System.out.println(a==b); // false
		System.out.println(a>b);  //false
		System.out.println(a<b);  // true
		System.out.println(a>=b); //false
		System.out.println(a<=b);  // true
		System.out.println(a!=b);  //true 
		
		//Logical Operators -----------> &&  ||  !
		 
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y); 
		System.out.println(x||y);  
		System.out.println(!y);  
		
		//Increment or decrement operators --------------->  ++  ,  --
		a=10;
		  a--;              //a=a+1;
		System.out.println(a);
				
	
	}

}
