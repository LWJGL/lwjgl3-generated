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

/** The core OpenGL 1.3 functionality. */
public final class GL13 {

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
	public static final int
		GL_COMPRESSED_ALPHA           = 0x84E9,
		GL_COMPRESSED_LUMINANCE       = 0x84EA,
		GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB,
		GL_COMPRESSED_INTENSITY       = 0x84EC,
		GL_COMPRESSED_RGB             = 0x84ED,
		GL_COMPRESSED_RGBA            = 0x84EE;

	/** Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TEXTURE_COMPRESSION_HINT = 0x84EF;

	/** Accepted by the {@code value} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0,
		GL_TEXTURE_COMPRESSED            = 0x86A1;

	/** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int
		GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2,
		GL_COMPRESSED_TEXTURE_FORMATS     = 0x86A3;

	/** Accepted by the {@code param} parameters of TexGend, TexGenf, and TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE. */
	public static final int
		GL_NORMAL_MAP     = 0x8511,
		GL_REFLECTION_MAP = 0x8512;

	/**
	 * When the {@code pname} parameter of TexGendv, TexGenfv, and TexGeniv is TEXTURE_GEN_MODE, then the array {@code params} may also contain NORMAL_MAP
	 * or REFLECTION_MAP. Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled, and by the {@code pname} parameter of GetBooleanv,
	 * GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf,
	 * TexParameteri, TexParameterfv, and TexParameteriv.
	 */
	public static final int
		GL_TEXTURE_CUBE_MAP = 0x8513;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

	/**
	 * Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and
	 * CopySubTexImage2D.
	 */
	public static final int
		GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516,
		GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518,
		GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519,
		GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;

	/** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and TexImage2D. */
	public static final int
		GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_MULTISAMPLE              = 0x809D,
		GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E,
		GL_SAMPLE_ALPHA_TO_ONE      = 0x809F,
		GL_SAMPLE_COVERAGE          = 0x80A0;

	/** Accepted by the {@code mask} parameter of PushAttrib. */
	public static final int
		GL_MULTISAMPLE_BIT = 0x20000000;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_SAMPLE_BUFFERS         = 0x80A8,
		GL_SAMPLES                = 0x80A9,
		GL_SAMPLE_COVERAGE_VALUE  = 0x80AA,
		GL_SAMPLE_COVERAGE_INVERT = 0x80AB;

	/** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord. */
	public static final int
		GL_TEXTURE0  = 0x84C0,
		GL_TEXTURE1  = 0x84C1,
		GL_TEXTURE2  = 0x84C2,
		GL_TEXTURE3  = 0x84C3,
		GL_TEXTURE4  = 0x84C4,
		GL_TEXTURE5  = 0x84C5,
		GL_TEXTURE6  = 0x84C6,
		GL_TEXTURE7  = 0x84C7,
		GL_TEXTURE8  = 0x84C8,
		GL_TEXTURE9  = 0x84C9,
		GL_TEXTURE10 = 0x84CA,
		GL_TEXTURE11 = 0x84CB,
		GL_TEXTURE12 = 0x84CC,
		GL_TEXTURE13 = 0x84CD,
		GL_TEXTURE14 = 0x84CE,
		GL_TEXTURE15 = 0x84CF,
		GL_TEXTURE16 = 0x84D0,
		GL_TEXTURE17 = 0x84D1,
		GL_TEXTURE18 = 0x84D2,
		GL_TEXTURE19 = 0x84D3,
		GL_TEXTURE20 = 0x84D4,
		GL_TEXTURE21 = 0x84D5,
		GL_TEXTURE22 = 0x84D6,
		GL_TEXTURE23 = 0x84D7,
		GL_TEXTURE24 = 0x84D8,
		GL_TEXTURE25 = 0x84D9,
		GL_TEXTURE26 = 0x84DA,
		GL_TEXTURE27 = 0x84DB,
		GL_TEXTURE28 = 0x84DC,
		GL_TEXTURE29 = 0x84DD,
		GL_TEXTURE30 = 0x84DE,
		GL_TEXTURE31 = 0x84DF;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_ACTIVE_TEXTURE        = 0x84E0,
		GL_CLIENT_ACTIVE_TEXTURE = 0x84E1,
		GL_MAX_TEXTURE_UNITS     = 0x84E2;

	/** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is TEXTURE_ENV_MODE. */
	public static final int
		GL_COMBINE = 0x8570;

