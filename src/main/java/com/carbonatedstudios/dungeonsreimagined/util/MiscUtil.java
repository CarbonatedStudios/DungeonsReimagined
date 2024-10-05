package com.carbonatedstudios.dungeonsreimagined.util;

import com.carbonatedstudios.dungeonsreimagined.datagen.DRLanguageProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.TranslatableContents;

public final class MiscUtil {
//fancy man meme code
    private MiscUtil() {
        throw new IllegalAccessError("Attempted to construct a Utility Class!");
    }

    /**
     * Safely attempts to insert a {@link String} into another {@link String} at the specified index. Referenced from
     * {@code https://www.geeksforgeeks.org/insert-a-string-into-another-string-in-java/}.
     *
     * @param originalString The original {@link String} to modify.
     * @param stringToBeInserted The {@link String} to insert into the specified original {@link String}.
     * @param insertionIndex The index at which to insert the {@link String} to be inserted. Appends to the end of the original {@link String}
     *                       if the insertion index is larger than or equal to the length of the original {@link String}.
     *
     * @return A new {@link String} with the contents of the specified insertion {@link String} inserted at the specified index.
     */
    public static String insertStringAt(String originalString, String stringToBeInserted, int insertionIndex) {
        String moddedString = new String();

        if (insertionIndex >= originalString.length()) return originalString.concat(stringToBeInserted);

        for (int i = 0; i < originalString.length(); i++) {
            moddedString += originalString.charAt(i);

            if (i == insertionIndex) moddedString += stringToBeInserted;
        }

        return moddedString;
    }
    //there was a man meme comment here, but eh
    public static MutableComponent translatableDefault(MutableComponent translatableComponent, String defaultTranslation) {
        DRLanguageProvider.addManualTranslation(ChatFormatting.stripFormatting(translatableComponent.toString()), defaultTranslation);
        return translatableComponent;
    }
}
