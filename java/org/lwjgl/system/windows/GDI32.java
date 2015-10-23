/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

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

	/** Function address. */
	@JavadocExclude
	public final long
		CreateCompatibleDCAddress,
		DeleteDCAddress,
		CancelDCAddress,
		SaveDCAddress,
		RestoreDCAddress,
		GetDCOrgExAddress,
		GetDeviceCapsAddress,
		GetDeviceGammaRampAddress,
		SetDeviceGammaRampAddress,
		ChoosePixelFormatAddress,
		DescribePixelFormatAddress,
		GetPixelFormatAddress,
		SetPixelFormatAddress,
		SwapBuffersAddress;

	@JavadocExclude
	protected GDI32() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GDI32(FunctionProvider provider) {
		CreateCompatibleDCAddress = checkFunctionAddress(provider.getFunctionAddress("CreateCompatibleDC"));
		DeleteDCAddress = checkFunctionAddress(provider.getFunctionAddress("DeleteDC"));
		CancelDCAddress = checkFunctionAddress(provider.getFunctionAddress("CancelDC"));
		SaveDCAddress = checkFunctionAddress(provider.getFunctionAddress("SaveDC"));
		RestoreDCAddress = checkFunctionAddress(provider.getFunctionAddress("RestoreDC"));
		GetDCOrgExAddress = checkFunctionAddress(provider.getFunctionAddress("GetDCOrgEx"));
		GetDeviceCapsAddress = checkFunctionAddress(provider.getFunctionAddress("GetDeviceCaps"));
		GetDeviceGammaRampAddress = checkFunctionAddress(provider.getFunctionAddress("GetDeviceGammaRamp"));
		SetDeviceGammaRampAddress = checkFunctionAddress(provider.getFunctionAddress("SetDeviceGammaRamp"));
		ChoosePixelFormatAddress = checkFunctionAddress(provider.getFunctionAddress("ChoosePixelFormat"));
		DescribePixelFormatAddress = checkFunctionAddress(provider.getFunctionAddress("DescribePixelFormat"));
		GetPixelFormatAddress = checkFunctionAddress(provider.getFunctionAddress("GetPixelFormat"));
		SetPixelFormatAddress = checkFunctionAddress(provider.getFunctionAddress("SetPixelFormat"));
		SwapBuffersAddress = checkFunctionAddress(provider.getFunctionAddress("SwapBuffers"));
	}

	// --- [ Function Addresses ] ---

	private static final DynamicLinkLibrary GDI32;

	private static final GDI32 instance;

	static {
		GDI32 = LWJGLUtil.loadLibraryNative("gdi32");
		instance = new GDI32(GDI32);
	}

	/** Returns the {@link GDI32} instance. */
	public static GDI32 getInstance() {
		return instance;
	}

	// --- [ CreateCompatibleDC ] ---

	/**
	 * Creates a memory device context (DC) compatible with the specified device.
	 *
	 * @param hdc a handle to an existing DC. If this handle is {@code NULL}, the function creates a memory DC compatible with the application's current screen.
	 */
	public static long CreateCompatibleDC(long hdc) {
		long __functionAddress = getInstance().CreateCompatibleDCAddress;
		return callPP(__functionAddress, hdc);
	}

	// --- [ DeleteDC ] ---

	/**
	 * Deletes the specified device context (DC).
	 *
	 * @param hdc a handle to the device context
	 */
	public static int DeleteDC(long hdc) {
		long __functionAddress = getInstance().DeleteDCAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPI(__functionAddress, hdc);
	}

	// --- [ CancelDC ] ---

	/**
	 * Cancels any pending operation on the specified device context (DC).
	 *
	 * @param hdc a handle to the DC
	 */
	public static int CancelDC(long hdc) {
		long __functionAddress = getInstance().CancelDCAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPI(__functionAddress, hdc);
	}

	// --- [ SaveDC ] ---

	/**
	 * Saves the current state of the specified device context (DC) by copying data describing selected objects and graphic modes (such as the bitmap, brush,
	 * palette, font, pen, region, drawing mode, and mapping mode) to a context stack.
	 *
	 * @param hdc a handle to the DC whose state is to be saved
	 */
	public static int SaveDC(long hdc) {
		long __functionAddress = getInstance().SaveDCAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPI(__functionAddress, hdc);
	}

	// --- [ RestoreDC ] ---

	/**
	 * Restores a device context (DC) to the specified state. The DC is restored by popping state information off a stack created by earlier calls to the
	 * {@link #SaveDC} function.
	 *
	 * @param hdc     a handle to the DC
	 * @param savedDC the saved state to be restored. If this parameter is positive, {@code savedDC} represents a specific instance of the state to be restored. If this
	 *                parameter is negative, {@code savedDC} represents an instance relative to the current state. For example, -1 restores the most recently saved state.
	 */
	public static int RestoreDC(long hdc, int savedDC) {
		long __functionAddress = getInstance().RestoreDCAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPII(__functionAddress, hdc, savedDC);
	}

	// --- [ GetDCOrgEx ] ---

	/** Unsafe version of {@link #GetDCOrgEx} */
	@JavadocExclude
	public static int nGetDCOrgEx(long hdc, long point) {
		long __functionAddress = getInstance().GetDCOrgExAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPPI(__functionAddress, hdc, point);
	}

	/**
	 * Retrieves the final translation origin for a specified device context (DC). The final translation origin specifies an offset that the system uses to
	 * translate device coordinates into client coordinates (for coordinates in an application's window).
	 *
	 * @param hdc   a handle to the DC whose final translation origin is to be retrieved
	 * @param point a {@link POINT} structure that receives the final translation origin, in device coordinates
	 */
	public static int GetDCOrgEx(long hdc, POINT point) {
		return nGetDCOrgEx(hdc, point.address());
	}

	// --- [ GetDeviceCaps ] ---

	/**
	 * Retrieves device-specific information for the specified device.
	 *
	 * @param hdc   a handle to the DC
	 * @param index the item to be returned
	 */
	public static int GetDeviceCaps(long hdc, int index) {
		long __functionAddress = getInstance().GetDeviceCapsAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPII(__functionAddress, hdc, index);
	}

	// --- [ GetDeviceGammaRamp ] ---

	/**
	 * Sets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.
	 *
	 * @param hdc    the device context of the direct color display board in question
	 * @param lpRamp pointer to a buffer containing the gamma ramp to be set. The gamma ramp is specified in three arrays of 256 WORD elements each, which contain the
	 *               mapping between RGB values in the frame buffer and digital-analog-converter (DAC ) values. The sequence of the arrays is red, green, blue. The RGB
	 *               values must be stored in the most significant bits of each WORD to increase DAC independence.
	 */
	public static int GetDeviceGammaRamp(long hdc, long lpRamp) {
		long __functionAddress = getInstance().GetDeviceGammaRampAddress;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkPointer(lpRamp);
		}
		return callPPI(__functionAddress, hdc, lpRamp);
	}

	// --- [ SetDeviceGammaRamp ] ---

	/**
	 * Gets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.
	 *
	 * @param hdc    the device context of the direct color display board in question
	 * @param lpRamp points to a buffer where the function can place the current gamma ramp of the color display board. The gamma ramp is specified in three arrays of
	 *               256 WORD elements each, which contain the mapping between RGB values in the frame buffer and digital-analog-converter (DAC) values. The sequence of
	 *               the arrays is red, green, blue.
	 */
	public static int SetDeviceGammaRamp(long hdc, long lpRamp) {
		long __functionAddress = getInstance().SetDeviceGammaRampAddress;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkPointer(lpRamp);
		}
		return callPPI(__functionAddress, hdc, lpRamp);
	}

	// --- [ ChoosePixelFormat ] ---

	/** Unsafe version of {@link #ChoosePixelFormat} */
	@JavadocExclude
	public static int nChoosePixelFormat(long hdc, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().ChoosePixelFormatAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPPI(__functionAddress, hdc, pixelFormatDescriptor);
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

	/** Unsafe version of {@link #DescribePixelFormat} */
	@JavadocExclude
	public static int nDescribePixelFormat(long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().DescribePixelFormatAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPIIPI(__functionAddress, hdc, pixelFormat, bytes, pixelFormatDescriptor);
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

	/**
	 * Obtains the index of the currently selected pixel format of the specified device context.
	 *
	 * @param hdc the device context of the currently selected pixel format index returned by the function
	 */
	public static int GetPixelFormat(long hdc) {
		long __functionAddress = getInstance().GetPixelFormatAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPI(__functionAddress, hdc);
	}

	// --- [ SetPixelFormat ] ---

	/** Unsafe version of {@link #SetPixelFormat} */
	@JavadocExclude
	public static int nSetPixelFormat(long hdc, int pixelFormat, long pixelFormatDescriptor) {
		long __functionAddress = getInstance().SetPixelFormatAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return callPIPI(__functionAddress, hdc, pixelFormat, pixelFormatDescriptor);
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

	/**
	 * Exchanges the front and back buffers if the current pixel format for the window referenced by the specified device context includes a back buffer.
	 *
	 * @param dc a device context. If the current pixel format for the window referenced by this device context includes a back buffer, the function exchanges the
	 *           front and back buffers.
	 */
	public static int SwapBuffers(long dc) {
		long __functionAddress = getInstance().SwapBuffersAddress;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dc);
		return callPI(__functionAddress, dc);
	}

}