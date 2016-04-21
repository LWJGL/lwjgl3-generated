/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be used with the {@link STBImageWrite} {@code write_type_to_func} functions. */
@FunctionalInterface
public interface STBIWriteCallbackI extends CallbackI.V {

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

	/**
	 * The {@code stbi_write_func} callback.
	 *
	 * @param context the context passed to the write function
	 * @param data    the data to write
	 * @param size    the number of bytes in {@code data}
	 */
	void invoke(long context, long data, int size);

}