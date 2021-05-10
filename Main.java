import java.util.*;

class Main 
{
  public static void main(String[] args)
	 {  

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Marks = ");
    int marks = sc.nextInt();  
      
    if(marks<40) {  
        System.out.println("(E Grade) Fail !! ");  
    } 

    else if(marks>=40 && marks<50) {  
        System.out.println("(D Grade) Fair !! ");  
    }  

    else if(marks>=50 && marks<60) {  
        System.out.println("(C Grade) Satisfactory !! ");  
    }  

    else if(marks>=60 && marks<80) {  
        System.out.println("(B Grade) Good !! ");  
    }  

    else if(marks>=80 && marks<90) {  
        System.out.println("(A Grade) Very Good !! ");  
    }
		else if(marks>=90 && marks<100) {  
        System.out.println("(A+ Grade) Excellent !! ");  
    }
		else {  
        System.out.println("Invalid!");  
    }  

	}  

}  