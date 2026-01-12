package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
        this.qux = new Qux();
    }

    public void addBaz(Baz baz) {
        if (baz != null) {
            this.bazs.add(baz);
        }
    }

    public void addGrault() {
        Grault newGrault = new Grault(this);
        this.graults.add(newGrault);
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }

        this.corge = corge;

        if (this.corge != null) {
            this.corge.setFoo(this);
        }
    }

    public List<Grault> getGraults() {
        return graults;
    }

}
