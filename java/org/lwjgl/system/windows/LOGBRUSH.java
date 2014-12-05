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

public final class LOGBRUSH implements Pointer {

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

	private final ByteBuffer struct;

	public LOGBRUSH() {
		this(malloc());
	}

	public LOGBRUSH(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setLbStyle(int lbStyle) { lbStyle(struct, lbStyle); }
	public void setLbColor(int lbColor) { lbColor(struct, lbColor); }
	public void setLbHatch(long lbHatch) { lbHatch(struct, lbHatch); }

	public int getLbStyle() { return lbStyle(struct); }
	public int getLbColor() { return lbColor(struct); }
	public long getLbHatch() { return lbHatch(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int lbStyle,
		int lbColor,
		long lbHatch
	) {
		ByteBuffer logbrush = malloc();

		lbStyle(logbrush, lbStyle);
		lbColor(logbrush, lbColor);
		lbHatch(logbrush, lbHatch);

		return logbrush;
	}

	public static void lbStyle(ByteBuffer logbrush, int lbStyle) { logbrush.putInt(logbrush.position() + LBSTYLE, lbStyle); }
	public static void lbColor(ByteBuffer logbrush, int lbColor) { logbrush.putInt(logbrush.position() + LBCOLOR, lbColor); }
	public static void lbHatch(ByteBuffer logbrush, long lbHatch) { PointerBuffer.put(logbrush, logbrush.position() + LBHATCH, lbHatch); }

	public static int lbStyle(ByteBuffer logbrush) { return logbrush.getInt(logbrush.position() + LBSTYLE); }
	public static int lbColor(ByteBuffer logbrush) { return logbrush.getInt(logbrush.position() + LBCOLOR); }
	public static long lbHatch(ByteBuffer logbrush) { return PointerBuffer.get(logbrush, logbrush.position() + LBHATCH); }

}