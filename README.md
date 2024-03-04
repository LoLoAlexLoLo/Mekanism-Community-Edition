![](https://files.thorfusion.com/mekanism/MEKBANNERWHITE1710.png)

Originally made for Terralization Modpack with fixes from several different forks. Now with new features, bugfixes and performance enhancement.

#### Download at 
+ [MEK:CE at curseforge](https://www.curseforge.com/minecraft/mc-mods/mekanism-ce)
+ [MEK:CE TOOLS at curseforge](https://www.curseforge.com/minecraft/mc-mods/mekanism-ce-tools)
+ [MEK:CE GENERATORS at curseforge](https://www.curseforge.com/minecraft/mc-mods/mekanism-ce-generators)

#### Builds at our [maven](https://maven.thorfusion.com/ui/repos/tree/General/thorfusion/mekanism/Mekanism-Community-Edition)

#### Contact Thorfusion team on our [discord](https://discord.gg/ykaB7EnYQj) server

### Building Mekanism 1.7.10 Community Edition

```bash
./gradlew fullBuild
```
You will find the files inside ./output/

## Mod examples on how to use the new api for MEK:CE
+ [Thorfusion/TerralizationCompat](https://github.com/Thorfusion/TerralizationCompat)
+ [Thorfusion/Titanpower](https://github.com/Thorfusion/Titanpower)

Also visit our [wiki](https://github.com/Thorfusion/Mekanism-Community-Edition/wiki/API) explaining how to use the new MEK:CE api

## Official Modpacks
### [Terralization](https://www.technicpack.net/modpack/terralization.654195)
### [The Lost Era](https://modrinth.com/modpack/the-lost-era)

## For modpacks
You need to include the [LICENSE](https://raw.githubusercontent.com/Thorfusion/Mekanism-Community-Edition/1.7.10/LICENSE.md) for Mekanism 1.7.10 Community Edition and Aidanbrady as author, if your system supports it indicate that this is an custom version and give appreciable credits

Mekanism CE has continued the use of the update notifier but changed the config name to v2. This is to notify people making the switch to CE of this feature. It is recommended for modpacks to disable this.

Also visit our [wiki](https://github.com/Thorfusion/Mekanism-Community-Edition/wiki/Configuration) regarding configuration.

## Required Dependencies
Mekanism CE also has two dependencies that it requires, as a modpack creator DO NOT USE the automatic downloader to get those file. It puts alot of strain to my server network.

### Dependency list
+ [ForgeMultipart](https://files.thorfusion.com/mekanism/ForgeMultipart-1.7.10-1.2.0.347-universal.jar)
+ [CodeChickenLib](https://files.thorfusion.com/mekanism/CodeChickenLib-1.7.10-1.1.3.141-universal.jar)

## Changes

### Featured changes

| MEK:CE 1.7.10 Featured Changes                                                                                    | MK                 | MK:[CE](https://www.curseforge.com/minecraft/mc-mods/mekanism-ce) |
|-------------------------------------------------------------------------------------------------------------------|--------------------|-------------------------------------------------------------------|
| Open Source                                                                                                       | :heavy_check_mark: | :heavy_check_mark:                                                |
| DUPE: Chemical Washer                                                                                             | :x:                | :heavy_check_mark:                                                |
| DUPE: Fluidtank                                                                                                   | :x:                | :heavy_check_mark:                                                |
| DUPE: [Fluidstack](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/49)                            | :x:                | :heavy_check_mark:                                                |
| DUPE: Factories                                                                                                   | :x:                | :heavy_check_mark:                                                |
| DUPE: Bins                                                                                                        | :x:                | :heavy_check_mark:                                                |
| DUPE: [Moving Players](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/62)                        | :x:                | :heavy_check_mark:                                                |
| DUPE: [Personal chest dupe](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/130)                  | :x:                | :heavy_check_mark:                                                |
| BUG: [Osmium Compressor](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/32)                      | :x:                | :heavy_check_mark:                                                |
| BUG: [Storage Meter](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/40)                          | :x:                | :heavy_check_mark:                                                |
| CRASH: [Looping crash MK+RR+BC](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/33)               | :x:                | :heavy_check_mark:                                                |
| CRASH: [Render crash with too much water](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/122)      | :x:                | :heavy_check_mark:                                                |
| CRASH: [Jetpack and chunk CME](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/141)                 | :x:                | :heavy_check_mark:                                                |
| PERFORMANCE: [Fix Gas Registry Lookup](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/138)         | :x:                | :heavy_check_mark:                                                |
| PERFORMANCE: [Fix Infinite Heat Transfers](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/158)     | :x:                | :heavy_check_mark:                                                |
| FEATURE: [TerralizationCompat](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/30)                | :x:                | :heavy_check_mark:                                                |
| FEATURE: [Biofuel cycle rework](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/48)                 | :x:                | :heavy_check_mark:                                                |
| FEATURE: [Configurable radius digitalminer](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/55)   | :x:                | :heavy_check_mark:                                                |
| FEATURE: [Whitelist dimension's for windmill](https://github.com/Thorfusion/Mekanism-Community-Edition/issues/16) | :x:                | :heavy_check_mark:                                                |
| FEATURE: [Immersive Deuterium](https://github.com/Thorfusion/Mekanism-Community-Edition/pull/94)                  | :x:                | :heavy_check_mark:                                                |
| NEW FEATURES, BUGFIXES & MORE!                                                                                    | :x:                | :heavy_check_mark:                                                |

### Full changelog

Note that changes not by the mekanism ce team has been added by us from their respective forks. any issues with these changes should be directed to us.

#### Clienthax : 
+ dupe bug with chemical washer and fluidtank, fixes issue with railcraft

#### draksterau : 
+ personal chest bug and a server crash bug

#### iKEVAREZ : 
+ and the turbine bug involving each fluid being sucked in.

#### kmecpp : 
+ dupe bug with factories

#### awesomely2002 : 
+ improvment for Entangloporters need to transport more

#### q1051278389 : 
+ Turbine and matrix bug
+ fix industrialTrubine can input Water or some liquid with another mod's pipe(now only accept water)
+ fix EnergyMatrix use IC2 cable(EnergyNetBug) connecting valve as a loop to fully charge the Matrix(now IC2Cable can't connect the MatrixValve which in "Input Mode")

#### [maggi373](https://github.com/maggi373) - Mekanism CE Team
+ fix for bin dupe bug, removed the ability to stack bins, quick solution but it works
+ added api.jar, mdk is now depricated
+ oredict switcher for osmium: you can chose either or both of osmium/platinum
+ fixed minetweaker not working problerly with mekanism
+ fixed osmium compressor taking incorrect amount of osmium Thorfusion#32
+ making enriched alloy now uses steel ingots instead of iron ingots
+ updated libraries and removed unused metallurgy compat
+ voiceserver is now disabled by default
+ oredict recipes for poor ores from railcraft (1x ingot from using purification chamber) Thorfusion#30
+ oredict recipe for dustQuartz to be enriched(mekanism) to quartz Thorfusion#30
+ oredict recipe for dustQuartz to be enriched(mekanism) from quartz ore Thorfusion#30
+ oredict recipe for gemDiamond to be enriched(mekanism) to compresseddiamonds Thorfusion#30
+ cleaned and upgraded gradle building
+ added autodownload for dependencies and missing dependency warning
+ oredict for steeltools
+ added dimension whitelist config for windmills, by default only overworld is whitelisted Thorfusion#47
+ silicon integration is enabled if enderio or gc or project red is installed, silicon is now used to make instead of iron control circuits Thorfusion#45
+ added oredict componentcontrolcircuit for advanced control circuit
+ Overhauled the config file system
+ fixed fluidstack duplication through tanks, or other blocks allowing filling & emptying fluidstacks like drums Thorfusion#49
+ removed the native cape module, the auto updater module and voiceserver Thorfusion#51
+ fixed config for HeatGenerationFluidRate
+ disabled prefilled tanks by default
+ fixed looping crash with MK+RR+BC Thorfusion#33
+ add dump button to factories Thorfusion#39
+ fix crash with quantum entangloporter Thorfusion#68
+ Add configurable max radius for digitalminer Thorfusion#55
+ Ic2 compat config Thorfusion#64
+ Thorfusion#117 bug rendering crash with mariculture infinity water bucket placed in evaporation controller Thorfusion#122
+ fix Thorfusion#100 where oredict for platinum didnt apply to dust and below and fix Thorfusion#120 Thorfusion#121
+ add devJar Thorfusion#102

#### [Pokemonplatin](https://github.com/Pokemonplatin) - Mekanism CE Team
+ Teleporter and Quantum Entangloporter now have a trusted channel for smp Thorfusion#22

#### [DrParadox7](https://github.com/DrParadox7) - Mekanism CE Team
+ fixed missing lang for teleporter Thorfusion#36
+ cardboxes are now single use Thorfusion#36
+ added methane gas Thorfusion#36
+ nerfed fusion reactor Thorfusion#36
+ added config for reducing particles for completed multiblocks Thorfusion#36
+ sawmill now outputs raw rubber instead of rubber Thorfusion#36
+ added methane to gas burner fuel list Thorfusion#36
+ Added a workaround for minetweaker regarding removal of recipes, use the config file to disable them. Thorfusion#43
+ Added BoP integration, when enabled atomic alloy is made with Ender Amethyst from BoP Thorfusion#44
+ [Large feature] Reworked the bio-fuel cycle Thorfusion#48
+ added lazuli ingots and lead infusion Thorfusion#50
+ fixed energy storage meter increasing when generating no energy in industrial turbine Thorfusion#40
+ Fix plastic properties Thorfusion#60
+ fix dupe with moving players Thorfusion#62
+ Adds more configs for Bio-Generator Thorfusion#71
+ add forestry compat to biogen cycle Thorfusion#71
+ Fixes Molasse/Glucose missing texture and langs Thorfusion#71
+ Reworks how Heavy Water is obtained Thorfusion#94
+ Fixes upgrades vanishing up machines when FactoriesEnabled= false Thorfusion#112
+ Fixes CMEs crashes in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/141
+ Plat Compat Shenanigans in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/142
+ Patch Personal Chest dupe in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/143
+ Fixed lag with in heat transferring devices https://github.com/Thorfusion/Mekanism-Community-Edition/pull/158
+ Fix hold in tooltip not being translated https://github.com/Thorfusion/Mekanism-Community-Edition/pull/167

#### leytilera
+ universal cable connection to IC2

#### ace10102 - Mekanism CE Team
+ Additional checks for IC2 api and cofhcore in ChargeUtils before using them fixes mekanism#4785 Thorfusion#118
+ Fix Gas Registry Lookup Performance in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/138

#### Omgise
* Update zh_CN.lang in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/162

#### Bedrockbreaker
* Add missing Gas API methods in https://github.com/Thorfusion/Mekanism-Community-Edition/pull/166



## All contributors get capes

# License

[LICENSE](https://raw.githubusercontent.com/Thorfusion/Mekanism-Community-Edition/1.7.10/LICENSE.md)

[ORIGINAL MOD](https://github.com/mekanism/Mekanism)
