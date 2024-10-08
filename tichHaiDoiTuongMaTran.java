
package code.ptitv2;
import java.util.Scanner;

class Matrix{
    private int N;            
    private int M;             
    private int[][] data;

    Matrix(int N, int M) {
        this.N = N;
        this.M = M;
        this.data = new int [N][M];
    }
    void nextMatrix(Scanner sc){
        for(int i=0; i<this.N; i++)
            for(int j=0; j<this.M; j++)
                this.data[i][j] = sc.nextInt();
    }
    
    Matrix mul(Matrix p){
        Matrix res = new Matrix(this.N,p.M);
        for(int i=0; i<this.N; i++)
            for(int j=0; j<p.M; j++){
                int sum = 0;
                for(int k=0; k<this.M; k++)
                    sum += this.data[i][k]*p.data[k][j];
                res.data[i][j] = sum;
            }
        return res;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<this.N; i++){
            for(int j=0; j<this.M; j++)
                 s+= String.valueOf(this.data[i][j]) +' ';
            s+='\n';
        }
        return s;   
    }
}

public class tichHaiDoiTuongMaTran {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}