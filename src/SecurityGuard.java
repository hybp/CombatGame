/**
 * This is the SecurityGuard class.
 */
public class SecurityGuard extends Character {
    boolean boosted = false;

    /**
     * SecurityGuard's constructor inherits from Character's constructor.
     * @param name name of the SecurityGuard character.
     * @param power power of the SecurityGuard character.
     * @param energyLevel energyLevel of the SecurityGuard character.
     */
    public SecurityGuard(String name, int power, int energyLevel) {
        super(name, power, energyLevel);
    }

    /**
     * This updates the boosted status of the instance.
     */
    public void boost() {
        System.out.println(characterName+" boosts its laser gun!");
        boosted = true;
    }
    /**
     * This method is overridden from Character class.
     * Different amount is returned depending on the boosted status.
     */
    public int attack() {
        if (boosted) {
            boosted = false;
            System.out.println(characterName+" makes a heavy strike!");
            return power*2;
        } else {
            System.out.println(characterName+" strikes hard!");
            return power;
        }
    }
}
