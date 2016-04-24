/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_pixel_format.txt">WGL_ARB_pixel_format</a> extension.
 * 
 * <p>This extension adds functions to query pixel format attributes and to choose from the list of supported pixel formats.</p>
 * 
 * <p>These functions treat pixel formats as opaque types: attributes are specified by name rather than by accessing them directly as fields in a structure.
 * Thus the list of attributes can be easily extended.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}.</p>
 */
public class WGLARBPixelFormat {

	/**
	 * Accepted in the {@code attributes} parameter array of {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}, and {@link #wglGetPixelFormatAttribfvARB GetPixelFormatAttribfvARB}, and as a type in
	 * the {@code attribIList} and {@code attribFList} parameter arrays of {@link #wglChoosePixelFormatARB ChoosePixelFormatARB}.
	 */
	public static final int
		WGL_NUMBER_PIXEL_FORMATS_ARB    = 0x2000,
		WGL_DRAW_TO_WINDOW_ARB          = 0x2001,
		WGL_DRAW_TO_BITMAP_ARB          = 0x2002,
		WGL_ACCELERATION_ARB            = 0x2003,
		WGL_NEED_PALETTE_ARB            = 0x2004,
		WGL_NEED_SYSTEM_PALETTE_ARB     = 0x2005,
		WGL_SWAP_LAYER_BUFFERS_ARB      = 0x2006,
		WGL_SWAP_METHOD_ARB             = 0x2007,
		WGL_NUMBER_OVERLAYS_ARB         = 0x2008,
		WGL_NUMBER_UNDERLAYS_ARB        = 0x2009,
		WGL_TRANSPARENT_ARB             = 0x200A,
		WGL_TRANSPARENT_RED_VALUE_ARB   = 0x2037,
		WGL_TRANSPARENT_GREEN_VALUE_ARB = 0x2038,
		WGL_TRANSPARENT_BLUE_VALUE_ARB  = 0x2039,
		WGL_TRANSPARENT_ALPHA_VALUE_ARB = 0x203A,
		WGL_TRANSPARENT_INDEX_VALUE_ARB = 0x203B,
		WGL_SHARE_DEPTH_ARB             = 0x200C,
		WGL_SHARE_STENCIL_ARB           = 0x200D,
		WGL_SHARE_ACCUM_ARB             = 0x200E,
		WGL_SUPPORT_GDI_ARB             = 0x200F,
		WGL_SUPPORT_OPENGL_ARB          = 0x2010,
		WGL_DOUBLE_BUFFER_ARB           = 0x2011,
		WGL_STEREO_ARB                  = 0x2012,
		WGL_PIXEL_TYPE_ARB              = 0x2013,
		WGL_COLOR_BITS_ARB              = 0x2014,
		WGL_RED_BITS_ARB                = 0x2015,
		WGL_RED_SHIFT_ARB               = 0x2016,
		WGL_GREEN_BITS_ARB              = 0x2017,
		WGL_GREEN_SHIFT_ARB             = 0x2018,
		WGL_BLUE_BITS_ARB               = 0x2019,
		WGL_BLUE_SHIFT_ARB              = 0x201A,
		WGL_ALPHA_BITS_ARB              = 0x201B,
		WGL_ALPHA_SHIFT_ARB             = 0x201C,
		WGL_ACCUM_BITS_ARB              = 0x201D,
		WGL_ACCUM_RED_BITS_ARB          = 0x201E,
		WGL_ACCUM_GREEN_BITS_ARB        = 0x201F,
		WGL_ACCUM_BLUE_BITS_ARB         = 0x2020,
		WGL_ACCUM_ALPHA_BITS_ARB        = 0x2021,
		WGL_DEPTH_BITS_ARB              = 0x2022,
		WGL_STENCIL_BITS_ARB            = 0x2023,
		WGL_AUX_BUFFERS_ARB             = 0x2024;

