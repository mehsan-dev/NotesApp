# NotesApp

NotesApp is an Android test project that allows users to create, edit, update, and delete notes using Room Database. The main purpose of this project is to implement the Clean Architecture with Jetpack Compose using Hilt for dependency injection. It utilizes UseCases for business logic and includes test cases for comprehensive testing.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Setup](#setup)
- [Dependencies](#dependencies)
- [Usage](#usage)
- [Clean Architecture](#clean-architecture)
- [User Interface](#user-interface)
- [Testing](#testing)
- [License](#license)

## Introduction

The NotesApp is a simple Android application that allows users to create, edit, update, and delete notes. The notes are stored in the Room Database, and the app follows the principles of Clean Architecture, making it maintainable, scalable, and testable. It uses Jetpack Compose for a modern and declarative UI, and Hilt for dependency injection to manage and provide dependencies.

## Features

- Create, edit, update, and delete notes.
- Add title and description to the notes.
- Select background colors randomly from the given options while creating the notes.
- View a list of notes on the home view.
- Sort the notes based on different criteria like Title, date, and order in ascending and descending.

## Setup

To run the NotesApp project locally, follow these steps:

1. Clone the repository: `git clone https://github.com/mehsan-dev/NotesApp.git`
2. Open the project in Android Studio.
3. Make sure you have the latest Android SDK and necessary build tools installed.

## Dependencies

The NotesApp project uses the following major dependencies:

- AndroidX: A collection of libraries that help you build robust and efficient Android apps.
- Room: A library that provides an abstraction layer over SQLite for database operations.
- Jetpack Compose: A modern toolkit for building native Android UI with a declarative approach.
- Hilt: A dependency injection library for Android that reduces boilerplate code and simplifies dependency management.

For a complete list of dependencies and their versions, please refer to the `build.gradle` files in the project.

## Usage

The NotesApp offers the following functionalities:

1. **Create Note**: Users can create new notes by providing a title, description, and randomly selecting a background color from the available options.

2. **Edit Note**: Users can edit existing notes to update their title, description, and background color.

3. **Delete Note**: Users can delete any unwanted notes from the list.

4. **View Notes**: The home view displays a list of all notes, sorted based on different criteria such as Title, date, and order in ascending or descending.

## Clean Architecture

The NotesApp follows the principles of Clean Architecture to maintain separation of concerns and make the codebase more maintainable, scalable, and testable. It is structured into the following layers:

- **Presentation Layer**: Contains the UI components (Activities, Fragments, etc.), ViewModels, and other UI-related logic using Jetpack Compose.
- **Domain Layer**: Defines the business logic and use cases of the app. It contains the Interactors or Use Cases that implement the app's business rules.
- **Data Layer**: Handles data sources, repositories, and data mapping. It includes the implementation of the Room Database for note storage.

## User Interface

The NotesApp user interface is built using Jetpack Compose, which provides a modern and declarative approach to building UI in Android. Users can easily create and edit notes using a simple and intuitive interface. The background color selection option enhances the note customization experience.

## Testing

The NotesApp includes comprehensive test cases to ensure the functionality and reliability of the application. The test suite covers Unit Tests, Integration Tests, and UI Tests. The use of Clean Architecture allows easy and effective testing of individual components.
