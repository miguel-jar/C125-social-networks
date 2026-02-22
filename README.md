# Social Network Simulation - Inatel C125

This project is a Java-based simulation of social network interactions, focusing on Object-Oriented Programming (OOP) principles such as inheritance, polymorphism, interfaces, and exception handling.

## 🏗️ Architecture
The project is structured into three main packages:
1. `br.inatel.c125.socialnetworks`: Contains the abstract base class and specific implementations (Facebook, Twitter, etc.).
2. `br.inatel.c125.user`: Manages user information and their associated social networks.
3. `br.inatel.c125.interfaces`: Defines common behaviors like Sharing and Video Conferencing.

## 🚀 How it Works
The application reads account data (password and number of friends) from `.txt` files located in the `src/br/inatel/c125/files/` directory.

## 💻 Usage Example
Running the `Main.java` class will:
1. Create a User.
2. Instantiate social networks.
3. Attempt to perform actions like posting photos, sharing content, and starting live streams.
4. Handle errors if a specific network doesn't support an action.