	/** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV. */
	public static final int
		GL_COMBINE_RGB    = 0x8571,
		GL_COMBINE_ALPHA  = 0x8572,
		GL_SOURCE0_RGB    = 0x8580,
		GL_SOURCE1_RGB    = 0x8581,
		GL_SOURCE2_RGB    = 0x8582,
		GL_SOURCE0_ALPHA  = 0x8588,
		GL_SOURCE1_ALPHA  = 0x8589,
		GL_SOURCE2_ALPHA  = 0x858A,
		GL_OPERAND0_RGB   = 0x8590,
		GL_OPERAND1_RGB   = 0x8591,
		GL_OPERAND2_RGB   = 0x8592,
		GL_OPERAND0_ALPHA = 0x8598,
		GL_OPERAND1_ALPHA = 0x8599,
		GL_OPERAND2_ALPHA = 0x859A,
		GL_RGB_SCALE      = 0x8573;

	/**
	 * Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB or
	 * COMBINE_ALPHA.
	 */
	public static final int
		GL_ADD_SIGNED  = 0x8574,
		GL_INTERPOLATE = 0x8575,
		GL_SUBTRACT    = 0x84E7;

	/**
	 * Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB,
	 * SOURCE1_RGB, SOURCE2_RGB, SOURCE0_ALPHA, SOURCE1_ALPHA, or SOURCE2_ALPHA.
	 */
	public static final int
		GL_CONSTANT      = 0x8576,
		GL_PRIMARY_COLOR = 0x8577,
		GL_PREVIOUS      = 0x8578;

	/** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB. */
	public static final int
		GL_DOT3_RGB  = 0x86AE,
		GL_DOT3_RGBA = 0x86AF;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
	 * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
	 */
	public static final int
		GL_CLAMP_TO_BORDER = 0x812D;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TRANSPOSE_MODELVIEW_MATRIX  = 0x84E3,
		GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4,
		GL_TRANSPOSE_TEXTURE_MATRIX    = 0x84E5,
		GL_TRANSPOSE_COLOR_MATRIX      = 0x84E6;

	/** Function address. */
	@JavadocExclude
	public final long
		glCompressedTexImage3D,
		glCompressedTexImage2D,
		glCompressedTexImage1D,
		glCompressedTexSubImage3D,
		glCompressedTexSubImage2D,
		glCompressedTexSubImage1D,
		glGetCompressedTexImage,
		glSampleCoverage,
		glActiveTexture,
		glClientActiveTexture,
		glMultiTexCoord1f,
		glMultiTexCoord1s,
		glMultiTexCoord1i,
		glMultiTexCoord1d,
		glMultiTexCoord1fv,
		glMultiTexCoord1sv,
		glMultiTexCoord1iv,
		glMultiTexCoord1dv,
		glMultiTexCoord2f,
		glMultiTexCoord2s,
		glMultiTexCoord2i,
		glMultiTexCoord2d,
		glMultiTexCoord2fv,
		glMultiTexCoord2sv,
		glMultiTexCoord2iv,
		glMultiTexCoord2dv,
		glMultiTexCoord3f,
		glMultiTexCoord3s,
		glMultiTexCoord3i,
		glMultiTexCoord3d,
		glMultiTexCoord3fv,
		glMultiTexCoord3sv,
		glMultiTexCoord3iv,
		glMultiTexCoord3dv,
		glMultiTexCoord4f,
		glMultiTexCoord4s,
		glMultiTexCoord4i,
		glMultiTexCoord4d,
		glMultiTexCoord4fv,
		glMultiTexCoord4sv,
		glMultiTexCoord4iv,
		glMultiTexCoord4dv,
		glLoadTransposeMatrixf,
		glLoadTransposeMatrixd,
		glMultTransposeMatrixf,
		glMultTransposeMatrixd;

