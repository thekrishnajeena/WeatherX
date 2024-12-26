package com.krishnajeena.weatherx.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.krishnajeena.weatherx.R

@Composable
fun WeatherDataDisplay(modifier: Modifier = Modifier,
                       value: Int,
                       unit: String,
                       icon: ImageVector,
                       textStyle: TextStyle = TextStyle(),
                       iconTint: Color = Color.White
                       ) {

    Row(modifier = modifier,
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = iconTint,
            modifier = Modifier.size(25.dp)
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = "$value$unit",
            style = textStyle
        )

    }
    
}