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

/** A quaternion rotation. */
public final class OVRQuatf implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z,
		W;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		Z = offsets.get(2);
		W = offsets.get(3);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRQuatf() {
		this(malloc());
	}

	public OVRQuatf(ByteBuffer struct) {
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

	public OVRQuatf setX(float x) { x(struct, x); return this; }
	public OVRQuatf setY(float y) { y(struct, y); return this; }
	public OVRQuatf setZ(float z) { z(struct, z); return this; }
	public OVRQuatf setW(float w) { w(struct, w); return this; }

	public float getX() { return x(struct); }
	public float getY() { return y(struct); }
	public float getZ() { return z(struct); }
	public float getW() { return w(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float x,
		float y,
		float z,
		float w
	) {
		ByteBuffer ovrquatf = malloc();

		x(ovrquatf, x);
		y(ovrquatf, y);
		z(ovrquatf, z);
		w(ovrquatf, w);

		return ovrquatf;
	}

	public static void x(ByteBuffer ovrquatf, float x) { ovrquatf.putFloat(ovrquatf.position() + X, x); }
	public static void y(ByteBuffer ovrquatf, float y) { ovrquatf.putFloat(ovrquatf.position() + Y, y); }
	public static void z(ByteBuffer ovrquatf, float z) { ovrquatf.putFloat(ovrquatf.position() + Z, z); }
	public static void w(ByteBuffer ovrquatf, float w) { ovrquatf.putFloat(ovrquatf.position() + W, w); }

	public static float x(ByteBuffer ovrquatf) { return ovrquatf.getFloat(ovrquatf.position() + X); }
	public static float y(ByteBuffer ovrquatf) { return ovrquatf.getFloat(ovrquatf.position() + Y); }
	public static float z(ByteBuffer ovrquatf) { return ovrquatf.getFloat(ovrquatf.position() + Z); }
	public static float w(ByteBuffer ovrquatf) { return ovrquatf.getFloat(ovrquatf.position() + W); }

}