package com.example.navigasiku.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.navigasiku.R

@OptIn(ExperimentalMaterial3Api::Class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val item = listOf(
        Pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat),"Yogyakarta")
    )
}