package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test


internal class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        val array = arrayOf(23, 32) //expected value
        assertArrayEquals(array, assertions.getLuckyNumber())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Sebastian"
        val otherName = "xd"
        assertEquals(name,assertions.getName())
    }

    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val bot = User("8bit", 1, false)
        val juan = User("Sebastian", 18, true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest(){
        val juan = User("sebastian",3)
        assertNotNull(juan)
    }

    @Test
    fun checkNotSameUsersTest(){
        val bot = User("8bit", 1, false)
        val juan = User("Sebastian", 18, true)
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUsersTest(){
        val bot = User("Sebastian", 18, true)
        val juan = User("Sebastian", 18, true)
        assertSame(juan, juan)
    }

    @Test(timeout = 1000)
    fun getCitiesTest(){
        val cities = arrayOf("mx", "col", "arg")
        Thread.sleep(100)
        assertEquals(3,cities.size)
    }
}