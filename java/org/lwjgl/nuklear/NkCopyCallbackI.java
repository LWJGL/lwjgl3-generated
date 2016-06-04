/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link NkClipboard} struct. */
@FunctionalInterface
public interface NkCopyCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ppi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}


	void invoke(long handle, long text, int len);

}