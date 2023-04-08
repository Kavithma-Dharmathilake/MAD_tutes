package com.example.mad_tute.models

class Calculator(private val number1: Double, private val number2:Double) {

    fun add() = number1 + number2

    fun subtract() :Double{
        return number1 - number2
    }

    fun multi() = number1 * number2

    fun divide() =  number1 / number2


}