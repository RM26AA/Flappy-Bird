# Flappy Bird - Java Game

**Flappy Bird** is a simple, fun, and addictive game implemented in Java. The objective of the game is to control a bird that must navigate through a series of pipes without colliding with them. The game features smooth graphics, background music, and a main menu with play, help, and quit options.

## Features

- **Play Mode**: Click the "Play" button to start the game.
- **Gravity Mechanism**: The bird is affected by gravity and will fall unless you press the `Spacebar` to make it jump.
- **Pipes**: Pipes are generated at random intervals and the bird must fly through them without hitting them.
- **Score**: The score increases as the bird successfully passes through pipes.
- **Game Over Screen**: The game ends if the bird collides with a pipe or falls to the ground. The final score is displayed, and you can restart by pressing `Spacebar`.
- **Background Music**: Background music plays during the game and can be controlled (start/stop).

## Getting Started

### Prerequisites
Make sure you have **Java 8** or later installed on your system. If you don't have Java installed, you can download and install it from the official [Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Installation

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/your-username/flappy-bird-java.git
    ```

2. Navigate to the project directory:

    ```bash
    cd flappy-bird-java
    ```

3. Open the project in your preferred IDE (such as **IntelliJ IDEA**, **Eclipse**, etc.).

4. Ensure the **`src/img/`** directory contains the images needed for the game (like `flappybirdbg.png`, `flappybird.png`, `toppipe.png`, `bottompipe.png`, and the banner image `banner1.png`).

5. Ensure the **`src/music/`** directory contains the background music file (`gta-4-music.wav`).

### Running the Game

1. **In your IDE**, run the `App` class, which will launch the main menu.
2. Click **Play** to start the game. Use the `Spacebar` to make the bird jump and avoid the pipes.
3. Press `Spacebar` after the game ends to restart.

### Controls
- **`Spacebar`**: Makes the bird jump and restart the game after it ends.
- **`Arrow keys`**: Not required for this game, only the `Spacebar` is used.

## Game Features

- **Main Menu**: Provides options to play the game, view instructions, or quit.
- **Help Screen**: Shows instructions on how to play the game.
- **Quit Option**: Asks for user confirmation before quitting the game.

## Background Music
The game includes background music that loops continuously while the game is running. It is stored as a `.wav` file, which is played using Java’s **Clip** class.

## Contributing

Feel free to fork the repository and submit pull requests! If you find any bugs or would like to suggest improvements, please open an issue, and we will address it as soon as possible.

## License

This project is licensed under the MIT License.

## Acknowledgments

- Inspired by the popular mobile game **Flappy Bird**.
- Special thanks to **Stack Overflow** for various Java-related solutions.
- Background music from **GTA 4** (Please replace with your own or give proper credit to the original creator).

---

**Thank you for playing Flappy Bird in Java!**
