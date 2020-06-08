import java.util.Scanner;

public class Player {
    String name;
    int point,hand;
    Scanner input = new Scanner(System.in);
    //creat new method called playerInfo for take Player information
    public  String playerInfo() {
        System.out.println("Welcome to Rock Paper Scissors world!");
        System.out.println("Please Entre Your name: ");
        name = input.nextLine();//take the name
        return name;// playerInfo method will return name string.
    }
//creating new method call showHand

    public int showHand() {  
        int rock=1,paper=2,scissor=3;       
        System.out.println("Please show your hand:1.Rock 2.paper 3.Scissors(input the related number):");
        int chiose= input.nextInt();//taking players chose
        switch(chiose){
            case 1:
            System.out.println(name+" chose Rock ");
            hand=rock;
            break;
            case 2:
            System.out.println(name+" chose Paper ");
            hand=paper;
            break;
            case 3:
            System.out.println(name+" chose Scissor ");
            hand= scissor;
            break;
        }
        return hand;//it will return int valu hand which is either rock/paper/scissor

    }
    

}