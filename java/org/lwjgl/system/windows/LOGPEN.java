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
			LOPNWIDTH_X,
			LOPNWIDTH_Y,
		LOPNCOLOR;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		LOPNSTYLE = offsets.get(0);
		LOPNWIDTH = offsets.get(1);
			LOPNWIDTH_X = LOPNWIDTH + POINT.X;
			LOPNWIDTH_Y = LOPNWIDTH + POINT.Y;
		LOPNCOLOR = offsets.get(2);
	}

	private LOGPEN() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int lopnStyle,
		int lopnWidth_x,
		int lopnWidth_y,
		int lopnColor
	) {
		ByteBuffer struct = malloc();

		lopnStyleSet(struct, lopnStyle);
		lopnWidthXSet(struct, lopnWidth_x);
		lopnWidthYSet(struct, lopnWidth_y);
		lopnColorSet(struct, lopnColor);

		return struct;
	}

	public static void lopnStyleSet(ByteBuffer struct, int lopnStyle) { struct.putInt(struct.position() + LOPNSTYLE, lopnStyle); }
	public static void lopnWidthXSet(ByteBuffer struct, int x) { struct.putInt(struct.position() + LOPNWIDTH_X, x); }
	public static void lopnWidthYSet(ByteBuffer struct, int y) { struct.putInt(struct.position() + LOPNWIDTH_Y, y); }
	public static void lopnColorSet(ByteBuffer struct, int lopnColor) { struct.putInt(struct.position() + LOPNCOLOR, lopnColor); }

	public static int lopnStyleGet(ByteBuffer struct) { return struct.getInt(struct.position() + LOPNSTYLE); }
	public static int lopnWidthXGet(ByteBuffer struct) { return struct.getInt(struct.position() + LOPNWIDTH_X); }
	public static int lopnWidthYGet(ByteBuffer struct) { return struct.getInt(struct.position() + LOPNWIDTH_Y); }
	public static int lopnColorGet(ByteBuffer struct) { return struct.getInt(struct.position() + LOPNCOLOR); }

}