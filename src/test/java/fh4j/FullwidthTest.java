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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FullwidthTest {
    @Test
    public void testToFull() throws Exception {
        assertThat(Fullwidth.toHalf("ア"), is("ｱ"));
        assertThat(Fullwidth.toHalf("！"), is("!"));
        assertThat(Fullwidth.toHalf("”"), is("\""));
        assertThat(Fullwidth.toHalf("＃"), is("#"));
        assertThat(Fullwidth.toHalf("＄"), is("$"));
        assertThat(Fullwidth.toHalf("％"), is("%"));
        assertThat(Fullwidth.toHalf("＆"), is("&"));
        assertThat(Fullwidth.toHalf("’"), is("'"));
        assertThat(Fullwidth.toHalf("（"), is("("));
        assertThat(Fullwidth.toHalf("）"), is(")"));
        assertThat(Fullwidth.toHalf("＊"), is("*"));
        assertThat(Fullwidth.toHalf("＋"), is("+"));
        assertThat(Fullwidth.toHalf("，"), is(","));
        assertThat(Fullwidth.toHalf("－"), is("-"));
        assertThat(Fullwidth.toHalf("．"), is("."));
        assertThat(Fullwidth.toHalf("／"), is("/"));
        assertThat(Fullwidth.toHalf("０"), is("0"));
        assertThat(Fullwidth.toHalf("１"), is("1"));
        assertThat(Fullwidth.toHalf("２"), is("2"));
        assertThat(Fullwidth.toHalf("３"), is("3"));
        assertThat(Fullwidth.toHalf("４"), is("4"));
        assertThat(Fullwidth.toHalf("５"), is("5"));
        assertThat(Fullwidth.toHalf("６"), is("6"));
        assertThat(Fullwidth.toHalf("７"), is("7"));
        assertThat(Fullwidth.toHalf("８"), is("8"));
        assertThat(Fullwidth.toHalf("９"), is("9"));
        assertThat(Fullwidth.toHalf("："), is(":"));
        assertThat(Fullwidth.toHalf("；"), is(";"));
        assertThat(Fullwidth.toHalf("＜"), is("<"));
        assertThat(Fullwidth.toHalf("＝"), is("="));
        assertThat(Fullwidth.toHalf("＞"), is(">"));
        assertThat(Fullwidth.toHalf("？"), is("?"));
        assertThat(Fullwidth.toHalf("＠"), is("@"));
        assertThat(Fullwidth.toHalf("Ａ"), is("A"));
        assertThat(Fullwidth.toHalf("Ｂ"), is("B"));
        assertThat(Fullwidth.toHalf("Ｃ"), is("C"));
        assertThat(Fullwidth.toHalf("Ｄ"), is("D"));
        assertThat(Fullwidth.toHalf("Ｅ"), is("E"));
        assertThat(Fullwidth.toHalf("Ｆ"), is("F"));
        assertThat(Fullwidth.toHalf("Ｇ"), is("G"));
        assertThat(Fullwidth.toHalf("Ｈ"), is("H"));
        assertThat(Fullwidth.toHalf("Ｉ"), is("I"));
        assertThat(Fullwidth.toHalf("Ｊ"), is("J"));
        assertThat(Fullwidth.toHalf("Ｋ"), is("K"));
        assertThat(Fullwidth.toHalf("Ｌ"), is("L"));
        assertThat(Fullwidth.toHalf("Ｍ"), is("M"));
        assertThat(Fullwidth.toHalf("Ｎ"), is("N"));
        assertThat(Fullwidth.toHalf("Ｏ"), is("O"));
        assertThat(Fullwidth.toHalf("Ｐ"), is("P"));
        assertThat(Fullwidth.toHalf("Ｑ"), is("Q"));
        assertThat(Fullwidth.toHalf("Ｒ"), is("R"));
        assertThat(Fullwidth.toHalf("Ｓ"), is("S"));
        assertThat(Fullwidth.toHalf("Ｔ"), is("T"));
        assertThat(Fullwidth.toHalf("Ｕ"), is("U"));
        assertThat(Fullwidth.toHalf("Ｖ"), is("V"));
        assertThat(Fullwidth.toHalf("Ｗ"), is("W"));
        assertThat(Fullwidth.toHalf("Ｘ"), is("X"));
        assertThat(Fullwidth.toHalf("Ｙ"), is("Y"));
        assertThat(Fullwidth.toHalf("Ｚ"), is("Z"));
        assertThat(Fullwidth.toHalf("［"), is("["));
        assertThat(Fullwidth.toHalf("￥"), is("\\"));
        assertThat(Fullwidth.toHalf("］"), is("]"));
        assertThat(Fullwidth.toHalf("＾"), is("^"));
        assertThat(Fullwidth.toHalf("＿"), is("_"));
        assertThat(Fullwidth.toHalf("｀"), is("`"));
        assertThat(Fullwidth.toHalf("ａ"), is("a"));
        assertThat(Fullwidth.toHalf("ｂ"), is("b"));
        assertThat(Fullwidth.toHalf("ｃ"), is("c"));
        assertThat(Fullwidth.toHalf("ｄ"), is("d"));
        assertThat(Fullwidth.toHalf("ｅ"), is("e"));
        assertThat(Fullwidth.toHalf("ｆ"), is("f"));
        assertThat(Fullwidth.toHalf("ｇ"), is("g"));
        assertThat(Fullwidth.toHalf("ｈ"), is("h"));
        assertThat(Fullwidth.toHalf("ｉ"), is("i"));
        assertThat(Fullwidth.toHalf("ｊ"), is("j"));
        assertThat(Fullwidth.toHalf("ｋ"), is("k"));
        assertThat(Fullwidth.toHalf("ｌ"), is("l"));
        assertThat(Fullwidth.toHalf("ｍ"), is("m"));
        assertThat(Fullwidth.toHalf("ｎ"), is("n"));
        assertThat(Fullwidth.toHalf("ｏ"), is("o"));
        assertThat(Fullwidth.toHalf("ｐ"), is("p"));
        assertThat(Fullwidth.toHalf("ｑ"), is("q"));
        assertThat(Fullwidth.toHalf("ｒ"), is("r"));
        assertThat(Fullwidth.toHalf("ｓ"), is("s"));
        assertThat(Fullwidth.toHalf("ｔ"), is("t"));
        assertThat(Fullwidth.toHalf("ｕ"), is("u"));
        assertThat(Fullwidth.toHalf("ｖ"), is("v"));
        assertThat(Fullwidth.toHalf("ｗ"), is("w"));
        assertThat(Fullwidth.toHalf("ｘ"), is("x"));
        assertThat(Fullwidth.toHalf("ｙ"), is("y"));
        assertThat(Fullwidth.toHalf("ｚ"), is("z"));
        assertThat(Fullwidth.toHalf("｛"), is("{"));
        assertThat(Fullwidth.toHalf("｜"), is("|"));
        assertThat(Fullwidth.toHalf("｝"), is("}"));
        assertThat(Fullwidth.toHalf("￣"), is("~"));
        assertThat(Fullwidth.toHalf("。"), is("｡"));
        assertThat(Fullwidth.toHalf("「"), is("｢"));
        assertThat(Fullwidth.toHalf("」"), is("｣"));
        assertThat(Fullwidth.toHalf("、"), is("､"));
        assertThat(Fullwidth.toHalf("・"), is("･"));
        assertThat(Fullwidth.toHalf("ァ"), is("ｧ"));
        assertThat(Fullwidth.toHalf("ィ"), is("ｨ"));
        assertThat(Fullwidth.toHalf("ゥ"), is("ｩ"));
        assertThat(Fullwidth.toHalf("ェ"), is("ｪ"));
        assertThat(Fullwidth.toHalf("ォ"), is("ｫ"));
        assertThat(Fullwidth.toHalf("ャ"), is("ｬ"));
        assertThat(Fullwidth.toHalf("ュ"), is("ｭ"));
        assertThat(Fullwidth.toHalf("ョ"), is("ｮ"));
        assertThat(Fullwidth.toHalf("ッ"), is("ｯ"));
        assertThat(Fullwidth.toHalf("ー"), is("ｰ"));
        assertThat(Fullwidth.toHalf("ア"), is("ｱ"));
        assertThat(Fullwidth.toHalf("イ"), is("ｲ"));
        assertThat(Fullwidth.toHalf("エ"), is("ｴ"));
        assertThat(Fullwidth.toHalf("オ"), is("ｵ"));
        assertThat(Fullwidth.toHalf("ナ"), is("ﾅ"));
        assertThat(Fullwidth.toHalf("ニ"), is("ﾆ"));
        assertThat(Fullwidth.toHalf("ヌ"), is("ﾇ"));
        assertThat(Fullwidth.toHalf("ネ"), is("ﾈ"));
        assertThat(Fullwidth.toHalf("ノ"), is("ﾉ"));
        assertThat(Fullwidth.toHalf("マ"), is("ﾏ"));
        assertThat(Fullwidth.toHalf("ミ"), is("ﾐ"));
        assertThat(Fullwidth.toHalf("ム"), is("ﾑ"));
        assertThat(Fullwidth.toHalf("メ"), is("ﾒ"));
        assertThat(Fullwidth.toHalf("モ"), is("ﾓ"));
        assertThat(Fullwidth.toHalf("ヤ"), is("ﾔ"));
        assertThat(Fullwidth.toHalf("ユ"), is("ﾕ"));
        assertThat(Fullwidth.toHalf("ヨ"), is("ﾖ"));
        assertThat(Fullwidth.toHalf("ラ"), is("ﾗ"));
        assertThat(Fullwidth.toHalf("リ"), is("ﾘ"));
        assertThat(Fullwidth.toHalf("ル"), is("ﾙ"));
        assertThat(Fullwidth.toHalf("レ"), is("ﾚ"));
        assertThat(Fullwidth.toHalf("ロ"), is("ﾛ"));
        assertThat(Fullwidth.toHalf("ン"), is("ﾝ"));
        assertThat(Fullwidth.toHalf("゛"), is("ﾞ"));
        assertThat(Fullwidth.toHalf("゜"), is("ﾟ"));
        assertThat(Fullwidth.toHalf("　"), is(" "));
    }

    @Test
    public void testToFull_NotMapped() throws Exception {
        assertThat(Fullwidth.toHalf("あ"), is("あ"));
        assertThat(Fullwidth.toHalf("一"), is("一"));
    }

    @Test
    public void testToFull_String() throws Exception {
        assertThat(Fullwidth.toHalf("メロン"), is("ﾒﾛﾝ"));
    }

    @Test
    public void testToHalf01_全角文字が半角文字に複数文字変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("Ａ！ア"), is("A!ｱ"));
    }

    @Test
    public void testToHalf02_全角文字に対して半角文字に一文字変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("Ａ"), is("A"));
    }

    @Test
    public void testToHalf03_全角カサタハが半角カサタハに変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("カサタハ"), is("ｶｻﾀﾊ"));
    }

    @Test
    public void testToHalf04_全角濁点文字が二文字に分解されて表示されること() throws Exception {
        assertThat(Fullwidth.toHalf("ガザダ"), is("ｶﾞｻﾞﾀﾞ"));
    }

    @Test
    public void testToHalf05_全角濁点半濁点文字が二文字に分解されて表示されること() throws Exception {
        assertThat(Fullwidth.toHalf("パポ"), is("ﾊﾟﾎﾟ"));
    }

    @Test
    public void testToHalf06_全角ワが半角ワに変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("Ａワ"), is("Aﾜ"));
    }

    @Test
    public void testToHalf07_全角ヲが半角ヲに変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("Ａヲ"), is("Aｦ"));
    }

    @Test
    public void testToHalf08_全角濁点ワが半角濁点ﾜに変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("ア\u30f7"), is("ｱﾜﾞ"));
    }

    @Test
    public void testToHalf09_全角濁点ヲが半角濁点ｦに変換されること() throws Exception {
        assertThat(Fullwidth.toHalf("\u30faヴ"), is("ｦﾞｳﾞ"));
    }

    @Test
    public void testToHalf10_半角全角混合文字が全て半角に変換されることを() throws Exception {
        assertThat(Fullwidth.toHalf("サ\u30faｲAピ"), is("ｻｦﾞｲAﾋﾟ"));
    }

    @Test
    public void testToHalf11_置換対象文字列が空文字の時空文字を戻り値とし処理を終了すること() throws Exception {
        assertThat(Fullwidth.toHalf(""), is(""));
    }

    @Test
    public void testToHalf12_置換対象文字列がnullの時nullを戻り値とし処理を終了すること() throws Exception {
        assertThat(Fullwidth.toHalf(null), is(nullValue()));
    }

    @Test
    public void testToHalf13_半角化不可能な文字列がそのまま全角文字列で出力されること() throws Exception {
        assertThat(Fullwidth.toHalf("入力値"), is("入力値"));
    }
}
