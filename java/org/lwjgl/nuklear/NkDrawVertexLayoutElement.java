/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code attribute} &ndash; the vertex attribute. One of:<br><table><tr><td>{@link Nuklear#NK_VERTEX_ATTRIBUTE_COUNT VERTEX_ATTRIBUTE_COUNT}</td><td>{@link Nuklear#NK_VERTEX_COLOR VERTEX_COLOR}</td><td>{@link Nuklear#NK_VERTEX_POSITION VERTEX_POSITION}</td><td>{@link Nuklear#NK_VERTEX_TEXCOORD VERTEX_TEXCOORD}</td></tr></table></li>
 * <li>{@code format} &ndash; the vertex attribute format. One of:<br><table><tr><td>{@link Nuklear#NK_FORMAT_COUNT FORMAT_COUNT}</td><td>{@link Nuklear#NK_FORMAT_DOUBLE FORMAT_DOUBLE}</td><td>{@link Nuklear#NK_FORMAT_FLOAT FORMAT_FLOAT}</td><td>{@link Nuklear#NK_FORMAT_R16G15B16 FORMAT_R16G15B16}</td><td>{@link Nuklear#NK_FORMAT_R16G15B16A16 FORMAT_R16G15B16A16}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_R32G32B32 FORMAT_R32G32B32}</td><td>{@link Nuklear#NK_FORMAT_R32G32B32A32 FORMAT_R32G32B32A32}</td><td>{@link Nuklear#NK_FORMAT_R32G32B32A32_DOUBLE FORMAT_R32G32B32A32_DOUBLE}</td><td>{@link Nuklear#NK_FORMAT_R32G32B32A32_FLOAT FORMAT_R32G32B32A32_FLOAT}</td><td>{@link Nuklear#NK_FORMAT_R8G8B8 FORMAT_R8G8B8}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_R8G8B8A8 FORMAT_R8G8B8A8}</td><td>{@link Nuklear#NK_FORMAT_RGB32 FORMAT_RGB32}</td><td>{@link Nuklear#NK_FORMAT_RGBA32 FORMAT_RGBA32}</td><td>{@link Nuklear#NK_FORMAT_SCHAR FORMAT_SCHAR}</td><td>{@link Nuklear#NK_FORMAT_SINT FORMAT_SINT}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_SSHORT FORMAT_SSHORT}</td><td>{@link Nuklear#NK_FORMAT_UCHAR FORMAT_UCHAR}</td><td>{@link Nuklear#NK_FORMAT_UINT FORMAT_UINT}</td><td>{@link Nuklear#NK_FORMAT_USHORT FORMAT_USHORT}</td></tr></table></li>
 * <li>{@code offset} &ndash; the vertex attribute offset</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_draw_vertex_layout_element {
    nk_draw_vertex_layout_attribute attribute;
    nk_draw_vertex_layout_format format;
    nk_size offset;
}</code></pre>
 */
public class NkDrawVertexLayoutElement extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ATTRIBUTE,
		FORMAT,
		OFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ATTRIBUTE = layout.offsetof(0);
		FORMAT = layout.offsetof(1);
		OFFSET = layout.offsetof(2);
	}

	NkDrawVertexLayoutElement(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkDrawVertexLayoutElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkDrawVertexLayoutElement(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code attribute} field. */
	public int attribute() { return nattribute(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }

	/** Sets the specified value to the {@code attribute} field. */
	public NkDrawVertexLayoutElement attribute(int value) { nattribute(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public NkDrawVertexLayoutElement format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public NkDrawVertexLayoutElement offset(long value) { noffset(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkDrawVertexLayoutElement set(
		int attribute,
		int format,
		long offset
	) {
		attribute(attribute);
		format(format);
		offset(offset);

		return this;
	}

	/** Unsafe version of {@link #set(NkDrawVertexLayoutElement) set}. */
	public NkDrawVertexLayoutElement nset(long struct) {
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
	public NkDrawVertexLayoutElement set(NkDrawVertexLayoutElement src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawVertexLayoutElement} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkDrawVertexLayoutElement malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkDrawVertexLayoutElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkDrawVertexLayoutElement calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkDrawVertexLayoutElement} instance allocated with {@link BufferUtils}. */
	public static NkDrawVertexLayoutElement create() {
		return new NkDrawVertexLayoutElement(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkDrawVertexLayoutElement} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawVertexLayoutElement create(long address) {
		return address == NULL ? null : new NkDrawVertexLayoutElement(address, null);
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkDrawVertexLayoutElement.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawVertexLayoutElement} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkDrawVertexLayoutElement mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkDrawVertexLayoutElement} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkDrawVertexLayoutElement callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawVertexLayoutElement mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawVertexLayoutElement callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #attribute}. */
	public static int nattribute(long struct) { return memGetInt(struct + NkDrawVertexLayoutElement.ATTRIBUTE); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + NkDrawVertexLayoutElement.FORMAT); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetAddress(struct + NkDrawVertexLayoutElement.OFFSET); }

	/** Unsafe version of {@link #attribute(int) attribute}. */
	public static void nattribute(long struct, int value) { memPutInt(struct + NkDrawVertexLayoutElement.ATTRIBUTE, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + NkDrawVertexLayoutElement.FORMAT, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutAddress(struct + NkDrawVertexLayoutElement.OFFSET, value); }

	// -----------------------------------

	/** An array of {@link NkDrawVertexLayoutElement} structs. */
	public static class Buffer extends StructBuffer<NkDrawVertexLayoutElement, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkDrawVertexLayoutElement.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkDrawVertexLayoutElement#SIZEOF}, and its mark will be undefined.
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
		protected NkDrawVertexLayoutElement newInstance(long address) {
			return new NkDrawVertexLayoutElement(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code attribute} field. */
		public int attribute() { return NkDrawVertexLayoutElement.nattribute(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return NkDrawVertexLayoutElement.nformat(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return NkDrawVertexLayoutElement.noffset(address()); }

		/** Sets the specified value to the {@code attribute} field. */
		public NkDrawVertexLayoutElement.Buffer attribute(int value) { NkDrawVertexLayoutElement.nattribute(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public NkDrawVertexLayoutElement.Buffer format(int value) { NkDrawVertexLayoutElement.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public NkDrawVertexLayoutElement.Buffer offset(long value) { NkDrawVertexLayoutElement.noffset(address(), value); return this; }

	}

}