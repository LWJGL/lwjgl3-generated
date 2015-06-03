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

/**
 * The core OpenGL 1.5 functionality.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/vertex_buffer_object.txt">ARB_vertex_buffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/occlusion_query.txt">ARB_occlusion_query</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/shadow_funcs.txt">EXT_shadow_funcs</a></li>
 * </ul></p>
 */
public final class GL15 {

	/** New token names. */
	public static final int
		GL_FOG_COORD_SRC                  = 0x8450,
		GL_FOG_COORD                      = 0x8451,
		GL_CURRENT_FOG_COORD              = 0x8453,
		GL_FOG_COORD_ARRAY_TYPE           = 0x8454,
		GL_FOG_COORD_ARRAY_STRIDE         = 0x8455,
		GL_FOG_COORD_ARRAY_POINTER        = 0x8456,
		GL_FOG_COORD_ARRAY                = 0x8457,
		GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D,
		GL_SRC0_RGB                       = 0x8580,
		GL_SRC1_RGB                       = 0x8581,
		GL_SRC2_RGB                       = 0x8582,
		GL_SRC0_ALPHA                     = 0x8588,
		GL_SRC1_ALPHA                     = 0x8589,
		GL_SRC2_ALPHA                     = 0x858A;

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData,
	 * GetBufferParameteriv, and GetBufferPointerv.
	 */
	public static final int
		GL_ARRAY_BUFFER         = 0x8892,
		GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_ARRAY_BUFFER_BINDING                 = 0x8894,
		GL_ELEMENT_ARRAY_BUFFER_BINDING         = 0x8895,
		GL_VERTEX_ARRAY_BUFFER_BINDING          = 0x8896,
		GL_NORMAL_ARRAY_BUFFER_BINDING          = 0x8897,
		GL_COLOR_ARRAY_BUFFER_BINDING           = 0x8898,
		GL_INDEX_ARRAY_BUFFER_BINDING           = 0x8899,
		GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING   = 0x889A,
		GL_EDGE_FLAG_ARRAY_BUFFER_BINDING       = 0x889B,
		GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C,
		GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING  = 0x889D,
		GL_WEIGHT_ARRAY_BUFFER_BINDING          = 0x889E;

	/** Accepted by the {@code pname} parameter of GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

	/** Accepted by the {@code usage} parameter of BufferData. */
	public static final int
		GL_STREAM_DRAW  = 0x88E0,
		GL_STREAM_READ  = 0x88E1,
		GL_STREAM_COPY  = 0x88E2,
		GL_STATIC_DRAW  = 0x88E4,
		GL_STATIC_READ  = 0x88E5,
		GL_STATIC_COPY  = 0x88E6,
		GL_DYNAMIC_DRAW = 0x88E8,
		GL_DYNAMIC_READ = 0x88E9,
		GL_DYNAMIC_COPY = 0x88EA;

	/** Accepted by the {@code access} parameter of MapBuffer. */
	public static final int
		GL_READ_ONLY  = 0x88B8,
		GL_WRITE_ONLY = 0x88B9,
		GL_READ_WRITE = 0x88BA;

	/** Accepted by the {@code pname} parameter of GetBufferParameteriv. */
	public static final int
		GL_BUFFER_SIZE   = 0x8764,
		GL_BUFFER_USAGE  = 0x8765,
		GL_BUFFER_ACCESS = 0x88BB,
		GL_BUFFER_MAPPED = 0x88BC;

	/** Accepted by the {@code pname} parameter of GetBufferPointerv. */
	public static final int GL_BUFFER_MAP_POINTER = 0x88BD;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_SAMPLES_PASSED = 0x8914;

	/** Accepted by the {@code pname} parameter of GetQueryiv. */
	public static final int
		GL_QUERY_COUNTER_BITS = 0x8864,
		GL_CURRENT_QUERY      = 0x8865;

	/** Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv. */
	public static final int
		GL_QUERY_RESULT           = 0x8866,
		GL_QUERY_RESULT_AVAILABLE = 0x8867;

	/** Function address. */
	@JavadocExclude
	public final long
		BindBuffer,
		DeleteBuffers,
		GenBuffers,
		IsBuffer,
		BufferData,
		BufferSubData,
		GetBufferSubData,
		MapBuffer,
		UnmapBuffer,
		GetBufferParameteriv,
		GetBufferPointerv,
		GenQueries,
		DeleteQueries,
		IsQuery,
		BeginQuery,
		EndQuery,
		GetQueryiv,
		GetQueryObjectiv,
		GetQueryObjectuiv;

