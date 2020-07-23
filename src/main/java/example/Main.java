package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static int[] getInputNumArr(){
        Scanner scanner = new Scanner(System.in);
        int[] inputNum = new int[4];
        String inputStr = scanner.nextLine();
        String[] splitStr = inputStr.split(" ");

        if (splitStr.length != 4) {
            return null;
            //System.out.println("Wrong Input，Input again");
        }else{
            for(int i=0;i<4;i++){
                inputNum[i] =  Integer.parseInt(splitStr[i]);
            }
        }
        return inputNum;
//        for(int i=0;i<4;i++){
//            System.out.println(inputNum[i]);
//        }
    }
}
