package Package;

import org.apache.commons.io.input.ObservableInputStream;

public interface Subject {

    public void addObserver(ObservableInputStream.Observer o);
    public void removeObserver(ObservableInputStream.Observer o);
    public void notifyObservers();

}
