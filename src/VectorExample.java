import java.util.*;  

public class VectorExample
{  
	public static void main(String args[])
	{  
		Vector<String> vec = new Vector<String>();  
		
		vec.add("Tiger");  
         vec.add("Lion");  
         vec.add("Dog");  
         vec.add("Elephant");

	 	vec.addElement("Rat");  
         vec.addElement("Cat");  
         vec.addElement("Deer");  
            
         System.out.println("Elements are: "+vec);  

		System.out.println("Size is: "+vec.size());  
         System.out.println("Default capacity is: "+vec.capacity());

		  System.out.println("The first animal of the vector is = "+vec.firstElement());
		
		   System.out.println("The last animal of the vector is = "+vec.lastElement());
		

		if(vec.contains("Tiger"))  
         {  
             System.out.println("Tiger present in index"
			+vec.indexOf("Tiger"));  
         }  
         else  
         {  
             System.out.println("Tiger is not present in the list."); 
		}

		System.out.println("Remove element at index 4: "
		 +vec.remove(4));  
        System.out.println("New Value list in vector: " 
		+vec); 

		 System.out.println("Hash code of this vector = "+vec.hashCode()); 
		
		 System.out.println("Element at index 1 is = "+vec.get(1));
		  
	}
}

  


