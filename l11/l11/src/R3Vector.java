public class R3Vector {
    private double x, y, z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public R3Vector() {
        x = 0;
        y = 0;
        z = 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public void vectorSum(R3Vector vec) {
        x += vec.x;
        y += vec.y;
        z += vec.z;
    }

    public static R3Vector vectorSum(R3Vector v1, R3Vector v2) {
        return new R3Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public void mutliplyVectorByNumber(double num) {
        x *= num;
        y *= num;
        z *= num;
    }

    public static R3Vector multiplyVectorByNumber(R3Vector vec, double num) {
        return new R3Vector(vec.x * num, vec.y * num, vec.z * num);
    }

    public double scalarMultiply(R3Vector vec) {
        return x * vec.x + y * vec.y + z * vec.z;
    }

    public static double scalarMultiply(R3Vector v1, R3Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    public void vectorMultiply(R3Vector vec) {
        double newX = y * vec.z - z * vec.y;
        double newY = z * vec.x - x * vec.z;
        double newZ = x * vec.y - y * vec.x;

        x = newX;
        y = newY;
        z = newZ;
    }

    public static R3Vector vectorMultiply(R3Vector v1, R3Vector v2) {
        return new R3Vector(
                v1.y * v2.z - v1.z * v2.y,
                v1.z * v2.x - v1.x * v2.z,
                v1.x * v2.y - v1.y * v2.x);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int compareTo(R3Vector vec) {
        if (this.length() == vec.length())
            return 0;
        if (this.length() > vec.length())
            return 1;
        return -1;
    }

    public static int compare(R3Vector v1, R3Vector v2) {
        if (v1.length() == v2.length())
            return 0;
        if (v1.length() > v2.length())
            return 1;
        return -1;
    }
}
