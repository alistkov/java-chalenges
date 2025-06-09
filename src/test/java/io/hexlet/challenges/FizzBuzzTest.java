package io.hexlet.challenges;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testFizzBuzz1() {
        var expected = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FizzBuzz.fizzBuzz(1, 0);
        var actual = out.toString().trim();

        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz2() {
        var expected = "Buzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FizzBuzz.fizzBuzz(10, 10);

        var actual = out.toString().trim();
        assertEquals(expected, actual);
    }


    @Test
    void testFizzBuzz3() {
        final var expected = "1\n2";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FizzBuzz.fizzBuzz(1, 2);

        final var actual = out.toString().trim();

        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz4() {
        final var expected = "Fizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FizzBuzz.fizzBuzz(3, 10);

        final var actual = out.toString().trim();

        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz5() {
        final var expected = "8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FizzBuzz.fizzBuzz(8, 20);

        final var actual = out.toString().trim();

        assertEquals(expected, actual);
    }
}
