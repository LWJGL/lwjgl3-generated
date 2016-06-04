/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link #nk_plot_function} function. */
@FunctionalInterface
public interface NkValueGetterI extends CallbackI.F {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pi)f", false);
	}

	@Override
	default float callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}


	float invoke(long userdata, int index);

}