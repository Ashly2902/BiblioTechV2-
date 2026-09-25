package com.example.idfun.ui.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.idfun.modelo.Libro

@Composable
fun TarjetaLibro(
    libro: Libro,
    onVerDetalles: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = libro.titulo,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(6.dp)
            )

            Text(
                text = "Autor: ${libro.autor}"
            )

            Text(
                text = "Categoría: ${libro.categoria}"
            )

            Text(
                text = "Año publicación: ${libro.anio}"
            )

            Text(
                text = "Disponible: ${if (libro.disponible) "Sí" else "No"}"
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Button(
                onClick = onVerDetalles,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver detalles")
            }
        }
    }
}