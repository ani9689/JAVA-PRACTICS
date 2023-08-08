import java.util.*; 

class treemap_example
{  
	public static void main(String args[])
	{  
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();   
 		
		NavigableMap<Integer,String> nmap=new TreeMap<Integer,String>();    

		map.put(100,"Prathmesh");    
     	map.put(102,"Franklin");    
      	map.put(101,"Traver");    
      	map.put(103,"Charlie");    

		for(Map.Entry m:map.entrySet())
		{
 			System.out.println(m.getKey()+" "+m.getValue());  
 		}    
	
		map.remove(102);  

		System.out.println("After invoking remove() method");  
		for(Map.Entry m:map.entrySet()) 
		{  
         		 System.out.println(m.getKey()+" "+m.getValue());      
  		}  
			
		nmap.put(100,"Prathmesh");    
     	nmap.put(102,"Franklin");    
      	nmap.put(101,"Traver");    
      	nmap.put(103,"Charlie");    
		
		System.out.println("descendingMap: "+nmap.descendingMap());  

		System.out.println("headMap: "+nmap.headMap(102,true)); 
		System.out.println("tailMap: "+nmap.tailMap(102,true)); 

		System.out.println("subMap: "+nmap.subMap(100, false, 102, true));   

	}
 }


	
