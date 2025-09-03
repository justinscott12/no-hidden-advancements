# No Hidden Advancements

A Minecraft Fabric mod that makes all hidden advancements visible in the UI

## Features

- Makes all hidden advancements visible in the UI:
  - "How Did We Get Here?"
  - "Voluntary Exile"
  - "Hero of the Village"
  - "Arbalistic"
  - "You've Got a Friend in Me"
  - "Smells Interesting"
  - "Birthday Song"
  - "Little Sniffs"
  - "Planting the Past"
- Compatible with Minecraft 1.21.8

![example.png](src/main/resources/assets/no-hidden-advancements/example.png)
![arbalistic.png](src/main/resources/assets/no-hidden-advancements/arbalistic.png)

## Download
- If you just want the mod itself and you don't care about the source code, just download the jar file for the corresponding Minecraft version from the releases folder

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. Download the latest release of this mod
4. Place the mod file in your `mods` folder

## Building

To build the mod yourself:

1. Clone this repository
2. Run `./gradlew build`
3. The built mod will be in `build/libs/`

## Testing

### Development Testing

1. Run the mod in development environment:
   ```bash
   ./gradlew runClient
   ```

      **Note**: If you encounter mixin errors during startup, check that:
      - All package names in your mixin configuration files match your actual package structure
      - Mixin classes exist in the specified locations
      - The mod ID in `fabric.mod.json` matches your mixin configuration


## Usage

Simply install the mod and use anvils as normal. The level 40 limit will be completely removed, allowing you to:

- Combine highly enchanted items
- Repair items without level restrictions
- Create powerful enchantment combinations that were previously impossible

## Compatibility

- Minecraft: 1.21.8
- Fabric Loader: 0.16.9+
- Fabric API: 0.110.0+1.21.8

## License

This mod is licensed under the MIT License. See [LICENSE](LICENSE) for details.
