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

/** Specifies a reading we can query from the sensor. */
public final class OVRSensorData extends Struct {

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
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		ACCELEROMETER = offsets.get(0);
		GYRO = offsets.get(1);
		MAGNETOMETER = offsets.get(2);
		TEMPERATURE = offsets.get(3);
		TIMEINSECONDS = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRSensorData(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSensorData} instance at the specified memory address. */
	public OVRSensorData(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSensorData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSensorData(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRVector3f getAccelerometer() { return ngetAccelerometer(address()); }
	public float getAccelerometerX() { return ngetAccelerometerX(address()); }
	public float getAccelerometerY() { return ngetAccelerometerY(address()); }
	public float getAccelerometerZ() { return ngetAccelerometerZ(address()); }
	public OVRVector3f getGyro() { return ngetGyro(address()); }
	public float getGyroX() { return ngetGyroX(address()); }
	public float getGyroY() { return ngetGyroY(address()); }
	public float getGyroZ() { return ngetGyroZ(address()); }
	public OVRVector3f getMagnetometer() { return ngetMagnetometer(address()); }
	public float getMagnetometerX() { return ngetMagnetometerX(address()); }
	public float getMagnetometerY() { return ngetMagnetometerY(address()); }
	public float getMagnetometerZ() { return ngetMagnetometerZ(address()); }
	public float getTemperature() { return ngetTemperature(address()); }
	public float getTimeInSeconds() { return ngetTimeInSeconds(address()); }

	public OVRSensorData setAccelerometer(OVRVector3f Accelerometer) { nsetAccelerometer(address(), Accelerometer); return this; }
	public OVRSensorData setAccelerometerX(float x) { nsetAccelerometerX(address(), x); return this; }
	public OVRSensorData setAccelerometerY(float y) { nsetAccelerometerY(address(), y); return this; }
	public OVRSensorData setAccelerometerZ(float z) { nsetAccelerometerZ(address(), z); return this; }
	public OVRSensorData setGyro(OVRVector3f Gyro) { nsetGyro(address(), Gyro); return this; }
	public OVRSensorData setGyroX(float x) { nsetGyroX(address(), x); return this; }
	public OVRSensorData setGyroY(float y) { nsetGyroY(address(), y); return this; }
	public OVRSensorData setGyroZ(float z) { nsetGyroZ(address(), z); return this; }
	public OVRSensorData setMagnetometer(OVRVector3f Magnetometer) { nsetMagnetometer(address(), Magnetometer); return this; }
	public OVRSensorData setMagnetometerX(float x) { nsetMagnetometerX(address(), x); return this; }
	public OVRSensorData setMagnetometerY(float y) { nsetMagnetometerY(address(), y); return this; }
	public OVRSensorData setMagnetometerZ(float z) { nsetMagnetometerZ(address(), z); return this; }
	public OVRSensorData setTemperature(float Temperature) { nsetTemperature(address(), Temperature); return this; }
	public OVRSensorData setTimeInSeconds(float TimeInSeconds) { nsetTimeInSeconds(address(), TimeInSeconds); return this; }

	/** Initializes this struct with the specified values. */
	public OVRSensorData set(
		OVRVector3f Accelerometer,
		OVRVector3f Gyro,
		OVRVector3f Magnetometer,
		float Temperature,
		float TimeInSeconds
	) {
		setAccelerometer(Accelerometer);
		setGyro(Gyro);
		setMagnetometer(Magnetometer);
		setTemperature(Temperature);
		setTimeInSeconds(TimeInSeconds);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRSensorData nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public OVRSensorData set(OVRSensorData src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRSensorData set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRSensorData} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSensorData malloc() {
		return new OVRSensorData(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSensorData} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSensorData calloc() {
		return new OVRSensorData(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSensorData} instance allocated with {@link BufferUtils}. */
	public static OVRSensorData create() {
		return new OVRSensorData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRVector3f ngetAccelerometer(long struct) { return OVRVector3f.malloc().nset(struct + ACCELEROMETER); }
	/** Returns a copy of the {@code Accelerometer} {@link OVRVector3f} struct. */
	public static OVRVector3f getAccelerometer(ByteBuffer struct) { return ngetAccelerometer(memAddress(struct)); }
	public static float ngetAccelerometerX(long struct) { return memGetFloat(struct + ACCELEROMETER + OVRVector3f.X); }
	public static float getAccelerometerX(ByteBuffer struct) { return ngetAccelerometerX(memAddress(struct)); }
	public static float ngetAccelerometerY(long struct) { return memGetFloat(struct + ACCELEROMETER + OVRVector3f.Y); }
	public static float getAccelerometerY(ByteBuffer struct) { return ngetAccelerometerY(memAddress(struct)); }
	public static float ngetAccelerometerZ(long struct) { return memGetFloat(struct + ACCELEROMETER + OVRVector3f.Z); }
	public static float getAccelerometerZ(ByteBuffer struct) { return ngetAccelerometerZ(memAddress(struct)); }
	public static OVRVector3f ngetGyro(long struct) { return OVRVector3f.malloc().nset(struct + GYRO); }
	/** Returns a copy of the {@code Gyro} {@link OVRVector3f} struct. */
	public static OVRVector3f getGyro(ByteBuffer struct) { return ngetGyro(memAddress(struct)); }
	public static float ngetGyroX(long struct) { return memGetFloat(struct + GYRO + OVRVector3f.X); }
	public static float getGyroX(ByteBuffer struct) { return ngetGyroX(memAddress(struct)); }
	public static float ngetGyroY(long struct) { return memGetFloat(struct + GYRO + OVRVector3f.Y); }
	public static float getGyroY(ByteBuffer struct) { return ngetGyroY(memAddress(struct)); }
	public static float ngetGyroZ(long struct) { return memGetFloat(struct + GYRO + OVRVector3f.Z); }
	public static float getGyroZ(ByteBuffer struct) { return ngetGyroZ(memAddress(struct)); }
	public static OVRVector3f ngetMagnetometer(long struct) { return OVRVector3f.malloc().nset(struct + MAGNETOMETER); }
	/** Returns a copy of the {@code Magnetometer} {@link OVRVector3f} struct. */
	public static OVRVector3f getMagnetometer(ByteBuffer struct) { return ngetMagnetometer(memAddress(struct)); }
	public static float ngetMagnetometerX(long struct) { return memGetFloat(struct + MAGNETOMETER + OVRVector3f.X); }
	public static float getMagnetometerX(ByteBuffer struct) { return ngetMagnetometerX(memAddress(struct)); }
	public static float ngetMagnetometerY(long struct) { return memGetFloat(struct + MAGNETOMETER + OVRVector3f.Y); }
	public static float getMagnetometerY(ByteBuffer struct) { return ngetMagnetometerY(memAddress(struct)); }
	public static float ngetMagnetometerZ(long struct) { return memGetFloat(struct + MAGNETOMETER + OVRVector3f.Z); }
	public static float getMagnetometerZ(ByteBuffer struct) { return ngetMagnetometerZ(memAddress(struct)); }
	public static float ngetTemperature(long struct) { return memGetFloat(struct + TEMPERATURE); }
	public static float getTemperature(ByteBuffer struct) { return ngetTemperature(memAddress(struct)); }
	public static float ngetTimeInSeconds(long struct) { return memGetFloat(struct + TIMEINSECONDS); }
	public static float getTimeInSeconds(ByteBuffer struct) { return ngetTimeInSeconds(memAddress(struct)); }

	public static void nsetAccelerometer(long struct, OVRVector3f Accelerometer) { memCopy(Accelerometer.address(), struct + ACCELEROMETER, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Accelerometer} struct. */
	public static void setAccelerometer(ByteBuffer struct, OVRVector3f Accelerometer) { nsetAccelerometer(memAddress(struct), Accelerometer); }
	public static void nsetAccelerometerX(long struct, float x) { memPutFloat(struct + ACCELEROMETER + OVRVector3f.X, x); }
	public static void setAccelerometerX(ByteBuffer struct, float x) { nsetAccelerometerX(memAddress(struct), x); }
	public static void nsetAccelerometerY(long struct, float y) { memPutFloat(struct + ACCELEROMETER + OVRVector3f.Y, y); }
	public static void setAccelerometerY(ByteBuffer struct, float y) { nsetAccelerometerY(memAddress(struct), y); }
	public static void nsetAccelerometerZ(long struct, float z) { memPutFloat(struct + ACCELEROMETER + OVRVector3f.Z, z); }
	public static void setAccelerometerZ(ByteBuffer struct, float z) { nsetAccelerometerZ(memAddress(struct), z); }
	public static void nsetGyro(long struct, OVRVector3f Gyro) { memCopy(Gyro.address(), struct + GYRO, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Gyro} struct. */
	public static void setGyro(ByteBuffer struct, OVRVector3f Gyro) { nsetGyro(memAddress(struct), Gyro); }
	public static void nsetGyroX(long struct, float x) { memPutFloat(struct + GYRO + OVRVector3f.X, x); }
	public static void setGyroX(ByteBuffer struct, float x) { nsetGyroX(memAddress(struct), x); }
	public static void nsetGyroY(long struct, float y) { memPutFloat(struct + GYRO + OVRVector3f.Y, y); }
	public static void setGyroY(ByteBuffer struct, float y) { nsetGyroY(memAddress(struct), y); }
	public static void nsetGyroZ(long struct, float z) { memPutFloat(struct + GYRO + OVRVector3f.Z, z); }
	public static void setGyroZ(ByteBuffer struct, float z) { nsetGyroZ(memAddress(struct), z); }
	public static void nsetMagnetometer(long struct, OVRVector3f Magnetometer) { memCopy(Magnetometer.address(), struct + MAGNETOMETER, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Magnetometer} struct. */
	public static void setMagnetometer(ByteBuffer struct, OVRVector3f Magnetometer) { nsetMagnetometer(memAddress(struct), Magnetometer); }
	public static void nsetMagnetometerX(long struct, float x) { memPutFloat(struct + MAGNETOMETER + OVRVector3f.X, x); }
	public static void setMagnetometerX(ByteBuffer struct, float x) { nsetMagnetometerX(memAddress(struct), x); }
	public static void nsetMagnetometerY(long struct, float y) { memPutFloat(struct + MAGNETOMETER + OVRVector3f.Y, y); }
	public static void setMagnetometerY(ByteBuffer struct, float y) { nsetMagnetometerY(memAddress(struct), y); }
	public static void nsetMagnetometerZ(long struct, float z) { memPutFloat(struct + MAGNETOMETER + OVRVector3f.Z, z); }
	public static void setMagnetometerZ(ByteBuffer struct, float z) { nsetMagnetometerZ(memAddress(struct), z); }
	public static void nsetTemperature(long struct, float Temperature) { memPutFloat(struct + TEMPERATURE, Temperature); }
	public static void setTemperature(ByteBuffer struct, float Temperature) { nsetTemperature(memAddress(struct), Temperature); }
	public static void nsetTimeInSeconds(long struct, float TimeInSeconds) { memPutFloat(struct + TIMEINSECONDS, TimeInSeconds); }
	public static void setTimeInSeconds(ByteBuffer struct, float TimeInSeconds) { nsetTimeInSeconds(memAddress(struct), TimeInSeconds); }

	// -----------------------------------

	/** An array of {@link OVRSensorData} structs. */
	public static final class Buffer extends StructBuffer<OVRSensorData, Buffer> {

		/**
		 * Creates a new {@link OVRSensorData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSensorData#SIZEOF}, and its mark will be undefined.
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
		protected OVRSensorData newInstance(long address) {
			return new OVRSensorData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}