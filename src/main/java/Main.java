import obs.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.subscribe((observer) -> {
            System.out.println("+++++++++ OBS Imp 3+++++++++++");
            System.out.println("Res = "+Math.sin(((ObservableImpl)observer).getState()));
            System.out.println("+++++++++++++++++++++++++++++++");
        });
        observable.setState(60);
        observable.setState(160);
        observable.unsubscribe(observer2);
        observable.setState(90);


    }
}
