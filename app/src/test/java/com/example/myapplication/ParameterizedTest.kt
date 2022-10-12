package com.example.myapplication

import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean, var currentUser: User) {

    @get:Rule
    val locationESRule = LocationESRule()

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(true, User("Bot21", 4)),
            arrayOf(true, User("Alex", 18))
        )
    }

    @Test
    fun isAdultTest() {
        assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }

}
