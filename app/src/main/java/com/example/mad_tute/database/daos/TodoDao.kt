package com.example.mad_tute.database.daos

import androidx.room.*
import com.example.mad_tute.database.entities.Todo

@Dao
interface TodoDao {
    @Insert
    fun insertTodo( todo:Todo)
    @Delete
    fun deleteTodo(todo: Todo)
    @Query("SELECT * FROM Todo")
    fun getAllTodos(): List<Todo>
}