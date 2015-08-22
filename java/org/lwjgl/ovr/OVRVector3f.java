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

/** A 3D vector with float components. */
public final class OVRVector3f implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		Z = offsets.get(2);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRVector3f() {
		this(malloc());
	}

	public OVRVector3f(ByteBuffer struct) {
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

	public OVRVector3f setX(float x) { x(struct, x); return this; }
	public OVRVector3f setY(float y) { y(struct, y); return this; }
	public OVRVector3f setZ(float z) { z(struct, z); return this; }

	public float getX() { return x(struct); }
	public float getY() { return y(struct); }
	public float getZ() { return z(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float x,
		float y,
		float z
	) {
		ByteBuffer ovrvector3f = malloc();

		x(ovrvector3f, x);
		y(ovrvector3f, y);
		z(ovrvector3f, z);

		return ovrvector3f;
	}

	public static void x(ByteBuffer ovrvector3f, float x) { ovrvector3f.putFloat(ovrvector3f.position() + X, x); }
	public static void y(ByteBuffer ovrvector3f, float y) { ovrvector3f.putFloat(ovrvector3f.position() + Y, y); }
	public static void z(ByteBuffer ovrvector3f, float z) { ovrvector3f.putFloat(ovrvector3f.position() + Z, z); }

	public static float x(ByteBuffer ovrvector3f) { return ovrvector3f.getFloat(ovrvector3f.position() + X); }
	public static float y(ByteBuffer ovrvector3f) { return ovrvector3f.getFloat(ovrvector3f.position() + Y); }
	public static float z(ByteBuffer ovrvector3f) { return ovrvector3f.getFloat(ovrvector3f.position() + Z); }

}