package com.example.myapplication

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersAdultTest {

    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule
    val locationESRule = LocationESRule()

    @Before
    fun setUp() {
        juan = User("Sebastian", 18, true)
        bot = User("8bit", 1, false)
        println("before")

    }

    @After
    fun tearDown() {
        bot = User()
        juan = User()
        println("after")
    }


    @Test
    fun isAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))*/
        assertEquals(true, locationESRule.assertions?.isAdult(juan))
        assertEquals(true, locationESRule.assertions?.isAdult(bot))
    }
}