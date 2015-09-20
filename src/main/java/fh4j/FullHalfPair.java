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

import java.io.Serializable;

public final class FullHalfPair implements Serializable {
	private final String fullwidth;
	private final String halfwidth;

	public FullHalfPair(String fullwidth, String halfwidth) {
		this.fullwidth = fullwidth;
		this.halfwidth = halfwidth;
	}

	public String fullwidth() {
		return this.fullwidth;
	}

	public String halfwidth() {
		return this.halfwidth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		FullHalfPair that = (FullHalfPair) o;

		if (!fullwidth.equals(that.fullwidth))
			return false;
		return halfwidth.equals(that.halfwidth);

	}

	@Override
	public int hashCode() {
		int result = fullwidth.hashCode();
		result = 31 * result + halfwidth.hashCode();
		return result;
	}
}
