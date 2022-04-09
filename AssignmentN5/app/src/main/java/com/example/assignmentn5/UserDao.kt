package com.example.assignmentn5

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT AVG(runDistance) FROM USER")
    fun avgOfRunDis():Double
    @Query("SELECT SUM(runDistance) FROM USER")
    fun sumOfRunDis():Double
    @Query("SELECT SUM(runDistance) FROM USER")
    fun totalOfRunDis():Double
    @Query("SELECT AVG(swimDistance) FROM USER")
    fun avgOfSwimDis():Double
    @Query("SELECT AVG(calories) FROM USER")
    fun avgOfcals():Double
    abstract fun insert(user: User)
}