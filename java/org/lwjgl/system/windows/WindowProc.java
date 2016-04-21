/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** An application-defined function that processes messages sent to a window. */
public abstract class WindowProc extends Callback implements WindowProcI {

	/** Creates a {@code WindowProc} instance from the specified function pointer. */
	public static WindowProc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		WindowProcI instance = Callback.get(functionPointer);
		return instance instanceof WindowProc
			? (WindowProc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code WindowProc} instance that delegates to the specified {@code WindowProcI} instance. */
	public static WindowProc create(WindowProcI instance) {
		return instance instanceof WindowProc
			? (WindowProc)instance
			: new Container(instance.address(), instance);
	}

	protected WindowProc() {
		super(NULL);
		address = WindowProcI.super.address();
	}

	private WindowProc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends WindowProc {

		private final WindowProcI delegate;

		Container(long functionPointer, WindowProcI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
			return delegate.invoke(hwnd, uMsg, wParam, lParam);
		}

	}

}