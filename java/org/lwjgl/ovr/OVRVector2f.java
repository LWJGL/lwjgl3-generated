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

/** A 2D vector with float components. */
public final class OVRVector2f implements Pointer {

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

	public OVRVector2f() {
		this(malloc());
	}

	public OVRVector2f(ByteBuffer struct) {
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

	public OVRVector2f setX(float x) { x(struct, x); return this; }
	public OVRVector2f setY(float y) { y(struct, y); return this; }

	public float getX() { return x(struct); }
	public float getY() { return y(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float x,
		float y
	) {
		ByteBuffer ovrvector2f = malloc();

		x(ovrvector2f, x);
		y(ovrvector2f, y);

		return ovrvector2f;
	}

	public static void x(ByteBuffer ovrvector2f, float x) { ovrvector2f.putFloat(ovrvector2f.position() + X, x); }
	public static void y(ByteBuffer ovrvector2f, float y) { ovrvector2f.putFloat(ovrvector2f.position() + Y, y); }

	public static float x(ByteBuffer ovrvector2f) { return ovrvector2f.getFloat(ovrvector2f.position() + X); }
	public static float y(ByteBuffer ovrvector2f) { return ovrvector2f.getFloat(ovrvector2f.position() + Y); }

}