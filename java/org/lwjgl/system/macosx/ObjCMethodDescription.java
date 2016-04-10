/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines a method.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name} &ndash; the name of the method at runtime</li>
 * <li>{@code types} &ndash; the types of the method arguments</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct objc_method_description {
    SEL name;
    char * types;
}</code></pre>
 */
public class ObjCMethodDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		TYPES;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NAME = layout.offsetof(0);
		TYPES = layout.offsetof(1);
	}

	ObjCMethodDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link ObjCMethodDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ObjCMethodDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code name} field. */
	public long name() { return nname(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code types} field. */
	public ByteBuffer types() { return ntypes(address()); }
	/** Decodes the null-terminated string pointed to by the {@code types} field. */
	public String typesString() { return ntypesString(address()); }

	// -----------------------------------

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static ObjCMethodDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static ObjCMethodDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ObjCMethodDescription} instance allocated with {@link BufferUtils}. */
	public static ObjCMethodDescription create() {
		return new ObjCMethodDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link ObjCMethodDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static ObjCMethodDescription create(long address) {
		return address == NULL ? null : new ObjCMethodDescription(address, null);
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link ObjCMethodDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link ObjCMethodDescription} instance allocated on the thread-local {@link MemoryStack}. */
	public static ObjCMethodDescription mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link ObjCMethodDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static ObjCMethodDescription callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link ObjCMethodDescription} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static ObjCMethodDescription mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCMethodDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static ObjCMethodDescription callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #name}. */
	public static long nname(long struct) { return memGetAddress(struct + ObjCMethodDescription.NAME); }
	/** Unsafe version of {@link #types}. */
	public static ByteBuffer ntypes(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCMethodDescription.TYPES)); }
	/** Unsafe version of {@link #typesString}. */
	public static String ntypesString(long struct) { return memUTF8(memGetAddress(struct + ObjCMethodDescription.TYPES)); }

	// -----------------------------------

	/** An array of {@link ObjCMethodDescription} structs. */
	public static final class Buffer extends StructBuffer<ObjCMethodDescription, Buffer> {

		/**
		 * Creates a new {@link ObjCMethodDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ObjCMethodDescription#SIZEOF}, and its mark will be undefined.
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
		protected ObjCMethodDescription newInstance(long address) {
			return new ObjCMethodDescription(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code name} field. */
		public long name() { return ObjCMethodDescription.nname(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code types} field. */
		public ByteBuffer types() { return ObjCMethodDescription.ntypes(address()); }
		/** Decodes the null-terminated string pointed to by the {@code types} field. */
		public String typesString() { return ObjCMethodDescription.ntypesString(address()); }

	}

}