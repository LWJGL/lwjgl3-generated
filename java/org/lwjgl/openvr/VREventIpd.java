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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Ipd_t {
    float ipdMeters;
}</code></pre>
 */
public class VREventIpd extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		IPDMETERS;

	static {
		Layout layout = __struct(
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		IPDMETERS = layout.offsetof(0);
	}

	VREventIpd(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventIpd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventIpd(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code ipdMeters} field. */
	public float ipdMeters() { return nipdMeters(address()); }

	/** Sets the specified value to the {@code ipdMeters} field. */
	public VREventIpd ipdMeters(float value) { nipdMeters(address(), value); return this; }

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventIpd set(VREventIpd src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventIpd} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventIpd malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventIpd} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventIpd calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventIpd} instance allocated with {@link BufferUtils}. */
	public static VREventIpd create() {
		return new VREventIpd(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventIpd} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventIpd create(long address) {
		return address == NULL ? null : new VREventIpd(address, null);
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventIpd.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventIpd} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventIpd mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventIpd} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventIpd callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventIpd} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventIpd mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventIpd} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventIpd callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventIpd.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #ipdMeters}. */
	public static float nipdMeters(long struct) { return memGetFloat(struct + VREventIpd.IPDMETERS); }

	/** Unsafe version of {@link #ipdMeters(float) ipdMeters}. */
	public static void nipdMeters(long struct, float value) { memPutFloat(struct + VREventIpd.IPDMETERS, value); }

	// -----------------------------------

	/** An array of {@link VREventIpd} structs. */
	public static class Buffer extends StructBuffer<VREventIpd, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventIpd.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventIpd#SIZEOF}, and its mark will be undefined.
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
		protected VREventIpd newInstance(long address) {
			return new VREventIpd(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code ipdMeters} field. */
		public float ipdMeters() { return VREventIpd.nipdMeters(address()); }

		/** Sets the specified value to the {@code ipdMeters} field. */
		public VREventIpd.Buffer ipdMeters(float value) { VREventIpd.nipdMeters(address(), value); return this; }

	}

}