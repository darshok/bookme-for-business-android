package com.app.business.bookme.ui.common.carditem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.business.bookme.R

@Composable
fun BusinessCardItem() {
    Card {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .weight(1f)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = R.drawable.ic_business_placeholder),
                contentDescription = "placeholder",
            )
            Column(modifier = Modifier.weight(2f)) {
                Text(text = "Title")
                Text(text = "Description")
            }
        }
    }
}

@Preview
@Composable
fun BusinessCardPreview() {
    BusinessCardItem()
}