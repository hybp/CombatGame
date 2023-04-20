/**
 * This is the Student class
 */
public class Student extends Character{
    boolean hidden = false;

    /**
     * Student's constructor inherits from Character's constructor
     * @param name name of the Student instance
     * @param power power of the Student instance
     * @param energyLevel energyLevel of the Student instance
     */
    public Student(String name, int power, int energyLevel) {
        super(name, power, energyLevel);
    }

    /**
     * This method updates the hidden status of the instance
     */
    public void hide() {
        hidden = true;
        System.out.println(characterName+" hides itself from attacks!");
    }
    /**
     * This method is overridden from Character class.
     * Different amount is returned depending on the boosted status.
     */
    void hurt(int amount) {
        if (!hidden) {
            super.hurt(amount);
        }
        else{
            System.out.println(characterName+" hides from the attack!");
            hidden = false;
        }
    }
}
