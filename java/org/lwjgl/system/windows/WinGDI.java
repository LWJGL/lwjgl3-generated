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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to WinGDI.h */
public final class WinGDI {

	/** DEVMODE field selection bits. */
	public static final int
		DM_DISPLAYORIENTATION = 0x80,
		DM_LOGPIXELS          = 0x20000,
		DM_BITSPERPEL         = 0x40000,
		DM_PELSWIDTH          = 0x80000,
		DM_PELSHEIGHT         = 0x100000,
		DM_DISPLAYFLAGS       = 0x200000,
		DM_DISPLAYFREQUENCY   = 0x400000,
		DM_DISPLAYFIXEDOUTPUT = 0x20000000;

	/** Stock logical objects. */
	public static final int
		WHITE_BRUSH         = 0x0,
		LTGRAY_BRUSH        = 0x1,
		GRAY_BRUSH          = 0x2,
		DKGRAY_BRUSH        = 0x3,
		BLACK_BRUSH         = 0x4,
		NULL_BRUSH          = 0x5,
		HOLLOW_BRUSH        = NULL_BRUSH,
		WHITE_PEN           = 0x6,
		BLACK_PEN           = 0x7,
		NULL_PEN            = 0x8,
		OEM_FIXED_FONT      = 0xA,
		ANSI_FIXED_FONT     = 0xB,
		ANSI_VAR_FONT       = 0xC,
		SYSTEM_FONT         = 0xD,
		DEVICE_DEFAULT_FONT = 0xE,
		DEFAULT_PALETTE     = 0xF,
		SYSTEM_FIXED_FONT   = 0x10,
		DEFAULT_GUI_FONT    = 0x11,
		DC_BRUSH            = 0x12,
		DC_PEN              = 0x13;

	/** Object types for {@link #EnumObjects} and {@link #GetCurrentObject}. */
	public static final int
		OBJ_PEN         = 0x1,
		OBJ_BRUSH       = 0x2,
		OBJ_DC          = 0x3,
		OBJ_METADC      = 0x4,
		OBJ_PAL         = 0x5,
		OBJ_FONT        = 0x6,
		OBJ_BITMAP      = 0x7,
		OBJ_REGION      = 0x8,
		OBJ_METAFILE    = 0x9,
		OBJ_MEMDC       = 0xA,
		OBJ_EXTPEN      = 0xB,
		OBJ_ENHMETADC   = 0xC,
		OBJ_ENHMETAFILE = 0xD,
		OBJ_COLORSPACE  = 0xE;

	/** Used by the index parameter of {@link #GetDeviceCaps}. */
	public static final int
		DRIVERVERSION  = 0x0,
		TECHNOLOGY     = 0x2,
		HORZSIZE       = 0x4,
		VERTSIZE       = 0x6,
		HORZRES        = 0x8,
		VERTRES        = 0xA,
		BITSPIXEL      = 0xC,
		PLANES         = 0xE,
		NUMBRUSHES     = 0x10,
		NUMPENS        = 0x12,
		NUMMARKERS     = 0x14,
		NUMFONTS       = 0x16,
		NUMCOLORS      = 0x18,
		PDEVICESIZE    = 0x1A,
		CURVECAPS      = 0x1C,
		LINECAPS       = 0x1E,
		POLYGONALCAPS  = 0x20,
		TEXTCAPS       = 0x22,
		CLIPCAPS       = 0x24,
		RASTERCAPS     = 0x26,
		ASPECTX        = 0x28,
		ASPECTY        = 0x2A,
		ASPECTXY       = 0x2C,
		LOGPIXELSX     = 0x58,
		LOGPIXELSY     = 0x5A,
		SIZEPALETTE    = 0x68,
		NUMRESERVED    = 0x6A,
		COLORRES       = 0x6C,
		VREFRESH       = 0x74,
		DESKTOPVERTRES = 0x75,
		DESKTOPHORZRES = 0x76,
		BLTALIGNMENT   = 0x77,
		SHADEBLENDCAPS = 0x78,
		COLORMGMTCAPS  = 0x79;

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

	static { LWJGLUtil.initialize(); }

	private WinGDI() {}

