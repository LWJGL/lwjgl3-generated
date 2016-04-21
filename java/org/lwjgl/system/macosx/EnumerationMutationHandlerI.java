/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** A mutation handler. */
@FunctionalInterface
public interface EnumerationMutationHandlerI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(p)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when an object is mutated during a foreach iteration.
	 *
	 * @param id the object that was mutated
	 */
	void invoke(long id);

}