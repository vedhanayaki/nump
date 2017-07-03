package guviset3;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j;
String prime="";
for( i=1;i<=100;i++){
	int c=0;
	for( j=i;j>=i;j--){
		if(i%j==0){
			c=c+1;
		}
	}
	if(c==2){
		prime=prime+i+"";
	}
}
System.out.println("Enter the prime numbers are:");
System.out.println("prime");
	}

}
