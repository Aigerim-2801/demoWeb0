package company;

public interface Interface1 {
    default double calculate (double width, double length) {
        return width * length;
    }

    double compute (double radius);
}

