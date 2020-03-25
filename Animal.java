package animal;

import java.util.Scanner;

class Animal {
    public boolean isAlive;
    Animal(){}
    public Animal(boolean isAlive){

        this.isAlive = isAlive;
    }
    public boolean checkIfExtint(){
        boolean check = true;
        System.out.println("Is " + isAlive + "Extinct?" + "Y or N" );
        Scanner scan = new Scanner(System.in);
        String inputA = scan.nextLine();
        if(inputA.equals("Y")){
            return true;
        }else if(inputA.equals("N")){
            return false;
        }else{
            System.out.println("Invalid input try again");
            checkIfExtint();
        }
        return check;
    }
    public void printSound(){
        System.out.println("All Animals Make sounds");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "genus='" + isAlive + '\'' +
                '}';
    }


}