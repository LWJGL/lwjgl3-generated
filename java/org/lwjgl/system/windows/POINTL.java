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

/** Contains the coordinates of a point. */
public final class POINTL implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
	}

	private final ByteBuffer struct;

	public POINTL() {
		this(malloc());
	}

	public POINTL(ByteBuffer struct) {
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

	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }

	public int getX() { return x(struct); }
	public int getY() { return y(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int x,
		int y
	) {
		ByteBuffer pointl = malloc();

		x(pointl, x);
		y(pointl, y);

		return pointl;
	}

	public static void x(ByteBuffer pointl, int x) { pointl.putInt(pointl.position() + X, x); }
	public static void y(ByteBuffer pointl, int y) { pointl.putInt(pointl.position() + Y, y); }

	public static int x(ByteBuffer pointl) { return pointl.getInt(pointl.position() + X); }
	public static int y(ByteBuffer pointl) { return pointl.getInt(pointl.position() + Y); }

}