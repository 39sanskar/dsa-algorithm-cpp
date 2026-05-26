package basics;


public class Area {
    public static void main(String[] args) {
        // Area of the circle => pi*r*r

        double r = 5;
        double a = 3.141592 * r * r; // decimal X integer => decimal (decimal multiply with integer we got double because of decimal priority.)
        System.out.println("Area of Circle: " + a); // 78.5398

        // Calculate the volume of the sphere
        // Volume of sphere = (4/3) * pi * r^3
        double radiusSphere = 5;
        double volumeSphere = (4.0/3.0) * 3.141592 * radiusSphere * radiusSphere * radiusSphere;
        System.out.println("Volume of Sphere: " + volumeSphere); // 523.5986666666666

        // Calculate Total Surface Area of a Cuboid l, b, h
        // Total Surface Area = 2(lb + bh + hl)
        double length = 10;
        double breadth = 5;
        double height = 3;
        double surfaceAreaCuboid = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("Total Surface Area of Cuboid: " + surfaceAreaCuboid); // 190.0
    }
}

