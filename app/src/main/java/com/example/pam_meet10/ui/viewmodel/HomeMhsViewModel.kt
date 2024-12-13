package com.example.pam_meet10.ui.viewmodel

import androidx.core.app.NotificationCompat.MessagingStyle.Message
import androidx.lifecycle.ViewModel
import com.example.pam_meet10.data.entity.Mahasiswa
import com.example.pam_meet10.repository.RepositoryMhs
import kotlinx.coroutines.flow.StateFlow

class HomeMhsViewModel (
    private val repositoryMhs: RepositoryMhs
) : ViewModel(){
    val homeUiState: StateFlow<HomeUiState> = repositoryMhs.getAllMhs()
}

data class HomeUiState( // state; mengubah tampilan
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val Error: Boolean = false,
    val errorMessage: String = ""
)