	// --- [ GetStockObject ] ---

	/**
	 * Retrieves a handle to one of the stock pens, brushes, fonts, or palettes.
	 *
	 * @param object the type of stock object
	 */
	public static native long GetStockObject(int object);

	// --- [ EnumObjects ] ---

	/** JNI method for {@link #EnumObjects} */
	@JavadocExclude
	public static native int nEnumObjects(long hdc, int objectType, long objectFunc, long param);

	/**
	 * Enumerates the pens or brushes available for the specified device context (DC). This function calls the application-defined callback function once for
	 * each available object, supplying data describing that object. EnumObjects continues calling the callback function until the callback function returns
	 * zero or until all of the objects have been enumerated.
	 *
	 * @param hdc        a handle to the DC
	 * @param objectType the object type. One of:<br>{@link #OBJ_BRUSH}, {@link #OBJ_PEN}
	 * @param objectFunc the application-defined callback function
	 * @param param      the data passed to the callback function along with the object information.
	 */
	public static int EnumObjects(long hdc, int objectType, EnumObjectsCallback objectFunc, long param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nEnumObjects(hdc, objectType, objectFunc.getPointer(), param);
	}

	// --- [ SelectObject ] ---

	/** JNI method for {@link #SelectObject} */
	@JavadocExclude
	public static native long nSelectObject(long hdc, long object);

