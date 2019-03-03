package edu.java.basics.ex03;

// decart system
/*
public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
*/

/*
// polar system
public class Vector {
    public double radius = 0;
    public double angle = 0;
    public double z = 0;
}
*/

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double rad, double teta, double fi) {
        this.x = rad * Math.sin(teta) * Math.cos(fi);
        this.y = rad * Math.sin(teta) * Math.sin(fi);
        this.z = rad * Math.cos(teta);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double getTeta() {
        return ((Math.atan(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) / z)) * 180) / Math.PI;
    }

    public double getFi() {
        return (Math.atan(y / x) * 180) / Math.PI;
    }
}