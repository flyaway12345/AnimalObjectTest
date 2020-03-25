package animal;

public class Mammal extends Animal {
    private int legNum;
    private String skinType;
    private boolean hasTail;

    public Mammal(int legNum, String skinType, boolean hasTail){
        this.legNum = legNum;
        this.skinType = skinType;
        this.hasTail = hasTail;
        }

@Override
public void printSound(){
    System.out.println("sounds of the warmblooded veriaty");
}
}