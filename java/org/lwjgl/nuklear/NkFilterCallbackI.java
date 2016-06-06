/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link NkTextEdit} struct. */
@FunctionalInterface
public interface NkFilterCallbackI extends CallbackI.I {

	String SIGNATURE = "(pi)i";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}


	int invoke(long edit, int unicode);

}