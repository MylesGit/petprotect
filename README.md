## Description

**Pet Protect** is a simple Minecraft mod that prevents players from accidentally attacking their own tamed pets, including wolves, cats, parrots, and horse-like entities (horses, donkeys, and mules). When a player attempts to attack their own pet or horse, the attack is canceled, ensuring that pets are safe from accidental damage by their owners.

## Features

- **Prevents damage** to all **tameable entities** (e.g., wolves, cats, parrots) by their owners.
- **Prevents damage** to **horses** and similar mobs (e.g., donkeys, mules) by their owners.
- Lightweight mod that only affects players attacking their own tamed pets.
- Works seamlessly in **multiplayer servers**.

## Installation

1. Download and install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.21 or above.
2. Download **Pet Protect** `.jar` file from the releases section and place it in your Minecraft `mods` folder.
3. Launch Minecraft with the Fabric profile and enjoy!

## Usage

- Tame any pet (e.g., wolf, cat, parrot) or horse (or similar entity like a donkey).
- When you try to hit your own tamed pet, the attack will automatically be canceled.
- You can attack other pets or animals as usual, but your own tamed animals are protected.

## Development

### Prerequisites

To develop this mod, you'll need:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) (version 21)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) or another Java IDE
- [Fabric Mod Development Kit (MDK)](https://fabricmc.net/develop/)
- [Gradle](https://gradle.org/install/)

### Building the Mod

1. Clone the repository:
    ```bash
    git clone https://github.com/MylesGit/petprotect
    ```
2. Open the project in your IDE.
3. Run the Gradle task to build the mod:
    ```bash
    ./gradlew build
    ```
4. The mod `.jar` file will be located in the `build/libs` folder.

### Mod Structure

- **Main Class**: The main logic is located in `src/main/java/net/myles124/petprotect/PetProtect.java`.
- **Event Registration**: The mod uses the `AttackEntityCallback` event to listen for attacks on entities and cancel them if the player owns the pet.

## Contributing

Feel free to submit issues, suggestions, or pull requests to improve the mod!

## License

This mod is licensed under the MIT License. You can freely use, modify, and distribute this mod as long as you include the original license file.
