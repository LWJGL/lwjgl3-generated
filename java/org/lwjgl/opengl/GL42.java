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

/**
 * The core OpenGL 4.2 functionality. OpenGL 4.2 implementations support revision 4.20 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_compression_bptc.txt">ARB_texture_compression_bptc</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/compressed_texture_pixel_storage.txt">ARB_compressed_texture_pixel_storage</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_atomic_counters.txt">ARB_shader_atomic_counters</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_storage.txt">ARB_texture_storage</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/transform_feedback_instanced.txt">ARB_transform_feedback_instanced</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/base_instance.txt">ARB_base_instance</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_image_load_store.txt">ARB_shader_image_load_store</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/conservative_depth.txt">ARB_conservative_depth</a> and <a href="http://www.opengl.org/registry/specs/ARB/shading_language_420pack.txt">ARB_shading_language_420pack</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/internalformat_query.txt">ARB_internalformat_query</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/map_buffer_alignment.txt">ARB_map_buffer_alignment</a></li>
 * </ul></p>
 */
public final class GL42 {

	/** Renamed tokens. */
	public static final int
		GL_COPY_READ_BUFFER_BINDING  = GL31.GL_COPY_READ_BUFFER,
		GL_COPY_WRITE_BUFFER_BINDING = GL31.GL_COPY_WRITE_BUFFER,
		GL_TRANSFORM_FEEDBACK_ACTIVE = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE,
		GL_TRANSFORM_FEEDBACK_PAUSED = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED;

	/**
	 * Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and
	 * CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.
	 */
	public static final int
		GL_COMPRESSED_RGBA_BPTC_UNORM         = 0x8E8C,
		GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM   = 0x8E8D,
		GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT   = 0x8E8E,
		GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;

	/** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_UNPACK_COMPRESSED_BLOCK_WIDTH  = 0x9127,
		GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128,
		GL_UNPACK_COMPRESSED_BLOCK_DEPTH  = 0x9129,
		GL_UNPACK_COMPRESSED_BLOCK_SIZE   = 0x912A,
		GL_PACK_COMPRESSED_BLOCK_WIDTH    = 0x912B,
		GL_PACK_COMPRESSED_BLOCK_HEIGHT   = 0x912C,
		GL_PACK_COMPRESSED_BLOCK_DEPTH    = 0x912D,
		GL_PACK_COMPRESSED_BLOCK_SIZE     = 0x912E;

	/** Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange. */
	public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;

	/**
	 * Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.
	 */
	public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;

	/** Accepted by the {@code pname} parameter of GetIntegeri_64v. */
	public static final int
		GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2,
		GL_ATOMIC_COUNTER_BUFFER_SIZE  = 0x92C3;

	/** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
	public static final int
		GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE                            = 0x92C4,
		GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS               = 0x92C5,
		GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES        = 0x92C6,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER          = 0x92C7,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x92C8,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER        = 0x92CA,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER        = 0x92CB;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS    = 0x92CD,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE,
		GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS        = 0x92CF,
		GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
		GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
		GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS           = 0x92D3,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS        = 0x92D4,
		GL_MAX_GEOMETRY_ATOMIC_COUNTERS               = 0x92D5,
		GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
		GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
		GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
		GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;

	/** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
	public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;

	/** Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv. */
	public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;

	/** Accepted by the {@code value} parameter of GetTexParameter{if}v. */
	public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
	public static final int
		GL_MAX_IMAGE_UNITS                               = 0x8F38,
		GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39,
		GL_MAX_IMAGE_SAMPLES                             = 0x906D,
		GL_MAX_VERTEX_IMAGE_UNIFORMS                     = 0x90CA,
		GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS               = 0x90CB,
		GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS            = 0x90CC,
		GL_MAX_GEOMETRY_IMAGE_UNIFORMS                   = 0x90CD,
		GL_MAX_FRAGMENT_IMAGE_UNIFORMS                   = 0x90CE,
		GL_MAX_COMBINED_IMAGE_UNIFORMS                   = 0x90CF;

	/** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v. */
	public static final int
		GL_IMAGE_BINDING_NAME    = 0x8F3A,
		GL_IMAGE_BINDING_LEVEL   = 0x8F3B,
		GL_IMAGE_BINDING_LAYERED = 0x8F3C,
		GL_IMAGE_BINDING_LAYER   = 0x8F3D,
		GL_IMAGE_BINDING_ACCESS  = 0x8F3E,
		GL_IMAGE_BINDING_FORMAT  = 0x906E;

