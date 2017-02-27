/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_EditingCameraSurface_t {
    uint64_t overlayHandle;
    uint32_t nVisualMode;
}</code></pre>
 */
public class VREventEditingCameraSurface extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		OVERLAYHANDLE,
		NVISUALMODE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		OVERLAYHANDLE = layout.offsetof(0);
		NVISUALMODE = layout.offsetof(1);
	}

	VREventEditingCameraSurface(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventEditingCameraSurface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventEditingCameraSurface(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code overlayHandle} field. */
	public long overlayHandle() { return noverlayHandle(address()); }
	/** Returns the value of the {@code nVisualMode} field. */
	public int nVisualMode() { return nnVisualMode(address()); }

	/** Sets the specified value to the {@code overlayHandle} field. */
	public VREventEditingCameraSurface overlayHandle(long value) { noverlayHandle(address(), value); return this; }
	/** Sets the specified value to the {@code nVisualMode} field. */
	public VREventEditingCameraSurface nVisualMode(int value) { nnVisualMode(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VREventEditingCameraSurface set(
		long overlayHandle,
		int nVisualMode
	) {
		overlayHandle(overlayHandle);
		nVisualMode(nVisualMode);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventEditingCameraSurface set(VREventEditingCameraSurface src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventEditingCameraSurface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventEditingCameraSurface malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventEditingCameraSurface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventEditingCameraSurface calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventEditingCameraSurface} instance allocated with {@link BufferUtils}. */
	public static VREventEditingCameraSurface create() {
		return new VREventEditingCameraSurface(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventEditingCameraSurface} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventEditingCameraSurface create(long address) {
		return address == NULL ? null : new VREventEditingCameraSurface(address, null);
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventEditingCameraSurface.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventEditingCameraSurface} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventEditingCameraSurface mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventEditingCameraSurface} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventEditingCameraSurface callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventEditingCameraSurface mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventEditingCameraSurface callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventEditingCameraSurface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #overlayHandle}. */
	public static long noverlayHandle(long struct) { return memGetLong(struct + VREventEditingCameraSurface.OVERLAYHANDLE); }
	/** Unsafe version of {@link #nVisualMode}. */
	public static int nnVisualMode(long struct) { return memGetInt(struct + VREventEditingCameraSurface.NVISUALMODE); }

	/** Unsafe version of {@link #overlayHandle(long) overlayHandle}. */
	public static void noverlayHandle(long struct, long value) { memPutLong(struct + VREventEditingCameraSurface.OVERLAYHANDLE, value); }
	/** Unsafe version of {@link #nVisualMode(int) nVisualMode}. */
	public static void nnVisualMode(long struct, int value) { memPutInt(struct + VREventEditingCameraSurface.NVISUALMODE, value); }

	// -----------------------------------

	/** An array of {@link VREventEditingCameraSurface} structs. */
	public static class Buffer extends StructBuffer<VREventEditingCameraSurface, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventEditingCameraSurface.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventEditingCameraSurface#SIZEOF}, and its mark will be undefined.
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
		protected VREventEditingCameraSurface newInstance(long address) {
			return new VREventEditingCameraSurface(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code overlayHandle} field. */
		public long overlayHandle() { return VREventEditingCameraSurface.noverlayHandle(address()); }
		/** Returns the value of the {@code nVisualMode} field. */
		public int nVisualMode() { return VREventEditingCameraSurface.nnVisualMode(address()); }

		/** Sets the specified value to the {@code overlayHandle} field. */
		public VREventEditingCameraSurface.Buffer overlayHandle(long value) { VREventEditingCameraSurface.noverlayHandle(address(), value); return this; }
		/** Sets the specified value to the {@code nVisualMode} field. */
		public VREventEditingCameraSurface.Buffer nVisualMode(int value) { VREventEditingCameraSurface.nnVisualMode(address(), value); return this; }

	}

}