package fr.uga.miage.umldiagram2;


public class Foo {
    private int value;
    private int j;

    public Foo(){
        this.value = 0;
        this.j = 0;
    }

    public Foo(int a, int b){
        this.j = a;
        this.value = b;
    }

    public Foo fragment(){
        Foo result;
        if(getValue() < 100){
            result = plus(11).minus1().fragment();
        } else {
            result = minus(6);
        }

        return result;
    }

    public int getJ() {
        return j;
    }

    public Foo minus1() {
        return minus(1);
    }

    public Foo minus(int i) {
        Foo result = new Foo(j+1, getValue() - i);
        this.j = result.getJ();
        this.value = result.getValue();
        return result;
    }

    public int getValue() {
        return value;
    }

    public Foo plus(int i){
        return new Foo(j+1, getValue() + i);
    }
}