	/** Accepted by the {@code barriers} parameter of MemoryBarrier. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x1,
		GL_ELEMENT_ARRAY_BARRIER_BIT       = 0x2,
		GL_UNIFORM_BARRIER_BIT             = 0x4,
		GL_TEXTURE_FETCH_BARRIER_BIT       = 0x8,
		GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x20,
		GL_COMMAND_BARRIER_BIT             = 0x40,
		GL_PIXEL_BUFFER_BARRIER_BIT        = 0x80,
		GL_TEXTURE_UPDATE_BARRIER_BIT      = 0x100,
		GL_BUFFER_UPDATE_BARRIER_BIT       = 0x200,
		GL_FRAMEBUFFER_BARRIER_BIT         = 0x400,
		GL_TRANSFORM_FEEDBACK_BARRIER_BIT  = 0x800,
		GL_ATOMIC_COUNTER_BARRIER_BIT      = 0x1000,
		GL_ALL_BARRIER_BITS                = 0xFFFFFFFF;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_IMAGE_1D                                = 0x904C,
		GL_IMAGE_2D                                = 0x904D,
		GL_IMAGE_3D                                = 0x904E,
		GL_IMAGE_2D_RECT                           = 0x904F,
		GL_IMAGE_CUBE                              = 0x9050,
		GL_IMAGE_BUFFER                            = 0x9051,
		GL_IMAGE_1D_ARRAY                          = 0x9052,
		GL_IMAGE_2D_ARRAY                          = 0x9053,
		GL_IMAGE_CUBE_MAP_ARRAY                    = 0x9054,
		GL_IMAGE_2D_MULTISAMPLE                    = 0x9055,
		GL_IMAGE_2D_MULTISAMPLE_ARRAY              = 0x9056,
		GL_INT_IMAGE_1D                            = 0x9057,
		GL_INT_IMAGE_2D                            = 0x9058,
		GL_INT_IMAGE_3D                            = 0x9059,
		GL_INT_IMAGE_2D_RECT                       = 0x905A,
		GL_INT_IMAGE_CUBE                          = 0x905B,
		GL_INT_IMAGE_BUFFER                        = 0x905C,
		GL_INT_IMAGE_1D_ARRAY                      = 0x905D,
		GL_INT_IMAGE_2D_ARRAY                      = 0x905E,
		GL_INT_IMAGE_CUBE_MAP_ARRAY                = 0x905F,
		GL_INT_IMAGE_2D_MULTISAMPLE                = 0x9060,
		GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY          = 0x9061,
		GL_UNSIGNED_INT_IMAGE_1D                   = 0x9062,
		GL_UNSIGNED_INT_IMAGE_2D                   = 0x9063,
		GL_UNSIGNED_INT_IMAGE_3D                   = 0x9064,
		GL_UNSIGNED_INT_IMAGE_2D_RECT              = 0x9065,
		GL_UNSIGNED_INT_IMAGE_CUBE                 = 0x9066,
		GL_UNSIGNED_INT_IMAGE_BUFFER               = 0x9067,
		GL_UNSIGNED_INT_IMAGE_1D_ARRAY             = 0x9068,
		GL_UNSIGNED_INT_IMAGE_2D_ARRAY             = 0x9069,
		GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY       = 0x906A,
		GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE       = 0x906B,
		GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;

	/** Accepted by the {@code value} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv. */
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;

	/**
	 * Returned in the {@code data} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv when {@code value} is
	 * IMAGE_FORMAT_COMPATIBILITY_TYPE.
	 */
	public static final int
		GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE  = 0x90C8,
		GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;

	/** Accepted by the {@code pname} parameter of GetInternalformativ. */
	public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;

	/** Function address. */
	@JavadocExclude
	public final long
		GetActiveAtomicCounterBufferiv,
		TexStorage1D,
		TexStorage2D,
		TexStorage3D,
		DrawTransformFeedbackInstanced,
		DrawTransformFeedbackStreamInstanced,
		DrawArraysInstancedBaseInstance,
		DrawElementsInstancedBaseInstance,
		DrawElementsInstancedBaseVertexBaseInstance,
		BindImageTexture,
		MemoryBarrier,
		GetInternalformativ;

