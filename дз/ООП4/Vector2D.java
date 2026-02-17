public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
        this(2, 3);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D VictorEpta) {
        return new Vector2D(this.x + VictorEpta.x, this.y + VictorEpta.y);
    }

    public void add2(Vector2D Wiktor) {
        this.x += Wiktor.x;
        this.y += Wiktor.y;
    }

    public Vector2D sub(Vector2D ViktorSvin) {
        return new Vector2D(this.x - ViktorSvin.x, this.y - ViktorSvin.y);
    }

    public void sub2(Vector2D ViktorVaiper) {
        this.x -= ViktorVaiper.x;
        this.y -= ViktorVaiper.y;
    }

    public Vector2D mult(double DablAr) {
        return new Vector2D(this.x * DablAr, this.y * DablAr);
    }

    public void mult2(double SinSobaki) {
        this.x *= SinSobaki;
        this.y *= SinSobaki;
    }

    public String toString() {
        String str = this.x + ", " + this.y;
        return str;
    }

    public double pow(double x) {
        return Math.sqrt(x);
    }

    public double lengt(double x, double y) {
        double len = (pow(x * x + y * y));
        return len;
    }

    public double scalarProduct(Vector2D VictorLgbtshnik) {
        double proizv = this.x * VictorLgbtshnik.x + this.y * VictorLgbtshnik.y;
        return proizv;
    }

    public double cos(Vector2D ViktorDudka) {
        double cos = scalarProduct(ViktorDudka) / (lengt(this.x, this.y) * lengt(ViktorDudka.x, ViktorDudka.y));
        return cos;
    }

    public boolean equals(Vector2D ViktorSanina) {
        if (this.x - ViktorSanina.x == 0 && this.y - ViktorSanina.y == 0) {
            return true;
        }
        return false;
    }
}
