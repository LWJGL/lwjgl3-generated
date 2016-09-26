/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT;

/**
 * Vertex declaration.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code stride} &ndash; vertex stride</li>
 * <li>{@code offset} &ndash; relative attribute offset from the vertex</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_vertex_decl_t {
    uint32_t hash;
    uint16_t stride;
    uint16_t offset[BGFX_ATTRIB_COUNT];
    uint16_t attributes[BGFX_ATTRIB_COUNT];
}</code></pre>
 */
public class BGFXVertexDecl extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HASH,
		STRIDE,
		OFFSET,
		ATTRIBUTES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(2),
			__array(2, BGFX_ATTRIB_COUNT),
			__array(2, BGFX_ATTRIB_COUNT)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HASH = layout.offsetof(0);
		STRIDE = layout.offsetof(1);
		OFFSET = layout.offsetof(2);
		ATTRIBUTES = layout.offsetof(3);
	}

	BGFXVertexDecl(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXVertexDecl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXVertexDecl(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code hash} field. */
	public int hash() { return nhash(address()); }
	/** Returns the value of the {@code stride} field. */
	public short stride() { return nstride(address()); }
	/** Returns a {@link ShortBuffer} view of the {@code offset} field. */
	public ShortBuffer offset() { return noffset(address()); }
	/** Returns the value at the specified index of the {@code offset} field. */
	public short offset(int index) { return noffset(address(), index); }
	/** Returns a {@link ShortBuffer} view of the {@code attributes} field. */
	public ShortBuffer attributes() { return nattributes(address()); }
	/** Returns the value at the specified index of the {@code attributes} field. */
	public short attributes(int index) { return nattributes(address(), index); }

	/** Sets the specified value to the {@code hash} field. */
	public BGFXVertexDecl hash(int value) { nhash(address(), value); return this; }
	/** Sets the specified value to the {@code stride} field. */
	public BGFXVertexDecl stride(short value) { nstride(address(), value); return this; }
	/** Copies the specified {@link ShortBuffer} to the {@code offset} field. */
	public BGFXVertexDecl offset(ShortBuffer value) { noffset(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code offset} field. */
	public BGFXVertexDecl offset(int index, short value) { noffset(address(), index, value); return this; }
	/** Copies the specified {@link ShortBuffer} to the {@code attributes} field. */
	public BGFXVertexDecl attributes(ShortBuffer value) { nattributes(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code attributes} field. */
	public BGFXVertexDecl attributes(int index, short value) { nattributes(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public BGFXVertexDecl set(
		int hash,
		short stride,
		ShortBuffer offset,
		ShortBuffer attributes
	) {
		hash(hash);
		stride(stride);
		offset(offset);
		attributes(attributes);

		return this;
	}

	/** Unsafe version of {@link #set(BGFXVertexDecl) set}. */
	public BGFXVertexDecl nset(long struct) {
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
	public BGFXVertexDecl set(BGFXVertexDecl src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link BGFXVertexDecl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXVertexDecl malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXVertexDecl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXVertexDecl calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXVertexDecl} instance allocated with {@link BufferUtils}. */
	public static BGFXVertexDecl create() {
		return new BGFXVertexDecl(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXVertexDecl} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXVertexDecl create(long address) {
		return address == NULL ? null : new BGFXVertexDecl(address, null);
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXVertexDecl.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXVertexDecl} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXVertexDecl mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXVertexDecl} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXVertexDecl callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXVertexDecl} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXVertexDecl mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXVertexDecl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXVertexDecl callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXVertexDecl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #hash}. */
	public static int nhash(long struct) { return memGetInt(struct + BGFXVertexDecl.HASH); }
	/** Unsafe version of {@link #stride}. */
	public static short nstride(long struct) { return memGetShort(struct + BGFXVertexDecl.STRIDE); }
	/** Unsafe version of {@link #offset}. */
	public static ShortBuffer noffset(long struct) {
		return memShortBuffer(struct + BGFXVertexDecl.OFFSET, BGFX_ATTRIB_COUNT);
	}
	/** Unsafe version of {@link #offset(int) offset}. */
	public static short noffset(long struct, int index) { return memGetShort(struct + BGFXVertexDecl.OFFSET + index * 2); }
	/** Unsafe version of {@link #attributes}. */
	public static ShortBuffer nattributes(long struct) {
		return memShortBuffer(struct + BGFXVertexDecl.ATTRIBUTES, BGFX_ATTRIB_COUNT);
	}
	/** Unsafe version of {@link #attributes(int) attributes}. */
	public static short nattributes(long struct, int index) { return memGetShort(struct + BGFXVertexDecl.ATTRIBUTES + index * 2); }

	/** Unsafe version of {@link #hash(int) hash}. */
	public static void nhash(long struct, int value) { memPutInt(struct + BGFXVertexDecl.HASH, value); }
	/** Unsafe version of {@link #stride(short) stride}. */
	public static void nstride(long struct, short value) { memPutShort(struct + BGFXVertexDecl.STRIDE, value); }
	/** Unsafe version of {@link #offset(ShortBuffer) offset}. */
	public static void noffset(long struct, ShortBuffer value) {
		if ( CHECKS ) checkBufferGT(value, BGFX_ATTRIB_COUNT);
		memCopy(memAddress(value), struct + BGFXVertexDecl.OFFSET, value.remaining() * 2);
	}
	/** Unsafe version of {@link #offset(int, short) offset}. */
	public static void noffset(long struct, int index, short value) { memPutShort(struct + BGFXVertexDecl.OFFSET + index * 2, value); }
	/** Unsafe version of {@link #attributes(ShortBuffer) attributes}. */
	public static void nattributes(long struct, ShortBuffer value) {
		if ( CHECKS ) checkBufferGT(value, BGFX_ATTRIB_COUNT);
		memCopy(memAddress(value), struct + BGFXVertexDecl.ATTRIBUTES, value.remaining() * 2);
	}
	/** Unsafe version of {@link #attributes(int, short) attributes}. */
	public static void nattributes(long struct, int index, short value) { memPutShort(struct + BGFXVertexDecl.ATTRIBUTES + index * 2, value); }

	// -----------------------------------

	/** An array of {@link BGFXVertexDecl} structs. */
	public static final class Buffer extends StructBuffer<BGFXVertexDecl, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXVertexDecl.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXVertexDecl#SIZEOF}, and its mark will be undefined.
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
		protected BGFXVertexDecl newInstance(long address) {
			return new BGFXVertexDecl(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code hash} field. */
		public int hash() { return BGFXVertexDecl.nhash(address()); }
		/** Returns the value of the {@code stride} field. */
		public short stride() { return BGFXVertexDecl.nstride(address()); }
		/** Returns a {@link ShortBuffer} view of the {@code offset} field. */
		public ShortBuffer offset() { return BGFXVertexDecl.noffset(address()); }
		/** Returns the value at the specified index of the {@code offset} field. */
		public short offset(int index) { return BGFXVertexDecl.noffset(address(), index); }
		/** Returns a {@link ShortBuffer} view of the {@code attributes} field. */
		public ShortBuffer attributes() { return BGFXVertexDecl.nattributes(address()); }
		/** Returns the value at the specified index of the {@code attributes} field. */
		public short attributes(int index) { return BGFXVertexDecl.nattributes(address(), index); }

		/** Sets the specified value to the {@code hash} field. */
		public BGFXVertexDecl.Buffer hash(int value) { BGFXVertexDecl.nhash(address(), value); return this; }
		/** Sets the specified value to the {@code stride} field. */
		public BGFXVertexDecl.Buffer stride(short value) { BGFXVertexDecl.nstride(address(), value); return this; }
		/** Copies the specified {@link ShortBuffer} to the {@code offset} field. */
		public BGFXVertexDecl.Buffer offset(ShortBuffer value) { BGFXVertexDecl.noffset(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code offset} field. */
		public BGFXVertexDecl.Buffer offset(int index, short value) { BGFXVertexDecl.noffset(address(), index, value); return this; }
		/** Copies the specified {@link ShortBuffer} to the {@code attributes} field. */
		public BGFXVertexDecl.Buffer attributes(ShortBuffer value) { BGFXVertexDecl.nattributes(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code attributes} field. */
		public BGFXVertexDecl.Buffer attributes(int index, short value) { BGFXVertexDecl.nattributes(address(), index, value); return this; }

	}

}