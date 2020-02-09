package com.example.spring.tutorials.testing.spockmocks;

import java.util.List;

public interface ItemProvider {

    List<Item> getItems(List<String> itemIds);

}
