package com.ivan.polovyi.builder.examples.second.twoclasses;

import com.ivan.polovyi.builder.examples.second.singleclass.BuilderPatternWithNestedClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderPatternWithNestedClassTest {

    @Test
    public void builderTest() {

        BuilderPatternWithNestedClass builderPattern =
                new BuilderPatternWithNestedClass.BuilderPatternWithNestedClassBuilder("Reptile",
                        Arrays.asList("meat", "fish"))
                        .setAge(5)
                        .build();

        assertEquals(5, builderPattern.getAge());
    }

}