/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface MDBCmpFuncI extends CallbackI.I {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pp)i", false);
	}

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * A callback function used to compare two keys in a database.
	 *
	 * @param a the first item to compare
	 * @param b the second item to compare
	 *
	 * @return &lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b
	 */
	int invoke(long a, long b);

}