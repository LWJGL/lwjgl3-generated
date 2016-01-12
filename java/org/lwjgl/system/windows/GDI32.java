/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to gdi32.dll */
public class GDI32 {

	/** {@link PIXELFORMATDESCRIPTOR} flags. */
	public static final int
		PFD_DOUBLEBUFFER          = 0x1,
		PFD_STEREO                = 0x2,
		PFD_DRAW_TO_WINDOW        = 0x4,
		PFD_DRAW_TO_BITMAP        = 0x8,
		PFD_SUPPORT_GDI           = 0x10,
		PFD_SUPPORT_OPENGL        = 0x20,
		PFD_GENERIC_FORMAT        = 0x40,
		PFD_NEED_PALETTE          = 0x80,
		PFD_NEED_SYSTEM_PALETTE   = 0x100,
		PFD_SWAP_EXCHANGE         = 0x200,
		PFD_SWAP_COPY             = 0x400,
		PFD_SWAP_LAYER_BUFFERS    = 0x800,
		PFD_GENERIC_ACCELERATED   = 0x1000,
		PFD_SUPPORT_DIRECTDRAW    = 0x2000,
		PFD_DIRECT3D_ACCELERATED  = 0x4000,
		PFD_SUPPORT_COMPOSITION   = 0x8000,
		PFD_DEPTH_DONTCARE        = 0x20000000,
		PFD_DOUBLEBUFFER_DONTCARE = 0x40000000,
		PFD_STEREO_DONTCARE       = 0x80000000;

	/** {@link PIXELFORMATDESCRIPTOR} pixel types. */
	public static final int
		PFD_TYPE_RGBA       = 0x0,
		PFD_TYPE_COLORINDEX = 0x1;

	/** {@link PIXELFORMATDESCRIPTOR} layer types. */
	public static final int
		PFD_MAIN_PLANE     = 0x0,
		PFD_OVERLAY_PLANE  = 0x1,
		PFD_UNDERLAY_PLANE = 0xFFFFFFFF;

	static { Library.initialize(); }

	/** Function address. */
	@JavadocExclude
	public final long
		__ChoosePixelFormat,
		__DescribePixelFormat,
		__GetPixelFormat,
		__SetPixelFormat,
		__SwapBuffers;

