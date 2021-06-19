package Ch8_Classes;

public class Rectangle {
    private float lenght;
    private float width;

    @Override
    public String toString() {
        return String.format("Length = %.2f Width = %.2f", lenght, width);
    }

    public float area() {
        return getWidth() * getLenght();
    }

    public float perimeter() {
        return getWidth() + getLenght() + getWidth() + getLenght();
    }

    public Rectangle() {
        this.lenght = 1;
        this.width = 1;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        if (lenght < 0.0 || lenght > 20.0) {
            throw new IllegalArgumentException("lenght was out of range");
        }
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException("width was out of range");
        }
        this.width = width;
    }
}
