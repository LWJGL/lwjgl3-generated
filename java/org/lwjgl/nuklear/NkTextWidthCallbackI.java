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
public interface NkTextWidthCallbackI extends CallbackI.F {

	String SIGNATURE = "(pfpi)f";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default float callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgFloat(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}


	float invoke(long handle, float h, long text, int len);

}