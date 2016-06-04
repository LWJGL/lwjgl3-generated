/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Generic structure used for passing keys and data in and out of the database.
 * 
 * <p>Values returned from the database are valid only until a subsequent update operation, or the end of the transaction. Do not modify or free them, they
 * commonly point into the database itself.</p>
 * 
 * <p>Key sizes must be between 1 and {@link LMDB#mdb_env_get_maxkeysize env_get_maxkeysize} inclusive. The same applies to data sizes in databases with the {@link LMDB#MDB_DUPSORT DUPSORT} flag.
 * Other data items can in theory be from 0 to {@code 0xffffffff} bytes long.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mv_size} &ndash; Size of the data item.</li>
 * <li>{@code mv_data} &ndash; Address of the data item.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct MDB_val {
    size_t mv_size;
    void * mv_data;
}</code></pre>
 */
public class MDBVal extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MV_SIZE,
		MV_DATA;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MV_SIZE = layout.offsetof(0);
		MV_DATA = layout.offsetof(1);
	}

	MDBVal(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link MDBVal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public MDBVal(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mv_size} field. */
	public long mv_size() { return nmv_size(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code mv_data} field. */
	public ByteBuffer mv_data() { return nmv_data(address()); }

	/** Sets the specified value to the {@code mv_size} field. */
	public MDBVal mv_size(long value) { nmv_size(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code mv_data} field. */
	public MDBVal mv_data(ByteBuffer value) { nmv_data(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public MDBVal set(
		long mv_size,
		ByteBuffer mv_data
	) {
		mv_size(mv_size);
		mv_data(mv_data);

		return this;
	}

	/** Unsafe version of {@link #set(MDBVal) set}. */
	public MDBVal nset(long struct) {
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
	public MDBVal set(MDBVal src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link MDBVal} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static MDBVal malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link MDBVal} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static MDBVal calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link MDBVal} instance allocated with {@link BufferUtils}. */
	public static MDBVal create() {
		return new MDBVal(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link MDBVal} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static MDBVal create(long address) {
		return address == NULL ? null : new MDBVal(address, null);
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link MDBVal.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link MDBVal} instance allocated on the thread-local {@link MemoryStack}. */
	public static MDBVal mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link MDBVal} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static MDBVal callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link MDBVal} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MDBVal mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link MDBVal} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MDBVal callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBVal.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mv_size}. */
	public static long nmv_size(long struct) { return memGetAddress(struct + MDBVal.MV_SIZE); }
	/** Unsafe version of {@link #mv_data() mv_data}. */
	public static ByteBuffer nmv_data(long struct) { return memByteBuffer(memGetAddress(struct + MDBVal.MV_DATA), (int)nmv_size(struct)); }

	/** Sets the specified value to the {@code mv_size} field of the specified {@code struct}. */
	public static void nmv_size(long struct, long value) { memPutAddress(struct + MDBVal.MV_SIZE, value); }
	/** Unsafe version of {@link #mv_data(ByteBuffer) mv_data}. */
	public static void nmv_data(long struct, ByteBuffer value) { memPutAddress(struct + MDBVal.MV_DATA, memAddressSafe(value)); if ( value != null ) nmv_size(struct, value.remaining()); }

	// -----------------------------------

	/** An array of {@link MDBVal} structs. */
	public static final class Buffer extends StructBuffer<MDBVal, Buffer> {

		/**
		 * Creates a new {@link MDBVal.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link MDBVal#SIZEOF}, and its mark will be undefined.
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
		protected MDBVal newInstance(long address) {
			return new MDBVal(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mv_size} field. */
		public long mv_size() { return MDBVal.nmv_size(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code mv_data} field. */
		public ByteBuffer mv_data() { return MDBVal.nmv_data(address()); }

		/** Sets the specified value to the {@code mv_size} field. */
		public MDBVal.Buffer mv_size(long value) { MDBVal.nmv_size(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code mv_data} field. */
		public MDBVal.Buffer mv_data(ByteBuffer value) { MDBVal.nmv_data(address(), value); return this; }

	}

}