public class Triangle {
    double base;
    double height;
    double sidelenone;
    double sidelentwo;
    double sidelenthree;

    public Triangle(double base, double height, double sidelenone, double sidelentwo, double sidelenthree) {
        this.base = base;
        this.height = height;
        this.sidelenone = sidelenone;
        this.sidelentwo = sidelentwo;
        this.sidelenthree = sidelenthree;

    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}