/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** An application-defined function that processes messages sent to a window. */
@FunctionalInterface
public interface WindowProcI extends CallbackI.P {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pipp)p", true);
	}

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called for each message sent to the window.
	 *
	 * @param hwnd   a handle to the window procedure that received the message
	 * @param uMsg   the message
	 * @param wParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
	 * @param lParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
	 */
	long invoke(long hwnd, int uMsg, long wParam, long lParam);

}