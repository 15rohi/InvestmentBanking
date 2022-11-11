package FinalKeyword;

public class finalkey1 {
      final static int  a=20;
       final  int b;
    public finalkey1(int k)
       {
    	   b=k;
       }
    public static void main(String[] args) {
    	
    	 
		System.out.println(a);
		finalkey1 x= new finalkey1(100);
		finalkey1 y= new finalkey1(200);
		
		System.out.println(x.b);
		System.out.println(y.b);
	}
}
