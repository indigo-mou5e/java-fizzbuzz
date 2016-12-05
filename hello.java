public class hello{
public static void main(){
	for(int i=1;i<100;i++){
		if(i%3){
			if(i%5)
				System.out.println("fizz buzz");
			else
				System.out.println("fizz");
		}
		else{
			if(i%5)
                                System.out.println("buzz");
                        else
                                System.out.println(i);
		}


	}
}
}
