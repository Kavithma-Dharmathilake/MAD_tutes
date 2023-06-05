package com.example.mad_tute

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val calculations = Calculations(20,10)
    @Test
    fun addition_isCorrect() {
        assertEquals(30, calculations.addition())
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(10, calculations.subtraction())
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(200, calculations.multiplication())
    }

    @Test
    fun division_isCorrect() {
        assertEquals(2, calculations.division())
    }
}