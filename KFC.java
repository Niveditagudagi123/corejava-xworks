class KFC {

public static double search(String foodName){

if("Big 12" == foodName){

System.out.println("Search food name is " + foodName);
return 712.00;
}
   if("Veggie Twister" == foodName) {
System.out.println("Search food name is " + foodName);
   return 249.88;
   }  
   
   if("Veggie Colonel" == foodName){
	   System.out.println("search food name is " + foodName);
	   return 450.00;
   }
   
   if("Corn Cob" == foodName) {
System.out.println("search food name is " + foodName);
return 99.00;	                                                    // return always adding the data basrd on the requrement the return  type
   }                                                                   // method is also a value 
   
   if("KFC Vegan Burger" == foodName) {
	 System.out.println("serach food name is " + foodName);
 return 100.00;
   }
   
   if("Curry Sauce" == foodName){
	System.out.println("search food name is " + foodName);
return 140.00;
 }
 
   if("Freach Fryies" == foodName){
	System.out.println("serach food name is " + foodName);
return 50.04;	   
   }
   
   if("Cold Coffce" == foodName){
	System.out.println("search food name is " + foodName);
return 150.00;	
	  
   } 
   
   if("Coco Cola" == foodName){
	System.out.println("search food name is " + foodName);
	return 100.00;
	  }
	if("Veg Zinger Box" == foodName){
		System.out.println("serach food name is " + foodName);
		return 55.00;	
	}
	
	if("Veg Rice Bowl" == foodName){
		System.out.println("serach food name is " + foodName);
		return 75.00;			
	}
		if("Veg Strip" == foodName){
		System.out.println("serach food name is " + foodName);
		return 100.00;	
		}	
		if("Veg Rockin" == foodName){
		System.out.println("serach food name is " + foodName);
		return 150.00;	
		}	
		if("Wednesday Bucket" == foodName){
		System.out.println("serach food name is " + foodName);
		return 267.00;                                                   	
		}	
		if("Family Feast" == foodName){
		System.out.println("serach food name is " + foodName);
		return 550.00;	
		}	
		if("8pc Hot" == foodName){
		System.out.println("serach food name is " + foodName);
		return 200.00;	
		}	
		if("Crispy Chicken" == foodName){
		System.out.println("serach food name is " + foodName);
		return 55.00;	
		}	
		if("Burger" == foodName){
		System.out.println("serach food name is " + foodName);
		return 155.00;	
		}	
		if("Veg Burger" == foodName){
		System.out.println("serach food name is " + foodName);
		return 105.00;	
		}	
		if("Per Peri" == foodName){
		System.out.println("serach food name is " + foodName);
		return 105.00;	
		}	

   return 0.0;                                                 //  return statement is the last line of the program
   
}





// 


public static double search(String foodName,  int quantity){

if("Big 12" == foodName){

System.out.println("Search food name is " + foodName + "with quantity is" + quantity);
return 712.00*quantity;
}
   if("Veggie Twister" == foodName) {
System.out.println("Search food name is " + foodName + "with quantity is" + quantity);
   return 249.88*quantity;
   }  
   
   if("Veggie Colonel" == foodName){
	   System.out.println("search food name is " + foodName + "with quantity is" + quantity);
	   return 450.00*quantity;
   }
   
   if("Corn Cob" == foodName) {
System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 99.00*quantity;	                                                   
   }                                                                  
   
   if("KFC Vegan Burger" == foodName) {
	 System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
 return 100.00*quantity;
   }
   
   if("Curry Sauce" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 140.00*quantity;
 }
 
   if("Freach Fryies" == foodName){
	System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
return 50.04*quantity;	   
   }
   
   if("Cold Coffce" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 150.00*quantity;	
	  
   } 
   
   if("Coco Cola" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
	return 100.00*quantity;
	  }
	  
	if("Veg Zinger Box" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 55.00*quantity;	
	}
	
	if("Veg Rice Bowl" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 75.00*quantity;			
	}
		if("Veg Strip" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 100.00*quantity;	
		}	
		if("Veg Rockin" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" +quantity);
		return 150.00*quantity;	
		}	
		if("Wednesday Bucket" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 267.00*quantity;                                                   	
		}	
		if("Family Feast" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 550.00*quantity;	
		}	
		if("8pc Hot" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 200.00*quantity;	
		}	
		if("Crispy Chicken" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 55.00*quantity;	
		}	
		if("Burger" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 155.00*quantity;	
		}	
		if("Veg Burger" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 105.00*quantity;	
		}	
		if("Per Peri" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 105.00*quantity;	
		}	

   return 0.0;                                                 //  return statement is the last line of the program
   
}
}