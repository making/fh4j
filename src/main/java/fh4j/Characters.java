/*
 * Copyright (C) 2015 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fh4j;

import java.util.HashMap;
import java.util.Map;

class Characters {
    /**
     * 全角文字リスト。
     */
    static final String ZENKAKU_LIST =
            "！”＃＄％＆’（）＊＋，－．／０１２３４"
                    + "５６７８９：；＜＝＞？＠ＡＢＣＤＥＦＧＨ"
                    + "ＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ［￥"
                    + "］＾＿｀ａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐ"
                    + "ｑｒｓｔｕｖｗｘｙｚ｛｜｝￣。「」、・"
                    + "ァィゥェォャュョッーアイエオナニヌネノ"
                    + "マミムメモヤユヨラリルレロン゛゜　";


    /**
     * 全角カナリスト(カ、サ、タ、ハ)行とウ。
     */
    static final String ZENKAKU_KASATAHA_LIST =
            "カキクケコサシスセソタチツテトハヒフヘホウ";

    /**
     * 全角カナリスト(ガ、ザ、ダ、バ)行とヴ。
     */
    static final String ZENKAKU_GAZADABA_LIST =
            "ガギグゲゴザジズゼゾダヂヅデドバビブベボヴ";

    /**
     * 全角カナリスト(パ)行。
     */
    static final String ZENKAKU_PA_LIST =
            "パピプペポ";

    /**
     * 全角カナ(ワ"[&yen;u30f7])。
     */
    static final Character ZENKAKU_WA_DAKUTEN =
            new Character('\u30f7');

    /**
     * 全角カナ(ヲ"[&yen;u30fa])。
     */
    static final Character ZENKAKU_WO_DAKUTEN =
            new Character('\u30fa');

    /**
     * 半角文字リスト。
     */
    static final String HANKAKU_LIST =
            "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGH"
                    + "IJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnop"
                    + "qrstuvwxyz{|}~｡｢｣､･ｧｨｩｪｫｬｭｮｯｰｱｲｴｵﾅﾆﾇﾈﾉ"
                    + "ﾏﾐﾑﾒﾓﾔﾕﾖﾗﾘﾙﾚﾛﾝﾞﾟ ";

    /**
     * 半角カナリスト(ｶ､ｻ､ﾀ､ﾊ)行とｳ。
     */
    static final String HANKAKU_KASATAHA_LIST
            = "ｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾊﾋﾌﾍﾎｳ";

    /**
     * 半角カナリスト(ﾊ)行。
     */
    static final String HANKAKU_HA_LIST = "ﾊﾋﾌﾍﾎ";

    /**
     * 半角文字／全角文字 変換マップ。<br>
     * 全角文字リストの変換
     */
    static Map<Character, String> hankakuToZenkakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = HANKAKU_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hankakuToZenkakuMap.put(
                    charArray[i],
                    String.valueOf(ZENKAKU_LIST.charAt(i)));
        }
    }

    /**
     * 半角文字／全角文字 変換マップ。<br>
     * 全角カナ(ガ、ザ、ダ、バ)行とヴの変換
     */
    static Map<Character, String> hankakuDakuToZenkakuDakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = HANKAKU_KASATAHA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hankakuDakuToZenkakuDakuMap.put(
                    charArray[i],
                    String.valueOf(ZENKAKU_GAZADABA_LIST.charAt(i)));
        }
    }

    /**
     * 半角文字／全角文字 変換マップ。<br>
     * 全角カナ(パ)行の変換
     */
    static Map<Character, String> hankakuHandakuToZenkakuHandakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = HANKAKU_HA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hankakuHandakuToZenkakuHandakuMap.put(
                    charArray[i],
                    String.valueOf(ZENKAKU_PA_LIST.charAt(i)));
        }
    }

    /**
     * 半角文字／全角文字 変換マップ。<br>
     * 全角カナ(カ、サ、タ、ハ)行とウの変換
     */
    static Map<Character, String> hankakuKasatahaToZenkakuKasatahaMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = HANKAKU_KASATAHA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hankakuKasatahaToZenkakuKasatahaMap.put(
                    charArray[i],
                    String.valueOf(ZENKAKU_KASATAHA_LIST.charAt(i)));
        }
    }

    /**
     * 全角文字／半角文字 変換マップ。<br>
     * 全角文字リストの変換
     */
    static Map<Character, String> zenkakuToHankakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = ZENKAKU_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zenkakuToHankakuMap.put(
                    charArray[i],
                    String.valueOf(HANKAKU_LIST.charAt(i)));
        }
    }

    /**
     * 全角文字／半角文字 変換マップ。<br>
     * 半角カナ(ガ、ザ、ダ、バ)行とヴの変換
     */
    static Map<Character, String> zenkakuDakuToHankakuDakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = ZENKAKU_KASATAHA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zenkakuDakuToHankakuDakuMap.put(
                    charArray[i],
                    String.valueOf(HANKAKU_KASATAHA_LIST.charAt(i)));
        }
    }

    /**
     * 全角文字／半角文字 変換マップ。<br>
     * 半角カナ(パ)行の変換
     */
    static Map<Character, String> zenkakuHandakuToHankakuHandakuMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = ZENKAKU_GAZADABA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zenkakuHandakuToHankakuHandakuMap.put(
                    charArray[i],
                    String.valueOf(HANKAKU_KASATAHA_LIST.charAt(i)));
        }
    }

    /**
     * 全角文字／半角文字 変換マップ。<br>
     * 半角カナ(カ、サ、タ、ハ)行とウの変換
     */
    static Map<Character, String> zenkakuKasatahaToHankakuKasatahaMap =
            new HashMap<Character, String>();

    static {
        char[] charArray = ZENKAKU_PA_LIST.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            zenkakuKasatahaToHankakuKasatahaMap.put(
                    charArray[i],
                    String.valueOf(HANKAKU_HA_LIST.charAt(i)));
        }
    }
}