	@JavadocExclude
	public GL15(FunctionProvider provider) {
		BindBuffer = provider.getFunctionAddress("glBindBuffer");
		DeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
		GenBuffers = provider.getFunctionAddress("glGenBuffers");
		IsBuffer = provider.getFunctionAddress("glIsBuffer");
		BufferData = provider.getFunctionAddress("glBufferData");
		BufferSubData = provider.getFunctionAddress("glBufferSubData");
		GetBufferSubData = provider.getFunctionAddress("glGetBufferSubData");
		MapBuffer = provider.getFunctionAddress("glMapBuffer");
		UnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
		GetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
		GetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
		GenQueries = provider.getFunctionAddress("glGenQueries");
		DeleteQueries = provider.getFunctionAddress("glDeleteQueries");
		IsQuery = provider.getFunctionAddress("glIsQuery");
		BeginQuery = provider.getFunctionAddress("glBeginQuery");
		EndQuery = provider.getFunctionAddress("glEndQuery");
		GetQueryiv = provider.getFunctionAddress("glGetQueryiv");
		GetQueryObjectiv = provider.getFunctionAddress("glGetQueryObjectiv");
		GetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL15} instance for the current context. */
	public static GL15 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL15);
	}

	static GL15 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL15") ) return null;

		GL15 funcs = new GL15(provider);

		boolean supported = checkFunctions(
			funcs.BindBuffer, funcs.DeleteBuffers, funcs.GenBuffers, funcs.IsBuffer, funcs.BufferData, funcs.BufferSubData, funcs.GetBufferSubData, 
			funcs.MapBuffer, funcs.UnmapBuffer, funcs.GetBufferParameteriv, funcs.GetBufferPointerv, funcs.GenQueries, funcs.DeleteQueries, funcs.IsQuery, 
			funcs.BeginQuery, funcs.EndQuery, funcs.GetQueryiv, funcs.GetQueryObjectiv, funcs.GetQueryObjectuiv
		);

		return GL.checkExtension("OpenGL15", funcs, supported);
	}

	// --- [ glBindBuffer ] ---

	/** JNI method for {@link #glBindBuffer BindBuffer} */
	@JavadocExclude
	public static native void nglBindBuffer(int target, int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a named buffer object.
	 *
	 * @param target the target to which the buffer object is bound. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param buffer the name of a buffer object
	 */
	public static void glBindBuffer(int target, int buffer) {
		long __functionAddress = getInstance().BindBuffer;
		nglBindBuffer(target, buffer, __functionAddress);
	}

	// --- [ glDeleteBuffers ] ---

	/** JNI method for {@link #glDeleteBuffers DeleteBuffers} */
	@JavadocExclude
	public static native void nglDeleteBuffers(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteBuffers DeleteBuffers} */
	@JavadocExclude
	public static void nglDeleteBuffers(int n, long buffers) {
		long __functionAddress = getInstance().DeleteBuffers;
		nglDeleteBuffers(n, buffers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named buffer objects.
	 *
	 * @param n       the number of buffer objects to be deleted
	 * @param buffers an array of buffer objects to be deleted
	 */
	public static void glDeleteBuffers(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglDeleteBuffers(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glDeleteBuffers DeleteBuffers} */
	public static void glDeleteBuffers(IntBuffer buffers) {
		nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
	}

	/** Single value version of: {@link #glDeleteBuffers DeleteBuffers} */
	public static void glDeleteBuffers(int buffer) {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam(buffer);
		nglDeleteBuffers(1, __buffer.address(buffers));
	}

	// --- [ glGenBuffers ] ---

	/** JNI method for {@link #glGenBuffers GenBuffers} */
	@JavadocExclude
	public static native void nglGenBuffers(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glGenBuffers GenBuffers} */
	@JavadocExclude
	public static void nglGenBuffers(int n, long buffers) {
		long __functionAddress = getInstance().GenBuffers;
		nglGenBuffers(n, buffers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates buffer object names.
	 *
	 * @param n       the number of buffer object names to be generated
	 * @param buffers a buffer in which the generated buffer object names are stored
	 */
	public static void glGenBuffers(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglGenBuffers(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glGenBuffers GenBuffers} */
	public static void glGenBuffers(IntBuffer buffers) {
		nglGenBuffers(buffers.remaining(), memAddress(buffers));
	}

	/** Single return value version of: {@link #glGenBuffers GenBuffers} */
	public static int glGenBuffers() {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		nglGenBuffers(1, __buffer.address(buffers));
		return __buffer.intValue(buffers);
	}

	// --- [ glIsBuffer ] ---

	/** JNI method for {@link #glIsBuffer IsBuffer} */
	@JavadocExclude
	public static native boolean nglIsBuffer(int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a buffer object.
	 *
	 * @param buffer a value that may be the name of a buffer object
	 */
	public static boolean glIsBuffer(int buffer) {
		long __functionAddress = getInstance().IsBuffer;
		return nglIsBuffer(buffer, __functionAddress);
	}

	// --- [ glBufferData ] ---

	/** JNI method for {@link #glBufferData BufferData} */
	@JavadocExclude
	public static native void nglBufferData(int target, long size, long data, int usage, long __functionAddress);

	/** Unsafe version of {@link #glBufferData BufferData} */
	@JavadocExclude
	public static void nglBufferData(int target, long size, long data, int usage) {
		long __functionAddress = getInstance().BufferData;
		nglBufferData(target, size, data, usage, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Creates and initializes a buffer object's data store.
	 * 
	 * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
	 * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
	 * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
	 * frequency of access may be one of these:
	 * <ul>
	 * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
	 * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
	 * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
	 * </ul>
	 * The nature of access may be one of these:
	 * <ul>
	 * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
	 * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
	 * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
	 * </ul></p>
	 *
	 * @param target the target buffer object. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param data   a pointer to data that will be copied into the data store for initialization, or NULL if no data is to be copied
	 * @param usage  the expected usage pattern of the data store. One of:<br>{@link #GL_STREAM_DRAW STREAM_DRAW}, {@link #GL_STREAM_READ STREAM_READ}, {@link #GL_STREAM_COPY STREAM_COPY}, {@link #GL_STATIC_DRAW STATIC_DRAW}, {@link #GL_STATIC_READ STATIC_READ}, {@link #GL_STATIC_COPY STATIC_COPY}, {@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}, {@link #GL_DYNAMIC_READ DYNAMIC_READ}, {@link #GL_DYNAMIC_COPY DYNAMIC_COPY}
	 */
	public static void glBufferData(int target, long size, ByteBuffer data, int usage) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglBufferData(target, size, memAddressSafe(data), usage);
	}

	/** Alternative version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, long size, int usage) {
		nglBufferData(target, size, 0L, usage);
	}

	/** ByteBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, ByteBuffer data, int usage) {
		nglBufferData(target, data.remaining(), memAddress(data), usage);
	}

	/** ShortBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, ShortBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 1, memAddress(data), usage);
	}

	/** IntBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, IntBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
	}

	/** FloatBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, FloatBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
	}

	/** DoubleBuffer version of: {@link #glBufferData BufferData} */
	public static void glBufferData(int target, DoubleBuffer data, int usage) {
		nglBufferData(target, data.remaining() << 3, memAddress(data), usage);
	}

	// --- [ glBufferSubData ] ---

	/** JNI method for {@link #glBufferSubData BufferSubData} */
	@JavadocExclude
	public static native void nglBufferSubData(int target, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glBufferSubData BufferSubData} */
	@JavadocExclude
	public static void nglBufferSubData(int target, long offset, long size, long data) {
		long __functionAddress = getInstance().BufferSubData;
		nglBufferSubData(target, offset, size, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Updates a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param size   the size in bytes of the data store region being replaced
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void glBufferSubData(int target, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglBufferSubData(target, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, ByteBuffer data) {
		nglBufferSubData(target, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, ShortBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, IntBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, FloatBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glBufferSubData BufferSubData} */
	public static void glBufferSubData(int target, long offset, DoubleBuffer data) {
		nglBufferSubData(target, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glGetBufferSubData ] ---

	/** JNI method for {@link #glGetBufferSubData GetBufferSubData} */
	@JavadocExclude
	public static native void nglGetBufferSubData(int target, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferSubData GetBufferSubData} */
	@JavadocExclude
	public static void nglGetBufferSubData(int target, long offset, long size, long data) {
		long __functionAddress = getInstance().GetBufferSubData;
		nglGetBufferSubData(target, offset, size, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param size   the size in bytes of the data store region being returned
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void glGetBufferSubData(int target, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglGetBufferSubData(target, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glGetBufferSubData GetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, ByteBuffer data) {
		nglGetBufferSubData(target, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glGetBufferSubData GetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, ShortBuffer data) {
		nglGetBufferSubData(target, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glGetBufferSubData GetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, IntBuffer data) {
		nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glGetBufferSubData GetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, FloatBuffer data) {
		nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glGetBufferSubData GetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
		nglGetBufferSubData(target, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glMapBuffer ] ---

	/** JNI method for {@link #glMapBuffer MapBuffer} */
	@JavadocExclude
	public static native long nglMapBuffer(int target, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapBuffer MapBuffer} */
	@JavadocExclude
	public static long nglMapBuffer(int target, int access) {
		long __functionAddress = getInstance().MapBuffer;
		return nglMapBuffer(target, access, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Maps a buffer object's data store.
	 * 
	 * <p><b>LWJGL note</b>: This method comes in 3 flavors:
	 * <ol>
	 * <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteri GetBufferParameteri} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
	 * <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteri GetBufferParameteri} to retrieve the buffer size and the {@code old_buffer} parameter is reused if the returned size and pointer match the buffer capacity and address, respectively.</li>
	 * <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if {@code size} and the returned pointer match the buffer capacity and address, respectively. This is the most efficient method.</li>
	 * </ol></p>
	 *
	 * @param target the target buffer object being mapped. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br>{@link #GL_READ_ONLY READ_ONLY}, {@link #GL_WRITE_ONLY WRITE_ONLY}, {@link #GL_READ_WRITE READ_WRITE}
	 */
	public static ByteBuffer glMapBuffer(int target, int access) {
		long __result = nglMapBuffer(target, access);
		return memByteBuffer(__result, (int)glGetBufferParameteri(target, GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapBuffer MapBuffer} */
	public static ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
		long __result = nglMapBuffer(target, access);
		int length = glGetBufferParameteri(target, GL_BUFFER_SIZE);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #glMapBuffer MapBuffer} */
	public static ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapBuffer(target, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glUnmapBuffer ] ---

	/** JNI method for {@link #glUnmapBuffer UnmapBuffer} */
	@JavadocExclude
	public static native boolean nglUnmapBuffer(int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUnmapBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.
	 * 
	 * <p>Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
	 * the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
	 * memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
	 * If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.</p>
	 *
	 * @param target the target buffer object being unmapped. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 */
	public static boolean glUnmapBuffer(int target) {
		long __functionAddress = getInstance().UnmapBuffer;
		return nglUnmapBuffer(target, __functionAddress);
	}

	// --- [ glGetBufferParameteriv ] ---

	/** JNI method for {@link #glGetBufferParameteriv GetBufferParameteriv} */
	@JavadocExclude
	public static native void nglGetBufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferParameteriv GetBufferParameteriv} */
	@JavadocExclude
	public static void nglGetBufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferParameteriv;
		nglGetBufferParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br>{@link #GL_BUFFER_SIZE BUFFER_SIZE}, {@link #GL_BUFFER_USAGE BUFFER_USAGE}, {@link #GL_BUFFER_ACCESS BUFFER_ACCESS}, {@link #GL_BUFFER_MAPPED BUFFER_MAPPED}, {@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}, {@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}, {@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}, {@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}, {@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}
	 * @param params the requested parameter
	 */
	public static void glGetBufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetBufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferParameteriv GetBufferParameteriv} */
	public static void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferParameteriv GetBufferParameteriv} */
	public static int glGetBufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetBufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetBufferPointerv ] ---

	/** JNI method for {@link #glGetBufferPointerv GetBufferPointerv} */
	@JavadocExclude
	public static native void nglGetBufferPointerv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferPointerv GetBufferPointerv} */
	@JavadocExclude
	public static void nglGetBufferPointerv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferPointerv;
		nglGetBufferPointerv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetBufferPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the pointer to a mapped buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param pname  the pointer to be returned. Must be:<br>{@link #GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void glGetBufferPointerv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferPointerv GetBufferPointerv} */
	public static void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferPointerv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferPointerv GetBufferPointerv} */
	public static long glGetBufferPointer(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetBufferPointerv(target, pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glGenQueries ] ---

	/** JNI method for {@link #glGenQueries GenQueries} */
	@JavadocExclude
	public static native void nglGenQueries(int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glGenQueries GenQueries} */
	@JavadocExclude
	public static void nglGenQueries(int n, long ids) {
		long __functionAddress = getInstance().GenQueries;
		nglGenQueries(n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates query object names.
	 *
	 * @param n   the number of query object names to be generated
	 * @param ids a buffer in which the generated query object names are stored
	 */
	public static void glGenQueries(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglGenQueries(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenQueries GenQueries} */
	public static void glGenQueries(IntBuffer ids) {
		nglGenQueries(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenQueries GenQueries} */
	public static int glGenQueries() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenQueries(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glDeleteQueries ] ---

	/** JNI method for {@link #glDeleteQueries DeleteQueries} */
	@JavadocExclude
	public static native void nglDeleteQueries(int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glDeleteQueries DeleteQueries} */
	@JavadocExclude
	public static void nglDeleteQueries(int n, long ids) {
		long __functionAddress = getInstance().DeleteQueries;
		nglDeleteQueries(n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named query objects.
	 *
	 * @param n   the number of query objects to be deleted
	 * @param ids an array of query objects to be deleted
	 */
	public static void glDeleteQueries(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteQueries(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteQueries DeleteQueries} */
	public static void glDeleteQueries(IntBuffer ids) {
		nglDeleteQueries(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteQueries DeleteQueries} */
	public static void glDeleteQueries(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteQueries(1, __buffer.address(ids));
	}

	// --- [ glIsQuery ] ---

	/** JNI method for {@link #glIsQuery IsQuery} */
	@JavadocExclude
	public static native boolean nglIsQuery(int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsQuery.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determine if a name corresponds to a query object.
	 *
	 * @param id a value that may be the name of a query object
	 */
	public static boolean glIsQuery(int id) {
		long __functionAddress = getInstance().IsQuery;
		return nglIsQuery(id, __functionAddress);
	}

	// --- [ glBeginQuery ] ---

	/** JNI method for {@link #glBeginQuery BeginQuery} */
	@JavadocExclude
	public static native void nglBeginQuery(int target, int id, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginQuery.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Creates a query object and makes it active.
	 *
	 * @param target the target type of query object established. One of:<br>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param id     the name of a query object
	 */
	public static void glBeginQuery(int target, int id) {
		long __functionAddress = getInstance().BeginQuery;
		nglBeginQuery(target, id, __functionAddress);
	}

	// --- [ glEndQuery ] ---

	/** JNI method for {@link #glEndQuery EndQuery} */
	@JavadocExclude
	public static native void nglEndQuery(int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBeginQuery.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.
	 *
	 * @param target the query object target. One of:<br>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 */
	public static void glEndQuery(int target) {
		long __functionAddress = getInstance().EndQuery;
		nglEndQuery(target, __functionAddress);
	}

	// --- [ glGetQueryiv ] ---

	/** JNI method for {@link #glGetQueryiv GetQueryiv} */
	@JavadocExclude
	public static native void nglGetQueryiv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryiv GetQueryiv} */
	@JavadocExclude
	public static void nglGetQueryiv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetQueryiv;
		nglGetQueryiv(target, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQuery.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns parameters of a query object target.
	 *
	 * @param target the query object target. One of:<br>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param pname  the symbolic name of a query object target parameter. One of:<br>{@link #GL_QUERY_COUNTER_BITS QUERY_COUNTER_BITS}, {@link #GL_CURRENT_QUERY CURRENT_QUERY}
	 * @param params the requested data
	 */
	public static void glGetQueryiv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryiv GetQueryiv} */
	public static void glGetQueryiv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryiv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryiv GetQueryiv} */
	public static int glGetQueryi(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryiv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectiv ] ---

	/** JNI method for {@link #glGetQueryObjectiv GetQueryObjectiv} */
	@JavadocExclude
	public static native void nglGetQueryObjectiv(int id, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryObjectiv GetQueryObjectiv} */
	@JavadocExclude
	public static void nglGetQueryObjectiv(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectiv;
		nglGetQueryObjectiv(id, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the integer value of a query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br>{@link #GL_QUERY_RESULT QUERY_RESULT}, {@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjectiv(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectiv(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectiv GetQueryObjectiv} */
	public static void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectiv(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectiv GetQueryObjectiv} */
	public static int glGetQueryObjecti(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectiv(id, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectuiv ] ---

	/** JNI method for {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	@JavadocExclude
	public static native void nglGetQueryObjectuiv(int id, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	@JavadocExclude
	public static void nglGetQueryObjectuiv(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectuiv;
		nglGetQueryObjectuiv(id, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br>{@link #GL_QUERY_RESULT QUERY_RESULT}, {@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjectuiv(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	public static void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuiv(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
	public static int glGetQueryObjectui(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectuiv(id, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}