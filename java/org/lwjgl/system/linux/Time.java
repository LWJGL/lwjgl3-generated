/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to <time.h>. */
public final class Time {

	private Time() {}

	// --- [ clock_getres ] ---

	/** JNI method for {@link #clock_getres} */
	public static native int nclock_getres(int clk_id, long res);

	/**
	 * Finds the resolution (precision) of the specified clock {@code clk_id}, and, if res is non-{@code NULL}, stores it in the {@link timespec} struct pointed to by
	 * {@code res}. The resolution of clocks depends on the implementation and cannot be configured by a particular process.
	 *
	 * @param clk_id the clock
	 * @param res    a pointer to a {@link timespec} structure
	 */
	public static int clock_getres(int clk_id, ByteBuffer res) {
		if ( LWJGLUtil.CHECKS )
			if ( res != null ) checkBuffer(res, timespec.SIZEOF);
		return nclock_getres(clk_id, memAddressSafe(res));
	}

	// --- [ clock_gettime ] ---

	/** JNI method for {@link #clock_gettime} */
	public static native int nclock_gettime(int clk_id, long tp);

	/**
	 * Retrieves the time of the specified clock {@code clk_id} and stores it in the {@link timespec} struct pointed to by {@code res}.
	 *
	 * @param clk_id the clock
	 * @param tp     a pointer to a {@link timespec} structure
	 */
	public static int clock_gettime(int clk_id, ByteBuffer tp) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(tp, timespec.SIZEOF);
		return nclock_gettime(clk_id, memAddress(tp));
	}

	// --- [ gettimeofday ] ---

	/** JNI method for {@link #gettimeofday} */
	public static native int ngettimeofday(long tv, long tz);

	/**
	 * Returns the time and the timezone
	 *
	 * @param tv the time
	 * @param tz the timezone
	 */
	public static int gettimeofday(ByteBuffer tv, ByteBuffer tz) {
		if ( LWJGLUtil.CHECKS ) {
			if ( tv != null ) checkBuffer(tv, timeval.SIZEOF);
			if ( tz != null ) checkBuffer(tz, timezone.SIZEOF);
		}
		return ngettimeofday(memAddressSafe(tv), memAddressSafe(tz));
	}

}