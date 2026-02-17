import java.util.Objects;

public class RationalFraction extends Number {
    private int chislitel;
    private int znamenatel;

    public RationalFraction() {
        this(10, 5);
    }

    @Override
    public int intValue() {
        int zz = chislitel / znamenatel;
        return zz;
    }

    @Override
    public double doubleValue() {
        double zzz = (double) chislitel / (double) znamenatel;
        return zzz;
    }

    @Override
    public float floatValue() {
        float zz = (float) chislitel / (float) znamenatel;
        return zz;
    }

    @Override
    public long longValue() {
        long zz = (long) chislitel / (long) znamenatel;
        return zz;
    }

    public RationalFraction(int chislitel, int znamenatel) {
        if (znamenatel != 0) {
            this.znamenatel = znamenatel;
        } else {
            throw new IllegalArgumentException("ротипал");
        }
        this.chislitel = chislitel;
    }
    public int getChislitel(){
        return this.chislitel;
    }
    public int getZnamenatel(){
        return this.znamenatel;
    }


    public boolean isProper(){
        if(Math.abs(this.chislitel) < Math.abs(this.znamenatel)){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(chislitel, znamenatel);
    }


    public RationalFraction negate(int x, int y){
        return new RationalFraction((-1) * x, y);
    }

    public int Nod(int a, int b) {
        while (b != 0) {
            int Ost = a % b;
            a = b;
            b = Ost;
        }
        return a;
    }

    public void reduce() {
        if (chislitel == 0) {
            this.chislitel = 0;
            this.znamenatel = 1;
        }
        int nod = Nod(this.chislitel, this.znamenatel);
        this.chislitel = chislitel / nod;
        this.znamenatel = znamenatel / nod;
    }

    public RationalFraction add(RationalFraction iaYstal) {
        RationalFraction res = new RationalFraction(this.chislitel * iaYstal.znamenatel + iaYstal.chislitel * this.znamenatel,
                this.znamenatel * iaYstal.znamenatel);
        res.reduce();
        return res;
    }


    public void add2(RationalFraction iaEbanutoYstal) {
        this.chislitel = this.chislitel * iaEbanutoYstal.znamenatel + iaEbanutoYstal.chislitel;
        this.znamenatel = this.znamenatel * iaEbanutoYstal.chislitel;
        reduce();
    }

    public RationalFraction sub(RationalFraction pen) {
        RationalFraction res = new RationalFraction(this.chislitel * pen.znamenatel - pen.chislitel * this.znamenatel,
                this.znamenatel * pen.znamenatel);
        res.reduce();
        return res;
    }

    public void sub2(RationalFraction is) {
        this.chislitel = chislitel * is.znamenatel - is.chislitel * this.znamenatel;
        this.znamenatel = this.znamenatel * is.znamenatel;
        reduce();
    }

    public RationalFraction mult(RationalFraction bebra) {
        RationalFraction res = new RationalFraction(this.chislitel * bebra.chislitel,
                this.znamenatel * bebra.znamenatel);
        res.reduce();
        return res;
    }

    public void mult2(RationalFraction bebra2) {
        this.chislitel = chislitel * this.znamenatel;
        this.znamenatel = this.znamenatel * bebra2.znamenatel;
        reduce();
    }

    public RationalFraction div(RationalFraction bebra3) {
        RationalFraction res = new RationalFraction(this.chislitel * bebra3.znamenatel, this.znamenatel * bebra3.chislitel);
        res.reduce();
        return res;
    }

    public void div2(RationalFraction zaza) {
        this.chislitel = this.chislitel * zaza.znamenatel;
        this.znamenatel = this.znamenatel * zaza.chislitel;
        reduce();
    }

    @Override
    public String toString() {
        String str = this.chislitel + "/" + this.znamenatel;
        return str;
    }

    public double value() {
        double DablAr = this.chislitel / this.znamenatel;
        return DablAr;
    }


    public boolean equals(RationalFraction bomb) {
        bomb.reduce();
        RationalFraction Novi = new RationalFraction(this.chislitel, this.znamenatel);
        Novi.reduce();
        if (Novi.chislitel == bomb.chislitel && Novi.znamenatel == bomb.znamenatel) {
            return true;
        }
        return false;
    }

    public int numberPart() {
        int CelaiKlian = this.chislitel / this.znamenatel;
        return CelaiKlian;
    }




}
