
import studentypes.*;


public class StudentFactory {
    public Student getStudent(String name, Characteristic charact) {
        switch (charact) {
            case MATH:
                return new MathStudent(name, charact, 10, 3, 100);
            case HON:
                return new HonorStudent(name, charact, 10, 10, 100);
            case ATHL:
                return new AthleticStudent(name, charact, 7, 1, 90);
            case ART:
                return new ArtisticStudent(name, charact, 7, 1, 100);
            default:
                return null;
        }
    }
}
