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
 * Platform data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ndt} &ndash; native display type</li>
 * <li>{@code nwh} &ndash; native window handle</li>
 * <li>{@code context} &ndash; GL context, or D3D device</li>
 * <li>{@code backBuffer} &ndash; GL backbuffer, or D3D render target view</li>
 * <li>{@code backBufferDS} &ndash; Backbuffer depth/stencil</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_platform_data_t {
    void * ndt;
    void * nwh;
    void * context;
    void * backBuffer;
    void * backBufferDS;
}</code></pre>
 */
public class BGFXPlatformData extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NDT,
		NWH,
		CONTEXT,
		BACKBUFFER,
		BACKBUFFERDS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NDT = layout.offsetof(0);
		NWH = layout.offsetof(1);
		CONTEXT = layout.offsetof(2);
		BACKBUFFER = layout.offsetof(3);
		BACKBUFFERDS = layout.offsetof(4);
	}

	BGFXPlatformData(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXPlatformData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXPlatformData(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code ndt} field. */
	public long ndt() { return nndt(address()); }
	/** Returns the value of the {@code nwh} field. */
	public long nwh() { return nnwh(address()); }
	/** Returns the value of the {@code context} field. */
	public long context() { return ncontext(address()); }
	/** Returns the value of the {@code backBuffer} field. */
	public long backBuffer() { return nbackBuffer(address()); }
	/** Returns the value of the {@code backBufferDS} field. */
	public long backBufferDS() { return nbackBufferDS(address()); }

	/** Sets the specified value to the {@code ndt} field. */
	public BGFXPlatformData ndt(long value) { nndt(address(), value); return this; }
	/** Sets the specified value to the {@code nwh} field. */
	public BGFXPlatformData nwh(long value) { nnwh(address(), value); return this; }
	/** Sets the specified value to the {@code context} field. */
	public BGFXPlatformData context(long value) { ncontext(address(), value); return this; }
	/** Sets the specified value to the {@code backBuffer} field. */
	public BGFXPlatformData backBuffer(long value) { nbackBuffer(address(), value); return this; }
	/** Sets the specified value to the {@code backBufferDS} field. */
	public BGFXPlatformData backBufferDS(long value) { nbackBufferDS(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public BGFXPlatformData set(
		long ndt,
		long nwh,
		long context,
		long backBuffer,
		long backBufferDS
	) {
		ndt(ndt);
		nwh(nwh);
		context(context);
		backBuffer(backBuffer);
		backBufferDS(backBufferDS);

		return this;
	}

	/** Unsafe version of {@link #set(BGFXPlatformData) set}. */
	public BGFXPlatformData nset(long struct) {
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
	public BGFXPlatformData set(BGFXPlatformData src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link BGFXPlatformData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static BGFXPlatformData malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link BGFXPlatformData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static BGFXPlatformData calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link BGFXPlatformData} instance allocated with {@link BufferUtils}. */
	public static BGFXPlatformData create() {
		return new BGFXPlatformData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link BGFXPlatformData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXPlatformData create(long address) {
		return address == NULL ? null : new BGFXPlatformData(address, null);
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link BGFXPlatformData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link BGFXPlatformData} instance allocated on the thread-local {@link MemoryStack}. */
	public static BGFXPlatformData mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link BGFXPlatformData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static BGFXPlatformData callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link BGFXPlatformData} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXPlatformData mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXPlatformData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static BGFXPlatformData callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link BGFXPlatformData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #ndt}. */
	public static long nndt(long struct) { return memGetAddress(struct + BGFXPlatformData.NDT); }
	/** Unsafe version of {@link #nwh}. */
	public static long nnwh(long struct) { return memGetAddress(struct + BGFXPlatformData.NWH); }
	/** Unsafe version of {@link #context}. */
	public static long ncontext(long struct) { return memGetAddress(struct + BGFXPlatformData.CONTEXT); }
	/** Unsafe version of {@link #backBuffer}. */
	public static long nbackBuffer(long struct) { return memGetAddress(struct + BGFXPlatformData.BACKBUFFER); }
	/** Unsafe version of {@link #backBufferDS}. */
	public static long nbackBufferDS(long struct) { return memGetAddress(struct + BGFXPlatformData.BACKBUFFERDS); }

	/** Unsafe version of {@link #ndt(long) ndt}. */
	public static void nndt(long struct, long value) { memPutAddress(struct + BGFXPlatformData.NDT, value); }
	/** Unsafe version of {@link #nwh(long) nwh}. */
	public static void nnwh(long struct, long value) { memPutAddress(struct + BGFXPlatformData.NWH, value); }
	/** Unsafe version of {@link #context(long) context}. */
	public static void ncontext(long struct, long value) { memPutAddress(struct + BGFXPlatformData.CONTEXT, value); }
	/** Unsafe version of {@link #backBuffer(long) backBuffer}. */
	public static void nbackBuffer(long struct, long value) { memPutAddress(struct + BGFXPlatformData.BACKBUFFER, value); }
	/** Unsafe version of {@link #backBufferDS(long) backBufferDS}. */
	public static void nbackBufferDS(long struct, long value) { memPutAddress(struct + BGFXPlatformData.BACKBUFFERDS, value); }

	// -----------------------------------

	/** An array of {@link BGFXPlatformData} structs. */
	public static class Buffer extends StructBuffer<BGFXPlatformData, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link BGFXPlatformData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXPlatformData#SIZEOF}, and its mark will be undefined.
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
		protected BGFXPlatformData newInstance(long address) {
			return new BGFXPlatformData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code ndt} field. */
		public long ndt() { return BGFXPlatformData.nndt(address()); }
		/** Returns the value of the {@code nwh} field. */
		public long nwh() { return BGFXPlatformData.nnwh(address()); }
		/** Returns the value of the {@code context} field. */
		public long context() { return BGFXPlatformData.ncontext(address()); }
		/** Returns the value of the {@code backBuffer} field. */
		public long backBuffer() { return BGFXPlatformData.nbackBuffer(address()); }
		/** Returns the value of the {@code backBufferDS} field. */
		public long backBufferDS() { return BGFXPlatformData.nbackBufferDS(address()); }

		/** Sets the specified value to the {@code ndt} field. */
		public BGFXPlatformData.Buffer ndt(long value) { BGFXPlatformData.nndt(address(), value); return this; }
		/** Sets the specified value to the {@code nwh} field. */
		public BGFXPlatformData.Buffer nwh(long value) { BGFXPlatformData.nnwh(address(), value); return this; }
		/** Sets the specified value to the {@code context} field. */
		public BGFXPlatformData.Buffer context(long value) { BGFXPlatformData.ncontext(address(), value); return this; }
		/** Sets the specified value to the {@code backBuffer} field. */
		public BGFXPlatformData.Buffer backBuffer(long value) { BGFXPlatformData.nbackBuffer(address(), value); return this; }
		/** Sets the specified value to the {@code backBufferDS} field. */
		public BGFXPlatformData.Buffer backBufferDS(long value) { BGFXPlatformData.nbackBufferDS(address(), value); return this; }

	}

}