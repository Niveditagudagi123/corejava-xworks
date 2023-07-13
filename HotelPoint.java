class HotelPoint {


String location = "RR nagar";

static String tiffin = "Masala Dosa";
static String tiffin1 = "Idli";
static String tiffin2 = "Rice bath";
static String tiffin3 = "Rava Dosa";
static String tiffin4 = "Plain Dos";
static String tiffin5 = "poha";
static String tiffin6 = "palava";
static String tiffin7 = "vada";
static String tiffin8 = "Upama";
static String tiffin9 = "tea";


static String tiffinAvailable[] = {tiffin,tiffin1,tiffin2,tiffin3,tiffin4,tiffin5,tiffin6,tiffin7,tiffin8,tiffin9};

//method

public static void getAlltiffinAvailable(){
System.out.println("invoking getAlltiffinAvailable");
/* for(String individualtiffin : tiffinAvailable){
	System.out.println(individualtiffin);
}*/

for(int tiffin=0; tiffin< tiffinAvailable.length; tiffin++){
String refrence = tiffinAvailable[tiffin];
// tiffinAvailable[0];
System.out.println(refrence);

}
System.out.println("end of the getAlltiffinAvailable");



}
} 






