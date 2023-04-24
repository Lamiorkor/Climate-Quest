public class Item {
    private String name;
    private String effect;

    public Item(String name,String effect){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                '}';
    }
}
