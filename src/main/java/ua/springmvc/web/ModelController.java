package ua.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ModelController {

    private DAO dao = new DAO();


    @RequestMapping(value = "/models")
    public String employees(Map<String, Object> model) {
        model.put("models", dao.getModels());
        return "models";
    }

//    когда имя передаем как параметр
//    @RequestMapping(value = "/model")
//    public ModelAndView employee(@RequestParam("modelName") String modelName) {

//    когда имя часть юрл
    @RequestMapping(value = "/model/{modelName}")
    public ModelAndView employee(@PathVariable String modelName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("model");
        Model model = new Model("", 0);
        for (Model m: dao.getModels()){
            if (m.getName().equals(modelName)) {
                model=m;
                break;
            }
        }
        modelAndView.addObject("model", model);
        return modelAndView;
    }
}
