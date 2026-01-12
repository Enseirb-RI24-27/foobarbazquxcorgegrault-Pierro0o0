package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;             // <-bar : Bar (1)
    private List<Baz> bazs;      // <-bazs : Baz[] (*)
    private Qux qux;             // <-qux : Qux (1)

}
