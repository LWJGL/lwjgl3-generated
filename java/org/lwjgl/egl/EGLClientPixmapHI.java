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

/**
 * Specifies the width, height, stride, format and memory pointer of the pixmap to be used by the function {@link HIClientpixmap#eglCreatePixmapSurfaceHI} to
 * create the {@code PixmapSurface}.
 * 
 * <h3>struct EGLClientPixmapHI members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>pData</td><td class="nw">void</td><td>pointer to a memory buffer allocated by the application that will contain the result of the drawing operations. It is up to the application to ensure
 * that the buffer size corresponds to {@code iHeight * iStride * sizeof(pixel)}.</td></tr>
 * <tr><td>iWidth</td><td class="nw">EGLint</td><td>width of the buffer in pixels</td></tr>
 * <tr><td>iHeight</td><td class="nw">EGLint</td><td>height of the buffer in pixels. The height of the buffer can be negative; in that case the result of the drawing operations will be vertically swapped.
 * When positive, {@code pData} will point at the bottom-left corner of the image; when negative, to the top-left corner.</td></tr>
 * <tr><td>iStride</td><td class="nw">EGLint</td><td>stride of the buffer, in pixels. It is important to note that each row of the buffer must start on 32-bit boundaries.</td></tr>
 * </table>
 */
public class EGLClientPixmapHI extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		PDATA,
		IWIDTH,
		IHEIGHT,
		ISTRIDE;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		PDATA = layout.offsetof(0);
		IWIDTH = layout.offsetof(1);
		IHEIGHT = layout.offsetof(2);
		ISTRIDE = layout.offsetof(3);
	}

	EGLClientPixmapHI(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link EGLClientPixmapHI} instance at the specified memory address. */
	public EGLClientPixmapHI(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link EGLClientPixmapHI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public EGLClientPixmapHI(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field.
	 *
	 * @param capacity the number of elements in the returned {@link ByteBuffer}
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

	/** {@link ByteBuffer} version of {@link #set(EGLClientPixmapHI) set}. */
	public EGLClientPixmapHI set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static EGLClientPixmapHI malloc() {
		return new EGLClientPixmapHI(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static EGLClientPixmapHI calloc() {
		return new EGLClientPixmapHI(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link EGLClientPixmapHI} instance allocated with {@link BufferUtils}. */
	public static EGLClientPixmapHI create() {
		return new EGLClientPixmapHI(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link EGLClientPixmapHI.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #pData(int) pData}. */
	public static ByteBuffer npData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + EGLClientPixmapHI.PDATA), capacity); }
	/** Unsafe version of {@link #iWidth}. */
	public static int niWidth(long struct) { return memGetInt(struct + EGLClientPixmapHI.IWIDTH); }
	/** Unsafe version of {@link #iHeight}. */
	public static int niHeight(long struct) { return memGetInt(struct + EGLClientPixmapHI.IHEIGHT); }
	/** Unsafe version of {@link #iStride}. */
	public static int niStride(long struct) { return memGetInt(struct + EGLClientPixmapHI.ISTRIDE); }

	/** Unsafe version of {@link #pData(ByteBuffer) pData}. */
	public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + EGLClientPixmapHI.PDATA, memAddressSafe(value)); }
	/** Unsafe version of {@link #iWidth(int) iWidth}. */
	public static void niWidth(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.IWIDTH, value); }
	/** Unsafe version of {@link #iHeight(int) iHeight}. */
	public static void niHeight(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.IHEIGHT, value); }
	/** Unsafe version of {@link #iStride(int) iStride}. */
	public static void niStride(long struct, int value) { memPutInt(struct + EGLClientPixmapHI.ISTRIDE, value); }

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
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected EGLClientPixmapHI newInstance(long address) {
			return new EGLClientPixmapHI(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field.
		 *
		 * @param capacity the number of elements in the returned {@link ByteBuffer}
		 */
		public ByteBuffer pData(int capacity) { return npData(address(), capacity); }
		/** Returns the value of the {@code iWidth} field. */
		public int iWidth() { return niWidth(address()); }
		/** Returns the value of the {@code iHeight} field. */
		public int iHeight() { return niHeight(address()); }
		/** Returns the value of the {@code iStride} field. */
		public int iStride() { return niStride(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
		public EGLClientPixmapHI.Buffer pData(ByteBuffer value) { npData(address(), value); return this; }
		/** Sets the specified value to the {@code iWidth} field. */
		public EGLClientPixmapHI.Buffer iWidth(int value) { niWidth(address(), value); return this; }
		/** Sets the specified value to the {@code iHeight} field. */
		public EGLClientPixmapHI.Buffer iHeight(int value) { niHeight(address(), value); return this; }
		/** Sets the specified value to the {@code iStride} field. */
		public EGLClientPixmapHI.Buffer iStride(int value) { niStride(address(), value); return this; }

	}

}