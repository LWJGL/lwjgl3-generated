/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link Nuklear#nk_combo_callback combo_callback} and {@link Nuklear#nk_combobox_callback combobox_callback} functions. */
@FunctionalInterface
public interface NkItemGetterI extends CallbackI.F {

	String SIGNATURE = "(pip)f";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default float callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}


	float invoke(long userdata, int selected, long item);

}