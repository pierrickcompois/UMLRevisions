package fr.uga.miage.umldiagram1;

public class Bar {
    private Foo foo;

    public Bar () {
        this.foo = new Foo();
    }

    public void apply(int i) {
        foo.plus1();
        foo.plus(i);
        foo.minus(5);
        foo.fragment(i);
        System.out.println(foo.getValue());
    }
}
