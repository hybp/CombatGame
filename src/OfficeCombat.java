import java.io.*;

/**
 * The OfficeCombat program implements a game that simulates
 * a combat between a student intruder and a security guard
 *
 * @author Hyeonbeom Park
 * @version 1.0
 * @since 2023-03-03
 */
public class OfficeCombat {
    /**
     * This is the main method which read input from user by keyboard and
     * formulates 2 characters from the Student and SecurityGuard classes
     * Then it simulates the combat until someone's energyLevel falls to 0 or below.
     * @param args unused
     * @exception IOException on input error
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        // Read, store input in buffer
        String sg_name = inData.readLine();
        int sg_power = Integer.parseInt(inData.readLine());
        int sg_energyLevel = Integer.parseInt(inData.readLine());
        String s_name = inData.readLine();
        int s_power = Integer.parseInt(inData.readLine());
        int s_energyLevel = Integer.parseInt(inData.readLine());

        // variables to objects
        SecurityGuard sGuard = new SecurityGuard(sg_name, sg_power, sg_energyLevel);
        Student student = new Student(s_name, s_power, s_energyLevel);

        System.out.println("Now fighting: " + sGuard.getName() + " vs. " + student.getName());

        int round = 0;
        while (!sGuard.isLose() && !student.isLose()) {
            if (round % 2 == 0) {
                // Guard attacks first. student gets damage.
                int attackAmount = sGuard.attack();
                student.hurt(attackAmount);
                if (round % 3 == 0) {
                    // Special skill
                    student.hide();
                }
            } else {
                // Student attacks
                int attackAmount = student.attack();
                sGuard.hurt(attackAmount);
                if (round % 3 == 1) {
                    // Special skill
                    sGuard.boost();
                }
            }
            round++;
        }
        if (sGuard.isLose())
            System.out.println(student.getName() + " wins! Exam paper stolen.");
        else
            System.out.println(sGuard.getName() + " wins! Exam paper is safe.");
    }
}