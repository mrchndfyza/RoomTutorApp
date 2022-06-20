package com.greentea.roomtutorapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    //will auto generate
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val firstName: String,
    val lastName: String,
    val age: Int
)