	@JavadocExclude
	public GL13(FunctionProvider provider, boolean fc) {
		glCompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
		glCompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
		glCompressedTexImage1D = provider.getFunctionAddress("glCompressedTexImage1D");
		glCompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
		glCompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
		glCompressedTexSubImage1D = provider.getFunctionAddress("glCompressedTexSubImage1D");
		glGetCompressedTexImage = provider.getFunctionAddress("glGetCompressedTexImage");
		glSampleCoverage = provider.getFunctionAddress("glSampleCoverage");
		glActiveTexture = provider.getFunctionAddress("glActiveTexture");
		glClientActiveTexture = GL.getFunctionAddress(provider, "glClientActiveTexture", fc);
		glMultiTexCoord1f = GL.getFunctionAddress(provider, "glMultiTexCoord1f", fc);
		glMultiTexCoord1s = GL.getFunctionAddress(provider, "glMultiTexCoord1s", fc);
		glMultiTexCoord1i = GL.getFunctionAddress(provider, "glMultiTexCoord1i", fc);
		glMultiTexCoord1d = GL.getFunctionAddress(provider, "glMultiTexCoord1d", fc);
		glMultiTexCoord1fv = GL.getFunctionAddress(provider, "glMultiTexCoord1fv", fc);
		glMultiTexCoord1sv = GL.getFunctionAddress(provider, "glMultiTexCoord1sv", fc);
		glMultiTexCoord1iv = GL.getFunctionAddress(provider, "glMultiTexCoord1iv", fc);
		glMultiTexCoord1dv = GL.getFunctionAddress(provider, "glMultiTexCoord1dv", fc);
		glMultiTexCoord2f = GL.getFunctionAddress(provider, "glMultiTexCoord2f", fc);
		glMultiTexCoord2s = GL.getFunctionAddress(provider, "glMultiTexCoord2s", fc);
		glMultiTexCoord2i = GL.getFunctionAddress(provider, "glMultiTexCoord2i", fc);
		glMultiTexCoord2d = GL.getFunctionAddress(provider, "glMultiTexCoord2d", fc);
		glMultiTexCoord2fv = GL.getFunctionAddress(provider, "glMultiTexCoord2fv", fc);
		glMultiTexCoord2sv = GL.getFunctionAddress(provider, "glMultiTexCoord2sv", fc);
		glMultiTexCoord2iv = GL.getFunctionAddress(provider, "glMultiTexCoord2iv", fc);
		glMultiTexCoord2dv = GL.getFunctionAddress(provider, "glMultiTexCoord2dv", fc);
		glMultiTexCoord3f = GL.getFunctionAddress(provider, "glMultiTexCoord3f", fc);
		glMultiTexCoord3s = GL.getFunctionAddress(provider, "glMultiTexCoord3s", fc);
		glMultiTexCoord3i = GL.getFunctionAddress(provider, "glMultiTexCoord3i", fc);
		glMultiTexCoord3d = GL.getFunctionAddress(provider, "glMultiTexCoord3d", fc);
		glMultiTexCoord3fv = GL.getFunctionAddress(provider, "glMultiTexCoord3fv", fc);
		glMultiTexCoord3sv = GL.getFunctionAddress(provider, "glMultiTexCoord3sv", fc);
		glMultiTexCoord3iv = GL.getFunctionAddress(provider, "glMultiTexCoord3iv", fc);
		glMultiTexCoord3dv = GL.getFunctionAddress(provider, "glMultiTexCoord3dv", fc);
		glMultiTexCoord4f = GL.getFunctionAddress(provider, "glMultiTexCoord4f", fc);
		glMultiTexCoord4s = GL.getFunctionAddress(provider, "glMultiTexCoord4s", fc);
		glMultiTexCoord4i = GL.getFunctionAddress(provider, "glMultiTexCoord4i", fc);
		glMultiTexCoord4d = GL.getFunctionAddress(provider, "glMultiTexCoord4d", fc);
		glMultiTexCoord4fv = GL.getFunctionAddress(provider, "glMultiTexCoord4fv", fc);
		glMultiTexCoord4sv = GL.getFunctionAddress(provider, "glMultiTexCoord4sv", fc);
		glMultiTexCoord4iv = GL.getFunctionAddress(provider, "glMultiTexCoord4iv", fc);
		glMultiTexCoord4dv = GL.getFunctionAddress(provider, "glMultiTexCoord4dv", fc);
		glLoadTransposeMatrixf = GL.getFunctionAddress(provider, "glLoadTransposeMatrixf", fc);
		glLoadTransposeMatrixd = GL.getFunctionAddress(provider, "glLoadTransposeMatrixd", fc);
		glMultTransposeMatrixf = GL.getFunctionAddress(provider, "glMultTransposeMatrixf", fc);
		glMultTransposeMatrixd = GL.getFunctionAddress(provider, "glMultTransposeMatrixd", fc);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL13} instance for the current context. */
	public static GL13 getInstance() {
		return GL.getCapabilities().__GL13;
	}

	static GL13 create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL13") ) return null;

		GL13 funcs = new GL13(provider, fc);

		boolean supported = 
			GL.isFunctionSupported(funcs.glCompressedTexImage3D) &&
			GL.isFunctionSupported(funcs.glCompressedTexImage2D) &&
			GL.isFunctionSupported(funcs.glCompressedTexImage1D) &&
			GL.isFunctionSupported(funcs.glCompressedTexSubImage3D) &&
			GL.isFunctionSupported(funcs.glCompressedTexSubImage2D) &&
			GL.isFunctionSupported(funcs.glCompressedTexSubImage1D) &&
			GL.isFunctionSupported(funcs.glGetCompressedTexImage) &&
			GL.isFunctionSupported(funcs.glSampleCoverage) &&
			GL.isFunctionSupported(funcs.glActiveTexture) &&
			GL.isFunctionSupported(funcs.glClientActiveTexture, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1f, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1s, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1i, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1d, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1fv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1sv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1iv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord1dv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2f, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2s, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2i, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2d, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2fv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2sv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2iv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord2dv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3f, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3s, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3i, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3d, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3fv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3sv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3iv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord3dv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4f, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4s, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4i, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4d, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4fv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4sv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4iv, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoord4dv, fc) &&
			GL.isFunctionSupported(funcs.glLoadTransposeMatrixf, fc) &&
			GL.isFunctionSupported(funcs.glLoadTransposeMatrixd, fc) &&
			GL.isFunctionSupported(funcs.glMultTransposeMatrixf, fc) &&
			GL.isFunctionSupported(funcs.glMultTransposeMatrixd, fc);