	/**
	 * Selects an object into the specified device context (DC). The new object replaces the previous object of the same type.
	 *
	 * @param hdc    a handle to the DC
	 * @param object a handle to the object to be selected
	 */
	public static long SelectObject(long hdc, long object) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkPointer(object);
		}
		return nSelectObject(hdc, object);
	}

	// --- [ GetCurrentObject ] ---

	/** JNI method for {@link #GetCurrentObject} */
	@JavadocExclude
	public static native long nGetCurrentObject(long hdc, int objectType);

	/**
	 * Retrieves a handle to an object of the specified type that has been selected into the specified device context (DC).
	 *
	 * @param hdc        a handle to the DC
	 * @param objectType the object type to be queried
	 */
	public static long GetCurrentObject(long hdc, int objectType) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nGetCurrentObject(hdc, objectType);
	}

	// --- [ GetObjectType ] ---

	/** JNI method for {@link #GetObjectType} */
	@JavadocExclude
	public static native int nGetObjectType(long object);

	/**
	 * Retrieves the type of the specified object.
	 *
	 * @param object a handle to the graphics object
	 */
	public static int GetObjectType(long object) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(object);
		return nGetObjectType(object);
	}

	// --- [ DeleteObject ] ---

	/** JNI method for {@link #DeleteObject} */
	@JavadocExclude
	public static native int nDeleteObject(long object);

	/**
	 * Deletes a logical pen, brush, font, bitmap, region, or palette, freeing all system resources associated with the object. After the object is deleted,
	 * the specified handle is no longer valid.
	 *
	 * @param object a handle to a logical pen, brush, font, bitmap, region, or palette
	 */
	public static int DeleteObject(long object) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(object);
		return nDeleteObject(object);
	}

	// --- [ CreateDC ] ---

	/** JNI method for {@link #CreateDC} */
	@JavadocExclude
	public static native long nCreateDC(long lpszDriver, long lpszDevice, long lpszOutput, long lpInitData);

	/**
	 * Creates a device context (DC) for a device using the specified name.
	 *
	 * @param lpszDriver A pointer to a null-terminated character string that specifies either DISPLAY or the name of a specific display device. For printing, we recommend
	 *                   that you pass {@code NULL} to {@code lpszDriver} because GDI ignores {@code lpszDriver} for printer devices.
	 * @param lpszDevice A pointer to a null-terminated character string that specifies the name of the specific output device being used, as shown by the Print Manager (for
	 *                   example, Epson FX-80). It is not the printer model name. The {@code lpszDevice} parameter must be used.
	 *                   
	 *                   <p>To obtain valid names for displays, call {@link #EnumDisplayDevices}.</p>
	 *                   
	 *                   <p>If {@code lpszDriver} is DISPLAY or the device name of a specific display device, then {@code lpszDevice} must be {@code NULL} or that same device name. If
	 *                   {@code lpszDevice} is {@code NULL}, then a DC is created for the primary display device.</p>
	 *                   
	 *                   <p>If there are multiple monitors on the system, calling {@code CreateDC(TEXT("DISPLAY"),NULL,NULL,NULL)} will create a DC covering all the monitors.</p>
	 * @param lpszOutput this parameter is ignored and should be set to {@code NULL}
	 * @param lpInitData A pointer to a {@link DEVMODE} structure containing device-specific initialization data for the device driver. The {@code DocumentProperties}
	 *                   function retrieves this structure filled in for a specified device. The {@code lpInitData} parameter must be {@code NULL} if the device driver is to use
	 *                   the default initialization (if any) specified by the user.
	 *                   
	 *                   <p>If {@code lpszDriver} is DISPLAY, {@code lpInitData} must be {@code NULL}; GDI then uses the display device's current {@link DEVMODE}.</p>
	 */
	public static long CreateDC(ByteBuffer lpszDriver, ByteBuffer lpszDevice, ByteBuffer lpszOutput, ByteBuffer lpInitData) {
		if ( LWJGLUtil.CHECKS ) {
			if ( lpszDriver != null ) checkNT2(lpszDriver);
			if ( lpszDevice != null ) checkNT2(lpszDevice);
			if ( lpInitData != null ) checkBuffer(lpInitData, DEVMODE.SIZEOF);
		}
		return nCreateDC(memAddressSafe(lpszDriver), memAddressSafe(lpszDevice), memAddressSafe(lpszOutput), memAddressSafe(lpInitData));
	}

	/** CharSequence version of: {@link #CreateDC} */
	public static long CreateDC(CharSequence lpszDriver, CharSequence lpszDevice, ByteBuffer lpszOutput, ByteBuffer lpInitData) {
		if ( LWJGLUtil.CHECKS )
			if ( lpInitData != null ) checkBuffer(lpInitData, DEVMODE.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int lpszDriverEncoded = __buffer.stringParamUTF16(lpszDriver, true);
		int lpszDeviceEncoded = __buffer.stringParamUTF16(lpszDevice, true);
		return nCreateDC(__buffer.addressSafe(lpszDriver, lpszDriverEncoded), __buffer.addressSafe(lpszDevice, lpszDeviceEncoded), memAddressSafe(lpszOutput), memAddressSafe(lpInitData));
	}

	// --- [ CreateCompatibleDC ] ---

	/**
	 * Creates a memory device context (DC) compatible with the specified device.
	 *
	 * @param hdc a handle to an existing DC. If this handle is {@code NULL}, the function creates a memory DC compatible with the application's current screen.
	 */
	public static native long CreateCompatibleDC(long hdc);

	// --- [ DeleteDC ] ---

	/** JNI method for {@link #DeleteDC} */
	@JavadocExclude
	public static native int nDeleteDC(long hdc);

	/**
	 * Deletes the specified device context (DC).
	 *
	 * @param hdc a handle to the device context
	 */
	public static int DeleteDC(long hdc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nDeleteDC(hdc);
	}

	// --- [ CancelDC ] ---

	/** JNI method for {@link #CancelDC} */
	@JavadocExclude
	public static native int nCancelDC(long hdc);

	/**
	 * Cancels any pending operation on the specified device context (DC).
	 *
	 * @param hdc a handle to the DC
	 */
	public static int CancelDC(long hdc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nCancelDC(hdc);
	}

	// --- [ SaveDC ] ---

	/** JNI method for {@link #SaveDC} */
	@JavadocExclude
	public static native int nSaveDC(long hdc);

	/**
	 * Saves the current state of the specified device context (DC) by copying data describing selected objects and graphic modes (such as the bitmap, brush,
	 * palette, font, pen, region, drawing mode, and mapping mode) to a context stack.
	 *
	 * @param hdc a handle to the DC whose state is to be saved
	 */
	public static int SaveDC(long hdc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nSaveDC(hdc);
	}

	// --- [ RestoreDC ] ---

	/** JNI method for {@link #RestoreDC} */
	@JavadocExclude
	public static native int nRestoreDC(long hdc, int savedDC);

	/**
	 * Restores a device context (DC) to the specified state. The DC is restored by popping state information off a stack created by earlier calls to the
	 * {@link #SaveDC} function.
	 *
	 * @param hdc     a handle to the DC
	 * @param savedDC the saved state to be restored. If this parameter is positive, {@code savedDC} represents a specific instance of the state to be restored. If this
	 *                parameter is negative, {@code savedDC} represents an instance relative to the current state. For example, -1 restores the most recently saved state.
	 */
	public static int RestoreDC(long hdc, int savedDC) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nRestoreDC(hdc, savedDC);
	}

	// --- [ GetDCOrgEx ] ---

	/** JNI method for {@link #GetDCOrgEx} */
	@JavadocExclude
	public static native int nGetDCOrgEx(long hdc, long point);

	/**
	 * Retrieves the final translation origin for a specified device context (DC). The final translation origin specifies an offset that the system uses to
	 * translate device coordinates into client coordinates (for coordinates in an application's window).
	 *
	 * @param hdc   a handle to the DC whose final translation origin is to be retrieved
	 * @param point a {@link POINT} structure that receives the final translation origin, in device coordinates
	 */
	public static int GetDCOrgEx(long hdc, ByteBuffer point) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkBuffer(point, POINT.SIZEOF);
		}
		return nGetDCOrgEx(hdc, memAddress(point));
	}

	// --- [ GetDeviceCaps ] ---

	/** JNI method for {@link #GetDeviceCaps} */
	@JavadocExclude
	public static native int nGetDeviceCaps(long hdc, int index);

	/**
	 * Retrieves device-specific information for the specified device.
	 *
	 * @param hdc   a handle to the DC
	 * @param index the item to be returned
	 */
	public static int GetDeviceCaps(long hdc, int index) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nGetDeviceCaps(hdc, index);
	}

	// --- [ GetDeviceGammaRamp ] ---

	/** JNI method for {@link #GetDeviceGammaRamp} */
	@JavadocExclude
	public static native int nGetDeviceGammaRamp(long hdc, long lpRamp);

	/**
	 * Sets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.
	 *
	 * @param hdc    the device context of the direct color display board in question
	 * @param lpRamp pointer to a buffer containing the gamma ramp to be set. The gamma ramp is specified in three arrays of 256 WORD elements each, which contain the
	 *               mapping between RGB values in the frame buffer and digital-analog-converter (DAC ) values. The sequence of the arrays is red, green, blue. The RGB
	 *               values must be stored in the most significant bits of each WORD to increase DAC independence.
	 */
	public static int GetDeviceGammaRamp(long hdc, long lpRamp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkPointer(lpRamp);
		}
		return nGetDeviceGammaRamp(hdc, lpRamp);
	}

	// --- [ SetDeviceGammaRamp ] ---

	/** JNI method for {@link #SetDeviceGammaRamp} */
	@JavadocExclude
	public static native int nSetDeviceGammaRamp(long hdc, long lpRamp);

	/**
	 * Gets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.
	 *
	 * @param hdc    the device context of the direct color display board in question
	 * @param lpRamp points to a buffer where the function can place the current gamma ramp of the color display board. The gamma ramp is specified in three arrays of
	 *               256 WORD elements each, which contain the mapping between RGB values in the frame buffer and digital-analog-converter (DAC) values. The sequence of
	 *               the arrays is red, green, blue.
	 */
	public static int SetDeviceGammaRamp(long hdc, long lpRamp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkPointer(lpRamp);
		}
		return nSetDeviceGammaRamp(hdc, lpRamp);
	}

	// --- [ ChoosePixelFormat ] ---

	/** JNI method for {@link #ChoosePixelFormat} */
	@JavadocExclude
	public static native int nChoosePixelFormat(long hdc, long pixelFormatDescriptor);

	/**
	 * Attempts to match an appropriate pixel format supported by a device context to a given pixel format specification.
	 *
	 * @param hdc                   the device context that the function examines to determine the best match for the pixel format descriptor pointed to by {@code pixelFormatDescriptor}
	 * @param pixelFormatDescriptor a {@link PIXELFORMATDESCRIPTOR} structure that specifies the requested pixel format
	 */
	public static int ChoosePixelFormat(long hdc, ByteBuffer pixelFormatDescriptor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkBuffer(pixelFormatDescriptor, PIXELFORMATDESCRIPTOR.SIZEOF);
		}
		return nChoosePixelFormat(hdc, memAddress(pixelFormatDescriptor));
	}

	// --- [ DescribePixelFormat ] ---

	/** JNI method for {@link #DescribePixelFormat} */
	@JavadocExclude
	public static native int nDescribePixelFormat(long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor);

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
	public static int DescribePixelFormat(long hdc, int pixelFormat, int bytes, ByteBuffer pixelFormatDescriptor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			if ( pixelFormatDescriptor != null ) checkBuffer(pixelFormatDescriptor, PIXELFORMATDESCRIPTOR.SIZEOF);
		}
		return nDescribePixelFormat(hdc, pixelFormat, bytes, memAddressSafe(pixelFormatDescriptor));
	}

	/** Alternative version of: {@link #DescribePixelFormat} */
	public static int DescribePixelFormat(long hdc, int pixelFormat, ByteBuffer pixelFormatDescriptor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			if ( pixelFormatDescriptor != null ) checkBuffer(pixelFormatDescriptor, PIXELFORMATDESCRIPTOR.SIZEOF);
		}
		return nDescribePixelFormat(hdc, pixelFormat, PIXELFORMATDESCRIPTOR.SIZEOF, memAddressSafe(pixelFormatDescriptor));
	}

	// --- [ GetPixelFormat ] ---

	/** JNI method for {@link #GetPixelFormat} */
	@JavadocExclude
	public static native int nGetPixelFormat(long hdc);

	/**
	 * Obtains the index of the currently selected pixel format of the specified device context.
	 *
	 * @param hdc the device context of the currently selected pixel format index returned by the function
	 */
	public static int GetPixelFormat(long hdc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nGetPixelFormat(hdc);
	}

	// --- [ SetPixelFormat ] ---

	/** JNI method for {@link #SetPixelFormat} */
	@JavadocExclude
	public static native int nSetPixelFormat(long hdc, int pixelFormat, long pixelFormatDescriptor);

	/**
	 * Sets the pixel format of the specified device context to the format specified by the pixelFormat index.
	 *
	 * @param hdc                   the device context whose pixel format the function attempts to set
	 * @param pixelFormat           index that identifies the pixel format to set. The various pixel formats supported by a device context are identified by one-based indexes.
	 * @param pixelFormatDescriptor a {@link PIXELFORMATDESCRIPTOR} structure that contains the logical pixel format specification. The system's metafile component uses this structure
	 *                              to record the logical pixel format specification. The structure has no other effect upon the behavior of the SetPixelFormat function.
	 */
	public static int SetPixelFormat(long hdc, int pixelFormat, ByteBuffer pixelFormatDescriptor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hdc);
			checkBuffer(pixelFormatDescriptor, PIXELFORMATDESCRIPTOR.SIZEOF);
		}
		return nSetPixelFormat(hdc, pixelFormat, memAddress(pixelFormatDescriptor));
	}

	// --- [ SwapBuffers ] ---

	/** JNI method for {@link #SwapBuffers} */
	@JavadocExclude
	public static native int nSwapBuffers(long dc);

	/**
	 * Exchanges the front and back buffers if the current pixel format for the window referenced by the specified device context includes a back buffer.
	 *
	 * @param dc a device context. If the current pixel format for the window referenced by this device context includes a back buffer, the function exchanges the
	 *           front and back buffers.
	 */
	public static int SwapBuffers(long dc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(dc);
		return nSwapBuffers(dc);
	}

     /**
	 * Creates a {@link EnumObjectsCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EnumObjectsCallback} instance
	 */
	public static EnumObjectsCallback EnumObjectsCallback(final EnumObjectsCallback.SAM sam) {
		return new EnumObjectsCallback() {
			@Override
			public int invoke(long logObject, long data) {
				return sam.invoke(logObject, data);
			}
		};
	}

}