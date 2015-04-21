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
 * Rendering information for positional TimeWarp. Contains the data necessary to properly calculate position info for timewarp matrices and also interpret
 * depth info provided via the depth buffer to the timewarp shader.
 */
public final class OVRPositionTimewarpDesc implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HMDTOEYEVIEWOFFSET,
		NEARCLIP,
		FARCLIP;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		HMDTOEYEVIEWOFFSET = offsets.get(0);
		NEARCLIP = offsets.get(1);
		FARCLIP = offsets.get(2);
	}

	private final ByteBuffer struct;

	public OVRPositionTimewarpDesc() {
		this(malloc());
	}

	public OVRPositionTimewarpDesc(ByteBuffer struct) {
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

	public void setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetSet(struct, HmdToEyeViewOffset); }
	public void setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset, int index) { HmdToEyeViewOffsetSet(struct, HmdToEyeViewOffset, index); }
	public void setNearClip(float NearClip) { NearClip(struct, NearClip); }
	public void setFarClip(float FarClip) { FarClip(struct, FarClip); }

	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetGet(struct, HmdToEyeViewOffset); }
	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset, int index) { HmdToEyeViewOffsetGet(struct, HmdToEyeViewOffset, index); }
	public float getNearClip() { return NearClip(struct); }
	public float getFarClip() { return FarClip(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer HmdToEyeViewOffset,
		float NearClip,
		float FarClip
	) {
		ByteBuffer ovrpositiontimewarpdesc = malloc();

		HmdToEyeViewOffsetSet(ovrpositiontimewarpdesc, HmdToEyeViewOffset);
		NearClip(ovrpositiontimewarpdesc, NearClip);
		FarClip(ovrpositiontimewarpdesc, FarClip);

		return ovrpositiontimewarpdesc;
	}

	public static void HmdToEyeViewOffsetSet(ByteBuffer ovrpositiontimewarpdesc, ByteBuffer HmdToEyeViewOffset) {
		checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(memAddress(HmdToEyeViewOffset), memAddress(ovrpositiontimewarpdesc) + HMDTOEYEVIEWOFFSET, HmdToEyeViewOffset.remaining());
	}
	public static void HmdToEyeViewOffsetSet(ByteBuffer ovrpositiontimewarpdesc, ByteBuffer HmdToEyeViewOffset, int index) {
		checkBufferGT(HmdToEyeViewOffset, OVRVector3f.SIZEOF);
		memCopy(memAddress(HmdToEyeViewOffset), memAddress(ovrpositiontimewarpdesc) + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, HmdToEyeViewOffset.remaining());
	}
	public static void NearClip(ByteBuffer ovrpositiontimewarpdesc, float NearClip) { ovrpositiontimewarpdesc.putFloat(ovrpositiontimewarpdesc.position() + NEARCLIP, NearClip); }
	public static void FarClip(ByteBuffer ovrpositiontimewarpdesc, float FarClip) { ovrpositiontimewarpdesc.putFloat(ovrpositiontimewarpdesc.position() + FARCLIP, FarClip); }

	public static void HmdToEyeViewOffsetGet(ByteBuffer ovrpositiontimewarpdesc, ByteBuffer HmdToEyeViewOffset) {
		checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(memAddress(ovrpositiontimewarpdesc) + HMDTOEYEVIEWOFFSET, memAddress(HmdToEyeViewOffset), HmdToEyeViewOffset.remaining());
	}
	public static void HmdToEyeViewOffsetGet(ByteBuffer ovrpositiontimewarpdesc, ByteBuffer HmdToEyeViewOffset, int index) {
		checkBufferGT(HmdToEyeViewOffset, OVRVector3f.SIZEOF);
		memCopy(memAddress(ovrpositiontimewarpdesc) + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, memAddress(HmdToEyeViewOffset), HmdToEyeViewOffset.remaining());
	}
	public static float NearClip(ByteBuffer ovrpositiontimewarpdesc) { return ovrpositiontimewarpdesc.getFloat(ovrpositiontimewarpdesc.position() + NEARCLIP); }
	public static float FarClip(ByteBuffer ovrpositiontimewarpdesc) { return ovrpositiontimewarpdesc.getFloat(ovrpositiontimewarpdesc.position() + FARCLIP); }

}