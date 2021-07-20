package com.company;

import java.security.DomainCombiner;

class oneClass {
    int a;

    oneClass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnone() {
        return 1;
    }
}

class secondClass extends oneClass {
    secondClass(int c) {
        super(c);
        System.out.println("I am constructor");
    }
}

public class this_super {
    public static void main(String[] args) {
        oneClass e = new oneClass(65);
        secondClass s = new secondClass(2);
        System.out.println(e.getA());
    }
}
