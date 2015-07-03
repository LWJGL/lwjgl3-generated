/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to the OpenGL 1.2 optional imaging subset. */
public final class ARBImaging {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
	 * GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
	 */
	public static final int
		GL_COLOR_TABLE                   = 0x80D0,
		GL_POST_CONVOLUTION_COLOR_TABLE  = 0x80D1,
		GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;

	/** Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv. */
	public static final int
		GL_PROXY_COLOR_TABLE                   = 0x80D3,
		GL_PROXY_POST_CONVOLUTION_COLOR_TABLE  = 0x80D4,
		GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;

	/**
	 * Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
	 * GetColorTableParameterfv.
	 */
	public static final int
		GL_COLOR_TABLE_SCALE = 0x80D6,
		GL_COLOR_TABLE_BIAS  = 0x80D7;

	/** Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv. */
	public static final int
		GL_COLOR_TABLE_FORMAT         = 0x80D8,
		GL_COLOR_TABLE_WIDTH          = 0x80D9,
		GL_COLOR_TABLE_RED_SIZE       = 0x80DA,
		GL_COLOR_TABLE_GREEN_SIZE     = 0x80DB,
		GL_COLOR_TABLE_BLUE_SIZE      = 0x80DC,
		GL_COLOR_TABLE_ALPHA_SIZE     = 0x80DD,
		GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE,
		GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;

	/** ErrorCode */
	public static final int GL_TABLE_TOO_LARGE = 0x8031;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int GL_CONVOLUTION_1D = 0x8010;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int GL_CONVOLUTION_2D = 0x8011;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int GL_SEPARABLE_2D = 0x8012;

	/**
	 * Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
	 * GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;

	/** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
	public static final int
		GL_CONVOLUTION_FILTER_SCALE = 0x8014,
		GL_CONVOLUTION_FILTER_BIAS  = 0x8015;

	/**
	 * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
	 * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
	 */
	public static final int GL_REDUCE = 0x8016;

	/** Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv. */
	public static final int
		GL_CONVOLUTION_FORMAT     = 0x8017,
		GL_CONVOLUTION_WIDTH      = 0x8018,
		GL_CONVOLUTION_HEIGHT     = 0x8019,
		GL_MAX_CONVOLUTION_WIDTH  = 0x801A,
		GL_MAX_CONVOLUTION_HEIGHT = 0x801B;

	/**
	 * Accepted by the {@code pname} parameter of PixelTransferi, PixelTransferf, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv,
	 * and GetDoublev.
	 */
	public static final int
		GL_POST_CONVOLUTION_RED_SCALE   = 0x801C,
		GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D,
		GL_POST_CONVOLUTION_BLUE_SCALE  = 0x801E,
		GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F,
		GL_POST_CONVOLUTION_RED_BIAS    = 0x8020,
		GL_POST_CONVOLUTION_GREEN_BIAS  = 0x8021,
		GL_POST_CONVOLUTION_BLUE_BIAS   = 0x8022,
		GL_POST_CONVOLUTION_ALPHA_BIAS  = 0x8023;

	/**
	 * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
	 * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
	 */
	public static final int
		GL_CONSTANT_BORDER  = 0x8151,
		GL_REPLICATE_BORDER = 0x8153;

	/** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
	public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_COLOR_MATRIX                 = 0x80B1,
		GL_COLOR_MATRIX_STACK_DEPTH     = 0x80B2,
		GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;

	/** Accepted by the {@code pname} parameter of PixelTransfer*, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_POST_COLOR_MATRIX_RED_SCALE   = 0x80B4,
		GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5,
		GL_POST_COLOR_MATRIX_BLUE_SCALE  = 0x80B6,
		GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7,
		GL_POST_COLOR_MATRIX_RED_BIAS    = 0x80B8,
		GL_POST_COLOR_MATRIX_GREEN_BIAS  = 0x80B9,
		GL_POST_COLOR_MATRIX_BLUE_BIAS   = 0x80BA,
		GL_POST_COLOR_MATRIX_ALPHA_BIAS  = 0x80BB;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
	 * GetHistogramParameterfv.
	 */
	public static final int GL_HISTOGRAM = 0x8024;

	/** Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv. */
	public static final int GL_PROXY_HISTOGRAM = 0x8025;

	/** Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv. */
	public static final int
		GL_HISTOGRAM_WIDTH          = 0x8026,
		GL_HISTOGRAM_FORMAT         = 0x8027,
		GL_HISTOGRAM_RED_SIZE       = 0x8028,
		GL_HISTOGRAM_GREEN_SIZE     = 0x8029,
		GL_HISTOGRAM_BLUE_SIZE      = 0x802A,
		GL_HISTOGRAM_ALPHA_SIZE     = 0x802B,
		GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C,
		GL_HISTOGRAM_SINK           = 0x802D;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
	 */
	public static final int GL_MINMAX = 0x802E;

