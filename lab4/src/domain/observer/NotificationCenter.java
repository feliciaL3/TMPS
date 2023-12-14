// NotificationCenter.java
package domain.observer;

import java.util.ArrayList;
import java.util.List;

// The NotificationCenter class acts as the observable,
// maintaining a list of observers (SchoolObserver instances)
// and notifying them of changes.
public class NotificationCenter {
    private List<SchoolObserver> observers = new ArrayList<>();

    // Adds an observer to the list.
    public void addObserver(SchoolObserver observer) {
        observers.add(observer);
    }

    // Removes an observer from the list.
    public void removeObserver(SchoolObserver observer) {
        observers.remove(observer);
    }

    // Notifies all registered observers by calling their notify method with the announcement.
    public void makeAnnouncement(String announcement) {
        // Iterate through each observer and notify them of the announcement.
        for (SchoolObserver observer : observers) {
            observer.notify(announcement);
        }
    }
}


//The NotificationCenter acts as the subject,
// keeping track of all its observers and notifying them of any announcements.