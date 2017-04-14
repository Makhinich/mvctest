package ua.springmvc.web;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Slava on 09.04.2017.
 */
public class DAO {

    public List<Model> getModels () {
        ArrayList<Model> models = new ArrayList<>();
        models.add(new Model("Slava", 111));
        models.add(new Model("Nata", 222));
        return models;
    }
}
