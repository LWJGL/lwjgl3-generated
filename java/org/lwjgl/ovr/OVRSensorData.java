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
 * <h3>ovrSensorData members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Accelerometer</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>acceleration reading in m/s^2</td></tr>
 * <tr><td>Gyro</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>rotation rate in rad/s</td></tr>
 * <tr><td>Magnetometer</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>magnetic field in Gauss</td></tr>
 * <tr><td>Temperature</td><td class="nw">float</td><td>temperature of the sensor in degrees Celsius</td></tr>
 * <tr><td>TimeInSeconds</td><td class="nw">float</td><td>time when the reported IMU reading took place, in seconds</td></tr>
 * </table>
 */
public class OVRSensorData extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
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

	/**
	 * Create a {@link OVRSensorData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Accelerometer}. */
	public static OVRVector3f nAccelerometer(long struct) { return new OVRVector3f(struct + OVRSensorData.ACCELEROMETER); }
	/** Unsafe version of {@link #Gyro}. */
	public static OVRVector3f nGyro(long struct) { return new OVRVector3f(struct + OVRSensorData.GYRO); }
	/** Unsafe version of {@link #Magnetometer}. */
	public static OVRVector3f nMagnetometer(long struct) { return new OVRVector3f(struct + OVRSensorData.MAGNETOMETER); }
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

	}

}