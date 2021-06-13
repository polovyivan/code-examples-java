package com.ivan.polovyi.builder.examples.second.twoclasses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BuilderPatternTest {

    @Test
    void build() {

        Animal duck = new BuilderPattern()
                .setAge(5)
                .setFavoriteFoods(Arrays.asList("grass"))
                .setSpecies("duck")
                .build();

        assertEquals("duck", duck.getSpecies());
    }
}