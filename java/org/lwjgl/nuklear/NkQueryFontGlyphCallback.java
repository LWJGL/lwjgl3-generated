/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkUserFont} struct. */
public abstract class NkQueryFontGlyphCallback extends Callback implements NkQueryFontGlyphCallbackI {

	/** Creates a {@code NkQueryFontGlyphCallback} instance from the specified function pointer. */
	public static NkQueryFontGlyphCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkQueryFontGlyphCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkQueryFontGlyphCallback
			? (NkQueryFontGlyphCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkQueryFontGlyphCallback} instance that delegates to the specified {@code NkQueryFontGlyphCallbackI} instance. */
	public static NkQueryFontGlyphCallback create(NkQueryFontGlyphCallbackI instance) {
		return instance instanceof NkQueryFontGlyphCallback
			? (NkQueryFontGlyphCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkQueryFontGlyphCallback() {
		super(SIGNATURE);
	}

	private NkQueryFontGlyphCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkQueryFontGlyphCallback {

		private final NkQueryFontGlyphCallbackI delegate;

		Container(long functionPointer, NkQueryFontGlyphCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, float font_height, long glyph, int codepoint, int next_codepoint) {
			delegate.invoke(handle, font_height, glyph, codepoint, next_codepoint);
		}

	}

}