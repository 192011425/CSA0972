import java.util.*;
public class numpattern
{
	public static void main(String[] args) {
	    int j;
	    String st;
	    int k=1;
	  for(int i=1;i<5;i++)
	  {
	      st="";
	      j=1;
	      while(j<=i)
	      {
	          st=st+(k*k)+" ";
	         
	          j++;
	          k++;
	      }
	      System.out.println(st);
	  }
	  
	   
   
}  
	}
