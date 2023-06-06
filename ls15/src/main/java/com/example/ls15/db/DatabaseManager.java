package com.example.ls15.db;

import com.example.ls15.db.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private static List<Item> items = new ArrayList();
    private static Long index = 4L;

    static {
        items.add(new Item(1L,"iphone 11",250000));
        items.add(new Item(2L,"iphone 12",350000));
        items.add(new Item(3L,"iphone 13",650000));


    }

    public static void addItem(Item item){
        item.setId(index);
        items.add(item);
        index++;
    }


    public static List<Item> getItems(){
        return items;
    }
}
