import java.util.Scanner;
public class Main {

    // ---------------------------------------- A1 ------------------------------------------------

    public static void loopCounter(){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);

        }
    }


    // ---------------------------------------- A2 ------------------------------------------------

    public static void evenNumCounter(){
        for(int i = 2; i <= 100; i = i+2){
            System.out.println(i);

        }
    }



    // ---------------------------------------- A3 ------------------------------------------------

    public static void oddNumInYourRange(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a starting number: ");
        int startNum = in.nextInt();
        System.out.print("Please enter an ending number: ");
        int endNum = in.nextInt();

        if (startNum % 2 ==0){
            for(int i=startNum+1; i<endNum; i = i+2){
                System.out.print(i + ", ");
            }
        } else{
            for(int i = startNum; i<endNum; i = i+2){
                System.out.print(i + ", ");
            }
        }
    }




    // ---------------------------------------- A4 ------------------------------------------------

    public static void sumCal(){
        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Until what? ");
        int inp = in.nextInt();
        for(int i = 1; i <= inp; i++){
            result = result +i;
        }
        System.out.printf("Sum is %d.", result);
    }



    // ---------------------------------------- A5 ------------------------------------------------







    // ---------------------------------------- A6 ------------------------------------------------



    public static void main(String[] args) {
        sumCal();
    }
}
