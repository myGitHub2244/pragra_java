package april20.encapsualtion;

public class Restaurant {

    private String name;
    private boolean isDiningAllowed;
    private String menu;
    private String address;


    public Restaurant(String name, boolean isDining, String menu, String address) {
        this.name = name;
        this.isDiningAllowed = isDining;
        this.menu = menu;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public boolean isDiningAllowed() {
        return isDiningAllowed;
    }

    public String getMenu() {
        return menu;
    }

    public String getAddress() {
        return address;
    }

    public void printRestaurantDetails(){
        System.out.println(name);
        System.out.println(isDiningAllowed);
        System.out.println(name);
        System.out.println(name);
        // command + d , control + d
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", isDiningAllowed=" + isDiningAllowed +
                ", menu='" + menu + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

// TimeOfRestaurnat --->  11 am - 10 PM