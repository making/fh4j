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


public class Halfwidth {
    /**
     * 指定した文字列の半角文字を全角文字に変換する。
     * <p>
     * 全角文字に変換できない文字は変換されない。<br>
     * 文字列が <code>null</code> または空の文字列の場合はそのまま返却する。<br>
     * 半角文字に濁点または半濁点が続く場合は、可能な限り１文字に変換する。<br>
     * (例) 'ｶ' + 'ﾞ' =&gt; 'ガ'
     * </p>
     * <p>またこの変換処理では以下の全角文字も変換先文字とされる。</p>
     * <pre>
     *  ・「ヴ」
     *  ・「ワ"」('ワ'に濁点：&yen;u30f7)
     *  ・「ヲ"」('ヲ'に濁点：&yen;u30fa)
     * </pre>
     *
     * @param str 対象となる文字列
     * @return 全角カナ文字列に変換した文字列
     */
    public static String toFull(String str) {

        // パラメータチェック
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] chars = str.toCharArray();
        StringBuilder returnValue = new StringBuilder();
        String getValue = null;
        Character nextvalue = null;

        for (int i = 0; i < chars.length; i++) {

            getValue = getZenkakuMoji(chars[i]);

            if (getValue != null) {
                returnValue.append(getValue);
            } else if (i == (chars.length - 1)) {
                // 最後の文字
                getValue = getZenkakuKasatahaMoji(chars[i]);
                if (getValue != null) {
                    // ｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾊﾋﾌﾍﾎｳ
                    returnValue.append(getValue);
                } else if (chars[i] == 'ﾜ') {
                    returnValue.append("ワ");
                } else if (chars[i] == 'ｦ') {
                    returnValue.append("ヲ");
                } else {
                    returnValue.append(String.valueOf(chars[i]));
                }
            } else {
                nextvalue = new Character(chars[i + 1]);
                if (nextvalue.equals(new Character('ﾞ'))) {
                    getValue = getZenkakuDakuMoji(chars[i]);
                    if (getValue != null) {
                        // ｶﾞｷﾞｸﾞｹﾞｺﾞｻﾞｼﾞｽﾞｾﾞｿﾞﾀﾞﾁﾞﾂﾞﾃﾞﾄﾞﾊﾞﾋﾞﾌﾞﾍﾞﾎﾞｳﾞ
                        returnValue.append(getValue);
                        i++;
                    } else if (chars[i] == 'ﾜ') {
                        // ﾜﾞ
                        returnValue.append(Characters.ZENKAKU_WA_DAKUTEN);
                        i++;
                    } else if (chars[i] == 'ｦ') {
                        // ｦﾞ
                        returnValue.append(Characters.ZENKAKU_WO_DAKUTEN);
                        i++;
                    } else {
                        returnValue.append((String.valueOf(chars[i]) + "゛"));
                        i++;
                    }
                } else if (nextvalue.equals(new Character('ﾟ'))) {
                    getValue = getZenkakuHandakuMoji(chars[i]);
                    if (getValue != null) {
                        // ﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ
                        returnValue.append(getValue);
                        i++;
                    } else if (chars[i] == 'ﾜ') {
                        returnValue.append("ワ" + "゜");
                        i++;
                    } else if (chars[i] == 'ｦ') {
                        returnValue.append("ヲ" + "゜");
                        i++;
                    } else {
                        // ｶﾟｷﾟｸﾟｹﾟｺﾟｻﾟｼﾟｽﾟｾﾟｿﾟﾀﾟﾁﾟﾂﾟﾃﾟﾄﾟｳﾟ
                        getValue = getZenkakuKasatahaMoji(chars[i]);
                        if (getValue != null) {
                            returnValue.append((String.valueOf(getValue) + "゜"));
                            i++;
                        } else {
                            returnValue.append((String.valueOf(chars[i]) + "゜"));
                            i++;
                        }
                    }
                } else {
                    getValue = getZenkakuKasatahaMoji(chars[i]);
                    if (getValue != null) {
                        // ｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾊﾋﾌﾍﾎｳ
                        returnValue.append(getValue);
                    } else if (chars[i] == 'ﾜ') {
                        returnValue.append("ワ");
                    } else if (chars[i] == 'ｦ') {
                        returnValue.append("ヲ");
                    } else {
                        returnValue.append(String.valueOf(chars[i]));
                    }
                }
            }
        }
        return returnValue.toString();
    }


    /**
     * 半角文字を全角文字に変換する。
     * <p>
     * 全角文字リストの変換処理を行う。
     * </p>
     *
     * @param chr 半角文字
     * @return 全角文字
     */
    private static String getZenkakuMoji(char chr) {

        return Characters.hankakuToZenkakuMap.get(chr);
    }

    /**
     * 半角文字を全角文字に変換する。
     * <p>
     * 全角カナ(ガ、ザ、ダ、バ)行とヴの変換処理を行う。
     * </p>
     *
     * @param chr 半角文字
     * @return 全角文字
     */
    private static String getZenkakuDakuMoji(char chr) {

        return Characters.hankakuDakuToZenkakuDakuMap.get(chr);
    }

    /**
     * 半角文字を全角文字に変換する。
     * <p>
     * 全角カナ(パ)行の変換処理を行う。
     * </p>
     *
     * @param chr 半角文字
     * @return 全角文字
     */
    private static String getZenkakuHandakuMoji(char chr) {

        return Characters.hankakuHandakuToZenkakuHandakuMap.get(chr);
    }

    /**
     * 半角文字を全角文字に変換する。
     * <p>
     * 全角カナ(カ、サ、タ、ハ)行とウの変換処理を行う。
     * </p>
     *
     * @param chr 半角文字
     * @return 全角文字
     */
    private static String getZenkakuKasatahaMoji(char chr) {

        return Characters.hankakuKasatahaToZenkakuKasatahaMap.get(chr);
    }
}
