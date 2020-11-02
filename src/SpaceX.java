import java.util.Scanner;

public class SpaceX implements IStart{

    @Override
    public boolean preStartCheck() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter check number 0 or 1: ");
        int number = in.nextInt();
        boolean result = (number == 1);
        return result;
    }

    @Override
    public void enginesStart() {
        System.out.println("Engines are starting...\n" +
                "System are checking...\n" +
                "Done, all is OK");
    }

    @Override
    public void start() {
        System.out.println("Start! Go to stars!");
    }
}
