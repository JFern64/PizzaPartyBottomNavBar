package edu.farmingdale.pizzapartybottomnavbar

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun DrawerContent(navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {

        DrawerItem(
            label = "Pizza Order",
                    onClick = {
                navController.navigate(BottomNavigationItems.PizzaScreen.route) {
                    launchSingleTop = true
                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                }
            }
        )
        DrawerItem(
            label = "GPA App",
            onClick = {
                navController.navigate(BottomNavigationItems.GpaAppScreen.route) {
                    launchSingleTop = true
                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                }
            }
        )
        DrawerItem(
            label = "Screen 3",
            onClick = {
                navController.navigate(BottomNavigationItems.Screen3.route) {
                    launchSingleTop = true
                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                }
            }
        )
    }
}

@Composable
fun DrawerItem(label: String, onClick: () -> Unit, highlighted: Boolean = false) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        color = Color.White,
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = label,
                color = Color.Black
            )
        }
    }
}