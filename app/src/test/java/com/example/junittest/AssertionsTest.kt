package com.example.junittest

import org.junit.Assert.*

import org.junit.Test
import kotlin.random.Random

class AssertionsTest {

    @Test
    fun getLuckyNumber() {
        val assertions = Assertions()
        val array = arrayOf(21,117)
        assertArrayEquals(
            "Error personalizado en Array testing",
            array,
            assertions.getLuckyNumber()
        )
    }

    @Test
    fun getName() {
        val assertions = Assertions()
        val name = "pepe"
        val otherName = "Max"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHuman() {
        val assertions = Assertions()
        val bot = User("8bit", 1, false)
        val pepe = User("pepe", 18, true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(pepe))
    }

    @Test
    fun testCheckNullHuman() {
        val user = null
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))

    }

    @Test
    fun checkNotSameUserTest(){
        val bot = User("8bit",1, false)
        val pepe = User("pepe", 18, true)
       val pepe2 = pepe
        //val pepe2 = User("pepe", 18, true)
        assertNotSame(bot, pepe)
        assertSame(pepe, pepe2)
    }

    @Test (timeout = 1_000)
    fun getCitiesTest(){
        val cities = arrayOf("Chile", "Peru", "Argentina")
        Thread.sleep(Random.nextLong(200, 1100))
        assertEquals(3, cities.size)
    }


}