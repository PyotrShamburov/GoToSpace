import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preStartCheck() {
        Random random = new Random();
        int number = random.nextInt(11);
        System.out.println(number);
        boolean result = false;
        if ( number > 3){
            result = true;
        }
        return result;
    }

    @Override
    public void enginesStart() {
        System.out.println("Shuttle engines have been started!\n" +
                "All systems are OK!");
    }

    @Override
    public void start() {
        System.out.println("Shuttle start!!!\n" +
                "ПОЕХАЛИ!!!");
    }
}
