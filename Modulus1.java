class Modulus1{
public static void main(String modulus[]){
    
	mod(56, 78,7);
	mod(36 ,45 , 10);
	mod(10 , 10 , 10);
	mod(39 , 20,90);
	mod(44,89,90);
	mod(33,67,78);
    mod(45,878,99);
	mod(76,78,90);
	mod(45,87,98);
	mod(13,44,66);
	mod(45,89,90);
	




}

		 
 public static int mod(int a, int b , int c){
		 System.out.println((a % b) % c);
		 return ((a % b) % c);
		 }



}