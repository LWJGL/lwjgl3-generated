/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
@FunctionalInterface
public interface STBIReadCallbackI extends CallbackI.I {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ppi)i", false);
	}

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.read} callback.
	 *
	 * @param user a pointer to user data
	 * @param data the data buffer to fill
	 * @param size the number of bytes to read
	 *
	 * @return the number of bytes actually read
	 */
	int invoke(long user, long data, int size);

}