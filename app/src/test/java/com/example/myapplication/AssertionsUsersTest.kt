package com.example.myapplication

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersTest {


    private lateinit var bot: User

    companion object {
        private lateinit var juan: User

        @BeforeClass @JvmStatic
        fun setUpCommon() {
            juan = User("Sebastian", 18, true)
            println("beforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            juan = User()
            println("afterClass")
        }

    }

    @Before
    fun setUp() {
        bot = User("8bit", 1, false)
        println("before")

    }

    @After
    fun tearDown() {
        bot = User()
        println("after")
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHuman")

    }

    @Test
    fun checkNotNullUserTest() {
        assertNotNull(juan)
        println("checkNotNull")

    }

    @Test
    fun checkNotSameUsersTest() {
        assertNotSame(bot, juan)
        println("notsame")

    }

    @Test
    fun checkSameUsersTest() {
        val copyJuan = juan
        assertSame(copyJuan, juan)
        println("same")

    }

}