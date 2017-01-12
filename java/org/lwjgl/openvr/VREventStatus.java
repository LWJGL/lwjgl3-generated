/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used for a few events about overlays.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Status_t {
    uint32_t statusState;
}</code></pre>
 */
public class VREventStatus extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STATUSSTATE;

	static {
		Layout layout = __struct(
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STATUSSTATE = layout.offsetof(0);
	}

	VREventStatus(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventStatus(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code statusState} field. */
	public int statusState() { return nstatusState(address()); }

	/** Sets the specified value to the {@code statusState} field. */
	public VREventStatus statusState(int value) { nstatusState(address(), value); return this; }

	/** Unsafe version of {@link #set(VREventStatus) set}. */
	public VREventStatus nset(long struct) {
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
	public VREventStatus set(VREventStatus src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VREventStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventStatus malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventStatus calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventStatus} instance allocated with {@link BufferUtils}. */
	public static VREventStatus create() {
		return new VREventStatus(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventStatus} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventStatus create(long address) {
		return address == NULL ? null : new VREventStatus(address, null);
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventStatus.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventStatus} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventStatus mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventStatus} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventStatus callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventStatus} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventStatus mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventStatus callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #statusState}. */
	public static int nstatusState(long struct) { return memGetInt(struct + VREventStatus.STATUSSTATE); }

	/** Unsafe version of {@link #statusState(int) statusState}. */
	public static void nstatusState(long struct, int value) { memPutInt(struct + VREventStatus.STATUSSTATE, value); }

	// -----------------------------------

	/** An array of {@link VREventStatus} structs. */
	public static class Buffer extends StructBuffer<VREventStatus, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventStatus.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventStatus#SIZEOF}, and its mark will be undefined.
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
		protected VREventStatus newInstance(long address) {
			return new VREventStatus(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code statusState} field. */
		public int statusState() { return VREventStatus.nstatusState(address()); }

		/** Sets the specified value to the {@code statusState} field. */
		public VREventStatus.Buffer statusState(int value) { VREventStatus.nstatusState(address(), value); return this; }

	}

}