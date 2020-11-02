public class Run {
    public static void main(String[] args) {

        SpacePort spacePort = new SpacePort();
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Apollon13 apollon13 = new Apollon13();

        spacePort.start(shuttle);
        System.out.println();
        spacePort.start(spaceX);
        System.out.println();
        spacePort.start(apollon13);





    }


}
