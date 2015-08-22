/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A 2D vector with integer components. */
public final class OVRVector2i implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRVector2i() {
		this(malloc());
	}

	public OVRVector2i(ByteBuffer struct) {
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

	public OVRVector2i setX(int x) { x(struct, x); return this; }
	public OVRVector2i setY(int y) { y(struct, y); return this; }

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
		ByteBuffer ovrvector2i = malloc();

		x(ovrvector2i, x);
		y(ovrvector2i, y);

		return ovrvector2i;
	}

	public static void x(ByteBuffer ovrvector2i, int x) { ovrvector2i.putInt(ovrvector2i.position() + X, x); }
	public static void y(ByteBuffer ovrvector2i, int y) { ovrvector2i.putInt(ovrvector2i.position() + Y, y); }

	public static int x(ByteBuffer ovrvector2i) { return ovrvector2i.getInt(ovrvector2i.position() + X); }
	public static int y(ByteBuffer ovrvector2i) { return ovrvector2i.getInt(ovrvector2i.position() + Y); }

}