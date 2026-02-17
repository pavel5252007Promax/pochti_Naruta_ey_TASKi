public class Matrix2x2 {
    private double[][] Matrix;

    public Matrix2x2() {
        this.Matrix = new double[2][2];
    }

    public Matrix2x2(double chislo) {
        this.Matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.Matrix[i][j] = chislo;
            }
        }
    }

    public Matrix2x2(double[][] arr) {
        this.Matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.Matrix[i][j] = arr[i][j];
            }
        }
    }

    public Matrix2x2(double x, double y, double z, double w) {
        this.Matrix = new double[2][2];
        this.Matrix[0][0] = x;
        this.Matrix[0][1] = y;
        this.Matrix[1][0] = z;
        this.Matrix[1][1] = w;
    }

    public Matrix2x2 add(Matrix2x2 arr) {
        double[][] res = new double[2][2];
        this.Matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = this.Matrix[i][j] + arr.Matrix[i][j];
            }
        }
        return new Matrix2x2(res);
    }

    public void add2(Matrix2x2 arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < j; j++) {
                this.Matrix[i][j] += arr.Matrix[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 arr){
        double[][] res = new double[2][2];
        this.Matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = this.Matrix[i][j] - arr.Matrix[i][j];
            }
        }
        return new Matrix2x2(res);
    }

    public void sub2(Matrix2x2 arr){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < j; j++) {
                this.Matrix[i][j] += arr.Matrix[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double ch){
        double[][] res = new double[2][2];
        this.Matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = this.Matrix[i][j] *= ch;
            }
        }
        return new Matrix2x2(res);
    }
    public void multNumber2(double ch){
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                this.Matrix[i][j] *= ch;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 arr){
        double[][] res = new double[2][2];
        res[0][0] = this.Matrix[0][0] * arr.Matrix[0][0] + this.Matrix[0][1] * arr.Matrix[1][0];
        res[0][1] = this.Matrix[0][0] * arr.Matrix[0][1] + this.Matrix[0][1] * arr.Matrix[1][1];
        res[0][0] = this.Matrix[1][0] * arr.Matrix[0][0] + this.Matrix[1][1] * arr.Matrix[1][0];
        res[0][0] = this.Matrix[1][0] * arr.Matrix[0][1] + this.Matrix[1][1] * arr.Matrix[1][1];
        return new Matrix2x2(res);
    }

    public void mult2(Matrix2x2 arr){
        this.Matrix[0][0] = this.Matrix[0][0] * arr.Matrix[0][0] + this.Matrix[0][1] * arr.Matrix[1][0];
        this.Matrix[0][1] = this.Matrix[0][0] * arr.Matrix[0][1] + this.Matrix[0][1] * arr.Matrix[1][1];
        this.Matrix[0][0] = this.Matrix[1][0] * arr.Matrix[0][0] + this.Matrix[1][1] * arr.Matrix[1][0];
        this.Matrix[0][0] = this.Matrix[1][0] * arr.Matrix[0][1] + this.Matrix[1][1] * arr.Matrix[1][1];
    }

    public double det(){
        double res = this.Matrix[0][0] * this.Matrix[1][1] - this.Matrix[1][0] * this.Matrix[0][1];
        return res;
    }

    public void transpon(){
        this.Matrix[0][0] = this.Matrix[0][0];
        this.Matrix[0][1] = this.Matrix[1][0] ;
        this.Matrix[1][0] = this.Matrix[0][1];
        this.Matrix[1][1] = this.Matrix[1][1];
    }

    public Vector2D multVector(Vector2D svinia){
        double xx = this.Matrix[0][0] * svinia.x + this.Matrix[0][1] * svinia.y;
        double yy = this.Matrix[1][0] * svinia.x + this.Matrix[1][1] * svinia.y;
        return new Vector2D(xx, yy);
    }


}
