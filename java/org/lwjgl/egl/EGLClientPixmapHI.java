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

/** Image format struct. */
public class EGLClientPixmapHI extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		PDATA,
		IWIDTH,
		IHEIGHT,
		ISTRIDE;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		PDATA = offsets.get(0);
		IWIDTH = offsets.get(1);
		IHEIGHT = offsets.get(2);
		ISTRIDE = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

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

	public ByteBuffer getPData(int byteLen) { return ngetPData(address(), byteLen); }
	public int getIWidth() { return ngetIWidth(address()); }
	public int getIHeight() { return ngetIHeight(address()); }
	public int getIStride() { return ngetIStride(address()); }

	public EGLClientPixmapHI setPData(ByteBuffer pData) { nsetPData(address(), pData); return this; }
	public EGLClientPixmapHI setIWidth(int iWidth) { nsetIWidth(address(), iWidth); return this; }
	public EGLClientPixmapHI setIHeight(int iHeight) { nsetIHeight(address(), iHeight); return this; }
	public EGLClientPixmapHI setIStride(int iStride) { nsetIStride(address(), iStride); return this; }

	/** Initializes this struct with the specified values. */
	public EGLClientPixmapHI set(
		ByteBuffer pData,
		int iWidth,
		int iHeight,
		int iStride
	) {
		setPData(pData);
		setIWidth(iWidth);
		setIHeight(iHeight);
		setIStride(iStride);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public EGLClientPixmapHI nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public EGLClientPixmapHI set(EGLClientPixmapHI src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public EGLClientPixmapHI set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
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

	public static long ngetPData(long struct) { return memGetAddress(struct + PDATA); }
	public static ByteBuffer ngetPData(long struct, int byteLen) { return memByteBuffer(ngetPData(struct), byteLen); }
	public static ByteBuffer getPData(ByteBuffer struct, int byteLen) { return ngetPData(memAddress(struct), byteLen); }
	public static int ngetIWidth(long struct) { return memGetInt(struct + IWIDTH); }
	public static int getIWidth(ByteBuffer struct) { return ngetIWidth(memAddress(struct)); }
	public static int ngetIHeight(long struct) { return memGetInt(struct + IHEIGHT); }
	public static int getIHeight(ByteBuffer struct) { return ngetIHeight(memAddress(struct)); }
	public static int ngetIStride(long struct) { return memGetInt(struct + ISTRIDE); }
	public static int getIStride(ByteBuffer struct) { return ngetIStride(memAddress(struct)); }

	public static void nsetPData(long struct, long pData) { memPutAddress(struct + PDATA, pData); }
	public static void nsetPData(long struct, ByteBuffer pData) { nsetPData(struct, memAddressSafe(pData)); }
	public static void setPData(ByteBuffer struct, ByteBuffer pData) { nsetPData(memAddress(struct), pData); }
	public static void nsetIWidth(long struct, int iWidth) { memPutInt(struct + IWIDTH, iWidth); }
	public static void setIWidth(ByteBuffer struct, int iWidth) { nsetIWidth(memAddress(struct), iWidth); }
	public static void nsetIHeight(long struct, int iHeight) { memPutInt(struct + IHEIGHT, iHeight); }
	public static void setIHeight(ByteBuffer struct, int iHeight) { nsetIHeight(memAddress(struct), iHeight); }
	public static void nsetIStride(long struct, int iStride) { memPutInt(struct + ISTRIDE, iStride); }
	public static void setIStride(ByteBuffer struct, int iStride) { nsetIStride(memAddress(struct), iStride); }

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

		public ByteBuffer getPData(int byteLen) { return ngetPData(address(), byteLen); }
		public int getIWidth() { return ngetIWidth(address()); }
		public int getIHeight() { return ngetIHeight(address()); }
		public int getIStride() { return ngetIStride(address()); }

		public EGLClientPixmapHI.Buffer setPData(ByteBuffer pData) { nsetPData(address(), pData); return this; }
		public EGLClientPixmapHI.Buffer setIWidth(int iWidth) { nsetIWidth(address(), iWidth); return this; }
		public EGLClientPixmapHI.Buffer setIHeight(int iHeight) { nsetIHeight(address(), iHeight); return this; }
		public EGLClientPixmapHI.Buffer setIStride(int iStride) { nsetIStride(address(), iStride); return this; }

	}

}