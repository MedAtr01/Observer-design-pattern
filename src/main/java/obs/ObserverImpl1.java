package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl obs){
            System.out.println("********** OBS Imp 1 ***********");
            System.out.println("new state = "+obs.getState());
            System.out.println("********************************");

        }

    }
}
