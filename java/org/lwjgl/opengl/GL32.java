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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core OpenGL 3.2 functionality. */
public final class GL32 {

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_CONTEXT_PROFILE_MASK = 0x9126;

	/** Context profile bits. */
	public static final int
		GL_CONTEXT_CORE_PROFILE_BIT          = 0x1,
		GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x2;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_OUTPUT_COMPONENTS   = 0x9122,
		GL_MAX_GEOMETRY_INPUT_COMPONENTS  = 0x9123,
		GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124,
		GL_MAX_FRAGMENT_INPUT_COMPONENTS  = 0x9125;

	/** Accepted by the {@code mode} parameter of ProvokingVertex. */
	public static final int
		GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
		GL_LAST_VERTEX_CONVENTION  = 0x8E4E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_PROVOKING_VERTEX                         = 0x8E4F,
		GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
	 * GetDoublev.
	 */
	public static final int
		GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;

	/** Accepted by the {@code pname} parameter of GetMultisamplefv. */
	public static final int
		GL_SAMPLE_POSITION = 0x8E50;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_SAMPLE_MASK = 0x8E51;

	/** Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v. */
	public static final int
		GL_SAMPLE_MASK_VALUE = 0x8E52;

	/** Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample. */
	public static final int
		GL_TEXTURE_2D_MULTISAMPLE = 0x9100;

	/** Accepted by the {@code target} parameter of TexImage2DMultisample. */
	public static final int
		GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;

	/** Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample. */
	public static final int
		GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

	/** Accepted by the {@code target} parameter of TexImage3DMultisample. */
	public static final int
		GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_SAMPLE_MASK_WORDS                = 0x8E59,
		GL_MAX_COLOR_TEXTURE_SAMPLES            = 0x910E,
		GL_MAX_DEPTH_TEXTURE_SAMPLES            = 0x910F,
		GL_MAX_INTEGER_SAMPLES                  = 0x9110,
		GL_TEXTURE_BINDING_2D_MULTISAMPLE       = 0x9104,
		GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_SAMPLES                = 0x9106,
		GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_2D_MULTISAMPLE                    = 0x9108,
		GL_INT_SAMPLER_2D_MULTISAMPLE                = 0x9109,
		GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE       = 0x910A,
		GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
		GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
		GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_DEPTH_CLAMP = 0x864F;

	/** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int
		GL_GEOMETRY_SHADER = 0x8DD9;

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int
		GL_GEOMETRY_VERTICES_OUT = 0x8DDA,
		GL_GEOMETRY_INPUT_TYPE   = 0x8DDB,
		GL_GEOMETRY_OUTPUT_TYPE  = 0x8DDC;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS     = 0x8C29,
		GL_MAX_GEOMETRY_VARYING_COMPONENTS      = 0x8DDD,
		GL_MAX_VERTEX_VARYING_COMPONENTS        = 0x8DDE,
		GL_MAX_GEOMETRY_UNIFORM_COMPONENTS      = 0x8DDF,
		GL_MAX_GEOMETRY_OUTPUT_VERTICES         = 0x8DE0,
		GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;

	/** Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements. */
	public static final int
		GL_LINES_ADJACENCY          = 0xA,
		GL_LINE_STRIP_ADJACENCY     = 0xB,
		GL_TRIANGLES_ADJACENCY      = 0xC,
		GL_TRIANGLE_STRIP_ADJACENCY = 0xD;

	/** Returned by CheckFramebufferStatus. */
	public static final int
		GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8,
		GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT   = 0x8DA9;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachment- Parameteriv. */
	public static final int
		GL_FRAMEBUFFER_ATTACHMENT_LAYERED       = 0x8DA7,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and
	 * GetBooleanv.
	 */
	public static final int
		GL_PROGRAM_POINT_SIZE = 0x8642;

	/** Accepted as the {@code pname} parameter of GetInteger64v. */
	public static final int
		GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

