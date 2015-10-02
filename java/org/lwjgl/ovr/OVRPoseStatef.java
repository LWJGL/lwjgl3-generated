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

/** A full pose (rigid body) configuration with first and second derivatives. */
public class OVRPoseStatef extends Struct {

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

	private static native int offsets(long buffer);

	OVRPoseStatef(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRPoseStatef} instance at the specified memory address. */
	public OVRPoseStatef(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRPoseStatef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRPoseStatef(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRPosef getThePose() { return ngetThePose(address()); }
	public OVRQuatf getThePoseOrientation() { return ngetThePoseOrientation(address()); }
	public float getThePoseOrientationX() { return ngetThePoseOrientationX(address()); }
	public float getThePoseOrientationY() { return ngetThePoseOrientationY(address()); }
	public float getThePoseOrientationZ() { return ngetThePoseOrientationZ(address()); }
	public float getThePoseOrientationW() { return ngetThePoseOrientationW(address()); }
	public OVRVector3f getThePosePosition() { return ngetThePosePosition(address()); }
	public float getThePosePositionX() { return ngetThePosePositionX(address()); }
	public float getThePosePositionY() { return ngetThePosePositionY(address()); }
	public float getThePosePositionZ() { return ngetThePosePositionZ(address()); }
	public OVRVector3f getAngularVelocity() { return ngetAngularVelocity(address()); }
	public float getAngularVelocityX() { return ngetAngularVelocityX(address()); }
	public float getAngularVelocityY() { return ngetAngularVelocityY(address()); }
	public float getAngularVelocityZ() { return ngetAngularVelocityZ(address()); }
	public OVRVector3f getLinearVelocity() { return ngetLinearVelocity(address()); }
	public float getLinearVelocityX() { return ngetLinearVelocityX(address()); }
	public float getLinearVelocityY() { return ngetLinearVelocityY(address()); }
	public float getLinearVelocityZ() { return ngetLinearVelocityZ(address()); }
	public OVRVector3f getAngularAcceleration() { return ngetAngularAcceleration(address()); }
	public float getAngularAccelerationX() { return ngetAngularAccelerationX(address()); }
	public float getAngularAccelerationY() { return ngetAngularAccelerationY(address()); }
	public float getAngularAccelerationZ() { return ngetAngularAccelerationZ(address()); }
	public OVRVector3f getLinearAcceleration() { return ngetLinearAcceleration(address()); }
	public float getLinearAccelerationX() { return ngetLinearAccelerationX(address()); }
	public float getLinearAccelerationY() { return ngetLinearAccelerationY(address()); }
	public float getLinearAccelerationZ() { return ngetLinearAccelerationZ(address()); }
	public double getTimeInSeconds() { return ngetTimeInSeconds(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRPoseStatef malloc() {
		return new OVRPoseStatef(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRPoseStatef calloc() {
		return new OVRPoseStatef(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link BufferUtils}. */
	public static OVRPoseStatef create() {
		return new OVRPoseStatef(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRPosef ngetThePose(long struct) { return OVRPosef.malloc().nset(struct + THEPOSE); }
	/** Returns a copy of the {@code ThePose} {@link OVRPosef} struct. */
	public static OVRPosef getThePose(ByteBuffer struct) { return ngetThePose(memAddress(struct)); }
	public static OVRQuatf ngetThePoseOrientation(long struct) { return OVRQuatf.malloc().nset(struct + THEPOSE + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getThePoseOrientation(ByteBuffer struct) { return ngetThePoseOrientation(memAddress(struct)); }
	public static float ngetThePoseOrientationX(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getThePoseOrientationX(ByteBuffer struct) { return ngetThePoseOrientationX(memAddress(struct)); }
	public static float ngetThePoseOrientationY(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getThePoseOrientationY(ByteBuffer struct) { return ngetThePoseOrientationY(memAddress(struct)); }
	public static float ngetThePoseOrientationZ(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getThePoseOrientationZ(ByteBuffer struct) { return ngetThePoseOrientationZ(memAddress(struct)); }
	public static float ngetThePoseOrientationW(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getThePoseOrientationW(ByteBuffer struct) { return ngetThePoseOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetThePosePosition(long struct) { return OVRVector3f.malloc().nset(struct + THEPOSE + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getThePosePosition(ByteBuffer struct) { return ngetThePosePosition(memAddress(struct)); }
	public static float ngetThePosePositionX(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getThePosePositionX(ByteBuffer struct) { return ngetThePosePositionX(memAddress(struct)); }
	public static float ngetThePosePositionY(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getThePosePositionY(ByteBuffer struct) { return ngetThePosePositionY(memAddress(struct)); }
	public static float ngetThePosePositionZ(long struct) { return memGetFloat(struct + THEPOSE + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getThePosePositionZ(ByteBuffer struct) { return ngetThePosePositionZ(memAddress(struct)); }
	public static OVRVector3f ngetAngularVelocity(long struct) { return OVRVector3f.malloc().nset(struct + ANGULARVELOCITY); }
	/** Returns a copy of the {@code AngularVelocity} {@link OVRVector3f} struct. */
	public static OVRVector3f getAngularVelocity(ByteBuffer struct) { return ngetAngularVelocity(memAddress(struct)); }
	public static float ngetAngularVelocityX(long struct) { return memGetFloat(struct + ANGULARVELOCITY + OVRVector3f.X); }
	public static float getAngularVelocityX(ByteBuffer struct) { return ngetAngularVelocityX(memAddress(struct)); }
	public static float ngetAngularVelocityY(long struct) { return memGetFloat(struct + ANGULARVELOCITY + OVRVector3f.Y); }
	public static float getAngularVelocityY(ByteBuffer struct) { return ngetAngularVelocityY(memAddress(struct)); }
	public static float ngetAngularVelocityZ(long struct) { return memGetFloat(struct + ANGULARVELOCITY + OVRVector3f.Z); }
	public static float getAngularVelocityZ(ByteBuffer struct) { return ngetAngularVelocityZ(memAddress(struct)); }
	public static OVRVector3f ngetLinearVelocity(long struct) { return OVRVector3f.malloc().nset(struct + LINEARVELOCITY); }
	/** Returns a copy of the {@code LinearVelocity} {@link OVRVector3f} struct. */
	public static OVRVector3f getLinearVelocity(ByteBuffer struct) { return ngetLinearVelocity(memAddress(struct)); }
	public static float ngetLinearVelocityX(long struct) { return memGetFloat(struct + LINEARVELOCITY + OVRVector3f.X); }
	public static float getLinearVelocityX(ByteBuffer struct) { return ngetLinearVelocityX(memAddress(struct)); }
	public static float ngetLinearVelocityY(long struct) { return memGetFloat(struct + LINEARVELOCITY + OVRVector3f.Y); }
	public static float getLinearVelocityY(ByteBuffer struct) { return ngetLinearVelocityY(memAddress(struct)); }
	public static float ngetLinearVelocityZ(long struct) { return memGetFloat(struct + LINEARVELOCITY + OVRVector3f.Z); }
	public static float getLinearVelocityZ(ByteBuffer struct) { return ngetLinearVelocityZ(memAddress(struct)); }
	public static OVRVector3f ngetAngularAcceleration(long struct) { return OVRVector3f.malloc().nset(struct + ANGULARACCELERATION); }
	/** Returns a copy of the {@code AngularAcceleration} {@link OVRVector3f} struct. */
	public static OVRVector3f getAngularAcceleration(ByteBuffer struct) { return ngetAngularAcceleration(memAddress(struct)); }
	public static float ngetAngularAccelerationX(long struct) { return memGetFloat(struct + ANGULARACCELERATION + OVRVector3f.X); }
	public static float getAngularAccelerationX(ByteBuffer struct) { return ngetAngularAccelerationX(memAddress(struct)); }
	public static float ngetAngularAccelerationY(long struct) { return memGetFloat(struct + ANGULARACCELERATION + OVRVector3f.Y); }
	public static float getAngularAccelerationY(ByteBuffer struct) { return ngetAngularAccelerationY(memAddress(struct)); }
	public static float ngetAngularAccelerationZ(long struct) { return memGetFloat(struct + ANGULARACCELERATION + OVRVector3f.Z); }
	public static float getAngularAccelerationZ(ByteBuffer struct) { return ngetAngularAccelerationZ(memAddress(struct)); }
	public static OVRVector3f ngetLinearAcceleration(long struct) { return OVRVector3f.malloc().nset(struct + LINEARACCELERATION); }
	/** Returns a copy of the {@code LinearAcceleration} {@link OVRVector3f} struct. */
	public static OVRVector3f getLinearAcceleration(ByteBuffer struct) { return ngetLinearAcceleration(memAddress(struct)); }
	public static float ngetLinearAccelerationX(long struct) { return memGetFloat(struct + LINEARACCELERATION + OVRVector3f.X); }
	public static float getLinearAccelerationX(ByteBuffer struct) { return ngetLinearAccelerationX(memAddress(struct)); }
	public static float ngetLinearAccelerationY(long struct) { return memGetFloat(struct + LINEARACCELERATION + OVRVector3f.Y); }
	public static float getLinearAccelerationY(ByteBuffer struct) { return ngetLinearAccelerationY(memAddress(struct)); }
	public static float ngetLinearAccelerationZ(long struct) { return memGetFloat(struct + LINEARACCELERATION + OVRVector3f.Z); }
	public static float getLinearAccelerationZ(ByteBuffer struct) { return ngetLinearAccelerationZ(memAddress(struct)); }
	public static double ngetTimeInSeconds(long struct) { return memGetDouble(struct + TIMEINSECONDS); }
	public static double getTimeInSeconds(ByteBuffer struct) { return ngetTimeInSeconds(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link OVRPoseStatef} structs. */
	public static final class Buffer extends StructBuffer<OVRPoseStatef, Buffer> {

		/**
		 * Creates a new {@link OVRPoseStatef.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRPoseStatef#SIZEOF}, and its mark will be undefined.
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
		protected OVRPoseStatef newInstance(long address) {
			return new OVRPoseStatef(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRPosef getThePose() { return ngetThePose(address()); }
		public OVRQuatf getThePoseOrientation() { return ngetThePoseOrientation(address()); }
		public float getThePoseOrientationX() { return ngetThePoseOrientationX(address()); }
		public float getThePoseOrientationY() { return ngetThePoseOrientationY(address()); }
		public float getThePoseOrientationZ() { return ngetThePoseOrientationZ(address()); }
		public float getThePoseOrientationW() { return ngetThePoseOrientationW(address()); }
		public OVRVector3f getThePosePosition() { return ngetThePosePosition(address()); }
		public float getThePosePositionX() { return ngetThePosePositionX(address()); }
		public float getThePosePositionY() { return ngetThePosePositionY(address()); }
		public float getThePosePositionZ() { return ngetThePosePositionZ(address()); }
		public OVRVector3f getAngularVelocity() { return ngetAngularVelocity(address()); }
		public float getAngularVelocityX() { return ngetAngularVelocityX(address()); }
		public float getAngularVelocityY() { return ngetAngularVelocityY(address()); }
		public float getAngularVelocityZ() { return ngetAngularVelocityZ(address()); }
		public OVRVector3f getLinearVelocity() { return ngetLinearVelocity(address()); }
		public float getLinearVelocityX() { return ngetLinearVelocityX(address()); }
		public float getLinearVelocityY() { return ngetLinearVelocityY(address()); }
		public float getLinearVelocityZ() { return ngetLinearVelocityZ(address()); }
		public OVRVector3f getAngularAcceleration() { return ngetAngularAcceleration(address()); }
		public float getAngularAccelerationX() { return ngetAngularAccelerationX(address()); }
		public float getAngularAccelerationY() { return ngetAngularAccelerationY(address()); }
		public float getAngularAccelerationZ() { return ngetAngularAccelerationZ(address()); }
		public OVRVector3f getLinearAcceleration() { return ngetLinearAcceleration(address()); }
		public float getLinearAccelerationX() { return ngetLinearAccelerationX(address()); }
		public float getLinearAccelerationY() { return ngetLinearAccelerationY(address()); }
		public float getLinearAccelerationZ() { return ngetLinearAccelerationZ(address()); }
		public double getTimeInSeconds() { return ngetTimeInSeconds(address()); }

	}

}