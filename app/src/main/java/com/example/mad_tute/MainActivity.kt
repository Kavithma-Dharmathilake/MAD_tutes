package com.example.mad_tute


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.mad_tute.models.FormData
import com.example.mad_tute.models.validations.ValidationResult

class MainActivity : AppCompatActivity() {

    lateinit var edtStudentID:EditText
    lateinit var spnYear:Spinner
    lateinit var spnSemester:Spinner
    lateinit var cbAgree:CheckBox
    lateinit var tvYear : TextView
    lateinit var tvSemester:TextView
    private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_student_ui)

        edtStudentID= findViewById(R.id.edtStudentId)
        spnYear= findViewById(R.id.spnYear)
        spnSemester= findViewById(R.id.spnSemester)
        cbAgree= findViewById(R.id.cbAgree)
        tvYear = findViewById(R.id.tvYear)
        tvSemester = findViewById(R.id.tvSemester)

    }

    fun displayAlert(title:String, message:String){
        var builder=AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK"){dialog, which ->
            //do something
        }
        var dialog = builder.create()
        dialog.show()
    }

    fun submit(v: View){
        val myForm=FormData(
            edtStudentID.text.toString(),
            spnSemester.selectedItem.toString(),
            spnYear.selectedItem.toString(),
            cbAgree.isChecked
        )

        val studentIdValidation = myForm.validateStudentID()
        val semesterValidation=myForm.validateSemester()
        val yearValidation = myForm.validateYear()
        val agreementValidation = myForm.validateAgreement()

        when(studentIdValidation){
            is ValidationResult.Valid ->{
                count++
            }
            is ValidationResult.Invalid -> {
                edtStudentID.error =  studentIdValidation.errorMessage

            }
            is ValidationResult.Empty -> {
                edtStudentID.error = studentIdValidation.errorMessage
            }
        }

        when(semesterValidation){
            is ValidationResult.Valid ->{
                count++
            }
            is ValidationResult.Invalid -> {
              val tv:TextView= spnSemester.selectedView as TextView
                tv.error = ""
                tv.text = semesterValidation.errorMessage
            }
            is ValidationResult.Empty -> {
                val tv:TextView= spnSemester.selectedView as TextView
                tv.error = ""
                tv.text = semesterValidation.errorMessage
            }
        }

        when(yearValidation){
            is ValidationResult.Valid ->{
                count++
            }
            is ValidationResult.Invalid -> {
                val tv:TextView= spnYear.selectedView as TextView
                tv.error = ""
                tv.text = yearValidation.errorMessage
            }
            is ValidationResult.Empty -> {
                val tv:TextView= spnYear.selectedView as TextView
                tv.error = ""
                tv.text = yearValidation.errorMessage
            }
        }


        when(agreementValidation){
            is ValidationResult.Valid ->{
                count++
            }
            is ValidationResult.Invalid -> {
               displayAlert("Error", agreementValidation.errorMessage)

            }
            is ValidationResult.Empty -> {

            }
        }


        //This function does not work properly :(
        if(count >= 4){

            displayAlert("Success", "You have Successfully registered")
        }



    }


}