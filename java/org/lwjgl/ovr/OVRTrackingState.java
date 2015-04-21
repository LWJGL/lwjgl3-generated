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

/** Tracking state at a given absolute time (describes predicted HMD pose etc). */
public final class OVRTrackingState implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADPOSE,
		CAMERAPOSE,
		LEVELEDCAMERAPOSE,
		RAWSENSORDATA,
		STATUSFLAGS,
		LASTCAMERAFRAMECOUNTER;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		HEADPOSE = offsets.get(0);
		CAMERAPOSE = offsets.get(1);
		LEVELEDCAMERAPOSE = offsets.get(2);
		RAWSENSORDATA = offsets.get(3);
		STATUSFLAGS = offsets.get(4);
		LASTCAMERAFRAMECOUNTER = offsets.get(5);
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

	public void setHeadPose(ByteBuffer HeadPose) { HeadPoseSet(struct, HeadPose); }
	public void setHeadPoseThePose(ByteBuffer ThePose) { HeadPoseThePoseSet(struct, ThePose); }
	public void setHeadPoseThePoseOrientation(ByteBuffer Orientation) { HeadPoseThePoseOrientationSet(struct, Orientation); }
	public void setHeadPoseThePoseOrientationX(float x) { HeadPoseThePoseOrientationX(struct, x); }
	public void setHeadPoseThePoseOrientationY(float y) { HeadPoseThePoseOrientationY(struct, y); }
	public void setHeadPoseThePoseOrientationZ(float z) { HeadPoseThePoseOrientationZ(struct, z); }
	public void setHeadPoseThePoseOrientationW(float w) { HeadPoseThePoseOrientationW(struct, w); }
	public void setHeadPoseThePosePosition(ByteBuffer Position) { HeadPoseThePosePositionSet(struct, Position); }
	public void setHeadPoseThePosePositionX(float x) { HeadPoseThePosePositionX(struct, x); }
	public void setHeadPoseThePosePositionY(float y) { HeadPoseThePosePositionY(struct, y); }
	public void setHeadPoseThePosePositionZ(float z) { HeadPoseThePosePositionZ(struct, z); }
	public void setHeadPoseAngularVelocity(ByteBuffer AngularVelocity) { HeadPoseAngularVelocitySet(struct, AngularVelocity); }
	public void setHeadPoseAngularVelocityX(float x) { HeadPoseAngularVelocityX(struct, x); }
	public void setHeadPoseAngularVelocityY(float y) { HeadPoseAngularVelocityY(struct, y); }
	public void setHeadPoseAngularVelocityZ(float z) { HeadPoseAngularVelocityZ(struct, z); }
	public void setHeadPoseLinearVelocity(ByteBuffer LinearVelocity) { HeadPoseLinearVelocitySet(struct, LinearVelocity); }
	public void setHeadPoseLinearVelocityX(float x) { HeadPoseLinearVelocityX(struct, x); }
	public void setHeadPoseLinearVelocityY(float y) { HeadPoseLinearVelocityY(struct, y); }
	public void setHeadPoseLinearVelocityZ(float z) { HeadPoseLinearVelocityZ(struct, z); }
	public void setHeadPoseAngularAcceleration(ByteBuffer AngularAcceleration) { HeadPoseAngularAccelerationSet(struct, AngularAcceleration); }
	public void setHeadPoseAngularAccelerationX(float x) { HeadPoseAngularAccelerationX(struct, x); }
	public void setHeadPoseAngularAccelerationY(float y) { HeadPoseAngularAccelerationY(struct, y); }
	public void setHeadPoseAngularAccelerationZ(float z) { HeadPoseAngularAccelerationZ(struct, z); }
	public void setHeadPoseLinearAcceleration(ByteBuffer LinearAcceleration) { HeadPoseLinearAccelerationSet(struct, LinearAcceleration); }
	public void setHeadPoseLinearAccelerationX(float x) { HeadPoseLinearAccelerationX(struct, x); }
	public void setHeadPoseLinearAccelerationY(float y) { HeadPoseLinearAccelerationY(struct, y); }
	public void setHeadPoseLinearAccelerationZ(float z) { HeadPoseLinearAccelerationZ(struct, z); }
	public void setHeadPoseTimeInSeconds(double TimeInSeconds) { HeadPoseTimeInSeconds(struct, TimeInSeconds); }
	public void setCameraPose(ByteBuffer CameraPose) { CameraPoseSet(struct, CameraPose); }
	public void setCameraPoseOrientation(ByteBuffer Orientation) { CameraPoseOrientationSet(struct, Orientation); }
	public void setCameraPoseOrientationX(float x) { CameraPoseOrientationX(struct, x); }
	public void setCameraPoseOrientationY(float y) { CameraPoseOrientationY(struct, y); }
	public void setCameraPoseOrientationZ(float z) { CameraPoseOrientationZ(struct, z); }
	public void setCameraPoseOrientationW(float w) { CameraPoseOrientationW(struct, w); }
	public void setCameraPosePosition(ByteBuffer Position) { CameraPosePositionSet(struct, Position); }
	public void setCameraPosePositionX(float x) { CameraPosePositionX(struct, x); }
	public void setCameraPosePositionY(float y) { CameraPosePositionY(struct, y); }
	public void setCameraPosePositionZ(float z) { CameraPosePositionZ(struct, z); }
	public void setLeveledCameraPose(ByteBuffer LeveledCameraPose) { LeveledCameraPoseSet(struct, LeveledCameraPose); }
	public void setLeveledCameraPoseOrientation(ByteBuffer Orientation) { LeveledCameraPoseOrientationSet(struct, Orientation); }
	public void setLeveledCameraPoseOrientationX(float x) { LeveledCameraPoseOrientationX(struct, x); }
	public void setLeveledCameraPoseOrientationY(float y) { LeveledCameraPoseOrientationY(struct, y); }
	public void setLeveledCameraPoseOrientationZ(float z) { LeveledCameraPoseOrientationZ(struct, z); }
	public void setLeveledCameraPoseOrientationW(float w) { LeveledCameraPoseOrientationW(struct, w); }
	public void setLeveledCameraPosePosition(ByteBuffer Position) { LeveledCameraPosePositionSet(struct, Position); }
	public void setLeveledCameraPosePositionX(float x) { LeveledCameraPosePositionX(struct, x); }
	public void setLeveledCameraPosePositionY(float y) { LeveledCameraPosePositionY(struct, y); }
	public void setLeveledCameraPosePositionZ(float z) { LeveledCameraPosePositionZ(struct, z); }
	public void setRawSensorData(ByteBuffer RawSensorData) { RawSensorDataSet(struct, RawSensorData); }
	public void setRawSensorDataAccelerometer(ByteBuffer Accelerometer) { RawSensorDataAccelerometerSet(struct, Accelerometer); }
	public void setRawSensorDataAccelerometerX(float x) { RawSensorDataAccelerometerX(struct, x); }
	public void setRawSensorDataAccelerometerY(float y) { RawSensorDataAccelerometerY(struct, y); }
	public void setRawSensorDataAccelerometerZ(float z) { RawSensorDataAccelerometerZ(struct, z); }
	public void setRawSensorDataGyro(ByteBuffer Gyro) { RawSensorDataGyroSet(struct, Gyro); }
	public void setRawSensorDataGyroX(float x) { RawSensorDataGyroX(struct, x); }
	public void setRawSensorDataGyroY(float y) { RawSensorDataGyroY(struct, y); }
	public void setRawSensorDataGyroZ(float z) { RawSensorDataGyroZ(struct, z); }
	public void setRawSensorDataMagnetometer(ByteBuffer Magnetometer) { RawSensorDataMagnetometerSet(struct, Magnetometer); }
	public void setRawSensorDataMagnetometerX(float x) { RawSensorDataMagnetometerX(struct, x); }
	public void setRawSensorDataMagnetometerY(float y) { RawSensorDataMagnetometerY(struct, y); }
	public void setRawSensorDataMagnetometerZ(float z) { RawSensorDataMagnetometerZ(struct, z); }
	public void setRawSensorDataTemperature(float Temperature) { RawSensorDataTemperature(struct, Temperature); }
	public void setRawSensorDataTimeInSeconds(float TimeInSeconds) { RawSensorDataTimeInSeconds(struct, TimeInSeconds); }
	public void setStatusFlags(int StatusFlags) { StatusFlags(struct, StatusFlags); }
	public void setLastCameraFrameCounter(int LastCameraFrameCounter) { LastCameraFrameCounter(struct, LastCameraFrameCounter); }

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
		ByteBuffer RawSensorData,
		int StatusFlags,
		int LastCameraFrameCounter
	) {
		ByteBuffer ovrtrackingstate = malloc();

		HeadPoseSet(ovrtrackingstate, HeadPose);
		CameraPoseSet(ovrtrackingstate, CameraPose);
		LeveledCameraPoseSet(ovrtrackingstate, LeveledCameraPose);
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

	public static void HeadPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer HeadPose) { checkBuffer(HeadPose, OVRPoseStatef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE, memAddress(HeadPose), OVRPoseStatef.SIZEOF); }
	public static void HeadPoseThePoseGet(ByteBuffer ovrtrackingstate, ByteBuffer ThePose) { checkBuffer(ThePose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE, memAddress(ThePose), OVRPosef.SIZEOF); }
	public static void HeadPoseThePoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float HeadPoseThePoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float HeadPoseThePoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float HeadPoseThePoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float HeadPoseThePoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void HeadPoseThePosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float HeadPoseThePosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float HeadPoseThePosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float HeadPoseThePosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.THEPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void HeadPoseAngularVelocityGet(ByteBuffer ovrtrackingstate, ByteBuffer AngularVelocity) { checkBuffer(AngularVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY, memAddress(AngularVelocity), OVRVector3f.SIZEOF); }
	public static float HeadPoseAngularVelocityX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.X); }
	public static float HeadPoseAngularVelocityY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Y); }
	public static float HeadPoseAngularVelocityZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARVELOCITY + OVRVector3f.Z); }
	public static void HeadPoseLinearVelocityGet(ByteBuffer ovrtrackingstate, ByteBuffer LinearVelocity) { checkBuffer(LinearVelocity, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARVELOCITY, memAddress(LinearVelocity), OVRVector3f.SIZEOF); }
	public static float HeadPoseLinearVelocityX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.X); }
	public static float HeadPoseLinearVelocityY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Y); }
	public static float HeadPoseLinearVelocityZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARVELOCITY + OVRVector3f.Z); }
	public static void HeadPoseAngularAccelerationGet(ByteBuffer ovrtrackingstate, ByteBuffer AngularAcceleration) { checkBuffer(AngularAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION, memAddress(AngularAcceleration), OVRVector3f.SIZEOF); }
	public static float HeadPoseAngularAccelerationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.X); }
	public static float HeadPoseAngularAccelerationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Y); }
	public static float HeadPoseAngularAccelerationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.ANGULARACCELERATION + OVRVector3f.Z); }
	public static void HeadPoseLinearAccelerationGet(ByteBuffer ovrtrackingstate, ByteBuffer LinearAcceleration) { checkBuffer(LinearAcceleration, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + HEADPOSE + OVRPoseStatef.LINEARACCELERATION, memAddress(LinearAcceleration), OVRVector3f.SIZEOF); }
	public static float HeadPoseLinearAccelerationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.X); }
	public static float HeadPoseLinearAccelerationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Y); }
	public static float HeadPoseLinearAccelerationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.LINEARACCELERATION + OVRVector3f.Z); }
	public static double HeadPoseTimeInSeconds(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getDouble(ovrtrackingstate.position() + HEADPOSE + OVRPoseStatef.TIMEINSECONDS); }
	public static void CameraPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer CameraPose) { checkBuffer(CameraPose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE, memAddress(CameraPose), OVRPosef.SIZEOF); }
	public static void CameraPoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float CameraPoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float CameraPoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float CameraPoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float CameraPoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void CameraPosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + CAMERAPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float CameraPosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float CameraPosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float CameraPosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + CAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void LeveledCameraPoseGet(ByteBuffer ovrtrackingstate, ByteBuffer LeveledCameraPose) { checkBuffer(LeveledCameraPose, OVRPosef.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE, memAddress(LeveledCameraPose), OVRPosef.SIZEOF); }
	public static void LeveledCameraPoseOrientationGet(ByteBuffer ovrtrackingstate, ByteBuffer Orientation) { checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float LeveledCameraPoseOrientationX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float LeveledCameraPoseOrientationY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float LeveledCameraPoseOrientationZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float LeveledCameraPoseOrientationW(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void LeveledCameraPosePositionGet(ByteBuffer ovrtrackingstate, ByteBuffer Position) { checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + LEVELEDCAMERAPOSE + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float LeveledCameraPosePositionX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float LeveledCameraPosePositionY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float LeveledCameraPosePositionZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + LEVELEDCAMERAPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void RawSensorDataGet(ByteBuffer ovrtrackingstate, ByteBuffer RawSensorData) { checkBuffer(RawSensorData, OVRSensorData.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA, memAddress(RawSensorData), OVRSensorData.SIZEOF); }
	public static void RawSensorDataAccelerometerGet(ByteBuffer ovrtrackingstate, ByteBuffer Accelerometer) { checkBuffer(Accelerometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.ACCELEROMETER, memAddress(Accelerometer), OVRVector3f.SIZEOF); }
	public static float RawSensorDataAccelerometerX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.X); }
	public static float RawSensorDataAccelerometerY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Y); }
	public static float RawSensorDataAccelerometerZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.ACCELEROMETER + OVRVector3f.Z); }
	public static void RawSensorDataGyroGet(ByteBuffer ovrtrackingstate, ByteBuffer Gyro) { checkBuffer(Gyro, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.GYRO, memAddress(Gyro), OVRVector3f.SIZEOF); }
	public static float RawSensorDataGyroX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.X); }
	public static float RawSensorDataGyroY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Y); }
	public static float RawSensorDataGyroZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.GYRO + OVRVector3f.Z); }
	public static void RawSensorDataMagnetometerGet(ByteBuffer ovrtrackingstate, ByteBuffer Magnetometer) { checkBuffer(Magnetometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrtrackingstate) + RAWSENSORDATA + OVRSensorData.MAGNETOMETER, memAddress(Magnetometer), OVRVector3f.SIZEOF); }
	public static float RawSensorDataMagnetometerX(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.X); }
	public static float RawSensorDataMagnetometerY(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Y); }
	public static float RawSensorDataMagnetometerZ(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.MAGNETOMETER + OVRVector3f.Z); }
	public static float RawSensorDataTemperature(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TEMPERATURE); }
	public static float RawSensorDataTimeInSeconds(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getFloat(ovrtrackingstate.position() + RAWSENSORDATA + OVRSensorData.TIMEINSECONDS); }
	public static int StatusFlags(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getInt(ovrtrackingstate.position() + STATUSFLAGS); }
	public static int LastCameraFrameCounter(ByteBuffer ovrtrackingstate) { return ovrtrackingstate.getInt(ovrtrackingstate.position() + LASTCAMERAFRAMECOUNTER); }

}