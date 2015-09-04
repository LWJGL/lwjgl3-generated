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

/** Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by {@link OVR#ovrHmd_GetTrackingState}. */
public final class OVRTrackingState implements Pointer {

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

	private final ByteBuffer struct;

	public OVRTrackingState() {
		this(malloc());
	}

	public OVRTrackingState(ByteBuffer struct) {
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

	public OVRTrackingState setHeadPose(ByteBuffer HeadPose) { HeadPoseSet(struct, HeadPose); return this; }
	public OVRTrackingState setHeadPoseThePose(ByteBuffer ThePose) { HeadPoseThePoseSet(struct, ThePose); return this; }
	public OVRTrackingState setHeadPoseThePoseOrientation(ByteBuffer Orientation) { HeadPoseThePoseOrientationSet(struct, Orientation); return this; }
	public OVRTrackingState setHeadPoseThePoseOrientationX(float x) { HeadPoseThePoseOrientationX(struct, x); return this; }
	public OVRTrackingState setHeadPoseThePoseOrientationY(float y) { HeadPoseThePoseOrientationY(struct, y); return this; }
	public OVRTrackingState setHeadPoseThePoseOrientationZ(float z) { HeadPoseThePoseOrientationZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseThePoseOrientationW(float w) { HeadPoseThePoseOrientationW(struct, w); return this; }
	public OVRTrackingState setHeadPoseThePosePosition(ByteBuffer Position) { HeadPoseThePosePositionSet(struct, Position); return this; }
	public OVRTrackingState setHeadPoseThePosePositionX(float x) { HeadPoseThePosePositionX(struct, x); return this; }
	public OVRTrackingState setHeadPoseThePosePositionY(float y) { HeadPoseThePosePositionY(struct, y); return this; }
	public OVRTrackingState setHeadPoseThePosePositionZ(float z) { HeadPoseThePosePositionZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseAngularVelocity(ByteBuffer AngularVelocity) { HeadPoseAngularVelocitySet(struct, AngularVelocity); return this; }
	public OVRTrackingState setHeadPoseAngularVelocityX(float x) { HeadPoseAngularVelocityX(struct, x); return this; }
	public OVRTrackingState setHeadPoseAngularVelocityY(float y) { HeadPoseAngularVelocityY(struct, y); return this; }
	public OVRTrackingState setHeadPoseAngularVelocityZ(float z) { HeadPoseAngularVelocityZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseLinearVelocity(ByteBuffer LinearVelocity) { HeadPoseLinearVelocitySet(struct, LinearVelocity); return this; }
	public OVRTrackingState setHeadPoseLinearVelocityX(float x) { HeadPoseLinearVelocityX(struct, x); return this; }
	public OVRTrackingState setHeadPoseLinearVelocityY(float y) { HeadPoseLinearVelocityY(struct, y); return this; }
	public OVRTrackingState setHeadPoseLinearVelocityZ(float z) { HeadPoseLinearVelocityZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseAngularAcceleration(ByteBuffer AngularAcceleration) { HeadPoseAngularAccelerationSet(struct, AngularAcceleration); return this; }
	public OVRTrackingState setHeadPoseAngularAccelerationX(float x) { HeadPoseAngularAccelerationX(struct, x); return this; }
	public OVRTrackingState setHeadPoseAngularAccelerationY(float y) { HeadPoseAngularAccelerationY(struct, y); return this; }
	public OVRTrackingState setHeadPoseAngularAccelerationZ(float z) { HeadPoseAngularAccelerationZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseLinearAcceleration(ByteBuffer LinearAcceleration) { HeadPoseLinearAccelerationSet(struct, LinearAcceleration); return this; }
	public OVRTrackingState setHeadPoseLinearAccelerationX(float x) { HeadPoseLinearAccelerationX(struct, x); return this; }
	public OVRTrackingState setHeadPoseLinearAccelerationY(float y) { HeadPoseLinearAccelerationY(struct, y); return this; }
	public OVRTrackingState setHeadPoseLinearAccelerationZ(float z) { HeadPoseLinearAccelerationZ(struct, z); return this; }
	public OVRTrackingState setHeadPoseTimeInSeconds(double TimeInSeconds) { HeadPoseTimeInSeconds(struct, TimeInSeconds); return this; }
	public OVRTrackingState setCameraPose(ByteBuffer CameraPose) { CameraPoseSet(struct, CameraPose); return this; }
	public OVRTrackingState setCameraPoseOrientation(ByteBuffer Orientation) { CameraPoseOrientationSet(struct, Orientation); return this; }
	public OVRTrackingState setCameraPoseOrientationX(float x) { CameraPoseOrientationX(struct, x); return this; }
	public OVRTrackingState setCameraPoseOrientationY(float y) { CameraPoseOrientationY(struct, y); return this; }
	public OVRTrackingState setCameraPoseOrientationZ(float z) { CameraPoseOrientationZ(struct, z); return this; }
	public OVRTrackingState setCameraPoseOrientationW(float w) { CameraPoseOrientationW(struct, w); return this; }
	public OVRTrackingState setCameraPosePosition(ByteBuffer Position) { CameraPosePositionSet(struct, Position); return this; }
	public OVRTrackingState setCameraPosePositionX(float x) { CameraPosePositionX(struct, x); return this; }
	public OVRTrackingState setCameraPosePositionY(float y) { CameraPosePositionY(struct, y); return this; }
	public OVRTrackingState setCameraPosePositionZ(float z) { CameraPosePositionZ(struct, z); return this; }
	public OVRTrackingState setLeveledCameraPose(ByteBuffer LeveledCameraPose) { LeveledCameraPoseSet(struct, LeveledCameraPose); return this; }
	public OVRTrackingState setLeveledCameraPoseOrientation(ByteBuffer Orientation) { LeveledCameraPoseOrientationSet(struct, Orientation); return this; }
	public OVRTrackingState setLeveledCameraPoseOrientationX(float x) { LeveledCameraPoseOrientationX(struct, x); return this; }
	public OVRTrackingState setLeveledCameraPoseOrientationY(float y) { LeveledCameraPoseOrientationY(struct, y); return this; }
	public OVRTrackingState setLeveledCameraPoseOrientationZ(float z) { LeveledCameraPoseOrientationZ(struct, z); return this; }
	public OVRTrackingState setLeveledCameraPoseOrientationW(float w) { LeveledCameraPoseOrientationW(struct, w); return this; }
	public OVRTrackingState setLeveledCameraPosePosition(ByteBuffer Position) { LeveledCameraPosePositionSet(struct, Position); return this; }
	public OVRTrackingState setLeveledCameraPosePositionX(float x) { LeveledCameraPosePositionX(struct, x); return this; }
	public OVRTrackingState setLeveledCameraPosePositionY(float y) { LeveledCameraPosePositionY(struct, y); return this; }
	public OVRTrackingState setLeveledCameraPosePositionZ(float z) { LeveledCameraPosePositionZ(struct, z); return this; }
	public OVRTrackingState setHandPoses(ByteBuffer HandPoses) { HandPosesSet(struct, HandPoses); return this; }
	public OVRTrackingState setHandPoses(ByteBuffer HandPoses, int index) { HandPosesSet(struct, HandPoses, index); return this; }
	public OVRTrackingState setRawSensorData(ByteBuffer RawSensorData) { RawSensorDataSet(struct, RawSensorData); return this; }
	public OVRTrackingState setRawSensorDataAccelerometer(ByteBuffer Accelerometer) { RawSensorDataAccelerometerSet(struct, Accelerometer); return this; }
	public OVRTrackingState setRawSensorDataAccelerometerX(float x) { RawSensorDataAccelerometerX(struct, x); return this; }
	public OVRTrackingState setRawSensorDataAccelerometerY(float y) { RawSensorDataAccelerometerY(struct, y); return this; }
	public OVRTrackingState setRawSensorDataAccelerometerZ(float z) { RawSensorDataAccelerometerZ(struct, z); return this; }
	public OVRTrackingState setRawSensorDataGyro(ByteBuffer Gyro) { RawSensorDataGyroSet(struct, Gyro); return this; }
	public OVRTrackingState setRawSensorDataGyroX(float x) { RawSensorDataGyroX(struct, x); return this; }
	public OVRTrackingState setRawSensorDataGyroY(float y) { RawSensorDataGyroY(struct, y); return this; }
	public OVRTrackingState setRawSensorDataGyroZ(float z) { RawSensorDataGyroZ(struct, z); return this; }
	public OVRTrackingState setRawSensorDataMagnetometer(ByteBuffer Magnetometer) { RawSensorDataMagnetometerSet(struct, Magnetometer); return this; }
	public OVRTrackingState setRawSensorDataMagnetometerX(float x) { RawSensorDataMagnetometerX(struct, x); return this; }
	public OVRTrackingState setRawSensorDataMagnetometerY(float y) { RawSensorDataMagnetometerY(struct, y); return this; }
	public OVRTrackingState setRawSensorDataMagnetometerZ(float z) { RawSensorDataMagnetometerZ(struct, z); return this; }
	public OVRTrackingState setRawSensorDataTemperature(float Temperature) { RawSensorDataTemperature(struct, Temperature); return this; }
	public OVRTrackingState setRawSensorDataTimeInSeconds(float TimeInSeconds) { RawSensorDataTimeInSeconds(struct, TimeInSeconds); return this; }
	public OVRTrackingState setStatusFlags(int StatusFlags) { StatusFlags(struct, StatusFlags); return this; }
	public OVRTrackingState setLastCameraFrameCounter(int LastCameraFrameCounter) { LastCameraFrameCounter(struct, LastCameraFrameCounter); return this; }

	public void getHeadPose(ByteBuffer HeadPose) { HeadPoseGet(struct, HeadPose); }
	public void getHeadPoseThePose(ByteBuffer ThePose) { HeadPoseThePoseGet(struct, ThePose); }
	public void getHeadPoseThePoseOrientation(ByteBuffer Orientation) { HeadPoseThePoseOrientationGet(struct, Orientation); }
	public float getHeadPoseThePoseOrientationX() { return HeadPoseThePoseOrientationX(struct); }
	public float getHeadPoseThePoseOrientationY() { return HeadPoseThePoseOrientationY(struct); }
	public float getHeadPoseThePoseOrientationZ() { return HeadPoseThePoseOrientationZ(struct); }
	public float getHeadPoseThePoseOrientationW() { return HeadPoseThePoseOrientationW(struct); }
	public void getHeadPoseThePosePosition(ByteBuffer Position) { HeadPoseThePosePositionGet(struct, Position); }
	public float getHeadPoseThePosePositionX() { return HeadPoseThePosePositionX(struct); }
	public float getHeadPoseThePosePositionY() { return HeadPoseThePosePositionY(struct); }
	public float getHeadPoseThePosePositionZ() { return HeadPoseThePosePositionZ(struct); }
	public void getHeadPoseAngularVelocity(ByteBuffer AngularVelocity) { HeadPoseAngularVelocityGet(struct, AngularVelocity); }
	public float getHeadPoseAngularVelocityX() { return HeadPoseAngularVelocityX(struct); }
	public float getHeadPoseAngularVelocityY() { return HeadPoseAngularVelocityY(struct); }
	public float getHeadPoseAngularVelocityZ() { return HeadPoseAngularVelocityZ(struct); }
	public void getHeadPoseLinearVelocity(ByteBuffer LinearVelocity) { HeadPoseLinearVelocityGet(struct, LinearVelocity); }
	public float getHeadPoseLinearVelocityX() { return HeadPoseLinearVelocityX(struct); }
	public float getHeadPoseLinearVelocityY() { return HeadPoseLinearVelocityY(struct); }
	public float getHeadPoseLinearVelocityZ() { return HeadPoseLinearVelocityZ(struct); }
	public void getHeadPoseAngularAcceleration(ByteBuffer AngularAcceleration) { HeadPoseAngularAccelerationGet(struct, AngularAcceleration); }
	public float getHeadPoseAngularAccelerationX() { return HeadPoseAngularAccelerationX(struct); }
	public float getHeadPoseAngularAccelerationY() { return HeadPoseAngularAccelerationY(struct); }
	public float getHeadPoseAngularAccelerationZ() { return HeadPoseAngularAccelerationZ(struct); }
	public void getHeadPoseLinearAcceleration(ByteBuffer LinearAcceleration) { HeadPoseLinearAccelerationGet(struct, LinearAcceleration); }
	public float getHeadPoseLinearAccelerationX() { return HeadPoseLinearAccelerationX(struct); }
	public float getHeadPoseLinearAccelerationY() { return HeadPoseLinearAccelerationY(struct); }
	public float getHeadPoseLinearAccelerationZ() { return HeadPoseLinearAccelerationZ(struct); }
	public double getHeadPoseTimeInSeconds() { return HeadPoseTimeInSeconds(struct); }
	public void getCameraPose(ByteBuffer CameraPose) { CameraPoseGet(struct, CameraPose); }
	public void getCameraPoseOrientation(ByteBuffer Orientation) { CameraPoseOrientationGet(struct, Orientation); }
	public float getCameraPoseOrientationX() { return CameraPoseOrientationX(struct); }
	public float getCameraPoseOrientationY() { return CameraPoseOrientationY(struct); }
	public float getCameraPoseOrientationZ() { return CameraPoseOrientationZ(struct); }
	public float getCameraPoseOrientationW() { return CameraPoseOrientationW(struct); }
	public void getCameraPosePosition(ByteBuffer Position) { CameraPosePositionGet(struct, Position); }
	public float getCameraPosePositionX() { return CameraPosePositionX(struct); }
	public float getCameraPosePositionY() { return CameraPosePositionY(struct); }
	public float getCameraPosePositionZ() { return CameraPosePositionZ(struct); }
	public void getLeveledCameraPose(ByteBuffer LeveledCameraPose) { LeveledCameraPoseGet(struct, LeveledCameraPose); }
	public void getLeveledCameraPoseOrientation(ByteBuffer Orientation) { LeveledCameraPoseOrientationGet(struct, Orientation); }
	public float getLeveledCameraPoseOrientationX() { return LeveledCameraPoseOrientationX(struct); }
	public float getLeveledCameraPoseOrientationY() { return LeveledCameraPoseOrientationY(struct); }
	public float getLeveledCameraPoseOrientationZ() { return LeveledCameraPoseOrientationZ(struct); }
	public float getLeveledCameraPoseOrientationW() { return LeveledCameraPoseOrientationW(struct); }
	public void getLeveledCameraPosePosition(ByteBuffer Position) { LeveledCameraPosePositionGet(struct, Position); }
	public float getLeveledCameraPosePositionX() { return LeveledCameraPosePositionX(struct); }
	public float getLeveledCameraPosePositionY() { return LeveledCameraPosePositionY(struct); }
	public float getLeveledCameraPosePositionZ() { return LeveledCameraPosePositionZ(struct); }
	public void getHandPoses(ByteBuffer HandPoses) { HandPosesGet(struct, HandPoses); }
	public void getHandPoses(ByteBuffer HandPoses, int index) { HandPosesGet(struct, HandPoses, index); }
	public void getRawSensorData(ByteBuffer RawSensorData) { RawSensorDataGet(struct, RawSensorData); }
	public void getRawSensorDataAccelerometer(ByteBuffer Accelerometer) { RawSensorDataAccelerometerGet(struct, Accelerometer); }
	public float getRawSensorDataAccelerometerX() { return RawSensorDataAccelerometerX(struct); }
	public float getRawSensorDataAccelerometerY() { return RawSensorDataAccelerometerY(struct); }
	public float getRawSensorDataAccelerometerZ() { return RawSensorDataAccelerometerZ(struct); }
	public void getRawSensorDataGyro(ByteBuffer Gyro) { RawSensorDataGyroGet(struct, Gyro); }
	public float getRawSensorDataGyroX() { return RawSensorDataGyroX(struct); }
	public float getRawSensorDataGyroY() { return RawSensorDataGyroY(struct); }
	public float getRawSensorDataGyroZ() { return RawSensorDataGyroZ(struct); }
	public void getRawSensorDataMagnetometer(ByteBuffer Magnetometer) { RawSensorDataMagnetometerGet(struct, Magnetometer); }
	public float getRawSensorDataMagnetometerX() { return RawSensorDataMagnetometerX(struct); }
	public float getRawSensorDataMagnetometerY() { return RawSensorDataMagnetometerY(struct); }
	public float getRawSensorDataMagnetometerZ() { return RawSensorDataMagnetometerZ(struct); }
	public float getRawSensorDataTemperature() { return RawSensorDataTemperature(struct); }
	public float getRawSensorDataTimeInSeconds() { return RawSensorDataTimeInSeconds(struct); }
	public int getStatusFlags() { return StatusFlags(struct); }
	public int getLastCameraFrameCounter() { return LastCameraFrameCounter(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer HeadPose,
		ByteBuffer CameraPose,
		ByteBuffer LeveledCameraPose,
		ByteBuffer HandPoses,
		ByteBuffer RawSensorData,
		int StatusFlags,
		int LastCameraFrameCounter
	) {
		ByteBuffer ovrtrackingstate = malloc();

		HeadPoseSet(ovrtrackingstate, HeadPose);
		CameraPoseSet(ovrtrackingstate, CameraPose);
		LeveledCameraPoseSet(ovrtrackingstate, LeveledCameraPose);
		HandPosesSet(ovrtrackingstate, HandPoses);
		RawSensorDataSet(ovrtrackingstate, RawSensorData);
		StatusFlags(ovrtrackingstate, StatusFlags);
		LastCameraFrameCounter(ovrtrackingstate, LastCameraFrameCounter);

		return ovrtrackingstate;
	}

	public static void HeadPoseSet(ByteBuffer ovrtrackingstate, ByteBuffer HeadPose) { if ( HeadPose != null ) memCopy(memAddress(HeadPose), memAddress(ovrtrackingstate) + HEADPOSE, OVRPoseStatef.SIZEOF); }
	public static void HeadPoseThePoseSet(ByteBuffer ovrtrackingstate, ByteBuffer ThePose) { if ( ThePose != null ) memCopy(memAddress(ThePose), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE, OVRPosef.SIZEOF); }
	public static void HeadPoseThePoseOrientationSet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void HeadPoseThePoseOrientationX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void HeadPoseThePoseOrientationY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void HeadPoseThePoseOrientationZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void HeadPoseThePoseOrientationW(ByteBuffer ovrtrackingstate, float w) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void HeadPoseThePosePositionSet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void HeadPoseThePosePositionX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void HeadPoseThePosePositionY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void HeadPoseThePosePositionZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void HeadPoseAngularVelocitySet(ByteBuffer ovrtrackingstate, ByteBuffer AngularVelocity) { if ( AngularVelocity != null ) memCopy(memAddress(AngularVelocity), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY, OVRVector3f.SIZEOF); }
	public static void HeadPoseAngularVelocityX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.X, x); }
	public static void HeadPoseAngularVelocityY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Y, y); }
	public static void HeadPoseAngularVelocityZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Z, z); }
	public static void HeadPoseLinearVelocitySet(ByteBuffer ovrtrackingstate, ByteBuffer LinearVelocity) { if ( LinearVelocity != null ) memCopy(memAddress(LinearVelocity), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARVELOCITY, OVRVector3f.SIZEOF); }
	public static void HeadPoseLinearVelocityX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.X, x); }
	public static void HeadPoseLinearVelocityY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Y, y); }
	public static void HeadPoseLinearVelocityZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Z, z); }
	public static void HeadPoseAngularAccelerationSet(ByteBuffer ovrtrackingstate, ByteBuffer AngularAcceleration) { if ( AngularAcceleration != null ) memCopy(memAddress(AngularAcceleration), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION, OVRVector3f.SIZEOF); }
	public static void HeadPoseAngularAccelerationX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.X, x); }
	public static void HeadPoseAngularAccelerationY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Y, y); }
	public static void HeadPoseAngularAccelerationZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Z, z); }
	public static void HeadPoseLinearAccelerationSet(ByteBuffer ovrtrackingstate, ByteBuffer LinearAcceleration) { if ( LinearAcceleration != null ) memCopy(memAddress(LinearAcceleration), memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARACCELERATION, OVRVector3f.SIZEOF); }
	public static void HeadPoseLinearAccelerationX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.X, x); }
	public static void HeadPoseLinearAccelerationY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Y, y); }
	public static void HeadPoseLinearAccelerationZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Z, z); }
	public static void HeadPoseTimeInSeconds(ByteBuffer ovrtrackingstate, double TimeInSeconds) { ovrtrackingstate.putDouble(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.TIMEINSECONDS, TimeInSeconds); }
	public static void CameraPoseSet(ByteBuffer ovrtrackingstate, ByteBuffer CameraPose) { if ( CameraPose != null ) memCopy(memAddress(CameraPose), memAddress(ovrtrackingstate) + CAMERAPOSE, OVRPosef.SIZEOF); }
	public static void CameraPoseOrientationSet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void CameraPoseOrientationX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void CameraPoseOrientationY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void CameraPoseOrientationZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void CameraPoseOrientationW(ByteBuffer ovrtrackingstate, float w) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void CameraPosePositionSet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void CameraPosePositionX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void CameraPosePositionY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void CameraPosePositionZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void LeveledCameraPoseSet(ByteBuffer ovrtrackingstate, ByteBuffer LeveledCameraPose) { if ( LeveledCameraPose != null ) memCopy(memAddress(LeveledCameraPose), memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE, OVRPosef.SIZEOF); }
	public static void LeveledCameraPoseOrientationSet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void LeveledCameraPoseOrientationX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void LeveledCameraPoseOrientationY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void LeveledCameraPoseOrientationZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void LeveledCameraPoseOrientationW(ByteBuffer ovrtrackingstate, float w) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void LeveledCameraPosePositionSet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void LeveledCameraPosePositionX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void LeveledCameraPosePositionY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void LeveledCameraPosePositionZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void HandPosesSet(ByteBuffer ovrtrackingstate, ByteBuffer HandPoses) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandPoses, 2 * OVRPoseStatef.SIZEOF);
		memCopy(memAddress(HandPoses), memAddress(ovrtrackingstate) + HANDPOSES, HandPoses.remaining());
	}
	public static void HandPosesSet(ByteBuffer ovrtrackingstate, ByteBuffer HandPoses, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandPoses, OVRPoseStatef.SIZEOF);
		memCopy(memAddress(HandPoses), memAddress(ovrtrackingstate) + HANDPOSES + index * OVRPoseStatef.SIZEOF, HandPoses.remaining());
	}
	public static void RawSensorDataSet(ByteBuffer ovrtrackingstate, ByteBuffer RawSensorData) { if ( RawSensorData != null ) memCopy(memAddress(RawSensorData), memAddress(ovrtrackingstate) + RAWSENSORDATA, OVRSensorData.SIZEOF); }
	public static void RawSensorDataAccelerometerSet(ByteBuffer ovrtrackingstate, ByteBuffer Accelerometer) { if ( Accelerometer != null ) memCopy(memAddress(Accelerometer), memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.ACCELEROMETER, OVRVector3f.SIZEOF); }
	public static void RawSensorDataAccelerometerX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.X, x); }
	public static void RawSensorDataAccelerometerY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Y, y); }
	public static void RawSensorDataAccelerometerZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Z, z); }
	public static void RawSensorDataGyroSet(ByteBuffer ovrtrackingstate, ByteBuffer Gyro) { if ( Gyro != null ) memCopy(memAddress(Gyro), memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.GYRO, OVRVector3f.SIZEOF); }
	public static void RawSensorDataGyroX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.X, x); }
	public static void RawSensorDataGyroY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Y, y); }
	public static void RawSensorDataGyroZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Z, z); }
	public static void RawSensorDataMagnetometerSet(ByteBuffer ovrtrackingstate, ByteBuffer Magnetometer) { if ( Magnetometer != null ) memCopy(memAddress(Magnetometer), memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.MAGNETOMETER, OVRVector3f.SIZEOF); }
	public static void RawSensorDataMagnetometerX(ByteBuffer ovrtrackingstate, float x) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.X, x); }
	public static void RawSensorDataMagnetometerY(ByteBuffer ovrtrackingstate, float y) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Y, y); }
	public static void RawSensorDataMagnetometerZ(ByteBuffer ovrtrackingstate, float z) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Z, z); }
	public static void RawSensorDataTemperature(ByteBuffer ovrtrackingstate, float Temperature) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TEMPERATURE, Temperature); }
	public static void RawSensorDataTimeInSeconds(ByteBuffer ovrtrackingstate, float TimeInSeconds) { ovrtrackingstate.putFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TIMEINSECONDS, TimeInSeconds); }
	public static void StatusFlags(ByteBuffer ovrtrackingstate, int StatusFlags) { ovrtrackingstate.putInt(ovrtrackingstate.position() + STATUSFLAGS, StatusFlags); }
	public static void LastCameraFrameCounter(ByteBuffer ovrtrackingstate, int LastCameraFrameCounter) { ovrtrackingstate.putInt(ovrtrackingstate.position() + LASTCAMERAFRAMECOUNTER, LastCameraFrameCounter); }

	public static void HeadPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer HeadPose) { if ( LWJGLUtil.CHECKS ) checkBuffer(HeadPose, OVRPoseStatef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE, memAddress(HeadPose), OVRPoseStatef.SIZEOF); }
	public static void HeadPoseThePoseGet(ByteBuffer ovrtrackingstate, ByteBuffer ThePose) { if ( LWJGLUtil.CHECKS ) checkBuffer(ThePose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE, memAddress(ThePose), OVRPosef.SIZEOF); }
	public static void HeadPoseThePoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float HeadPoseThePoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float HeadPoseThePoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float HeadPoseThePoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float HeadPoseThePoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void HeadPoseThePosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float HeadPoseThePosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float HeadPoseThePosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float HeadPoseThePosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void HeadPoseAngularVelocityGet(ByteBuffer ovrtrackingstate, ByteBuffer AngularVelocity) { if ( LWJGLUtil.CHECKS ) checkBuffer(AngularVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY, memAddress(AngularVelocity), OVRVector3f.SIZEOF); }
	public static float HeadPoseAngularVelocityX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.X); }
	public static float HeadPoseAngularVelocityY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Y); }
	public static float HeadPoseAngularVelocityZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Z); }
	public static void HeadPoseLinearVelocityGet(ByteBuffer ovrtrackingstate, ByteBuffer LinearVelocity) { if ( LWJGLUtil.CHECKS ) checkBuffer(LinearVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARVELOCITY, memAddress(LinearVelocity), OVRVector3f.SIZEOF); }
	public static float HeadPoseLinearVelocityX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.X); }
	public static float HeadPoseLinearVelocityY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Y); }
	public static float HeadPoseLinearVelocityZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Z); }
	public static void HeadPoseAngularAccelerationGet(ByteBuffer ovrtrackingstate, ByteBuffer AngularAcceleration) { if ( LWJGLUtil.CHECKS ) checkBuffer(AngularAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION, memAddress(AngularAcceleration), OVRVector3f.SIZEOF); }
	public static float HeadPoseAngularAccelerationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.X); }
	public static float HeadPoseAngularAccelerationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Y); }
	public static float HeadPoseAngularAccelerationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Z); }
	public static void HeadPoseLinearAccelerationGet(ByteBuffer ovrtrackingstate, ByteBuffer LinearAcceleration) { if ( LWJGLUtil.CHECKS ) checkBuffer(LinearAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARACCELERATION, memAddress(LinearAcceleration), OVRVector3f.SIZEOF); }
	public static float HeadPoseLinearAccelerationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.X); }
	public static float HeadPoseLinearAccelerationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Y); }
	public static float HeadPoseLinearAccelerationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Z); }
	public static double HeadPoseTimeInSeconds(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getDouble(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.TIMEINSECONDS); }
	public static void CameraPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer CameraPose) { if ( LWJGLUtil.CHECKS ) checkBuffer(CameraPose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE, memAddress(CameraPose), OVRPosef.SIZEOF); }
	public static void CameraPoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float CameraPoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float CameraPoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float CameraPoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float CameraPoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void CameraPosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float CameraPosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float CameraPosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float CameraPosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void LeveledCameraPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer LeveledCameraPose) { if ( LWJGLUtil.CHECKS ) checkBuffer(LeveledCameraPose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE, memAddress(LeveledCameraPose), OVRPosef.SIZEOF); }
	public static void LeveledCameraPoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float LeveledCameraPoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float LeveledCameraPoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float LeveledCameraPoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float LeveledCameraPoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void LeveledCameraPosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float LeveledCameraPosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float LeveledCameraPosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float LeveledCameraPosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void HandPosesGet(ByteBuffer ovrtrackingstate, ByteBuffer HandPoses) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandPoses, 2 * OVRPoseStatef.SIZEOF);
		memCopy(memAddress(ovrtrackingstate) + HANDPOSES, memAddress(HandPoses), HandPoses.remaining());
	}
	public static void HandPosesGet(ByteBuffer ovrtrackingstate, ByteBuffer HandPoses, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandPoses, OVRPoseStatef.SIZEOF);
		memCopy(memAddress(ovrtrackingstate) + HANDPOSES + index * OVRPoseStatef.SIZEOF, memAddress(HandPoses), HandPoses.remaining());
	}
	public static void RawSensorDataGet(ByteBuffer ovrtrackingstate, ByteBuffer RawSensorData) { if ( LWJGLUtil.CHECKS ) checkBuffer(RawSensorData, OVRSensorData.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA, memAddress(RawSensorData), OVRSensorData.SIZEOF); }
	public static void RawSensorDataAccelerometerGet(ByteBuffer ovrtrackingstate, ByteBuffer Accelerometer) { if ( LWJGLUtil.CHECKS ) checkBuffer(Accelerometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.ACCELEROMETER, memAddress(Accelerometer), OVRVector3f.SIZEOF); }
	public static float RawSensorDataAccelerometerX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.X); }
	public static float RawSensorDataAccelerometerY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Y); }
	public static float RawSensorDataAccelerometerZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Z); }
	public static void RawSensorDataGyroGet(ByteBuffer ovrtrackingstate, ByteBuffer Gyro) { if ( LWJGLUtil.CHECKS ) checkBuffer(Gyro, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.GYRO, memAddress(Gyro), OVRVector3f.SIZEOF); }
	public static float RawSensorDataGyroX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.X); }
	public static float RawSensorDataGyroY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Y); }
	public static float RawSensorDataGyroZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Z); }
	public static void RawSensorDataMagnetometerGet(ByteBuffer ovrtrackingstate, ByteBuffer Magnetometer) { if ( LWJGLUtil.CHECKS ) checkBuffer(Magnetometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.MAGNETOMETER, memAddress(Magnetometer), OVRVector3f.SIZEOF); }
	public static float RawSensorDataMagnetometerX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.X); }
	public static float RawSensorDataMagnetometerY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Y); }
	public static float RawSensorDataMagnetometerZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Z); }
	public static float RawSensorDataTemperature(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TEMPERATURE); }
	public static float RawSensorDataTimeInSeconds(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TIMEINSECONDS); }
	public static int StatusFlags(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getInt(ovrtrackingstate.position() + STATUSFLAGS); }
	public static int LastCameraFrameCounter(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getInt(ovrtrackingstate.position() + LASTCAMERAFRAMECOUNTER); }

}