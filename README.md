# Compose Navigation

Android project showcasing Jetpack Compose Navigation with multiple screens, argument passing, and navigation best practices.

## Project Structure

This is a complete Android application built with Kotlin and Jetpack Compose that demonstrates navigation between multiple screens.

### Features

- **HomeScreen**: The base screen that serves as the main entry point for the application
- **7 Week Day Screens**: Individual screens for each day of the week:
  - SundayScreen
  - MondayScreen
  - TuesdayScreen
  - WednesdayScreen
  - ThursdayScreen
  - FridayScreen
  - SaturdayScreen

### Technologies Used

- **Kotlin**: Modern programming language for Android development
- **Jetpack Compose**: Android's modern toolkit for building native UI
- **Material 3**: Latest Material Design components
- **Navigation Compose**: Type-safe navigation library for Compose
- **AndroidX Libraries**: Core Android libraries

### Project Setup

The project uses:
- Gradle 8.2
- Kotlin 1.9.20
- Compose 1.5.4
- Material 3
- Navigation Compose 2.7.5
- Minimum SDK: 24
- Target SDK: 34

### Building the Project

To build and run this project:

1. Clone the repository
2. Open the project in Android Studio
3. Let Gradle sync and download dependencies
4. Run the app on an emulator or physical device

### Navigation Flow

The app starts with the HomeScreen, which displays buttons for all seven days of the week. Clicking any day button navigates to that day's screen. Each day screen has a back button to return to the HomeScreen.

## License

See LICENSE file for details.
