/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_scaling_state {
    {@link NkVec2 struct nk_vec2} start_size;
    int active;
}</code></pre>
 */
public class NkScalingState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		START_SIZE,
		ACTIVE;

	static {
		Layout layout = __struct(
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		START_SIZE = layout.offsetof(0);
		ACTIVE = layout.offsetof(1);
	}

	NkScalingState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkScalingState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkScalingState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkVec2} view of the {@code start_size} field. */
	public NkVec2 start_size() { return nstart_size(address()); }
	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }

	/** Copies the specified {@link NkVec2} to the {@code start_size} field. */
	public NkScalingState start_size(NkVec2 value) { nstart_size(address(), value); return this; }
	/** Sets the specified value to the {@code active} field. */
	public NkScalingState active(int value) { nactive(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkScalingState set(
		NkVec2 start_size,
		int active
	) {
		start_size(start_size);
		active(active);

		return this;
	}

	/** Unsafe version of {@link #set(NkScalingState) set}. */
	public NkScalingState nset(long struct) {
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
	public NkScalingState set(NkScalingState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkScalingState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkScalingState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkScalingState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkScalingState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkScalingState} instance allocated with {@link BufferUtils}. */
	public static NkScalingState create() {
		return new NkScalingState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkScalingState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkScalingState create(long address) {
		return address == NULL ? null : new NkScalingState(address, null);
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkScalingState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkScalingState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkScalingState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkScalingState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkScalingState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkScalingState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkScalingState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkScalingState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkScalingState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkScalingState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #start_size}. */
	public static NkVec2 nstart_size(long struct) { return NkVec2.create(struct + NkScalingState.START_SIZE); }
	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkScalingState.ACTIVE); }

	/** Unsafe version of {@link #start_size(NkVec2) start_size}. */
	public static void nstart_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkScalingState.START_SIZE, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkScalingState.ACTIVE, value); }

	// -----------------------------------

	/** An array of {@link NkScalingState} structs. */
	public static final class Buffer extends StructBuffer<NkScalingState, Buffer> {

		/**
		 * Creates a new {@link NkScalingState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkScalingState#SIZEOF}, and its mark will be undefined.
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
		protected NkScalingState newInstance(long address) {
			return new NkScalingState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkVec2} view of the {@code start_size} field. */
		public NkVec2 start_size() { return NkScalingState.nstart_size(address()); }
		/** Returns the value of the {@code active} field. */
		public int active() { return NkScalingState.nactive(address()); }

		/** Copies the specified {@link NkVec2} to the {@code start_size} field. */
		public NkScalingState.Buffer start_size(NkVec2 value) { NkScalingState.nstart_size(address(), value); return this; }
		/** Sets the specified value to the {@code active} field. */
		public NkScalingState.Buffer active(int value) { NkScalingState.nactive(address(), value); return this; }

	}

}