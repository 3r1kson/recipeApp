package com.example.myrecipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailsScreen(category: Category) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(category.strCategory, textAlign = TextAlign.Center)
        Text(category.strCategoryDescription, textAlign = TextAlign.Center)

        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "${category.strCategory} Thumbnail",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    CategoryDetailsScreen(
        category = Category(
            idCategory = 1.toString(),
            strCategory = "Mock Category",
            strCategoryDescription = "This is a description of the mock category.",
            strCategoryThumb = "https://example.com/image.jpg"
        )
    )
}