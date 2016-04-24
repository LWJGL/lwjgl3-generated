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

/** Native bindings to the OpenGL 1.2 optional imaging subset. */
public class ARBImaging {

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

	/** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
	public static final int
		GL_CONSTANT_COLOR           = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
		GL_CONSTANT_ALPHA           = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

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

	protected ARBImaging() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glColorTable, caps.glCopyColorTable, caps.glColorTableParameteriv, caps.glColorTableParameterfv, caps.glGetColorTable, 
			caps.glGetColorTableParameteriv, caps.glGetColorTableParameterfv, caps.glColorSubTable, caps.glCopyColorSubTable, caps.glConvolutionFilter1D, 
			caps.glConvolutionFilter2D, caps.glCopyConvolutionFilter1D, caps.glCopyConvolutionFilter2D, caps.glGetConvolutionFilter, caps.glSeparableFilter2D, 
			caps.glGetSeparableFilter, caps.glConvolutionParameteri, caps.glConvolutionParameteriv, caps.glConvolutionParameterf, caps.glConvolutionParameterfv, 
			caps.glGetConvolutionParameteriv, caps.glGetConvolutionParameterfv, caps.glHistogram, caps.glResetHistogram, caps.glGetHistogram, 
			caps.glGetHistogramParameteriv, caps.glGetHistogramParameterfv, caps.glMinmax, caps.glResetMinmax, caps.glGetMinmax, caps.glGetMinmaxParameteriv, 
			caps.glGetMinmaxParameterfv
		)) && checkFunctions(
			caps.glBlendColor, caps.glBlendEquation
		);
	}

	// --- [ glColorTable ] ---

	/**
	 * Specifies a color lookup table.
	 *
	 * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the color table width
	 * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table          the color table data
	 */
	public static void nglColorTable(int target, int internalformat, int width, int format, int type, long table) {
		long __functionAddress = GL.getCapabilities().glColorTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, width, format, type, table);
	}

	/**
	 * Specifies a color lookup table.
	 *
	 * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the color table width
	 * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table          the color table data
	 */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ByteBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/**
	 * Specifies a color lookup table.
	 *
	 * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the color table width
	 * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table          the color table data
	 */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, long table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglColorTable(target, internalformat, width, format, type, table);
	}

	/** ShortBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ShortBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/** IntBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, IntBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	/** FloatBuffer version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, FloatBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorTable(target, internalformat, width, format, type, memAddress(table));
	}

	// --- [ glCopyColorTable ] ---

	/**
	 * Defines a color table in exactly the manner of {@link #glColorTable ColorTable}, except that the image data are taken from the framebuffer rather than from client memory.
	 *
	 * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the color table width
	 */
	public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = GL.getCapabilities().glCopyColorTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, internalformat, x, y, width);
	}

	// --- [ glColorTableParameteriv ] ---

	/**
	 * Specifies the scale and bias parameters for a color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglColorTableParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glColorTableParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Specifies the scale and bias parameters for a color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glColorTableParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglColorTableParameteriv(target, pname, memAddress(params));
	}

	// --- [ glColorTableParameterfv ] ---

	/**
	 * Float version of {@link #glColorTableParameteriv ColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void nglColorTableParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glColorTableParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Float version of {@link #glColorTableParameteriv ColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glColorTableParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglColorTableParameterfv(target, pname, memAddress(params));
	}

	// --- [ glGetColorTable ] ---

	/**
	 * Returns the current contents of a color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table  the color table data
	 */
	public static void nglGetColorTable(int target, int format, int type, long table) {
		long __functionAddress = GL.getCapabilities().glGetColorTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, format, type, table);
	}

	/**
	 * Returns the current contents of a color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table  the color table data
	 */
	public static void glGetColorTable(int target, int format, int type, ByteBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/**
	 * Returns the current contents of a color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table  the color table data
	 */
	public static void glGetColorTable(int target, int format, int type, long table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetColorTable(target, format, type, table);
	}

	/** ShortBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, ShortBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/** IntBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, IntBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	/** FloatBuffer version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, FloatBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetColorTable(target, format, type, memAddress(table));
	}

	// --- [ glGetColorTableParameteriv ] ---

	/**
	 * Returns the integer value of the specified color table parameter.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td><td>{@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}</td></tr><tr><td>{@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}</td><td>{@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}</td><td>{@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}</td><td>{@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}</td><td>{@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}</td></tr></table>
	 * @param params a buffer in which to place the returned value
	 */
	public static void nglGetColorTableParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetColorTableParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Returns the integer value of the specified color table parameter.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td><td>{@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}</td></tr><tr><td>{@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}</td><td>{@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}</td><td>{@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}</td><td>{@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}</td><td>{@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}</td></tr></table>
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetColorTableParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetColorTableParameteriv(target, pname, memAddress(params));
	}

	/**
	 * Returns the integer value of the specified color table parameter.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td><td>{@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}</td></tr><tr><td>{@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}</td><td>{@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}</td><td>{@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}</td><td>{@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}</td><td>{@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}</td></tr></table>
	 */
	public static int glGetColorTableParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetColorTableParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetColorTableParameterfv ] ---

	/**
	 * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void nglGetColorTableParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetColorTableParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetColorTableParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetColorTableParameterfv(target, pname, memAddress(params));
	}

	/**
	 * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to query
	 */
	public static float glGetColorTableParameterf(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetColorTableParameterfv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glColorSubTable ] ---

	/**
	 * Respecifies a portion of an existing color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param start  the starting index of the subregion to respecify
	 * @param count  the number of colors in the subregion to respecify
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data   the color table data
	 */
	public static void nglColorSubTable(int target, int start, int count, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glColorSubTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, start, count, format, type, data);
	}

	/**
	 * Respecifies a portion of an existing color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param start  the starting index of the subregion to respecify
	 * @param count  the number of colors in the subregion to respecify
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data   the color table data
	 */
	public static void glColorSubTable(int target, int start, int count, int format, int type, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglColorSubTable(target, start, count, format, type, memAddress(data));
	}

	/**
	 * Respecifies a portion of an existing color table.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param start  the starting index of the subregion to respecify
	 * @param count  the number of colors in the subregion to respecify
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data   the color table data
	 */
	public static void glColorSubTable(int target, int start, int count, int format, int type, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglColorSubTable(target, start, count, format, type, data);
	}

	// --- [ glCopyColorSubTable ] ---

	/**
	 * Respecifies a portion of an existing color table using image taken from the framebuffer.
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param start  the start index of the subregion to respecify
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the number of colors in the subregion to respecify
	 */
	public static void glCopyColorSubTable(int target, int start, int x, int y, int width) {
		long __functionAddress = GL.getCapabilities().glCopyColorSubTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, start, x, y, width);
	}

	// --- [ glConvolutionFilter1D ] ---

	/**
	 * Defines a one-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glConvolutionFilter1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, width, format, type, data);
	}

	/**
	 * Defines a one-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglConvolutionFilter1D(target, internalformat, width, format, type, memAddress(data));
	}

	/**
	 * Defines a one-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglConvolutionFilter1D(target, internalformat, width, format, type, data);
	}

	// --- [ glConvolutionFilter2D ] ---

	/**
	 * Defines a two-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glConvolutionFilter2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, width, height, format, type, data);
	}

	/**
	 * Defines a two-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, memAddress(data));
	}

	/**
	 * Defines a two-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, data);
	}

	// --- [ glCopyConvolutionFilter1D ] ---

	/**
	 * Defines a one-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 */
	public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = GL.getCapabilities().glCopyConvolutionFilter1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, internalformat, x, y, width);
	}

	// --- [ glCopyConvolutionFilter2D ] ---

	/**
	 * Defines a two-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 * @param height         the filter height
	 */
	public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glCopyConvolutionFilter2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, internalformat, x, y, width, height);
	}

	// --- [ glGetConvolutionFilter ] ---

	/**
	 * Returns the contents of a convolution filter.
	 *
	 * @param target the convolution target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param image  the filter data
	 */
	public static void nglGetConvolutionFilter(int target, int format, int type, long image) {
		long __functionAddress = GL.getCapabilities().glGetConvolutionFilter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, format, type, image);
	}

	/**
	 * Returns the contents of a convolution filter.
	 *
	 * @param target the convolution target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param image  the filter data
	 */
	public static void glGetConvolutionFilter(int target, int format, int type, ByteBuffer image) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetConvolutionFilter(target, format, type, memAddress(image));
	}

	/**
	 * Returns the contents of a convolution filter.
	 *
	 * @param target the convolution target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param image  the filter data
	 */
	public static void glGetConvolutionFilter(int target, int format, int type, long image) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetConvolutionFilter(target, format, type, image);
	}

	// --- [ glSeparableFilter2D ] ---

	/**
	 * Specifies a two-dimensional separable convolution filter.
	 *
	 * @param target         the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row            the horizontal filter data
	 * @param column         the vertical filter data
	 */
	public static void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column) {
		long __functionAddress = GL.getCapabilities().glSeparableFilter2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, internalformat, width, height, format, type, row, column);
	}

	/**
	 * Specifies a two-dimensional separable convolution filter.
	 *
	 * @param target         the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row            the horizontal filter data
	 * @param column         the vertical filter data
	 */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ByteBuffer column) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), memAddress(column));
	}

	/**
	 * Specifies a two-dimensional separable convolution filter.
	 *
	 * @param target         the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row            the horizontal filter data
	 * @param column         the vertical filter data
	 */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglSeparableFilter2D(target, internalformat, width, height, format, type, row, column);
	}

	// --- [ glGetSeparableFilter ] ---

	/**
	 * Returns the current contents of a separable convolution filter.
	 *
	 * @param target the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row    a buffer in which to return the filter row
	 * @param column a buffer in which to return the filter column
	 * @param span   unused
	 */
	public static void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span) {
		long __functionAddress = GL.getCapabilities().glGetSeparableFilter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, format, type, row, column, span);
	}

	/**
	 * Returns the current contents of a separable convolution filter.
	 *
	 * @param target the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row    a buffer in which to return the filter row
	 * @param column a buffer in which to return the filter column
	 * @param span   unused
	 */
	public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetSeparableFilter(target, format, type, memAddress(row), memAddress(column), memAddressSafe(span));
	}

	/**
	 * Returns the current contents of a separable convolution filter.
	 *
	 * @param target the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row    a buffer in which to return the filter row
	 * @param column a buffer in which to return the filter column
	 * @param span   unused
	 */
	public static void glGetSeparableFilter(int target, int format, int type, long row, long column, ByteBuffer span) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetSeparableFilter(target, format, type, row, column, memAddressSafe(span));
	}

	// --- [ glConvolutionParameteri ] ---

	/**
	 * Specifies the scale and bias of a convolution filter.
	 *
	 * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_BORDER_MODE CONVOLUTION_BORDER_MODE}</td></tr></table>
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameteri(int target, int pname, int param) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, pname, param);
	}

	// --- [ glConvolutionParameteriv ] ---

	/**
	 * Pointer version of {@link #glConvolutionParameteri ConvolutionParameteri}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglConvolutionParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Pointer version of {@link #glConvolutionParameteri ConvolutionParameteri}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glConvolutionParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglConvolutionParameteriv(target, pname, memAddress(params));
	}

	// --- [ glConvolutionParameterf ] ---

	/**
	 * Float version of {@link #glConvolutionParameteri ConvolutionParameteri}
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameterf(int target, int pname, float param) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, pname, param);
	}

	// --- [ glConvolutionParameterfv ] ---

	/**
	 * Pointer version of {@link #glConvolutionParameterf ConvolutionParameterf}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglConvolutionParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Pointer version of {@link #glConvolutionParameterf ConvolutionParameterf}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglConvolutionParameterfv(target, pname, memAddress(params));
	}

	// --- [ glGetConvolutionParameteriv ] ---

	/**
	 * Returns the value of a convolution filter parameter.
	 *
	 * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}</td><td>{@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}</td><td>{@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}</td><td>{@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}</td></tr><tr><td>{@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}</td></tr></table>
	 * @param params a buffer in which to return the parameter value
	 */
	public static void nglGetConvolutionParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetConvolutionParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Returns the value of a convolution filter parameter.
	 *
	 * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}</td><td>{@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}</td><td>{@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}</td><td>{@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}</td></tr><tr><td>{@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}</td></tr></table>
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetConvolutionParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetConvolutionParameteriv(target, pname, memAddress(params));
	}

	/**
	 * Returns the value of a convolution filter parameter.
	 *
	 * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}</td><td>{@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}</td><td>{@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}</td><td>{@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}</td></tr><tr><td>{@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}</td></tr></table>
	 */
	public static int glGetConvolutionParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetConvolutionParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetConvolutionParameterfv ] ---

	/**
	 * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to return the parameter value
	 */
	public static void nglGetConvolutionParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetConvolutionParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetConvolutionParameterfv(target, pname, memAddress(params));
	}

	/**
	 * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to query
	 */
	public static float glGetConvolutionParameterf(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetConvolutionParameterfv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glHistogram ] ---

	/**
	 * Specifies the histogram table.
	 *
	 * @param target         the histogram target. One of:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td><td>{@link #GL_PROXY_HISTOGRAM PROXY_HISTOGRAM}</td></tr></table>
	 * @param width          the histogram width
	 * @param internalformat the histogram internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param sink           whether pixel groups will be consumed by the histogram operation ({@link GL11#GL_TRUE TRUE}) or passed on to the minmax operation ({@link GL11#GL_FALSE FALSE})
	 */
	public static void glHistogram(int target, int width, int internalformat, boolean sink) {
		long __functionAddress = GL.getCapabilities().glHistogram;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, width, internalformat, sink);
	}

	// --- [ glResetHistogram ] ---

	/**
	 * Resets all counters of all elements of the histogram table to zero.
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 */
	public static void glResetHistogram(int target) {
		long __functionAddress = GL.getCapabilities().glResetHistogram;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glGetHistogram ] ---

	/**
	 * Returns the current contents of the histogram table.
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values the pixel data
	 */
	public static void nglGetHistogram(int target, boolean reset, int format, int type, long values) {
		long __functionAddress = GL.getCapabilities().glGetHistogram;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, reset, format, type, values);
	}

	/**
	 * Returns the current contents of the histogram table.
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values the pixel data
	 */
	public static void glGetHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetHistogram(target, reset, format, type, memAddress(values));
	}

	/**
	 * Returns the current contents of the histogram table.
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values the pixel data
	 */
	public static void glGetHistogram(int target, boolean reset, int format, int type, long values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetHistogram(target, reset, format, type, values);
	}

	// --- [ glGetHistogramParameteriv ] ---

	/**
	 * Returns the integer values of the specified histogram parameter
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}</td><td>{@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}</td><td>{@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}</td><td>{@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}</td></tr><tr><td>{@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}</td><td>{@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}</td><td>{@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}</td><td>{@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}</td></tr></table>
	 * @param params a buffer in which to return the parameter values
	 */
	public static void nglGetHistogramParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetHistogramParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Returns the integer values of the specified histogram parameter
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}</td><td>{@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}</td><td>{@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}</td><td>{@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}</td></tr><tr><td>{@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}</td><td>{@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}</td><td>{@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}</td><td>{@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}</td></tr></table>
	 * @param params a buffer in which to return the parameter values
	 */
	public static void glGetHistogramParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetHistogramParameteriv(target, pname, memAddress(params));
	}

	/**
	 * Returns the integer values of the specified histogram parameter
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}</td><td>{@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}</td><td>{@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}</td><td>{@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}</td></tr><tr><td>{@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}</td><td>{@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}</td><td>{@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}</td><td>{@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}</td></tr></table>
	 */
	public static int glGetHistogramParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetHistogramParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetHistogramParameterfv ] ---

	/**
	 * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
	 *
	 * @param target the histogram target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void nglGetHistogramParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetHistogramParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
	 *
	 * @param target the histogram target
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetHistogramParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetHistogramParameterfv(target, pname, memAddress(params));
	}

	/**
	 * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
	 *
	 * @param target the histogram target
	 * @param pname  the parameter to query
	 */
	public static float glGetHistogramParameterf(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetHistogramParameterfv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMinmax ] ---

	/**
	 * Specifies the minmax table.
	 *
	 * @param target         the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param internalformat the minmax table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
	 * @param sink           whether pixel groups will be consumed by the minmax operation ({@link GL11#GL_TRUE TRUE}) or passed on to final conversion ({@link GL11#GL_FALSE FALSE})
	 */
	public static void glMinmax(int target, int internalformat, boolean sink) {
		long __functionAddress = GL.getCapabilities().glMinmax;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, internalformat, sink);
	}

	// --- [ glResetMinmax ] ---

	/**
	 * Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 */
	public static void glResetMinmax(int target) {
		long __functionAddress = GL.getCapabilities().glResetMinmax;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glGetMinmax ] ---

	/**
	 * Returns the current contents of the minmax table.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values a buffer in which to place the minmax values
	 */
	public static void nglGetMinmax(int target, boolean reset, int format, int type, long values) {
		long __functionAddress = GL.getCapabilities().glGetMinmax;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, reset, format, type, values);
	}

	/**
	 * Returns the current contents of the minmax table.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values a buffer in which to place the minmax values
	 */
	public static void glGetMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetMinmax(target, reset, format, type, memAddress(values));
	}

	/**
	 * Returns the current contents of the minmax table.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values a buffer in which to place the minmax values
	 */
	public static void glGetMinmax(int target, boolean reset, int format, int type, long values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetMinmax(target, reset, format, type, values);
	}

	// --- [ glGetMinmaxParameteriv ] ---

	/**
	 * Returns the integer value of the specified minmax parameter.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void nglGetMinmaxParameteriv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetMinmaxParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Returns the integer value of the specified minmax parameter.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetMinmaxParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetMinmaxParameteriv(target, pname, memAddress(params));
	}

	/**
	 * Returns the integer value of the specified minmax parameter.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 */
	public static int glGetMinmaxParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetMinmaxParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetMinmaxParameterfv ] ---

	/**
	 * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void nglGetMinmaxParameterfv(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetMinmaxParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned value
	 */
	public static void glGetMinmaxParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetMinmaxParameterfv(target, pname, memAddress(params));
	}

	/**
	 * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
	 * @param pname  the parameter to query
	 */
	public static float glGetMinmaxParameterf(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetMinmaxParameterfv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
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
		long __functionAddress = GL.getCapabilities().glBlendColor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glBlendEquation ] ---

	/**
	 * Controls the blend equations used for per-fragment blending.
	 *
	 * @param mode the blend equation. One of:<br><table><tr><td>{@link #GL_FUNC_ADD FUNC_ADD}</td><td>{@link #GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link #GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link #GL_MIN MIN}</td><td>{@link #GL_MAX MAX}</td></tr></table>
	 */
	public static void glBlendEquation(int mode) {
		long __functionAddress = GL.getCapabilities().glBlendEquation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode);
	}

	/** short[] version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, short[] table) {
		long __functionAddress = GL.getCapabilities().glColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, internalformat, width, format, type, table);
	}

	/** int[] version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, int[] table) {
		long __functionAddress = GL.getCapabilities().glColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, internalformat, width, format, type, table);
	}

	/** float[] version of: {@link #glColorTable ColorTable} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, float[] table) {
		long __functionAddress = GL.getCapabilities().glColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, internalformat, width, format, type, table);
	}

	/** Array version of: {@link #glColorTableParameteriv ColorTableParameteriv} */
	public static void glColorTableParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glColorTableParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glColorTableParameterfv ColorTableParameterfv} */
	public static void glColorTableParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glColorTableParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** short[] version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, short[] table) {
		long __functionAddress = GL.getCapabilities().glGetColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table);
	}

	/** int[] version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, int[] table) {
		long __functionAddress = GL.getCapabilities().glGetColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table);
	}

	/** float[] version of: {@link #glGetColorTable GetColorTable} */
	public static void glGetColorTable(int target, int format, int type, float[] table) {
		long __functionAddress = GL.getCapabilities().glGetColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table);
	}

	/** Array version of: {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
	public static void glGetColorTableParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetColorTableParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
	public static void glGetColorTableParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetColorTableParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glConvolutionParameteriv ConvolutionParameteriv} */
	public static void glConvolutionParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glConvolutionParameterfv ConvolutionParameterfv} */
	public static void glConvolutionParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glConvolutionParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
	public static void glGetConvolutionParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetConvolutionParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
	public static void glGetConvolutionParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetConvolutionParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
	public static void glGetHistogramParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetHistogramParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
	public static void glGetHistogramParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetHistogramParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
	public static void glGetMinmaxParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetMinmaxParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
	public static void glGetMinmaxParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetMinmaxParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

}