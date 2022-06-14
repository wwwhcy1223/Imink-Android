package com.chenyuan.iminkandroid.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable()
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxWidth()) {
        TodayBody()
        ScheduleBody()
    }
}

@Composable()
fun TodayBody() {
    Text(text = "Today")
}

@Composable()
fun ScheduleBody() {
    var tabIndex = remember {
        mutableStateOf(0)
    }
    val tabTitles = listOf("Battle", "Salmon Run")
    Text(text = "Schedule")
    TabRow(selectedTabIndex = tabIndex.value, modifier = Modifier.fillMaxWidth()) {
        tabTitles.forEachIndexed { index, title ->
            Tab(
                modifier = Modifier.width(20.dp),
                text = { Text(text = title) },
                selected = index == tabIndex.value,
                onClick = { tabIndex.value = index }
            )
        }
    }
    Spacer(modifier = Modifier.height(20.dp))
}
