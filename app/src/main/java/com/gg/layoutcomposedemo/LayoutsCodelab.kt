package com.gg.layoutcomposedemo

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * @description:
 * @author: Jinyu.Guo3
 * @createDate: 2021/8/13 013 15:30
 * @updateUser:
 * @updateDate: 2021/8/13 013 15:30
 */


@Composable
fun LayoutsCodelab0() {
    Scaffold { innerPadding ->
        Text(text = "Hi there!", modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun LayoutsCodelab1() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Hi there!")
            Text(text = "Thanks for going through the Layouts codelab")
        }
    }
}

@Composable
fun LayoutsCodelab2() {
    Scaffold(
        topBar = {
            Text(
                text = "LayoutsCodelab",
                modifier = Modifier.clickable { Log.w("++", "++") },
                style = MaterialTheme.typography.h3

            )
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun LayoutsCodelab3() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "LayoutsCodelab")
                },
                Modifier.clickable { Log.w("---", "++") }
            )
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun LayoutsCodelab4() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "LayoutsCodelab")
                },
                actions = {
                    IconButton(onClick = { Log.w("icon button", "---") }) {
                        Icon(Icons.Filled.Favorite, contentDescription = "收藏", Modifier.clickable { Log.w("icon", "---") })
                    }
                }
            )
        }
    ) { innerPadding ->
        BodyContent(
            Modifier
                .padding(innerPadding)
                .padding(8.dp))
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}