	/** Accepted as the {@code pname} parameter of GetSynciv. */
	public static final int
		GL_OBJECT_TYPE    = 0x9112,
		GL_SYNC_CONDITION = 0x9113,
		GL_SYNC_STATUS    = 0x9114,
		GL_SYNC_FLAGS     = 0x9115;

	/** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE. */
	public static final int
		GL_SYNC_FENCE = 0x9116;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION. */
	public static final int
		GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS. */
	public static final int
		GL_UNSIGNALED = 0x9118,
		GL_SIGNALED   = 0x9119;

	/** Accepted in the {@code flags} parameter of ClientWaitSync. */
	public static final int
		GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

	/** Accepted in the {@code timeout} parameter of WaitSync. */
	public static final long
		GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFl;

	/** Returned by ClientWaitSync. */
	public static final int
		GL_ALREADY_SIGNALED    = 0x911A,
		GL_TIMEOUT_EXPIRED     = 0x911B,
		GL_CONDITION_SATISFIED = 0x911C,
		GL_WAIT_FAILED         = 0x911D;

	private GL32() {}

	// --- [ glDrawElementsBaseVertex ] ---

	/** JNI method for {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static native void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawElementsBaseVertex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsBaseVertex(mode, count, type, memAddress(indices), basevertex, __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, long indicesOffset, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsBaseVertex(mode, count, type, indicesOffset, basevertex, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsBaseVertex(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsBaseVertex glDrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex, __functionAddress);
	}

	// --- [ glDrawRangeElementsBaseVertex ] ---

	/** JNI method for {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static native void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawRangeElementsBaseVertex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, memAddress(indices), basevertex, __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indicesOffset, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indicesOffset, basevertex, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawRangeElementsBaseVertex glDrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
		long __functionAddress = getInstance().glDrawRangeElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex, __functionAddress);
	}

	// --- [ glDrawElementsInstancedBaseVertex ] ---

	/** JNI method for {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static native void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawElementsInstancedBaseVertex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, ByteBuffer indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertex(mode, count, type, memAddress(indices), primcount, basevertex, __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indicesOffset, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsInstancedBaseVertex(mode, count, type, indicesOffset, primcount, basevertex, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex, __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertex glDrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().glDrawElementsInstancedBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex, __functionAddress);
	}

	// --- [ glMultiDrawElementsBaseVertex ] ---

	/** JNI method for {@link #glMultiDrawElementsBaseVertex glMultiDrawElementsBaseVertex} */
	public static native void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int primcount, long basevertex, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiDrawElementsBaseVertex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.
	 * <p/>
	 * <b>LWJGL note</b>: Use {@link MemoryUtil#memAddress} to retrieve pointers to the index buffers.
	 *
	 * @param mode       the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      an array of the elements counts
	 * @param type       the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the size of the {@code count} array
	 * @param basevertex a pointer to the location where the base vertices are stored
	 */
	public static void glMultiDrawElementsBaseVertex(int mode, ByteBuffer count, int type, ByteBuffer indices, int primcount, ByteBuffer basevertex) {
		long __functionAddress = getInstance().glMultiDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, primcount << 2);
			checkBuffer(indices, primcount << POINTER_SHIFT);
			checkBuffer(basevertex, primcount << 2);
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), primcount, memAddress(basevertex), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiDrawElementsBaseVertex glMultiDrawElementsBaseVertex} */
	public static void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		long __functionAddress = getInstance().glMultiDrawElementsBaseVertex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.remaining());
			checkBuffer(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex), __functionAddress);
	}

	// --- [ glProvokingVertex ] ---

	/** JNI method for {@link #glProvokingVertex glProvokingVertex} */
	public static native void nglProvokingVertex(int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glProvokingVertex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the vertex to be used as the source of data for flat shaded varyings.
	 *
	 * @param mode the provoking vertex mode. One of:<p/>{@link #GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}, {@link #GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}
	 */
	public static void glProvokingVertex(int mode) {
		long __functionAddress = getInstance().glProvokingVertex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProvokingVertex(mode, __functionAddress);
	}

	// --- [ glTexImage2DMultisample ] ---

	/** JNI method for {@link #glTexImage2DMultisample glTexImage2DMultisample} */
	public static native void nglTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexImage2DMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.
	 *
	 * @param target               the target of the operation. One of:<p/>{@link #GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link #GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}
	 * @param samples              the number of samples in the multisample texture's image
	 * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
	 *                             or stencil-renderable format.
	 * @param width                the width of the multisample texture's image, in texels
	 * @param height               the height of the multisample texture's image, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().glTexImage2DMultisample;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTexImage3DMultisample ] ---

	/** JNI method for {@link #glTexImage3DMultisample glTexImage3DMultisample} */
	public static native void nglTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexImage3DMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Establishes the data storage, format, dimensions, and number of samples of a 3D multisample texture's image.
	 *
	 * @param target               the target of the operation. One of:<p/>{@link #GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link #GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param samples              the number of samples in the multisample texture's image
	 * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
	 *                             or stencil-renderable format.
	 * @param width                the width of the multisample texture's image, in texels
	 * @param height               the height of the multisample texture's image, in texels
	 * @param depth                the depth of the multisample texture's image, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().glTexImage3DMultisample;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
	}

	// --- [ glGetMultisamplefv ] ---

	/** JNI method for {@link #glGetMultisamplef(int, int, ByteBuffer) glGetMultisamplef} */
	public static native void nglGetMultisamplefv(int pname, int index, long val, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetMultisample.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the location of a sample.
	 *
	 * @param pname the sample parameter name. Must be:<p/>{@link #GL_SAMPLE_POSITION SAMPLE_POSITION}
	 * @param index the index of the sample whose position to query
	 * @param val   an array to receive the position of the sample
	 */
	public static void glGetMultisamplef(int pname, int index, ByteBuffer val) {
		long __functionAddress = getInstance().glGetMultisamplefv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(val, 1 << 2);
		}
		nglGetMultisamplefv(pname, index, memAddress(val), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMultisamplef(int, int, ByteBuffer) glGetMultisamplef} */
	public static void glGetMultisample(int pname, int index, FloatBuffer val) {
		long __functionAddress = getInstance().glGetMultisamplefv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(val, 1);
		}
		nglGetMultisamplefv(pname, index, memAddress(val), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMultisamplef(int, int, ByteBuffer) glGetMultisamplef} */
	public static float glGetMultisamplef(int pname, int index) {
		long __functionAddress = getInstance().glGetMultisamplefv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int val = __buffer.floatParam();
		nglGetMultisamplefv(pname, index, __buffer.address() + val, __functionAddress);
		return __buffer.floatValue(val);
	}

	// --- [ glSampleMaski ] ---

	/** JNI method for {@link #glSampleMaski glSampleMaski} */
	public static native void nglSampleMaski(int index, int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSampleMaski.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the value of a sub-word of the sample mask.
	 *
	 * @param index which 32-bit sub-word of the sample mask to update
	 * @param mask  the new value of the mask sub-word
	 */
	public static void glSampleMaski(int index, int mask) {
		long __functionAddress = getInstance().glSampleMaski;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSampleMaski(index, mask, __functionAddress);
	}

	// --- [ glFramebufferTexture ] ---

	/** JNI method for {@link #glFramebufferTexture glFramebufferTexture} */
	public static native void nglFramebufferTexture(int target, int attachment, int texture, int level, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFramebufferTexture.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches a level of a texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<p/>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment the attachment point of the framebuffer
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture(int target, int attachment, int texture, int level) {
		long __functionAddress = getInstance().glFramebufferTexture;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFramebufferTexture(target, attachment, texture, level, __functionAddress);
	}

	// --- [ glFenceSync ] ---

	/** JNI method for {@link #glFenceSync glFenceSync} */
	public static native long nglFenceSync(int condition, int flags, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFenceSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates a new sync object and inserts it into the GL command stream.
	 *
	 * @param condition the condition that must be met to set the sync object's state to signaled. Must be:<p/>{@link #GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE}
	 * @param flags     a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
	 *                  be zero.
	 */
	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = getInstance().glFenceSync;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglFenceSync(condition, flags, __functionAddress);
	}

	// --- [ glIsSync ] ---

	/** JNI method for {@link #glIsSync glIsSync} */
	public static native boolean nglIsSync(long sync, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a sync object.
	 *
	 * @param sync a value that may be the name of a sync object
	 */
	public static boolean glIsSync(long sync) {
		long __functionAddress = getInstance().glIsSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return nglIsSync(sync, __functionAddress);
	}

	// --- [ glDeleteSync ] ---

	/** JNI method for {@link #glDeleteSync glDeleteSync} */
	public static native void nglDeleteSync(long sync, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes a sync object.
	 *
	 * @param sync the sync object to be deleted
	 */
	public static void glDeleteSync(long sync) {
		long __functionAddress = getInstance().glDeleteSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		nglDeleteSync(sync, __functionAddress);
	}

	// --- [ glClientWaitSync ] ---

	/** JNI method for {@link #glClientWaitSync glClientWaitSync} */
	public static native int nglClientWaitSync(long sync, int flags, long timeout, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClientWaitSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
	 * {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.
	 * <p/>
	 * The return value is one of four status values:
	 * <ul>
	 * <li>{@link #GL_ALREADY_SIGNALED ALREADY_SIGNALED} indicates that sync was signaled at the time that glClientWaitSync was called.</li>
	 * <li>{@link #GL_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} indicates that at least timeout nanoseconds passed and sync did not become signaled.</li>
	 * <li>{@link #GL_CONDITION_SATISFIED CONDITION_SATISFIED} indicates that sync was signaled before the timeout expired.</li>
	 * <li>{@link #GL_WAIT_FAILED WAIT_FAILED} indicates that an error occurred. Additionally, an OpenGL error will be generated.</li>
	 * </ul>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. Must be:<p/>0, {@link #GL_SYNC_FLUSH_COMMANDS_BIT SYNC_FLUSH_COMMANDS_BIT}
	 * @param timeout the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled
	 */
	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().glClientWaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return nglClientWaitSync(sync, flags, timeout, __functionAddress);
	}

	// --- [ glWaitSync ] ---

	/** JNI method for {@link #glWaitSync glWaitSync} */
	public static native void nglWaitSync(long sync, int flags, long timeout, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glWaitSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Causes the GL server to block and wait for a sync object to become signaled.
	 * <p/>
	 * {@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
	 * with {@link #GL_MAX_SERVER_WAIT_TIMEOUT MAX_SERVER_WAIT_TIMEOUT}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
	 * sync object being waited on was signaled.
	 * <p/>
	 * If an error occurs, {@code glWaitSync} does not cause the GL server to block.
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. One of:<p/>0
	 * @param timeout the timeout that the server should wait before continuing. Must be:<p/>{@link #GL_TIMEOUT_IGNORED TIMEOUT_IGNORED}
	 */
	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().glWaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		nglWaitSync(sync, flags, timeout, __functionAddress);
	}

	// --- [ glGetInteger64v ] ---

	/** JNI method for {@link #glGetInteger64(int, ByteBuffer) glGetInteger64} */
	public static native void nglGetInteger64v(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void glGetInteger64(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetInteger64v(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetInteger64(int, ByteBuffer) glGetInteger64} */
	public static void glGetInteger64(int pname, LongBuffer params) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetInteger64v(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetInteger64(int, ByteBuffer) glGetInteger64} */
	public static long glGetInteger64(int pname) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetInteger64v(pname, __buffer.address() + params, __functionAddress);
		return __buffer.longValue(params);
	}

	// --- [ glGetSynciv ] ---

	/** JNI method for {@link #glGetSynci(long, int, int, ByteBuffer, ByteBuffer) glGetSynci} */
	public static native void nglGetSynciv(long sync, int pname, int bufSize, long length, long values, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSync.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the properties of a sync object.
	 *
	 * @param sync    the sync object whose properties to query
	 * @param pname   the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<p/>{@link #GL_OBJECT_TYPE OBJECT_TYPE}, {@link #GL_SYNC_CONDITION SYNC_CONDITION}, {@link #GL_SYNC_STATUS SYNC_STATUS}, {@link #GL_SYNC_FLAGS SYNC_FLAGS}
	 * @param bufSize the size of the buffer whose address is given in {@code values}
	 * @param length  the address of an variable to receive the number of integers placed in {@code values}
	 * @param values  the address of an array to receive the values of the queried parameter
	 */
	public static void glGetSynci(long sync, int pname, int bufSize, ByteBuffer length, ByteBuffer values) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			checkBuffer(values, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetSynciv(sync, pname, bufSize, memAddressSafe(length), memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSynci(long, int, int, ByteBuffer, ByteBuffer) glGetSynci} */
	public static void glGetSync(long sync, int pname, IntBuffer length, IntBuffer values) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSynci(long, int, int, ByteBuffer, ByteBuffer) glGetSynci} */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetSynciv(sync, pname, 1, memAddressSafe(length), __buffer.address() + values, __functionAddress);
		return __buffer.intValue(values);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL32;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL32") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glDrawElementsBaseVertex) &&
			GL.isFunctionSupported(funcs.glDrawRangeElementsBaseVertex) &&
			GL.isFunctionSupported(funcs.glDrawElementsInstancedBaseVertex) &&
			GL.isFunctionSupported(funcs.glMultiDrawElementsBaseVertex) &&
			GL.isFunctionSupported(funcs.glProvokingVertex) &&
			GL.isFunctionSupported(funcs.glTexImage2DMultisample) &&
			GL.isFunctionSupported(funcs.glTexImage3DMultisample) &&
			GL.isFunctionSupported(funcs.glGetMultisamplefv) &&
			GL.isFunctionSupported(funcs.glSampleMaski) &&
			GL.isFunctionSupported(funcs.glFramebufferTexture) &&
			GL.isFunctionSupported(funcs.glFenceSync) &&
			GL.isFunctionSupported(funcs.glIsSync) &&
			GL.isFunctionSupported(funcs.glDeleteSync) &&
			GL.isFunctionSupported(funcs.glClientWaitSync) &&
			GL.isFunctionSupported(funcs.glWaitSync) &&
			GL.isFunctionSupported(funcs.glGetInteger64v) &&
			GL.isFunctionSupported(funcs.glGetSynciv);

		return GL.checkExtension("OpenGL32", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL32}. */
	public static final class Functions implements FunctionMap {

		public final long
			glDrawElementsBaseVertex,
			glDrawRangeElementsBaseVertex,
			glDrawElementsInstancedBaseVertex,
			glMultiDrawElementsBaseVertex,
			glProvokingVertex,
			glTexImage2DMultisample,
			glTexImage3DMultisample,
			glGetMultisamplefv,
			glSampleMaski,
			glFramebufferTexture,
			glFenceSync,
			glIsSync,
			glDeleteSync,
			glClientWaitSync,
			glWaitSync,
			glGetInteger64v,
			glGetSynciv;

		public Functions(FunctionProvider provider) {
			glDrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
			glDrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
			glDrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
			glMultiDrawElementsBaseVertex = provider.getFunctionAddress("glMultiDrawElementsBaseVertex");
			glProvokingVertex = provider.getFunctionAddress("glProvokingVertex");
			glTexImage2DMultisample = provider.getFunctionAddress("glTexImage2DMultisample");
			glTexImage3DMultisample = provider.getFunctionAddress("glTexImage3DMultisample");
			glGetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
			glSampleMaski = provider.getFunctionAddress("glSampleMaski");
			glFramebufferTexture = provider.getFunctionAddress("glFramebufferTexture");
			glFenceSync = provider.getFunctionAddress("glFenceSync");
			glIsSync = provider.getFunctionAddress("glIsSync");
			glDeleteSync = provider.getFunctionAddress("glDeleteSync");
			glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
			glWaitSync = provider.getFunctionAddress("glWaitSync");
			glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
			glGetSynciv = provider.getFunctionAddress("glGetSynciv");
		}

	}

}