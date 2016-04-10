/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Accepted by the {@code host_ptr} argument of {@link CL10#clCreateBuffer}, {@link CL10#clCreateImage2D} and {@link CL10#clCreateImage3D}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code allocation_type} &ndash; type of external memory allocation. Legal values will be defined in layered extensions.</li>
 * <li>{@code host_cache_policy} &ndash; host cache policy for this external memory allocation</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct cl_mem_ext_host_ptr {
    cl_uint allocation_type;
    cl_uint host_cache_policy;
}</code></pre>
 */
public class CLMemEXTHostPtr extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ALLOCATION_TYPE,
		HOST_CACHE_POLICY;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ALLOCATION_TYPE = layout.offsetof(0);
		HOST_CACHE_POLICY = layout.offsetof(1);
	}

	CLMemEXTHostPtr(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link CLMemEXTHostPtr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLMemEXTHostPtr(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code allocation_type} field. */
	public int allocation_type() { return nallocation_type(address()); }
	/** Returns the value of the {@code host_cache_policy} field. */
	public int host_cache_policy() { return nhost_cache_policy(address()); }

	/** Sets the specified value to the {@code allocation_type} field. */
	public CLMemEXTHostPtr allocation_type(int value) { nallocation_type(address(), value); return this; }
	/** Sets the specified value to the {@code host_cache_policy} field. */
	public CLMemEXTHostPtr host_cache_policy(int value) { nhost_cache_policy(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CLMemEXTHostPtr set(
		int allocation_type,
		int host_cache_policy
	) {
		allocation_type(allocation_type);
		host_cache_policy(host_cache_policy);

		return this;
	}

	/** Unsafe version of {@link #set(CLMemEXTHostPtr) set}. */
	public CLMemEXTHostPtr nset(long struct) {
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
	public CLMemEXTHostPtr set(CLMemEXTHostPtr src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static CLMemEXTHostPtr malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static CLMemEXTHostPtr calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link BufferUtils}. */
	public static CLMemEXTHostPtr create() {
		return new CLMemEXTHostPtr(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static CLMemEXTHostPtr create(long address) {
		return address == NULL ? null : new CLMemEXTHostPtr(address, null);
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link CLMemEXTHostPtr.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated on the thread-local {@link MemoryStack}. */
	public static CLMemEXTHostPtr mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static CLMemEXTHostPtr callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLMemEXTHostPtr mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLMemEXTHostPtr callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #allocation_type}. */
	public static int nallocation_type(long struct) { return memGetInt(struct + CLMemEXTHostPtr.ALLOCATION_TYPE); }
	/** Unsafe version of {@link #host_cache_policy}. */
	public static int nhost_cache_policy(long struct) { return memGetInt(struct + CLMemEXTHostPtr.HOST_CACHE_POLICY); }

	/** Unsafe version of {@link #allocation_type(int) allocation_type}. */
	public static void nallocation_type(long struct, int value) { memPutInt(struct + CLMemEXTHostPtr.ALLOCATION_TYPE, value); }
	/** Unsafe version of {@link #host_cache_policy(int) host_cache_policy}. */
	public static void nhost_cache_policy(long struct, int value) { memPutInt(struct + CLMemEXTHostPtr.HOST_CACHE_POLICY, value); }

	// -----------------------------------

	/** An array of {@link CLMemEXTHostPtr} structs. */
	public static final class Buffer extends StructBuffer<CLMemEXTHostPtr, Buffer> {

		/**
		 * Creates a new {@link CLMemEXTHostPtr.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLMemEXTHostPtr#SIZEOF}, and its mark will be undefined.
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
		protected CLMemEXTHostPtr newInstance(long address) {
			return new CLMemEXTHostPtr(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code allocation_type} field. */
		public int allocation_type() { return CLMemEXTHostPtr.nallocation_type(address()); }
		/** Returns the value of the {@code host_cache_policy} field. */
		public int host_cache_policy() { return CLMemEXTHostPtr.nhost_cache_policy(address()); }

		/** Sets the specified value to the {@code allocation_type} field. */
		public CLMemEXTHostPtr.Buffer allocation_type(int value) { CLMemEXTHostPtr.nallocation_type(address(), value); return this; }
		/** Sets the specified value to the {@code host_cache_policy} field. */
		public CLMemEXTHostPtr.Buffer host_cache_policy(int value) { CLMemEXTHostPtr.nhost_cache_policy(address(), value); return this; }

	}

}