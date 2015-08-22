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

/**
 * Projection information for {@link OVRLayerEyeFovDepth}.
 * 
 * <p>Use the utility function {@link OVRUtil#ovrTimewarpProjectionDesc_FromProjection} to generate this structure from the application's projection matrix.</p>
 */
public final class OVRTimewarpProjectionDesc implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		PROJECTION22,
		PROJECTION23,
		PROJECTION32;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		PROJECTION22 = offsets.get(0);
		PROJECTION23 = offsets.get(1);
		PROJECTION32 = offsets.get(2);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRTimewarpProjectionDesc() {
		this(malloc());
	}

	public OVRTimewarpProjectionDesc(ByteBuffer struct) {
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

	public OVRTimewarpProjectionDesc setProjection22(float Projection22) { Projection22(struct, Projection22); return this; }
	public OVRTimewarpProjectionDesc setProjection23(float Projection23) { Projection23(struct, Projection23); return this; }
	public OVRTimewarpProjectionDesc setProjection32(float Projection32) { Projection32(struct, Projection32); return this; }

	public float getProjection22() { return Projection22(struct); }
	public float getProjection23() { return Projection23(struct); }
	public float getProjection32() { return Projection32(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float Projection22,
		float Projection23,
		float Projection32
	) {
		ByteBuffer ovrtimewarpprojectiondesc = malloc();

		Projection22(ovrtimewarpprojectiondesc, Projection22);
		Projection23(ovrtimewarpprojectiondesc, Projection23);
		Projection32(ovrtimewarpprojectiondesc, Projection32);

		return ovrtimewarpprojectiondesc;
	}

	public static void Projection22(ByteBuffer ovrtimewarpprojectiondesc, float Projection22) { ovrtimewarpprojectiondesc.putFloat(ovrtimewarpprojectiondesc.position() + PROJECTION22, Projection22); }
	public static void Projection23(ByteBuffer ovrtimewarpprojectiondesc, float Projection23) { ovrtimewarpprojectiondesc.putFloat(ovrtimewarpprojectiondesc.position() + PROJECTION23, Projection23); }
	public static void Projection32(ByteBuffer ovrtimewarpprojectiondesc, float Projection32) { ovrtimewarpprojectiondesc.putFloat(ovrtimewarpprojectiondesc.position() + PROJECTION32, Projection32); }

	public static float Projection22(ByteBuffer ovrtimewarpprojectiondesc) { return ovrtimewarpprojectiondesc.getFloat(ovrtimewarpprojectiondesc.position() + PROJECTION22); }
	public static float Projection23(ByteBuffer ovrtimewarpprojectiondesc) { return ovrtimewarpprojectiondesc.getFloat(ovrtimewarpprojectiondesc.position() + PROJECTION23); }
	public static float Projection32(ByteBuffer ovrtimewarpprojectiondesc) { return ovrtimewarpprojectiondesc.getFloat(ovrtimewarpprojectiondesc.position() + PROJECTION32); }

}