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
 * A full pose (rigid body) configuration with first and second derivatives.
 * 
 * <p>Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, camera or something else. The context
 * depends on the usage of the struct.</p>
 * 
 * <h3>ovrPoseStatef members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>ThePose</td><td class="nw">{@link OVRPosef ovrPosef}</td><td>position and orientation</td></tr>
 * <tr><td>AngularVelocity</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>angular velocity in radians per second</td></tr>
 * <tr><td>LinearVelocity</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>velocity in meters per second</td></tr>
 * <tr><td>AngularAcceleration</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>angular acceleration in radians per second per second</td></tr>
 * <tr><td>LinearAcceleration</td><td class="nw">{@link OVRVector3f ovrVector3f}</td><td>acceleration in meters per second per second</td></tr>
 * <tr><td>TimeInSeconds</td><td class="nw">double</td><td>absolute time of this state sample</td></tr>
 * </table>
 */
public class OVRPoseStatef extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		THEPOSE,
		ANGULARVELOCITY,
		LINEARVELOCITY,
		ANGULARACCELERATION,
		LINEARACCELERATION,
		TIMEINSECONDS;

	static {
		Layout layout = __struct(
			__member(OVRPosef.SIZEOF, OVRPosef.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		THEPOSE = layout.offsetof(0);
		ANGULARVELOCITY = layout.offsetof(1);
		LINEARVELOCITY = layout.offsetof(2);
		ANGULARACCELERATION = layout.offsetof(3);
		LINEARACCELERATION = layout.offsetof(4);
		TIMEINSECONDS = layout.offsetof(5);
	}

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

	/** Returns a {@link OVRPosef} view of the {@code ThePose} field. */
	public OVRPosef ThePose() { return nThePose(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code AngularVelocity} field. */
	public OVRVector3f AngularVelocity() { return nAngularVelocity(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code LinearVelocity} field. */
	public OVRVector3f LinearVelocity() { return nLinearVelocity(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code AngularAcceleration} field. */
	public OVRVector3f AngularAcceleration() { return nAngularAcceleration(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code LinearAcceleration} field. */
	public OVRVector3f LinearAcceleration() { return nLinearAcceleration(address()); }
	/** Returns the value of the {@code TimeInSeconds} field. */
	public double TimeInSeconds() { return nTimeInSeconds(address()); }

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

	/**
	 * Create a {@link OVRPoseStatef.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #ThePose}. */
	public static OVRPosef nThePose(long struct) { return new OVRPosef(struct + OVRPoseStatef.THEPOSE); }
	/** Unsafe version of {@link #AngularVelocity}. */
	public static OVRVector3f nAngularVelocity(long struct) { return new OVRVector3f(struct + OVRPoseStatef.ANGULARVELOCITY); }
	/** Unsafe version of {@link #LinearVelocity}. */
	public static OVRVector3f nLinearVelocity(long struct) { return new OVRVector3f(struct + OVRPoseStatef.LINEARVELOCITY); }
	/** Unsafe version of {@link #AngularAcceleration}. */
	public static OVRVector3f nAngularAcceleration(long struct) { return new OVRVector3f(struct + OVRPoseStatef.ANGULARACCELERATION); }
	/** Unsafe version of {@link #LinearAcceleration}. */
	public static OVRVector3f nLinearAcceleration(long struct) { return new OVRVector3f(struct + OVRPoseStatef.LINEARACCELERATION); }
	/** Unsafe version of {@link #TimeInSeconds}. */
	public static double nTimeInSeconds(long struct) { return memGetDouble(struct + OVRPoseStatef.TIMEINSECONDS); }

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

		/** Returns a {@link OVRPosef} view of the {@code ThePose} field. */
		public OVRPosef ThePose() { return nThePose(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code AngularVelocity} field. */
		public OVRVector3f AngularVelocity() { return nAngularVelocity(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code LinearVelocity} field. */
		public OVRVector3f LinearVelocity() { return nLinearVelocity(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code AngularAcceleration} field. */
		public OVRVector3f AngularAcceleration() { return nAngularAcceleration(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code LinearAcceleration} field. */
		public OVRVector3f LinearAcceleration() { return nLinearAcceleration(address()); }
		/** Returns the value of the {@code TimeInSeconds} field. */
		public double TimeInSeconds() { return nTimeInSeconds(address()); }

	}

}