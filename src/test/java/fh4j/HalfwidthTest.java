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

public class HalfwidthTest {

    @Test
    public void testToFull() throws Exception {
        assertThat(Halfwidth.toFull("ｱ"), is("ア"));
        assertThat(Halfwidth.toFull("!"), is("！"));
        assertThat(Halfwidth.toFull("\""), is("”"));
        assertThat(Halfwidth.toFull("#"), is("＃"));
        assertThat(Halfwidth.toFull("$"), is("＄"));
        assertThat(Halfwidth.toFull("%"), is("％"));
        assertThat(Halfwidth.toFull("&"), is("＆"));
        assertThat(Halfwidth.toFull("'"), is("’"));
        assertThat(Halfwidth.toFull("("), is("（"));
        assertThat(Halfwidth.toFull(")"), is("）"));
        assertThat(Halfwidth.toFull("*"), is("＊"));
        assertThat(Halfwidth.toFull("+"), is("＋"));
        assertThat(Halfwidth.toFull(","), is("，"));
        assertThat(Halfwidth.toFull("-"), is("－"));
        assertThat(Halfwidth.toFull("."), is("．"));
        assertThat(Halfwidth.toFull("/"), is("／"));
        assertThat(Halfwidth.toFull("0"), is("０"));
        assertThat(Halfwidth.toFull("1"), is("１"));
        assertThat(Halfwidth.toFull("2"), is("２"));
        assertThat(Halfwidth.toFull("3"), is("３"));
        assertThat(Halfwidth.toFull("4"), is("４"));
        assertThat(Halfwidth.toFull("5"), is("５"));
        assertThat(Halfwidth.toFull("6"), is("６"));
        assertThat(Halfwidth.toFull("7"), is("７"));
        assertThat(Halfwidth.toFull("8"), is("８"));
        assertThat(Halfwidth.toFull("9"), is("９"));
        assertThat(Halfwidth.toFull(":"), is("："));
        assertThat(Halfwidth.toFull(";"), is("；"));
        assertThat(Halfwidth.toFull("<"), is("＜"));
        assertThat(Halfwidth.toFull("="), is("＝"));
        assertThat(Halfwidth.toFull(">"), is("＞"));
        assertThat(Halfwidth.toFull("?"), is("？"));
        assertThat(Halfwidth.toFull("@"), is("＠"));
        assertThat(Halfwidth.toFull("A"), is("Ａ"));
        assertThat(Halfwidth.toFull("B"), is("Ｂ"));
        assertThat(Halfwidth.toFull("C"), is("Ｃ"));
        assertThat(Halfwidth.toFull("D"), is("Ｄ"));
        assertThat(Halfwidth.toFull("E"), is("Ｅ"));
        assertThat(Halfwidth.toFull("F"), is("Ｆ"));
        assertThat(Halfwidth.toFull("G"), is("Ｇ"));
        assertThat(Halfwidth.toFull("H"), is("Ｈ"));
        assertThat(Halfwidth.toFull("I"), is("Ｉ"));
        assertThat(Halfwidth.toFull("J"), is("Ｊ"));
        assertThat(Halfwidth.toFull("K"), is("Ｋ"));
        assertThat(Halfwidth.toFull("L"), is("Ｌ"));
        assertThat(Halfwidth.toFull("M"), is("Ｍ"));
        assertThat(Halfwidth.toFull("N"), is("Ｎ"));
        assertThat(Halfwidth.toFull("O"), is("Ｏ"));
        assertThat(Halfwidth.toFull("P"), is("Ｐ"));
        assertThat(Halfwidth.toFull("Q"), is("Ｑ"));
        assertThat(Halfwidth.toFull("R"), is("Ｒ"));
        assertThat(Halfwidth.toFull("S"), is("Ｓ"));
        assertThat(Halfwidth.toFull("T"), is("Ｔ"));
        assertThat(Halfwidth.toFull("U"), is("Ｕ"));
        assertThat(Halfwidth.toFull("V"), is("Ｖ"));
        assertThat(Halfwidth.toFull("W"), is("Ｗ"));
        assertThat(Halfwidth.toFull("X"), is("Ｘ"));
        assertThat(Halfwidth.toFull("Y"), is("Ｙ"));
        assertThat(Halfwidth.toFull("Z"), is("Ｚ"));
        assertThat(Halfwidth.toFull("["), is("［"));
        assertThat(Halfwidth.toFull("\\"), is("￥"));
        assertThat(Halfwidth.toFull("]"), is("］"));
        assertThat(Halfwidth.toFull("^"), is("＾"));
        assertThat(Halfwidth.toFull("_"), is("＿"));
        assertThat(Halfwidth.toFull("`"), is("｀"));
        assertThat(Halfwidth.toFull("a"), is("ａ"));
        assertThat(Halfwidth.toFull("b"), is("ｂ"));
        assertThat(Halfwidth.toFull("c"), is("ｃ"));
        assertThat(Halfwidth.toFull("d"), is("ｄ"));
        assertThat(Halfwidth.toFull("e"), is("ｅ"));
        assertThat(Halfwidth.toFull("f"), is("ｆ"));
        assertThat(Halfwidth.toFull("g"), is("ｇ"));
        assertThat(Halfwidth.toFull("h"), is("ｈ"));
        assertThat(Halfwidth.toFull("i"), is("ｉ"));
        assertThat(Halfwidth.toFull("j"), is("ｊ"));
        assertThat(Halfwidth.toFull("k"), is("ｋ"));
        assertThat(Halfwidth.toFull("l"), is("ｌ"));
        assertThat(Halfwidth.toFull("m"), is("ｍ"));
        assertThat(Halfwidth.toFull("n"), is("ｎ"));
        assertThat(Halfwidth.toFull("o"), is("ｏ"));
        assertThat(Halfwidth.toFull("p"), is("ｐ"));
        assertThat(Halfwidth.toFull("q"), is("ｑ"));
        assertThat(Halfwidth.toFull("r"), is("ｒ"));
        assertThat(Halfwidth.toFull("s"), is("ｓ"));
        assertThat(Halfwidth.toFull("t"), is("ｔ"));
        assertThat(Halfwidth.toFull("u"), is("ｕ"));
        assertThat(Halfwidth.toFull("v"), is("ｖ"));
        assertThat(Halfwidth.toFull("w"), is("ｗ"));
        assertThat(Halfwidth.toFull("x"), is("ｘ"));
        assertThat(Halfwidth.toFull("y"), is("ｙ"));
        assertThat(Halfwidth.toFull("z"), is("ｚ"));
        assertThat(Halfwidth.toFull("{"), is("｛"));
        assertThat(Halfwidth.toFull("|"), is("｜"));
        assertThat(Halfwidth.toFull("}"), is("｝"));
        assertThat(Halfwidth.toFull("~"), is("￣"));
        assertThat(Halfwidth.toFull("｡"), is("。"));
        assertThat(Halfwidth.toFull("｢"), is("「"));
        assertThat(Halfwidth.toFull("｣"), is("」"));
        assertThat(Halfwidth.toFull("､"), is("、"));
        assertThat(Halfwidth.toFull("･"), is("・"));
        assertThat(Halfwidth.toFull("ｧ"), is("ァ"));
        assertThat(Halfwidth.toFull("ｨ"), is("ィ"));
        assertThat(Halfwidth.toFull("ｩ"), is("ゥ"));
        assertThat(Halfwidth.toFull("ｪ"), is("ェ"));
        assertThat(Halfwidth.toFull("ｫ"), is("ォ"));
        assertThat(Halfwidth.toFull("ｬ"), is("ャ"));
        assertThat(Halfwidth.toFull("ｭ"), is("ュ"));
        assertThat(Halfwidth.toFull("ｮ"), is("ョ"));
        assertThat(Halfwidth.toFull("ｯ"), is("ッ"));
        assertThat(Halfwidth.toFull("ｰ"), is("ー"));
        assertThat(Halfwidth.toFull("ｱ"), is("ア"));
        assertThat(Halfwidth.toFull("ｲ"), is("イ"));
        assertThat(Halfwidth.toFull("ｴ"), is("エ"));
        assertThat(Halfwidth.toFull("ｵ"), is("オ"));
        assertThat(Halfwidth.toFull("ﾅ"), is("ナ"));
        assertThat(Halfwidth.toFull("ﾆ"), is("ニ"));
        assertThat(Halfwidth.toFull("ﾇ"), is("ヌ"));
        assertThat(Halfwidth.toFull("ﾈ"), is("ネ"));
        assertThat(Halfwidth.toFull("ﾉ"), is("ノ"));
        assertThat(Halfwidth.toFull("ﾏ"), is("マ"));
        assertThat(Halfwidth.toFull("ﾐ"), is("ミ"));
        assertThat(Halfwidth.toFull("ﾑ"), is("ム"));
        assertThat(Halfwidth.toFull("ﾒ"), is("メ"));
        assertThat(Halfwidth.toFull("ﾓ"), is("モ"));
        assertThat(Halfwidth.toFull("ﾔ"), is("ヤ"));
        assertThat(Halfwidth.toFull("ﾕ"), is("ユ"));
        assertThat(Halfwidth.toFull("ﾖ"), is("ヨ"));
        assertThat(Halfwidth.toFull("ﾗ"), is("ラ"));
        assertThat(Halfwidth.toFull("ﾘ"), is("リ"));
        assertThat(Halfwidth.toFull("ﾙ"), is("ル"));
        assertThat(Halfwidth.toFull("ﾚ"), is("レ"));
        assertThat(Halfwidth.toFull("ﾛ"), is("ロ"));
        assertThat(Halfwidth.toFull("ﾝ"), is("ン"));
        assertThat(Halfwidth.toFull("ﾞ"), is("゛"));
        assertThat(Halfwidth.toFull("ﾟ"), is("゜"));
        assertThat(Halfwidth.toFull(" "), is("　"));
    }

