public class CodelabModul3 {
    public static void main(String[] args){
        GameCharacterClass general = new GameCharacterClass(100); // Creating a general character with default health (name not set)
        HeroClass hero = new HeroClass("Brimstone", 100);  // Creating an Hero with a name and health
        EnemyClass enemy = new EnemyClass("Viper", 150);  // Creating an Enemy with a name and health

        // Display initial character status
        System.out.println("======================================================");
        System.out.println("Initial Status: ");
        System.out.println("all character has: " + general.getHealth() + " Health");
        System.out.println(hero.getName() + " has " + hero.getHealth() + " Health (without heavy armor)");
        System.out.println(enemy.getName()+ " has " + enemy.getHealth() + " Health (+50 from heavy armor)");
        System.out.println("=======================================================");

        hero.attack(enemy);  // Hero attacks enemy
        enemy.attack(hero); // Enemy retaliates by attacking hero
    }
}