	/** Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv. */
	public static final int
		GL_MINMAX_FORMAT = 0x802F,
		GL_MINMAX_SINK   = 0x8030;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_BLEND_COLOR = 0x8005;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_ADD = 0x8006,
		GL_MIN      = 0x8007,
		GL_MAX      = 0x8008;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_BLEND_EQUATION = 0x8009;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_SUBTRACT         = 0x800A,
		GL_FUNC_REVERSE_SUBTRACT = 0x800B;

	/** Function address. */
	@JavadocExclude
	public final long
		ColorTable,
		CopyColorTable,
		ColorTableParameteriv,
		ColorTableParameterfv,
		GetColorTable,
		GetColorTableParameteriv,
		GetColorTableParameterfv,
		ColorSubTable,
		CopyColorSubTable,
		ConvolutionFilter1D,
		ConvolutionFilter2D,
		CopyConvolutionFilter1D,
		CopyConvolutionFilter2D,
		GetConvolutionFilter,
		SeparableFilter2D,
		GetSeparableFilter,
		ConvolutionParameteri,
		ConvolutionParameteriv,
		ConvolutionParameterf,
		ConvolutionParameterfv,
		GetConvolutionParameteriv,
		GetConvolutionParameterfv,
		Histogram,
		ResetHistogram,
		GetHistogram,
		GetHistogramParameteriv,
		GetHistogramParameterfv,
		Minmax,
		ResetMinmax,
		GetMinmax,
		GetMinmaxParameteriv,
		GetMinmaxParameterfv,
		BlendColor,
		BlendEquation;

