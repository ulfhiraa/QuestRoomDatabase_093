package com.example.pam_meet10.ui.viewmodel

class DetailMhsViewModel (

){

}

data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)