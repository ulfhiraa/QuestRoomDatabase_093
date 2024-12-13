package com.example.pam_meet10.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pam_meet10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert // operasi untuk menambahkan data
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )

    // Mengambil semua data mahasiswa yang tersimpan di database dan diurutkan berdasarkan nama
    //  query select order by asc ->  untuk mendapatkan data seluruh yang diurutkan berdasarkan A-Z [menggunakan list; banyak data]
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    //flow untuk mendapatkan data dalam jetpack compose

    // query select * from mahasiswa where nim -> mendapatkan detail 1 mahasiswa, karena berdasarkan nim [ menggunakan flow; hanya 1 data]
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>

    @Delete // untuk menghapus data mahasiswa
    suspend fun deteleMahasiswa(mahasiswa: Mahasiswa) // suspend menunjukkan metode harus dijalankan dalam korutin. diselesaikan.

    @Update // untuk memperbarui informasi mahasiswa yang sudah ada di database.
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}