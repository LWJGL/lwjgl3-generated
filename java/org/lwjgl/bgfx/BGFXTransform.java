/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Transform data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code data} &ndash; pointer to first matrix</li>
 * <li>{@code num} &ndash; number of matrices</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_transform_t {
    float * data;
    uint16_t num;
}</code></pre>
 */
public class BGFXTransform extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DATA,
		NUM;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DATA = layout.offsetof(0);
		NUM = layout.offsetof(1);
	}

	BGFXTransform(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXTransform(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link FloatBuffer} view of the data pointed to by the {@code data} field. */
	public FloatBuffer data() { return ndata(address()); }
	/** Returns the value of the {@code num} field. */
	public short num() { return nnum(address()); }

	// -----------------------------------

	/** Returns a new {@link BGFXTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXTransform malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXTransform calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXTransform} instance allocated with {@link BufferUtils}. */
	public static BGFXTransform create() {
		return new BGFXTransform(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXTransform} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXTransform create(long address) {
		return address == NULL ? null : new BGFXTransform(address, null);
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXTransform.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXTransform} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXTransform mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXTransform} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXTransform callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXTransform} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXTransform mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXTransform callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #data() data}. */
	public static FloatBuffer ndata(long struct) { return memFloatBuffer(memGetAddress(struct + BGFXTransform.DATA), (Short.toUnsignedInt(nnum(struct)) << 4)); }
	/** Unsafe version of {@link #num}. */
	public static short nnum(long struct) { return memGetShort(struct + BGFXTransform.NUM); }

	// -----------------------------------

	/** An array of {@link BGFXTransform} structs. */
	public static final class Buffer extends StructBuffer<BGFXTransform, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXTransform.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXTransform#SIZEOF}, and its mark will be undefined.
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
		protected BGFXTransform newInstance(long address) {
			return new BGFXTransform(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link FloatBuffer} view of the data pointed to by the {@code data} field. */
		public FloatBuffer data() { return BGFXTransform.ndata(address()); }
		/** Returns the value of the {@code num} field. */
		public short num() { return BGFXTransform.nnum(address()); }

	}

}