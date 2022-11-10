package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {


    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
