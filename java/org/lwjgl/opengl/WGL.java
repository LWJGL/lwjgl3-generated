/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

/** Native bindings to WGL functionality. */
public class WGL {

	/** UseFontOutlines format. */
	public static final int
		WGL_FONT_LINES    = 0,
		WGL_FONT_POLYGONS = 1;

	/** SwapLayerBuffers flags. */
	public static final int
		WGL_SWAP_MAIN_PLANE = 0x1,
		WGL_SWAP_OVERLAY1   = 0x2,
		WGL_SWAP_OVERLAY2   = 0x4,
		WGL_SWAP_OVERLAY3   = 0x8,
		WGL_SWAP_OVERLAY4   = 0x10,
		WGL_SWAP_OVERLAY5   = 0x20,
		WGL_SWAP_OVERLAY6   = 0x40,
		WGL_SWAP_OVERLAY7   = 0x80,
		WGL_SWAP_OVERLAY8   = 0x100,
		WGL_SWAP_OVERLAY9   = 0x200,
		WGL_SWAP_OVERLAY10  = 0x400,
		WGL_SWAP_OVERLAY11  = 0x800,
		WGL_SWAP_OVERLAY12  = 0x1000,
		WGL_SWAP_OVERLAY13  = 0x2000,
		WGL_SWAP_OVERLAY14  = 0x4000,
		WGL_SWAP_OVERLAY15  = 0x8000,
		WGL_SWAP_UNDERLAY1  = 0x10000,
		WGL_SWAP_UNDERLAY2  = 0x20000,
		WGL_SWAP_UNDERLAY3  = 0x40000,
		WGL_SWAP_UNDERLAY4  = 0x80000,
		WGL_SWAP_UNDERLAY5  = 0x100000,
		WGL_SWAP_UNDERLAY6  = 0x200000,
		WGL_SWAP_UNDERLAY7  = 0x400000,
		WGL_SWAP_UNDERLAY8  = 0x800000,
		WGL_SWAP_UNDERLAY9  = 0x1000000,
		WGL_SWAP_UNDERLAY10 = 0x2000000,
		WGL_SWAP_UNDERLAY11 = 0x4000000,
		WGL_SWAP_UNDERLAY12 = 0x8000000,
		WGL_SWAP_UNDERLAY13 = 0x10000000,
		WGL_SWAP_UNDERLAY14 = 0x20000000,
		WGL_SWAP_UNDERLAY15 = 0x40000000;

