package com.example.pertemuan9.room

object DatabaseSiswa: RoomDatabase() {
    abstract fun siswaDao(): SiswaDao
}