## Dou Dizhu Game Demo (Console)

A simplified console-based Dou Dizhu (Fight the Landlord) demo built during Java Collections learning.

### Key Features
- Object-oriented design with clear responsibilities:
  - `Card`: represents a playing card with suit and rank
  - `Room`: manages deck creation, shuffling, dealing and sorting
  - `GameDemo`: entry point to run the game flow
- Generated a standard 54-card deck (including jokers) using `ArrayList`
- Shuffled cards with `Collections.shuffle`
- Dealt cards to three players, reserving three bottom cards for the landlord
- Sorted each player's hand using `Collections.sort`

### What I Practiced
- OOP modeling and responsibility separation
- Using `ArrayList` to manage dynamic collections
- Applying `Collections` utility methods (shuffle, sort)
- Designing a complete game flow from data setup to result output

### Notes
This demo focuses on data structures and object design rather than full game rules or user interaction.