	protected WGL() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code GL.getFunctionProvider()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			CreateContext      = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateContext"),
			CreateLayerContext = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateLayerContext"),
			CopyContext        = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCopyContext"),
			DeleteContext      = apiGetFunctionAddress(GL.getFunctionProvider(), "wglDeleteContext"),
			GetCurrentContext  = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentContext"),
			GetCurrentDC       = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentDC"),
			GetProcAddress     = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetProcAddress"),
			MakeCurrent        = apiGetFunctionAddress(GL.getFunctionProvider(), "wglMakeCurrent"),
			ShareLists         = apiGetFunctionAddress(GL.getFunctionProvider(), "wglShareLists"),
			UseFontBitmaps     = apiGetFunctionAddress(GL.getFunctionProvider(), "wglUseFontBitmapsW"),
			UseFontOutlines    = apiGetFunctionAddress(GL.getFunctionProvider(), "wglUseFontOutlinesW");

	}

	// --- [ wglCreateContext ] ---

	/**
	 * Creates a new OpenGL rendering context, which is suitable for drawing on the device referenced by device. The rendering context has the same pixel
	 * format as the device context.
	 *
	 * @param hdc handle to a device context for which the function creates a suitable OpenGL rendering context
	 */
	public static long wglCreateContext(long hdc) {
		long __functionAddress = Functions.CreateContext;
		if ( CHECKS )
			checkPointer(hdc);
		return callPP(__functionAddress, hdc);
	}

	// --- [ wglCreateLayerContext ] ---

	/**
	 * Creates a new OpenGL rendering context for drawing to a specified layer plane on a device context.
	 *
	 * @param hdc        the device context for a new rendering context
	 * @param layerPlane the layer plane to which you want to bind a rendering context. The value 0 identifies the main plane. Positive values of {@code layerPlace} identify
	 *                   overlay planes, where 1 is the first overlay plane over the main plane, 2 is the second overlay plane over the first overlay plane, and so on.
	 *                   Negative values identify underlay planes, where 1 is the first underlay plane under the main plane, 2 is the second underlay plane under the first
	 *                   underlay plane, and so on. The number of overlay and underlay planes is given in the {@code reserved} member of the {@link PIXELFORMATDESCRIPTOR}
	 *                   structure.
	 */
	public static long wglCreateLayerContext(long hdc, int layerPlane) {
		long __functionAddress = Functions.CreateLayerContext;
		if ( CHECKS )
			checkPointer(hdc);
		return callPP(__functionAddress, hdc, layerPlane);
	}

	// --- [ wglCopyContext ] ---

	/**
	 * Copies selected groups of rendering states from one OpenGL rendering context to another.
	 *
	 * @param src  the source OpenGL rendering context whose state information is to be copied
	 * @param dst  the destination OpenGL rendering context to which state information is to be copied
	 * @param mask which groups of the {@code src} rendering state are to be copied to {@code dst}. It contains the bitwise-OR of the same symbolic names that are
	 *             passed to the {@link GL11#glPushAttrib PushAttrib} function. You can use {@link GL11#GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS} to copy all the rendering state information.
	 */
	public static boolean wglCopyContext(long src, long dst, int mask) {
		long __functionAddress = Functions.CopyContext;
		if ( CHECKS ) {
			checkPointer(src);
			checkPointer(dst);
		}
		return callPPI(__functionAddress, src, dst, mask) != 0;
	}

	// --- [ wglDeleteContext ] ---

	/**
	 * Deletes a specified OpenGL rendering context.
	 *
	 * @param context handle to an OpenGL rendering context that the function will delete
	 */
	public static boolean wglDeleteContext(long context) {
		long __functionAddress = Functions.DeleteContext;
		if ( CHECKS )
			checkPointer(context);
		return callPI(__functionAddress, context) != 0;
	}

	// --- [ wglGetCurrentContext ] ---

	/** Obtains a handle to the current OpenGL rendering context of the calling thread. */
	public static long wglGetCurrentContext() {
		long __functionAddress = Functions.GetCurrentContext;
		return callP(__functionAddress);
	}

	// --- [ wglGetCurrentDC ] ---

	/** Obtains a handle to the device context that is associated with the current OpenGL rendering context of the calling thread. */
	public static long wglGetCurrentDC() {
		long __functionAddress = Functions.GetCurrentDC;
		return callP(__functionAddress);
	}

	// --- [ wglGetProcAddress ] ---

	/**
	 * Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.
	 *
	 * @param proc points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
	 *             corresponding function implemented by OpenGL.
	 */
	public static long nwglGetProcAddress(long proc) {
		long __functionAddress = Functions.GetProcAddress;
		return callPP(__functionAddress, proc);
	}

	/**
	 * Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.
	 *
	 * @param proc points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
	 *             corresponding function implemented by OpenGL.
	 */
	public static long wglGetProcAddress(ByteBuffer proc) {
		if ( CHECKS )
			checkNT1(proc);
		return nwglGetProcAddress(memAddress(proc));
	}

	/**
	 * Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.
	 *
	 * @param proc points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
	 *             corresponding function implemented by OpenGL.
	 */
	public static long wglGetProcAddress(CharSequence proc) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer procEncoded = stack.ASCII(proc);
			return nwglGetProcAddress(memAddress(procEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ wglMakeCurrent ] ---

	/**
	 * Makes a specified OpenGL rendering context the calling thread's current rendering context. All subsequent OpenGL calls made by the thread are drawn on
	 * the device identified by device. You can also use MakeCurrent to change the calling thread's current rendering context so it's no longer current.
	 *
	 * @param hdc   handle to a device context. Subsequent OpenGL calls made by the calling thread are drawn on the device identified by {@code dc}.
	 * @param hglrc handle to an OpenGL rendering context that the function sets as the calling thread's rendering context. If {@code context} is {@code NULL}, the function
	 *              makes the calling thread's current rendering context no longer current, and releases the device context that is used by the rendering context. In
	 *              this case, {@code hdc} is ignored.
	 */
	public static boolean wglMakeCurrent(long hdc, long hglrc) {
		long __functionAddress = Functions.MakeCurrent;
		return callPPI(__functionAddress, hdc, hglrc) != 0;
	}

	// --- [ wglShareLists ] ---

	/**
	 * Enables multiple OpenGL rendering contexts to share a single display-list space.
	 *
	 * @param hglrc1 the OpenGL rendering context with which to share display lists.
	 * @param hglrc2 the OpenGL rendering context to share display lists with {@code hglrc1}. The {@code hglrc2} parameter should not contain any existing display lists
	 *               when {@code wglShareLists} is called.
	 */
	public static boolean wglShareLists(long hglrc1, long hglrc2) {
		long __functionAddress = Functions.ShareLists;
		if ( CHECKS ) {
			checkPointer(hglrc1);
			checkPointer(hglrc2);
		}
		return callPPI(__functionAddress, hglrc1, hglrc2) != 0;
	}

	// --- [ wglUseFontBitmaps ] ---

	/**
	 * Creates a set of bitmap display lists for use in the current OpenGL rendering context. The set of bitmap display lists is based on the glyphs in the
	 * currently selected font in the device context. You can then use bitmaps to draw characters in an OpenGL image.
	 * 
	 * <p>Creates count display lists, one for each of a run of count glyphs that begins with the first glyph in the device parameter's selected fonts.</p>
	 *
	 * @param hdc      the device context whose currently selected font will be used to form the glyph bitmap display lists in the current OpenGL rendering context
	 * @param first    the first glyph in the run of glyphs that will be used to form glyph bitmap display lists
	 * @param count    the number of glyphs in the run of glyphs that will be used to form glyph bitmap display lists. The function creates count display lists, one for each glyph in the run.
	 * @param listBase the starting display list
	 */
	public static boolean wglUseFontBitmaps(long hdc, int first, int count, int listBase) {
		long __functionAddress = Functions.UseFontBitmaps;
		if ( CHECKS )
			checkPointer(hdc);
		return callPI(__functionAddress, hdc, first, count, listBase) != 0;
	}

	// --- [ wglUseFontOutlines ] ---

	/**
	 * Creates a set of display lists, one for each glyph of the currently selected outline font of a device context, for use with the current rendering
	 * context. The display lists are used to draw 3-D characters of TrueType fonts. Each display list describes a glyph outline in floating-point coordinates.
	 * 
	 * <p>The run of glyphs begins with thefirstglyph of the font of the specified device context. The em square size of the font, the notional grid size of the
	 * original font outline from which the font is fitted, is mapped to 1.0 in the x- and y-coordinates in the display lists. The extrusion parameter sets how
	 * much depth the font has in the z direction.</p>
	 * 
	 * <p>The glyphMetrics parameter returns a {@link GLYPHMETRICSFLOAT} structure that contains information about the placement and orientation of each glyph in
	 * a character cell.</p>
	 *
	 * @param hdc          the device context with the desired outline font. The outline font of {@code dc} is used to create the display lists in the current rendering
	 *                     context.
	 * @param first        the first of the set of glyphs that form the font outline display lists
	 * @param count        the number of glyphs in the set of glyphs used to form the font outline display lists. The {@code wglUseFontOutlines} function creates count display
	 *                     lists, one display list for each glyph in a set of glyphs.
	 * @param listBase     the starting display list
	 * @param deviation    the maximum chordal deviation from the original outlines. When deviation is zero, the chordal deviation is equivalent to one design unit of the
	 *                     original font. The value of deviation must be equal to or greater than 0.
	 * @param extrusion    how much a font is extruded in the negative z direction. The value must be equal to or greater than 0. When extrusion is 0, the display lists are
	 *                     not extruded.
	 * @param format       the format to use in the display lists. When format is {@link #WGL_FONT_LINES FONT_LINES}, the {@code wglUseFontOutlines} function creates fonts with line
	 *                     segments. When format is {@link #WGL_FONT_POLYGONS FONT_POLYGONS}, {@code wglUseFontOutlines} creates fonts with polygons. One of:<br><table><tr><td>{@link #WGL_FONT_LINES FONT_LINES}</td><td>{@link #WGL_FONT_POLYGONS FONT_POLYGONS}</td></tr></table>
	 * @param glyphMetrics an array of {@code count} {@link GLYPHMETRICSFLOAT} structures that is to receive the metrics of the glyphs. When {@code glyphMetrics} is {@code NULL}, no
	 *                     glyph metrics are returned.
	 */
	public static int nwglUseFontOutlines(long hdc, int first, int count, int listBase, float deviation, float extrusion, int format, long glyphMetrics) {
		long __functionAddress = Functions.UseFontOutlines;
		if ( CHECKS )
			checkPointer(hdc);
		return callPPI(__functionAddress, hdc, first, count, listBase, deviation, extrusion, format, glyphMetrics);
	}

	/**
	 * Creates a set of display lists, one for each glyph of the currently selected outline font of a device context, for use with the current rendering
	 * context. The display lists are used to draw 3-D characters of TrueType fonts. Each display list describes a glyph outline in floating-point coordinates.
	 * 
	 * <p>The run of glyphs begins with thefirstglyph of the font of the specified device context. The em square size of the font, the notional grid size of the
	 * original font outline from which the font is fitted, is mapped to 1.0 in the x- and y-coordinates in the display lists. The extrusion parameter sets how
	 * much depth the font has in the z direction.</p>
	 * 
	 * <p>The glyphMetrics parameter returns a {@link GLYPHMETRICSFLOAT} structure that contains information about the placement and orientation of each glyph in
	 * a character cell.</p>
	 *
	 * @param hdc          the device context with the desired outline font. The outline font of {@code dc} is used to create the display lists in the current rendering
	 *                     context.
	 * @param first        the first of the set of glyphs that form the font outline display lists
	 * @param listBase     the starting display list
	 * @param deviation    the maximum chordal deviation from the original outlines. When deviation is zero, the chordal deviation is equivalent to one design unit of the
	 *                     original font. The value of deviation must be equal to or greater than 0.
	 * @param extrusion    how much a font is extruded in the negative z direction. The value must be equal to or greater than 0. When extrusion is 0, the display lists are
	 *                     not extruded.
	 * @param format       the format to use in the display lists. When format is {@link #WGL_FONT_LINES FONT_LINES}, the {@code wglUseFontOutlines} function creates fonts with line
	 *                     segments. When format is {@link #WGL_FONT_POLYGONS FONT_POLYGONS}, {@code wglUseFontOutlines} creates fonts with polygons. One of:<br><table><tr><td>{@link #WGL_FONT_LINES FONT_LINES}</td><td>{@link #WGL_FONT_POLYGONS FONT_POLYGONS}</td></tr></table>
	 * @param glyphMetrics an array of {@code count} {@link GLYPHMETRICSFLOAT} structures that is to receive the metrics of the glyphs. When {@code glyphMetrics} is {@code NULL}, no
	 *                     glyph metrics are returned.
	 */
	public static boolean wglUseFontOutlines(long hdc, int first, int listBase, float deviation, float extrusion, int format, GLYPHMETRICSFLOAT.Buffer glyphMetrics) {
		return nwglUseFontOutlines(hdc, first, glyphMetrics == null ? 0 : glyphMetrics.remaining(), listBase, deviation, extrusion, format, glyphMetrics == null ? NULL : glyphMetrics.address()) != 0;
	}

}