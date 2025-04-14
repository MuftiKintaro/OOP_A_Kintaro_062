public class GameCharacterClass {
    // Private attributes to store character name and health
    private String name;
    private int health;

    // Constructor that initializes both name and health
    public GameCharacterClass(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Constructor that initializes only health
    public GameCharacterClass(int health) {
        this.health = health;
    }

    // Getter method for retrieving character's name
    public String getName(){
        return name;
    }

    // Getter method for retrieving character's health
    public int getHealth(){
        return health;
    }

    // Setter method for updating character's name
    public void setName(String name){
        this.name = name;
    }

    // Setter method for updating character's health
    public void setHealth(int health){
        this.health = health;
    }

    // Method for attacking another character
    public void attack(GameCharacterClass target){
        System.out.println(name + "attack " + target.getName()  + "Using Vandal" );
    }
}
