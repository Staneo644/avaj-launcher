package Tower;
import java.util.ArrayList;
import java.util.List;
import Aircraft.Flyable;
public class Tower {
    List<Flyable> observers;

    public Tower() {
        observers = new ArrayList<>();
    }

    public void register(Flyable flyable) {
        observers.add(flyable);
    }
    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }
}
