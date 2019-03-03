package edu.java.basics.ex03;
import java.util.Random;

// decart system
/*
public class PathApplication {
    public static void main (String[] args) {
        Vector[] vectors = new Vector[Integer.parseInt(args[0])];
        Random generator = new Random();
        PathEvaluator pathEvaluator = new PathEvaluator();
        PathStatistics statistics;

        // fill in vectors with values
        for (int i = 0; i < vectors.length; ++i) {
            Vector vector = new Vector(generator.nextInt(21) - 10, generator.nextInt(21) - 10, generator.nextInt(21) - 10);
            vectors[i] = vector;
        }

        statistics = pathEvaluator.evalPath(vectors);

        System.out.println("Max length: " + statistics.getLengthMax());
        System.out.println("Min length: " + statistics.getLengthMin());
        System.out.println("Avg length: " + statistics.getLengthAvg());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Effective path x: " + statistics.getEffectivePath().getX());
        System.out.println("Effective path y: " + statistics.getEffectivePath().getY());
        System.out.println("Effective path z: " + statistics.getEffectivePath().getZ());
    }
}
*/

/*
//polar system
public class PathApplication {
    public static void main (String[] args) {
        Vector[] vectors = new Vector[Integer.parseInt(args[0])];
        Random generator = new Random();
        PathEvaluator pathEvaluator = new PathEvaluator();
        PathStatistics statistics;

        // fill in vectors with values
        for (int i = 0; i < vectors.length; ++i) {
            Vector vector = new Vector();
            vector.radius = generator.nextInt(10) + 1;
            vector.angle = generator.nextInt(360) + 1;
            vector.z = generator.nextInt(21) - 10;
            vectors[i] = vector;
        }

        statistics = pathEvaluator.evalPath(vectors);

        System.out.println("Max length: " + statistics.getLengthMax());
        System.out.println("Min length: " + statistics.getLengthMin());
        System.out.println("Avg length: " + statistics.getLengthAvg());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Effective path radius: " + statistics.getEffectivePath().radius);
        System.out.println("Effective path angle: " + statistics.getEffectivePath().angle);
        System.out.println("Effective path z: " + statistics.getEffectivePath().z);
    }
}
*/

public class PathApplication {
    public static void main (String[] args) {
        Vector[] vectors = new Vector[Integer.parseInt(args[0])];
        Random generator = new Random();
        PathEvaluator pathEvaluator = new PathEvaluator();
        PathStatistics statistics;

        // fill in vectors with values
        for (int i = 0; i < vectors.length; ++i) {
            Vector vector = new Vector(generator.nextInt(10) + 1, generator.nextInt(180) + 1, generator.nextInt(360) + 1);
            vectors[i] = vector;
        }

        statistics = pathEvaluator.evalPath(vectors);

        System.out.println("Max length: " + statistics.getLengthMax());
        System.out.println("Min length: " + statistics.getLengthMin());
        System.out.println("Avg length: " + statistics.getLengthAvg());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Effective path radius: " + statistics.getEffectivePath().getRadius());
        System.out.println("Effective path Teta: " + statistics.getEffectivePath().getTeta());
        System.out.println("Effective path Fi: " + statistics.getEffectivePath().getFi());
    }
}