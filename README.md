# CLI Chess Game

## Description

CLI Chess Game is a command-line interface based chess game written in Java. It allows two players to play a game of chess on a terminal.

## Running the Game

To install CLI Chess Game, follow these steps:

1. Clone the repository: `git clone https://github.com/lomokwa/chess-system.git`
2. Compile the program by running the following command on your terminal:
```bash
javac -d bin -sourcepath src src/app/Program.java
```
3. After compiling, run the program by executing the following command:
```bash
java -cp bin app.Program
```

## Usage:

1. The positions of the pieces are represented by a combination of a letter and a number. The letter represents the column and the number represents the row. For example, the position `a1` represents the bottom-left corner of the board, while the position `h8` represents the top-right corner of the board.

2. To make a move, the player will be prompted to enter the position of the piece they want to move and then the position they want to move the piece to.

3. The pieces are represented by the following letters:
   - `P` for pawn
   - `R` for rook
   - `N` for knight
   - `B` for bishop
   - `Q` for queen
   - `K` for king

## Code Organization and Design Principles

- The game is written in Java 17.0.8.
- Code uses Java and OOP principles such as encapsulation, inheritance, and polymorphism.
- The code is organized into packages and classes to make it more readable and maintainable.