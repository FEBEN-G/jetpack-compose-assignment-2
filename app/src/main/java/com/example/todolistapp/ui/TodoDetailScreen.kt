package com.example.todolistapp.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.todolistapp.model.Todo
import com.example.todolistapp.ui.theme.TodoListAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoDetailScreen(todo: Todo, navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Todo Details") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Title: ${todo.title}", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text("User ID: ${todo.userId}")
            Spacer(modifier = Modifier.height(8.dp))
            Text("Status: ${if (todo.isCompleted) "Completed" else "Pending"}")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TodoDetailPreview() {
    TodoListAppTheme(darkTheme = false) {
        TodoDetailScreen(
            todo = Todo(id = 1, userId = 1, title = "Sample", isCompleted = false),
            navController = rememberNavController()
        )
    }
}
