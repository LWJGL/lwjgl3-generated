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

/**
 * Accepted by the {@code host_ptr} argument of {@link CL10#clCreateBuffer}, {@link CL10#clCreateImage2D} and {@link CL10#clCreateImage3D}.
 * 
 * <h3>cl_mem_ext_host_ptr members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>allocation_type</td><td class="nw">cl_uint</td><td>type of external memory allocation. Legal values will be defined in layered extensions.</td></tr>
 * <tr><td>host_cache_policy</td><td class="nw">cl_uint</td><td>host cache policy for this external memory allocation</td></tr>
 * </table>
 */
public class CLMemEXTHostPtr extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

		ALLOCATION_TYPE = layout.offsetof(0);
		HOST_CACHE_POLICY = layout.offsetof(1);
	}

	CLMemEXTHostPtr(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLMemEXTHostPtr} instance at the specified memory address. */
	public CLMemEXTHostPtr(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLMemEXTHostPtr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLMemEXTHostPtr(ByteBuffer container) {
		this(memAddress(container), container);
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

	/** {@link ByteBuffer} version of {@link #set(CLMemEXTHostPtr) set}. */
	public CLMemEXTHostPtr set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLMemEXTHostPtr malloc() {
		return new CLMemEXTHostPtr(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLMemEXTHostPtr calloc() {
		return new CLMemEXTHostPtr(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLMemEXTHostPtr} instance allocated with {@link BufferUtils}. */
	public static CLMemEXTHostPtr create() {
		return new CLMemEXTHostPtr(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link CLMemEXTHostPtr.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

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
		protected CLMemEXTHostPtr newInstance(long address) {
			return new CLMemEXTHostPtr(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code allocation_type} field. */
		public int allocation_type() { return nallocation_type(address()); }
		/** Returns the value of the {@code host_cache_policy} field. */
		public int host_cache_policy() { return nhost_cache_policy(address()); }

		/** Sets the specified value to the {@code allocation_type} field. */
		public CLMemEXTHostPtr.Buffer allocation_type(int value) { nallocation_type(address(), value); return this; }
		/** Sets the specified value to the {@code host_cache_policy} field. */
		public CLMemEXTHostPtr.Buffer host_cache_policy(int value) { nhost_cache_policy(address(), value); return this; }

	}

}