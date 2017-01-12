/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used for passing graphic data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NotificationBitmap_t {
    void * m_pImageData;
    int32_t m_nWidth;
    int32_t m_nHeight;
    int32_t m_nBytesPerPixel;
}</code></pre>
 */
public class NotificationBitmap extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		M_PIMAGEDATA,
		M_NWIDTH,
		M_NHEIGHT,
		M_NBYTESPERPIXEL;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		M_PIMAGEDATA = layout.offsetof(0);
		M_NWIDTH = layout.offsetof(1);
		M_NHEIGHT = layout.offsetof(2);
		M_NBYTESPERPIXEL = layout.offsetof(3);
	}

	NotificationBitmap(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NotificationBitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NotificationBitmap(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_pImageData} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public ByteBuffer m_pImageData(int capacity) { return nm_pImageData(address(), capacity); }
	/** Returns the value of the {@code m_nWidth} field. */
	public int m_nWidth() { return nm_nWidth(address()); }
	/** Returns the value of the {@code m_nHeight} field. */
	public int m_nHeight() { return nm_nHeight(address()); }
	/** Returns the value of the {@code m_nBytesPerPixel} field. */
	public int m_nBytesPerPixel() { return nm_nBytesPerPixel(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code m_pImageData} field. */
	public NotificationBitmap m_pImageData(ByteBuffer value) { nm_pImageData(address(), value); return this; }
	/** Sets the specified value to the {@code m_nWidth} field. */
	public NotificationBitmap m_nWidth(int value) { nm_nWidth(address(), value); return this; }
	/** Sets the specified value to the {@code m_nHeight} field. */
	public NotificationBitmap m_nHeight(int value) { nm_nHeight(address(), value); return this; }
	/** Sets the specified value to the {@code m_nBytesPerPixel} field. */
	public NotificationBitmap m_nBytesPerPixel(int value) { nm_nBytesPerPixel(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NotificationBitmap set(
		ByteBuffer m_pImageData,
		int m_nWidth,
		int m_nHeight,
		int m_nBytesPerPixel
	) {
		m_pImageData(m_pImageData);
		m_nWidth(m_nWidth);
		m_nHeight(m_nHeight);
		m_nBytesPerPixel(m_nBytesPerPixel);

		return this;
	}

	/** Unsafe version of {@link #set(NotificationBitmap) set}. */
	public NotificationBitmap nset(long struct) {
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
	public NotificationBitmap set(NotificationBitmap src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NotificationBitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NotificationBitmap malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NotificationBitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NotificationBitmap calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NotificationBitmap} instance allocated with {@link BufferUtils}. */
	public static NotificationBitmap create() {
		return new NotificationBitmap(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NotificationBitmap} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NotificationBitmap create(long address) {
		return address == NULL ? null : new NotificationBitmap(address, null);
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NotificationBitmap.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NotificationBitmap} instance allocated on the thread-local {@link MemoryStack}. */
	public static NotificationBitmap mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NotificationBitmap} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NotificationBitmap callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NotificationBitmap} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NotificationBitmap mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NotificationBitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NotificationBitmap callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #m_pImageData(int) m_pImageData}. */
	public static ByteBuffer nm_pImageData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + NotificationBitmap.M_PIMAGEDATA), capacity); }
	/** Unsafe version of {@link #m_nWidth}. */
	public static int nm_nWidth(long struct) { return memGetInt(struct + NotificationBitmap.M_NWIDTH); }
	/** Unsafe version of {@link #m_nHeight}. */
	public static int nm_nHeight(long struct) { return memGetInt(struct + NotificationBitmap.M_NHEIGHT); }
	/** Unsafe version of {@link #m_nBytesPerPixel}. */
	public static int nm_nBytesPerPixel(long struct) { return memGetInt(struct + NotificationBitmap.M_NBYTESPERPIXEL); }

	/** Unsafe version of {@link #m_pImageData(ByteBuffer) m_pImageData}. */
	public static void nm_pImageData(long struct, ByteBuffer value) { memPutAddress(struct + NotificationBitmap.M_PIMAGEDATA, memAddress(value)); }
	/** Unsafe version of {@link #m_nWidth(int) m_nWidth}. */
	public static void nm_nWidth(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NWIDTH, value); }
	/** Unsafe version of {@link #m_nHeight(int) m_nHeight}. */
	public static void nm_nHeight(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NHEIGHT, value); }
	/** Unsafe version of {@link #m_nBytesPerPixel(int) m_nBytesPerPixel}. */
	public static void nm_nBytesPerPixel(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NBYTESPERPIXEL, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + NotificationBitmap.M_PIMAGEDATA));
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

	/** An array of {@link NotificationBitmap} structs. */
	public static class Buffer extends StructBuffer<NotificationBitmap, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NotificationBitmap.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NotificationBitmap#SIZEOF}, and its mark will be undefined.
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
		protected NotificationBitmap newInstance(long address) {
			return new NotificationBitmap(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_pImageData} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public ByteBuffer m_pImageData(int capacity) { return NotificationBitmap.nm_pImageData(address(), capacity); }
		/** Returns the value of the {@code m_nWidth} field. */
		public int m_nWidth() { return NotificationBitmap.nm_nWidth(address()); }
		/** Returns the value of the {@code m_nHeight} field. */
		public int m_nHeight() { return NotificationBitmap.nm_nHeight(address()); }
		/** Returns the value of the {@code m_nBytesPerPixel} field. */
		public int m_nBytesPerPixel() { return NotificationBitmap.nm_nBytesPerPixel(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code m_pImageData} field. */
		public NotificationBitmap.Buffer m_pImageData(ByteBuffer value) { NotificationBitmap.nm_pImageData(address(), value); return this; }
		/** Sets the specified value to the {@code m_nWidth} field. */
		public NotificationBitmap.Buffer m_nWidth(int value) { NotificationBitmap.nm_nWidth(address(), value); return this; }
		/** Sets the specified value to the {@code m_nHeight} field. */
		public NotificationBitmap.Buffer m_nHeight(int value) { NotificationBitmap.nm_nHeight(address(), value); return this; }
		/** Sets the specified value to the {@code m_nBytesPerPixel} field. */
		public NotificationBitmap.Buffer m_nBytesPerPixel(int value) { NotificationBitmap.nm_nBytesPerPixel(address(), value); return this; }

	}

}