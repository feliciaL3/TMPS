
import studentypes.*;


public class StudentFactory {
    public Student getStudent(String name, Characteristic charact){
        if (charact== Characteristic.MATH){
            return new MathStudent(name, Characteristic.MATH,10,3,100);
        }
        if (charact== Characteristic.HON){
            return new HonorStudent(name, Characteristic.HON, 10,10,100);
        }
        if (charact== Characteristic.ATHL){
            return new AthleticStudent(name, Characteristic.ATHL, 7,1,90);
        }
        if (charact== Characteristic.ART){
            return new ArtisticStudent(name, Characteristic.ART, 7,1,100);
        }

        return null;
    }
}
