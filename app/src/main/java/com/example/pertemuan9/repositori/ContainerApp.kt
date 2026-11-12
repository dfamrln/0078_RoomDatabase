package com.example.pertemuan9.repositori

import com.example.pertemuan9.room.Siswa
import com.example.pertemuan9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao) : RepositoriSiswa {
    ovveride fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    ovveride suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}