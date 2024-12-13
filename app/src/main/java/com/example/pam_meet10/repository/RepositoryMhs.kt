package com.example.pam_meet10.repository

import com.example.pam_meet10.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    abstract fun getAllMhs()
}