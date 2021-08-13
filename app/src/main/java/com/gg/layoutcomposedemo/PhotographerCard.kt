package com.gg.layoutcomposedemo

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gg.layoutcomposedemo.ui.theme.LayoutComposeDemoTheme

/**
 * @description:
 * @author: Jinyu.Guo3
 * @createDate: 2021/8/13 013 15:30
 * @updateUser:
 * @updateDate: 2021/8/13 013 15:30
 */


@Composable
fun PhotographerCard() {
    Column {
        Text("Alfred Sisley", fontWeight = FontWeight.Bold)
        // LocalContentAlpha is defining opacity level of its children
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text("3 minutes ago", style = MaterialTheme.typography.body2)
        }
    }
}


@Composable
fun PhotographerCard2() {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = {
                Log.w("--", "---")
            }, role = Role.Tab, enabled = true)
            .padding(16.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Surface(
            modifier = Modifier.size(50.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {

        }
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)

        ) {
            Text("Alfred Sisley", fontWeight = FontWeight.Bold)
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text("3 minutes ago", style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Composable
fun PhotographerCard1() {
    Row {
        Surface(
            modifier = Modifier.size(50.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {
            // Image goes here
        }
        Column {
            Text("Alfred Sisley", fontWeight = FontWeight.Bold)
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text("3 minutes ago", style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun PhotographerCardPreview() {
    LayoutComposeDemoTheme {
        PhotographerCard()
    }
}
