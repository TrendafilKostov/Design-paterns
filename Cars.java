package Package;

import org.apache.commons.io.input.ObservableInputStream;

import javax.security.auth.Subject;
import java.util.ArrayList;

public class Cars implements Subject {

        private ArrayList<ObservableInputStream.Observer> cars = new ArrayList<>();


        public void addObserver(ObservableInputStream.Observer o) {
            // TODO Auto-generated method stub
            this.cars.add(o);
        }


        public void removeObserver(ObservableInputStream.Observer o) {
            // TODO Auto-generated method stub
            cars.remove(cars.indexOf(o));
        }


        public void notifyObservers() {
            // TODO Auto-generated method stub

        }



}
