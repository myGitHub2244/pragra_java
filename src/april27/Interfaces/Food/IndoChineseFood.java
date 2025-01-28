package april27.Interfaces.Food;

public class IndoChineseFood extends CleanFood implements IndianFood,ChineseFood{

    @Override
    public void buyGroceries() {
        System.out.println("Buy Groceries");
    }

    @Override
    public void prepareFood() {
        System.out.println("Prepare Food");
    }

    @Override
    public void addChineseSpices() {
        System.out.println("Add Chinese Spices");
    }

    @Override
    public void addIndianspices() {
        System.out.println("Add Indian Spices");
    }

    @Override
    public int numberSpices(){
        return 8;
    }


}
