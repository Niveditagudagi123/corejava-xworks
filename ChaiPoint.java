class ChaiPoint{

static String chaiAvailable[] = {null,null,null,null};
static int index;
//add tea into cahiAvailable

public static boolean addChai(String chai){
boolean isAdded = false;


//masala tea! = null
//add or create opreration
if(chai !=null){
chaiAvailable[index] = chai;
index++;
isAdded = true;

}else{
	
	System.out.println("cannot add chai,as it is a null value");
}
    return isAdded;

}
//method 
public static void getAllChaiAvailable(){
	System.out.println("Invoking getAllChaiAvailable");
	


for(int chai=0; chai<chaiAvailable.length; chai++){
	
	String refrence = chaiAvailable[chai];
	System.out.println("Acessing chai" + refrence+ "at"+ chai);
}
System.out.println("end of getAllChaiAvailable");
}
}
