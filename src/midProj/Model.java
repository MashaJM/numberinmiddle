package midProj;

import java.util.Random;

/**
 * Created by MashaJM
 * Задано 3 целых числа. Найти их среднее арифметическое и ближайшее к нему
 целое
 */
public class Model {
    private int a,b,c;

public Model(int a, int b, int c){
    setA(a);
    setB(b);
    setC(c);

}public Model(){

        Random random = new Random();
    this.a = random.nextInt(101);
    this.b = random.nextInt(101);
    this.c = random.nextInt(101);


    }


    public double findMidNumber(int a, int b, int c) {

        return (a + b + c)/3.d;

    }

    public int theClosestInt(double number) {

        return (int) Math.rint(number);
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
