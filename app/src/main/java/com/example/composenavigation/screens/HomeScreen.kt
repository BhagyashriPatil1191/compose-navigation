package com.example.composenavigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composenavigation.R
import com.example.composenavigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.home_screen)) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically)
        ) {
            Text(
                text = "Welcome to Compose Navigation",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            Text(
                text = "Select a day of the week:",
                style = MaterialTheme.typography.titleMedium
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            WeekDayButton(
                text = stringResource(R.string.sunday),
                onClick = { navController.navigate(Screen.Sunday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.monday),
                onClick = { navController.navigate(Screen.Monday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.tuesday),
                onClick = { navController.navigate(Screen.Tuesday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.wednesday),
                onClick = { navController.navigate(Screen.Wednesday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.thursday),
                onClick = { navController.navigate(Screen.Thursday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.friday),
                onClick = { navController.navigate(Screen.Friday.route) }
            )
            WeekDayButton(
                text = stringResource(R.string.saturday),
                onClick = { navController.navigate(Screen.Saturday.route) }
            )
        }
    }
}

@Composable
fun WeekDayButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium
        )
    }
}
