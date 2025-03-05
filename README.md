# Grid Game

## Overview
The **Grid Game** is a simulation where a robot navigates a grid to find the best path to reach a goal while avoiding obstacles. The game is interactive, allowing users to define the grid size and battery capacity before the robot starts its journey.

## Features
- Users define the number of rows and columns for the grid.
- The robot starts at a predefined beginning position.
- A random goal position is set.
- The grid contains various terrain types:
  - `free <==>`: Open space
  - `blok |||`: Blocked area
  - `wall |-|`: Wall
  - `water ~~`: Water
  - `grass __`: Grass
  - `sand /\`: Sand
- Users set the battery capacity.
- The grid is displayed with all elements after initialization.

## Installation
1. Clone this repository or download the source files.
2. Ensure you have **Java installed** on your system.
3. Open the project in an IDE like **NetBeans, Eclipse, or IntelliJ IDEA**.
4. Compile and run the `main2.java` file.

## How to Play
1. Run the program.
2. Enter the number of rows and columns for the grid.
3. Specify the battery capacity.
4. The grid is randomly generated with different terrain types.
5. The robot will attempt to navigate toward the goal.

## Future Improvements
- Implement an AI algorithm for optimal pathfinding (A* or Dijkstra's Algorithm).
- Add animations for movement visualization.
- Include user interaction for guiding the robot.
- Implement obstacles with different movement costs.

## Author
- **welcome** (Placeholder for actual author name)

## License
This project is licensed under the MIT License.

