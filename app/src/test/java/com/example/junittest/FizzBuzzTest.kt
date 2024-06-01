package com.example.junittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FizzBuzzTest{
private lateinit var fizzBuzz: FizzBuzz

@Before
fun setUp() {
    fizzBuzz = FizzBuzz()
}

    @Test
    fun testFizzBuzz(){
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3))
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5))
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15))
        assertEquals("1", fizzBuzz.fizzBuzz(1))
    }


    @Test
    fun testFizzBuzz2() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15))
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30))
    }

    @Test
    fun testFizz() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3))
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6))
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9))
    }

    @Test
    fun testBuzz() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5))
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10))
        assertEquals("Buzz", fizzBuzz.fizzBuzz(20))
    }

    @Test
    fun testNumber() {
        assertEquals("1", fizzBuzz.fizzBuzz(1))
        assertEquals("2", fizzBuzz.fizzBuzz(2))
        assertEquals("4", fizzBuzz.fizzBuzz(4))
        assertEquals("7", fizzBuzz.fizzBuzz(7))
    }


}