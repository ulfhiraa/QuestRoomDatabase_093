package com.example.pam_meet10.repository

import com.example.pam_meet10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa) // menambah data

    fun getAllMhs(): Flow<List<Mahasiswa>> // mendapatkan semua data dengan flow

    fun getMhs(nim: String): Flow<Mahasiswa> // untuk mengambil data mahasiswa berdasarkan NIM

    suspend fun deleteMhs(mahasiswa: Mahasiswa) // menggunakan fungsi deleteMahasiswa dari Mahasiswa Dao menghapus data mahasiswa

    suspend fun updateMhs(mahasiswa: Mahasiswa) // menggunakan fungsi updateMahasiswa dari Mahasiswa Dao memperbarui data mahasiswa
}