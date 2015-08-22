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

/** Position and orientation together. */
public final class OVRPosef implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ORIENTATION,
		POSITION;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		ORIENTATION = offsets.get(0);
		POSITION = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRPosef() {
		this(malloc());
	}

	public OVRPosef(ByteBuffer struct) {
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

	public OVRPosef setOrientation(ByteBuffer Orientation) { OrientationSet(struct, Orientation); return this; }
	public OVRPosef setOrientationX(float x) { OrientationX(struct, x); return this; }
	public OVRPosef setOrientationY(float y) { OrientationY(struct, y); return this; }
	public OVRPosef setOrientationZ(float z) { OrientationZ(struct, z); return this; }
	public OVRPosef setOrientationW(float w) { OrientationW(struct, w); return this; }
	public OVRPosef setPosition(ByteBuffer Position) { PositionSet(struct, Position); return this; }
	public OVRPosef setPositionX(float x) { PositionX(struct, x); return this; }
	public OVRPosef setPositionY(float y) { PositionY(struct, y); return this; }
	public OVRPosef setPositionZ(float z) { PositionZ(struct, z); return this; }

	public void getOrientation(ByteBuffer Orientation) { OrientationGet(struct, Orientation); }
	public float getOrientationX() { return OrientationX(struct); }
	public float getOrientationY() { return OrientationY(struct); }
	public float getOrientationZ() { return OrientationZ(struct); }
	public float getOrientationW() { return OrientationW(struct); }
	public void getPosition(ByteBuffer Position) { PositionGet(struct, Position); }
	public float getPositionX() { return PositionX(struct); }
	public float getPositionY() { return PositionY(struct); }
	public float getPositionZ() { return PositionZ(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Orientation,
		ByteBuffer Position
	) {
		ByteBuffer ovrposef = malloc();

		OrientationSet(ovrposef, Orientation);
		PositionSet(ovrposef, Position);

		return ovrposef;
	}

	public static void OrientationSet(ByteBuffer ovrposef, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrposef) + ORIENTATION, OVRQuatf.SIZEOF); }
	public static void OrientationX(ByteBuffer ovrposef, float x) { ovrposef.putFloat(ovrposef.position() + ORIENTATION + OVRQuatf.X, x); }
	public static void OrientationY(ByteBuffer ovrposef, float y) { ovrposef.putFloat(ovrposef.position() + ORIENTATION + OVRQuatf.Y, y); }
	public static void OrientationZ(ByteBuffer ovrposef, float z) { ovrposef.putFloat(ovrposef.position() + ORIENTATION + OVRQuatf.Z, z); }
	public static void OrientationW(ByteBuffer ovrposef, float w) { ovrposef.putFloat(ovrposef.position() + ORIENTATION + OVRQuatf.W, w); }
	public static void PositionSet(ByteBuffer ovrposef, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrposef) + POSITION, OVRVector3f.SIZEOF); }
	public static void PositionX(ByteBuffer ovrposef, float x) { ovrposef.putFloat(ovrposef.position() + POSITION + OVRVector3f.X, x); }
	public static void PositionY(ByteBuffer ovrposef, float y) { ovrposef.putFloat(ovrposef.position() + POSITION + OVRVector3f.Y, y); }
	public static void PositionZ(ByteBuffer ovrposef, float z) { ovrposef.putFloat(ovrposef.position() + POSITION + OVRVector3f.Z, z); }

	public static void OrientationGet(ByteBuffer ovrposef, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrposef) + ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float OrientationX(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + ORIENTATION + OVRQuatf.X); }
	public static float OrientationY(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + ORIENTATION + OVRQuatf.Y); }
	public static float OrientationZ(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + ORIENTATION + OVRQuatf.Z); }
	public static float OrientationW(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + ORIENTATION + OVRQuatf.W); }
	public static void PositionGet(ByteBuffer ovrposef, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposef) + POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float PositionX(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + POSITION + OVRVector3f.X); }
	public static float PositionY(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + POSITION + OVRVector3f.Y); }
	public static float PositionZ(ByteBuffer ovrposef) { return ovrposef.getFloat(ovrposef.position() + POSITION + OVRVector3f.Z); }

}