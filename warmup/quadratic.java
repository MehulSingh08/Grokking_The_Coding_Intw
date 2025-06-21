import java.util.*;

public class quadratic {

    public static float[] solveQuadratic(int a, int b, int c) {
        float discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("Complex roots");
            return new float[] {}; // or throw an exception if you prefer
        }

        float sqrtDisc = (float)Math.sqrt(discriminant);
        float alpha = (-b + sqrtDisc) / (2 * a);
        float beta = (-b - sqrtDisc) / (2 * a);

        return new float[] { alpha, beta };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float[] roots = solveQuadratic(a, b, c);

        if (roots.length == 2) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        sc.close();
    }
}
