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