package com.shashank.vegetablesorderappui.view.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.vegetablesorderappui.R
import com.shashank.vegetablesorderappui.navigation.MainActions
import com.shashank.vegetablesorderappui.theme.*

@Composable
fun VegetableDetail(actions: MainActions) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(azureishWhite)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(white)
                    .padding(8.dp),
            ) {
                Icon(
                    modifier = Modifier.size(12.dp),
                    painter = painterResource(id = R.drawable.left_arrow),
                    contentDescription = stringResource(R.string.text_back_icon),
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(white)
                    .padding(8.dp),
            ) {
                Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = Icons.Default.Favorite,
                    contentDescription = stringResource(R.string.text_heart_icon),
                    tint = Color.Red
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.size(200.dp),
                painter = painterResource(id = R.drawable.red_capsicum),
                contentDescription = "Tomato Image",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(44.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp))
                .background(white)
                .padding(24.dp)
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Sawi Hijau",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
                Text(
                    text = "Rs. 14.00/Kg",
                    color = gold,
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Sawi hijau mengandung folat, kalium, vitamin C, dan vitamin B-6 dan rendah kolesterol. Perpaduan ini embantu menjaga kesehatan jantung. Vitamin B-6 dan folat mencegah penumpukan senyawa yang dikenal sebagal homocysteine.",
                color = Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(28.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                ) {
                    Text(
                        text = "Total",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = black,
                    )
                    Text(
                        text = "Rs. 14.00/Kg",
                        fontSize = 14.sp,
                        color = gold,
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(lightSilver)
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp, 20.dp),
                        imageVector = Icons.Default.Add,
                        contentDescription = stringResource(R.string.text_add_icon),
                        tint = white
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = blue
                ),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }
}
