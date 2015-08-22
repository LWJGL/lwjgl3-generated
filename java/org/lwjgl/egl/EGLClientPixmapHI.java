/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image format struct. */
public final class EGLClientPixmapHI implements Pointer {

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

	private final ByteBuffer struct;

	public EGLClientPixmapHI() {
		this(malloc());
	}

	public EGLClientPixmapHI(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public EGLClientPixmapHI setPData(long pData) { pData(struct, pData); return this; }
	public EGLClientPixmapHI setPData(ByteBuffer pData) { pData(struct, pData); return this; }
	public EGLClientPixmapHI setIWidth(int iWidth) { iWidth(struct, iWidth); return this; }
	public EGLClientPixmapHI setIHeight(int iHeight) { iHeight(struct, iHeight); return this; }
	public EGLClientPixmapHI setIStride(int iStride) { iStride(struct, iStride); return this; }

	public long getPData() { return pData(struct); }
	public ByteBuffer getPData(int byteLen) { return pData(struct, byteLen); }
	public int getIWidth() { return iWidth(struct); }
	public int getIHeight() { return iHeight(struct); }
	public int getIStride() { return iStride(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer pData,
		int iWidth,
		int iHeight,
		int iStride
	) {
		ByteBuffer eglclientpixmaphi = malloc();

		pData(eglclientpixmaphi, pData);
		iWidth(eglclientpixmaphi, iWidth);
		iHeight(eglclientpixmaphi, iHeight);
		iStride(eglclientpixmaphi, iStride);

		return eglclientpixmaphi;
	}

	public static void pData(ByteBuffer eglclientpixmaphi, long pData) { PointerBuffer.put(eglclientpixmaphi, eglclientpixmaphi.position() + PDATA, pData); }
	public static void pData(ByteBuffer eglclientpixmaphi, ByteBuffer pData) { pData(eglclientpixmaphi, memAddressSafe(pData)); }
	public static void iWidth(ByteBuffer eglclientpixmaphi, int iWidth) { eglclientpixmaphi.putInt(eglclientpixmaphi.position() + IWIDTH, iWidth); }
	public static void iHeight(ByteBuffer eglclientpixmaphi, int iHeight) { eglclientpixmaphi.putInt(eglclientpixmaphi.position() + IHEIGHT, iHeight); }
	public static void iStride(ByteBuffer eglclientpixmaphi, int iStride) { eglclientpixmaphi.putInt(eglclientpixmaphi.position() + ISTRIDE, iStride); }

	public static long pData(ByteBuffer eglclientpixmaphi) { return PointerBuffer.get(eglclientpixmaphi, eglclientpixmaphi.position() + PDATA); }
	public static ByteBuffer pData(ByteBuffer eglclientpixmaphi, int byteLen) { return memByteBuffer(pData(eglclientpixmaphi), byteLen); }
	public static int iWidth(ByteBuffer eglclientpixmaphi) { return eglclientpixmaphi.getInt(eglclientpixmaphi.position() + IWIDTH); }
	public static int iHeight(ByteBuffer eglclientpixmaphi) { return eglclientpixmaphi.getInt(eglclientpixmaphi.position() + IHEIGHT); }
	public static int iStride(ByteBuffer eglclientpixmaphi) { return eglclientpixmaphi.getInt(eglclientpixmaphi.position() + ISTRIDE); }

}