	@JavadocExclude
	public ARBImaging(FunctionProvider provider, boolean fc) {
		ColorTable = GL.getFunctionAddress(provider, "glColorTable", fc);
		CopyColorTable = GL.getFunctionAddress(provider, "glCopyColorTable", fc);
		ColorTableParameteriv = GL.getFunctionAddress(provider, "glColorTableParameteriv", fc);
		ColorTableParameterfv = GL.getFunctionAddress(provider, "glColorTableParameterfv", fc);
		GetColorTable = GL.getFunctionAddress(provider, "glGetColorTable", fc);
		GetColorTableParameteriv = GL.getFunctionAddress(provider, "glGetColorTableParameteriv", fc);
		GetColorTableParameterfv = GL.getFunctionAddress(provider, "glGetColorTableParameterfv", fc);
		ColorSubTable = GL.getFunctionAddress(provider, "glColorSubTable", fc);
		CopyColorSubTable = GL.getFunctionAddress(provider, "glCopyColorSubTable", fc);
		ConvolutionFilter1D = GL.getFunctionAddress(provider, "glConvolutionFilter1D", fc);
		ConvolutionFilter2D = GL.getFunctionAddress(provider, "glConvolutionFilter2D", fc);
		CopyConvolutionFilter1D = GL.getFunctionAddress(provider, "glCopyConvolutionFilter1D", fc);
		CopyConvolutionFilter2D = GL.getFunctionAddress(provider, "glCopyConvolutionFilter2D", fc);
		GetConvolutionFilter = GL.getFunctionAddress(provider, "glGetConvolutionFilter", fc);
		SeparableFilter2D = GL.getFunctionAddress(provider, "glSeparableFilter2D", fc);
		GetSeparableFilter = GL.getFunctionAddress(provider, "glGetSeparableFilter", fc);
		ConvolutionParameteri = GL.getFunctionAddress(provider, "glConvolutionParameteri", fc);
		ConvolutionParameteriv = GL.getFunctionAddress(provider, "glConvolutionParameteriv", fc);
		ConvolutionParameterf = GL.getFunctionAddress(provider, "glConvolutionParameterf", fc);
		ConvolutionParameterfv = GL.getFunctionAddress(provider, "glConvolutionParameterfv", fc);
		GetConvolutionParameteriv = GL.getFunctionAddress(provider, "glGetConvolutionParameteriv", fc);
		GetConvolutionParameterfv = GL.getFunctionAddress(provider, "glGetConvolutionParameterfv", fc);
		Histogram = GL.getFunctionAddress(provider, "glHistogram", fc);
		ResetHistogram = GL.getFunctionAddress(provider, "glResetHistogram", fc);
		GetHistogram = GL.getFunctionAddress(provider, "glGetHistogram", fc);
		GetHistogramParameteriv = GL.getFunctionAddress(provider, "glGetHistogramParameteriv", fc);
		GetHistogramParameterfv = GL.getFunctionAddress(provider, "glGetHistogramParameterfv", fc);
		Minmax = GL.getFunctionAddress(provider, "glMinmax", fc);
		ResetMinmax = GL.getFunctionAddress(provider, "glResetMinmax", fc);
		GetMinmax = GL.getFunctionAddress(provider, "glGetMinmax", fc);
		GetMinmaxParameteriv = GL.getFunctionAddress(provider, "glGetMinmaxParameteriv", fc);
		GetMinmaxParameterfv = GL.getFunctionAddress(provider, "glGetMinmaxParameterfv", fc);
		BlendColor = provider.getFunctionAddress("glBlendColor");
		BlendEquation = provider.getFunctionAddress("glBlendEquation");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBImaging} instance for the current context. */
	public static ARBImaging getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBImaging);
	}

	static ARBImaging create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("GL_ARB_imaging") ) return null;

		ARBImaging funcs = new ARBImaging(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.ColorTable, funcs.CopyColorTable, funcs.ColorTableParameteriv, funcs.ColorTableParameterfv, funcs.GetColorTable, 
			funcs.GetColorTableParameteriv, funcs.GetColorTableParameterfv, funcs.ColorSubTable, funcs.CopyColorSubTable, funcs.ConvolutionFilter1D, 
			funcs.ConvolutionFilter2D, funcs.CopyConvolutionFilter1D, funcs.CopyConvolutionFilter2D, funcs.GetConvolutionFilter, funcs.SeparableFilter2D, 
			funcs.GetSeparableFilter, funcs.ConvolutionParameteri, funcs.ConvolutionParameteriv, funcs.ConvolutionParameterf, funcs.ConvolutionParameterfv, 
			funcs.GetConvolutionParameteriv, funcs.GetConvolutionParameterfv, funcs.Histogram, funcs.ResetHistogram, funcs.GetHistogram, 
			funcs.GetHistogramParameteriv, funcs.GetHistogramParameterfv, funcs.Minmax, funcs.ResetMinmax, funcs.GetMinmax, funcs.GetMinmaxParameteriv, 
			funcs.GetMinmaxParameterfv
		)) && checkFunctions(
			funcs.BlendColor, funcs.BlendEquation
		);

		return GL.checkExtension("GL_ARB_imaging", funcs, supported);
	}

	// --- [ glColorTable ] ---

	/** JNI method for {@link #glColorTable ColorTable} */
	@JavadocExclude
	public static native void nglColorTable(int target, int internalformat, int width, int format, int type, long table, long __functionAddress);

	/** Unsafe version of {@link #glColorTable ColorTable} */
	@JavadocExclude
	public static void nglColorTable(int target, int internalformat, int width, int format, int type, long table) {
		long __functionAddress = getInstance().ColorTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorTable(target, internalformat, width, format, type, table, __functionAddress);
	}

	/**
	 * Specifies a color lookup table.
	 *
	 * @param target         the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}, {@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}, {@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param internalformat the color table internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param width          the color table width
	 * @param format         the color data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type           the color data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param table          the color table data
	 */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ByteBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/** Buffer object offset version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, long tableOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglColorTable(target, internalformat, width, format, type, tableOffset);
	}

	/** ShortBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ShortBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/** IntBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, IntBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/** FloatBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, FloatBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	// --- [ glCopyColorTable ] ---

	/** JNI method for {@link #glCopyColorTable CopyColorTable} */
	@JavadocExclude
	public static native void nglCopyColorTable(int target, int internalformat, int x, int y, int width, long __functionAddress);

	/**
	 * Defines a color table in exactly the manner of {@link #glColorTable ColorTable}, except that the image data are taken from the framebuffer rather than from client memory.
	 *
	 * @param target         the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param internalformat the color table internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the color table width
	 */
	public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = getInstance().CopyColorTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyColorTable(target, internalformat, x, y, width, __functionAddress);
	}

	// --- [ glColorTableParameteriv ] ---

	/** JNI method for {@link #glColorTableParameteriv ColorTableParameteriv} */
	@JavadocExclude
	public static native void nglColorTableParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glColorTableParameteriv ColorTableParameteriv} */
	@JavadocExclude
	public static void nglColorTableParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().ColorTableParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorTableParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Specifies the scale and bias parameters for a color table.
	 *
	 * @param target the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param pname  the parameter to set. One of:<br>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}, {@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}
	 * @param params the parameter value
	 */
	public static void glColorTableParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglColorTableParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glColorTableParameteriv ColorTableParameteriv} */
	public static void glColorTableParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglColorTableParameteriv(target, pname, memAddress(params));
	}

	// --- [ glColorTableParameterfv ] ---

	/** JNI method for {@link #glColorTableParameterfv ColorTableParameterfv} */
	@JavadocExclude
	public static native void nglColorTableParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glColorTableParameterfv ColorTableParameterfv} */
	@JavadocExclude
	public static void nglColorTableParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().ColorTableParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorTableParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Float version of {@link #glColorTableParameteriv ColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glColorTableParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglColorTableParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glColorTableParameterfv ColorTableParameterfv} */
	public static void glColorTableParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglColorTableParameterfv(target, pname, memAddress(params));
	}

	// --- [ glGetColorTable ] ---

	/** JNI method for {@link #glGetColorTable GetColorTable} */
	@JavadocExclude
	public static native void nglGetColorTable(int target, int format, int type, long table, long __functionAddress);

	/** Unsafe version of {@link #glGetColorTable GetColorTable} */
	@JavadocExclude
	public static void nglGetColorTable(int target, int format, int type, long table) {
		long __functionAddress = getInstance().GetColorTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetColorTable(target, format, type, table, __functionAddress);
	}

	/**
	 * Returns the current contents of a color table.
	 *
	 * @param target the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param format the color data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the color data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param table  the color table data
	 */
	public static void glGetColorTable(int target, int format, int type, ByteBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/** Buffer object offset version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, long tableOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetColorTable(target, format, type, tableOffset);
	}

	/** ShortBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, ShortBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/** IntBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, IntBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/** FloatBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, FloatBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	// --- [ glGetColorTableParameteriv ] ---

	/** JNI method for {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
	@JavadocExclude
	public static native void nglGetColorTableParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
	@JavadocExclude
	public static void nglGetColorTableParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetColorTableParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetColorTableParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the integer value of the specified color table parameter.
	 *
	 * @param target the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}, {@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}, {@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param pname  the parameter to query. One of:<br>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}, {@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}, {@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}, {@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}, {@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}, {@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}, {@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}, {@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}, {@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}, {@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetColorTableParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetColorTableParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
	public static void glGetColorTableParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetColorTableParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
	public static int glGetColorTableParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetColorTableParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetColorTableParameterfv ] ---

	/** JNI method for {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
	@JavadocExclude
	public static native void nglGetColorTableParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
	@JavadocExclude
	public static void nglGetColorTableParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetColorTableParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetColorTableParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetColorTableParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetColorTableParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
	public static void glGetColorTableParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetColorTableParameterfv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
	public static float glGetColorTableParameterf(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetColorTableParameterfv(target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glColorSubTable ] ---

	/** JNI method for {@link #glColorSubTable ColorSubTable} */
	@JavadocExclude
	public static native void nglColorSubTable(int target, int start, int count, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glColorSubTable ColorSubTable} */
	@JavadocExclude
	public static void nglColorSubTable(int target, int start, int count, int format, int type, long data) {
		long __functionAddress = getInstance().ColorSubTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorSubTable(target, start, count, format, type, data, __functionAddress);
	}

	/**
	 * Respecifies a portion of an existing color table.
	 *
	 * @param target the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param start  the starting index of the subregion to respecify
	 * @param count  the number of colors in the subregion to respecify
	 * @param format the color data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the color data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param data   the color table data
	 */
	public static void glColorSubTable(int target, int start, int count, int format, int type, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorSubTable(target, start, count, format, type, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glColorSubTable ColorSubTable} */
	public static void glColorSubTable(int target, int start, int count, int format, int type, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglColorSubTable(target, start, count, format, type, dataOffset);
	}

	// --- [ glCopyColorSubTable ] ---

	/** JNI method for {@link #glCopyColorSubTable CopyColorSubTable} */
	@JavadocExclude
	public static native void nglCopyColorSubTable(int target, int start, int x, int y, int width, long __functionAddress);

	/**
	 * Respecifies a portion of an existing color table using image taken from the framebuffer.
	 *
	 * @param target the color table target. One of:<br>{@link #GL_COLOR_TABLE COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param start  the start index of the subregion to respecify
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the number of colors in the subregion to respecify
	 */
	public static void glCopyColorSubTable(int target, int start, int x, int y, int width) {
		long __functionAddress = getInstance().CopyColorSubTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyColorSubTable(target, start, x, y, width, __functionAddress);
	}

	// --- [ glConvolutionFilter1D ] ---

	/** JNI method for {@link #glConvolutionFilter1D ConvolutionFilter1D} */
	@JavadocExclude
	public static native void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glConvolutionFilter1D ConvolutionFilter1D} */
	@JavadocExclude
	public static void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data) {
		long __functionAddress = getInstance().ConvolutionFilter1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionFilter1D(target, internalformat, width, format, type, data, __functionAddress);
	}

	/**
	 * Defines a one-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}
	 * @param internalformat the filter internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param format         the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglConvolutionFilter1D(target, internalformat, width, format, type, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glConvolutionFilter1D ConvolutionFilter1D} */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglConvolutionFilter1D(target, internalformat, width, format, type, dataOffset);
	}

	// --- [ glConvolutionFilter2D ] ---

	/** JNI method for {@link #glConvolutionFilter2D ConvolutionFilter2D} */
	@JavadocExclude
	public static native void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glConvolutionFilter2D ConvolutionFilter2D} */
	@JavadocExclude
	public static void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data) {
		long __functionAddress = getInstance().ConvolutionFilter2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, data, __functionAddress);
	}

	/**
	 * Defines a two-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}
	 * @param internalformat the filter internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glConvolutionFilter2D ConvolutionFilter2D} */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, dataOffset);
	}

	// --- [ glCopyConvolutionFilter1D ] ---

	/** JNI method for {@link #glCopyConvolutionFilter1D CopyConvolutionFilter1D} */
	@JavadocExclude
	public static native void nglCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width, long __functionAddress);

	/**
	 * Defines a one-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<br>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}
	 * @param internalformat the filter internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 */
	public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = getInstance().CopyConvolutionFilter1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyConvolutionFilter1D(target, internalformat, x, y, width, __functionAddress);
	}

	// --- [ glCopyConvolutionFilter2D ] ---

	/** JNI method for {@link #glCopyConvolutionFilter2D CopyConvolutionFilter2D} */
	@JavadocExclude
	public static native void nglCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height, long __functionAddress);

	/**
	 * Defines a two-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<br>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}
	 * @param internalformat the filter internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 * @param height         the filter height
	 */
	public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
		long __functionAddress = getInstance().CopyConvolutionFilter2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyConvolutionFilter2D(target, internalformat, x, y, width, height, __functionAddress);
	}

	// --- [ glGetConvolutionFilter ] ---

	/** JNI method for {@link #glGetConvolutionFilter GetConvolutionFilter} */
	@JavadocExclude
	public static native void nglGetConvolutionFilter(int target, int format, int type, long image, long __functionAddress);

	/** Unsafe version of {@link #glGetConvolutionFilter GetConvolutionFilter} */
	@JavadocExclude
	public static void nglGetConvolutionFilter(int target, int format, int type, long image) {
		long __functionAddress = getInstance().GetConvolutionFilter;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetConvolutionFilter(target, format, type, image, __functionAddress);
	}

	/**
	 * Returns the contents of a convolution filter.
	 *
	 * @param target the convolution target. One of:<br>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D CONVOLUTION_2D}
	 * @param format the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param image  the filter data
	 */
	public static void glGetConvolutionFilter(int target, int format, int type, ByteBuffer image) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetConvolutionFilter(target, format, type, memAddress(image));
	}

	/** Buffer object offset version of: {@link #glGetConvolutionFilter GetConvolutionFilter} */
	public static void glGetConvolutionFilter(int target, int format, int type, long imageOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetConvolutionFilter(target, format, type, imageOffset);
	}

	// --- [ glSeparableFilter2D ] ---

	/** JNI method for {@link #glSeparableFilter2D SeparableFilter2D} */
	@JavadocExclude
	public static native void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column, long __functionAddress);

	/** Unsafe version of {@link #glSeparableFilter2D SeparableFilter2D} */
	@JavadocExclude
	public static void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column) {
		long __functionAddress = getInstance().SeparableFilter2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSeparableFilter2D(target, internalformat, width, height, format, type, row, column, __functionAddress);
	}

	/**
	 * Specifies a two-dimensional separable convolution filter.
	 *
	 * @param target         the filter target. Must be:<br>{@link #GL_SEPARABLE_2D SEPARABLE_2D}
	 * @param internalformat the filter internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param row            the horizontal filter data
	 * @param column         the vertical filter data
	 */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ByteBuffer column) {
		if ( LWJGLUtil.CHECKS ) {
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), memAddress(column));
	}

	/** Buffer object offset version of: {@link #glSeparableFilter2D SeparableFilter2D} */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long rowOffset, ByteBuffer column) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglSeparableFilter2D(target, internalformat, width, height, format, type, rowOffset, memAddress(column));
	}

	/** Buffer object offset version of: {@link #glSeparableFilter2D SeparableFilter2D} */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, long columnOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), columnOffset);
	}

	// --- [ glGetSeparableFilter ] ---

	/** JNI method for {@link #glGetSeparableFilter GetSeparableFilter} */
	@JavadocExclude
	public static native void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span, long __functionAddress);

	/** Unsafe version of {@link #glGetSeparableFilter GetSeparableFilter} */
	@JavadocExclude
	public static void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span) {
		long __functionAddress = getInstance().GetSeparableFilter;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetSeparableFilter(target, format, type, row, column, span, __functionAddress);
	}

	/**
	 * Returns the current contents of a separable convolution filter.
	 *
	 * @param target the filter target. Must be:<br>{@link #GL_SEPARABLE_2D SEPARABLE_2D}
	 * @param format the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param row    a buffer in which to return the filter row
	 * @param column a buffer in which to return the filter column
	 * @param span   unused
	 */
	public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS ) {
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetSeparableFilter(target, format, type, memAddress(row), memAddress(column), memAddressSafe(span));
	}

	/** Buffer object offset version of: {@link #glGetSeparableFilter GetSeparableFilter} */
	public static void glGetSeparableFilter(int target, int format, int type, long rowOffset, ByteBuffer column, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetSeparableFilter(target, format, type, rowOffset, memAddress(column), memAddressSafe(span));
	}

	/** Buffer object offset version of: {@link #glGetSeparableFilter GetSeparableFilter} */
	public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, long columnOffset, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetSeparableFilter(target, format, type, memAddress(row), columnOffset, memAddressSafe(span));
	}

	// --- [ glConvolutionParameteri ] ---

	/** JNI method for {@link #glConvolutionParameteri ConvolutionParameteri} */
	@JavadocExclude
	public static native void nglConvolutionParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * Specifies the scale and bias of a convolution filter.
	 *
	 * @param target the filter target. One of:<br>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D CONVOLUTION_2D}, {@link #GL_SEPARABLE_2D SEPARABLE_2D}
	 * @param pname  the parameter to set. Must be:<br>{@link #GL_CONVOLUTION_BORDER_MODE CONVOLUTION_BORDER_MODE}
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().ConvolutionParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glConvolutionParameteriv ] ---

	/** JNI method for {@link #glConvolutionParameteriv ConvolutionParameteriv} */
	@JavadocExclude
	public static native void nglConvolutionParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glConvolutionParameteriv ConvolutionParameteriv} */
	@JavadocExclude
	public static void nglConvolutionParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().ConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glConvolutionParameteri ConvolutionParameteri}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}, {@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}, {@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}
	 * @param params the parameter value
	 */
	public static void glConvolutionParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglConvolutionParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glConvolutionParameteriv ConvolutionParameteriv} */
	public static void glConvolutionParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglConvolutionParameteriv(target, pname, memAddress(params));
	}

	// --- [ glConvolutionParameterf ] ---

	/** JNI method for {@link #glConvolutionParameterf ConvolutionParameterf} */
	@JavadocExclude
	public static native void nglConvolutionParameterf(int target, int pname, float param, long __functionAddress);

	/**
	 * Float version of {@link #glConvolutionParameteri ConvolutionParameteri}
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameterf(int target, int pname, float param) {
		long __functionAddress = getInstance().ConvolutionParameterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameterf(target, pname, param, __functionAddress);
	}

	// --- [ glConvolutionParameterfv ] ---

	/** JNI method for {@link #glConvolutionParameterfv ConvolutionParameterfv} */
	@JavadocExclude
	public static native void nglConvolutionParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glConvolutionParameterfv ConvolutionParameterfv} */
	@JavadocExclude
	public static void nglConvolutionParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().ConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glConvolutionParameterf ConvolutionParameterf}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}, {@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}, {@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}
	 * @param params the parameter value
	 */
	public static void glConvolutionParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglConvolutionParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glConvolutionParameterfv ConvolutionParameterfv} */
	public static void glConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglConvolutionParameterfv(target, pname, memAddress(params));
	}

	// --- [ glGetConvolutionParameteriv ] ---

	/** JNI method for {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
	@JavadocExclude
	public static native void nglGetConvolutionParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
	@JavadocExclude
	public static void nglGetConvolutionParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetConvolutionParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the value of a convolution filter parameter.
	 *
	 * @param target the filter target. One of:<br>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D CONVOLUTION_2D}, {@link #GL_SEPARABLE_2D SEPARABLE_2D}
	 * @param pname  the parameter to query. One of:<br>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}, {@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}, {@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}, {@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}, {@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetConvolutionParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetConvolutionParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
	public static void glGetConvolutionParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetConvolutionParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
	public static int glGetConvolutionParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetConvolutionParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetConvolutionParameterfv ] ---

	/** JNI method for {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
	@JavadocExclude
	public static native void nglGetConvolutionParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
	@JavadocExclude
	public static void nglGetConvolutionParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetConvolutionParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetConvolutionParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetConvolutionParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
	public static void glGetConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetConvolutionParameterfv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
	public static float glGetConvolutionParameterf(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetConvolutionParameterfv(target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glHistogram ] ---

	/** JNI method for {@link #glHistogram Histogram} */
	@JavadocExclude
	public static native void nglHistogram(int target, int width, int internalformat, boolean sink, long __functionAddress);

	/**
	 * Specifies the histogram table.
	 *
	 * @param target         the histogram target. One of:<br>{@link #GL_HISTOGRAM HISTOGRAM}, {@link #GL_PROXY_HISTOGRAM PROXY_HISTOGRAM}
	 * @param width          the histogram width
	 * @param internalformat the histogram internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param sink           whether pixel groups will be consumed by the histogram operation ({@link GL11#GL_TRUE TRUE}) or passed on to the minmax operation ({@link GL11#GL_FALSE FALSE})
	 */
	public static void glHistogram(int target, int width, int internalformat, boolean sink) {
		long __functionAddress = getInstance().Histogram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglHistogram(target, width, internalformat, sink, __functionAddress);
	}

	// --- [ glResetHistogram ] ---

	/** JNI method for {@link #glResetHistogram ResetHistogram} */
	@JavadocExclude
	public static native void nglResetHistogram(int target, long __functionAddress);

	/**
	 * Resets all counters of all elements of the histogram table to zero.
	 *
	 * @param target the histogram target. Must be:<br>{@link #GL_HISTOGRAM HISTOGRAM}
	 */
	public static void glResetHistogram(int target) {
		long __functionAddress = getInstance().ResetHistogram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglResetHistogram(target, __functionAddress);
	}

	// --- [ glGetHistogram ] ---

	/** JNI method for {@link #glGetHistogram GetHistogram} */
	@JavadocExclude
	public static native void nglGetHistogram(int target, boolean reset, int format, int type, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetHistogram GetHistogram} */
	@JavadocExclude
	public static void nglGetHistogram(int target, boolean reset, int format, int type, long values) {
		long __functionAddress = getInstance().GetHistogram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetHistogram(target, reset, format, type, values, __functionAddress);
	}

	/**
	 * Returns the current contents of the histogram table.
	 *
	 * @param target the histogram target. Must be:<br>{@link #GL_HISTOGRAM HISTOGRAM}
	 * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the pixel data types. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param values the pixel data
	 */
	public static void glGetHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetHistogram(target, reset, format, type, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glGetHistogram GetHistogram} */
	public static void glGetHistogram(int target, boolean reset, int format, int type, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetHistogram(target, reset, format, type, valuesOffset);
	}

	// --- [ glGetHistogramParameteriv ] ---

	/** JNI method for {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
	@JavadocExclude
	public static native void nglGetHistogramParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
	@JavadocExclude
	public static void nglGetHistogramParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetHistogramParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetHistogramParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the integer values of the specified histogram parameter
	 *
	 * @param target the histogram target. Must be:<br>{@link #GL_HISTOGRAM HISTOGRAM}
	 * @param pname  the parameter to query. One of:<br>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}, {@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}, {@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}, {@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}, {@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}, {@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}, {@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}, {@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}
	 * @param params a buffer in which to return the parameter values
	 */
	public static void glGetHistogramParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetHistogramParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
	public static void glGetHistogramParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetHistogramParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
	public static int glGetHistogramParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetHistogramParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetHistogramParameterfv ] ---

	/** JNI method for {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
	@JavadocExclude
	public static native void nglGetHistogramParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
	@JavadocExclude
	public static void nglGetHistogramParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetHistogramParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetHistogramParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
	 *
	 * @param target the histogram target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetHistogramParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetHistogramParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
	public static void glGetHistogramParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetHistogramParameterfv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
	public static float glGetHistogramParameterf(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetHistogramParameterfv(target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glMinmax ] ---

	/** JNI method for {@link #glMinmax Minmax} */
	@JavadocExclude
	public static native void nglMinmax(int target, int internalformat, boolean sink, long __functionAddress);

	/**
	 * Specifies the minmax table.
	 *
	 * @param target         the minmax target. Must be:<br>{@link #GL_MINMAX MINMAX}
	 * @param internalformat the minmax table internal format. One of:<br>{@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM}, {@link GL11#GL_R3_G3_B2 R3_G3_B2}, {@link GL11#GL_RGB4 RGB4}, {@link GL11#GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565}, {@link GL11#GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM}, {@link GL11#GL_RGB10 RGB10}, {@link GL11#GL_RGB12 RGB12}, {@link GL11#GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM RGB16_SNORM}, {@link GL11#GL_RGBA2 RGBA2}, {@link GL11#GL_RGBA4 RGBA4}, {@link GL11#GL_RGB5_A1 RGB5_A1}, {@link GL11#GL_RGBA8 RGBA8}, {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link GL11#GL_RGB10_A2 RGB10_A2}, {@link GL11#GL_RGBA12 RGBA12}, {@link GL11#GL_RGBA16 RGBA16}, {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}, {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F RGBA16F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY INTENSITY}, {@link GL11#GL_ALPHA4 ALPHA4}, {@link GL11#GL_ALPHA8 ALPHA8}, {@link GL11#GL_ALPHA12 ALPHA12}, {@link GL11#GL_ALPHA16 ALPHA16}, {@link GL11#GL_LUMINANCE4 LUMINANCE4}, {@link GL11#GL_LUMINANCE8 LUMINANCE8}, {@link GL11#GL_LUMINANCE12 LUMINANCE12}, {@link GL11#GL_LUMINANCE16 LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4 INTENSITY4}, {@link GL11#GL_INTENSITY8 INTENSITY8}, {@link GL11#GL_INTENSITY12 INTENSITY12}, {@link GL11#GL_INTENSITY16 INTENSITY16}, {@link GL21#GL_SLUMINANCE SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}
	 * @param sink           whether pixel groups will be consumed by the minmax operation ({@link GL11#GL_TRUE TRUE}) or passed on to final conversion ({@link GL11#GL_FALSE FALSE})
	 */
	public static void glMinmax(int target, int internalformat, boolean sink) {
		long __functionAddress = getInstance().Minmax;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMinmax(target, internalformat, sink, __functionAddress);
	}

	// --- [ glResetMinmax ] ---

	/** JNI method for {@link #glResetMinmax ResetMinmax} */
	@JavadocExclude
	public static native void nglResetMinmax(int target, long __functionAddress);

	/**
	 * Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.
	 *
	 * @param target the minmax target. Must be:<br>{@link #GL_MINMAX MINMAX}
	 */
	public static void glResetMinmax(int target) {
		long __functionAddress = getInstance().ResetMinmax;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglResetMinmax(target, __functionAddress);
	}

	// --- [ glGetMinmax ] ---

	/** JNI method for {@link #glGetMinmax GetMinmax} */
	@JavadocExclude
	public static native void nglGetMinmax(int target, boolean reset, int format, int type, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetMinmax GetMinmax} */
	@JavadocExclude
	public static void nglGetMinmax(int target, boolean reset, int format, int type, long values) {
		long __functionAddress = getInstance().GetMinmax;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMinmax(target, reset, format, type, values, __functionAddress);
	}

	/**
	 * Returns the current contents of the minmax table.
	 *
	 * @param target the minmax target. Must be:<br>{@link #GL_MINMAX MINMAX}
	 * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type   the pixel data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param values a buffer in which to place the minmax values
	 */
	public static void glGetMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMinmax(target, reset, format, type, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glGetMinmax GetMinmax} */
	public static void glGetMinmax(int target, boolean reset, int format, int type, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetMinmax(target, reset, format, type, valuesOffset);
	}

	// --- [ glGetMinmaxParameteriv ] ---

	/** JNI method for {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
	@JavadocExclude
	public static native void nglGetMinmaxParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
	@JavadocExclude
	public static void nglGetMinmaxParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetMinmaxParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMinmaxParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the integer value of the specified minmax parameter.
	 *
	 * @param target the minmax target. Must be:<br>{@link #GL_MINMAX MINMAX}
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetMinmaxParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMinmaxParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
	public static void glGetMinmaxParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMinmaxParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
	public static int glGetMinmaxParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMinmaxParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetMinmaxParameterfv ] ---

	/** JNI method for {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
	@JavadocExclude
	public static native void nglGetMinmaxParameterfv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
	@JavadocExclude
	public static void nglGetMinmaxParameterfv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetMinmaxParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMinmaxParameterfv(target, pname, params, __functionAddress);
	}

	/**
	 * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
	 *
	 * @param target the minmax target. Must be:<br>{@link #GL_MINMAX MINMAX}
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetMinmaxParameterfv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetMinmaxParameterfv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
	public static void glGetMinmaxParameterfv(int target, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetMinmaxParameterfv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
	public static float glGetMinmaxParameterf(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMinmaxParameterfv(target, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glBlendColor ] ---

	/**
	 * Specifies the constant color C<sub>c</sub> to be used in blending.
	 *
	 * @param red   the red color component
	 * @param green the green color component
	 * @param blue  the blue color component
	 * @param alpha the alpha color component
	 */
	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().BlendColor;
		GL14.nglBlendColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glBlendEquation ] ---

	/**
	 * Controls the blend equations used for per-fragment blending.
	 *
	 * @param mode the blend equation. One of:<br>{@link #GL_FUNC_ADD FUNC_ADD}, {@link #GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link #GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link #GL_MIN MIN}, {@link #GL_MAX MAX}
	 */
	public static void glBlendEquation(int mode) {
		long __functionAddress = getInstance().BlendEquation;
		GL14.nglBlendEquation(mode, __functionAddress);
	}

}