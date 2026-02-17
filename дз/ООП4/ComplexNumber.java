public class ComplexNumber {
    private double deistv;
    private double mnimai;

    public ComplexNumber() {
        this(1, 3);
    }

    public ComplexNumber(double deistv, double mnimai) {
        this.deistv = deistv;
        this.mnimai = mnimai;
    }

    public ComplexNumber add(ComplexNumber fullBody) {
        ComplexNumber Slozh = new ComplexNumber(this.deistv + fullBody.deistv, this.mnimai + fullBody.mnimai);
        return Slozh;
    }

    public void add2(ComplexNumber deepstick) {
        this.deistv = this.deistv + deepstick.deistv;
        this.mnimai = this.mnimai + deepstick.mnimai;
    }

    public ComplexNumber sub(ComplexNumber lipsteek) {
        ComplexNumber VV = new ComplexNumber(this.deistv - lipsteek.deistv, this.mnimai - lipsteek.mnimai);
        return VV;
    }

    public void sub2(ComplexNumber svistok) {
        this.deistv = this.deistv - svistok.deistv;
        this.mnimai = this.mnimai - svistok.mnimai;
    }

    public ComplexNumber multNumber(double Ivan) {
        return new ComplexNumber(this.deistv * Ivan, this.mnimai * Ivan);
    }

    public void multNumber2(double Kola) {
        this.deistv *= Kola;
        this.mnimai *= Kola;
    }

    public ComplexNumber mult(ComplexNumber PetrSvinSaninaTvar) {
        double deist = this.deistv * PetrSvinSaninaTvar.deistv - this.mnimai * PetrSvinSaninaTvar.mnimai;
        double mnim = this.deistv * PetrSvinSaninaTvar.mnimai + this.mnimai * PetrSvinSaninaTvar.deistv;
        ComplexNumber newYmnogh = new ComplexNumber(deist, mnim);
        return newYmnogh;
    }

    public void mult2(ComplexNumber AinurSvinka) {
        this.deistv = this.deistv * AinurSvinka.deistv - this.mnimai * AinurSvinka.mnimai;
        this.mnimai = this.deistv * AinurSvinka.mnimai + this.mnimai * AinurSvinka.deistv;
    }

    public ComplexNumber div(ComplexNumber VikaPiva) {
        ComplexNumber deli = new ComplexNumber(VikaPiva.deistv, -VikaPiva.mnimai);
        double deist = (double) (this.deistv * VikaPiva.deistv + this.mnimai * VikaPiva.mnimai) / (VikaPiva.deistv * VikaPiva.deistv + VikaPiva.mnimai * VikaPiva.mnimai);
        double mnim = (double) (this.deistv * VikaPiva.mnimai + this.mnimai * VikaPiva.deistv) / (VikaPiva.deistv * VikaPiva.deistv + VikaPiva.mnimai * VikaPiva.mnimai);
        ComplexNumber itog = new ComplexNumber(deist, mnim);
        return itog;
    }

    public void div2(ComplexNumber DashaFreak) {
        double dei = deistv;
        this.deistv = (double) (this.deistv * DashaFreak.deistv + this.mnimai * DashaFreak.mnimai) / (DashaFreak.deistv * DashaFreak.deistv + DashaFreak.mnimai * DashaFreak.mnimai);
        this.mnimai = (double) (dei * -DashaFreak.mnimai + this.mnimai * DashaFreak.deistv) / (DashaFreak.deistv * DashaFreak.deistv + DashaFreak.mnimai * DashaFreak.mnimai);
        System.out.println(this.mnimai);
    }

    public double length() {
        double z = Math.sqrt(this.deistv * this.deistv + this.mnimai * this.mnimai);
        return z;
    }

    @Override
    public String toString() {
        if (this.mnimai > 0) {
            String str = (int) this.deistv + " + " + (int) this.mnimai + " * i";
            return str;
        } else {
            String str = (int) this.deistv + " - " + (int) -this.mnimai + " * i";
            return str;
        }
    }

    public double arg() {
        double fi = Math.atan(this.mnimai / this.deistv);
        return fi;
    }

    public ComplexNumber pow(double stepen) {
        double z = this.length();
        double fi = this.arg();
        double deist = Math.pow(z, stepen) * Math.cos(fi * stepen);
        double mnim = Math.pow(z, stepen) * Math.sin(fi * stepen);
        return new ComplexNumber(deist, mnim);
    }


    public boolean equals(ComplexNumber Complex1500) {
        if (this.deistv == Complex1500.deistv && this.mnimai == Complex1500.mnimai) {
            return true;
        }
        return false;
    }


}
