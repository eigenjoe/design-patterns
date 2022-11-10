package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var image = new Image();

        var vividFilter = new VividFilter();

        vividFilter.apply(image);

        var caramelFilter = new CaramelFilter(new Caramel());

        caramelFilter.apply(image);
    }
}
