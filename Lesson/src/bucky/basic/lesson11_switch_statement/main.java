package bucky.basic.lesson11_switch_statement;

public class main {
    public  static void main (String args[]){
        int age;
        age = 3;

        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in trouble");
                break;
            default:
                System.out.println("I don't know");
                break;


        }
    }
}
