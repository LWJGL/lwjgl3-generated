/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Specifies a reading we can query from the sensor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrSensorData {
    {@link OVRVector3f ovrVector3f} Accelerometer;
    {@link OVRVector3f ovrVector3f} Gyro;
    {@link OVRVector3f ovrVector3f} Magnetometer;
    float Temperature;
    float TimeInSeconds;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Accelerometer</td><td>acceleration reading in m/s^2</td></tr>
 * <tr><td>Gyro</td><td>rotation rate in rad/s</td></tr>
 * <tr><td>Magnetometer</td><td>magnetic field in Gauss</td></tr>
 * <tr><td>Temperature</td><td>temperature of the sensor in degrees Celsius</td></tr>
 * <tr><td>TimeInSeconds</td><td>time when the reported IMU reading took place, in seconds</td></tr>
 * </table>
 */
public class OVRSensorData extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ACCELEROMETER,
		GYRO,
		MAGNETOMETER,
		TEMPERATURE,
		TIMEINSECONDS;

	static {
		Layout layout = __struct(
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ACCELEROMETER = layout.offsetof(0);
		GYRO = layout.offsetof(1);
		MAGNETOMETER = layout.offsetof(2);
		TEMPERATURE = layout.offsetof(3);
		TIMEINSECONDS = layout.offsetof(4);
	}

	OVRSensorData(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRSensorData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSensorData(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRVector3f} view of the {@code Accelerometer} field. */
	public OVRVector3f Accelerometer() { return nAccelerometer(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code Gyro} field. */
	public OVRVector3f Gyro() { return nGyro(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code Magnetometer} field. */
	public OVRVector3f Magnetometer() { return nMagnetometer(address()); }
	/** Returns the value of the {@code Temperature} field. */
	public float Temperature() { return nTemperature(address()); }
	/** Returns the value of the {@code TimeInSeconds} field. */
	public float TimeInSeconds() { return nTimeInSeconds(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRSensorData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRSensorData malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSensorData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRSensorData calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSensorData} instance allocated with {@link BufferUtils}. */
	public static OVRSensorData create() {
		return new OVRSensorData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRSensorData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRSensorData create(long address) {
		return address == NULL ? null : new OVRSensorData(address, null);
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSensorData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRSensorData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #Accelerometer}. */
	public static OVRVector3f nAccelerometer(long struct) { return OVRVector3f.create(struct + OVRSensorData.ACCELEROMETER); }
	/** Unsafe version of {@link #Gyro}. */
	public static OVRVector3f nGyro(long struct) { return OVRVector3f.create(struct + OVRSensorData.GYRO); }
	/** Unsafe version of {@link #Magnetometer}. */
	public static OVRVector3f nMagnetometer(long struct) { return OVRVector3f.create(struct + OVRSensorData.MAGNETOMETER); }
	/** Unsafe version of {@link #Temperature}. */
	public static float nTemperature(long struct) { return memGetFloat(struct + OVRSensorData.TEMPERATURE); }
	/** Unsafe version of {@link #TimeInSeconds}. */
	public static float nTimeInSeconds(long struct) { return memGetFloat(struct + OVRSensorData.TIMEINSECONDS); }

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected OVRSensorData newInstance(long address) {
			return new OVRSensorData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRVector3f} view of the {@code Accelerometer} field. */
		public OVRVector3f Accelerometer() { return OVRSensorData.nAccelerometer(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code Gyro} field. */
		public OVRVector3f Gyro() { return OVRSensorData.nGyro(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code Magnetometer} field. */
		public OVRVector3f Magnetometer() { return OVRSensorData.nMagnetometer(address()); }
		/** Returns the value of the {@code Temperature} field. */
		public float Temperature() { return OVRSensorData.nTemperature(address()); }
		/** Returns the value of the {@code TimeInSeconds} field. */
		public float TimeInSeconds() { return OVRSensorData.nTimeInSeconds(address()); }

	}

}