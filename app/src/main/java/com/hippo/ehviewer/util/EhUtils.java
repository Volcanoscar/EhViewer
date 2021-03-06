/*
 * Copyright (C) 2014-2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.util;

import android.graphics.Color;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class EhUtils {

    public static final DateFormat POST_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    public static final String EH_DOWNLOAD_FILENAME = ".ehviewer";

    public static final int NONE = -1; // Use it for homepage
    public static final int MISC = 0x1;
    public static final int DOUJINSHI = 0x2;
    public static final int MANGA = 0x4;
    public static final int ARTIST_CG = 0x8;
    public static final int GAME_CG = 0x10;
    public static final int IMAGE_SET = 0x20;
    public static final int COSPLAY = 0x40;
    public static final int ASIAN_PORN = 0x80;
    public static final int NON_H = 0x100;
    public static final int WESTERN = 0x200;
    public static final int UNKNOWN = 0x400;

    public static final int BG_COLOR_DOUJINSHI = 0xfff44336;
    public static final int BG_COLOR_MANGA = 0xffff9800;
    public static final int BG_COLOR_ARTIST_CG = 0xfffbc02d;
    public static final int BG_COLOR_GAME_CG = 0xff4caf50;
    public static final int BG_COLOR_WESTERN = 0xff8bc34a;
    public static final int BG_COLOR_NON_H = 0xff2196f3;
    public static final int BG_COLOR_IMAGE_SET = 0xff3f51b5;
    public static final int BG_COLOR_COSPLAY = 0xff9c27b0;
    public static final int BG_COLOR_ASIAN_PORN = 0xff9575cd;
    public static final int BG_COLOR_MISC = 0xfff06292;
    public static final int BG_COLOR_UNKNOWN = Color.BLACK;

    private static final int[] CATEGORY_VALUES = {
            MISC,
            DOUJINSHI,
            MANGA,
            ARTIST_CG,
            GAME_CG,
            IMAGE_SET,
            COSPLAY,
            ASIAN_PORN,
            NON_H,
            WESTERN,
            UNKNOWN };

    private static final String[][] CATEGORY_STRINGS = {
            new String[] { "misc" },
            new String[] { "doujinshi" },
            new String[] { "manga" },
            new String[] { "artistcg", "Artist CG Sets" },
            new String[] { "gamecg", "Game CG Sets" },
            new String[] { "imageset", "Image Sets" },
            new String[] { "cosplay" },
            new String[] { "asianporn", "Asian Porn" },
            new String[] { "non-h" },
            new String[] { "western" },
            new String[] { "unknown" }
    };

    public static int getCategory(String type) {
        int i;
        for (i = 0; i < CATEGORY_STRINGS.length - 1; i++) {
            for (String str : CATEGORY_STRINGS[i])
                if (str.equalsIgnoreCase(type))
                    return CATEGORY_VALUES[i];
        }

        return CATEGORY_VALUES[i];
    }

    public static String getCategory(int type) {
        int i;
        for (i = 0; i < CATEGORY_VALUES.length - 1; i++) {
            if (CATEGORY_VALUES[i] == type)
                break;
        }
        return CATEGORY_STRINGS[i][0];
    }

    public static int getCategoryColor(int category) {
        switch (category) {
            case DOUJINSHI:
                return BG_COLOR_DOUJINSHI;
            case MANGA:
                return BG_COLOR_MANGA;
            case ARTIST_CG:
                return BG_COLOR_ARTIST_CG;
            case GAME_CG:
                return BG_COLOR_GAME_CG;
            case WESTERN:
                return BG_COLOR_WESTERN;
            case NON_H:
                return BG_COLOR_NON_H;
            case IMAGE_SET:
                return BG_COLOR_IMAGE_SET;
            case COSPLAY:
                return BG_COLOR_COSPLAY;
            case ASIAN_PORN:
                return BG_COLOR_ASIAN_PORN;
            case MISC:
                return BG_COLOR_MISC;
            default:
                return BG_COLOR_UNKNOWN;
        }
    }

    public static String formatPostDate(long date) {
        return POST_DATE_FORMAT.format(date);
    }
}
