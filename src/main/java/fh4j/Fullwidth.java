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

public class Fullwidth {
    /**
     * 指定した文字列の全角文字を半角文字に変換する。
     * <p>
     * 文字列が <code>null</code> または空の文字列の場合はそのまま返却する。<br>
     * 半角文字に変換できない文字は変換されない。<br>
     * 濁点または半濁点を持つ文字（カナ文字）は、２文字に分解される。<br>
     * (例) 'ガ' =&gt; 'ｶ' + 'ﾞ'
     * </p>
     * <p>またこの変換処理では以下の全角文字も変換元文字と受け付ける。</p>
     * <pre>
     *  ・「ヴ」
     *  ・「ワ"」('ワ'に濁点：&yen;u30f7)
     *  ・「ヲ"」('ヲ'に濁点：&yen;u30fa)
     * </pre>
     *
     * @param str 対象となる文字列
     * @return 半角カナ文字列に変換した文字列
     */
    public static String toHalf(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] chars = str.toCharArray();
        StringBuilder returnValue = new StringBuilder();
        String getValue;
        for (int i = 0; i < chars.length; i++) {
            getValue = getHankakuMoji(chars[i]);
            if (getValue != null) {
                returnValue.append(getValue);
            } else {
                returnValue.append(String.valueOf(chars[i]));
            }
        }
        return returnValue.toString();
    }

    /**
     * 全角文字を半角文字に変換する。
     * <p>
     * <pre>
     * このメソッドでは以下の文字を対象とした変換処理を行う。
     *  ・半角文字リスト
     *  ・半角カナ(ｶ､ｻ､ﾀ､ﾊ)行とｳ
     *  ・半角カナ(ｶﾞ､ｻﾞ､ﾀﾞ､ﾊﾞ)行とｳﾞ
     *  ・半角カナ(ﾊﾟ)行
     *  ・半角カナ(ﾜﾞ､ｦﾞ)
     * </pre>
     * <p>
     *
     * @param chr 半角文字
     * @return 全角文字
     */
    private static String getHankakuMoji(char chr) {

        String str;

        str = Characters.zenkakuToHankakuMap.get(chr);
        if (str != null) {
            return str;
        }

        str = Characters.zenkakuDakuToHankakuDakuMap.get(chr);
        if (str != null) {
            // カキクケコサシスセソタチツテトハヒフヘホウ
            return str;
        }

        str = Characters.zenkakuHandakuToHankakuHandakuMap.get(chr);
        if (str != null) {
            // ガギグゲゴザジズゼゾ"ダヂヅデドバビブベボヴ
            return str + "ﾞ";
        }

        str = Characters.zenkakuKasatahaToHankakuKasatahaMap.get(chr);
        if (str != null) {
            // パピプペポ
            return str + "ﾟ";
        } else if (chr == 'ワ') {
            // ワ
            return "ﾜ";
        } else if (chr == 'ヲ') {
            // ヲ
            return "ｦ";
        } else if (chr == Characters.ZENKAKU_WA_DAKUTEN) {
            // ワ"[\u30f7]
            return "ﾜﾞ";
        } else if (chr == Characters.ZENKAKU_WO_DAKUTEN) {
            // ヲ"[\u30fa]
            return "ｦﾞ";
        } else {
            // 該当なし
            return null;
        }
    }
}
