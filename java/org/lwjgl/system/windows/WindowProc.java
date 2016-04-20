/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** An application-defined function that processes messages sent to a window. */
@FunctionalInterface
public interface WindowProc extends Callback.P {

	/** Creates a {@code WindowProc} instance from the specified function pointer. */
	static WindowProc create(long functionPointer) {
		return functionPointer == NULL ? null : new WindowProcHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code WindowProc} instance that delegates to the specified {@code WindowProc} instance. */
	static WindowProc create(WindowProc sam) {
		return new WindowProcHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pipp)p", true);
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

final class WindowProcHandle extends Pointer.Default implements WindowProc {

	private final WindowProc delegate;

	WindowProcHandle(long functionPointer, WindowProc delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
		return delegate.invoke(hwnd, uMsg, wParam, lParam);
	}

}