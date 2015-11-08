/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to user32.dll */
public class User32 {

	/** Function address. */
	@JavadocExclude
	public final long
		GetDC,
		ReleaseDC;

	@JavadocExclude
	protected User32() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public User32(FunctionProvider provider) {
		GetDC = checkFunctionAddress(provider.getFunctionAddress("GetDC"));
		ReleaseDC = checkFunctionAddress(provider.getFunctionAddress("ReleaseDC"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary USER32;

	private static final User32 instance;

	static {
		USER32 = Library.loadNative("user32");
		instance = new User32(USER32);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return USER32;
	}

	/** Returns the {@link User32} instance. */
	public static User32 getInstance() {
		return instance;
	}

	// --- [ GetDC ] ---

	/**
	 * Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
	 * subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
	 *
	 * @param hWnd a handle to the window whose DC is to be retrieved. If this value is {@code NULL}, GetDC retrieves the DC for the entire screen.
	 */
	public static long GetDC(long hWnd) {
		long __functionAddress = getInstance().GetDC;
		return callPP(__functionAddress, hWnd);
	}

	// --- [ ReleaseDC ] ---

	/**
	 * Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
	 * common and window DCs. It has no effect on class or private DCs.
	 *
	 * @param hWnd a handle to the window whose DC is to be released
	 * @param hDC  a handle to the DC to be released
	 */
	public static int ReleaseDC(long hWnd, long hDC) {
		long __functionAddress = getInstance().ReleaseDC;
		if ( CHECKS ) {
			checkPointer(hWnd);
			checkPointer(hDC);
		}
		return callPPI(__functionAddress, hWnd, hDC);
	}

}