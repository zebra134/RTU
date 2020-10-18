package ru.zebra134.RTU.Pr12;

public enum Planet {
    Mercury(24390, 3.285*Math.pow(10,23)),
    Venus (60510, 4.867*Math.pow(10,24)),
    Earth(63710, 5.972*Math.pow(10,24)),
    Mars (33890, 6.39*Math.pow(10,23)),
    Jupiter (69910, 1.898*Math.pow(10,27)),
    Saturn (58230, 5.683*Math.pow(10,26)),
    Uranus (25360, 8.681*Math.pow(10,25)),
    Neptune (24620, 1.024*Math.pow(10,26));
    public double radius;
    public double mass;

    Planet(double radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }
//    int g(){
//        double G = 6.67*Math.pow(10,-11);
//        double g = G*this.mass/Math.pow(this.radius,2);
//        return (int)g;
//    }
}