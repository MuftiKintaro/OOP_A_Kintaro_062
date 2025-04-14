public class HeroClass extends GameCharacterClass {
    // HeroClass inherits from GameCharacterClass

    // Constructor to initialize hero's name and health
    public HeroClass(String name, int health){
        super(name, health); //to call the constructor from the gamecharacter class
    }

    // Override the attack method to implement a stronger attack
    @Override
    public void attack(GameCharacterClass target){
        System.out.println(getName() + " attack " + target.getName() + " using phantom (headshot) "); //this is the line that is overridden from the gamecharacter class
        target.setHealth(target.getHealth() - 140); // Reduces target's health by 140 points because headshot
        System.out.println(target.getName() + " now has " + target.getHealth() + " health\n"); // Displays target's remaining health
    }
}
