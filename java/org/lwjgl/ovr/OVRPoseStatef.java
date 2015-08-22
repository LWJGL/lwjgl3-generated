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

/** A full pose (rigid body) configuration with first and second derivatives. */
public final class OVRPoseStatef implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		THEPOSE,
		ANGULARVELOCITY,
		LINEARVELOCITY,
		ANGULARACCELERATION,
		LINEARACCELERATION,
		TIMEINSECONDS;

	static {
		IntBuffer offsets = memAllocInt(6);

		SIZEOF = offsets(memAddress(offsets));

		THEPOSE = offsets.get(0);
		ANGULARVELOCITY = offsets.get(1);
		LINEARVELOCITY = offsets.get(2);
		ANGULARACCELERATION = offsets.get(3);
		LINEARACCELERATION = offsets.get(4);
		TIMEINSECONDS = offsets.get(5);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRPoseStatef() {
		this(malloc());
	}

	public OVRPoseStatef(ByteBuffer struct) {
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

	public OVRPoseStatef setThePose(ByteBuffer ThePose) { ThePoseSet(struct, ThePose); return this; }
	public OVRPoseStatef setThePoseOrientation(ByteBuffer Orientation) { ThePoseOrientationSet(struct, Orientation); return this; }
	public OVRPoseStatef setThePoseOrientationX(float x) { ThePoseOrientationX(struct, x); return this; }
	public OVRPoseStatef setThePoseOrientationY(float y) { ThePoseOrientationY(struct, y); return this; }
	public OVRPoseStatef setThePoseOrientationZ(float z) { ThePoseOrientationZ(struct, z); return this; }
	public OVRPoseStatef setThePoseOrientationW(float w) { ThePoseOrientationW(struct, w); return this; }
	public OVRPoseStatef setThePosePosition(ByteBuffer Position) { ThePosePositionSet(struct, Position); return this; }
	public OVRPoseStatef setThePosePositionX(float x) { ThePosePositionX(struct, x); return this; }
	public OVRPoseStatef setThePosePositionY(float y) { ThePosePositionY(struct, y); return this; }
	public OVRPoseStatef setThePosePositionZ(float z) { ThePosePositionZ(struct, z); return this; }
	public OVRPoseStatef setAngularVelocity(ByteBuffer AngularVelocity) { AngularVelocitySet(struct, AngularVelocity); return this; }
	public OVRPoseStatef setAngularVelocityX(float x) { AngularVelocityX(struct, x); return this; }
	public OVRPoseStatef setAngularVelocityY(float y) { AngularVelocityY(struct, y); return this; }
	public OVRPoseStatef setAngularVelocityZ(float z) { AngularVelocityZ(struct, z); return this; }
	public OVRPoseStatef setLinearVelocity(ByteBuffer LinearVelocity) { LinearVelocitySet(struct, LinearVelocity); return this; }
	public OVRPoseStatef setLinearVelocityX(float x) { LinearVelocityX(struct, x); return this; }
	public OVRPoseStatef setLinearVelocityY(float y) { LinearVelocityY(struct, y); return this; }
	public OVRPoseStatef setLinearVelocityZ(float z) { LinearVelocityZ(struct, z); return this; }
	public OVRPoseStatef setAngularAcceleration(ByteBuffer AngularAcceleration) { AngularAccelerationSet(struct, AngularAcceleration); return this; }
	public OVRPoseStatef setAngularAccelerationX(float x) { AngularAccelerationX(struct, x); return this; }
	public OVRPoseStatef setAngularAccelerationY(float y) { AngularAccelerationY(struct, y); return this; }
	public OVRPoseStatef setAngularAccelerationZ(float z) { AngularAccelerationZ(struct, z); return this; }
	public OVRPoseStatef setLinearAcceleration(ByteBuffer LinearAcceleration) { LinearAccelerationSet(struct, LinearAcceleration); return this; }
	public OVRPoseStatef setLinearAccelerationX(float x) { LinearAccelerationX(struct, x); return this; }
	public OVRPoseStatef setLinearAccelerationY(float y) { LinearAccelerationY(struct, y); return this; }
	public OVRPoseStatef setLinearAccelerationZ(float z) { LinearAccelerationZ(struct, z); return this; }
	public OVRPoseStatef setTimeInSeconds(double TimeInSeconds) { TimeInSeconds(struct, TimeInSeconds); return this; }

	public void getThePose(ByteBuffer ThePose) { ThePoseGet(struct, ThePose); }
	public void getThePoseOrientation(ByteBuffer Orientation) { ThePoseOrientationGet(struct, Orientation); }
	public float getThePoseOrientationX() { return ThePoseOrientationX(struct); }
	public float getThePoseOrientationY() { return ThePoseOrientationY(struct); }
	public float getThePoseOrientationZ() { return ThePoseOrientationZ(struct); }
	public float getThePoseOrientationW() { return ThePoseOrientationW(struct); }
	public void getThePosePosition(ByteBuffer Position) { ThePosePositionGet(struct, Position); }
	public float getThePosePositionX() { return ThePosePositionX(struct); }
	public float getThePosePositionY() { return ThePosePositionY(struct); }
	public float getThePosePositionZ() { return ThePosePositionZ(struct); }
	public void getAngularVelocity(ByteBuffer AngularVelocity) { AngularVelocityGet(struct, AngularVelocity); }
	public float getAngularVelocityX() { return AngularVelocityX(struct); }
	public float getAngularVelocityY() { return AngularVelocityY(struct); }
	public float getAngularVelocityZ() { return AngularVelocityZ(struct); }
	public void getLinearVelocity(ByteBuffer LinearVelocity) { LinearVelocityGet(struct, LinearVelocity); }
	public float getLinearVelocityX() { return LinearVelocityX(struct); }
	public float getLinearVelocityY() { return LinearVelocityY(struct); }
	public float getLinearVelocityZ() { return LinearVelocityZ(struct); }
	public void getAngularAcceleration(ByteBuffer AngularAcceleration) { AngularAccelerationGet(struct, AngularAcceleration); }
	public float getAngularAccelerationX() { return AngularAccelerationX(struct); }
	public float getAngularAccelerationY() { return AngularAccelerationY(struct); }
	public float getAngularAccelerationZ() { return AngularAccelerationZ(struct); }
	public void getLinearAcceleration(ByteBuffer LinearAcceleration) { LinearAccelerationGet(struct, LinearAcceleration); }
	public float getLinearAccelerationX() { return LinearAccelerationX(struct); }
	public float getLinearAccelerationY() { return LinearAccelerationY(struct); }
	public float getLinearAccelerationZ() { return LinearAccelerationZ(struct); }
	public double getTimeInSeconds() { return TimeInSeconds(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer ThePose,
		ByteBuffer AngularVelocity,
		ByteBuffer LinearVelocity,
		ByteBuffer AngularAcceleration,
		ByteBuffer LinearAcceleration,
		double TimeInSeconds
	) {
		ByteBuffer ovrposestatef = malloc();

		ThePoseSet(ovrposestatef, ThePose);
		AngularVelocitySet(ovrposestatef, AngularVelocity);
		LinearVelocitySet(ovrposestatef, LinearVelocity);
		AngularAccelerationSet(ovrposestatef, AngularAcceleration);
		LinearAccelerationSet(ovrposestatef, LinearAcceleration);
		TimeInSeconds(ovrposestatef, TimeInSeconds);

		return ovrposestatef;
	}

	public static void ThePoseSet(ByteBuffer ovrposestatef, ByteBuffer ThePose) { if ( ThePose != null ) memCopy(memAddress(ThePose), memAddress(ovrposestatef) + THEPOSE, OVRPosef.SIZEOF); }
	public static void ThePoseOrientationSet(ByteBuffer ovrposestatef, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrposestatef) + THEPOSE + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void ThePoseOrientationX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void ThePoseOrientationY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void ThePoseOrientationZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void ThePoseOrientationW(ByteBuffer ovrposestatef, float w) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void ThePosePositionSet(ByteBuffer ovrposestatef, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrposestatef) + THEPOSE + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void ThePosePositionX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void ThePosePositionY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void ThePosePositionZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void AngularVelocitySet(ByteBuffer ovrposestatef, ByteBuffer AngularVelocity) { if ( AngularVelocity != null ) memCopy(memAddress(AngularVelocity), memAddress(ovrposestatef) + ANGULARVELOCITY, OVRVector3f.SIZEOF); }
	public static void AngularVelocityX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.X, x); }
	public static void AngularVelocityY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.Y, y); }
	public static void AngularVelocityZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.Z, z); }
	public static void LinearVelocitySet(ByteBuffer ovrposestatef, ByteBuffer LinearVelocity) { if ( LinearVelocity != null ) memCopy(memAddress(LinearVelocity), memAddress(ovrposestatef) + LINEARVELOCITY, OVRVector3f.SIZEOF); }
	public static void LinearVelocityX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.X, x); }
	public static void LinearVelocityY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.Y, y); }
	public static void LinearVelocityZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.Z, z); }
	public static void AngularAccelerationSet(ByteBuffer ovrposestatef, ByteBuffer AngularAcceleration) { if ( AngularAcceleration != null ) memCopy(memAddress(AngularAcceleration), memAddress(ovrposestatef) + ANGULARACCELERATION, OVRVector3f.SIZEOF); }
	public static void AngularAccelerationX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.X, x); }
	public static void AngularAccelerationY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.Y, y); }
	public static void AngularAccelerationZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.Z, z); }
	public static void LinearAccelerationSet(ByteBuffer ovrposestatef, ByteBuffer LinearAcceleration) { if ( LinearAcceleration != null ) memCopy(memAddress(LinearAcceleration), memAddress(ovrposestatef) + LINEARACCELERATION, OVRVector3f.SIZEOF); }
	public static void LinearAccelerationX(ByteBuffer ovrposestatef, float x) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.X, x); }
	public static void LinearAccelerationY(ByteBuffer ovrposestatef, float y) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.Y, y); }
	public static void LinearAccelerationZ(ByteBuffer ovrposestatef, float z) { ovrposestatef.putFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.Z, z); }
	public static void TimeInSeconds(ByteBuffer ovrposestatef, double TimeInSeconds) { ovrposestatef.putDouble(ovrposestatef.position() + TIMEINSECONDS, TimeInSeconds); }

	public static void ThePoseGet(ByteBuffer ovrposestatef, ByteBuffer ThePose) { if ( LWJGLUtil.CHECKS ) checkBuffer(ThePose, OVRPosef.SIZEOF); memCopy(memAddress(ovrposestatef) + THEPOSE, memAddress(ThePose), OVRPosef.SIZEOF); }
	public static void ThePoseOrientationGet(ByteBuffer ovrposestatef, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrposestatef) + THEPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float ThePoseOrientationX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float ThePoseOrientationY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float ThePoseOrientationZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float ThePoseOrientationW(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void ThePosePositionGet(ByteBuffer ovrposestatef, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposestatef) + THEPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float ThePosePositionX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float ThePosePositionY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float ThePosePositionZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + THEPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void AngularVelocityGet(ByteBuffer ovrposestatef, ByteBuffer AngularVelocity) { if ( LWJGLUtil.CHECKS ) checkBuffer(AngularVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposestatef) + ANGULARVELOCITY, memAddress(AngularVelocity), OVRVector3f.SIZEOF); }
	public static float AngularVelocityX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.X); }
	public static float AngularVelocityY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.Y); }
	public static float AngularVelocityZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARVELOCITY + OVRVector3f.Z); }
	public static void LinearVelocityGet(ByteBuffer ovrposestatef, ByteBuffer LinearVelocity) { if ( LWJGLUtil.CHECKS ) checkBuffer(LinearVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposestatef) + LINEARVELOCITY, memAddress(LinearVelocity), OVRVector3f.SIZEOF); }
	public static float LinearVelocityX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.X); }
	public static float LinearVelocityY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.Y); }
	public static float LinearVelocityZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARVELOCITY + OVRVector3f.Z); }
	public static void AngularAccelerationGet(ByteBuffer ovrposestatef, ByteBuffer AngularAcceleration) { if ( LWJGLUtil.CHECKS ) checkBuffer(AngularAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposestatef) + ANGULARACCELERATION, memAddress(AngularAcceleration), OVRVector3f.SIZEOF); }
	public static float AngularAccelerationX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.X); }
	public static float AngularAccelerationY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.Y); }
	public static float AngularAccelerationZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + ANGULARACCELERATION + OVRVector3f.Z); }
	public static void LinearAccelerationGet(ByteBuffer ovrposestatef, ByteBuffer LinearAcceleration) { if ( LWJGLUtil.CHECKS ) checkBuffer(LinearAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrposestatef) + LINEARACCELERATION, memAddress(LinearAcceleration), OVRVector3f.SIZEOF); }
	public static float LinearAccelerationX(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.X); }
	public static float LinearAccelerationY(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.Y); }
	public static float LinearAccelerationZ(ByteBuffer ovrposestatef) { return ovrposestatef.getFloat(ovrposestatef.position() + LINEARACCELERATION + OVRVector3f.Z); }
	public static double TimeInSeconds(ByteBuffer ovrposestatef) { return ovrposestatef.getDouble(ovrposestatef.position() + TIMEINSECONDS); }

}