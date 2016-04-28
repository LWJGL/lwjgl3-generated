/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 3.2 functionality. OpenGL 3.2 implementations support revision 1.50 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/vertex_array_bgra.txt">ARB_vertex_array_bgra</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/draw_elements_base_vertex.txt">ARB_draw_elements_base_vertex</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/fragment_coord_conventions.txt">ARB_fragment_coord_conventions</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/provoking_vertex.txt">ARB_provoking_vertex</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/seamless_cube_map.txt">ARB_seamless_cube_map</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_multisample.txt">ARB_texture_multisample</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/depth_clamp.txt">ARB_depth_clamp</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/geometry_shader4.txt">ARB_geometry_shader4</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/sync.txt">ARB_sync</a></li>
 * </ul>
 */
public class GL32 {

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;

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
	public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;

	/** Accepted by the {@code pname} parameter of GetMultisamplefv. */
	public static final int GL_SAMPLE_POSITION = 0x8E50;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_SAMPLE_MASK = 0x8E51;

	/** Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v. */
	public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;

	/** Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample. */
	public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;

	/** Accepted by the {@code target} parameter of TexImage2DMultisample. */
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;

	/** Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample. */
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

	/** Accepted by the {@code target} parameter of TexImage3DMultisample. */
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;

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
	public static final int GL_DEPTH_CLAMP = 0x864F;

	/** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
	public static final int GL_GEOMETRY_SHADER = 0x8DD9;

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int
		GL_GEOMETRY_VERTICES_OUT = 0x8DDA,
		GL_GEOMETRY_INPUT_TYPE   = 0x8DDB,
		GL_GEOMETRY_OUTPUT_TYPE  = 0x8DDC;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS     = 0x8C29,
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
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachment- Parameteriv. */
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and
	 * GetBooleanv.
	 */
	public static final int GL_PROGRAM_POINT_SIZE = 0x8642;

	/** Accepted as the {@code pname} parameter of GetInteger64v. */
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

	/** Accepted as the {@code pname} parameter of GetSynciv. */
	public static final int
		GL_OBJECT_TYPE    = 0x9112,
		GL_SYNC_CONDITION = 0x9113,
		GL_SYNC_STATUS    = 0x9114,
		GL_SYNC_FLAGS     = 0x9115;

	/** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE. */
	public static final int GL_SYNC_FENCE = 0x9116;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION. */
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS. */
	public static final int
		GL_UNSIGNALED = 0x9118,
		GL_SIGNALED   = 0x9119;

	/** Accepted in the {@code flags} parameter of ClientWaitSync. */
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

	/** Accepted in the {@code timeout} parameter of WaitSync. */
	public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFl;

	/** Returned by ClientWaitSync. */
	public static final int
		GL_ALREADY_SIGNALED    = 0x911A,
		GL_TIMEOUT_EXPIRED     = 0x911B,
		GL_CONDITION_SATISFIED = 0x911C,
		GL_WAIT_FAILED         = 0x911D;

