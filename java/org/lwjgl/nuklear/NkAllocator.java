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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_allocator {
    {@link NkHandle nk_handle} userdata;
    nk_plugin_alloc alloc;
    nk_plugin_free mfree;
}</code></pre>
 */
public class NkAllocator extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		USERDATA,
		ALLOC,
		MFREE;

	static {
		Layout layout = __struct(
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		USERDATA = layout.offsetof(0);
		ALLOC = layout.offsetof(1);
		MFREE = layout.offsetof(2);
	}

	NkAllocator(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkAllocator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkAllocator(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns the {@code NkPluginAlloc} instance at the {@code alloc} field. */
	public NkPluginAlloc alloc() { return NkPluginAlloc.create(nalloc(address())); }
	/** Returns the {@code NkPluginFree} instance at the {@code mfree} field. */
	public NkPluginFree mfree() { return NkPluginFree.create(nmfree(address())); }

	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkAllocator userdata(NkHandle value) { nuserdata(address(), value); return this; }
	/** Sets the address of the specified {@link NkPluginAllocI} to the {@code alloc} field. */
	public NkAllocator alloc(NkPluginAllocI value) { nalloc(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link NkPluginFreeI} to the {@code mfree} field. */
	public NkAllocator mfree(NkPluginFreeI value) { nmfree(address(), addressSafe(value)); return this; }

	/** Unsafe version of {@link #set(NkAllocator) set}. */
	public NkAllocator nset(long struct) {
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
	public NkAllocator set(NkAllocator src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkAllocator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkAllocator malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkAllocator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkAllocator calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkAllocator} instance allocated with {@link BufferUtils}. */
	public static NkAllocator create() {
		return new NkAllocator(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkAllocator} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkAllocator create(long address) {
		return address == NULL ? null : new NkAllocator(address, null);
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkAllocator.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkAllocator} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkAllocator mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkAllocator} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkAllocator callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkAllocator} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkAllocator mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkAllocator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkAllocator callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkAllocator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkAllocator.USERDATA); }
	/** Unsafe version of {@link #alloc}. */
	public static long nalloc(long struct) { return memGetAddress(struct + NkAllocator.ALLOC); }
	/** Unsafe version of {@link #mfree}. */
	public static long nmfree(long struct) { return memGetAddress(struct + NkAllocator.MFREE); }

	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkAllocator.USERDATA, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #alloc(NkPluginAllocI) alloc}. */
	public static void nalloc(long struct, long value) { memPutAddress(struct + NkAllocator.ALLOC, value); }
	/** Unsafe version of {@link #mfree(NkPluginFreeI) mfree}. */
	public static void nmfree(long struct, long value) { memPutAddress(struct + NkAllocator.MFREE, value); }

	// -----------------------------------

	/** An array of {@link NkAllocator} structs. */
	public static class Buffer extends StructBuffer<NkAllocator, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkAllocator.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkAllocator#SIZEOF}, and its mark will be undefined.
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
		protected NkAllocator newInstance(long address) {
			return new NkAllocator(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkAllocator.nuserdata(address()); }
		/** Returns the {@code NkPluginAlloc} instance at the {@code alloc} field. */
		public NkPluginAlloc alloc() { return NkPluginAlloc.create(NkAllocator.nalloc(address())); }
		/** Returns the {@code NkPluginFree} instance at the {@code mfree} field. */
		public NkPluginFree mfree() { return NkPluginFree.create(NkAllocator.nmfree(address())); }

		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkAllocator.Buffer userdata(NkHandle value) { NkAllocator.nuserdata(address(), value); return this; }
		/** Sets the address of the specified {@link NkPluginAllocI} to the {@code alloc} field. */
		public NkAllocator.Buffer alloc(NkPluginAllocI value) { NkAllocator.nalloc(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link NkPluginFreeI} to the {@code mfree} field. */
		public NkAllocator.Buffer mfree(NkPluginFreeI value) { NkAllocator.nmfree(address(), addressSafe(value)); return this; }

	}

}