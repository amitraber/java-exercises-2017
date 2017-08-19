package il.co.electriccollege.restaraunt.dishes;

/**
 * Created by borka on 8/19/2017.
 */
public class Dish {
    private String name;
    private  int id;
    private  String description;
    private  float price;
    private int preparationTime;

    public Dish(String name, int id, String description, float price, int preparationTime) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                '}';
    }
}
