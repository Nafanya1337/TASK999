package com.example.task999

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerBody(
    context: Context
) {
    ModalDrawerSheet() {
        Text("Menu", modifier = Modifier
            .padding(vertical = 64.dp)
            .fillMaxWidth(),
            fontSize = 60.sp
        )
        Divider()
        NavigationDrawerItem(
            label = { Text(text = "Домашняя страница") },
            selected = false,
            onClick = {
                (context as Activity).onBackPressed()
            }
        )
        NavigationDrawerItem(
            label = { Text(text = "Настройки") },
            selected = false,
            onClick = {
                val intent = Intent(context, SettingsActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                context.startActivity(intent)
            }
        )
    }
}