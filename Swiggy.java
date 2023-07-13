class Swiggy {

public static double search(String foodName, int quantity){

if("Panneer Butter Masala" == foodName){

System.out.println("Search food name is " + foodName + "with quantity is" + quantity);
return 157.58*quantity;


}
   if("Pani Puri" == foodName) {
System.out.println("Search food name is " + foodName + "with quantity is" + quantity);
   
   return 40.00*quantity;
   }  
   
   if("Dal Makhani" == foodName){
	   System.out.println("search food name is " + foodName + "with quantity is" + quantity);
	   return 199.00*quantity;
   }
   
   if("Baby Corne Marchuri" == foodName) {
System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 100.00*quantity;	   
   }
   
   if("Vada Pav" == foodName) {
	 System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
 return 55.00*quantity;
   }
   
   if("Stuffed Paratha" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 120.00*quantity;
 }
 
   if("Gulajamuna" == foodName){
	System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
return 90.04*quantity;	   
   }
   
   if("Barfi" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
return 160.66*quantity;	
	  
   } 
   
   if("Apple Juice" == foodName){
	System.out.println("search food name is " + foodName + "with quantity is" + quantity);
	return 50.00*quantity;
	  }
	if("Masala Chai" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 25.00*quantity;
	}
	
	if("Green Tea" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 50.00*quantity;
	}
	if("Idli" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 35.00*quantity;
	}
	if("Poha" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 30.00*quantity;
	}
	if("Chocolate Milk Shake" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 50.00*quantity;
	}
	
	
if("Samosa" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 25.00*quantity;
		
	}
	if("Udin Vada" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 25.00*quantity;
	}
	
	if("Upma" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 45.00*quantity;
	}
	
	if("Sand Wich" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 45.00*quantity;
	}

	if("Bombay Sandwich" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 70.00*quantity;
	}
	
	if("Momos" == foodName){
		System.out.println("serach food name is " + foodName + "with quantity is" + quantity);
		return 45.00*quantity;
	}
   return 0.0;
   
}
}