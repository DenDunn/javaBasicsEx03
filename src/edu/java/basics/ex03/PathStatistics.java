package edu.java.basics.ex03;

public class PathStatistics {
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(double lengthMin) {
        this.lengthMin = lengthMin;
    }

    public double getLengthMax() {
        return lengthMax;
    }

    public void setLengthMax(double lengthMax) {
        this.lengthMax = lengthMax;
    }

    public double getLengthAvg() {
        return lengthAvg;
    }

    public void setLengthAvg(double lengthAvg) {
        this.lengthAvg = lengthAvg;
    }

    public Vector getEffectivePath() {
        return effectivePath;
    }

    public void setEffectivePath(Vector effectivePath) {
        this.effectivePath = effectivePath;
    }

    private long count = 0;
    private double lengthMin = Double.MAX_VALUE;
    private double lengthMax = 0;
    private double lengthAvg = 0;
    private Vector effectivePath;
}
