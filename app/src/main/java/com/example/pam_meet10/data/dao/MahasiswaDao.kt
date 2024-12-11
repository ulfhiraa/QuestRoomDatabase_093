package com.example.pam_meet10.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pam_meet10.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}