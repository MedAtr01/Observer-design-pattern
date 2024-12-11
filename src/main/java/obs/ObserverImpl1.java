package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("********** OBS Imp 1 ***********");
        System.out.println("new state = "+newState);
        System.out.println("********************************");

    }
}