    @Test
    public void testToFull_NotMapped() throws Exception {
        assertThat(Halfwidth.toFull("あ"), is("あ"));
        assertThat(Halfwidth.toFull("一"), is("一"));
    }

    @Test
    public void testToFull_String() throws Exception {
        assertThat(Halfwidth.toFull("ﾒﾛﾝ"), is("メロン"));
    }

    @Test
    public void testToFull_String_NotMapped() throws Exception {
        assertThat(Halfwidth.toFull("あいうえお"), is("あいうえお"));
    }

    @Test
    public void testToFull_String_Mixed() throws Exception {
        assertThat(Halfwidth.toFull("あいうえおｶｷｸｹｺ"), is("あいうえおカキクケコ"));
    }

    @Test
    public void testToFull01_半角普通英数字一文字が全角普通英数字に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("A"), is("Ａ"));
    }

    @Test
    public void testToFull02_半角普通文字が複数全角普通文字に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｱﾞ!A8"), is("ア゛！Ａ８"));
    }

    @Test
    public void testToFull03_半角サ一文字が全角サに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｻ"), is("サ"));
    }

    @Test
    public void testToFull04_半角カサタハウが複数全角カサタハウに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｶｻﾀﾊｳ"), is("カサタハウ"));
    }

    @Test
    public void testToFull05_半角濁点一文字が全角濁点に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｶﾞ"), is("ガ"));
    }

    @Test
    public void testToFull06_半角濁点が複数文字全角濁点に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｶﾞｻﾞﾀﾞﾊﾞｳﾞ"), is("ガザダバヴ"));
    }

    @Test
    public void testToFull07_半角半濁点一文字が全角半濁点に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ﾎﾟ"), is("ポ"));
    }

    @Test
    public void testToFull08_半角半濁点が複数文字全角半濁点に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ"), is("パピプペポ"));
    }

    @Test
    public void testToFull09_半角ワが全角ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ﾜ"), is("ワ"));
    }

    @Test
    public void testToFull10_半角ヲが全角ヲに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｦ"), is("ヲ"));
    }

    @Test
    public void testToFull11_半角濁点ワが全角濁点ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ﾜﾞ"), is("\u30f7"));
    }

    @Test
    public void testToFull12_半角濁点ヲが全角濁点ヲに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｦﾞ"), is("\u30fa"));
    }

    @Test
    public void testToFull13_半角ワが文字列の途中にある時全角ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("Aﾜ1"), is("Ａワ１"));
    }

    @Test
    public void testToFull14_半角ヲが文字列の途中にある時全角ヲに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("Bｦ8"), is("Ｂヲ８"));
    }

    @Test
    public void testToFull15_半角濁点ワが文字列の途中にある時全角濁点ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("Bﾜﾞ8"), is("Ｂ\u30f7８"));
    }

    @Test
    public void testToFull16_半角濁点ワが文字列の途中にある時全角濁点ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("Bｦﾞ8"), is("Ｂ\u30fa８"));
    }

    @Test
    public void testToFull17_半角ワが文字列の末尾にある時全角ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｱAﾜ"), is("アＡワ"));
    }

    @Test
    public void testToFull18_半角ヲが文字列の末尾にある時全角ヲに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("tBｦ"), is("ｔＢヲ"));
    }

    @Test
    public void testToFull19_半角濁点ワが文字列の末尾にある時全角濁点ワに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｻBﾜﾞ"), is("サＢ\u30f7"));
    }

    @Test
    public void testToFull20_半角濁点ヲが文字列の末尾にある時全角濁点ヲに変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｱBｦﾞ"), is("アＢ\u30fa"));
    }

    @Test
    public void testToFull21_入力値に全角文字と半角文字を混合させたものを設定し全て全角文字に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("サｼズｾﾞソ"), is("サシズゼソ"));
    }

    @Test
    public void testToFull22_置換対象文字列がnullの時nullを戻り値とし処理を終了すること() throws Exception {
        assertThat(Halfwidth.toFull(null), is(nullValue()));
    }

    @Test
    public void testToFull23_置換対象文字列が空文字の時空文字を戻り値とし処理を終了すること() throws Exception {
        assertThat(Halfwidth.toFull(""), is(""));
    }

    @Test
    public void testToFull24_半角半濁点文字が全角半濁点文字に変換されること() throws Exception {
        assertThat(Halfwidth.toFull("ｶﾟｷﾟ"), is("カ゜キ゜"));
    }
}
