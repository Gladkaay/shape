package com.gladkaya.shape.util;

public class GeneratorId {
    private static int counter;

    public static int generateId() {
        return ++counter;
    }
}
