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
 * Allows the application to control what part of the provided texture will be used in the frame buffer.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VRTextureBounds_t {
    float uMin;
    float vMin;
    float uMax;
    float vMax;
}</code></pre>
 */
public class VRTextureBounds extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		UMIN,
		VMIN,
		UMAX,
		VMAX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		UMIN = layout.offsetof(0);
		VMIN = layout.offsetof(1);
		UMAX = layout.offsetof(2);
		VMAX = layout.offsetof(3);
	}

	VRTextureBounds(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VRTextureBounds} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VRTextureBounds(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code uMin} field. */
	public float uMin() { return nuMin(address()); }
	/** Returns the value of the {@code vMin} field. */
	public float vMin() { return nvMin(address()); }
	/** Returns the value of the {@code uMax} field. */
	public float uMax() { return nuMax(address()); }
	/** Returns the value of the {@code vMax} field. */
	public float vMax() { return nvMax(address()); }

	/** Sets the specified value to the {@code uMin} field. */
	public VRTextureBounds uMin(float value) { nuMin(address(), value); return this; }
	/** Sets the specified value to the {@code vMin} field. */
	public VRTextureBounds vMin(float value) { nvMin(address(), value); return this; }
	/** Sets the specified value to the {@code uMax} field. */
	public VRTextureBounds uMax(float value) { nuMax(address(), value); return this; }
	/** Sets the specified value to the {@code vMax} field. */
	public VRTextureBounds vMax(float value) { nvMax(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VRTextureBounds set(
		float uMin,
		float vMin,
		float uMax,
		float vMax
	) {
		uMin(uMin);
		vMin(vMin);
		uMax(uMax);
		vMax(vMax);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VRTextureBounds set(VRTextureBounds src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VRTextureBounds} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VRTextureBounds malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VRTextureBounds} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VRTextureBounds calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VRTextureBounds} instance allocated with {@link BufferUtils}. */
	public static VRTextureBounds create() {
		return new VRTextureBounds(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VRTextureBounds} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VRTextureBounds create(long address) {
		return address == NULL ? null : new VRTextureBounds(address, null);
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VRTextureBounds.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VRTextureBounds} instance allocated on the thread-local {@link MemoryStack}. */
	public static VRTextureBounds mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VRTextureBounds} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VRTextureBounds callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VRTextureBounds} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VRTextureBounds mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VRTextureBounds} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VRTextureBounds callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #uMin}. */
	public static float nuMin(long struct) { return memGetFloat(struct + VRTextureBounds.UMIN); }
	/** Unsafe version of {@link #vMin}. */
	public static float nvMin(long struct) { return memGetFloat(struct + VRTextureBounds.VMIN); }
	/** Unsafe version of {@link #uMax}. */
	public static float nuMax(long struct) { return memGetFloat(struct + VRTextureBounds.UMAX); }
	/** Unsafe version of {@link #vMax}. */
	public static float nvMax(long struct) { return memGetFloat(struct + VRTextureBounds.VMAX); }

	/** Unsafe version of {@link #uMin(float) uMin}. */
	public static void nuMin(long struct, float value) { memPutFloat(struct + VRTextureBounds.UMIN, value); }
	/** Unsafe version of {@link #vMin(float) vMin}. */
	public static void nvMin(long struct, float value) { memPutFloat(struct + VRTextureBounds.VMIN, value); }
	/** Unsafe version of {@link #uMax(float) uMax}. */
	public static void nuMax(long struct, float value) { memPutFloat(struct + VRTextureBounds.UMAX, value); }
	/** Unsafe version of {@link #vMax(float) vMax}. */
	public static void nvMax(long struct, float value) { memPutFloat(struct + VRTextureBounds.VMAX, value); }

	// -----------------------------------

	/** An array of {@link VRTextureBounds} structs. */
	public static class Buffer extends StructBuffer<VRTextureBounds, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VRTextureBounds.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VRTextureBounds#SIZEOF}, and its mark will be undefined.
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
		protected VRTextureBounds newInstance(long address) {
			return new VRTextureBounds(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code uMin} field. */
		public float uMin() { return VRTextureBounds.nuMin(address()); }
		/** Returns the value of the {@code vMin} field. */
		public float vMin() { return VRTextureBounds.nvMin(address()); }
		/** Returns the value of the {@code uMax} field. */
		public float uMax() { return VRTextureBounds.nuMax(address()); }
		/** Returns the value of the {@code vMax} field. */
		public float vMax() { return VRTextureBounds.nvMax(address()); }

		/** Sets the specified value to the {@code uMin} field. */
		public VRTextureBounds.Buffer uMin(float value) { VRTextureBounds.nuMin(address(), value); return this; }
		/** Sets the specified value to the {@code vMin} field. */
		public VRTextureBounds.Buffer vMin(float value) { VRTextureBounds.nvMin(address(), value); return this; }
		/** Sets the specified value to the {@code uMax} field. */
		public VRTextureBounds.Buffer uMax(float value) { VRTextureBounds.nuMax(address(), value); return this; }
		/** Sets the specified value to the {@code vMax} field. */
		public VRTextureBounds.Buffer vMax(float value) { VRTextureBounds.nvMax(address(), value); return this; }

	}

}