package com.socops.model;

import com.socops.data.IcebreakerPrompts;

/**
 * One tile on the 5×5 bingo grid.
 *
 * @param id        zero-based position (0-24)
 * @param prompt    display text shown on the tile
 * @param selected  whether the player has tapped this tile
 * @param freeCell  true only for the centre "FREE SPACE" tile
 */
public record BingoCell(int id, String prompt, boolean selected, boolean freeCell) {

    /** Build a regular, untapped prompt tile. */
    public static BingoCell ofPrompt(int id, String prompt) {
        return new BingoCell(id, prompt, false, false);
    }

    /** Build the centre free-space tile (always pre-tapped). */
    public static BingoCell ofFreeCell(int id) {
        return new BingoCell(id, IcebreakerPrompts.FREE_CELL_LABEL, true, true);
    }
}
