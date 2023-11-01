package domain.models;
import domain.patterns.bridge.Cloth;
import java.util.ArrayList;
import java.util.List;

public class ClothRegister {
    private List<Cloth> clothes;

    public ClothRegister() {
        this.clothes = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        clothes.add(cloth);
    }

    public List<Cloth> getclothes() {
        return clothes;
    }
}
