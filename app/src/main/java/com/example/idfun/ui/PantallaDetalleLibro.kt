package com.example.idfun.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.idfun.modelo.Libro

@Composable
fun PantallaDetalleLibro(
    libro: Libro,
    onRegresar: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = libro.titulo,
            fontSize = 28.sp
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text("Autor: ${libro.autor}")
        Text("Categoría: ${libro.categoria}")
        Text("Año: ${libro.anio}")
        Text("Descripción: ${libro.descripcion}")
        Text("Disponible: ${if (libro.disponible) "Sí" else "No"}")

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        Button(
            onClick = onRegresar
        ) {
            Text("Regresar")
        }
    }
}