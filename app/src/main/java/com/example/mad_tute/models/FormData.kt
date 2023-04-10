package com.example.mad_tute.models

import com.example.mad_tute.models.validations.ValidationResult


class FormData(
    private var studentID:String,
    private var year:String,
    private var semester:String,
    private var agree:Boolean
    )
{
    //validating the student ID
    fun validateStudentID(): ValidationResult{
        return if(studentID.isEmpty()){
            ValidationResult.Empty("The Student ID is empty")
        }
        else if(!studentID.startsWith("IT")){
            ValidationResult.Invalid("The student ID should be starting with 'IT' ")
        }
        else if(studentID.length < 10){
            ValidationResult.Invalid("The Student ID should have 10 characters")

        }
        else if(studentID.length > 10){
            ValidationResult.Invalid("The Student ID should have 10 characters")
        }
        else{
            ValidationResult.Valid
        }
    }

    //Validating the year
    fun validateYear() : ValidationResult{
        return if(year.isEmpty()){
            ValidationResult.Empty("The year is empty")
        }
        else{
            ValidationResult.Valid
        }
    }

    //validating the semester
    fun validateSemester() : ValidationResult{
        return if(semester.isEmpty()){
            ValidationResult.Empty("The semester is empty")
        }
        else{
            ValidationResult.Valid
        }
    }

    //validating the agreement
    fun validateAgreement():ValidationResult{
        return if(!agree){
                ValidationResult.Empty("You must accept agreement")
        }
        else{
            ValidationResult.Valid
        }
    }



}