	@JavadocExclude
	public GL42(FunctionProvider provider) {
		GetActiveAtomicCounterBufferiv = provider.getFunctionAddress("glGetActiveAtomicCounterBufferiv");
		TexStorage1D = provider.getFunctionAddress("glTexStorage1D");
		TexStorage2D = provider.getFunctionAddress("glTexStorage2D");
		TexStorage3D = provider.getFunctionAddress("glTexStorage3D");
		DrawTransformFeedbackInstanced = provider.getFunctionAddress("glDrawTransformFeedbackInstanced");
		DrawTransformFeedbackStreamInstanced = provider.getFunctionAddress("glDrawTransformFeedbackStreamInstanced");
		DrawArraysInstancedBaseInstance = provider.getFunctionAddress("glDrawArraysInstancedBaseInstance");
		DrawElementsInstancedBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseInstance");
		DrawElementsInstancedBaseVertexBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstance");
		BindImageTexture = provider.getFunctionAddress("glBindImageTexture");
		MemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
		GetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL42} instance for the current context. */
	public static GL42 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL42);
	}

	static GL42 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL42") ) return null;

		GL42 funcs = new GL42(provider);

		boolean supported = checkFunctions(
			funcs.GetActiveAtomicCounterBufferiv, funcs.TexStorage1D, funcs.TexStorage2D, funcs.TexStorage3D, funcs.DrawTransformFeedbackInstanced, 
			funcs.DrawTransformFeedbackStreamInstanced, funcs.DrawArraysInstancedBaseInstance, funcs.DrawElementsInstancedBaseInstance, 
			funcs.DrawElementsInstancedBaseVertexBaseInstance, funcs.BindImageTexture, funcs.MemoryBarrier, funcs.GetInternalformativ
		);

		return GL.checkExtension("OpenGL42", funcs, supported);
	}

	// --- [ glGetActiveAtomicCounterBufferiv ] ---

	/** JNI method for {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	@JavadocExclude
	public static native void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	@JavadocExclude
	public static void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
		long __functionAddress = getInstance().GetActiveAtomicCounterBufferiv;
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveAtomicCounterBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains information about the set of active atomic counter buffers for a program.
	 *
	 * @param program     the name of a program object for which the command {@link GL20#glLinkProgram LinkProgram} has been issued in the past
	 * @param bufferIndex the index of an active atomic counter buffer
	 * @param pname       the parameter to query. One of:<br>{@link #GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}, {@link #GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}, {@link #GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}
	 * @param params      a buffer in which to place the returned value
	 */
	public static void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	public static void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	public static int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glTexStorage1D ] ---

	/** JNI method for {@link #glTexStorage1D TexStorage1D} */
	@JavadocExclude
	public static native void nglTexStorage1D(int target, int levels, int internalformat, int width, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexStorage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Simultaneously specifies storage for all levels of a one-dimensional texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 */
	public static void glTexStorage1D(int target, int levels, int internalformat, int width) {
		long __functionAddress = getInstance().TexStorage1D;
		nglTexStorage1D(target, levels, internalformat, width, __functionAddress);
	}

	// --- [ glTexStorage2D ] ---

	/** JNI method for {@link #glTexStorage2D TexStorage2D} */
	@JavadocExclude
	public static native void nglTexStorage2D(int target, int levels, int internalformat, int width, int height, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexStorage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 */
	public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
		long __functionAddress = getInstance().TexStorage2D;
		nglTexStorage2D(target, levels, internalformat, width, height, __functionAddress);
	}

	// --- [ glTexStorage3D ] ---

	/** JNI method for {@link #glTexStorage3D TexStorage3D} */
	@JavadocExclude
	public static native void nglTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexStorage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 * @param depth          the depth of the texture, in texels
	 */
	public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = getInstance().TexStorage3D;
		nglTexStorage3D(target, levels, internalformat, width, height, depth, __functionAddress);
	}

	// --- [ glDrawTransformFeedbackInstanced ] ---

	/** JNI method for {@link #glDrawTransformFeedbackInstanced DrawTransformFeedbackInstanced} */
	@JavadocExclude
	public static native void nglDrawTransformFeedbackInstanced(int mode, int id, int primcount, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawTransformFeedbackInstanced.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of primitives using a count derived from a transform feedback object.
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id        the name of a transform feedback object from which to retrieve a primitive count
	 * @param primcount the number of instances of the geometry to render
	 */
	public static void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
		long __functionAddress = getInstance().DrawTransformFeedbackInstanced;
		nglDrawTransformFeedbackInstanced(mode, id, primcount, __functionAddress);
	}

	// --- [ glDrawTransformFeedbackStreamInstanced ] ---

	/** JNI method for {@link #glDrawTransformFeedbackStreamInstanced DrawTransformFeedbackStreamInstanced} */
	@JavadocExclude
	public static native void nglDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawTransformFeedbackStreamInstanced.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id        the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream    the index of the transform feedback stream from which to retrieve a primitive count
	 * @param primcount the number of instances of the geometry to render
	 */
	public static void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
		long __functionAddress = getInstance().DrawTransformFeedbackStreamInstanced;
		nglDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount, __functionAddress);
	}

	// --- [ glDrawArraysInstancedBaseInstance ] ---

	/** JNI method for {@link #glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance} */
	@JavadocExclude
	public static native void nglDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawArraysInstancedBaseInstance.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Draws multiple instances of a range of elements with an offset applied to instanced attributes.
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param first        the starting index in the enabled arrays
	 * @param count        the number of indices to be rendered
	 * @param primcount    the number of instances of the specified range of indices to be rendered
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
		long __functionAddress = getInstance().DrawArraysInstancedBaseInstance;
		nglDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance, __functionAddress);
	}

	// --- [ glDrawElementsInstancedBaseInstance ] ---

	/** JNI method for {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	@JavadocExclude
	public static native void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseInstance;
		nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseInstance.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Draws multiple instances of a set of elements with an offset applied to instanced attributes
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count        the number of elements to be rendered
	 * @param type         the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices      a pointer to the location where the indices are stored
	 * @param primcount    the number of instances of the specified range of indices to be rendered
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawElementsInstancedBaseInstance(int mode, int count, int type, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseInstance(mode, count, type, memAddress(indices), primcount, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseInstance(mode, count, type, indicesOffset, primcount, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

	/** JNI method for {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	@JavadocExclude
	public static native void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseVertexBaseInstance;
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertexBaseInstance.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count        the number of elements to be rendered
	 * @param type         the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices      a pointer to the location where the indices are stored
	 * @param primcount    the number of instances of the indexed geometry that should be drawn
	 * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indicesOffset, primcount, basevertex, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex, baseinstance);
	}

	// --- [ glBindImageTexture ] ---

	/** JNI method for {@link #glBindImageTexture BindImageTexture} */
	@JavadocExclude
	public static native void nglBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindImageTexture.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a level of a texture to an image unit.
	 *
	 * @param unit    the index of the image unit to which to bind the texture
	 * @param texture the name of the texture to bind to the image unit
	 * @param level   the level of the texture that is to be bound
	 * @param layered whether a layered texture binding is to be established
	 * @param layer   if {@code layered} is false, specifies the layer of texture to be bound to the image unit. Ignored otherwise.
	 * @param access  a token indicating the type of access that will be performed on the image
	 * @param format  the format that the elements of the image will be treated as for the purposes of formatted stores
	 */
	public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
		long __functionAddress = getInstance().BindImageTexture;
		nglBindImageTexture(unit, texture, level, layered, layer, access, format, __functionAddress);
	}

	// --- [ glMemoryBarrier ] ---

	/** JNI method for {@link #glMemoryBarrier MemoryBarrier} */
	@JavadocExclude
	public static native void nglMemoryBarrier(int barriers, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMemoryBarrier.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Defines a barrier ordering memory transactions.
	 *
	 * @param barriers the barriers to insert (bitwise combination). One or more of:<br>{@link #GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT VERTEX_ATTRIB_ARRAY_BARRIER_BIT}, {@link #GL_ELEMENT_ARRAY_BARRIER_BIT ELEMENT_ARRAY_BARRIER_BIT}, {@link #GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}, {@link #GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}, {@link #GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}, {@link #GL_COMMAND_BARRIER_BIT COMMAND_BARRIER_BIT}, {@link #GL_PIXEL_BUFFER_BARRIER_BIT PIXEL_BUFFER_BARRIER_BIT}, {@link #GL_TEXTURE_UPDATE_BARRIER_BIT TEXTURE_UPDATE_BARRIER_BIT}, {@link #GL_BUFFER_UPDATE_BARRIER_BIT BUFFER_UPDATE_BARRIER_BIT}, {@link #GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}, {@link #GL_TRANSFORM_FEEDBACK_BARRIER_BIT TRANSFORM_FEEDBACK_BARRIER_BIT}, {@link #GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}, {@link #GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}, {@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}
	 */
	public static void glMemoryBarrier(int barriers) {
		long __functionAddress = getInstance().MemoryBarrier;
		nglMemoryBarrier(barriers, __functionAddress);
	}

	// --- [ glGetInternalformativ ] ---

	/** JNI method for {@link #glGetInternalformativ GetInternalformativ} */
	@JavadocExclude
	public static native void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetInternalformativ GetInternalformativ} */
	@JavadocExclude
	public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformativ;
		nglGetInternalformativ(target, internalformat, pname, bufSize, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetInternalformat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves information about implementation-dependent support for internal formats.
	 *
	 * @param target         the usage of the internal format. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param internalformat the internal format about which to retrieve information
	 * @param pname          the type of information to query
	 * @param bufSize        the maximum number of values that may be written to params by the function
	 * @param params         a variable into which to write the retrieved information
	 */
	public static void glGetInternalformativ(int target, int internalformat, int pname, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetInternalformativ(target, internalformat, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
		nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static int glGetInternalformati(int target, int internalformat, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetInternalformativ(target, internalformat, pname, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

}