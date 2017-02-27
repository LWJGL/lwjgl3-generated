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
 * <pre><code>struct IntersectionMaskCircle_t {
    float m_flCenterX;
    float m_flCenterY;
    float m_flRadius;
}</code></pre>
 */
public class IntersectionMaskCircle extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		M_FLCENTERX,
		M_FLCENTERY,
		M_FLRADIUS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		M_FLCENTERX = layout.offsetof(0);
		M_FLCENTERY = layout.offsetof(1);
		M_FLRADIUS = layout.offsetof(2);
	}

	IntersectionMaskCircle(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link IntersectionMaskCircle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public IntersectionMaskCircle(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code m_flCenterX} field. */
	public float m_flCenterX() { return nm_flCenterX(address()); }
	/** Returns the value of the {@code m_flCenterY} field. */
	public float m_flCenterY() { return nm_flCenterY(address()); }
	/** Returns the value of the {@code m_flRadius} field. */
	public float m_flRadius() { return nm_flRadius(address()); }

	/** Sets the specified value to the {@code m_flCenterX} field. */
	public IntersectionMaskCircle m_flCenterX(float value) { nm_flCenterX(address(), value); return this; }
	/** Sets the specified value to the {@code m_flCenterY} field. */
	public IntersectionMaskCircle m_flCenterY(float value) { nm_flCenterY(address(), value); return this; }
	/** Sets the specified value to the {@code m_flRadius} field. */
	public IntersectionMaskCircle m_flRadius(float value) { nm_flRadius(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public IntersectionMaskCircle set(
		float m_flCenterX,
		float m_flCenterY,
		float m_flRadius
	) {
		m_flCenterX(m_flCenterX);
		m_flCenterY(m_flCenterY);
		m_flRadius(m_flRadius);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public IntersectionMaskCircle set(IntersectionMaskCircle src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link IntersectionMaskCircle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static IntersectionMaskCircle malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link IntersectionMaskCircle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static IntersectionMaskCircle calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link IntersectionMaskCircle} instance allocated with {@link BufferUtils}. */
	public static IntersectionMaskCircle create() {
		return new IntersectionMaskCircle(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link IntersectionMaskCircle} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static IntersectionMaskCircle create(long address) {
		return address == NULL ? null : new IntersectionMaskCircle(address, null);
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link IntersectionMaskCircle.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link IntersectionMaskCircle} instance allocated on the thread-local {@link MemoryStack}. */
	public static IntersectionMaskCircle mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link IntersectionMaskCircle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static IntersectionMaskCircle callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static IntersectionMaskCircle mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static IntersectionMaskCircle callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #m_flCenterX}. */
	public static float nm_flCenterX(long struct) { return memGetFloat(struct + IntersectionMaskCircle.M_FLCENTERX); }
	/** Unsafe version of {@link #m_flCenterY}. */
	public static float nm_flCenterY(long struct) { return memGetFloat(struct + IntersectionMaskCircle.M_FLCENTERY); }
	/** Unsafe version of {@link #m_flRadius}. */
	public static float nm_flRadius(long struct) { return memGetFloat(struct + IntersectionMaskCircle.M_FLRADIUS); }

	/** Unsafe version of {@link #m_flCenterX(float) m_flCenterX}. */
	public static void nm_flCenterX(long struct, float value) { memPutFloat(struct + IntersectionMaskCircle.M_FLCENTERX, value); }
	/** Unsafe version of {@link #m_flCenterY(float) m_flCenterY}. */
	public static void nm_flCenterY(long struct, float value) { memPutFloat(struct + IntersectionMaskCircle.M_FLCENTERY, value); }
	/** Unsafe version of {@link #m_flRadius(float) m_flRadius}. */
	public static void nm_flRadius(long struct, float value) { memPutFloat(struct + IntersectionMaskCircle.M_FLRADIUS, value); }

	// -----------------------------------

	/** An array of {@link IntersectionMaskCircle} structs. */
	public static class Buffer extends StructBuffer<IntersectionMaskCircle, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link IntersectionMaskCircle.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link IntersectionMaskCircle#SIZEOF}, and its mark will be undefined.
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
		protected IntersectionMaskCircle newInstance(long address) {
			return new IntersectionMaskCircle(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code m_flCenterX} field. */
		public float m_flCenterX() { return IntersectionMaskCircle.nm_flCenterX(address()); }
		/** Returns the value of the {@code m_flCenterY} field. */
		public float m_flCenterY() { return IntersectionMaskCircle.nm_flCenterY(address()); }
		/** Returns the value of the {@code m_flRadius} field. */
		public float m_flRadius() { return IntersectionMaskCircle.nm_flRadius(address()); }

		/** Sets the specified value to the {@code m_flCenterX} field. */
		public IntersectionMaskCircle.Buffer m_flCenterX(float value) { IntersectionMaskCircle.nm_flCenterX(address(), value); return this; }
		/** Sets the specified value to the {@code m_flCenterY} field. */
		public IntersectionMaskCircle.Buffer m_flCenterY(float value) { IntersectionMaskCircle.nm_flCenterY(address(), value); return this; }
		/** Sets the specified value to the {@code m_flRadius} field. */
		public IntersectionMaskCircle.Buffer m_flRadius(float value) { IntersectionMaskCircle.nm_flRadius(address(), value); return this; }

	}

}