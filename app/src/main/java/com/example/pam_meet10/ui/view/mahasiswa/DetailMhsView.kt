package com.example.pam_meet10.ui.view.mahasiswa

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_meet10.data.entity.Mahasiswa

@Composable
fun ItemDetailMhs( // untuk menampilkan informasi detail mahasiswa dalam bentuk card
// Komponen ini menggunakan ComponentDetailMhs untuk menampilkan setiap detail informasi secara lebih rapi dan mudah dipahami.
    modifier: Modifier = Modifier,
    mahasiswa: Mahasiswa
){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ) {
        Column (
            modifier = Modifier.padding(16.dp)
        ){
            ComponentDetailMhs(judul = "NIM", isinya = mahasiswa.nim)
            Spacer(modifier = Modifier.padding(4.dp))

            ComponentDetailMhs(judul = "Nama", isinya = mahasiswa.nama)
            Spacer(modifier = Modifier.padding(4.dp))

            ComponentDetailMhs(judul = "Alamat", isinya = mahasiswa.alamat)
            Spacer(modifier = Modifier.padding(4.dp))

            ComponentDetailMhs(judul = "Jenis Kelamin", isinya = mahasiswa.jenisKelamin)
            Spacer(modifier = Modifier.padding(4.dp))

            ComponentDetailMhs(judul = "Kelas", isinya = mahasiswa.kelas)
            Spacer(modifier = Modifier.padding(4.dp))

            ComponentDetailMhs(judul = "Angkatan", isinya = mahasiswa.angkatan)
            Spacer(modifier = Modifier.padding(4.dp))
        }
    }
}

@Composable
fun ComponentDetailMhs( // menampilkan detail informasi mhs
    modifier: Modifier = Modifier,
    judul: String, // menampilkan judul dari informasi
    isinya: String, // menampilkan isi dari informasi
){
    Column (
        modifier = modifier.fillMaxWidth(),

        horizontalAlignment = Alignment.Start // menyelaraskan konten (judul & isi) ke sebelah kiri layar.
    ){
        Text(
            text = "$judul : ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )

        Text(
            text = isinya,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
private fun DeleteConfirmationDialog( // konfirmasi penghapusan data
    onDeleteConfirm: () -> Unit,
    onDeleteCancel: () -> Unit,
    modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = { },
        title = { Text("Delete Data") },
        text = { Text("Apakah Anda yakin ingin menghapus data? ") },
        modifier = modifier,
        dismissButton = {
            TextButton(onClick = onDeleteCancel) {
                Text(text = "Cancel")
            }
        },
        confirmButton = {
            TextButton(onClick = onDeleteCancel) {
                Text(text = "Yes")
            }
        }
    )
}