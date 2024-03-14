public class Item {
      public String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    protected String ID;
    int price;

    public void showInfo(){
        System.out.println("name: "+this.name);
        System.out.println("description: "+this.getDescription());
        System.out.println("ID: "+this.ID);
    }

    public Item(String name, String description, String ID, int price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }
}
