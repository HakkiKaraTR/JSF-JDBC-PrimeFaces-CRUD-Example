package entity;

import java.util.Date;

public class Category {

    private int category_id;
    private String name;
    private Date last_update;

    public Category(int category_id, String name, Date last_update) {
        this.category_id = category_id;
        this.name = name;
        this.last_update = last_update;
    }

    public Category() {
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", name='" + name + '\'' +
                ", last_update=" + last_update +
                '}';
    }
}