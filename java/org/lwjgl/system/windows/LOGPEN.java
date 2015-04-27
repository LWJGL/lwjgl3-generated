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

public final class LOGPEN implements Pointer {

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

	private final ByteBuffer struct;

	public LOGPEN() {
		this(malloc());
	}

	public LOGPEN(ByteBuffer struct) {
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

	public void setLopnStyle(int lopnStyle) { lopnStyle(struct, lopnStyle); }
	public void setLopnWidth(ByteBuffer lopnWidth) { lopnWidthSet(struct, lopnWidth); }
	public void setLopnWidthX(int x) { lopnWidthX(struct, x); }
	public void setLopnWidthY(int y) { lopnWidthY(struct, y); }
	public void setLopnColor(int lopnColor) { lopnColor(struct, lopnColor); }

	public int getLopnStyle() { return lopnStyle(struct); }
	public void getLopnWidth(ByteBuffer lopnWidth) { lopnWidthGet(struct, lopnWidth); }
	public int getLopnWidthX() { return lopnWidthX(struct); }
	public int getLopnWidthY() { return lopnWidthY(struct); }
	public int getLopnColor() { return lopnColor(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int lopnStyle,
		ByteBuffer lopnWidth,
		int lopnColor
	) {
		ByteBuffer logpen = malloc();

		lopnStyle(logpen, lopnStyle);
		lopnWidthSet(logpen, lopnWidth);
		lopnColor(logpen, lopnColor);

		return logpen;
	}

	public static void lopnStyle(ByteBuffer logpen, int lopnStyle) { logpen.putInt(logpen.position() + LOPNSTYLE, lopnStyle); }
	public static void lopnWidthSet(ByteBuffer logpen, ByteBuffer lopnWidth) { if ( lopnWidth != null ) memCopy(memAddress(lopnWidth), memAddress(logpen) + LOPNWIDTH, POINT.SIZEOF); }
	public static void lopnWidthX(ByteBuffer logpen, int x) { logpen.putInt(logpen.position() + LOPNWIDTH + POINT.X, x); }
	public static void lopnWidthY(ByteBuffer logpen, int y) { logpen.putInt(logpen.position() + LOPNWIDTH + POINT.Y, y); }
	public static void lopnColor(ByteBuffer logpen, int lopnColor) { logpen.putInt(logpen.position() + LOPNCOLOR, lopnColor); }

	public static int lopnStyle(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNSTYLE); }
	public static void lopnWidthGet(ByteBuffer logpen, ByteBuffer lopnWidth) { if ( LWJGLUtil.CHECKS ) checkBuffer(lopnWidth, POINT.SIZEOF); memCopy(memAddress(logpen) + LOPNWIDTH, memAddress(lopnWidth), POINT.SIZEOF); }
	public static int lopnWidthX(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNWIDTH + POINT.X); }
	public static int lopnWidthY(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNWIDTH + POINT.Y); }
	public static int lopnColor(ByteBuffer logpen) { return logpen.getInt(logpen.position() + LOPNCOLOR); }

}