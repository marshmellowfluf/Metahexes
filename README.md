# Empty XPlat Mod Framework

This is a stripped-down template for 1.18 Fabric+Forge mods.  It's heavily derived (aka, taken wholesale) from [HexCasting](https://www.curseforge.com/minecraft/mc-mods/hexcasting)'s excellent project layout.

This (intentionally) has very few dependencies beyond those necessary for its config loader and for Kotlin compatibility, and almost no actual functionality, but does have a lot of frameworks that can be easily expanded, and can be compared to the existing HexCasting code to see actual solutions for real-world situations.  This also means that there are a number of pieces of relevant code commented out: there's a simple config system bundled in here (and one of the few unremoved dependencies), which you _should only use if you actually need it_.

The approach here does not actually avoid the various complexities of cross-modloader programming.  You still need to very carefully maintain functions that are distinct between the two environments.  It's just a very well-designed approach for separating these fields, without having to duplicate a lot of work.   

There will be some follow-up work to turn it from a generic "Hello World" mod into _your_ Generic "Hello World" mod.  Some keywords to look at:

 ``net.marshmellowfluf.metahexes`` is the default package name.  While valid for test purposes, you _will_ need to change this before release (and ideally immediately after forking) or risk (near-certain) collisions and annoying bugs, and it's easier the earlier you change it.
 IntelliJ (and most other IDEAs) will allow bulk refactoring, though expect to need to change a few ``package`` settings at the top of files.

See [this page](https://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7.7) for information about package naming rules, particularly _don't use a popular TLD that you don't actually own or control_.

 ``net`` is the default modID.  _AFTER_ you've refactored your package name, this is the next thing to change.  It's only referenced in a few places, but other mods, compile-time behavior (both Forge and Fabric) and maven will interact with it heavily.

See [this page](https://maven.apache.org/guides/mini/guide-naming-conventions.html) for some naming conventions specific to this ID.

After you've made these changes, it's safe to leave ``YourAPI`` and ``YourConfig`` as their current names, but do feel free to rename them; something specific to your modId or your package will make regularly importing them less obnoxious.

``Your Mod`` is the default mod name.  This is more for aesthetics than code relevance, but it does show up in a good few places and it's kinda embarrassing if it's left at default.

Check your ``mods.toml`` (for Forge) and ``fabric.mod.json`` (for Fabric) regarding other mod-specific settings, such as author, icon, dependencies you want presented to the user, so on.  There's a lot I'm not going to summarize here.

Actually Running:

Once you've made those updates, you'll need to reload Gradle.  Do it a couple of times, for safety's sake.

The automatically generated Run configurations won't work.  Sorry.  You'll need to use Gradle->Fabric>Tasks->Fabric->run* or Gradle->Forge->Tasks->forgegradle runs->run*.  There's probably a way to fix this, but good luck.