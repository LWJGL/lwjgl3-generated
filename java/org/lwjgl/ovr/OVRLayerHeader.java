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

/** Defines properties shared by all ovrLayer structs, such as {@link OVRLayerEyeFov}. */
public final class OVRLayerHeader implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FLAGS;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		FLAGS = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRLayerHeader() {
		this(malloc());
	}

	public OVRLayerHeader(ByteBuffer struct) {
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

	public OVRLayerHeader setType(int Type) { Type(struct, Type); return this; }
	public OVRLayerHeader setFlags(int Flags) { Flags(struct, Flags); return this; }

	public int getType() { return Type(struct); }
	public int getFlags() { return Flags(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Type,
		int Flags
	) {
		ByteBuffer ovrlayerheader = malloc();

		Type(ovrlayerheader, Type);
		Flags(ovrlayerheader, Flags);

		return ovrlayerheader;
	}

	public static void Type(ByteBuffer ovrlayerheader, int Type) { ovrlayerheader.putInt(ovrlayerheader.position() + TYPE, Type); }
	public static void Flags(ByteBuffer ovrlayerheader, int Flags) { ovrlayerheader.putInt(ovrlayerheader.position() + FLAGS, Flags); }

	public static int Type(ByteBuffer ovrlayerheader) { return ovrlayerheader.getInt(ovrlayerheader.position() + TYPE); }
	public static int Flags(ByteBuffer ovrlayerheader) { return ovrlayerheader.getInt(ovrlayerheader.position() + FLAGS); }

}