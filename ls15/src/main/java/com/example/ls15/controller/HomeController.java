package com.example.ls15.controller;

import com.example.ls15.db.DatabaseManager;
import com.example.ls15.db.entity.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller //тоже самое что и сервлет в JavaEE
public class HomeController {

    @GetMapping(value = "/") //Тоже самое что и @WebServlet(name= , value= ) doGet
    public String index(Model model){
        List<Item> items = DatabaseManager.getItems();//request.setAttribute("items",(items))
        model.addAttribute("items", items);
        return "index"; // Тоже самое что  request.getRequestDispatcher("index.jsp).forward(request,response)
    }

    @GetMapping(value = "/about")
    public String abotPage() {
        return "about";
    }


    @PostMapping(value = "/additem") //Тоже самое что и @WebServlet(name= , value= ) doPost
    public String addItem(@RequestParam(name="item-name") String name,
            @RequestParam(name = "price") Integer price){ //request.getParameter("name") - String, Long.valueOf(price)
        Item item = new Item(null, name, price);
        DatabaseManager.addItem(item);

        log.info(item.toString());
        return "redirect:/"; // request.sendRedirect("")



    }
}