	/**
	 * Accepted as a value in the {@code attribIList} and {@code attribFList} parameter arrays of {@link #wglChoosePixelFormatARB ChoosePixelFormatARB}, and returned in the
	 * {@code values} parameter array of {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB} and {@link #wglGetPixelFormatAttribfvARB GetPixelFormatAttribfvARB}.
	 */
	public static final int
		WGL_NO_ACCELERATION_ARB      = 0x2025,
		WGL_GENERIC_ACCELERATION_ARB = 0x2026,
		WGL_FULL_ACCELERATION_ARB    = 0x2027,
		WGL_SWAP_EXCHANGE_ARB        = 0x2028,
		WGL_SWAP_COPY_ARB            = 0x2029,
		WGL_SWAP_UNDEFINED_ARB       = 0x202A,
		WGL_TYPE_RGBA_ARB            = 0x202B,
		WGL_TYPE_COLORINDEX_ARB      = 0x202C;

	protected WGLARBPixelFormat() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglGetPixelFormatAttribivARB, caps.wglGetPixelFormatAttribfvARB, caps.wglChoosePixelFormatARB
		);
	}

	// --- [ wglGetPixelFormatAttribivARB ] ---

	/**
	 * 
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param n           the number of attributes being queried
	 * @param attributes  an array of pixel format attribute identifiers which specify the attributes to be queried. One of:<br><table><tr><td>{@link #WGL_NUMBER_PIXEL_FORMATS_ARB NUMBER_PIXEL_FORMATS_ARB}</td><td>{@link #WGL_DRAW_TO_WINDOW_ARB DRAW_TO_WINDOW_ARB}</td><td>{@link #WGL_DRAW_TO_BITMAP_ARB DRAW_TO_BITMAP_ARB}</td><td>{@link #WGL_ACCELERATION_ARB ACCELERATION_ARB}</td></tr><tr><td>{@link #WGL_NEED_PALETTE_ARB NEED_PALETTE_ARB}</td><td>{@link #WGL_NEED_SYSTEM_PALETTE_ARB NEED_SYSTEM_PALETTE_ARB}</td><td>{@link #WGL_SWAP_LAYER_BUFFERS_ARB SWAP_LAYER_BUFFERS_ARB}</td><td>{@link #WGL_SWAP_METHOD_ARB SWAP_METHOD_ARB}</td></tr><tr><td>{@link #WGL_NUMBER_OVERLAYS_ARB NUMBER_OVERLAYS_ARB}</td><td>{@link #WGL_NUMBER_UNDERLAYS_ARB NUMBER_UNDERLAYS_ARB}</td><td>{@link #WGL_TRANSPARENT_ARB TRANSPARENT_ARB}</td><td>{@link #WGL_TRANSPARENT_RED_VALUE_ARB TRANSPARENT_RED_VALUE_ARB}</td></tr><tr><td>{@link #WGL_TRANSPARENT_GREEN_VALUE_ARB TRANSPARENT_GREEN_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_BLUE_VALUE_ARB TRANSPARENT_BLUE_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_ALPHA_VALUE_ARB TRANSPARENT_ALPHA_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_INDEX_VALUE_ARB TRANSPARENT_INDEX_VALUE_ARB}</td></tr><tr><td>{@link #WGL_SHARE_DEPTH_ARB SHARE_DEPTH_ARB}</td><td>{@link #WGL_SHARE_STENCIL_ARB SHARE_STENCIL_ARB}</td><td>{@link #WGL_SHARE_ACCUM_ARB SHARE_ACCUM_ARB}</td><td>{@link #WGL_SUPPORT_GDI_ARB SUPPORT_GDI_ARB}</td></tr><tr><td>{@link #WGL_SUPPORT_OPENGL_ARB SUPPORT_OPENGL_ARB}</td><td>{@link #WGL_DOUBLE_BUFFER_ARB DOUBLE_BUFFER_ARB}</td><td>{@link #WGL_STEREO_ARB STEREO_ARB}</td><td>{@link #WGL_PIXEL_TYPE_ARB PIXEL_TYPE_ARB}</td></tr><tr><td>{@link #WGL_COLOR_BITS_ARB COLOR_BITS_ARB}</td><td>{@link #WGL_RED_BITS_ARB RED_BITS_ARB}</td><td>{@link #WGL_RED_SHIFT_ARB RED_SHIFT_ARB}</td><td>{@link #WGL_GREEN_BITS_ARB GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_GREEN_SHIFT_ARB GREEN_SHIFT_ARB}</td><td>{@link #WGL_BLUE_BITS_ARB BLUE_BITS_ARB}</td><td>{@link #WGL_BLUE_SHIFT_ARB BLUE_SHIFT_ARB}</td><td>{@link #WGL_ALPHA_BITS_ARB ALPHA_BITS_ARB}</td></tr><tr><td>{@link #WGL_ALPHA_SHIFT_ARB ALPHA_SHIFT_ARB}</td><td>{@link #WGL_ACCUM_BITS_ARB ACCUM_BITS_ARB}</td><td>{@link #WGL_ACCUM_RED_BITS_ARB ACCUM_RED_BITS_ARB}</td><td>{@link #WGL_ACCUM_GREEN_BITS_ARB ACCUM_GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_ACCUM_BLUE_BITS_ARB ACCUM_BLUE_BITS_ARB}</td><td>{@link #WGL_ACCUM_ALPHA_BITS_ARB ACCUM_ALPHA_BITS_ARB}</td><td>{@link #WGL_DEPTH_BITS_ARB DEPTH_BITS_ARB}</td><td>{@link #WGL_STENCIL_BITS_ARB STENCIL_BITS_ARB}</td></tr><tr><td>{@link #WGL_AUX_BUFFERS_ARB AUX_BUFFERS_ARB}</td></tr></table>
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static int nwglGetPixelFormatAttribivARB(long hdc, int pixelFormat, int layerPlane, int n, long attributes, long values) {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return callPPPI(__functionAddress, hdc, pixelFormat, layerPlane, n, attributes, values);
	}

	/**
	 * 
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param attributes  an array of pixel format attribute identifiers which specify the attributes to be queried. One of:<br><table><tr><td>{@link #WGL_NUMBER_PIXEL_FORMATS_ARB NUMBER_PIXEL_FORMATS_ARB}</td><td>{@link #WGL_DRAW_TO_WINDOW_ARB DRAW_TO_WINDOW_ARB}</td><td>{@link #WGL_DRAW_TO_BITMAP_ARB DRAW_TO_BITMAP_ARB}</td><td>{@link #WGL_ACCELERATION_ARB ACCELERATION_ARB}</td></tr><tr><td>{@link #WGL_NEED_PALETTE_ARB NEED_PALETTE_ARB}</td><td>{@link #WGL_NEED_SYSTEM_PALETTE_ARB NEED_SYSTEM_PALETTE_ARB}</td><td>{@link #WGL_SWAP_LAYER_BUFFERS_ARB SWAP_LAYER_BUFFERS_ARB}</td><td>{@link #WGL_SWAP_METHOD_ARB SWAP_METHOD_ARB}</td></tr><tr><td>{@link #WGL_NUMBER_OVERLAYS_ARB NUMBER_OVERLAYS_ARB}</td><td>{@link #WGL_NUMBER_UNDERLAYS_ARB NUMBER_UNDERLAYS_ARB}</td><td>{@link #WGL_TRANSPARENT_ARB TRANSPARENT_ARB}</td><td>{@link #WGL_TRANSPARENT_RED_VALUE_ARB TRANSPARENT_RED_VALUE_ARB}</td></tr><tr><td>{@link #WGL_TRANSPARENT_GREEN_VALUE_ARB TRANSPARENT_GREEN_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_BLUE_VALUE_ARB TRANSPARENT_BLUE_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_ALPHA_VALUE_ARB TRANSPARENT_ALPHA_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_INDEX_VALUE_ARB TRANSPARENT_INDEX_VALUE_ARB}</td></tr><tr><td>{@link #WGL_SHARE_DEPTH_ARB SHARE_DEPTH_ARB}</td><td>{@link #WGL_SHARE_STENCIL_ARB SHARE_STENCIL_ARB}</td><td>{@link #WGL_SHARE_ACCUM_ARB SHARE_ACCUM_ARB}</td><td>{@link #WGL_SUPPORT_GDI_ARB SUPPORT_GDI_ARB}</td></tr><tr><td>{@link #WGL_SUPPORT_OPENGL_ARB SUPPORT_OPENGL_ARB}</td><td>{@link #WGL_DOUBLE_BUFFER_ARB DOUBLE_BUFFER_ARB}</td><td>{@link #WGL_STEREO_ARB STEREO_ARB}</td><td>{@link #WGL_PIXEL_TYPE_ARB PIXEL_TYPE_ARB}</td></tr><tr><td>{@link #WGL_COLOR_BITS_ARB COLOR_BITS_ARB}</td><td>{@link #WGL_RED_BITS_ARB RED_BITS_ARB}</td><td>{@link #WGL_RED_SHIFT_ARB RED_SHIFT_ARB}</td><td>{@link #WGL_GREEN_BITS_ARB GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_GREEN_SHIFT_ARB GREEN_SHIFT_ARB}</td><td>{@link #WGL_BLUE_BITS_ARB BLUE_BITS_ARB}</td><td>{@link #WGL_BLUE_SHIFT_ARB BLUE_SHIFT_ARB}</td><td>{@link #WGL_ALPHA_BITS_ARB ALPHA_BITS_ARB}</td></tr><tr><td>{@link #WGL_ALPHA_SHIFT_ARB ALPHA_SHIFT_ARB}</td><td>{@link #WGL_ACCUM_BITS_ARB ACCUM_BITS_ARB}</td><td>{@link #WGL_ACCUM_RED_BITS_ARB ACCUM_RED_BITS_ARB}</td><td>{@link #WGL_ACCUM_GREEN_BITS_ARB ACCUM_GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_ACCUM_BLUE_BITS_ARB ACCUM_BLUE_BITS_ARB}</td><td>{@link #WGL_ACCUM_ALPHA_BITS_ARB ACCUM_ALPHA_BITS_ARB}</td><td>{@link #WGL_DEPTH_BITS_ARB DEPTH_BITS_ARB}</td><td>{@link #WGL_STENCIL_BITS_ARB STENCIL_BITS_ARB}</td></tr><tr><td>{@link #WGL_AUX_BUFFERS_ARB AUX_BUFFERS_ARB}</td></tr></table>
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static boolean wglGetPixelFormatAttribivARB(long hdc, int pixelFormat, int layerPlane, IntBuffer attributes, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, attributes.remaining());
		return nwglGetPixelFormatAttribivARB(hdc, pixelFormat, layerPlane, attributes.remaining(), memAddress(attributes), memAddress(values)) != 0;
	}

	/**
	 * 
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static boolean wglGetPixelFormatAttribiARB(long hdc, int pixelFormat, int layerPlane, int attribute, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attributes = stack.ints(attribute);
			return nwglGetPixelFormatAttribivARB(hdc, pixelFormat, layerPlane, 1, memAddress(attributes), memAddress(values)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ wglGetPixelFormatAttribfvARB ] ---

	/**
	 * Float version of {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}.
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param n           the number of attributes being queried
	 * @param attributes  an array of pixel format attribute identifiers which specify the attributes to be queried
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static int nwglGetPixelFormatAttribfvARB(long hdc, int pixelFormat, int layerPlane, int n, long attributes, long values) {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return callPPPI(__functionAddress, hdc, pixelFormat, layerPlane, n, attributes, values);
	}

	/**
	 * Float version of {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}.
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param attributes  an array of pixel format attribute identifiers which specify the attributes to be queried
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static boolean wglGetPixelFormatAttribfvARB(long hdc, int pixelFormat, int layerPlane, IntBuffer attributes, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, attributes.remaining());
		return nwglGetPixelFormatAttribfvARB(hdc, pixelFormat, layerPlane, attributes.remaining(), memAddress(attributes), memAddress(values)) != 0;
	}

	/**
	 * Float version of {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}.
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param pixelFormat an index that specifies the pixel format
	 * @param layerPlane  the plane being queried
	 * @param values      a buffer into which the results of the query will be placed
	 */
	public static boolean wglGetPixelFormatAttribfARB(long hdc, int pixelFormat, int layerPlane, int attribute, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attributes = stack.ints(attribute);
			return nwglGetPixelFormatAttribfvARB(hdc, pixelFormat, layerPlane, 1, memAddress(attributes), memAddress(values)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ wglChoosePixelFormatARB ] ---

	/**
	 * Selects from among all of the available pixel formats (including both accelerated and generic formats and non-displayable formats). This function
	 * accepts attributes for the main planes. A list of pixel formats that match the specified attributes is returned with the "best" pixel formats at the
	 * start of the list (order is device dependent).
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param attribIList a list of attribute {type, value} pairs containing integer attribute values. One of:<br><table><tr><td>{@link #WGL_NUMBER_PIXEL_FORMATS_ARB NUMBER_PIXEL_FORMATS_ARB}</td><td>{@link #WGL_DRAW_TO_WINDOW_ARB DRAW_TO_WINDOW_ARB}</td><td>{@link #WGL_DRAW_TO_BITMAP_ARB DRAW_TO_BITMAP_ARB}</td><td>{@link #WGL_ACCELERATION_ARB ACCELERATION_ARB}</td></tr><tr><td>{@link #WGL_NEED_PALETTE_ARB NEED_PALETTE_ARB}</td><td>{@link #WGL_NEED_SYSTEM_PALETTE_ARB NEED_SYSTEM_PALETTE_ARB}</td><td>{@link #WGL_SWAP_LAYER_BUFFERS_ARB SWAP_LAYER_BUFFERS_ARB}</td><td>{@link #WGL_SWAP_METHOD_ARB SWAP_METHOD_ARB}</td></tr><tr><td>{@link #WGL_NUMBER_OVERLAYS_ARB NUMBER_OVERLAYS_ARB}</td><td>{@link #WGL_NUMBER_UNDERLAYS_ARB NUMBER_UNDERLAYS_ARB}</td><td>{@link #WGL_TRANSPARENT_ARB TRANSPARENT_ARB}</td><td>{@link #WGL_TRANSPARENT_RED_VALUE_ARB TRANSPARENT_RED_VALUE_ARB}</td></tr><tr><td>{@link #WGL_TRANSPARENT_GREEN_VALUE_ARB TRANSPARENT_GREEN_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_BLUE_VALUE_ARB TRANSPARENT_BLUE_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_ALPHA_VALUE_ARB TRANSPARENT_ALPHA_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_INDEX_VALUE_ARB TRANSPARENT_INDEX_VALUE_ARB}</td></tr><tr><td>{@link #WGL_SHARE_DEPTH_ARB SHARE_DEPTH_ARB}</td><td>{@link #WGL_SHARE_STENCIL_ARB SHARE_STENCIL_ARB}</td><td>{@link #WGL_SHARE_ACCUM_ARB SHARE_ACCUM_ARB}</td><td>{@link #WGL_SUPPORT_GDI_ARB SUPPORT_GDI_ARB}</td></tr><tr><td>{@link #WGL_SUPPORT_OPENGL_ARB SUPPORT_OPENGL_ARB}</td><td>{@link #WGL_DOUBLE_BUFFER_ARB DOUBLE_BUFFER_ARB}</td><td>{@link #WGL_STEREO_ARB STEREO_ARB}</td><td>{@link #WGL_PIXEL_TYPE_ARB PIXEL_TYPE_ARB}</td></tr><tr><td>{@link #WGL_COLOR_BITS_ARB COLOR_BITS_ARB}</td><td>{@link #WGL_RED_BITS_ARB RED_BITS_ARB}</td><td>{@link #WGL_RED_SHIFT_ARB RED_SHIFT_ARB}</td><td>{@link #WGL_GREEN_BITS_ARB GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_GREEN_SHIFT_ARB GREEN_SHIFT_ARB}</td><td>{@link #WGL_BLUE_BITS_ARB BLUE_BITS_ARB}</td><td>{@link #WGL_BLUE_SHIFT_ARB BLUE_SHIFT_ARB}</td><td>{@link #WGL_ALPHA_BITS_ARB ALPHA_BITS_ARB}</td></tr><tr><td>{@link #WGL_ALPHA_SHIFT_ARB ALPHA_SHIFT_ARB}</td><td>{@link #WGL_ACCUM_BITS_ARB ACCUM_BITS_ARB}</td><td>{@link #WGL_ACCUM_RED_BITS_ARB ACCUM_RED_BITS_ARB}</td><td>{@link #WGL_ACCUM_GREEN_BITS_ARB ACCUM_GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_ACCUM_BLUE_BITS_ARB ACCUM_BLUE_BITS_ARB}</td><td>{@link #WGL_ACCUM_ALPHA_BITS_ARB ACCUM_ALPHA_BITS_ARB}</td><td>{@link #WGL_DEPTH_BITS_ARB DEPTH_BITS_ARB}</td><td>{@link #WGL_STENCIL_BITS_ARB STENCIL_BITS_ARB}</td></tr><tr><td>{@link #WGL_AUX_BUFFERS_ARB AUX_BUFFERS_ARB}</td></tr></table>
	 * @param attribFList a list of attribute {type, value} pairs containing floating point attribute values
	 * @param maxFormats  the number of attributes being queried
	 * @param formats     an array of returned indices of the matching pixel formats. The best pixel formats (i.e. closest match and best format for the hardware) are at the
	 *                    head of the list.
	 * @param numFormats  returns the number of matching formats
	 */
	public static int nwglChoosePixelFormatARB(long hdc, long attribIList, long attribFList, int maxFormats, long formats, long numFormats) {
		long __functionAddress = GL.getCapabilitiesWGL().wglChoosePixelFormatARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return callPPPPPI(__functionAddress, hdc, attribIList, attribFList, maxFormats, formats, numFormats);
	}

	/**
	 * Selects from among all of the available pixel formats (including both accelerated and generic formats and non-displayable formats). This function
	 * accepts attributes for the main planes. A list of pixel formats that match the specified attributes is returned with the "best" pixel formats at the
	 * start of the list (order is device dependent).
	 *
	 * @param hdc         the device context on which the pixel format is supported
	 * @param attribIList a list of attribute {type, value} pairs containing integer attribute values. One of:<br><table><tr><td>{@link #WGL_NUMBER_PIXEL_FORMATS_ARB NUMBER_PIXEL_FORMATS_ARB}</td><td>{@link #WGL_DRAW_TO_WINDOW_ARB DRAW_TO_WINDOW_ARB}</td><td>{@link #WGL_DRAW_TO_BITMAP_ARB DRAW_TO_BITMAP_ARB}</td><td>{@link #WGL_ACCELERATION_ARB ACCELERATION_ARB}</td></tr><tr><td>{@link #WGL_NEED_PALETTE_ARB NEED_PALETTE_ARB}</td><td>{@link #WGL_NEED_SYSTEM_PALETTE_ARB NEED_SYSTEM_PALETTE_ARB}</td><td>{@link #WGL_SWAP_LAYER_BUFFERS_ARB SWAP_LAYER_BUFFERS_ARB}</td><td>{@link #WGL_SWAP_METHOD_ARB SWAP_METHOD_ARB}</td></tr><tr><td>{@link #WGL_NUMBER_OVERLAYS_ARB NUMBER_OVERLAYS_ARB}</td><td>{@link #WGL_NUMBER_UNDERLAYS_ARB NUMBER_UNDERLAYS_ARB}</td><td>{@link #WGL_TRANSPARENT_ARB TRANSPARENT_ARB}</td><td>{@link #WGL_TRANSPARENT_RED_VALUE_ARB TRANSPARENT_RED_VALUE_ARB}</td></tr><tr><td>{@link #WGL_TRANSPARENT_GREEN_VALUE_ARB TRANSPARENT_GREEN_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_BLUE_VALUE_ARB TRANSPARENT_BLUE_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_ALPHA_VALUE_ARB TRANSPARENT_ALPHA_VALUE_ARB}</td><td>{@link #WGL_TRANSPARENT_INDEX_VALUE_ARB TRANSPARENT_INDEX_VALUE_ARB}</td></tr><tr><td>{@link #WGL_SHARE_DEPTH_ARB SHARE_DEPTH_ARB}</td><td>{@link #WGL_SHARE_STENCIL_ARB SHARE_STENCIL_ARB}</td><td>{@link #WGL_SHARE_ACCUM_ARB SHARE_ACCUM_ARB}</td><td>{@link #WGL_SUPPORT_GDI_ARB SUPPORT_GDI_ARB}</td></tr><tr><td>{@link #WGL_SUPPORT_OPENGL_ARB SUPPORT_OPENGL_ARB}</td><td>{@link #WGL_DOUBLE_BUFFER_ARB DOUBLE_BUFFER_ARB}</td><td>{@link #WGL_STEREO_ARB STEREO_ARB}</td><td>{@link #WGL_PIXEL_TYPE_ARB PIXEL_TYPE_ARB}</td></tr><tr><td>{@link #WGL_COLOR_BITS_ARB COLOR_BITS_ARB}</td><td>{@link #WGL_RED_BITS_ARB RED_BITS_ARB}</td><td>{@link #WGL_RED_SHIFT_ARB RED_SHIFT_ARB}</td><td>{@link #WGL_GREEN_BITS_ARB GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_GREEN_SHIFT_ARB GREEN_SHIFT_ARB}</td><td>{@link #WGL_BLUE_BITS_ARB BLUE_BITS_ARB}</td><td>{@link #WGL_BLUE_SHIFT_ARB BLUE_SHIFT_ARB}</td><td>{@link #WGL_ALPHA_BITS_ARB ALPHA_BITS_ARB}</td></tr><tr><td>{@link #WGL_ALPHA_SHIFT_ARB ALPHA_SHIFT_ARB}</td><td>{@link #WGL_ACCUM_BITS_ARB ACCUM_BITS_ARB}</td><td>{@link #WGL_ACCUM_RED_BITS_ARB ACCUM_RED_BITS_ARB}</td><td>{@link #WGL_ACCUM_GREEN_BITS_ARB ACCUM_GREEN_BITS_ARB}</td></tr><tr><td>{@link #WGL_ACCUM_BLUE_BITS_ARB ACCUM_BLUE_BITS_ARB}</td><td>{@link #WGL_ACCUM_ALPHA_BITS_ARB ACCUM_ALPHA_BITS_ARB}</td><td>{@link #WGL_DEPTH_BITS_ARB DEPTH_BITS_ARB}</td><td>{@link #WGL_STENCIL_BITS_ARB STENCIL_BITS_ARB}</td></tr><tr><td>{@link #WGL_AUX_BUFFERS_ARB AUX_BUFFERS_ARB}</td></tr></table>
	 * @param attribFList a list of attribute {type, value} pairs containing floating point attribute values
	 * @param formats     an array of returned indices of the matching pixel formats. The best pixel formats (i.e. closest match and best format for the hardware) are at the
	 *                    head of the list.
	 * @param numFormats  returns the number of matching formats
	 */
	public static boolean wglChoosePixelFormatARB(long hdc, IntBuffer attribIList, FloatBuffer attribFList, IntBuffer formats, IntBuffer numFormats) {
		if ( CHECKS ) {
			if ( attribIList != null ) checkNT(attribIList);
			if ( attribFList != null ) checkNT(attribFList);
			checkBuffer(numFormats, 1);
		}
		return nwglChoosePixelFormatARB(hdc, memAddressSafe(attribIList), memAddressSafe(attribFList), formats.remaining(), memAddress(formats), memAddress(numFormats)) != 0;
	}

	/** Array version of: {@link #wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB} */
	public static boolean wglGetPixelFormatAttribivARB(long hdc, int pixelFormat, int layerPlane, int[] attributes, int[] values) {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
			checkBuffer(values, attributes.length);
		}
		return callPPPI(__functionAddress, hdc, pixelFormat, layerPlane, attributes.length, attributes, values) != 0;
	}

	/** Array version of: {@link #wglGetPixelFormatAttribfvARB GetPixelFormatAttribfvARB} */
	public static boolean wglGetPixelFormatAttribfvARB(long hdc, int pixelFormat, int layerPlane, int[] attributes, float[] values) {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
			checkBuffer(values, attributes.length);
		}
		return callPPPI(__functionAddress, hdc, pixelFormat, layerPlane, attributes.length, attributes, values) != 0;
	}

	/** Array version of: {@link #wglChoosePixelFormatARB ChoosePixelFormatARB} */
	public static boolean wglChoosePixelFormatARB(long hdc, int[] attribIList, float[] attribFList, int[] formats, int[] numFormats) {
		long __functionAddress = GL.getCapabilitiesWGL().wglChoosePixelFormatARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
			if ( attribIList != null ) checkNT(attribIList);
			if ( attribFList != null ) checkNT(attribFList);
			checkBuffer(numFormats, 1);
		}
		return callPPPPPI(__functionAddress, hdc, attribIList, attribFList, formats.length, formats, numFormats) != 0;
	}

}