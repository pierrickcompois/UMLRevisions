package fr.uga.miage.umldiagram1;

public class Foo {
    private int number;

    public Foo () {
        this.number = 0;
    }

    public void plus1() {
        number++;
    }

    public void plus(int i) {
        number += i;
    }

    public void minus(int i) {
        number -= i;
    }

    public void fragment (int i) {
      if (getValue() < 10){
          for(int index = 1; index <= i; index++) {
              plus1();
          }
      } else {
         while(getValue() >= 10) {
             minus(6);
         }
      }
    }

    public int getValue() {
        return number;
    }
}
