package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type)) {
            icons.put(type, new PointIcon(PointType.RESTAURANT, null));
        }

        return icons.get(type);
    }
}
