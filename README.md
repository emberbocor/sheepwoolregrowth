# Sheep Wool Regrowth

Feed wheat to a sheared sheep and shear it again right away, without waiting for it to find grass.

Sheep Wool Regrowth lets you regrow a sheared sheep's wool by hand. Right-click a sheared adult sheep with wheat and its wool grows back on the spot, just as if it had eaten grass.

The mod runs on the server only. Players join with a plain vanilla client and still see everything.

Available for NeoForge, Forge and Fabric.

## Features

- **Instant wool.** Right-click a sheared adult sheep with wheat: one wheat is used and the wool is back immediately.
- **Breeding stays vanilla.** A sheep that still has its wool reacts to wheat exactly as in vanilla, so breeding works as before.
- **Same sheep, same color.** The wool grows back in the color the sheep already had, like after eating grass.
- **Vanilla feedback.** The sheep lowers its head as if grazing and you hear an eating sound. Vanilla clients see and hear the same.

There is no config file.

## How it works

The wool only grows back when all of these are true:

- the sheep is an adult (not a lamb);
- the sheep is sheared;
- the item in the hand you click with is wheat.

Then:

- one wheat is used from that hand (none in Creative mode);
- the wool grows back right away, the same way vanilla regrows it when a sheep eats grass, and the sheep keeps its color;
- the sheep does not go into love mode: no hearts, no breeding;
- the sheep plays the vanilla head-down grazing animation, an eating sound plays and your arm swings.

Every other case is left to vanilla:

- **A sheep with wool.** Wheat starts breeding as usual. After its wool has grown back, the next wheat breeds it.
- **A lamb.** Wheat makes it grow up faster as usual.
- **Shears, other items.** Unchanged.

Only wheat works; other sheep foods have no effect on a sheared sheep's wool. There is no cooldown: a sheep with its wool back is no longer sheared, so it can be sheared and fed again straight away.

## Requirements

| | Forge / NeoForge | Fabric |
|---|---|---|
| Minecraft | 1.20.1 | 1.20 or 1.20.1 |
| Loader | Forge 47.1.0 or newer, or NeoForge 1.20.1 (47.1.x) | Fabric Loader 0.14.21 or newer |
| Jar | `sheepwoolregrowth-forge-1.20.1-<version>.jar` | `sheepwoolregrowth-fabric-1.20-1.20.1-<version>.jar` |

On Minecraft 1.20.1, NeoForge still runs Forge mods, so the Forge jar is used for both.

The Fabric version does not need Fabric API.

### Client and server

Install the mod on the server only, on every loader. It adds no items, blocks, entities, sounds, network messages or registries, so the server has nothing a client needs to know about:

- **Forge and NeoForge:** vanilla clients and Forge or NeoForge clients without the mod can join. The mod is marked as server-only, so a client without it still shows the server as compatible in the server list.
- **Fabric:** vanilla clients and Fabric clients without the mod can join.

Players without the mod see the wool, the animation and the arm swing and hear the sound like everyone else. Installing it on a client as well does no harm.

In singleplayer, install it in your own game; the built-in server runs it.

## Removing the mod

The world opens normally. The mod saves nothing of its own: sheep keep the wool they have, and sheared sheep regrow it the vanilla way by eating grass.

## Compatibility

- Mods that cancel a right-click on an entity through the loader's own hook (the `EntityInteract` event on NeoForge and Forge, `UseEntityCallback` in Fabric API) run before this mod. When they cancel the click, the wool does not grow and no wheat is used.

## Building from source

```
./gradlew build
```

The jars are written to `forge/build/libs/` and `fabric/build/libs/`.

## License

MIT.
