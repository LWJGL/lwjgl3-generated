/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifies the width, height, stride, format and memory pointer of the pixmap to be used by the function {@link HIClientpixmap#eglCreatePixmapSurfaceHI CreatePixmapSurfaceHI} to
 * create the {@code PixmapSurface}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pData} &ndash; 
 * pointer to a memory buffer allocated by the application that will contain the result of the drawing operations. It is up to the application to ensure
 * that the buffer size corresponds to {@code iHeight * iStride * sizeof(pixel)}.</li>
 * <li>{@code iWidth} &ndash; width of the buffer in pixels</li>
 * <li>{@code iHeight} &ndash; 
 * height of the buffer in pixels. The height of the buffer can be negative; in that case the result of the drawing operations will be vertically swapped.
 * When positive, {@code pData} will point at the bottom-left corner of the image; when negative, to the top-left corner.</li>
 * <li>{@code iStride} &ndash; stride of the buffer, in pixels. It is important to note that each row of the buffer must start on 32-bit boundaries.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct EGLClientPixmapHI {
    void * pData;
    EGLint iWidth;
    EGLint iHeight;
    EGLint iStride;
}</code></pre>
 */
public class EGLClientPixmapHI extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PDATA,
		IWIDTH,
		IHEIGHT,
		ISTRIDE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PDATA = layout.offsetof(0);
		IWIDTH = layout.offsetof(1);
		IHEIGHT = layout.offsetof(2);
		ISTRIDE = layout.offsetof(3);
	}

	EGLClientPixmapHI(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link EGLClientPixmapHI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public EGLClientPixmapHI(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public ByteBuffer pData(int capacity) { return npData(address(), capacity); }
	/** Returns the value of the {@code iWidth} field. */
	public int iWidth() { return niWidth(address()); }
	/** Returns the value of the {@code iHeight} field. */
	public int iHeight() { return niHeight(address()); }
	/** Returns the value of the {@code iStride} field. */
	public int iStride() { return niStride(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
	public EGLClientPixmapHI pData(ByteBuffer value) { npData(address(), value); return this; }
	/** Sets the specified value to the {@code iWidth} field. */
	public EGLClientPixmapHI iWidth(int value) { niWidth(address(), value); return this; }
	/** Sets the specified value to the {@code iHeight} field. */
	public EGLClientPixmapHI iHeight(int value) { niHeight(address(), value); return this; }
	/** Sets the specified value to the {@code iStride} field. */
	public EGLClientPixmapHI iStride(int value) { niStride(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public EGLClientPixmapHI set(
		ByteBuffer pData,
		int iWidth,
		int iHeight,
		int iStride
	) {
		pData(pData);
		iWidth(iWidth);
		iHeight(iHeight);
		iStride(iStride);

		return this;
	}

	/** Unsafe version of {@link #set(EGLClientPixmapHI) set}. */
	public EGLClientPixmapHI nset(long struct) {
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
	public EGLClientPixmapHI set(EGLClientPixmapHI src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static EGLClientPixmapHI malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static EGLClientPixmapHI calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link BufferUtils}. */
	public static EGLClientPixmapHI create() {
		return new EGLClientPixmapHI(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link EGLClientPixmapHI} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static EGLClientPixmapHI create(long address) {
		return address == NULL ? null : new EGLClientPixmapHI(address, null);
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link EGLClientPixmapHI.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link EGLClientPixmapHI} instance allocated on the thread-local {@link MemoryStack}. */
	public static EGLClientPixmapHI mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link EGLClientPixmapHI} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static EGLClientPixmapHI callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EGLClientPixmapHI mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EGLClientPixmapHI callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #pData(int) pData}. */
	public static ByteBuffer npData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + EGLClientPixmapHI.PDATA), capacity); }
	/** Unsafe version of {@link #iWidth}. */
	public static int niWidth(long struct) { return memGetInt(struct + EGLClientPixmapHI.IWIDTH); }
	/** Unsafe version of {@link #iHeight}. */
	public static int niHeight(long struct) { return memGetInt(struct + EGLClientPixmapHI.IHEIGHT); }
	/** Unsafe version of {@link #iStride}. */
	public static int niStride(long struct) { return memGetInt(struct + EGLClientPixmapHI.ISTRIDE); }

	/** Unsafe version of {@link #pData(ByteBuffer) pData}. */
	public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + EGLClientPixmapHI.PDATA, memAddress(value)); }
	/** Unsafe version of {@link #iWidth(int) iWidth}. */
	public static void niWidth(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.IWIDTH, value); }
	/** Unsafe version of {@link #iHeight(int) iHeight}. */
	public static void niHeight(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.IHEIGHT, value); }
	/** Unsafe version of {@link #iStride(int) iStride}. */
	public static void niStride(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.ISTRIDE, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + EGLClientPixmapHI.PDATA));
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

	/** An array of {@link EGLClientPixmapHI} structs. */
	public static final class Buffer extends StructBuffer<EGLClientPixmapHI, Buffer> {

		/**
		 * Creates a new {@link EGLClientPixmapHI.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link EGLClientPixmapHI#SIZEOF}, and its mark will be undefined.
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
		protected EGLClientPixmapHI newInstance(long address) {
			return new EGLClientPixmapHI(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public ByteBuffer pData(int capacity) { return EGLClientPixmapHI.npData(address(), capacity); }
		/** Returns the value of the {@code iWidth} field. */
		public int iWidth() { return EGLClientPixmapHI.niWidth(address()); }
		/** Returns the value of the {@code iHeight} field. */
		public int iHeight() { return EGLClientPixmapHI.niHeight(address()); }
		/** Returns the value of the {@code iStride} field. */
		public int iStride() { return EGLClientPixmapHI.niStride(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
		public EGLClientPixmapHI.Buffer pData(ByteBuffer value) { EGLClientPixmapHI.npData(address(), value); return this; }
		/** Sets the specified value to the {@code iWidth} field. */
		public EGLClientPixmapHI.Buffer iWidth(int value) { EGLClientPixmapHI.niWidth(address(), value); return this; }
		/** Sets the specified value to the {@code iHeight} field. */
		public EGLClientPixmapHI.Buffer iHeight(int value) { EGLClientPixmapHI.niHeight(address(), value); return this; }
		/** Sets the specified value to the {@code iStride} field. */
		public EGLClientPixmapHI.Buffer iStride(int value) { EGLClientPixmapHI.niStride(address(), value); return this; }

	}

}