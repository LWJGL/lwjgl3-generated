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
 * Position and orientation together.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Orientation} &ndash; the pose orientation</li>
 * <li>{@code Position} &ndash; the pose position</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrPosef {
    {@link OVRQuatf ovrQuatf} Orientation;
    {@link OVRVector3f ovrVector3f} Position;
}</code></pre>
 */
public class OVRPosef extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ORIENTATION,
		POSITION;

	static {
		Layout layout = __struct(
			__member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF),
			__member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ORIENTATION = layout.offsetof(0);
		POSITION = layout.offsetof(1);
	}

	OVRPosef(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRPosef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRPosef(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
	public OVRQuatf Orientation() { return nOrientation(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code Position} field. */
	public OVRVector3f Position() { return nPosition(address()); }

	/** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
	public OVRPosef Orientation(OVRQuatf value) { nOrientation(address(), value); return this; }
	/** Copies the specified {@link OVRVector3f} to the {@code Position} field. */
	public OVRPosef Position(OVRVector3f value) { nPosition(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRPosef set(
		OVRQuatf Orientation,
		OVRVector3f Position
	) {
		Orientation(Orientation);
		Position(Position);

		return this;
	}

	/** Unsafe version of {@link #set(OVRPosef) set}. */
	public OVRPosef nset(long struct) {
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
	public OVRPosef set(OVRPosef src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRPosef malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRPosef calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRPosef} instance allocated with {@link BufferUtils}. */
	public static OVRPosef create() {
		return new OVRPosef(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRPosef} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRPosef create(long address) {
		return address == NULL ? null : new OVRPosef(address, null);
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRPosef.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRPosef} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRPosef mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRPosef} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRPosef callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRPosef} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPosef mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPosef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPosef callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Orientation}. */
	public static OVRQuatf nOrientation(long struct) { return OVRQuatf.create(struct + OVRPosef.ORIENTATION); }
	/** Unsafe version of {@link #Position}. */
	public static OVRVector3f nPosition(long struct) { return OVRVector3f.create(struct + OVRPosef.POSITION); }

	/** Unsafe version of {@link #Orientation(OVRQuatf) Orientation}. */
	public static void nOrientation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	/** Unsafe version of {@link #Position(OVRVector3f) Position}. */
	public static void nPosition(long struct, OVRVector3f value) { memCopy(value.address(), struct + OVRPosef.POSITION, OVRVector3f.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRPosef} structs. */
	public static final class Buffer extends StructBuffer<OVRPosef, Buffer> {

		/**
		 * Creates a new {@link OVRPosef.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRPosef#SIZEOF}, and its mark will be undefined.
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
		protected OVRPosef newInstance(long address) {
			return new OVRPosef(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
		public OVRQuatf Orientation() { return OVRPosef.nOrientation(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code Position} field. */
		public OVRVector3f Position() { return OVRPosef.nPosition(address()); }

		/** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
		public OVRPosef.Buffer Orientation(OVRQuatf value) { OVRPosef.nOrientation(address(), value); return this; }
		/** Copies the specified {@link OVRVector3f} to the {@code Position} field. */
		public OVRPosef.Buffer Position(OVRVector3f value) { OVRPosef.nPosition(address(), value); return this; }

	}

}