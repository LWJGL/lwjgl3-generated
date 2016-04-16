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
public abstract class WindowProc extends Callback.P {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.windows.WindowProc");

	protected WindowProc() {
		super(CALL_CONVENTION_SYSTEM + "(pipp)p", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
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
	public abstract long invoke(long hwnd, int uMsg, long wParam, long lParam);

	/** A functional interface for {@link WindowProc}. */
	public interface SAM {
		long invoke(long hwnd, int uMsg, long wParam, long lParam);
	}

	/**
	 * Creates a {@link WindowProc} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link WindowProc} instance
	 */
	public static WindowProc create(SAM sam) {
		return new WindowProc() {
			@Override
			public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
				return sam.invoke(hwnd, uMsg, wParam, lParam);
			}
		};
	}

}