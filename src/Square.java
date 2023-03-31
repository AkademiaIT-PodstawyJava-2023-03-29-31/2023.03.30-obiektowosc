public class Square {
    int side;
    int field;
    int circle;

    Square(int side1) {
        side = side1;
        field = side1 * side1;
        circle = side1 * 4;
    }
}