		return GL.checkExtension("OpenGL13", funcs, supported);
	}

	// --- [ glCompressedTexImage3D ] ---

	/** JNI method for {@link #glCompressedTexImage3D glCompressedTexImage3D} */
	@JavadocExclude
	public static native void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexImage3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a three-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<p/>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param depth          the depth of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage3D glCompressedTexImage3D} */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexImage3D glCompressedTexImage3D} */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, 0, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glCompressedTexImage2D ] ---

	/** JNI method for {@link #glCompressedTexImage2D glCompressedTexImage2D} */
	@JavadocExclude
	public static native void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a two-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<p/>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage2D glCompressedTexImage2D} */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexImage2D glCompressedTexImage2D} */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage2D(target, level, internalformat, width, height, 0, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glCompressedTexImage1D ] ---

	/** JNI method for {@link #glCompressedTexImage1D glCompressedTexImage1D} */
	@JavadocExclude
	public static native void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a one-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<p/>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param width          the width of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexImage1D glCompressedTexImage1D} */
	public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexImage1D glCompressedTexImage1D} */
	public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexImage1D(target, level, internalformat, width, 0, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glCompressedTexSubImage3D ] ---

	/** JNI method for {@link #glCompressedTexSubImage3D glCompressedTexSubImage3D} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexSubImage3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<p/>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param zoffset   a texel offset in the z direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param depth     the depth of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage3D glCompressedTexSubImage3D} */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage3D glCompressedTexSubImage3D} */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glCompressedTexSubImage2D ] ---

	/** JNI method for {@link #glCompressedTexSubImage2D glCompressedTexSubImage2D} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexSubImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<p/>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage2D glCompressedTexSubImage2D} */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage2D glCompressedTexSubImage2D} */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glCompressedTexSubImage1D ] ---

	/** JNI method for {@link #glCompressedTexSubImage1D glCompressedTexSubImage1D} */
	@JavadocExclude
	public static native void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCompressedTexSubImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. Must be:<p/>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<p/>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionAstcLdr}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glCompressedTexSubImage1D glCompressedTexSubImage1D} */
	public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		long __functionAddress = getInstance().glCompressedTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glCompressedTexSubImage1D glCompressedTexSubImage1D} */
	public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
		long __functionAddress = getInstance().glCompressedTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		}
		nglCompressedTexSubImage1D(target, level, xoffset, width, format, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glGetCompressedTexImage ] ---

	/** JNI method for {@link #glGetCompressedTexImage glGetCompressedTexImage} */
	@JavadocExclude
	public static native void nglGetCompressedTexImage(int target, int lod, long img, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetCompressedTexImage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a compressed texture image.
	 *
	 * @param target the target texture. One of:<p/>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}
	 * @param lod    the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param img    an array in which to return the compressed texture image
	 */
	public static void glGetCompressedTexImage(int target, int lod, ByteBuffer img) {
		long __functionAddress = getInstance().glGetCompressedTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(img, GL11.glGetTexLevelParameteri(target, lod, GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTexImage(target, lod, memAddress(img), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetCompressedTexImage glGetCompressedTexImage} */
	public static void glGetCompressedTexImage(int target, int lod, long imgOffset) {
		long __functionAddress = getInstance().glGetCompressedTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		}
		nglGetCompressedTexImage(target, lod, imgOffset, __functionAddress);
	}

	// --- [ glSampleCoverage ] ---

	/** JNI method for {@link #glSampleCoverage glSampleCoverage} */
	@JavadocExclude
	public static native void nglSampleCoverage(float value, boolean invert, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSampleCoverage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies multisample coverage parameters.
	 * <p/>
	 * Multisampling samples a pixel multiple times at various implementation-dependent subpixel locations to generate antialiasing effects. Multisampling
	 * transparently antialiases points, lines, polygons, and images if it is enabled.
	 * <p/>
	 * {@code value} is used in constructing a temporary mask used in determining which samples will be used in resolving the final fragment color. This mask
	 * is bitwise-ANDed with the coverage mask generated from the multisampling computation. If the {@code invert} flag is set, the temporary mask is inverted
	 * (all bits flipped) and then the bitwise-AND is computed.
	 * <p/>
	 * If an implementation does not have any multisample buffers available, or multisampling is disabled, rasterization occurs with only a single sample
	 * computing a pixel's final RGB color.
	 * <p/>
	 * Provided an implementation supports multisample buffers, and multisampling is enabled, then a pixel's final color is generated by combining several
	 * samples per pixel. Each sample contains color, depth, and stencil information, allowing those operations to be performed on each sample.
	 *
	 * @param value  a sample coverage value. The value is clamped to the range [0, 1]. The initial value is 1.0.
	 * @param invert if the coverage masks should be inverted. The initial value is false.
	 */
	public static void glSampleCoverage(float value, boolean invert) {
		long __functionAddress = getInstance().glSampleCoverage;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSampleCoverage(value, invert, __functionAddress);
	}

	// --- [ glActiveTexture ] ---

	/** JNI method for {@link #glActiveTexture glActiveTexture} */
	@JavadocExclude
	public static native void nglActiveTexture(int texture, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glActiveTexture.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
	 * dependent.
	 *
	 * @param texture which texture unit to make active. Must be:<p/>{@link #GL_TEXTURE0 TEXTURE0}, GL_TEXTURE[1-31]
	 */
	public static void glActiveTexture(int texture) {
		long __functionAddress = getInstance().glActiveTexture;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglActiveTexture(texture, __functionAddress);
	}

	// --- [ glClientActiveTexture ] ---

	/** JNI method for {@link #glClientActiveTexture glClientActiveTexture} */
	@JavadocExclude
	public static native void nglClientActiveTexture(int texture, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glClientActiveTexture.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
	 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
	 *
	 * @param texture which texture coordinate array to make active. Must be:<p/>{@link #GL_TEXTURE0 TEXTURE0}, GL_TEXTURE[1-31]
	 */
	public static void glClientActiveTexture(int texture) {
		long __functionAddress = getInstance().glClientActiveTexture;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClientActiveTexture(texture, __functionAddress);
	}

	// --- [ glMultiTexCoord1f ] ---

	/** JNI method for {@link #glMultiTexCoord1f glMultiTexCoord1f} */
	@JavadocExclude
	public static native void nglMultiTexCoord1f(int texture, float s, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current one-dimensional texture coordinate for the given texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1f(int texture, float s) {
		long __functionAddress = getInstance().glMultiTexCoord1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1f(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1s ] ---

	/** JNI method for {@link #glMultiTexCoord1s glMultiTexCoord1s} */
	@JavadocExclude
	public static native void nglMultiTexCoord1s(int texture, short s, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glMultiTexCoord1f glMultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1s(int texture, short s) {
		long __functionAddress = getInstance().glMultiTexCoord1s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1s(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1i ] ---

	/** JNI method for {@link #glMultiTexCoord1i glMultiTexCoord1i} */
	@JavadocExclude
	public static native void nglMultiTexCoord1i(int texture, int s, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Integer version of {@link #glMultiTexCoord1f glMultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1i(int texture, int s) {
		long __functionAddress = getInstance().glMultiTexCoord1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1i(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1d ] ---

	/** JNI method for {@link #glMultiTexCoord1d glMultiTexCoord1d} */
	@JavadocExclude
	public static native void nglMultiTexCoord1d(int texture, double s, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glMultiTexCoord1f glMultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1d(int texture, double s) {
		long __functionAddress = getInstance().glMultiTexCoord1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1d(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1fv ] ---

	/** JNI method for {@link #glMultiTexCoord1f(int, ByteBuffer) glMultiTexCoord1f} */
	@JavadocExclude
	public static native void nglMultiTexCoord1fv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord1f glMultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1f(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglMultiTexCoord1fv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord1f(int, ByteBuffer) glMultiTexCoord1f} */
	public static void glMultiTexCoord1(int texture, FloatBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglMultiTexCoord1fv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord1sv ] ---

	/** JNI method for {@link #glMultiTexCoord1s(int, ByteBuffer) glMultiTexCoord1s} */
	@JavadocExclude
	public static native void nglMultiTexCoord1sv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord1s glMultiTexCoord1s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1s(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 1);
		}
		nglMultiTexCoord1sv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord1s(int, ByteBuffer) glMultiTexCoord1s} */
	public static void glMultiTexCoord1(int texture, ShortBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglMultiTexCoord1sv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord1iv ] ---

	/** JNI method for {@link #glMultiTexCoord1i(int, ByteBuffer) glMultiTexCoord1i} */
	@JavadocExclude
	public static native void nglMultiTexCoord1iv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord1i glMultiTexCoord1i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1i(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglMultiTexCoord1iv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord1i(int, ByteBuffer) glMultiTexCoord1i} */
	public static void glMultiTexCoord1(int texture, IntBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglMultiTexCoord1iv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord1dv ] ---

	/** JNI method for {@link #glMultiTexCoord1d(int, ByteBuffer) glMultiTexCoord1d} */
	@JavadocExclude
	public static native void nglMultiTexCoord1dv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord1.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord1d glMultiTexCoord1d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1d(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 3);
		}
		nglMultiTexCoord1dv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord1d(int, ByteBuffer) glMultiTexCoord1d} */
	public static void glMultiTexCoord1(int texture, DoubleBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglMultiTexCoord1dv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord2f ] ---

	/** JNI method for {@link #glMultiTexCoord2f glMultiTexCoord2f} */
	@JavadocExclude
	public static native void nglMultiTexCoord2f(int texture, float s, float t, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current two-dimensional texture coordinate for the given texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2f(int texture, float s, float t) {
		long __functionAddress = getInstance().glMultiTexCoord2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2f(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2s ] ---

	/** JNI method for {@link #glMultiTexCoord2s glMultiTexCoord2s} */
	@JavadocExclude
	public static native void nglMultiTexCoord2s(int texture, short s, short t, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glMultiTexCoord2f glMultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2s(int texture, short s, short t) {
		long __functionAddress = getInstance().glMultiTexCoord2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2s(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2i ] ---

	/** JNI method for {@link #glMultiTexCoord2i glMultiTexCoord2i} */
	@JavadocExclude
	public static native void nglMultiTexCoord2i(int texture, int s, int t, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Integer version of {@link #glMultiTexCoord2f glMultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2i(int texture, int s, int t) {
		long __functionAddress = getInstance().glMultiTexCoord2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2i(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2d ] ---

	/** JNI method for {@link #glMultiTexCoord2d glMultiTexCoord2d} */
	@JavadocExclude
	public static native void nglMultiTexCoord2d(int texture, double s, double t, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glMultiTexCoord2f glMultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2d(int texture, double s, double t) {
		long __functionAddress = getInstance().glMultiTexCoord2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2d(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2fv ] ---

	/** JNI method for {@link #glMultiTexCoord2f(int, ByteBuffer) glMultiTexCoord2f} */
	@JavadocExclude
	public static native void nglMultiTexCoord2fv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord2f glMultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2f(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglMultiTexCoord2fv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord2f(int, ByteBuffer) glMultiTexCoord2f} */
	public static void glMultiTexCoord2(int texture, FloatBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglMultiTexCoord2fv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord2sv ] ---

	/** JNI method for {@link #glMultiTexCoord2s(int, ByteBuffer) glMultiTexCoord2s} */
	@JavadocExclude
	public static native void nglMultiTexCoord2sv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord2s glMultiTexCoord2s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2s(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 1);
		}
		nglMultiTexCoord2sv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord2s(int, ByteBuffer) glMultiTexCoord2s} */
	public static void glMultiTexCoord2(int texture, ShortBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglMultiTexCoord2sv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord2iv ] ---

	/** JNI method for {@link #glMultiTexCoord2i(int, ByteBuffer) glMultiTexCoord2i} */
	@JavadocExclude
	public static native void nglMultiTexCoord2iv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord2i glMultiTexCoord2i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2i(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglMultiTexCoord2iv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord2i(int, ByteBuffer) glMultiTexCoord2i} */
	public static void glMultiTexCoord2(int texture, IntBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglMultiTexCoord2iv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord2dv ] ---

	/** JNI method for {@link #glMultiTexCoord2d(int, ByteBuffer) glMultiTexCoord2d} */
	@JavadocExclude
	public static native void nglMultiTexCoord2dv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord2d glMultiTexCoord2d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2d(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 3);
		}
		nglMultiTexCoord2dv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord2d(int, ByteBuffer) glMultiTexCoord2d} */
	public static void glMultiTexCoord2(int texture, DoubleBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglMultiTexCoord2dv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord3f ] ---

	/** JNI method for {@link #glMultiTexCoord3f glMultiTexCoord3f} */
	@JavadocExclude
	public static native void nglMultiTexCoord3f(int texture, float s, float t, float r, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current three-dimensional texture coordinate for the given texture coordinate set. {@code q} is implicitly set to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3f(int texture, float s, float t, float r) {
		long __functionAddress = getInstance().glMultiTexCoord3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3f(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3s ] ---

	/** JNI method for {@link #glMultiTexCoord3s glMultiTexCoord3s} */
	@JavadocExclude
	public static native void nglMultiTexCoord3s(int texture, short s, short t, short r, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glMultiTexCoord3f glMultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3s(int texture, short s, short t, short r) {
		long __functionAddress = getInstance().glMultiTexCoord3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3s(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3i ] ---

	/** JNI method for {@link #glMultiTexCoord3i glMultiTexCoord3i} */
	@JavadocExclude
	public static native void nglMultiTexCoord3i(int texture, int s, int t, int r, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Integer version of {@link #glMultiTexCoord3f glMultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3i(int texture, int s, int t, int r) {
		long __functionAddress = getInstance().glMultiTexCoord3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3i(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3d ] ---

	/** JNI method for {@link #glMultiTexCoord3d glMultiTexCoord3d} */
	@JavadocExclude
	public static native void nglMultiTexCoord3d(int texture, double s, double t, double r, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glMultiTexCoord3f glMultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3d(int texture, double s, double t, double r) {
		long __functionAddress = getInstance().glMultiTexCoord3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3d(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3fv ] ---

	/** JNI method for {@link #glMultiTexCoord3f(int, ByteBuffer) glMultiTexCoord3f} */
	@JavadocExclude
	public static native void nglMultiTexCoord3fv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord3f glMultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3f(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglMultiTexCoord3fv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord3f(int, ByteBuffer) glMultiTexCoord3f} */
	public static void glMultiTexCoord3(int texture, FloatBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglMultiTexCoord3fv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord3sv ] ---

	/** JNI method for {@link #glMultiTexCoord3s(int, ByteBuffer) glMultiTexCoord3s} */
	@JavadocExclude
	public static native void nglMultiTexCoord3sv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord3s glMultiTexCoord3s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3s(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglMultiTexCoord3sv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord3s(int, ByteBuffer) glMultiTexCoord3s} */
	public static void glMultiTexCoord3(int texture, ShortBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglMultiTexCoord3sv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord3iv ] ---

	/** JNI method for {@link #glMultiTexCoord3i(int, ByteBuffer) glMultiTexCoord3i} */
	@JavadocExclude
	public static native void nglMultiTexCoord3iv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord3i glMultiTexCoord3i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3i(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglMultiTexCoord3iv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord3i(int, ByteBuffer) glMultiTexCoord3i} */
	public static void glMultiTexCoord3(int texture, IntBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglMultiTexCoord3iv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord3dv ] ---

	/** JNI method for {@link #glMultiTexCoord3d(int, ByteBuffer) glMultiTexCoord3d} */
	@JavadocExclude
	public static native void nglMultiTexCoord3dv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord3d glMultiTexCoord3d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3d(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglMultiTexCoord3dv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord3d(int, ByteBuffer) glMultiTexCoord3d} */
	public static void glMultiTexCoord3(int texture, DoubleBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglMultiTexCoord3dv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord4f ] ---

	/** JNI method for {@link #glMultiTexCoord4f glMultiTexCoord4f} */
	@JavadocExclude
	public static native void nglMultiTexCoord4f(int texture, float s, float t, float r, float q, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current four-dimensional texture coordinate for the given texture coordinate set.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4f(int texture, float s, float t, float r, float q) {
		long __functionAddress = getInstance().glMultiTexCoord4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4f(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4s ] ---

	/** JNI method for {@link #glMultiTexCoord4s glMultiTexCoord4s} */
	@JavadocExclude
	public static native void nglMultiTexCoord4s(int texture, short s, short t, short r, short q, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glMultiTexCoord4f glMultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4s(int texture, short s, short t, short r, short q) {
		long __functionAddress = getInstance().glMultiTexCoord4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4s(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4i ] ---

	/** JNI method for {@link #glMultiTexCoord4i glMultiTexCoord4i} */
	@JavadocExclude
	public static native void nglMultiTexCoord4i(int texture, int s, int t, int r, int q, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Integer version of {@link #glMultiTexCoord4f glMultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4i(int texture, int s, int t, int r, int q) {
		long __functionAddress = getInstance().glMultiTexCoord4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4i(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4d ] ---

	/** JNI method for {@link #glMultiTexCoord4d glMultiTexCoord4d} */
	@JavadocExclude
	public static native void nglMultiTexCoord4d(int texture, double s, double t, double r, double q, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glMultiTexCoord4f glMultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4d(int texture, double s, double t, double r, double q) {
		long __functionAddress = getInstance().glMultiTexCoord4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4d(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4fv ] ---

	/** JNI method for {@link #glMultiTexCoord4f(int, ByteBuffer) glMultiTexCoord4f} */
	@JavadocExclude
	public static native void nglMultiTexCoord4fv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord4f glMultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4f(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglMultiTexCoord4fv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord4f(int, ByteBuffer) glMultiTexCoord4f} */
	public static void glMultiTexCoord4(int texture, FloatBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglMultiTexCoord4fv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord4sv ] ---

	/** JNI method for {@link #glMultiTexCoord4s(int, ByteBuffer) glMultiTexCoord4s} */
	@JavadocExclude
	public static native void nglMultiTexCoord4sv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord4s glMultiTexCoord4s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4s(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglMultiTexCoord4sv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord4s(int, ByteBuffer) glMultiTexCoord4s} */
	public static void glMultiTexCoord4(int texture, ShortBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglMultiTexCoord4sv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord4iv ] ---

	/** JNI method for {@link #glMultiTexCoord4i(int, ByteBuffer) glMultiTexCoord4i} */
	@JavadocExclude
	public static native void nglMultiTexCoord4iv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord4i glMultiTexCoord4i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4i(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglMultiTexCoord4iv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord4i(int, ByteBuffer) glMultiTexCoord4i} */
	public static void glMultiTexCoord4(int texture, IntBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglMultiTexCoord4iv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glMultiTexCoord4dv ] ---

	/** JNI method for {@link #glMultiTexCoord4d(int, ByteBuffer) glMultiTexCoord4d} */
	@JavadocExclude
	public static native void nglMultiTexCoord4dv(int texture, long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoord4.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoord4d glMultiTexCoord4d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4d(int texture, ByteBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 3);
		}
		nglMultiTexCoord4dv(texture, memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoord4d(int, ByteBuffer) glMultiTexCoord4d} */
	public static void glMultiTexCoord4(int texture, DoubleBuffer v) {
		long __functionAddress = getInstance().glMultiTexCoord4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglMultiTexCoord4dv(texture, memAddress(v), __functionAddress);
	}

	// --- [ glLoadTransposeMatrixf ] ---

	/** JNI method for {@link #glLoadTransposeMatrixf glLoadTransposeMatrixf} */
	@JavadocExclude
	public static native void nglLoadTransposeMatrixf(long m, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glLoadTransposeMatrix.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current matrix to a 4 &times; 4 matrix in row-major order.
	 * <p/>
	 * The matrix is stored as 16 consecutive values, i.e. as:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>a1</td><td>a2</td><td>a3</td><td>a4</td></tr>
	 * <tr><td>a5</td><td>a6</td><td>a7</td><td>a8</td></tr>
	 * <tr><td>a9</td><td>a10</td><td>a11</td><td>a12</td></tr>
	 * <tr><td>a13</td><td>a14</td><td>a15</td><td>a16</td></tr>
	 * </table>
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixf(ByteBuffer m) {
		long __functionAddress = getInstance().glLoadTransposeMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 2);
		}
		nglLoadTransposeMatrixf(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glLoadTransposeMatrixf glLoadTransposeMatrixf} */
	public static void glLoadTransposeMatrix(FloatBuffer m) {
		long __functionAddress = getInstance().glLoadTransposeMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglLoadTransposeMatrixf(memAddress(m), __functionAddress);
	}

	// --- [ glLoadTransposeMatrixd ] ---

	/** JNI method for {@link #glLoadTransposeMatrixd glLoadTransposeMatrixd} */
	@JavadocExclude
	public static native void nglLoadTransposeMatrixd(long m, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glLoadTransposeMatrix.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glLoadTransposeMatrixf glLoadTransposeMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixd(ByteBuffer m) {
		long __functionAddress = getInstance().glLoadTransposeMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 3);
		}
		nglLoadTransposeMatrixd(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glLoadTransposeMatrixd glLoadTransposeMatrixd} */
	public static void glLoadTransposeMatrix(DoubleBuffer m) {
		long __functionAddress = getInstance().glLoadTransposeMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglLoadTransposeMatrixd(memAddress(m), __functionAddress);
	}

	// --- [ glMultTransposeMatrixf ] ---

	/** JNI method for {@link #glMultTransposeMatrixf glMultTransposeMatrixf} */
	@JavadocExclude
	public static native void nglMultTransposeMatrixf(long m, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultTransposeMatrix.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See {@link #glLoadTransposeMatrixf glLoadTransposeMatrixf} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixf(ByteBuffer m) {
		long __functionAddress = getInstance().glMultTransposeMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 2);
		}
		nglMultTransposeMatrixf(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glMultTransposeMatrixf glMultTransposeMatrixf} */
	public static void glMultTransposeMatrix(FloatBuffer m) {
		long __functionAddress = getInstance().glMultTransposeMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglMultTransposeMatrixf(memAddress(m), __functionAddress);
	}

	// --- [ glMultTransposeMatrixd ] ---

	/** JNI method for {@link #glMultTransposeMatrixd glMultTransposeMatrixd} */
	@JavadocExclude
	public static native void nglMultTransposeMatrixd(long m, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultTransposeMatrix.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glMultTransposeMatrixf glMultTransposeMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixd(ByteBuffer m) {
		long __functionAddress = getInstance().glMultTransposeMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 3);
		}
		nglMultTransposeMatrixd(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glMultTransposeMatrixd glMultTransposeMatrixd} */
	public static void glMultTransposeMatrix(DoubleBuffer m) {
		long __functionAddress = getInstance().glMultTransposeMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglMultTransposeMatrixd(memAddress(m), __functionAddress);
	}

}