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

/** A system specific graphics adapter identifier. */
public final class OVRGraphicsLuid implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RESERVED;

	static {
		IntBuffer offsets = memAllocInt(1);

		SIZEOF = offsets(memAddress(offsets));

		RESERVED = offsets.get(0);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRGraphicsLuid() {
		this(malloc());
	}

	public OVRGraphicsLuid(ByteBuffer struct) {
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

	public OVRGraphicsLuid setReserved(ByteBuffer Reserved) { ReservedSet(struct, Reserved); return this; }
	public OVRGraphicsLuid setReserved(int index, byte Reserved) { Reserved(struct, index, Reserved); return this; }

	public void getReserved(ByteBuffer Reserved) { ReservedGet(struct, Reserved); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Reserved
	) {
		ByteBuffer ovrgraphicsluid = malloc();

		ReservedSet(ovrgraphicsluid, Reserved);

		return ovrgraphicsluid;
	}

	public static void ReservedSet(ByteBuffer ovrgraphicsluid, ByteBuffer Reserved) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(Reserved, 8 * 1);
		}
		memCopy(memAddress(Reserved), memAddress(ovrgraphicsluid) + RESERVED, Reserved.remaining());
	}
	public static void Reserved(ByteBuffer ovrgraphicsluid, int index, byte Reserved) { ovrgraphicsluid.put(RESERVED + index, Reserved); }

	public static void ReservedGet(ByteBuffer ovrgraphicsluid, ByteBuffer Reserved) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Reserved, 8 * 1);
		memCopy(memAddress(ovrgraphicsluid) + RESERVED, memAddress(Reserved), Reserved.remaining());
	}
	public static byte Reserved(ByteBuffer ovrgraphicsluid, int index) {
		return ovrgraphicsluid.get(RESERVED + index * 1);
	}

}