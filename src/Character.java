/**
 * This is the parent class of 2 subclasses.
 * It consists of 3 variables and 4 variables.
 */
public class Character {
    String characterName;
    int power;
    int energyLevel;

    /**
     * This is the Character class for characters who will be featured in the combat simulation.
     * A Character object is constructed with 3 parameters.
     * @param name Name of the character.
     * @param power Power of the character. Used in attack method.
     * @param energyLevel EnergyLevel of the character. The value will be changed by hurt method.
     */
    public Character(String name, int power, int energyLevel) {

        this.characterName = name;
        this.power = power;
        this.energyLevel = energyLevel;
    }

    /**
     * @return name of the Character instance.
     */
    String getName() {
        return characterName;
    }

    /**
     * Reduces the energyLevel of the instance.
     * @param amount This is the amount reduced.
     */
    void hurt(int amount) {
        energyLevel -= amount;
        System.out.println(characterName+" takes a hurt of "+Integer.toString(amount)+"! Remaining energy becomes "+Integer.toString(energyLevel)+".");
    }

    /**
     * This simulates an attack from the instance.
     * @return the amount of damage to be dealt.
     */
    int attack() {
        System.out.println(characterName+" launches an attack!");
        return power;
    }

    /**
     * Keeps the win/lose status of the instance.
     * @return whether the instance has lost.
     */
    boolean isLose() {
        return energyLevel <= 0;
    }

}
