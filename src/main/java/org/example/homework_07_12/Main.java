package org.example.homework_07_12;

import java.util.Arrays;

public class Main {
    private static final Library[] LIBRARIES = Generator.libraryGen();
    public static void main(String[] args) {
        Handler.printAllAddresses(LIBRARIES);
        Handler.printTotalBookCount(LIBRARIES);
    }
}
