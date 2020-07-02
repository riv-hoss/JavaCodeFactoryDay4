
import java.util.*;
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
                System.out.print(i + " ");
            }
        } else{
            for(int i = startNum; i<endNum; i = i+2){
                System.out.print(i + " ");
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

    public static void findX(){
        int[] myArray = {1,2,2,3,1,8,9,7,2,9};
        int counterNum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your guess number between 0 and 10: ");
        int x = in.nextInt();

        for(int i : myArray){
            if(x == i){
                counterNum++;
            }
        }
        if(counterNum == 0){
            System.out.println("Nothing found!");
        } else{
            System.out.printf("The number '%d' occurs %d times in following array.\n", x, counterNum);
            System.out.println(Arrays.toString(myArray));
        }
    }



    // ---------------------------------------- A6 ------------------------------------------------

    public static void fillAndPrint(){
        int[] myArray = {1,4,5,2,8,9,12,44,52,15};
        for(int i: myArray){
            System.out.print(i + " ");
        }
    }


    // ---------------------------------------- A7 ------------------------------------------------

    public static void printArrayInReverse(){
        int[] myArray;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();


        System.out.println(num1 + " " + num2);

    }




    // ---------------------------------------- A8 ------------------------------------------------





    // ---------------------------------------- A9 ------------------------------------------------





    // ---------------------------------------- A10 ------------------------------------------------





    // ---------------------------------------- A11 ------------------------------------------------





    // ---------------------------------------- A12 ------------------------------------------------






    public static void main(String[] args) {
        oddNumInYourRange();
    }
}
