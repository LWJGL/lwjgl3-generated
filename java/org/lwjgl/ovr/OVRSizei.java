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

/** A 2D size with integer components. */
public final class OVRSizei implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		W,
		H;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		W = offsets.get(0);
		H = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRSizei() {
		this(malloc());
	}

	public OVRSizei(ByteBuffer struct) {
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

	public OVRSizei setW(int w) { w(struct, w); return this; }
	public OVRSizei setH(int h) { h(struct, h); return this; }

	public int getW() { return w(struct); }
	public int getH() { return h(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int w,
		int h
	) {
		ByteBuffer ovrsizei = malloc();

		w(ovrsizei, w);
		h(ovrsizei, h);

		return ovrsizei;
	}

	public static void w(ByteBuffer ovrsizei, int w) { ovrsizei.putInt(ovrsizei.position() + W, w); }
	public static void h(ByteBuffer ovrsizei, int h) { ovrsizei.putInt(ovrsizei.position() + H, h); }

	public static int w(ByteBuffer ovrsizei) { return ovrsizei.getInt(ovrsizei.position() + W); }
	public static int h(ByteBuffer ovrsizei) { return ovrsizei.getInt(ovrsizei.position() + H); }

}