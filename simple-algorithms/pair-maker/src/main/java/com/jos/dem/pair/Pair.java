package com.jos.dem.pair;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair {

    Pair(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    private Integer a;
    private Integer b;
}
