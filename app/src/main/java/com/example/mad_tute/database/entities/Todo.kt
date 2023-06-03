package com.example.mad_tute.database.entities

import android.content.Context
import androidx.room.*
import com.example.mad_tute.database.daos.TodoDao

@Entity
data class Todo(
    var item :String?
){
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null

}


