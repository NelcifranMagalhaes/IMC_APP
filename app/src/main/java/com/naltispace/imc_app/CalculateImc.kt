package com.naltispace.imc_app

import androidx.compose.ui.graphics.Color
import kotlin.math.pow

fun calculateImc(weight: Double, height: Double): Double{
    val imc : Double = if (weight > 0 && height > 0 ) {
        weight / (height / 100).pow(2)
    } else {
        0.0
    }

    return imc
}

fun getStatusImc(imcUser: Double): String {
    return if(imcUser < 18.5) {
        "Abaixo do peso"
    } else if (imcUser >= 18.5 && imcUser < 25.0) {
        "Peso Ideal"
    } else if (imcUser >= 25.0 && imcUser < 30.0) {
        "Levemente acima do peso"
    } else if (imcUser >= 30.0 && imcUser < 35.0) {
        "Obesidade Grau I"
    } else if (imcUser >= 35.0 && imcUser < 40.0) {
        "Obesidade Grau II"
    } else {"Obesidade Grau III"}
}


fun cardColor(status: String): Color {
    return when(status) {
        "Abaixo do peso" -> Color.Red
        "Obesidade Grau I" -> Color.Red
        "Obesidade Grau II" -> Color.Red
        "Obesidade Grau III" -> Color.Red
        "Levemente acima do peso" -> Color.Blue
        "Peso Ideal" -> Color.Green
        else -> Color.Gray
    }
}