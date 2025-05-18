# Jetpack Compose Assignment 2
# FEBEN GETACHEW   UGR/4595/15   SECTION 3
This project is an Android application built using **Jetpack Compose**, **Retrofit**, and **Room Database**. It demonstrates a simple TODO list app that fetches data from a remote API and caches it locally.

## 📱 Features

- Fetch TODO items from [JSONPlaceholder API](https://jsonplaceholder.typicode.com/todos)
- Cache data locally using Room database
- MVVM architecture for clean code structure
- Compose Navigation between List and Detail screens
- Displays loading state, error handling, and cached data
- Built with Kotlin, coroutines, and Jetpack Compose

---

## 📐 Architecture

This project follows **MVVM (Model-View-ViewModel)** architecture and uses the **Repository pattern** for separating concerns:

- **Model**: `TodoItem` data class
- **ViewModel**: Business logic and UI state management
- **View**: Compose UI screens
- **Repository**: Handles data from API and Room

---

## 🔧 Tech Stack

| Layer         | Technology               |
| ------------- | ------------------------ |
| UI            | Jetpack Compose          |
| Networking    | Retrofit + Coroutines    |
| Local Storage | Room Database            |
| Architecture  | MVVM + Repository        |
| Navigation    | Compose Navigation       |
| Language      | Kotlin                   |


