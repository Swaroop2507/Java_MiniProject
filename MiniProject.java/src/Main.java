import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myNumber= (int)(Math.random()*100);
//        System.out.println(myNumber);
        Scanner sc =new Scanner(System.in);
        int userNumber=0;

        do{
            System.out.println("Guess my number:");
            userNumber = sc.nextInt();

            if(userNumber ==myNumber){
                System.out.println("Whooho you have find the no. ");
                break;
            }else if(userNumber >myNumber){
                System.out.println("The number is too large");
            }else{
                System.out.println("The number is too small");
            }
        }while(userNumber<=100);
    }
}