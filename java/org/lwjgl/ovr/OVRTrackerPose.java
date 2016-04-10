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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifies the pose for a single sensor.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code TrackerFlags} &ndash; {@code ovrTrackerFlags}.</li>
 * <li>{@code Pose} &ndash; the sensor's pose. This pose includes sensor tilt (roll and pitch). For a leveled coordinate system use {@code LeveledPose}.</li>
 * <li>{@code LeveledPose} &ndash; t
 * the sensor's leveled pose, aligned with gravity. This value includes position and yaw of the sensor, but not roll and pitch. It can be used as a
 * reference point to render real-world objects in the correct location.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTrackerPose {
    unsigned int TrackerFlags;
    {@link OVRPosef ovrPosef} Pose;
    {@link OVRPosef ovrPosef} LeveledPose;
    char[4];
}</code></pre>
 */
public class OVRTrackerPose extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TRACKERFLAGS,
		POSE,
		LEVELEDPOSE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
			__member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
			__padding(4, true)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TRACKERFLAGS = layout.offsetof(0);
		POSE = layout.offsetof(1);
		LEVELEDPOSE = layout.offsetof(2);
	}

	OVRTrackerPose(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTrackerPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTrackerPose(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code TrackerFlags} field. */
	public int TrackerFlags() { return nTrackerFlags(address()); }
	/** Returns a {@link OVRPosef} view of the {@code Pose} field. */
	public OVRPosef Pose() { return nPose(address()); }
	/** Returns a {@link OVRPosef} view of the {@code LeveledPose} field. */
	public OVRPosef LeveledPose() { return nLeveledPose(address()); }

	/** Sets the specified value to the {@code TrackerFlags} field. */
	public OVRTrackerPose TrackerFlags(int value) { nTrackerFlags(address(), value); return this; }
	/** Copies the specified {@link OVRPosef} to the {@code Pose} field. */
	public OVRTrackerPose Pose(OVRPosef value) { nPose(address(), value); return this; }
	/** Copies the specified {@link OVRPosef} to the {@code LeveledPose} field. */
	public OVRTrackerPose LeveledPose(OVRPosef value) { nLeveledPose(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTrackerPose set(
		int TrackerFlags,
		OVRPosef Pose,
		OVRPosef LeveledPose
	) {
		TrackerFlags(TrackerFlags);
		Pose(Pose);
		LeveledPose(LeveledPose);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTrackerPose) set}. */
	public OVRTrackerPose nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRTrackerPose set(OVRTrackerPose src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRTrackerPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTrackerPose malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTrackerPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTrackerPose calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTrackerPose} instance allocated with {@link BufferUtils}. */
	public static OVRTrackerPose create() {
		return new OVRTrackerPose(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTrackerPose} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTrackerPose create(long address) {
		return address == NULL ? null : new OVRTrackerPose(address, null);
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTrackerPose.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRTrackerPose} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRTrackerPose mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRTrackerPose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRTrackerPose callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerPose} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTrackerPose mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackerPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTrackerPose callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #TrackerFlags}. */
	public static int nTrackerFlags(long struct) { return memGetInt(struct + OVRTrackerPose.TRACKERFLAGS); }
	/** Unsafe version of {@link #Pose}. */
	public static OVRPosef nPose(long struct) { return OVRPosef.create(struct + OVRTrackerPose.POSE); }
	/** Unsafe version of {@link #LeveledPose}. */
	public static OVRPosef nLeveledPose(long struct) { return OVRPosef.create(struct + OVRTrackerPose.LEVELEDPOSE); }

	/** Unsafe version of {@link #TrackerFlags(int) TrackerFlags}. */
	public static void nTrackerFlags(long struct, int value) { memPutInt(struct + OVRTrackerPose.TRACKERFLAGS, value); }
	/** Unsafe version of {@link #Pose(OVRPosef) Pose}. */
	public static void nPose(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRTrackerPose.POSE, OVRPosef.SIZEOF); }
	/** Unsafe version of {@link #LeveledPose(OVRPosef) LeveledPose}. */
	public static void nLeveledPose(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRTrackerPose.LEVELEDPOSE, OVRPosef.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRTrackerPose} structs. */
	public static final class Buffer extends StructBuffer<OVRTrackerPose, Buffer> {

		/**
		 * Creates a new {@link OVRTrackerPose.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTrackerPose#SIZEOF}, and its mark will be undefined.
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
		protected OVRTrackerPose newInstance(long address) {
			return new OVRTrackerPose(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code TrackerFlags} field. */
		public int TrackerFlags() { return OVRTrackerPose.nTrackerFlags(address()); }
		/** Returns a {@link OVRPosef} view of the {@code Pose} field. */
		public OVRPosef Pose() { return OVRTrackerPose.nPose(address()); }
		/** Returns a {@link OVRPosef} view of the {@code LeveledPose} field. */
		public OVRPosef LeveledPose() { return OVRTrackerPose.nLeveledPose(address()); }

		/** Sets the specified value to the {@code TrackerFlags} field. */
		public OVRTrackerPose.Buffer TrackerFlags(int value) { OVRTrackerPose.nTrackerFlags(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} to the {@code Pose} field. */
		public OVRTrackerPose.Buffer Pose(OVRPosef value) { OVRTrackerPose.nPose(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} to the {@code LeveledPose} field. */
		public OVRTrackerPose.Buffer LeveledPose(OVRPosef value) { OVRTrackerPose.nLeveledPose(address(), value); return this; }

	}

}