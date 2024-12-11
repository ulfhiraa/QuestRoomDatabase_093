package com.example.pam_meet10.repository

import com.example.pam_meet10.data.dao.MahasiswaDao
import com.example.pam_meet10.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs { // implementasi dari RepositoryMhs
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}