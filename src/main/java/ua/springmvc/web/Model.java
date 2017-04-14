package ua.springmvc.web;

/**
 * Created by Slava on 09.04.2017.
 */
public class Model {
    public String name;
    public int id;

    public Model(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
