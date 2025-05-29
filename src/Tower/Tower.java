package Tower;
import java.util.ArrayList;
import java.util.List;
import Aircraft.Flyable;
import utils.Print;
public class Tower {
    List<Flyable> observers;

    public Tower() {
        observers = new ArrayList<>();
    }

    public void register(Flyable p_flyable) {
        Print.getInstance().print("Tower says: " + p_flyable + " registered to weather tower.");
        observers.add(p_flyable);
    }
    public void unregister(Flyable p_flyable) {
        Print.getInstance().print("Tower says: " + p_flyable + " unregistered from weather tower.");
        observers.remove(p_flyable);
    }

    protected void conditionsChanged() {
        for (int i = 0; i < observers.size(); i++) {
            Flyable flyable = observers.get(i);
            flyable.updateConditions();
        }
    }
}
