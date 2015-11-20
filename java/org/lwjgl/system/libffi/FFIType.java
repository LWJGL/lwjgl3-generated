/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains information about a libffi type.
 * 
 * <h3>ffi_type members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>size</td><td class="nw">size_t</td><td>set by libffi; you should initialize it to zero.</td></tr>
 * <tr><td>alignment</td><td class="nw">unsigned short</td><td>set by libffi; you should initialize it to zero.</td></tr>
 * <tr><td>type</td><td class="nw">unsigned short</td><td>for a structure, this should be set to {@link LibFFI#FFI_TYPE_STRUCT}.</td></tr>
 * <tr><td>elements</td><td class="nw">ffi_type *</td><td>a null-terminated array of pointers to {@code ffi_type} objects. There is one element per field of the struct.</td></tr>
 * </table>
 */
public class FFIType extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SIZE,
		ALIGNMENT,
		TYPE,
		ELEMENTS;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(2),
			__member(2),
			__member(Pointer.POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SIZE = layout.offsetof(0);
		ALIGNMENT = layout.offsetof(1);
		TYPE = layout.offsetof(2);
		ELEMENTS = layout.offsetof(3);
	}

	FFIType(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link FFIType} instance at the specified memory address. */
	public FFIType(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link FFIType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public FFIType(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code alignment} field. */
	public short alignment() { return nalignment(address()); }
	/** Returns the value of the {@code type} field. */
	public short type() { return ntype(address()); }
	/**
	 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code elements} field.
	 *
	 * @param capacity the number of elements in the returned {@link PointerBuffer}
	 */
	public PointerBuffer elements(int capacity) { return nelements(address(), capacity); }

	/** Sets the specified value to the {@code size} field. */
	public FFIType size(long value) { nsize(address(), value); return this; }
	/** Sets the specified value to the {@code alignment} field. */
	public FFIType alignment(short value) { nalignment(address(), value); return this; }
	/** Sets the specified value to the {@code type} field. */
	public FFIType type(short value) { ntype(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code elements} field. */
	public FFIType elements(PointerBuffer value) { nelements(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public FFIType set(
		long size,
		short alignment,
		short type,
		PointerBuffer elements
	) {
		size(size);
		alignment(alignment);
		type(type);
		elements(elements);

		return this;
	}

	/** Unsafe version of {@link #set(FFIType) set}. */
	public FFIType nset(long struct) {
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
	public FFIType set(FFIType src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(FFIType) set}. */
	public FFIType set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link FFIType} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static FFIType malloc() {
		return new FFIType(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link FFIType} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static FFIType calloc() {
		return new FFIType(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link FFIType} instance allocated with {@link BufferUtils}. */
	public static FFIType create() {
		return new FFIType(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link FFIType.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link FFIType.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + FFIType.SIZE); }
	/** Unsafe version of {@link #alignment}. */
	public static short nalignment(long struct) { return memGetShort(struct + FFIType.ALIGNMENT); }
	/** Unsafe version of {@link #type}. */
	public static short ntype(long struct) { return memGetShort(struct + FFIType.TYPE); }
	/** Unsafe version of {@link #elements(int) elements}. */
	public static PointerBuffer nelements(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + FFIType.ELEMENTS), capacity); }

	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + FFIType.SIZE, value); }
	/** Unsafe version of {@link #alignment(short) alignment}. */
	public static void nalignment(long struct, short value) { memPutShort(struct + FFIType.ALIGNMENT, value); }
	/** Unsafe version of {@link #type(short) type}. */
	public static void ntype(long struct, short value) { memPutShort(struct + FFIType.TYPE, value); }
	/** Unsafe version of {@link #elements(PointerBuffer) elements}. */
	public static void nelements(long struct, PointerBuffer value) { memPutAddress(struct + FFIType.ELEMENTS, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link FFIType} structs. */
	public static final class Buffer extends StructBuffer<FFIType, Buffer> {

		/**
		 * Creates a new {@link FFIType.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link FFIType#SIZEOF}, and its mark will be undefined.
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
		protected FFIType newInstance(long address) {
			return new FFIType(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code size} field. */
		public long size() { return nsize(address()); }
		/** Returns the value of the {@code alignment} field. */
		public short alignment() { return nalignment(address()); }
		/** Returns the value of the {@code type} field. */
		public short type() { return ntype(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code elements} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer elements(int capacity) { return nelements(address(), capacity); }

		/** Sets the specified value to the {@code size} field. */
		public FFIType.Buffer size(long value) { nsize(address(), value); return this; }
		/** Sets the specified value to the {@code alignment} field. */
		public FFIType.Buffer alignment(short value) { nalignment(address(), value); return this; }
		/** Sets the specified value to the {@code type} field. */
		public FFIType.Buffer type(short value) { ntype(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code elements} field. */
		public FFIType.Buffer elements(PointerBuffer value) { nelements(address(), value); return this; }

	}

}