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

public final class LOGPEN {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		LOPNSTYLE,
		LOPNWIDTH,
		LOPNCOLOR;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		LOPNSTYLE = offsets.get(0);
		LOPNWIDTH = offsets.get(1);
		LOPNCOLOR = offsets.get(2);
	}

	private LOGPEN() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int lopnStyle,
		long lopnWidth,
		int lopnColor
	) {
		ByteBuffer logpen = malloc();

		lopnStyleSet(logpen, lopnStyle);
		lopnWidthSet(logpen, lopnWidth);
		lopnColorSet(logpen, lopnColor);

		return logpen;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int lopnStyle,
		ByteBuffer lopnWidth,
		int lopnColor
	) {
		ByteBuffer logpen = malloc();

		lopnStyleSet(logpen, lopnStyle);
		lopnWidthSet(logpen, lopnWidth);
		lopnColorSet(logpen, lopnColor);

		return logpen;
	}

	public static void lopnStyleSet(ByteBuffer logpen, int lopnStyle) { logpen.putInt(logpen.position() + LOPNSTYLE, lopnStyle); }
	public static void lopnWidthSet(ByteBuffer logpen, long lopnWidth) { if ( lopnWidth != NULL ) memCopy(lopnWidth, memAddress(logpen) + LOPNWIDTH, POINT.SIZEOF); }
	public static void lopnWidthSet(ByteBuffer logpen, ByteBuffer lopnWidth) { lopnWidthSet(logpen, memAddressSafe(lopnWidth)); }
	public static void lopnWidthXSet(ByteBuffer logpen, int x) { logpen.putInt(logpen.position() + LOPNWIDTH + POINT.X, x); }
	public static void lopnWidthYSet(ByteBuffer logpen, int y) { logpen.putInt(logpen.position() + LOPNWIDTH + POINT.Y, y); }
	public static void lopnColorSet(ByteBuffer logpen, int lopnColor) { logpen.putInt(logpen.position() + LOPNCOLOR, lopnColor); }

	public static int lopnStyleGet(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNSTYLE); }
	public static void lopnWidthGet(ByteBuffer logpen, long lopnWidth) { memCopy(memAddress(logpen) + LOPNWIDTH, lopnWidth, POINT.SIZEOF); }
	public static void lopnWidthGet(ByteBuffer logpen, ByteBuffer lopnWidth) { checkBuffer(lopnWidth, POINT.SIZEOF); lopnWidthGet(logpen, memAddress(lopnWidth)); }
	public static int lopnWidthXGet(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNWIDTH + POINT.X); }
	public static int lopnWidthYGet(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNWIDTH + POINT.Y); }
	public static int lopnColorGet(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNCOLOR); }

}