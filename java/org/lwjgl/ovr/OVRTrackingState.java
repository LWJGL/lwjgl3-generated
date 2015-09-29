/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by {@link OVR#ovrHmd_GetTrackingState}. */
public final class OVRTrackingState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADPOSE,
		CAMERAPOSE,
		LEVELEDCAMERAPOSE,
		HANDPOSES,
		RAWSENSORDATA,
		STATUSFLAGS,
		LASTCAMERAFRAMECOUNTER;

	static {
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		HEADPOSE = offsets.get(0);
		CAMERAPOSE = offsets.get(1);
		LEVELEDCAMERAPOSE = offsets.get(2);
		HANDPOSES = offsets.get(3);
		RAWSENSORDATA = offsets.get(4);
		STATUSFLAGS = offsets.get(5);
		LASTCAMERAFRAMECOUNTER = offsets.get(6);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRTrackingState(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRTrackingState} instance at the specified memory address. */
	public OVRTrackingState(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRTrackingState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTrackingState(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRPoseStatef getHeadPose() { return ngetHeadPose(address()); }
	public OVRPosef getHeadPoseThePose() { return ngetHeadPoseThePose(address()); }
	public OVRQuatf getHeadPoseThePoseOrientation() { return ngetHeadPoseThePoseOrientation(address()); }
	public float getHeadPoseThePoseOrientationX() { return ngetHeadPoseThePoseOrientationX(address()); }
	public float getHeadPoseThePoseOrientationY() { return ngetHeadPoseThePoseOrientationY(address()); }
	public float getHeadPoseThePoseOrientationZ() { return ngetHeadPoseThePoseOrientationZ(address()); }
	public float getHeadPoseThePoseOrientationW() { return ngetHeadPoseThePoseOrientationW(address()); }
	public OVRVector3f getHeadPoseThePosePosition() { return ngetHeadPoseThePosePosition(address()); }
	public float getHeadPoseThePosePositionX() { return ngetHeadPoseThePosePositionX(address()); }
	public float getHeadPoseThePosePositionY() { return ngetHeadPoseThePosePositionY(address()); }
	public float getHeadPoseThePosePositionZ() { return ngetHeadPoseThePosePositionZ(address()); }
	public OVRVector3f getHeadPoseAngularVelocity() { return ngetHeadPoseAngularVelocity(address()); }
	public float getHeadPoseAngularVelocityX() { return ngetHeadPoseAngularVelocityX(address()); }
	public float getHeadPoseAngularVelocityY() { return ngetHeadPoseAngularVelocityY(address()); }
	public float getHeadPoseAngularVelocityZ() { return ngetHeadPoseAngularVelocityZ(address()); }
	public OVRVector3f getHeadPoseLinearVelocity() { return ngetHeadPoseLinearVelocity(address()); }
	public float getHeadPoseLinearVelocityX() { return ngetHeadPoseLinearVelocityX(address()); }
	public float getHeadPoseLinearVelocityY() { return ngetHeadPoseLinearVelocityY(address()); }
	public float getHeadPoseLinearVelocityZ() { return ngetHeadPoseLinearVelocityZ(address()); }
	public OVRVector3f getHeadPoseAngularAcceleration() { return ngetHeadPoseAngularAcceleration(address()); }
	public float getHeadPoseAngularAccelerationX() { return ngetHeadPoseAngularAccelerationX(address()); }
	public float getHeadPoseAngularAccelerationY() { return ngetHeadPoseAngularAccelerationY(address()); }
	public float getHeadPoseAngularAccelerationZ() { return ngetHeadPoseAngularAccelerationZ(address()); }
	public OVRVector3f getHeadPoseLinearAcceleration() { return ngetHeadPoseLinearAcceleration(address()); }
	public float getHeadPoseLinearAccelerationX() { return ngetHeadPoseLinearAccelerationX(address()); }
	public float getHeadPoseLinearAccelerationY() { return ngetHeadPoseLinearAccelerationY(address()); }
	public float getHeadPoseLinearAccelerationZ() { return ngetHeadPoseLinearAccelerationZ(address()); }
	public double getHeadPoseTimeInSeconds() { return ngetHeadPoseTimeInSeconds(address()); }
	public OVRPosef getCameraPose() { return ngetCameraPose(address()); }
	public OVRQuatf getCameraPoseOrientation() { return ngetCameraPoseOrientation(address()); }
	public float getCameraPoseOrientationX() { return ngetCameraPoseOrientationX(address()); }
	public float getCameraPoseOrientationY() { return ngetCameraPoseOrientationY(address()); }
	public float getCameraPoseOrientationZ() { return ngetCameraPoseOrientationZ(address()); }
	public float getCameraPoseOrientationW() { return ngetCameraPoseOrientationW(address()); }
	public OVRVector3f getCameraPosePosition() { return ngetCameraPosePosition(address()); }
	public float getCameraPosePositionX() { return ngetCameraPosePositionX(address()); }
	public float getCameraPosePositionY() { return ngetCameraPosePositionY(address()); }
	public float getCameraPosePositionZ() { return ngetCameraPosePositionZ(address()); }
	public OVRPosef getLeveledCameraPose() { return ngetLeveledCameraPose(address()); }
	public OVRQuatf getLeveledCameraPoseOrientation() { return ngetLeveledCameraPoseOrientation(address()); }
	public float getLeveledCameraPoseOrientationX() { return ngetLeveledCameraPoseOrientationX(address()); }
	public float getLeveledCameraPoseOrientationY() { return ngetLeveledCameraPoseOrientationY(address()); }
	public float getLeveledCameraPoseOrientationZ() { return ngetLeveledCameraPoseOrientationZ(address()); }
	public float getLeveledCameraPoseOrientationW() { return ngetLeveledCameraPoseOrientationW(address()); }
	public OVRVector3f getLeveledCameraPosePosition() { return ngetLeveledCameraPosePosition(address()); }
	public float getLeveledCameraPosePositionX() { return ngetLeveledCameraPosePositionX(address()); }
	public float getLeveledCameraPosePositionY() { return ngetLeveledCameraPosePositionY(address()); }
	public float getLeveledCameraPosePositionZ() { return ngetLeveledCameraPosePositionZ(address()); }
	public void getHandPoses(ByteBuffer HandPoses) { ngetHandPoses(address(), HandPoses); }
	public OVRPoseStatef getHandPoses(int index) { return ngetHandPoses(address(), index); }
	public OVRSensorData getRawSensorData() { return ngetRawSensorData(address()); }
	public OVRVector3f getRawSensorDataAccelerometer() { return ngetRawSensorDataAccelerometer(address()); }
	public float getRawSensorDataAccelerometerX() { return ngetRawSensorDataAccelerometerX(address()); }
	public float getRawSensorDataAccelerometerY() { return ngetRawSensorDataAccelerometerY(address()); }
	public float getRawSensorDataAccelerometerZ() { return ngetRawSensorDataAccelerometerZ(address()); }
	public OVRVector3f getRawSensorDataGyro() { return ngetRawSensorDataGyro(address()); }
	public float getRawSensorDataGyroX() { return ngetRawSensorDataGyroX(address()); }
	public float getRawSensorDataGyroY() { return ngetRawSensorDataGyroY(address()); }
	public float getRawSensorDataGyroZ() { return ngetRawSensorDataGyroZ(address()); }
	public OVRVector3f getRawSensorDataMagnetometer() { return ngetRawSensorDataMagnetometer(address()); }
	public float getRawSensorDataMagnetometerX() { return ngetRawSensorDataMagnetometerX(address()); }
	public float getRawSensorDataMagnetometerY() { return ngetRawSensorDataMagnetometerY(address()); }
	public float getRawSensorDataMagnetometerZ() { return ngetRawSensorDataMagnetometerZ(address()); }
	public float getRawSensorDataTemperature() { return ngetRawSensorDataTemperature(address()); }
	public float getRawSensorDataTimeInSeconds() { return ngetRawSensorDataTimeInSeconds(address()); }
	public int getStatusFlags() { return ngetStatusFlags(address()); }
	public int getLastCameraFrameCounter() { return ngetLastCameraFrameCounter(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRTrackingState malloc() {
		return new OVRTrackingState(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRTrackingState calloc() {
		return new OVRTrackingState(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link BufferUtils}. */
	public static OVRTrackingState create() {
		return new OVRTrackingState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRPoseStatef ngetHeadPose(long struct) { return new OVRPoseStatef(struct + HEADPOSE); }
	/** Returns a copy of the {@code HeadPose} {@link OVRPoseStatef} struct. */
	public static OVRPoseStatef getHeadPose(ByteBuffer struct) { return ngetHeadPose(memAddress(struct)); }
	public static OVRPosef ngetHeadPoseThePose(long struct) { return OVRPosef.malloc().nset(struct + HEADPOSE + OVRPoseStatef.THEPOSE); }
	/** Returns a copy of the {@code ThePose} {@link OVRPosef} struct. */
	public static OVRPosef getHeadPoseThePose(ByteBuffer struct) { return ngetHeadPoseThePose(memAddress(struct)); }
	public static OVRQuatf ngetHeadPoseThePoseOrientation(long struct) { return OVRQuatf.malloc().nset(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getHeadPoseThePoseOrientation(ByteBuffer struct) { return ngetHeadPoseThePoseOrientation(memAddress(struct)); }
	public static float ngetHeadPoseThePoseOrientationX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getHeadPoseThePoseOrientationX(ByteBuffer struct) { return ngetHeadPoseThePoseOrientationX(memAddress(struct)); }
	public static float ngetHeadPoseThePoseOrientationY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getHeadPoseThePoseOrientationY(ByteBuffer struct) { return ngetHeadPoseThePoseOrientationY(memAddress(struct)); }
	public static float ngetHeadPoseThePoseOrientationZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getHeadPoseThePoseOrientationZ(ByteBuffer struct) { return ngetHeadPoseThePoseOrientationZ(memAddress(struct)); }
	public static float ngetHeadPoseThePoseOrientationW(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getHeadPoseThePoseOrientationW(ByteBuffer struct) { return ngetHeadPoseThePoseOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetHeadPoseThePosePosition(long struct) { return OVRVector3f.malloc().nset(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getHeadPoseThePosePosition(ByteBuffer struct) { return ngetHeadPoseThePosePosition(memAddress(struct)); }
	public static float ngetHeadPoseThePosePositionX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getHeadPoseThePosePositionX(ByteBuffer struct) { return ngetHeadPoseThePosePositionX(memAddress(struct)); }
	public static float ngetHeadPoseThePosePositionY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getHeadPoseThePosePositionY(ByteBuffer struct) { return ngetHeadPoseThePosePositionY(memAddress(struct)); }
	public static float ngetHeadPoseThePosePositionZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getHeadPoseThePosePositionZ(ByteBuffer struct) { return ngetHeadPoseThePosePositionZ(memAddress(struct)); }
	public static OVRVector3f ngetHeadPoseAngularVelocity(long struct) { return OVRVector3f.malloc().nset(struct + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY); }
	/** Returns a copy of the {@code AngularVelocity} {@link OVRVector3f} struct. */
	public static OVRVector3f getHeadPoseAngularVelocity(ByteBuffer struct) { return ngetHeadPoseAngularVelocity(memAddress(struct)); }
	public static float ngetHeadPoseAngularVelocityX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.X); }
	public static float getHeadPoseAngularVelocityX(ByteBuffer struct) { return ngetHeadPoseAngularVelocityX(memAddress(struct)); }
	public static float ngetHeadPoseAngularVelocityY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Y); }
	public static float getHeadPoseAngularVelocityY(ByteBuffer struct) { return ngetHeadPoseAngularVelocityY(memAddress(struct)); }
	public static float ngetHeadPoseAngularVelocityZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Z); }
	public static float getHeadPoseAngularVelocityZ(ByteBuffer struct) { return ngetHeadPoseAngularVelocityZ(memAddress(struct)); }
	public static OVRVector3f ngetHeadPoseLinearVelocity(long struct) { return OVRVector3f.malloc().nset(struct + HEADPOSE + OVRPoseStatef.LINEARVELOCITY); }
	/** Returns a copy of the {@code LinearVelocity} {@link OVRVector3f} struct. */
	public static OVRVector3f getHeadPoseLinearVelocity(ByteBuffer struct) { return ngetHeadPoseLinearVelocity(memAddress(struct)); }
	public static float ngetHeadPoseLinearVelocityX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.X); }
	public static float getHeadPoseLinearVelocityX(ByteBuffer struct) { return ngetHeadPoseLinearVelocityX(memAddress(struct)); }
	public static float ngetHeadPoseLinearVelocityY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Y); }
	public static float getHeadPoseLinearVelocityY(ByteBuffer struct) { return ngetHeadPoseLinearVelocityY(memAddress(struct)); }
	public static float ngetHeadPoseLinearVelocityZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Z); }
	public static float getHeadPoseLinearVelocityZ(ByteBuffer struct) { return ngetHeadPoseLinearVelocityZ(memAddress(struct)); }
	public static OVRVector3f ngetHeadPoseAngularAcceleration(long struct) { return OVRVector3f.malloc().nset(struct + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION); }
	/** Returns a copy of the {@code AngularAcceleration} {@link OVRVector3f} struct. */
	public static OVRVector3f getHeadPoseAngularAcceleration(ByteBuffer struct) { return ngetHeadPoseAngularAcceleration(memAddress(struct)); }
	public static float ngetHeadPoseAngularAccelerationX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.X); }
	public static float getHeadPoseAngularAccelerationX(ByteBuffer struct) { return ngetHeadPoseAngularAccelerationX(memAddress(struct)); }
	public static float ngetHeadPoseAngularAccelerationY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Y); }
	public static float getHeadPoseAngularAccelerationY(ByteBuffer struct) { return ngetHeadPoseAngularAccelerationY(memAddress(struct)); }
	public static float ngetHeadPoseAngularAccelerationZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Z); }
	public static float getHeadPoseAngularAccelerationZ(ByteBuffer struct) { return ngetHeadPoseAngularAccelerationZ(memAddress(struct)); }
	public static OVRVector3f ngetHeadPoseLinearAcceleration(long struct) { return OVRVector3f.malloc().nset(struct + HEADPOSE + OVRPoseStatef.LINEARACCELERATION); }
	/** Returns a copy of the {@code LinearAcceleration} {@link OVRVector3f} struct. */
	public static OVRVector3f getHeadPoseLinearAcceleration(ByteBuffer struct) { return ngetHeadPoseLinearAcceleration(memAddress(struct)); }
	public static float ngetHeadPoseLinearAccelerationX(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.X); }
	public static float getHeadPoseLinearAccelerationX(ByteBuffer struct) { return ngetHeadPoseLinearAccelerationX(memAddress(struct)); }
	public static float ngetHeadPoseLinearAccelerationY(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Y); }
	public static float getHeadPoseLinearAccelerationY(ByteBuffer struct) { return ngetHeadPoseLinearAccelerationY(memAddress(struct)); }
	public static float ngetHeadPoseLinearAccelerationZ(long struct) { return memGetFloat(struct + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Z); }
	public static float getHeadPoseLinearAccelerationZ(ByteBuffer struct) { return ngetHeadPoseLinearAccelerationZ(memAddress(struct)); }
	public static double ngetHeadPoseTimeInSeconds(long struct) { return memGetDouble(struct + HEADPOSE + OVRPoseStatef.TIMEINSECONDS); }
	public static double getHeadPoseTimeInSeconds(ByteBuffer struct) { return ngetHeadPoseTimeInSeconds(memAddress(struct)); }
	public static OVRPosef ngetCameraPose(long struct) { return OVRPosef.malloc().nset(struct + CAMERAPOSE); }
	/** Returns a copy of the {@code CameraPose} {@link OVRPosef} struct. */
	public static OVRPosef getCameraPose(ByteBuffer struct) { return ngetCameraPose(memAddress(struct)); }
	public static OVRQuatf ngetCameraPoseOrientation(long struct) { return OVRQuatf.malloc().nset(struct + CAMERAPOSE + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getCameraPoseOrientation(ByteBuffer struct) { return ngetCameraPoseOrientation(memAddress(struct)); }
	public static float ngetCameraPoseOrientationX(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getCameraPoseOrientationX(ByteBuffer struct) { return ngetCameraPoseOrientationX(memAddress(struct)); }
	public static float ngetCameraPoseOrientationY(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getCameraPoseOrientationY(ByteBuffer struct) { return ngetCameraPoseOrientationY(memAddress(struct)); }
	public static float ngetCameraPoseOrientationZ(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getCameraPoseOrientationZ(ByteBuffer struct) { return ngetCameraPoseOrientationZ(memAddress(struct)); }
	public static float ngetCameraPoseOrientationW(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getCameraPoseOrientationW(ByteBuffer struct) { return ngetCameraPoseOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetCameraPosePosition(long struct) { return OVRVector3f.malloc().nset(struct + CAMERAPOSE + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getCameraPosePosition(ByteBuffer struct) { return ngetCameraPosePosition(memAddress(struct)); }
	public static float ngetCameraPosePositionX(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getCameraPosePositionX(ByteBuffer struct) { return ngetCameraPosePositionX(memAddress(struct)); }
	public static float ngetCameraPosePositionY(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getCameraPosePositionY(ByteBuffer struct) { return ngetCameraPosePositionY(memAddress(struct)); }
	public static float ngetCameraPosePositionZ(long struct) { return memGetFloat(struct + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getCameraPosePositionZ(ByteBuffer struct) { return ngetCameraPosePositionZ(memAddress(struct)); }
	public static OVRPosef ngetLeveledCameraPose(long struct) { return OVRPosef.malloc().nset(struct + LEVELEDCAMERAPOSE); }
	/** Returns a copy of the {@code LeveledCameraPose} {@link OVRPosef} struct. */
	public static OVRPosef getLeveledCameraPose(ByteBuffer struct) { return ngetLeveledCameraPose(memAddress(struct)); }
	public static OVRQuatf ngetLeveledCameraPoseOrientation(long struct) { return OVRQuatf.malloc().nset(struct + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getLeveledCameraPoseOrientation(ByteBuffer struct) { return ngetLeveledCameraPoseOrientation(memAddress(struct)); }
	public static float ngetLeveledCameraPoseOrientationX(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getLeveledCameraPoseOrientationX(ByteBuffer struct) { return ngetLeveledCameraPoseOrientationX(memAddress(struct)); }
	public static float ngetLeveledCameraPoseOrientationY(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getLeveledCameraPoseOrientationY(ByteBuffer struct) { return ngetLeveledCameraPoseOrientationY(memAddress(struct)); }
	public static float ngetLeveledCameraPoseOrientationZ(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getLeveledCameraPoseOrientationZ(ByteBuffer struct) { return ngetLeveledCameraPoseOrientationZ(memAddress(struct)); }
	public static float ngetLeveledCameraPoseOrientationW(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getLeveledCameraPoseOrientationW(ByteBuffer struct) { return ngetLeveledCameraPoseOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetLeveledCameraPosePosition(long struct) { return OVRVector3f.malloc().nset(struct + LEVELEDCAMERAPOSE + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getLeveledCameraPosePosition(ByteBuffer struct) { return ngetLeveledCameraPosePosition(memAddress(struct)); }
	public static float ngetLeveledCameraPosePositionX(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getLeveledCameraPosePositionX(ByteBuffer struct) { return ngetLeveledCameraPosePositionX(memAddress(struct)); }
	public static float ngetLeveledCameraPosePositionY(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getLeveledCameraPosePositionY(ByteBuffer struct) { return ngetLeveledCameraPosePositionY(memAddress(struct)); }
	public static float ngetLeveledCameraPosePositionZ(long struct) { return memGetFloat(struct + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getLeveledCameraPosePositionZ(ByteBuffer struct) { return ngetLeveledCameraPosePositionZ(memAddress(struct)); }
	public static void ngetHandPoses(long struct, ByteBuffer HandPoses) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandPoses, 2 * OVRPoseStatef.SIZEOF);
		memCopy(struct + HANDPOSES, memAddress(HandPoses), HandPoses.remaining());
	}
	public static void getHandPoses(ByteBuffer struct, ByteBuffer HandPoses) { ngetHandPoses(memAddress(struct), HandPoses); }
	public static OVRPoseStatef ngetHandPoses(long struct, int index) {
		return new OVRPoseStatef(struct + HANDPOSES + index * OVRPoseStatef.SIZEOF);
	}
	public static OVRPoseStatef getHandPoses(ByteBuffer struct, int index) { return ngetHandPoses(memAddress(struct), index); }
	public static OVRSensorData ngetRawSensorData(long struct) { return new OVRSensorData(struct + RAWSENSORDATA); }
	/** Returns a copy of the {@code RawSensorData} {@link OVRSensorData} struct. */
	public static OVRSensorData getRawSensorData(ByteBuffer struct) { return ngetRawSensorData(memAddress(struct)); }
	public static OVRVector3f ngetRawSensorDataAccelerometer(long struct) { return OVRVector3f.malloc().nset(struct + RAWSENSORDATA + OVRSensorData.ACCELEROMETER); }
	/** Returns a copy of the {@code Accelerometer} {@link OVRVector3f} struct. */
	public static OVRVector3f getRawSensorDataAccelerometer(ByteBuffer struct) { return ngetRawSensorDataAccelerometer(memAddress(struct)); }
	public static float ngetRawSensorDataAccelerometerX(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.X); }
	public static float getRawSensorDataAccelerometerX(ByteBuffer struct) { return ngetRawSensorDataAccelerometerX(memAddress(struct)); }
	public static float ngetRawSensorDataAccelerometerY(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Y); }
	public static float getRawSensorDataAccelerometerY(ByteBuffer struct) { return ngetRawSensorDataAccelerometerY(memAddress(struct)); }
	public static float ngetRawSensorDataAccelerometerZ(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Z); }
	public static float getRawSensorDataAccelerometerZ(ByteBuffer struct) { return ngetRawSensorDataAccelerometerZ(memAddress(struct)); }
	public static OVRVector3f ngetRawSensorDataGyro(long struct) { return OVRVector3f.malloc().nset(struct + RAWSENSORDATA + OVRSensorData.GYRO); }
	/** Returns a copy of the {@code Gyro} {@link OVRVector3f} struct. */
	public static OVRVector3f getRawSensorDataGyro(ByteBuffer struct) { return ngetRawSensorDataGyro(memAddress(struct)); }
	public static float ngetRawSensorDataGyroX(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.X); }
	public static float getRawSensorDataGyroX(ByteBuffer struct) { return ngetRawSensorDataGyroX(memAddress(struct)); }
	public static float ngetRawSensorDataGyroY(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Y); }
	public static float getRawSensorDataGyroY(ByteBuffer struct) { return ngetRawSensorDataGyroY(memAddress(struct)); }
	public static float ngetRawSensorDataGyroZ(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Z); }
	public static float getRawSensorDataGyroZ(ByteBuffer struct) { return ngetRawSensorDataGyroZ(memAddress(struct)); }
	public static OVRVector3f ngetRawSensorDataMagnetometer(long struct) { return OVRVector3f.malloc().nset(struct + RAWSENSORDATA + OVRSensorData.MAGNETOMETER); }
	/** Returns a copy of the {@code Magnetometer} {@link OVRVector3f} struct. */
	public static OVRVector3f getRawSensorDataMagnetometer(ByteBuffer struct) { return ngetRawSensorDataMagnetometer(memAddress(struct)); }
	public static float ngetRawSensorDataMagnetometerX(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.X); }
	public static float getRawSensorDataMagnetometerX(ByteBuffer struct) { return ngetRawSensorDataMagnetometerX(memAddress(struct)); }
	public static float ngetRawSensorDataMagnetometerY(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Y); }
	public static float getRawSensorDataMagnetometerY(ByteBuffer struct) { return ngetRawSensorDataMagnetometerY(memAddress(struct)); }
	public static float ngetRawSensorDataMagnetometerZ(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Z); }
	public static float getRawSensorDataMagnetometerZ(ByteBuffer struct) { return ngetRawSensorDataMagnetometerZ(memAddress(struct)); }
	public static float ngetRawSensorDataTemperature(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.TEMPERATURE); }
	public static float getRawSensorDataTemperature(ByteBuffer struct) { return ngetRawSensorDataTemperature(memAddress(struct)); }
	public static float ngetRawSensorDataTimeInSeconds(long struct) { return memGetFloat(struct + RAWSENSORDATA + OVRSensorData.TIMEINSECONDS); }
	public static float getRawSensorDataTimeInSeconds(ByteBuffer struct) { return ngetRawSensorDataTimeInSeconds(memAddress(struct)); }
	public static int ngetStatusFlags(long struct) { return memGetInt(struct + STATUSFLAGS); }
	public static int getStatusFlags(ByteBuffer struct) { return ngetStatusFlags(memAddress(struct)); }
	public static int ngetLastCameraFrameCounter(long struct) { return memGetInt(struct + LASTCAMERAFRAMECOUNTER); }
	public static int getLastCameraFrameCounter(ByteBuffer struct) { return ngetLastCameraFrameCounter(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link OVRTrackingState} structs. */
	public static final class Buffer extends StructBuffer<OVRTrackingState, Buffer> {

		/**
		 * Creates a new {@link OVRTrackingState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTrackingState#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRTrackingState newInstance(long address) {
			return new OVRTrackingState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}