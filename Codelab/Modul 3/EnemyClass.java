public class EnemyClass extends GameCharacterClass {
    // HeroClass inherits from GameCharacterClass

    // Constructor to initialize hero's name and health
    public EnemyClass(String name, int health){
        super(name, health); //to call the constructor from the gamecharacter class
    }

    // Override the attack method to implement a stronger attack
    @Override
    public void attack(GameCharacterClass target){
        System.out.println(getName() + " attack " + target.getName() + " using vandal "); //this is the line that is overridden from the gamecharacter class
        target.setHealth(target.getHealth() - 40); // Reduces target's health by 40 points because only one hit body
        System.out.println(target.getName() + " now has " + target.getHealth() + " health"); // Displays target's remaining health
    }
}