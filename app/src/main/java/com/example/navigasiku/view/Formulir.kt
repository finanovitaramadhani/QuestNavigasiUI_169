package com.example.navigasiku.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    Scaffold (modifier = modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource (R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R,color.teal_700))
            )}
    ){ isiRuang ->
        Column(modifier = Modifier.padding( paddingValues=isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(width = 250.dp),
                label = {Text("Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier
                .padding(20.dp)
                .width(250.dp), thickness = Thickness,color = Color.Red)
            Row{
                jenisK.forEach {
                    item ->
                    Row (verticalAlignment = Alignment.CenterHorizontally){
                        RadioButton(
                            selected = false,
                            onClick = {item}
                        )
                        Text(text = item)
                    }
                }
            }
        }
        HorizontalDivider(modifier = Modifier
            .padding(20.dp)
            .width(250.dp),
            thickness = 1.dp,
            color = Color.Red
        )
        OutlinedTextField(
            value = "",
            singleLine = true,
            modifier = Modifier
                .width(250.dp),
            label = {Text("Alamat")},
            onValueChange = {},
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            modifier = Modifier.fillMaxWidth(1f )
                .padding(all = 25.dp)
            onClick = OnSubmitBtnClick
        ){
            Text(stringResource(id = R.string.submit))
        }
    }
}