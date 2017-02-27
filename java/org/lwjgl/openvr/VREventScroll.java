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
 * Used for simulated mouse wheel scroll in overlay space.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code xdelta} &ndash; movement in fraction of the pad traversed since last delta, 1.0 for a full swipe</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Scroll_t {
    float xdelta;
    float ydelta;
    uint32_t repeatCount;
}</code></pre>
 */
public class VREventScroll extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		XDELTA,
		YDELTA,
		REPEATCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		XDELTA = layout.offsetof(0);
		YDELTA = layout.offsetof(1);
		REPEATCOUNT = layout.offsetof(2);
	}

	VREventScroll(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventScroll} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventScroll(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code xdelta} field. */
	public float xdelta() { return nxdelta(address()); }
	/** Returns the value of the {@code ydelta} field. */
	public float ydelta() { return nydelta(address()); }
	/** Returns the value of the {@code repeatCount} field. */
	public int repeatCount() { return nrepeatCount(address()); }

	/** Sets the specified value to the {@code xdelta} field. */
	public VREventScroll xdelta(float value) { nxdelta(address(), value); return this; }
	/** Sets the specified value to the {@code ydelta} field. */
	public VREventScroll ydelta(float value) { nydelta(address(), value); return this; }
	/** Sets the specified value to the {@code repeatCount} field. */
	public VREventScroll repeatCount(int value) { nrepeatCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VREventScroll set(
		float xdelta,
		float ydelta,
		int repeatCount
	) {
		xdelta(xdelta);
		ydelta(ydelta);
		repeatCount(repeatCount);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventScroll set(VREventScroll src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventScroll} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventScroll malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventScroll} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventScroll calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventScroll} instance allocated with {@link BufferUtils}. */
	public static VREventScroll create() {
		return new VREventScroll(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventScroll} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventScroll create(long address) {
		return address == NULL ? null : new VREventScroll(address, null);
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventScroll.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventScroll} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventScroll mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventScroll} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventScroll callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventScroll} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventScroll mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventScroll} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventScroll callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventScroll.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #xdelta}. */
	public static float nxdelta(long struct) { return memGetFloat(struct + VREventScroll.XDELTA); }
	/** Unsafe version of {@link #ydelta}. */
	public static float nydelta(long struct) { return memGetFloat(struct + VREventScroll.YDELTA); }
	/** Unsafe version of {@link #repeatCount}. */
	public static int nrepeatCount(long struct) { return memGetInt(struct + VREventScroll.REPEATCOUNT); }

	/** Unsafe version of {@link #xdelta(float) xdelta}. */
	public static void nxdelta(long struct, float value) { memPutFloat(struct + VREventScroll.XDELTA, value); }
	/** Unsafe version of {@link #ydelta(float) ydelta}. */
	public static void nydelta(long struct, float value) { memPutFloat(struct + VREventScroll.YDELTA, value); }
	/** Unsafe version of {@link #repeatCount(int) repeatCount}. */
	public static void nrepeatCount(long struct, int value) { memPutInt(struct + VREventScroll.REPEATCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VREventScroll} structs. */
	public static class Buffer extends StructBuffer<VREventScroll, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventScroll.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventScroll#SIZEOF}, and its mark will be undefined.
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
		protected VREventScroll newInstance(long address) {
			return new VREventScroll(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code xdelta} field. */
		public float xdelta() { return VREventScroll.nxdelta(address()); }
		/** Returns the value of the {@code ydelta} field. */
		public float ydelta() { return VREventScroll.nydelta(address()); }
		/** Returns the value of the {@code repeatCount} field. */
		public int repeatCount() { return VREventScroll.nrepeatCount(address()); }

		/** Sets the specified value to the {@code xdelta} field. */
		public VREventScroll.Buffer xdelta(float value) { VREventScroll.nxdelta(address(), value); return this; }
		/** Sets the specified value to the {@code ydelta} field. */
		public VREventScroll.Buffer ydelta(float value) { VREventScroll.nydelta(address(), value); return this; }
		/** Sets the specified value to the {@code repeatCount} field. */
		public VREventScroll.Buffer repeatCount(int value) { VREventScroll.nrepeatCount(address(), value); return this; }

	}

}