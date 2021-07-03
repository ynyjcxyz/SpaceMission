public final class Item {
    public final String name;
    public final  int weight;

    /**
     *
     * @param name name
     * @param weight in kg
     */
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
}