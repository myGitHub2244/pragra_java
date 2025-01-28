package april27.Interfaces.Food;

public interface ChineseFood extends Food{

    void addChineseSpices();

    void addIndianspices();     //method name exact same as in Interface IndianFood. It is allowed !!
                        //It does not matter multiple Interfaces it is present bcoz there is no method body hence it is same

    default int numberSpices(){
        return 3;
    }


}
