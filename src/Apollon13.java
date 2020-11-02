import java.util.Random;
import java.util.Scanner;

public class Apollon13 implements IStart{

    @Override
    public boolean preStartCheck() {
        boolean result = false;
        Random random = new Random();
        int randNumber = random.nextInt(1001);
        //System.out.println(randNumber);
        System.out.println("Enter your favorite number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if ( randNumber%number == 0){
            result = true;
        }
        return result;
    }

    @Override
    public void enginesStart() {
        System.out.println("Engines have a good start, all systems is OK, doors and hatches closed,\n" +
                "red beacon is on, ready to start!");
    }

    @Override
    public void start() {
        System.out.println("Fasten belts, we will take-off! Hello galaxy!");
    }
}
