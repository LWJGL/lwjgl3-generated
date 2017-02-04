/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 1.3 functionality.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_compression.txt">ARB_texture_compression</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_cube_map.txt">ARB_texture_cube_map</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/multisample.txt">ARB_multisample</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/multitexture.txt">ARB_multitexture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_env_add.txt">ARB_texture_env_add</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_env_combine.txt">ARB_texture_env_combine</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_env_dot3.txt">ARB_texture_env_dot3</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_border_clamp.txt">ARB_texture_border_clamp</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/transpose_matrix.txt">ARB_transpose_matrix</a></li>
 * </ul>
 */
public class GL13 {

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
	public static final int
		GL_COMPRESSED_ALPHA           = 0x84E9,
		GL_COMPRESSED_LUMINANCE       = 0x84EA,
		GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB,
		GL_COMPRESSED_INTENSITY       = 0x84EC,
		GL_COMPRESSED_RGB             = 0x84ED,
		GL_COMPRESSED_RGBA            = 0x84EE;

	/** Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
	public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;

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
	public static final int GL_TEXTURE_CUBE_MAP = 0x8513;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

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
	public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

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
	public static final int GL_MULTISAMPLE_BIT = 0x20000000;

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
	public static final int GL_COMBINE = 0x8570;

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
	public static final int GL_CLAMP_TO_BORDER = 0x812D;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TRANSPOSE_MODELVIEW_MATRIX  = 0x84E3,
		GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4,
		GL_TRANSPOSE_TEXTURE_MATRIX    = 0x84E5,
		GL_TRANSPOSE_COLOR_MATRIX      = 0x84E6;

	static { GL.initialize(); }

	protected GL13() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glClientActiveTexture, caps.glMultiTexCoord1f, caps.glMultiTexCoord1s, caps.glMultiTexCoord1i, caps.glMultiTexCoord1d, caps.glMultiTexCoord1fv, 
			caps.glMultiTexCoord1sv, caps.glMultiTexCoord1iv, caps.glMultiTexCoord1dv, caps.glMultiTexCoord2f, caps.glMultiTexCoord2s, caps.glMultiTexCoord2i, 
			caps.glMultiTexCoord2d, caps.glMultiTexCoord2fv, caps.glMultiTexCoord2sv, caps.glMultiTexCoord2iv, caps.glMultiTexCoord2dv, caps.glMultiTexCoord3f, 
			caps.glMultiTexCoord3s, caps.glMultiTexCoord3i, caps.glMultiTexCoord3d, caps.glMultiTexCoord3fv, caps.glMultiTexCoord3sv, caps.glMultiTexCoord3iv, 
			caps.glMultiTexCoord3dv, caps.glMultiTexCoord4f, caps.glMultiTexCoord4s, caps.glMultiTexCoord4i, caps.glMultiTexCoord4d, caps.glMultiTexCoord4fv, 
			caps.glMultiTexCoord4sv, caps.glMultiTexCoord4iv, caps.glMultiTexCoord4dv, caps.glLoadTransposeMatrixf, caps.glLoadTransposeMatrixd, 
			caps.glMultTransposeMatrixf, caps.glMultTransposeMatrixd
		)) && checkFunctions(
			caps.glCompressedTexImage3D, caps.glCompressedTexImage2D, caps.glCompressedTexImage1D, caps.glCompressedTexSubImage3D, 
			caps.glCompressedTexSubImage2D, caps.glCompressedTexSubImage1D, caps.glGetCompressedTexImage, caps.glSampleCoverage, caps.glActiveTexture
		);
	}

	// --- [ glCompressedTexImage3D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexImage3D CompressedTexImage3D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a three-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param depth          the depth of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a three-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param depth          the depth of the texture image
	 * @param border         must be 0
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
		nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
	}

	// --- [ glCompressedTexImage2D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexImage2D CompressedTexImage2D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a two-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link #GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link #GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a two-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link #GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link #GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param height         the height of the texture image
	 * @param border         must be 0
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		nglCompressedTexImage2D(target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
	}

	// --- [ glCompressedTexImage1D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexImage1D CompressedTexImage1D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a one-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param border         must be 0
	 * @param imageSize      the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
		nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies a one-dimensional texture image in a compressed format.
	 *
	 * @param target         the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param width          the width of the texture image
	 * @param border         must be 0
	 * @param data           a pointer to the compressed image data
	 */
	public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, ByteBuffer data) {
		nglCompressedTexImage1D(target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
	}

	// --- [ glCompressedTexSubImage3D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexSubImage3D CompressedTexSubImage3D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param zoffset   a texel offset in the z direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param depth     the depth of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target  the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param yoffset a texel offset in the y direction within the texture array
	 * @param zoffset a texel offset in the z direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param height  the height of the texture subimage
	 * @param depth   the depth of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexSubImage2D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexSubImage2D CompressedTexSubImage2D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link #GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target  the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link #GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param yoffset a texel offset in the y direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param height  the height of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTexSubImage1D ] ---

	/**
	 * Unsafe version of: {@link #glCompressedTexSubImage1D CompressedTexSubImage1D}
	 *
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 */
	public static native void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target    the target texture. Must be:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
		nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTexSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.
	 *
	 * @param target  the target texture. Must be:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
		nglCompressedTexSubImage1D(target, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glGetCompressedTexImage ] ---

	/** Unsafe version of: {@link #glGetCompressedTexImage GetCompressedTexImage} */
	public static native void nglGetCompressedTexImage(int target, int level, long pixels);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a compressed texture image.
	 *
	 * @param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param pixels a buffer in which to return the compressed texture image
	 */
	public static void glGetCompressedTexImage(int target, int level, ByteBuffer pixels) {
		if ( CHECKS )
			if ( DEBUG )
				check(pixels, GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
		nglGetCompressedTexImage(target, level, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a compressed texture image.
	 *
	 * @param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link #GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link #GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param pixels a buffer in which to return the compressed texture image
	 */
	public static void glGetCompressedTexImage(int target, int level, long pixels) {
		nglGetCompressedTexImage(target, level, pixels);
	}

	// --- [ glSampleCoverage ] ---

	/**
	 * Specifies multisample coverage parameters.
	 * 
	 * <p>Multisampling samples a pixel multiple times at various implementation-dependent subpixel locations to generate antialiasing effects. Multisampling
	 * transparently antialiases points, lines, polygons, and images if it is enabled.</p>
	 * 
	 * <p>{@code value} is used in constructing a temporary mask used in determining which samples will be used in resolving the final fragment color. This mask
	 * is bitwise-ANDed with the coverage mask generated from the multisampling computation. If the {@code invert} flag is set, the temporary mask is inverted
	 * (all bits flipped) and then the bitwise-AND is computed.</p>
	 * 
	 * <p>If an implementation does not have any multisample buffers available, or multisampling is disabled, rasterization occurs with only a single sample
	 * computing a pixel's final RGB color.</p>
	 * 
	 * <p>Provided an implementation supports multisample buffers, and multisampling is enabled, then a pixel's final color is generated by combining several
	 * samples per pixel. Each sample contains color, depth, and stencil information, allowing those operations to be performed on each sample.</p>
	 *
	 * @param value  a sample coverage value. The value is clamped to the range [0, 1]. The initial value is 1.0.
	 * @param invert if the coverage masks should be inverted. The initial value is false.
	 */
	public static native void glSampleCoverage(float value, boolean invert);

	// --- [ glActiveTexture ] ---

	/**
	 * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
	 * dependent.
	 *
	 * @param texture which texture unit to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0 TEXTURE0}</td><td>GL_TEXTURE[1-31]</td></tr></table>
	 */
	public static native void glActiveTexture(int texture);

	// --- [ glClientActiveTexture ] ---

	/**
	 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
	 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
	 *
	 * @param texture which texture coordinate array to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0 TEXTURE0}</td><td>GL_TEXTURE[1-31]</td></tr></table>
	 */
	public static native void glClientActiveTexture(int texture);

	// --- [ glMultiTexCoord1f ] ---

	/**
	 * Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static native void glMultiTexCoord1f(int texture, float s);

	// --- [ glMultiTexCoord1s ] ---

	/**
	 * Short version of {@link #glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static native void glMultiTexCoord1s(int texture, short s);

	// --- [ glMultiTexCoord1i ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static native void glMultiTexCoord1i(int texture, int s);

	// --- [ glMultiTexCoord1d ] ---

	/**
	 * Double version of {@link #glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static native void glMultiTexCoord1d(int texture, double s);

	// --- [ glMultiTexCoord1fv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord1fv MultiTexCoord1fv} */
	public static native void nglMultiTexCoord1fv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1fv(int texture, FloatBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglMultiTexCoord1fv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1sv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord1sv MultiTexCoord1sv} */
	public static native void nglMultiTexCoord1sv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord1s MultiTexCoord1s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1sv(int texture, ShortBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglMultiTexCoord1sv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1iv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord1iv MultiTexCoord1iv} */
	public static native void nglMultiTexCoord1iv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord1i MultiTexCoord1i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1iv(int texture, IntBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglMultiTexCoord1iv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1dv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord1dv MultiTexCoord1dv} */
	public static native void nglMultiTexCoord1dv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord1d MultiTexCoord1d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1dv(int texture, DoubleBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglMultiTexCoord1dv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2f ] ---

	/**
	 * Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static native void glMultiTexCoord2f(int texture, float s, float t);

	// --- [ glMultiTexCoord2s ] ---

	/**
	 * Short version of {@link #glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static native void glMultiTexCoord2s(int texture, short s, short t);

	// --- [ glMultiTexCoord2i ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static native void glMultiTexCoord2i(int texture, int s, int t);

	// --- [ glMultiTexCoord2d ] ---

	/**
	 * Double version of {@link #glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static native void glMultiTexCoord2d(int texture, double s, double t);

	// --- [ glMultiTexCoord2fv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord2fv MultiTexCoord2fv} */
	public static native void nglMultiTexCoord2fv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2fv(int texture, FloatBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglMultiTexCoord2fv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2sv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord2sv MultiTexCoord2sv} */
	public static native void nglMultiTexCoord2sv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord2s MultiTexCoord2s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2sv(int texture, ShortBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglMultiTexCoord2sv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2iv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord2iv MultiTexCoord2iv} */
	public static native void nglMultiTexCoord2iv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord2i MultiTexCoord2i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2iv(int texture, IntBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglMultiTexCoord2iv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2dv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord2dv MultiTexCoord2dv} */
	public static native void nglMultiTexCoord2dv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord2d MultiTexCoord2d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2dv(int texture, DoubleBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglMultiTexCoord2dv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3f ] ---

	/**
	 * Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static native void glMultiTexCoord3f(int texture, float s, float t, float r);

	// --- [ glMultiTexCoord3s ] ---

	/**
	 * Short version of {@link #glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static native void glMultiTexCoord3s(int texture, short s, short t, short r);

	// --- [ glMultiTexCoord3i ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static native void glMultiTexCoord3i(int texture, int s, int t, int r);

	// --- [ glMultiTexCoord3d ] ---

	/**
	 * Double version of {@link #glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static native void glMultiTexCoord3d(int texture, double s, double t, double r);

	// --- [ glMultiTexCoord3fv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord3fv MultiTexCoord3fv} */
	public static native void nglMultiTexCoord3fv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3fv(int texture, FloatBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglMultiTexCoord3fv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3sv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord3sv MultiTexCoord3sv} */
	public static native void nglMultiTexCoord3sv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord3s MultiTexCoord3s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3sv(int texture, ShortBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglMultiTexCoord3sv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3iv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord3iv MultiTexCoord3iv} */
	public static native void nglMultiTexCoord3iv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord3i MultiTexCoord3i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3iv(int texture, IntBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglMultiTexCoord3iv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3dv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord3dv MultiTexCoord3dv} */
	public static native void nglMultiTexCoord3dv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord3d MultiTexCoord3d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3dv(int texture, DoubleBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglMultiTexCoord3dv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4f ] ---

	/**
	 * Sets the current four-dimensional texture coordinate for the specified texture coordinate set.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static native void glMultiTexCoord4f(int texture, float s, float t, float r, float q);

	// --- [ glMultiTexCoord4s ] ---

	/**
	 * Short version of {@link #glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static native void glMultiTexCoord4s(int texture, short s, short t, short r, short q);

	// --- [ glMultiTexCoord4i ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static native void glMultiTexCoord4i(int texture, int s, int t, int r, int q);

	// --- [ glMultiTexCoord4d ] ---

	/**
	 * Double version of {@link #glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static native void glMultiTexCoord4d(int texture, double s, double t, double r, double q);

	// --- [ glMultiTexCoord4fv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord4fv MultiTexCoord4fv} */
	public static native void nglMultiTexCoord4fv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4fv(int texture, FloatBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglMultiTexCoord4fv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4sv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord4sv MultiTexCoord4sv} */
	public static native void nglMultiTexCoord4sv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord4s MultiTexCoord4s}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4sv(int texture, ShortBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglMultiTexCoord4sv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4iv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord4iv MultiTexCoord4iv} */
	public static native void nglMultiTexCoord4iv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord4i MultiTexCoord4i}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4iv(int texture, IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglMultiTexCoord4iv(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4dv ] ---

	/** Unsafe version of: {@link #glMultiTexCoord4dv MultiTexCoord4dv} */
	public static native void nglMultiTexCoord4dv(int texture, long v);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoord4d MultiTexCoord4d}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4dv(int texture, DoubleBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglMultiTexCoord4dv(texture, memAddress(v));
	}

	// --- [ glLoadTransposeMatrixf ] ---

	/** Unsafe version of: {@link #glLoadTransposeMatrixf LoadTransposeMatrixf} */
	public static native void nglLoadTransposeMatrixf(long m);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current matrix to a 4 &times; 4 matrix in row-major order.
	 * 
	 * <p>The matrix is stored as 16 consecutive values, i.e. as:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>a1</td><td>a2</td><td>a3</td><td>a4</td></tr>
	 * <tr><td>a5</td><td>a6</td><td>a7</td><td>a8</td></tr>
	 * <tr><td>a9</td><td>a10</td><td>a11</td><td>a12</td></tr>
	 * <tr><td>a13</td><td>a14</td><td>a15</td><td>a16</td></tr>
	 * </table>
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixf(FloatBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglLoadTransposeMatrixf(memAddress(m));
	}

	// --- [ glLoadTransposeMatrixd ] ---

	/** Unsafe version of: {@link #glLoadTransposeMatrixd LoadTransposeMatrixd} */
	public static native void nglLoadTransposeMatrixd(long m);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixd(DoubleBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglLoadTransposeMatrixd(memAddress(m));
	}

	// --- [ glMultTransposeMatrixf ] ---

	/** Unsafe version of: {@link #glMultTransposeMatrixf MultTransposeMatrixf} */
	public static native void nglMultTransposeMatrixf(long m);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See {@link #glLoadTransposeMatrixf LoadTransposeMatrixf} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixf(FloatBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglMultTransposeMatrixf(memAddress(m));
	}

	// --- [ glMultTransposeMatrixd ] ---

	/** Unsafe version of: {@link #glMultTransposeMatrixd MultTransposeMatrixd} */
	public static native void nglMultTransposeMatrixd(long m);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMultTransposeMatrixf MultTransposeMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixd(DoubleBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglMultTransposeMatrixd(memAddress(m));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord1fv MultiTexCoord1fv}
	 */
	public static void glMultiTexCoord1fv(int texture, float[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord1fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord1sv MultiTexCoord1sv}
	 */
	public static void glMultiTexCoord1sv(int texture, short[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord1sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord1iv MultiTexCoord1iv}
	 */
	public static void glMultiTexCoord1iv(int texture, int[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord1iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord1dv MultiTexCoord1dv}
	 */
	public static void glMultiTexCoord1dv(int texture, double[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord1dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord2fv MultiTexCoord2fv}
	 */
	public static void glMultiTexCoord2fv(int texture, float[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord2fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord2sv MultiTexCoord2sv}
	 */
	public static void glMultiTexCoord2sv(int texture, short[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord2sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord2iv MultiTexCoord2iv}
	 */
	public static void glMultiTexCoord2iv(int texture, int[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord2iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord2dv MultiTexCoord2dv}
	 */
	public static void glMultiTexCoord2dv(int texture, double[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord2dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord3fv MultiTexCoord3fv}
	 */
	public static void glMultiTexCoord3fv(int texture, float[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord3sv MultiTexCoord3sv}
	 */
	public static void glMultiTexCoord3sv(int texture, short[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord3iv MultiTexCoord3iv}
	 */
	public static void glMultiTexCoord3iv(int texture, int[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord3dv MultiTexCoord3dv}
	 */
	public static void glMultiTexCoord3dv(int texture, double[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord4fv MultiTexCoord4fv}
	 */
	public static void glMultiTexCoord4fv(int texture, float[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord4fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord4sv MultiTexCoord4sv}
	 */
	public static void glMultiTexCoord4sv(int texture, short[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord4sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord4iv MultiTexCoord4iv}
	 */
	public static void glMultiTexCoord4iv(int texture, int[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoord4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoord4dv MultiTexCoord4dv}
	 */
	public static void glMultiTexCoord4dv(int texture, double[] v) {
		long __functionAddress = GL.getICD().glMultiTexCoord4dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}
	 */
	public static void glLoadTransposeMatrixf(float[] m) {
		long __functionAddress = GL.getICD().glLoadTransposeMatrixf;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glLoadTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLoadTransposeMatrixd LoadTransposeMatrixd}
	 */
	public static void glLoadTransposeMatrixd(double[] m) {
		long __functionAddress = GL.getICD().glLoadTransposeMatrixd;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultTransposeMatrixf MultTransposeMatrixf}
	 */
	public static void glMultTransposeMatrixf(float[] m) {
		long __functionAddress = GL.getICD().glMultTransposeMatrixf;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultTransposeMatrix.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultTransposeMatrixd MultTransposeMatrixd}
	 */
	public static void glMultTransposeMatrixd(double[] m) {
		long __functionAddress = GL.getICD().glMultTransposeMatrixd;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

}