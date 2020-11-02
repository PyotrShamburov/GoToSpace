public class SpacePort {
    private IStart iStart;

    public void start(IStart iStart) {
        if (iStart.preStartCheck() == false) {
            System.out.println("Before start check failed!");
        } else {
            System.out.println("Countdown start: ");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            iStart.enginesStart();
            iStart.start();
        }
    }
}
