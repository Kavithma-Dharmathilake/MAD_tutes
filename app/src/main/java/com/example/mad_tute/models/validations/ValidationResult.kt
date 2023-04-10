package com.example.mad_tute.models.validations

sealed class ValidationResult{
    data class Empty(val errorMessage:String) : ValidationResult()
    data class Invalid(val errorMessage:String) :ValidationResult()
    object Valid:ValidationResult()
}
