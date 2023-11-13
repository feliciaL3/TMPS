//SchoolObserver.java
package domain.observer;

public interface SchoolObserver {
    void update(String message);

    void notify(String announcement);
}

//The SchoolObserver interface declares methods that observers must implement to receive and process notifications.