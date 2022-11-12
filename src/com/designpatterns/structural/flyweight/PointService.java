package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private IconFactory iconFactory;

    public PointService(IconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }


    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(2, 3, iconFactory.getPointIcon(PointType.RESTAURANT));
        points.add(point);
        return points;
    }
}
