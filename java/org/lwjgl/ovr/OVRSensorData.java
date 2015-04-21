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

/** Specifies a reading we can query from the sensor. */
public final class OVRSensorData implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ACCELEROMETER,
		GYRO,
		MAGNETOMETER,
		TEMPERATURE,
		TIMEINSECONDS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		ACCELEROMETER = offsets.get(0);
		GYRO = offsets.get(1);
		MAGNETOMETER = offsets.get(2);
		TEMPERATURE = offsets.get(3);
		TIMEINSECONDS = offsets.get(4);
	}

	private final ByteBuffer struct;

	public OVRSensorData() {
		this(malloc());
	}

	public OVRSensorData(ByteBuffer struct) {
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

	public void setAccelerometer(ByteBuffer Accelerometer) { AccelerometerSet(struct, Accelerometer); }
	public void setAccelerometerX(float x) { AccelerometerX(struct, x); }
	public void setAccelerometerY(float y) { AccelerometerY(struct, y); }
	public void setAccelerometerZ(float z) { AccelerometerZ(struct, z); }
	public void setGyro(ByteBuffer Gyro) { GyroSet(struct, Gyro); }
	public void setGyroX(float x) { GyroX(struct, x); }
	public void setGyroY(float y) { GyroY(struct, y); }
	public void setGyroZ(float z) { GyroZ(struct, z); }
	public void setMagnetometer(ByteBuffer Magnetometer) { MagnetometerSet(struct, Magnetometer); }
	public void setMagnetometerX(float x) { MagnetometerX(struct, x); }
	public void setMagnetometerY(float y) { MagnetometerY(struct, y); }
	public void setMagnetometerZ(float z) { MagnetometerZ(struct, z); }
	public void setTemperature(float Temperature) { Temperature(struct, Temperature); }
	public void setTimeInSeconds(float TimeInSeconds) { TimeInSeconds(struct, TimeInSeconds); }

	public void getAccelerometer(ByteBuffer Accelerometer) { AccelerometerGet(struct, Accelerometer); }
	public float getAccelerometerX() { return AccelerometerX(struct); }
	public float getAccelerometerY() { return AccelerometerY(struct); }
	public float getAccelerometerZ() { return AccelerometerZ(struct); }
	public void getGyro(ByteBuffer Gyro) { GyroGet(struct, Gyro); }
	public float getGyroX() { return GyroX(struct); }
	public float getGyroY() { return GyroY(struct); }
	public float getGyroZ() { return GyroZ(struct); }
	public void getMagnetometer(ByteBuffer Magnetometer) { MagnetometerGet(struct, Magnetometer); }
	public float getMagnetometerX() { return MagnetometerX(struct); }
	public float getMagnetometerY() { return MagnetometerY(struct); }
	public float getMagnetometerZ() { return MagnetometerZ(struct); }
	public float getTemperature() { return Temperature(struct); }
	public float getTimeInSeconds() { return TimeInSeconds(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Accelerometer,
		ByteBuffer Gyro,
		ByteBuffer Magnetometer,
		float Temperature,
		float TimeInSeconds
	) {
		ByteBuffer ovrsensordata = malloc();

		AccelerometerSet(ovrsensordata, Accelerometer);
		GyroSet(ovrsensordata, Gyro);
		MagnetometerSet(ovrsensordata, Magnetometer);
		Temperature(ovrsensordata, Temperature);
		TimeInSeconds(ovrsensordata, TimeInSeconds);

		return ovrsensordata;
	}

	public static void AccelerometerSet(ByteBuffer ovrsensordata, ByteBuffer Accelerometer) { if ( Accelerometer != null ) memCopy(memAddress(Accelerometer), memAddress(ovrsensordata) + ACCELEROMETER, OVRVector3f.SIZEOF); }
	public static void AccelerometerX(ByteBuffer ovrsensordata, float x) { ovrsensordata.putFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.X, x); }
	public static void AccelerometerY(ByteBuffer ovrsensordata, float y) { ovrsensordata.putFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.Y, y); }
	public static void AccelerometerZ(ByteBuffer ovrsensordata, float z) { ovrsensordata.putFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.Z, z); }
	public static void GyroSet(ByteBuffer ovrsensordata, ByteBuffer Gyro) { if ( Gyro != null ) memCopy(memAddress(Gyro), memAddress(ovrsensordata) + GYRO, OVRVector3f.SIZEOF); }
	public static void GyroX(ByteBuffer ovrsensordata, float x) { ovrsensordata.putFloat(ovrsensordata.position() + GYRO + OVRVector3f.X, x); }
	public static void GyroY(ByteBuffer ovrsensordata, float y) { ovrsensordata.putFloat(ovrsensordata.position() + GYRO + OVRVector3f.Y, y); }
	public static void GyroZ(ByteBuffer ovrsensordata, float z) { ovrsensordata.putFloat(ovrsensordata.position() + GYRO + OVRVector3f.Z, z); }
	public static void MagnetometerSet(ByteBuffer ovrsensordata, ByteBuffer Magnetometer) { if ( Magnetometer != null ) memCopy(memAddress(Magnetometer), memAddress(ovrsensordata) + MAGNETOMETER, OVRVector3f.SIZEOF); }
	public static void MagnetometerX(ByteBuffer ovrsensordata, float x) { ovrsensordata.putFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.X, x); }
	public static void MagnetometerY(ByteBuffer ovrsensordata, float y) { ovrsensordata.putFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.Y, y); }
	public static void MagnetometerZ(ByteBuffer ovrsensordata, float z) { ovrsensordata.putFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.Z, z); }
	public static void Temperature(ByteBuffer ovrsensordata, float Temperature) { ovrsensordata.putFloat(ovrsensordata.position() + TEMPERATURE, Temperature); }
	public static void TimeInSeconds(ByteBuffer ovrsensordata, float TimeInSeconds) { ovrsensordata.putFloat(ovrsensordata.position() + TIMEINSECONDS, TimeInSeconds); }

	public static void AccelerometerGet(ByteBuffer ovrsensordata, ByteBuffer Accelerometer) { checkBuffer(Accelerometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrsensordata) + ACCELEROMETER, memAddress(Accelerometer), OVRVector3f.SIZEOF); }
	public static float AccelerometerX(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.X); }
	public static float AccelerometerY(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.Y); }
	public static float AccelerometerZ(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + ACCELEROMETER + OVRVector3f.Z); }
	public static void GyroGet(ByteBuffer ovrsensordata, ByteBuffer Gyro) { checkBuffer(Gyro, OVRVector3f.SIZEOF); memCopy(memAddress(ovrsensordata) + GYRO, memAddress(Gyro), OVRVector3f.SIZEOF); }
	public static float GyroX(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + GYRO + OVRVector3f.X); }
	public static float GyroY(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + GYRO + OVRVector3f.Y); }
	public static float GyroZ(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + GYRO + OVRVector3f.Z); }
	public static void MagnetometerGet(ByteBuffer ovrsensordata, ByteBuffer Magnetometer) { checkBuffer(Magnetometer, OVRVector3f.SIZEOF); memCopy(memAddress(ovrsensordata) + MAGNETOMETER, memAddress(Magnetometer), OVRVector3f.SIZEOF); }
	public static float MagnetometerX(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.X); }
	public static float MagnetometerY(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.Y); }
	public static float MagnetometerZ(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + MAGNETOMETER + OVRVector3f.Z); }
	public static float Temperature(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + TEMPERATURE); }
	public static float TimeInSeconds(ByteBuffer ovrsensordata) { return ovrsensordata.getFloat(ovrsensordata.position() + TIMEINSECONDS); }

}