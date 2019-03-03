package edu.java.basics.ex03;

// decart system
/*
public class PathEvaluator {
    public PathStatistics evalPath(Vector[] path) {
        PathStatistics statistics = new PathStatistics();
        double vectLength, accumulator = 0, x = 0, y = 0, z = 0;
        for (int i = 0; i < path.length; ++i) {
            vectLength = Math.sqrt(Math.pow(path[i].getX(), 2) + Math.pow(path[i].getY(), 2) + Math.pow(path[i].getZ(), 2));
            if (vectLength < statistics.getLengthMin()) statistics.setLengthMin(vectLength);
            if (vectLength > statistics.getLengthMax()) statistics.setLengthMax(vectLength);
            accumulator += vectLength;
            x += path[i].getX();
            y += path[i].getY();
            z += path[i].getZ();
        }

        Vector vectorAcc = new Vector(x, y, z);
        statistics.setEffectivePath(vectorAcc);
        statistics.setLengthAvg(accumulator/path.length);
        statistics.setCount(path.length);

        return statistics;
    }
}
*/

/*
// polar system
public class PathEvaluator {
    public PathStatistics evalPath(Vector[] path) {
        PathStatistics statistics = new PathStatistics();
        Vector vectorAcc = new Vector();
        double vectLength, accumulator = 0, x = 0, y = 0, z = 0;
        for (int i = 0; i < path.length; ++i) {
            vectLength = Math.sqrt(Math.pow((path[i].radius * Math.cos(path[i].angle)), 2) + Math.pow((path[i].radius * Math.sin(path[i].angle)), 2) + Math.pow(path[i].z, 2)); //vector length with polar to decart coordinates conversion
            if (vectLength < statistics.getLengthMin()) statistics.setLengthMin(vectLength);
            if (vectLength > statistics.getLengthMax()) statistics.setLengthMax(vectLength);
            accumulator += vectLength;

            x += path[i].radius * Math.cos(path[i].angle);
            y += path[i].radius * Math.sin(path[i].angle);
            z += path[i].z;
        }
        statistics.setLengthAvg(accumulator/path.length);
        statistics.setCount(path.length);

        vectorAcc.radius += Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        vectorAcc.angle += (Math.atan(y / x) * 180) / Math.PI;
        vectorAcc.z += z;
        statistics.setEffectivePath(vectorAcc);

        return statistics;
    }

}
*/

public class PathEvaluator {
    public PathStatistics evalPath(Vector[] path) {
        PathStatistics statistics = new PathStatistics();
        double vectLength, accumulator = 0, x = 0, y = 0, z = 0;
        for (int i = 0; i < path.length; ++i) {
            vectLength = Math.sqrt(Math.pow(path[i].getX(), 2) + Math.pow(path[i].getY(), 2) + Math.pow(path[i].getZ(), 2));
            if (vectLength < statistics.getLengthMin()) statistics.setLengthMin(vectLength);
            if (vectLength > statistics.getLengthMax()) statistics.setLengthMax(vectLength);
            accumulator += vectLength;
            x += path[i].getX();
            y += path[i].getY();
            z += path[i].getZ();
        }

        Vector vectorAcc = new Vector(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)),
                ((Math.atan(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) / z)) * 180) / Math.PI,
                (Math.atan(y / x) * 180) / Math.PI);    //convert calculated in decart system results to cyclindric

        statistics.setEffectivePath(vectorAcc);
        statistics.setLengthAvg(accumulator/path.length);
        statistics.setCount(path.length);

        return statistics;
    }
}