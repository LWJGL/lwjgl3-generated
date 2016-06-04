/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code nk_style_*} structs. */
@FunctionalInterface
public interface NkDrawBeginCallbackI extends CallbackI.F {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pp)f", false);
	}

	@Override
	default float callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	float invoke(long buffer, long userdata);

}