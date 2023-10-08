
public class ClassMaster {

    private String name;
    private ClassMaster(String name) {
        this.name = name;
    }

    private static class ClassMasterHolder {
        public static final ClassMaster instance = new ClassMaster("Default name");
    }

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
