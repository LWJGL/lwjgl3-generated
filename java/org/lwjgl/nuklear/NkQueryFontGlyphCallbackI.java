/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link NkUserFont} struct. */
@FunctionalInterface
public interface NkQueryFontGlyphCallbackI extends CallbackI.V {

	String SIGNATURE = "(pfpii)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgFloat(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}


	void invoke(long handle, float font_height, long glyph, int codepoint, int next_codepoint);

}