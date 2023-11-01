package domain.models;
import java.util.ArrayList;
import java.util.List;
import domain.patterns.bridge.Cloth;

public class Database {
    private static List<Cloth> clothes = new ArrayList<>();
    private static List<String> transactions = new ArrayList<>();

    public static void addCloth(Cloth cloth) {
        System.out.println();
        clothes.add(cloth);
        displayNewRecord("New item added to the order: " + cloth.getDescription());
    }

    public static void addTransaction(String transaction) {
        transactions.add(transaction);
        displayNewRecord("Order processed: " + transaction);
    }

    public static List<Cloth> getclothes() {
        return clothes;
    }

    private static void displayNewRecord(String record) {
        System.out.println(record);
    }
}