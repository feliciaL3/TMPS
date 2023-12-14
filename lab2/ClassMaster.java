
public class ClassMaster {

    private String name;
    // Private constructor to prevent external instantiation
    private ClassMaster(String name) {
        this.name = name;
    }
    // Static nested class to hold the single instance
    private static class ClassMasterHolder {
        public static final ClassMaster instance = new ClassMaster("Default name");
    }
    // Public method to provide access to the single instance
    // and it provides a global point of access to that instance via the getInstance method
    public static ClassMaster getInstance(String name){
        ClassMasterHolder.instance.setName(name);
        return ClassMasterHolder.instance;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}
