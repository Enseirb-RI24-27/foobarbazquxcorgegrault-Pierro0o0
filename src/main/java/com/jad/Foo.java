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
        graults.add(new Grault(this));
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
        // 1. Si on avait déjà un Corge, on lui dit qu'il n'est plus lié à ce Foo
        if (this.corge != null) {
            this.corge.setFoo(null);
        }

        // 2. On assigne le nouveau Corge
        this.corge = corge;

        // 3. Si le nouveau Corge n'est pas null, on le lie à ce Foo (this)
        if (this.corge != null) {
            this.corge.setFoo(this);
        }
    }

    public List<Grault> getGraults() {
        return graults;
    }

}
