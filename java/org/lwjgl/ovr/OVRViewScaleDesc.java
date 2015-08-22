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
 * Contains the data necessary to properly calculate position info for various layer types.
 * <ul>
 * <li>{@code HmdToEyeViewOffset} is the same value pair provided in {@link OVREyeRenderDesc}.</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units.</li>
 * </ul>
 * In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
 * {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
 * units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
 */
public final class OVRViewScaleDesc implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HMDTOEYEVIEWOFFSET,
		HMDSPACETOWORLDSCALEINMETERS;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		HMDTOEYEVIEWOFFSET = offsets.get(0);
		HMDSPACETOWORLDSCALEINMETERS = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRViewScaleDesc() {
		this(malloc());
	}

	public OVRViewScaleDesc(ByteBuffer struct) {
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

	public OVRViewScaleDesc setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetSet(struct, HmdToEyeViewOffset); return this; }
	public OVRViewScaleDesc setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset, int index) { HmdToEyeViewOffsetSet(struct, HmdToEyeViewOffset, index); return this; }
	public OVRViewScaleDesc setHmdSpaceToWorldScaleInMeters(float HmdSpaceToWorldScaleInMeters) { HmdSpaceToWorldScaleInMeters(struct, HmdSpaceToWorldScaleInMeters); return this; }

	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetGet(struct, HmdToEyeViewOffset); }
	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset, int index) { HmdToEyeViewOffsetGet(struct, HmdToEyeViewOffset, index); }
	public float getHmdSpaceToWorldScaleInMeters() { return HmdSpaceToWorldScaleInMeters(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer HmdToEyeViewOffset,
		float HmdSpaceToWorldScaleInMeters
	) {
		ByteBuffer ovrviewscaledesc = malloc();

		HmdToEyeViewOffsetSet(ovrviewscaledesc, HmdToEyeViewOffset);
		HmdSpaceToWorldScaleInMeters(ovrviewscaledesc, HmdSpaceToWorldScaleInMeters);

		return ovrviewscaledesc;
	}

	public static void HmdToEyeViewOffsetSet(ByteBuffer ovrviewscaledesc, ByteBuffer HmdToEyeViewOffset) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(memAddress(HmdToEyeViewOffset), memAddress(ovrviewscaledesc) + HMDTOEYEVIEWOFFSET, HmdToEyeViewOffset.remaining());
	}
	public static void HmdToEyeViewOffsetSet(ByteBuffer ovrviewscaledesc, ByteBuffer HmdToEyeViewOffset, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HmdToEyeViewOffset, OVRVector3f.SIZEOF);
		memCopy(memAddress(HmdToEyeViewOffset), memAddress(ovrviewscaledesc) + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, HmdToEyeViewOffset.remaining());
	}
	public static void HmdSpaceToWorldScaleInMeters(ByteBuffer ovrviewscaledesc, float HmdSpaceToWorldScaleInMeters) { ovrviewscaledesc.putFloat(ovrviewscaledesc.position() + HMDSPACETOWORLDSCALEINMETERS, HmdSpaceToWorldScaleInMeters); }

	public static void HmdToEyeViewOffsetGet(ByteBuffer ovrviewscaledesc, ByteBuffer HmdToEyeViewOffset) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(memAddress(ovrviewscaledesc) + HMDTOEYEVIEWOFFSET, memAddress(HmdToEyeViewOffset), HmdToEyeViewOffset.remaining());
	}
	public static void HmdToEyeViewOffsetGet(ByteBuffer ovrviewscaledesc, ByteBuffer HmdToEyeViewOffset, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HmdToEyeViewOffset, OVRVector3f.SIZEOF);
		memCopy(memAddress(ovrviewscaledesc) + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, memAddress(HmdToEyeViewOffset), HmdToEyeViewOffset.remaining());
	}
	public static float HmdSpaceToWorldScaleInMeters(ByteBuffer ovrviewscaledesc) { return ovrviewscaledesc.getFloat(ovrviewscaledesc.position() + HMDSPACETOWORLDSCALEINMETERS); }

}