/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines a property attribute. */
public class ObjCPropertyAttribute extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		VALUE;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		NAME = offsets.get(0);
		VALUE = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	ObjCPropertyAttribute(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link ObjCPropertyAttribute} instance at the specified memory address. */
	public ObjCPropertyAttribute(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link ObjCPropertyAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ObjCPropertyAttribute(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public ByteBuffer getNameBuffer() { return ngetNameBuffer(address()); }
	public String getNameString() { return ngetNameString(address()); }
	public ByteBuffer getValueBuffer() { return ngetValueBuffer(address()); }
	public String getValueString() { return ngetValueString(address()); }

	public ObjCPropertyAttribute setName(ByteBuffer name) { nsetName(address(), name); return this; }
	public ObjCPropertyAttribute setName(CharSequence name) { nsetName(address(), name); return this; }
	public ObjCPropertyAttribute setValue(ByteBuffer value) { nsetValue(address(), value); return this; }
	public ObjCPropertyAttribute setValue(CharSequence value) { nsetValue(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public ObjCPropertyAttribute set(
		ByteBuffer name,
		ByteBuffer value
	) {
		setName(name);
		setValue(value);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public ObjCPropertyAttribute nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public ObjCPropertyAttribute set(ObjCPropertyAttribute src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public ObjCPropertyAttribute set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static ObjCPropertyAttribute malloc() {
		return new ObjCPropertyAttribute(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static ObjCPropertyAttribute calloc() {
		return new ObjCPropertyAttribute(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link BufferUtils}. */
	public static ObjCPropertyAttribute create() {
		return new ObjCPropertyAttribute(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link ObjCPropertyAttribute.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static long ngetName(long struct) { return memGetAddress(struct + NAME); }
	public static ByteBuffer ngetNameBuffer(long struct) { return memByteBufferNT1(ngetName(struct)); }
	public static ByteBuffer getNameBuffer(ByteBuffer struct) { return ngetNameBuffer(memAddress(struct)); }
	public static String ngetNameString(long struct) { return memDecodeUTF8(ngetName(struct)); }
	public static String getNameString(ByteBuffer struct) { return ngetNameString(memAddress(struct)); }
	public static long ngetValue(long struct) { return memGetAddress(struct + VALUE); }
	public static ByteBuffer ngetValueBuffer(long struct) { return memByteBufferNT1(ngetValue(struct)); }
	public static ByteBuffer getValueBuffer(ByteBuffer struct) { return ngetValueBuffer(memAddress(struct)); }
	public static String ngetValueString(long struct) { return memDecodeUTF8(ngetValue(struct)); }
	public static String getValueString(ByteBuffer struct) { return ngetValueString(memAddress(struct)); }

	public static void nsetName(long struct, long name) { memPutAddress(struct + NAME, name); }
	public static void nsetName(long struct, ByteBuffer name) { if ( LWJGLUtil.CHECKS && name != null ) checkNT1(name); nsetName(struct, memAddressSafe(name)); }
	public static void setName(ByteBuffer struct, ByteBuffer name) { nsetName(memAddress(struct), name); }
	public static void nsetName(long struct, CharSequence name) { nsetName(struct, memEncodeUTF8(name, BufferAllocator.MALLOC)); }
	/** Encodes the specified {@link CharSequence} to a newly allocated buffer and sets its address to the {@code name} field. The allocated buffer must be explicitly freed. */
	public static void setName(ByteBuffer struct, CharSequence name) { nsetName(memAddress(struct), name); }
	public static void nsetValue(long struct, long value) { memPutAddress(struct + VALUE, value); }
	public static void nsetValue(long struct, ByteBuffer value) { if ( LWJGLUtil.CHECKS && value != null ) checkNT1(value); nsetValue(struct, memAddressSafe(value)); }
	public static void setValue(ByteBuffer struct, ByteBuffer value) { nsetValue(memAddress(struct), value); }
	public static void nsetValue(long struct, CharSequence value) { nsetValue(struct, memEncodeUTF8(value, BufferAllocator.MALLOC)); }
	/** Encodes the specified {@link CharSequence} to a newly allocated buffer and sets its address to the {@code value} field. The allocated buffer must be explicitly freed. */
	public static void setValue(ByteBuffer struct, CharSequence value) { nsetValue(memAddress(struct), value); }

	// -----------------------------------

	/** An array of {@link ObjCPropertyAttribute} structs. */
	public static final class Buffer extends StructBuffer<ObjCPropertyAttribute, Buffer> {

		/**
		 * Creates a new {@link ObjCPropertyAttribute.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ObjCPropertyAttribute#SIZEOF}, and its mark will be undefined.
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
		protected ObjCPropertyAttribute newInstance(long address) {
			return new ObjCPropertyAttribute(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public ByteBuffer getNameBuffer() { return ngetNameBuffer(address()); }
		public String getNameString() { return ngetNameString(address()); }
		public ByteBuffer getValueBuffer() { return ngetValueBuffer(address()); }
		public String getValueString() { return ngetValueString(address()); }

		public ObjCPropertyAttribute.Buffer setName(ByteBuffer name) { nsetName(address(), name); return this; }
		public ObjCPropertyAttribute.Buffer setName(CharSequence name) { nsetName(address(), name); return this; }
		public ObjCPropertyAttribute.Buffer setValue(ByteBuffer value) { nsetValue(address(), value); return this; }
		public ObjCPropertyAttribute.Buffer setValue(CharSequence value) { nsetValue(address(), value); return this; }

	}

}