	protected GL32() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetBufferParameteri64v, caps.glDrawElementsBaseVertex, caps.glDrawRangeElementsBaseVertex, caps.glDrawElementsInstancedBaseVertex, 
			caps.glMultiDrawElementsBaseVertex, caps.glProvokingVertex, caps.glTexImage2DMultisample, caps.glTexImage3DMultisample, caps.glGetMultisamplefv, 
			caps.glSampleMaski, caps.glFramebufferTexture, caps.glFenceSync, caps.glIsSync, caps.glDeleteSync, caps.glClientWaitSync, caps.glWaitSync, 
			caps.glGetInteger64v, caps.glGetInteger64i_v, caps.glGetSynciv
		);
	}

	// --- [ glGetBufferParameteri64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void nglGetBufferParameteri64v(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetBufferParameteri64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteri64v(target, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 */
	public static long glGetBufferParameteri64(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetBufferParameteri64v(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDrawElementsBaseVertex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		long __functionAddress = GL.getCapabilities().glDrawElementsBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		long __functionAddress = GL.getCapabilities().glDrawRangeElementsBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, start, end, count, type, indices, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawRangeElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
		long __functionAddress = GL.getCapabilities().glDrawElementsInstancedBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstancedBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex);
	}

	// --- [ glMultiDrawElementsBaseVertex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      an array of the elements counts
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the size of the {@code count} array
	 * @param basevertex a pointer to the location where the base vertices are stored
	 */
	public static void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int primcount, long basevertex) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElementsBaseVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, mode, count, type, indices, primcount, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link #GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link #GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link #GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link #GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      an array of the elements counts
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a pointer to the location where the base vertices are stored
	 */
	public static void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		if ( CHECKS ) {
			checkBuffer(indices, count.remaining());
			checkBuffer(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
	}

	// --- [ glProvokingVertex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glProvokingVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the vertex to be used as the source of data for flat shaded varyings.
	 *
	 * @param mode the provoking vertex mode. One of:<br><table><tr><td>{@link #GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}</td><td>{@link #GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}</td></tr></table>
	 */
	public static void glProvokingVertex(int mode) {
		long __functionAddress = GL.getCapabilities().glProvokingVertex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode);
	}

	// --- [ glTexImage2DMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexImage2DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.
	 *
	 * @param target               the target of the operation. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link #GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>
	 * @param samples              the number of samples in the multisample texture's image
	 * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
	 *                             or stencil-renderable format.
	 * @param width                the width of the multisample texture's image, in texels
	 * @param height               the height of the multisample texture's image, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = GL.getCapabilities().glTexImage2DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height, fixedsamplelocations);
	}

	// --- [ glTexImage3DMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexImage3DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Establishes the data storage, format, dimensions, and number of samples of a 3D multisample texture's image.
	 *
	 * @param target               the target of the operation. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link #GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
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
		long __functionAddress = GL.getCapabilities().glTexImage3DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height, depth, fixedsamplelocations);
	}

	// --- [ glGetMultisamplefv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the location of a sample.
	 *
	 * @param pname the sample parameter name. Must be:<br><table><tr><td>{@link #GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>
	 * @param index the index of the sample whose position to query
	 * @param val   an array to receive the position of the sample
	 */
	public static void nglGetMultisamplefv(int pname, int index, long val) {
		long __functionAddress = GL.getCapabilities().glGetMultisamplefv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, index, val);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the location of a sample.
	 *
	 * @param pname the sample parameter name. Must be:<br><table><tr><td>{@link #GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>
	 * @param index the index of the sample whose position to query
	 * @param val   an array to receive the position of the sample
	 */
	public static void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
		if ( CHECKS )
			checkBuffer(val, 1);
		nglGetMultisamplefv(pname, index, memAddress(val));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the location of a sample.
	 *
	 * @param pname the sample parameter name. Must be:<br><table><tr><td>{@link #GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>
	 * @param index the index of the sample whose position to query
	 */
	public static float glGetMultisamplef(int pname, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer val = stack.callocFloat(1);
			nglGetMultisamplefv(pname, index, memAddress(val));
			return val.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSampleMaski ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSampleMaski.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the value of a sub-word of the sample mask.
	 *
	 * @param index which 32-bit sub-word of the sample mask to update
	 * @param mask  the new value of the mask sub-word
	 */
	public static void glSampleMaski(int index, int mask) {
		long __functionAddress = GL.getCapabilities().glSampleMaski;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, mask);
	}

	// --- [ glFramebufferTexture ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFramebufferTexture.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches a level of a texture object as a logical buffer to the currently bound framebuffer object.
	 *
	 * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
	 * @param attachment the attachment point of the framebuffer
	 * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level      the mipmap level of {@code texture} to attach
	 */
	public static void glFramebufferTexture(int target, int attachment, int texture, int level) {
		long __functionAddress = GL.getCapabilities().glFramebufferTexture;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, attachment, texture, level);
	}

	// --- [ glFenceSync ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFenceSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Creates a new sync object and inserts it into the GL command stream.
	 *
	 * @param condition the condition that must be met to set the sync object's state to signaled. Must be:<br><table><tr><td>{@link #GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE}</td></tr></table>
	 * @param flags     a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
	 *                  be zero.
	 */
	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = GL.getCapabilities().glFenceSync;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, condition, flags);
	}

	// --- [ glIsSync ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a sync object.
	 *
	 * @param sync a value that may be the name of a sync object
	 */
	public static boolean glIsSync(long sync) {
		long __functionAddress = GL.getCapabilities().glIsSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSync ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes a sync object.
	 *
	 * @param sync the sync object to be deleted
	 */
	public static void glDeleteSync(long sync) {
		long __functionAddress = GL.getCapabilities().glDeleteSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSync ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClientWaitSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
	 * {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.
	 * 
	 * <p>The return value is one of four status values:</p>
	 * 
	 * <ul>
	 * <li>{@link #GL_ALREADY_SIGNALED ALREADY_SIGNALED} indicates that sync was signaled at the time that glClientWaitSync was called.</li>
	 * <li>{@link #GL_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} indicates that at least timeout nanoseconds passed and sync did not become signaled.</li>
	 * <li>{@link #GL_CONDITION_SATISFIED CONDITION_SATISFIED} indicates that sync was signaled before the timeout expired.</li>
	 * <li>{@link #GL_WAIT_FAILED WAIT_FAILED} indicates that an error occurred. Additionally, an OpenGL error will be generated.</li>
	 * </ul>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. One or more of:<br><table><tr><td>0</td><td>{@link #GL_SYNC_FLUSH_COMMANDS_BIT SYNC_FLUSH_COMMANDS_BIT}</td></tr></table>
	 * @param timeout the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled
	 */
	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GL.getCapabilities().glClientWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSync ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glWaitSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Causes the GL server to block and wait for a sync object to become signaled.
	 * 
	 * <p>{@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
	 * with {@link #GL_MAX_SERVER_WAIT_TIMEOUT MAX_SERVER_WAIT_TIMEOUT}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
	 * sync object being waited on was signaled.</p>
	 * 
	 * <p>If an error occurs, {@code glWaitSync} does not cause the GL server to block.</p>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. Must be:<br><table><tr><td>0</td></tr></table>
	 * @param timeout the timeout that the server should wait before continuing. Must be:<br><table><tr><td>{@link #GL_TIMEOUT_IGNORED TIMEOUT_IGNORED}</td></tr></table>
	 */
	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GL.getCapabilities().glWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void nglGetInteger64v(int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void glGetInteger64v(int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetInteger64v(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname the parameter value to be returned
	 */
	public static long glGetInteger64(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetInteger64v(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetInteger64i_v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the 64bit integer value of an indexed state variable.
	 *
	 * @param pname  the indexed state to query
	 * @param index  the index of the element being queried
	 * @param params the value or values of the specified parameter
	 */
	public static void nglGetInteger64i_v(int pname, int index, long params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64i_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, index, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the 64bit integer value of an indexed state variable.
	 *
	 * @param pname  the indexed state to query
	 * @param index  the index of the element being queried
	 * @param params the value or values of the specified parameter
	 */
	public static void glGetInteger64i_v(int pname, int index, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetInteger64i_v(pname, index, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the 64bit integer value of an indexed state variable.
	 *
	 * @param pname the indexed state to query
	 * @param index the index of the element being queried
	 */
	public static long glGetInteger64i(int pname, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetInteger64i_v(pname, index, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSynciv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the properties of a sync object.
	 *
	 * @param sync    the sync object whose properties to query
	 * @param pname   the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param bufSize the size of the buffer whose address is given in {@code values}
	 * @param length  the address of an variable to receive the number of integers placed in {@code values}
	 * @param values  the address of an array to receive the values of the queried parameter
	 */
	public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = GL.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the properties of a sync object.
	 *
	 * @param sync   the sync object whose properties to query
	 * @param pname  the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param length the address of an variable to receive the number of integers placed in {@code values}
	 * @param values the address of an array to receive the values of the queried parameter
	 */
	public static void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the properties of a sync object.
	 *
	 * @param sync   the sync object whose properties to query
	 * @param pname  the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param length the address of an variable to receive the number of integers placed in {@code values}
	 */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetSynciv(sync, pname, 1, memAddressSafe(length), memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v}
	 */
	public static void glGetBufferParameteri64v(int target, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetBufferParameteri64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElementsBaseVertex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex}
	 */
	public static void glMultiDrawElementsBaseVertex(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElementsBaseVertex;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.length);
			checkBuffer(basevertex, count.length);
		}
		callPPPV(__functionAddress, mode, count, type, memAddress(indices), count.length, basevertex);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetMultisamplefv GetMultisamplefv}
	 */
	public static void glGetMultisamplefv(int pname, int index, float[] val) {
		long __functionAddress = GL.getCapabilities().glGetMultisamplefv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(val, 1);
		}
		callPV(__functionAddress, pname, index, val);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetInteger64v GetInteger64v}
	 */
	public static void glGetInteger64v(int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetInteger64i_v GetInteger64i_v}
	 */
	public static void glGetInteger64i_v(int pname, int index, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64i_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, pname, index, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSync.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetSynciv GetSynciv}
	 */
	public static void glGetSynciv(long sync, int pname, int[] length, int[] values) {
		long __functionAddress = GL.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, sync, pname, values.length, length, values);
	}

}