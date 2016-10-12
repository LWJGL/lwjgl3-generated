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

/**
 * Instance data buffer info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code data} &ndash; pointer to data</li>
 * <li>{@code size} &ndash; data size</li>
 * <li>{@code offset} &ndash; offset in vertex buffer</li>
 * <li>{@code num} &ndash; number of instances</li>
 * <li>{@code stride} &ndash; vertex stride</li>
 * <li>{@code handle} &ndash; vertex buffer object handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_instance_data_buffer_t {
    uint8_t * data;
    uint32_t size;
    uint32_t offset;
    uint32_t num;
    uint16_t stride;
    bgfx_vertex_buffer_handle_t handle;
}</code></pre>
 */
public class BGFXInstanceDataBuffer extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DATA,
		SIZE,
		OFFSET,
		NUM,
		STRIDE,
		HANDLE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(2),
			__member(2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DATA = layout.offsetof(0);
		SIZE = layout.offsetof(1);
		OFFSET = layout.offsetof(2);
		NUM = layout.offsetof(3);
		STRIDE = layout.offsetof(4);
		HANDLE = layout.offsetof(5);
	}

	BGFXInstanceDataBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXInstanceDataBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXInstanceDataBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
	public ByteBuffer data() { return ndata(address()); }
	/** Returns the value of the {@code size} field. */
	public int size() { return nsize(address()); }
	/** Returns the value of the {@code offset} field. */
	public int offset() { return noffset(address()); }
	/** Returns the value of the {@code num} field. */
	public int num() { return nnum(address()); }
	/** Returns the value of the {@code stride} field. */
	public short stride() { return nstride(address()); }
	/** Returns the value of the {@code handle} field. */
	public short handle() { return nhandle(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
	public BGFXInstanceDataBuffer data(ByteBuffer value) { ndata(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public BGFXInstanceDataBuffer offset(int value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code num} field. */
	public BGFXInstanceDataBuffer num(int value) { nnum(address(), value); return this; }
	/** Sets the specified value to the {@code stride} field. */
	public BGFXInstanceDataBuffer stride(short value) { nstride(address(), value); return this; }
	/** Sets the specified value to the {@code handle} field. */
	public BGFXInstanceDataBuffer handle(short value) { nhandle(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public BGFXInstanceDataBuffer set(
		ByteBuffer data,
		int offset,
		int num,
		short stride,
		short handle
	) {
		data(data);
		offset(offset);
		num(num);
		stride(stride);
		handle(handle);

		return this;
	}

	/** Unsafe version of {@link #set(BGFXInstanceDataBuffer) set}. */
	public BGFXInstanceDataBuffer nset(long struct) {
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
	public BGFXInstanceDataBuffer set(BGFXInstanceDataBuffer src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link BGFXInstanceDataBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXInstanceDataBuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXInstanceDataBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXInstanceDataBuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXInstanceDataBuffer} instance allocated with {@link BufferUtils}. */
	public static BGFXInstanceDataBuffer create() {
		return new BGFXInstanceDataBuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXInstanceDataBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXInstanceDataBuffer create(long address) {
		return address == NULL ? null : new BGFXInstanceDataBuffer(address, null);
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXInstanceDataBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXInstanceDataBuffer} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXInstanceDataBuffer mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXInstanceDataBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXInstanceDataBuffer callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXInstanceDataBuffer mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXInstanceDataBuffer callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #data() data}. */
	public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXInstanceDataBuffer.DATA), nsize(struct)); }
	/** Unsafe version of {@link #size}. */
	public static int nsize(long struct) { return memGetInt(struct + BGFXInstanceDataBuffer.SIZE); }
	/** Unsafe version of {@link #offset}. */
	public static int noffset(long struct) { return memGetInt(struct + BGFXInstanceDataBuffer.OFFSET); }
	/** Unsafe version of {@link #num}. */
	public static int nnum(long struct) { return memGetInt(struct + BGFXInstanceDataBuffer.NUM); }
	/** Unsafe version of {@link #stride}. */
	public static short nstride(long struct) { return memGetShort(struct + BGFXInstanceDataBuffer.STRIDE); }
	/** Unsafe version of {@link #handle}. */
	public static short nhandle(long struct) { return memGetShort(struct + BGFXInstanceDataBuffer.HANDLE); }

	/** Unsafe version of {@link #data(ByteBuffer) data}. */
	public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXInstanceDataBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
	/** Sets the specified value to the {@code size} field of the specified {@code struct}. */
	public static void nsize(long struct, int value) { memPutInt(struct + BGFXInstanceDataBuffer.SIZE, value); }
	/** Unsafe version of {@link #offset(int) offset}. */
	public static void noffset(long struct, int value) { memPutInt(struct + BGFXInstanceDataBuffer.OFFSET, value); }
	/** Unsafe version of {@link #num(int) num}. */
	public static void nnum(long struct, int value) { memPutInt(struct + BGFXInstanceDataBuffer.NUM, value); }
	/** Unsafe version of {@link #stride(short) stride}. */
	public static void nstride(long struct, short value) { memPutShort(struct + BGFXInstanceDataBuffer.STRIDE, value); }
	/** Unsafe version of {@link #handle(short) handle}. */
	public static void nhandle(long struct, short value) { memPutShort(struct + BGFXInstanceDataBuffer.HANDLE, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + BGFXInstanceDataBuffer.DATA));
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

	/** An array of {@link BGFXInstanceDataBuffer} structs. */
	public static class Buffer extends StructBuffer<BGFXInstanceDataBuffer, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXInstanceDataBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXInstanceDataBuffer#SIZEOF}, and its mark will be undefined.
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
		protected BGFXInstanceDataBuffer newInstance(long address) {
			return new BGFXInstanceDataBuffer(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
		public ByteBuffer data() { return BGFXInstanceDataBuffer.ndata(address()); }
		/** Returns the value of the {@code size} field. */
		public int size() { return BGFXInstanceDataBuffer.nsize(address()); }
		/** Returns the value of the {@code offset} field. */
		public int offset() { return BGFXInstanceDataBuffer.noffset(address()); }
		/** Returns the value of the {@code num} field. */
		public int num() { return BGFXInstanceDataBuffer.nnum(address()); }
		/** Returns the value of the {@code stride} field. */
		public short stride() { return BGFXInstanceDataBuffer.nstride(address()); }
		/** Returns the value of the {@code handle} field. */
		public short handle() { return BGFXInstanceDataBuffer.nhandle(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
		public BGFXInstanceDataBuffer.Buffer data(ByteBuffer value) { BGFXInstanceDataBuffer.ndata(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public BGFXInstanceDataBuffer.Buffer offset(int value) { BGFXInstanceDataBuffer.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code num} field. */
		public BGFXInstanceDataBuffer.Buffer num(int value) { BGFXInstanceDataBuffer.nnum(address(), value); return this; }
		/** Sets the specified value to the {@code stride} field. */
		public BGFXInstanceDataBuffer.Buffer stride(short value) { BGFXInstanceDataBuffer.nstride(address(), value); return this; }
		/** Sets the specified value to the {@code handle} field. */
		public BGFXInstanceDataBuffer.Buffer handle(short value) { BGFXInstanceDataBuffer.nhandle(address(), value); return this; }

	}

}