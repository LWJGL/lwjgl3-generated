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

/** A 4x4 matrix with float components. */
public final class OVRMatrix4f implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		M;

	static {
		IntBuffer offsets = memAllocInt(1);

		SIZEOF = offsets(memAddress(offsets));

		M = offsets.get(0);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRMatrix4f() {
		this(malloc());
	}

	public OVRMatrix4f(ByteBuffer struct) {
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

	public OVRMatrix4f setM(ByteBuffer m) { mSet(struct, m); return this; }
	public OVRMatrix4f setM(int index, float m) { m(struct, index, m); return this; }

	public void getM(ByteBuffer m) { mGet(struct, m); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer m
	) {
		ByteBuffer ovrmatrix4f = malloc();

		mSet(ovrmatrix4f, m);

		return ovrmatrix4f;
	}

	public static void mSet(ByteBuffer ovrmatrix4f, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(m, 16 * 4);
		}
		memCopy(memAddress(m), memAddress(ovrmatrix4f) + M, m.remaining());
	}
	public static void m(ByteBuffer ovrmatrix4f, int index, float m) { ovrmatrix4f.putFloat(M + index * 4, m); }

	public static void mGet(ByteBuffer ovrmatrix4f, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(m, 16 * 4);
		memCopy(memAddress(ovrmatrix4f) + M, memAddress(m), m.remaining());
	}
	public static float m(ByteBuffer ovrmatrix4f, int index) {
		return ovrmatrix4f.getFloat(M + index * 4);
	}

}