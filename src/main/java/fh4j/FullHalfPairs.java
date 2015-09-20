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

import java.util.Set;

public class FullHalfPairs {
	private final Set<FullHalfPair> pairs;
	private final ComposablePredicate predicate;

	public FullHalfPairs(Set<FullHalfPair> pairs, ComposablePredicate predicate) {
		this.pairs = pairs;
		this.predicate = predicate != null ? predicate : new ComposablePredicate() {
			@Override
			public boolean isComposable(char c) {
				return c == 'ﾞ' || c == 'ﾟ';
			}
		};
	}

	public Set<FullHalfPair> pairs() {
		return this.pairs;
	}

	public ComposablePredicate predicate() {
		return this.predicate;
	}

	public interface ComposablePredicate {
		boolean isComposable(char c);
	}
}