	@JavadocExclude
	protected GDI32() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GDI32(FunctionProvider provider) {
		__ChoosePixelFormat = checkFunctionAddress(provider.getFunctionAddress("ChoosePixelFormat"));
		__DescribePixelFormat = checkFunctionAddress(provider.getFunctionAddress("DescribePixelFormat"));
		__GetPixelFormat = checkFunctionAddress(provider.getFunctionAddress("GetPixelFormat"));
		__SetPixelFormat = checkFunctionAddress(provider.getFunctionAddress("SetPixelFormat"));
		__SwapBuffers = checkFunctionAddress(provider.getFunctionAddress("SwapBuffers"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary GDI32;

	private static final GDI32 instance;

	static {
		GDI32 = Library.loadNative("gdi32");
		instance = new GDI32(GDI32);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GDI32;
	}

	/** Returns the {@link GDI32} instance. */
	public static GDI32 getInstance() {
		return instance;
	}

	// --- [ ChoosePixelFormat ] ---

	/** JNI method for {@link #ChoosePixelFormat} */
	@JavadocExclude
	public static native int nChoosePixelFormat(long __functionAddress, long hdc, long pixelFormatDescriptor);

	/** Unsafe version of {@link #ChoosePixelFormat} */
	@JavadocExclude
	public static int nChoosePixelFormat(long hdc, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().__ChoosePixelFormat;
		if ( CHECKS )
			checkPointer(hdc);
		return nChoosePixelFormat(__functionAddress, hdc, pixelFormatDescriptor);
	}

	/**
	 * Attempts to match an appropriate pixel format supported by a device context to a given pixel format specification.
	 *
	 * @param hdc                   the device context that the function examines to determine the best match for the pixel format descriptor pointed to by {@code pixelFormatDescriptor}
	 * @param pixelFormatDescriptor a {@link PIXELFORMATDESCRIPTOR} structure that specifies the requested pixel format
	 */
	public static int ChoosePixelFormat(long hdc, PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
		return nChoosePixelFormat(hdc, pixelFormatDescriptor.address());
	}

	// --- [ DescribePixelFormat ] ---

	/** JNI method for {@link #DescribePixelFormat} */
	@JavadocExclude
	public static native int nDescribePixelFormat(long __functionAddress, long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor);

	/** Unsafe version of {@link #DescribePixelFormat} */
	@JavadocExclude
	public static int nDescribePixelFormat(long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().__DescribePixelFormat;
		if ( CHECKS )
			checkPointer(hdc);
		return nDescribePixelFormat(__functionAddress, hdc, pixelFormat, bytes, pixelFormatDescriptor);
	}

	/**
	 * Obtains information about the pixel format identified by pixelFormat of the device associated with dc. The function sets the members of the
	 * {@link PIXELFORMATDESCRIPTOR} structure pointed to by pixelFormatDescriptor with that pixel format data. The return value is the maximum pixel format
	 * index of the device context.
	 *
	 * @param hdc                   the device context
	 * @param pixelFormat           index that specifies the pixel format. The pixel formats that a device context supports are identified by positive one-based integer indexes.
	 * @param bytes                 the size, in bytes, of the structure pointed to by {@code pixelFormatDescriptor}. The {@code wglDescribePixelFormat} function stores no more than
	 *                              {@code bytes} bytes of data to that structure. Set this value to {@link PIXELFORMATDESCRIPTOR#SIZEOF}.
	 * @param pixelFormatDescriptor a {@link PIXELFORMATDESCRIPTOR} structure whose members the function sets with pixel format data. The function stores the number of bytes copied to
	 *                              the structure in the structure's {@code size} member. If, upon entry, {@code pixelFormatDescriptor} is {@code NULL}, the function writes no data to the
	 *                              structure. This is useful when you only want to obtain the maximum pixel format index of a device context.
	 */
	public static int DescribePixelFormat(long hdc, int pixelFormat, int bytes, PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
		return nDescribePixelFormat(hdc, pixelFormat, bytes, pixelFormatDescriptor == null ? NULL : pixelFormatDescriptor.address());
	}

	/** Alternative version of: {@link #DescribePixelFormat} */
	public static int DescribePixelFormat(long hdc, int pixelFormat, PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
		return nDescribePixelFormat(hdc, pixelFormat, PIXELFORMATDESCRIPTOR.SIZEOF, pixelFormatDescriptor == null ? NULL : pixelFormatDescriptor.address());
	}

	// --- [ GetPixelFormat ] ---

	/** JNI method for {@link #GetPixelFormat} */
	@JavadocExclude
	public static native int nGetPixelFormat(long __functionAddress, long hdc);

	/**
	 * Obtains the index of the currently selected pixel format of the specified device context.
	 *
	 * @param hdc the device context of the currently selected pixel format index returned by the function
	 */
	public static int GetPixelFormat(long hdc) {
		long __functionAddress = getInstance().__GetPixelFormat;
		if ( CHECKS )
			checkPointer(hdc);
		return nGetPixelFormat(__functionAddress, hdc);
	}

	// --- [ SetPixelFormat ] ---

	/** JNI method for {@link #SetPixelFormat} */
	@JavadocExclude
	public static native int nSetPixelFormat(long __functionAddress, long hdc, int pixelFormat, long pixelFormatDescriptor);

	/** Unsafe version of {@link #SetPixelFormat} */
	@JavadocExclude
	public static int nSetPixelFormat(long hdc, int pixelFormat, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().__SetPixelFormat;
		if ( CHECKS )
			checkPointer(hdc);
		return nSetPixelFormat(__functionAddress, hdc, pixelFormat, pixelFormatDescriptor);
	}

	/**
	 * Sets the pixel format of the specified device context to the format specified by the pixelFormat index.
	 *
	 * @param hdc                   the device context whose pixel format the function attempts to set
	 * @param pixelFormat           index that identifies the pixel format to set. The various pixel formats supported by a device context are identified by one-based indexes.
	 * @param pixelFormatDescriptor a {@link PIXELFORMATDESCRIPTOR} structure that contains the logical pixel format specification. The system's metafile component uses this structure
	 *                              to record the logical pixel format specification. The structure has no other effect upon the behavior of the SetPixelFormat function.
	 */
	public static int SetPixelFormat(long hdc, int pixelFormat, PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
		return nSetPixelFormat(hdc, pixelFormat, pixelFormatDescriptor == null ? NULL : pixelFormatDescriptor.address());
	}

	// --- [ SwapBuffers ] ---

	/** JNI method for {@link #SwapBuffers} */
	@JavadocExclude
	public static native int nSwapBuffers(long __functionAddress, long dc);

	/**
	 * Exchanges the front and back buffers if the current pixel format for the window referenced by the specified device context includes a back buffer.
	 *
	 * @param dc a device context. If the current pixel format for the window referenced by this device context includes a back buffer, the function exchanges the
	 *           front and back buffers.
	 */
	public static int SwapBuffers(long dc) {
		long __functionAddress = getInstance().__SwapBuffers;
		if ( CHECKS )
			checkPointer(dc);
		return nSwapBuffers(__functionAddress, dc);
	}

}