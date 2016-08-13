/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code nk_style_*} structs. */
@FunctionalInterface
public interface NkDrawEndCallbackI extends CallbackI.F {

	String SIGNATURE = "(pp)f";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default float callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	float invoke(long buffer, long userdata);

}