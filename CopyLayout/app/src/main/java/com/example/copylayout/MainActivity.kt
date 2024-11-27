package com.example.copylayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
// import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout

@Preview
@Composable
fun Myconstraint(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxC, boxR, boxB, boxG, boxM, boxY) = createRefs()

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Cyan)
            .constrainAs(boxC) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxR) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Green)
            .constrainAs(boxG) {
                bottom.linkTo(boxR.top)
                start.linkTo(boxR.end)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxB) {
                bottom.linkTo(boxR.top)
                end.linkTo(boxR.start)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxM) {
                top.linkTo(boxR.bottom)
                end.linkTo(boxR.start)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(boxY) {
                top.linkTo(boxR.bottom)
                start.linkTo(boxR.end)
            }
        )
    }
}