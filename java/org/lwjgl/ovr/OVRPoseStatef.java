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
import static org.lwjgl.system.MemoryStack.*;

/**
 * A full pose (rigid body) configuration with first and second derivatives.
 * 
 * <p>Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, sensor or something else. The context
 * depends on the usage of the struct.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ThePose} &ndash; position and orientation</li>
 * <li>{@code AngularVelocity} &ndash; angular velocity in radians per second</li>
 * <li>{@code LinearVelocity} &ndash; velocity in meters per second</li>
 * <li>{@code AngularAcceleration} &ndash; angular acceleration in radians per second per second</li>
 * <li>{@code LinearAcceleration} &ndash; acceleration in meters per second per second</li>
 * <li>{@code TimeInSeconds} &ndash; absolute time that this pose refers to. See {@link OVR#ovr_GetTimeInSeconds}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrPoseStatef {
    {@link OVRPosef ovrPosef} ThePose;
    {@link OVRVector3f ovrVector3f} AngularVelocity;
    {@link OVRVector3f ovrVector3f} LinearVelocity;
    {@link OVRVector3f ovrVector3f} AngularAcceleration;
    {@link OVRVector3f ovrVector3f} LinearAcceleration;
    double TimeInSeconds;
}</code></pre>
 */
public class OVRPoseStatef extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
			__member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
			__member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
			__member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
			__member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		THEPOSE = layout.offsetof(0);
		ANGULARVELOCITY = layout.offsetof(1);
		LINEARVELOCITY = layout.offsetof(2);
		ANGULARACCELERATION = layout.offsetof(3);
		LINEARACCELERATION = layout.offsetof(4);
		TIMEINSECONDS = layout.offsetof(5);
	}

	OVRPoseStatef(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRPoseStatef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRPoseStatef(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRPoseStatef malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRPoseStatef calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRPoseStatef} instance allocated with {@link BufferUtils}. */
	public static OVRPoseStatef create() {
		return new OVRPoseStatef(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRPoseStatef} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRPoseStatef create(long address) {
		return address == NULL ? null : new OVRPoseStatef(address, null);
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRPoseStatef.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRPoseStatef} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRPoseStatef mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRPoseStatef} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRPoseStatef callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRPoseStatef} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPoseStatef mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPoseStatef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPoseStatef callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #ThePose}. */
	public static OVRPosef nThePose(long struct) { return OVRPosef.create(struct + OVRPoseStatef.THEPOSE); }
	/** Unsafe version of {@link #AngularVelocity}. */
	public static OVRVector3f nAngularVelocity(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.ANGULARVELOCITY); }
	/** Unsafe version of {@link #LinearVelocity}. */
	public static OVRVector3f nLinearVelocity(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.LINEARVELOCITY); }
	/** Unsafe version of {@link #AngularAcceleration}. */
	public static OVRVector3f nAngularAcceleration(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.ANGULARACCELERATION); }
	/** Unsafe version of {@link #LinearAcceleration}. */
	public static OVRVector3f nLinearAcceleration(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.LINEARACCELERATION); }
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
		protected OVRPoseStatef newInstance(long address) {
			return new OVRPoseStatef(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRPosef} view of the {@code ThePose} field. */
		public OVRPosef ThePose() { return OVRPoseStatef.nThePose(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code AngularVelocity} field. */
		public OVRVector3f AngularVelocity() { return OVRPoseStatef.nAngularVelocity(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code LinearVelocity} field. */
		public OVRVector3f LinearVelocity() { return OVRPoseStatef.nLinearVelocity(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code AngularAcceleration} field. */
		public OVRVector3f AngularAcceleration() { return OVRPoseStatef.nAngularAcceleration(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code LinearAcceleration} field. */
		public OVRVector3f LinearAcceleration() { return OVRPoseStatef.nLinearAcceleration(address()); }
		/** Returns the value of the {@code TimeInSeconds} field. */
		public double TimeInSeconds() { return OVRPoseStatef.nTimeInSeconds(address()); }

	}

}