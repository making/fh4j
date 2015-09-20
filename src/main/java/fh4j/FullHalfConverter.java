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

import java.util.*;

public class FullHalfConverter {
	private final Map<String, FullHalfPair> fullwidthMap;
	private final Map<String, FullHalfPair> halfwidthMap;
	private final FullHalfPairs.ComposablePredicate predicate;

	public FullHalfConverter(FullHalfPairs pairs) {
		Set<FullHalfPair> pairSet = pairs.pairs();
		Map<String, FullHalfPair> f = new HashMap<String, FullHalfPair>();
		Map<String, FullHalfPair> h = new HashMap<String, FullHalfPair>();
		for (FullHalfPair pair : pairSet) {
			f.put(pair.fullwidth(), pair);
			h.put(pair.halfwidth(), pair);
		}
		this.fullwidthMap = Collections.unmodifiableMap(f);
		this.halfwidthMap = Collections.unmodifiableMap(h);
		this.predicate = pairs.predicate();
	}

	public String toHalfwidth(String fullwidth) {
		if (fullwidth == null || fullwidth.isEmpty()) {
			return fullwidth;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < fullwidth.length(); i++) {
			String s = String.valueOf(fullwidth.charAt(i));
			builder.append(halfwidth(s));
		}
		return builder.toString();
	}

	public String toFullwidth(String halfwidth) {
		if (halfwidth == null || halfwidth.isEmpty()) {
			return halfwidth;
		}
		StringBuilder builder = new StringBuilder();
		Queue<String> buffer = new LinkedList<String>(); // サイズは1のバッファとしてキューを使う

		for (int i = 0; i < halfwidth.length(); i++) {
			char c = halfwidth.charAt(i);
			String s = String.valueOf(c);
			// バッファが空の場合は次のループへ
			if (buffer.isEmpty()) {
				buffer.add(s);
				continue;
			}
			if (predicate.isComposable(c)) {
				FullHalfPair pair = this.halfwidthMap.get(buffer.peek() + s);
				if (pair != null) {
					// 結合文字をStringBuilderに追加してバッファを空にする
					builder.append(pair.fullwidth());
					buffer.clear();
				}
				else {
					// バッファの文字と次の文字をStringBuilderに追加
					builder.append(fullwidth(buffer.poll()));
					builder.append(fullwidth(s));
				}
			}
			else {
				// バッファの文字をStringBuilderに追加して、次の文字をバッファに追加
				builder.append(fullwidth(buffer.poll()));
				buffer.add(s);
			}
		}
		// バッファが残っている場合はStringBuilderに追加
		if (!buffer.isEmpty()) {
			builder.append(fullwidth(buffer.poll()));
		}
		return builder.toString();
	}

	private String fullwidth(String s) {
		FullHalfPair pair = this.halfwidthMap.get(s);
		if (pair != null) {
			return pair.fullwidth();
		}
		else {
			return s;
		}
	}

	private String halfwidth(String s) {
		FullHalfPair pair = this.fullwidthMap.get(s);
		if (pair != null) {
			return pair.halfwidth();
		}
		else {
			return s;
		}
	}
}
