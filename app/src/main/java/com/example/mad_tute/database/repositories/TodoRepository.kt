package com.example.mad_tute.database.repositories

import com.example.mad_tute.database.TodoDatabase
import com.example.mad_tute.database.entities.Todo

class TodoRepository(
    private val db: TodoDatabase
) {
    fun insert(todo: Todo) = db.getTodoDao().insertTodo(todo)
    fun delete(todo:Todo) = db.getTodoDao().deleteTodo(todo)
    fun getAllTodos() = db.getTodoDao().getAllTodos()
}