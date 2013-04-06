/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to Mmsystem.h. */
public final class Mmsystem {

	private Mmsystem() {}

	// --- [ timeGetTime ] ---

	/**
	 * retrieves the system time, in milliseconds. The system time is the time elapsed since Windows was started.
	 * <p/>
	 * Note that the value returned by the {@code timeGetTime} function is a {@code DWORD} value. The return value wraps around to 0 every 2^32 milliseconds,
	 * which is about 49.71 days. This can cause problems in code that directly uses the {@code timeGetTime} return value in computations, particularly where
	 * the value is used to control code execution. You should always use the difference between two {@code timeGetTime} return values in computations.
	 */
	public static native int timeGetTime();

}