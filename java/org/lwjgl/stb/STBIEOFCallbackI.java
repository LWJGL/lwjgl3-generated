/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct. */
@FunctionalInterface
public interface STBIEOFCallbackI extends CallbackI.I {

	@Override
	default long address() {
		return apiCreateCallback(this, "(p)i", false);
	}

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.eof} callback.
	 *
	 * @param user a pointer to user data
	 *
	 * @return nonzero if we are at the end of file/data
	 */
	int invoke(long user);

}