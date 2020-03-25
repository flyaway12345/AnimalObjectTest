package animal;

public class Cat extends Mammal {
    private String breed;
    private char gender;
    public Cat(int legNum, String skinType, boolean hasTail, String breed, char gender) {
        super(legNum, skinType, hasTail);
        this.breed = breed;
        this.gender = gender;
    }
    @Override
    public void printSound(){
        System.out.println("Meow Meow");
    }
}
