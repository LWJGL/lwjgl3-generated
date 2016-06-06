/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link NkAllocator} struct. */
@FunctionalInterface
public interface NkMallocI extends CallbackI.P {

	String SIGNATURE = "(ppp)p";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	long invoke(long handle, long old, long size);

}