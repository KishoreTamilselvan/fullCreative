class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void attack() {
        System.out.println("This is a generic attack method.");
    }
}

class Knight extends Character {
    private int swordStrength;
    public Knight(String name, int health, int swordStrength) {
        super(name, health);
        this.swordStrength = swordStrength;
    }
    public void attack() {
        System.out.println("Knight " + getName() +" Health: "+getHealth()+ " attacks with sword strength " + swordStrength);
    }
}

class Wizard extends Character {
    private int spellPower;

    public Wizard(String name, int health, int spellPower) {
        super(name, health);
        this.spellPower = spellPower;
    }
    public void attack() {
        System.out.println("Wizard " + getName() +" Health: "+getHealth()+ " casts spell with power " + spellPower);
    }
}

class Archer extends Character {
    private int bowPower;

    public Archer(String name, int health, int bowPower) {
        super(name, health);
        this.bowPower = bowPower;
    }
    public void attack() {
        System.out.println("Archer " + getName() +" Health: "+getHealth()+ " fires arrow with power " + bowPower);
    }
}

public class GameUI {
    public static void executeAttacks(Character[] characters) {
        for (int i = 0; i < characters.length; i++) {
            characters[i].attack(); // this only deals with parent class
        }
    }
    public static void main(String[] args) {
        //Storing three child object in one parent object by using upcasting
        //By using one reference we can access the multiple objects
        Character[] characters = new Character[] {
                new Knight("Sir Lancelot", 100, 50),
                new Wizard("Merlin", 80, 70),
                new Archer("Robin Hood", 90, 60)
        };
        executeAttacks(characters);
    }
}
