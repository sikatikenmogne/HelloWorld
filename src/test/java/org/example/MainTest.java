package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[]{});
        assertEquals("Hello and welcome!", outContent.toString());
    }

    @org.junit.Test
    public void add() {
        assertEquals(5, new Main().add(2, 3));
    }
}