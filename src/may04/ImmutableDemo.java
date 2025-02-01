package may04;

public final class ImmutableDemo {          //final -> so that it cannot be derived to child class and inherited

    private final int id;               //private members so that these are not accessible outside this class
    private final String name;

    //Note: Constructor is must if private final instance variables were not initialized at declaration !

    public ImmutableDemo(int id, String name) {     //i think constructor should be private as well !!
        this.id = id;
        this.name = name;
    }

    //there are getter methods only ! And no setter methods !
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
