/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class LOGBRUSH {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		LBSTYLE,
		LBCOLOR,
		LBHATCH;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		LBSTYLE = offsets.get(0);
		LBCOLOR = offsets.get(1);
		LBHATCH = offsets.get(2);
	}

	private LOGBRUSH() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int lbStyle,
		int lbColor,
		long lbHatch
	) {
		ByteBuffer logbrush = malloc();

		lbStyleSet(logbrush, lbStyle);
		lbColorSet(logbrush, lbColor);
		lbHatchSet(logbrush, lbHatch);

		return logbrush;
	}

	public static void lbStyleSet(ByteBuffer logbrush, int lbStyle) { logbrush.putInt(logbrush.position() + LBSTYLE, lbStyle); }
	public static void lbColorSet(ByteBuffer logbrush, int lbColor) { logbrush.putInt(logbrush.position() + LBCOLOR, lbColor); }
	public static void lbHatchSet(ByteBuffer logbrush, long lbHatch) { PointerBuffer.put(logbrush, logbrush.position() + LBHATCH, lbHatch); }

	public static int lbStyleGet(ByteBuffer logbrush) { return logbrush.getInt(logbrush.position() + LBSTYLE); }
	public static int lbColorGet(ByteBuffer logbrush) { return logbrush.getInt(logbrush.position() + LBCOLOR); }
	public static long lbHatchGet(ByteBuffer logbrush) { return PointerBuffer.get(logbrush, logbrush.position() + LBHATCH); }

}