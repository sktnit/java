package Demo1;

public class ConstructerOverloading {
  
	ConstructerOverloading(int a, float b)  
    {  
        System.out.println("Float: a = "+a+" b = "+b);  
    }  
	
	ConstructerOverloading(float a, int b)  
    {  
        System.out.println("Int: a = "+a+" b = "+b);  
    }
	
    public static void main (String args[])  
    {  
        byte a = 10;   
        byte b = 15;  
        ConstructerOverloading c = new ConstructerOverloading(a,b);  
    } 

}
