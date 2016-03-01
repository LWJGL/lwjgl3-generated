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

/**
 * Defines a property attribute.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct objc_property_attribute_t {
    char * name;
    char * value;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>name</td><td>the name of the attribute</td></tr>
 * <tr><td>value</td><td>the value of the attribute (usually empty)</td></tr>
 * </table>
 */
public class ObjCPropertyAttribute extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		NAME,
		VALUE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		NAME = layout.offsetof(0);
		VALUE = layout.offsetof(1);
	}

	ObjCPropertyAttribute(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link ObjCPropertyAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ObjCPropertyAttribute(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
	public ByteBuffer name() { return nname(address()); }
	/** Decodes the null-terminated string pointed to by the {@code name} field. */
	public String nameString() { return nnameString(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
	public ByteBuffer value() { return nvalue(address()); }
	/** Decodes the null-terminated string pointed to by the {@code value} field. */
	public String valueString() { return nvalueString(address()); }

	/** Sets the address of the specified encoded string to the {@code name} field. */
	public ObjCPropertyAttribute name(ByteBuffer value) { nname(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code name} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #nameFree}.</p>
	 */
	public ObjCPropertyAttribute name(CharSequence value) { nname(address(), value); return this; }
	/** Frees the string encoded by {@link #name(CharSequence)} and stored in the {@code name} field. */
	public ObjCPropertyAttribute nameFree() { nnameFree(address()); return this; }
	/** Sets the address of the specified encoded string to the {@code value} field. */
	public ObjCPropertyAttribute value(ByteBuffer value) { nvalue(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code value} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #valueFree}.</p>
	 */
	public ObjCPropertyAttribute value(CharSequence value) { nvalue(address(), value); return this; }
	/** Frees the string encoded by {@link #value(CharSequence)} and stored in the {@code value} field. */
	public ObjCPropertyAttribute valueFree() { nvalueFree(address()); return this; }

	/** Initializes this struct with the specified values. */
	public ObjCPropertyAttribute set(
		ByteBuffer name,
		ByteBuffer value
	) {
		name(name);
		value(value);

		return this;
	}

	/** Unsafe version of {@link #set(ObjCPropertyAttribute) set}. */
	public ObjCPropertyAttribute nset(long struct) {
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
	public ObjCPropertyAttribute set(ObjCPropertyAttribute src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static ObjCPropertyAttribute malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static ObjCPropertyAttribute calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ObjCPropertyAttribute} instance allocated with {@link BufferUtils}. */
	public static ObjCPropertyAttribute create() {
		return new ObjCPropertyAttribute(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link ObjCPropertyAttribute} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static ObjCPropertyAttribute create(long address) {
		return address == NULL ? null : new ObjCPropertyAttribute(address, null);
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link ObjCPropertyAttribute.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #name}. */
	public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCPropertyAttribute.NAME)); }
	/** Unsafe version of {@link #nameString}. */
	public static String nnameString(long struct) { return memDecodeUTF8(memGetAddress(struct + ObjCPropertyAttribute.NAME)); }
	/** Unsafe version of {@link #value}. */
	public static ByteBuffer nvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCPropertyAttribute.VALUE)); }
	/** Unsafe version of {@link #valueString}. */
	public static String nvalueString(long struct) { return memDecodeUTF8(memGetAddress(struct + ObjCPropertyAttribute.VALUE)); }

	/** Unsafe version of {@link #name(ByteBuffer) name}. */
	public static void nname(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + ObjCPropertyAttribute.NAME, memAddress(value));
	}
	/** Unsafe version of {@link #name(CharSequence) name}. */
	public static void nname(long struct, CharSequence value) { nname(struct, memEncodeUTF8(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #nameFree}. */
	public static void nnameFree(long struct) { nmemFree(memGetAddress(struct + ObjCPropertyAttribute.NAME)); }
	/** Unsafe version of {@link #value(ByteBuffer) value}. */
	public static void nvalue(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + ObjCPropertyAttribute.VALUE, memAddress(value));
	}
	/** Unsafe version of {@link #value(CharSequence) value}. */
	public static void nvalue(long struct, CharSequence value) { nvalue(struct, memEncodeUTF8(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #valueFree}. */
	public static void nvalueFree(long struct) { nmemFree(memGetAddress(struct + ObjCPropertyAttribute.VALUE)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + ObjCPropertyAttribute.NAME));
		checkPointer(memGetAddress(struct + ObjCPropertyAttribute.VALUE));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

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
		protected ObjCPropertyAttribute newInstance(long address) {
			return new ObjCPropertyAttribute(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
		public ByteBuffer name() { return ObjCPropertyAttribute.nname(address()); }
		/** Decodes the null-terminated string pointed to by the {@code name} field. */
		public String nameString() { return ObjCPropertyAttribute.nnameString(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
		public ByteBuffer value() { return ObjCPropertyAttribute.nvalue(address()); }
		/** Decodes the null-terminated string pointed to by the {@code value} field. */
		public String valueString() { return ObjCPropertyAttribute.nvalueString(address()); }

		/** Sets the address of the specified encoded string to the {@code name} field. */
		public ObjCPropertyAttribute.Buffer name(ByteBuffer value) { ObjCPropertyAttribute.nname(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code name} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #nameFree}.</p>
		 */
		public ObjCPropertyAttribute.Buffer name(CharSequence value) { ObjCPropertyAttribute.nname(address(), value); return this; }
		/** Frees the string encoded by {@link #name(CharSequence)} and stored in the {@code name} field. */
		public ObjCPropertyAttribute.Buffer nameFree() { ObjCPropertyAttribute.nnameFree(address()); return this; }
		/** Sets the address of the specified encoded string to the {@code value} field. */
		public ObjCPropertyAttribute.Buffer value(ByteBuffer value) { ObjCPropertyAttribute.nvalue(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code value} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #valueFree}.</p>
		 */
		public ObjCPropertyAttribute.Buffer value(CharSequence value) { ObjCPropertyAttribute.nvalue(address(), value); return this; }
		/** Frees the string encoded by {@link #value(CharSequence)} and stored in the {@code value} field. */
		public ObjCPropertyAttribute.Buffer valueFree() { ObjCPropertyAttribute.nvalueFree(address()); return this; }

	}

}