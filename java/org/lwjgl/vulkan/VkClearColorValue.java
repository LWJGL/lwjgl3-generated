/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * union VkClearColorValue {
 *     float[4] float32;
 *     int32_t[4] int32;
 *     uint32_t[4] uint32;
 * }</code></pre>
 */
public class VkClearColorValue extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FLOAT32,
		INT32,
		UINT32;

	static {
		Layout layout = __union(
			__array(4, 4),
			__array(4, 4),
			__array(4, 4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		FLOAT32 = layout.offsetof(0);
		INT32 = layout.offsetof(1);
		UINT32 = layout.offsetof(2);
	}

	VkClearColorValue(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkClearColorValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkClearColorValue(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link FloatBuffer} view of the {@code float32} field. */
	public FloatBuffer float32() { return nfloat32(address()); }
	/** Returns the value at the specified index of the {@code float32} field. */
	public float float32(int index) { return nfloat32(address(), index); }
	/** Returns a {@link IntBuffer} view of the {@code int32} field. */
	public IntBuffer int32() { return nint32(address()); }
	/** Returns the value at the specified index of the {@code int32} field. */
	public int int32(int index) { return nint32(address(), index); }
	/** Returns a {@link IntBuffer} view of the {@code uint32} field. */
	public IntBuffer uint32() { return nuint32(address()); }
	/** Returns the value at the specified index of the {@code uint32} field. */
	public int uint32(int index) { return nuint32(address(), index); }

	/** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
	public VkClearColorValue float32(FloatBuffer value) { nfloat32(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code float32} field. */
	public VkClearColorValue float32(int index, float value) { nfloat32(address(), index, value); return this; }
	/** Copies the specified {@link IntBuffer} to the {@code int32} field. */
	public VkClearColorValue int32(IntBuffer value) { nint32(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code int32} field. */
	public VkClearColorValue int32(int index, int value) { nint32(address(), index, value); return this; }
	/** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
	public VkClearColorValue uint32(IntBuffer value) { nuint32(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code uint32} field. */
	public VkClearColorValue uint32(int index, int value) { nuint32(address(), index, value); return this; }

	/** Unsafe version of {@link #set(VkClearColorValue) set}. */
	public VkClearColorValue nset(long struct) {
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
	public VkClearColorValue set(VkClearColorValue src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkClearColorValue) set}. */
	public VkClearColorValue set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkClearColorValue} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkClearColorValue malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkClearColorValue} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkClearColorValue calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkClearColorValue} instance allocated with {@link BufferUtils}. */
	public static VkClearColorValue create() {
		return new VkClearColorValue(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkClearColorValue} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkClearColorValue create(long address) {
		return address == NULL ? null : new VkClearColorValue(address, null);
	}

	/**
	 * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkClearColorValue.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #float32}. */
	public static FloatBuffer nfloat32(long struct) {
		return memFloatBuffer(struct + VkClearColorValue.FLOAT32, 4);
	}
	/** Unsafe version of {@link #float32(int) float32}. */
	public static float nfloat32(long struct, int index) { return memGetFloat(struct + VkClearColorValue.FLOAT32 + index * 4); }
	/** Unsafe version of {@link #int32}. */
	public static IntBuffer nint32(long struct) {
		return memIntBuffer(struct + VkClearColorValue.INT32, 4);
	}
	/** Unsafe version of {@link #int32(int) int32}. */
	public static int nint32(long struct, int index) { return memGetInt(struct + VkClearColorValue.INT32 + index * 4); }
	/** Unsafe version of {@link #uint32}. */
	public static IntBuffer nuint32(long struct) {
		return memIntBuffer(struct + VkClearColorValue.UINT32, 4);
	}
	/** Unsafe version of {@link #uint32(int) uint32}. */
	public static int nuint32(long struct, int index) { return memGetInt(struct + VkClearColorValue.UINT32 + index * 4); }

	/** Unsafe version of {@link #float32(FloatBuffer) float32}. */
	public static void nfloat32(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + VkClearColorValue.FLOAT32, value.remaining() * 4);
	}
	/** Unsafe version of {@link #float32(int, float) float32}. */
	public static void nfloat32(long struct, int index, float value) { memPutFloat(struct + VkClearColorValue.FLOAT32 + index * 4, value); }
	/** Unsafe version of {@link #int32(IntBuffer) int32}. */
	public static void nint32(long struct, IntBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + VkClearColorValue.INT32, value.remaining() * 4);
	}
	/** Unsafe version of {@link #int32(int, int) int32}. */
	public static void nint32(long struct, int index, int value) { memPutInt(struct + VkClearColorValue.INT32 + index * 4, value); }
	/** Unsafe version of {@link #uint32(IntBuffer) uint32}. */
	public static void nuint32(long struct, IntBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + VkClearColorValue.UINT32, value.remaining() * 4);
	}
	/** Unsafe version of {@link #uint32(int, int) uint32}. */
	public static void nuint32(long struct, int index, int value) { memPutInt(struct + VkClearColorValue.UINT32 + index * 4, value); }

	// -----------------------------------

	/** An array of {@link VkClearColorValue} structs. */
	public static final class Buffer extends StructBuffer<VkClearColorValue, Buffer> {

		/**
		 * Creates a new {@link VkClearColorValue.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkClearColorValue#SIZEOF}, and its mark will be undefined.
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
		protected VkClearColorValue newInstance(long address) {
			return new VkClearColorValue(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link FloatBuffer} view of the {@code float32} field. */
		public FloatBuffer float32() { return VkClearColorValue.nfloat32(address()); }
		/** Returns the value at the specified index of the {@code float32} field. */
		public float float32(int index) { return VkClearColorValue.nfloat32(address(), index); }
		/** Returns a {@link IntBuffer} view of the {@code int32} field. */
		public IntBuffer int32() { return VkClearColorValue.nint32(address()); }
		/** Returns the value at the specified index of the {@code int32} field. */
		public int int32(int index) { return VkClearColorValue.nint32(address(), index); }
		/** Returns a {@link IntBuffer} view of the {@code uint32} field. */
		public IntBuffer uint32() { return VkClearColorValue.nuint32(address()); }
		/** Returns the value at the specified index of the {@code uint32} field. */
		public int uint32(int index) { return VkClearColorValue.nuint32(address(), index); }

		/** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
		public VkClearColorValue.Buffer float32(FloatBuffer value) { VkClearColorValue.nfloat32(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code float32} field. */
		public VkClearColorValue.Buffer float32(int index, float value) { VkClearColorValue.nfloat32(address(), index, value); return this; }
		/** Copies the specified {@link IntBuffer} to the {@code int32} field. */
		public VkClearColorValue.Buffer int32(IntBuffer value) { VkClearColorValue.nint32(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code int32} field. */
		public VkClearColorValue.Buffer int32(int index, int value) { VkClearColorValue.nint32(address(), index, value); return this; }
		/** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
		public VkClearColorValue.Buffer uint32(IntBuffer value) { VkClearColorValue.nuint32(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code uint32} field. */
		public VkClearColorValue.Buffer uint32(int index, int value) { VkClearColorValue.nuint32(address(), index, value); return this; }

	}

}