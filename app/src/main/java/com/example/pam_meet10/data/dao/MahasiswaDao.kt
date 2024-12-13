package com.example.pam_meet10.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pam_meet10.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert // operasi untuk menambahkan data
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )

    //flow untuk mendapatkan data dalam jetpack compose

    // perbedaan query select order by asc ->  untuk mendapatkan data seluruh yang diurutkan berdasarkan A-Z [menggunakan list; banyak data]
    // query select * from mahasiswa where nim -> mendapatkan detail 1 mahasiswa, karena berdasarkan nim [ menggunakan flow; hanya 1 data]
}