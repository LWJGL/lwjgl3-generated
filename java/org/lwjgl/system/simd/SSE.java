/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.simd;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Bindings to SSE macros. */
public final class SSE {

	/** Exception state. */
	public static final int
		_MM_EXCEPT_MASK      = 0x3F,
		_MM_EXCEPT_INVALID   = 0x1,
		_MM_EXCEPT_DENORM    = 0x2,
		_MM_EXCEPT_DIV_ZERO  = 0x4,
		_MM_EXCEPT_OVERFLOW  = 0x8,
		_MM_EXCEPT_UNDERFLOW = 0x10,
		_MM_EXCEPT_INEXACT   = 0x20;

	/** Exception mask. */
	public static final int
		_MM_MASK_MASK      = 0x1F80,
		_MM_MASK_INVALID   = 0x80,
		_MM_MASK_DENORM    = 0x100,
		_MM_MASK_DIV_ZERO  = 0x200,
		_MM_MASK_OVERFLOW  = 0x400,
		_MM_MASK_UNDERFLOW = 0x800,
		_MM_MASK_INEXACT   = 0x1000;

	/** Round mode. */
	public static final int
		_MM_ROUND_MASK        = 0x6000,
		_MM_ROUND_NEAREST     = 0x0,
		_MM_ROUND_DOWN        = 0x2000,
		_MM_ROUND_UP          = 0x4000,
		_MM_ROUND_TOWARD_ZERO = 0x6000;

	/** Flush zero mask. */
	public static final int
		_MM_FLUSH_ZERO_MASK = 0x8000,
		_MM_FLUSH_ZERO_ON   = 0x8000,
		_MM_FLUSH_ZERO_OFF  = 0x0;

	static { LWJGLUtil.initialize(); }

	private SSE() {}

	// --- [ _MM_SET_EXCEPTION_STATE ] ---

	/**
	 * Writes to the six least significant control register bits.
	 *
	 * @param mask the exception state. One of:<br>{@link #_MM_EXCEPT_MASK EXCEPT_MASK}, {@link #_MM_EXCEPT_INVALID EXCEPT_INVALID}, {@link #_MM_EXCEPT_DENORM EXCEPT_DENORM}, {@link #_MM_EXCEPT_DIV_ZERO EXCEPT_DIV_ZERO}, {@link #_MM_EXCEPT_OVERFLOW EXCEPT_OVERFLOW}, {@link #_MM_EXCEPT_UNDERFLOW EXCEPT_UNDERFLOW}, {@link #_MM_EXCEPT_INEXACT EXCEPT_INEXACT}
	 */
	public static native void _MM_SET_EXCEPTION_STATE(int mask);

	// --- [ _MM_GET_EXCEPTION_STATE ] ---

	/** Reads from the six least significant control register bits. */
	public static native int _MM_GET_EXCEPTION_STATE();

	// --- [ _MM_SET_EXCEPTION_MASK ] ---

	/**
	 * Writes to bit 7 – 12 control register bits.
	 * 
	 * <p>All six exception mask bits are always affected. Bits not set explicitly are cleared.</p>
	 *
	 * @param mask the exception mask. One or more of:<br>{@link #_MM_MASK_MASK MASK_MASK}, {@link #_MM_MASK_INVALID MASK_INVALID}, {@link #_MM_MASK_DENORM MASK_DENORM}, {@link #_MM_MASK_DIV_ZERO MASK_DIV_ZERO}, {@link #_MM_MASK_OVERFLOW MASK_OVERFLOW}, {@link #_MM_MASK_UNDERFLOW MASK_UNDERFLOW}, {@link #_MM_MASK_INEXACT MASK_INEXACT}
	 */
	public static native void _MM_SET_EXCEPTION_MASK(int mask);

	// --- [ _MM_GET_EXCEPTION_MASK ] ---

	/** Reads from bit 7 – 12 control register bits. */
	public static native int _MM_GET_EXCEPTION_MASK();

	// --- [ _MM_SET_ROUNDING_MODE ] ---

	/**
	 * Writes to bits 13 and 14 of the control register.
	 *
	 * @param mode the rounding mode. One of:<br>{@link #_MM_ROUND_MASK ROUND_MASK}, {@link #_MM_ROUND_NEAREST ROUND_NEAREST}, {@link #_MM_ROUND_DOWN ROUND_DOWN}, {@link #_MM_ROUND_UP ROUND_UP}, {@link #_MM_ROUND_TOWARD_ZERO ROUND_TOWARD_ZERO}
	 */
	public static native void _MM_SET_ROUNDING_MODE(int mode);

	// --- [ _MM_GET_ROUNDING_MODE ] ---

	/** Reads from bits 13 and 14 of the control register. */
	public static native int _MM_GET_ROUNDING_MODE();

	// --- [ _MM_SET_FLUSH_ZERO_MODE ] ---

	/**
	 * Writes to bit 15 of the control register.
	 *
	 * @param mode the flush-to-zero mode. One of:<br>{@link #_MM_FLUSH_ZERO_MASK FLUSH_ZERO_MASK}, {@link #_MM_FLUSH_ZERO_ON FLUSH_ZERO_ON}, {@link #_MM_FLUSH_ZERO_OFF FLUSH_ZERO_OFF}
	 */
	public static native void _MM_SET_FLUSH_ZERO_MODE(int mode);

	// --- [ _MM_GET_FLUSH_ZERO_MODE ] ---

	/** Reads from bit 15 of the control register. */
	public static native int _MM_GET_FLUSH_ZERO_MODE();

}