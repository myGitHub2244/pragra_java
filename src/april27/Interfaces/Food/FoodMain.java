package april27.Interfaces.Food;

public class FoodMain {

    public static void main(String[] args) {

        Food food1 = new IndoChineseFood();
        food1.prepareFood();    //Can use Obj reference of Parent-Parent Interface class to call methods of Interfaces
        food1.buyGroceries();
//        food1.addIndianspices();          --> Cannot call methods of Child-Child class using Parent-Parent Interface Obj Reference
//        food1.addChineseSpices();

        IndoChineseFood indoChinese = new IndoChineseFood();
        indoChinese.cleanFood();

        IndianFood indianFood = new IndoChineseFood();
        indianFood.buyGroceries();
        indianFood.prepareFood();
        indianFood.addIndianspices();

        ChineseFood chineseFood = new IndoChineseFood();
        chineseFood.buyGroceries();
        chineseFood.prepareFood();
        chineseFood.addChineseSpices();
        chineseFood.addIndianspices();          //this method is present in both Indian/ChineseFood
                                        // but here it refers to ChineseFood Interface bcoz we used Object reference of ChineseFood

    }

}
