package io.github.moulberry.notenoughupdates.options.seperateSections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.notenoughupdates.core.config.annotations.*;

public class Dungeons {
    @ConfigOption(
            name = "Dungeon Map",
            desc = ""
    )
    @ConfigEditorAccordion(id = 0)
    public boolean dungeonMapAccordion = false;

    @Expose
    @ConfigOption(
            name = "\u00A7cWarning",
            desc = "If you are on Entrance, Floor 1 or Master 1 the map wont work properly"
    )
    @ConfigEditorFSR(
            runnableId = 12,
            buttonText = ""
    )
    @ConfigAccordionId(id = 0)
    public boolean dungeonF1Warning = false;

    @Expose
    @ConfigOption(
            name = "Edit Dungeon Map",
            desc = "The NEU dungeon map has it's own editor (/neumap).\n" +
                    "Click the button on the left to open it"
    )
    @ConfigEditorButton(
            runnableId = 0,
            buttonText = "Edit"
    )
    @ConfigAccordionId(id = 0)
    public int editDungeonMap = 0;

    @Expose
    @ConfigOption(
            name = "Show Own Head As Marker",
            desc = "If you have the \"Head\" icon style selected, don't replace your green marker with a head"
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean showOwnHeadAsMarker = false;

    @ConfigOption(
            name = "Dungeon Profit",
            desc = ""
    )
    @ConfigEditorAccordion(id = 1)
    public boolean dungeonProfitAccordion = false;

    @Expose
    @ConfigOption(
            name = "Profit Type",
            desc = "Set the price dataset used for calculating profit"
    )
    @ConfigEditorDropdown(
            values = {"Lowest BIN", "24 AVG Lowest Bin", "Auction AVG"}
    )
    @ConfigAccordionId(id = 1)
    public int profitType = 0;

    @Expose
    @ConfigOption(
            name = "Profit Display Location",
            desc = "Set where the profit information is displayed\n" +
                    "Overlay = Overlay on right side of inventory\n" +
                    "GUI Title = Text displayed next to the inventory title\n" +
                    "Lore = Inside the \"Open Reward Chest\" item"
    )
    @ConfigEditorDropdown(
            values = {"Overlay", "GUI Title", "Lore", "Off"}
    )
    @ConfigAccordionId(id = 1)
    public int profitDisplayLoc = 0;

    @Expose
    @ConfigOption(
            name = "Include Kismet Feather",
            desc = "Include Kismet Feathers in the Profit Calculation after rerolling"
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 1)
    public boolean useKismetOnDungeonProfit = true;


    @ConfigOption(
            name = "Dungeon Win Overlay",
            desc = ""
    )
    @ConfigEditorAccordion(id = 3)
    public boolean dungeonWinAccordion = false;

    @Expose
    @ConfigOption(
            name = "Enable Dungeon Win",
            desc = "Show a fancy win screen and stats when completing a dungeon"
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 3)
    public boolean enableDungeonWin = true;

    @Expose
    @ConfigOption(
            name = "Dungeon Win Time",
            desc = "Change the amount of time (milliseconds) that the win screen shows for"
    )
    @ConfigEditorSlider(
            minValue = 0,
            maxValue = 20000,
            minStep = 500
    )
    @ConfigAccordionId(id = 3)
    public int dungeonWinMillis = 8000;

    @ConfigOption(
            name = "Dungeon Block Overlay",
            desc = ""
    )

    @ConfigEditorAccordion(id = 2)
    public boolean dungeonBlocksAccordion = false;
    @ConfigOption(
            name = "\u00A7cWarning",
            desc = "You need Fast Render and Antialiasing off for these settings to work\n" +
                    "You can find these in your video settings"
    )
    @ConfigEditorFSR(
            runnableId = 12,
            buttonText = ""
    )
    @ConfigAccordionId(id = 2)
    public boolean dungeonBlockWarning = false;

    @Expose
    @ConfigOption(
            name = "Enable Block Overlay",
            desc = "Change the colour of certain blocks / entities while inside dungeons, but keeps the normal texture outside of dungeons"
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 2)
    public boolean enableDungBlockOverlay = true;

    @Expose
    @ConfigOption(
            name = "Show Overlay Everywhere",
            desc = "Show the dungeon block overlay even when not inside dungeons. Should only be used for testing."
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 2)
    public boolean dungeonBlocksEverywhere = false;

    @Expose
    @ConfigOption(
            name = "Slow Update",
            desc = "Updates the colour every second instead of every tick.\n" +
                    "\u00A7cWARNING: This will cause all texture animations (eg. flowing water) to update slowly.\n" +
                    "This should only be used on low-end machines"
    )
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 2)
    public boolean slowDungeonBlocks = false;

    @Expose
    @ConfigOption(
            name = "Cracked Bricks",
            desc = "Change the colour of: Cracked Bricks"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungCrackedColour = "0:255:7:255:217";

    @Expose
    @ConfigOption(
            name = "Dispensers",
            desc = "Change the colour of: Dispensers"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungDispenserColour = "0:255:255:76:0";

    @Expose
    @ConfigOption(
            name = "Levers",
            desc = "Change the colour of: Levers"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungLeverColour = "0:252:24:249:255";

    @Expose
    @ConfigOption(
            name = "Tripwire String",
            desc = "Change the colour of: Tripwire String"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungTripWireColour = "0:255:255:0:0";

    @Expose
    @ConfigOption(
            name = "Normal Chests",
            desc = "Change the colour of: Normal Chests"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungChestColour = "0:255:0:163:36";

    @Expose
    @ConfigOption(
            name = "Trapped Chests",
            desc = "Change the colour of: Trapped Chests"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungTrappedChestColour = "0:255:0:163:36";

    @Expose
    @ConfigOption(
            name = "Bats",
            desc = "Change the colour of: Bats"
    )
    @ConfigEditorColour
    @ConfigAccordionId(id = 2)
    public String dungBatColour = "0:255:12:255:0";

}
