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

/** The core OpenGL 1.5 functionality. */
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
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

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
	public static final int
		GL_BUFFER_MAP_POINTER = 0x88BD;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_SAMPLES_PASSED = 0x8914;

	/** Accepted by the {@code pname} parameter of GetQueryiv. */
	public static final int
		GL_QUERY_COUNTER_BITS = 0x8864,
		GL_CURRENT_QUERY      = 0x8865;

	/** Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv. */
	public static final int
		GL_QUERY_RESULT           = 0x8866,
		GL_QUERY_RESULT_AVAILABLE = 0x8867;

	private GL15() {}

	// --- [ glBindBuffer ] ---

	/** JNI method for {@link #glBindBuffer} */
	public static native void nglBindBuffer(int target, int buffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a named buffer object.
	 *
	 * @param target the target to which the buffer object is bound. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param buffer the name of a buffer object
	 */
	public static void glBindBuffer(int target, int buffer) {
		long __functionAddress = getInstance().glBindBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindBuffer(target, buffer, __functionAddress);
	}

	// --- [ glDeleteBuffers ] ---

	/** JNI method for {@link #glDeleteBuffers} */
	public static native void nglDeleteBuffers(int n, long buffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteBuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes named buffer objects.
	 *
	 * @param n       the number of buffer objects to be deleted
	 * @param buffers an array of buffer objects to be deleted
	 */
	public static void glDeleteBuffers(int n, ByteBuffer buffers) {
		long __functionAddress = getInstance().glDeleteBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffers, n << 2);
		}
		nglDeleteBuffers(n, memAddress(buffers), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteBuffers} */
	public static void glDeleteBuffers(IntBuffer buffers) {
		long __functionAddress = getInstance().glDeleteBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteBuffers(buffers.remaining(), memAddress(buffers), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteBuffers} */
	public static void glDeleteBuffers(int buffer) {
		long __functionAddress = getInstance().glDeleteBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		__buffer.intValue(buffers, buffer);
		nglDeleteBuffers(1, __buffer.address() + buffers, __functionAddress);
	}

	// --- [ glGenBuffers ] ---

	/** JNI method for {@link #glGenBuffers} */
	public static native void nglGenBuffers(int n, long buffers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenBuffers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates buffer object names.
	 *
	 * @param n       the number of buffer object names to be generated
	 * @param buffers an array in which the generated buffer object names are stored
	 */
	public static void glGenBuffers(int n, ByteBuffer buffers) {
		long __functionAddress = getInstance().glGenBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffers, n << 2);
		}
		nglGenBuffers(n, memAddress(buffers), __functionAddress);
	}

	/** Alternative version of: {@link #glGenBuffers} */
	public static void glGenBuffers(IntBuffer buffers) {
		long __functionAddress = getInstance().glGenBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenBuffers(buffers.remaining(), memAddress(buffers), __functionAddress);
	}

	/** Single return value version of: {@link #glGenBuffers} */
	public static int glGenBuffers() {
		long __functionAddress = getInstance().glGenBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		nglGenBuffers(1, __buffer.address() + buffers, __functionAddress);
		return __buffer.intValue(buffers);
	}

	// --- [ glIsBuffer ] ---

	/** JNI method for {@link #glIsBuffer} */
	public static native boolean nglIsBuffer(int buffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a buffer object.
	 *
	 * @param buffer a value that may be the name of a buffer object
	 */
	public static boolean glIsBuffer(int buffer) {
		long __functionAddress = getInstance().glIsBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsBuffer(buffer, __functionAddress);
	}

	// --- [ glBufferData ] ---

	/** JNI method for {@link #glBufferData} */
	public static native void nglBufferData(int target, long size, long data, int usage, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBufferData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates and initializes a buffer object's data store.
	 * <p/>
	 * {@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
	 * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
	 * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
	 * frequency of access may be one of these:
	 * <ul>
	 * 	<li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
	 * 	<li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
	 * 	<li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
	 * </ul>
	 * The nature of access may be one of these:
	 * <ul>
	 * 	<li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
	 * 	<li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
	 * 	<li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
	 * </ul>
	 *
	 * @param target the target buffer object. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param data   a pointer to data that will be copied into the data store for initialization, or NULL if no data is to be copied
	 * @param usage  the expected usage pattern of the data store. One of:<p/>{@link #GL_STREAM_DRAW}, {@link #GL_STREAM_READ}, {@link #GL_STREAM_COPY}, {@link #GL_STATIC_DRAW}, {@link #GL_STATIC_READ}, {@link #GL_STATIC_COPY}, {@link #GL_DYNAMIC_DRAW}, {@link #GL_DYNAMIC_READ}, {@link #GL_DYNAMIC_COPY}
	 */
	public static void glBufferData(int target, long size, ByteBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( data != null ) checkBuffer(data, size);
		}
		nglBufferData(target, size, memAddressSafe(data), usage, __functionAddress);
	}

	/** Alternative version of: {@link #glBufferData} */
	public static void glBufferData(int target, long size, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, size, 0L, usage, __functionAddress);
	}

	/** ByteBuffer version of: {@link #glBufferData} */
	public static void glBufferData(int target, ByteBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, data.remaining(), memAddress(data), usage, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glBufferData} */
	public static void glBufferData(int target, ShortBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, data.remaining() << 1, memAddress(data), usage, __functionAddress);
	}

	/** IntBuffer version of: {@link #glBufferData} */
	public static void glBufferData(int target, IntBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage, __functionAddress);
	}

	/** FloatBuffer version of: {@link #glBufferData} */
	public static void glBufferData(int target, FloatBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, data.remaining() << 2, memAddress(data), usage, __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glBufferData} */
	public static void glBufferData(int target, DoubleBuffer data, int usage) {
		long __functionAddress = getInstance().glBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferData(target, data.remaining() << 3, memAddress(data), usage, __functionAddress);
	}

	// --- [ glBufferSubData ] ---

	/** JNI method for {@link #glBufferSubData} */
	public static native void nglBufferSubData(int target, long offset, long size, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBufferSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Updates a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param size   the size in bytes of the data store region being replaced
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void glBufferSubData(int target, long offset, long size, ByteBuffer data) {
		long __functionAddress = getInstance().glBufferSubData;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, size);
		}
		nglBufferSubData(target, offset, size, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glBufferSubData} */
	public static void glBufferSubData(int target, long offset, ByteBuffer data) {
		long __functionAddress = getInstance().glBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBufferSubData(target, offset, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ glGetBufferSubData ] ---

	/** JNI method for {@link #glGetBufferSubData} */
	public static native void nglGetBufferSubData(int target, long offset, long size, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetBufferSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param size   the size in bytes of the data store region being returned
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void glGetBufferSubData(int target, long offset, long size, ByteBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, size);
		}
		nglGetBufferSubData(target, offset, size, memAddress(data), __functionAddress);
	}

	/** ByteBuffer version of: {@link #glGetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, ByteBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferSubData(target, offset, data.remaining(), memAddress(data), __functionAddress);
	}

	/** ShortBuffer version of: {@link #glGetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, ShortBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferSubData(target, offset, data.remaining() << 1, memAddress(data), __functionAddress);
	}

	/** IntBuffer version of: {@link #glGetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, IntBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glGetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, FloatBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glGetBufferSubData} */
	public static void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
		long __functionAddress = getInstance().glGetBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferSubData(target, offset, data.remaining() << 3, memAddress(data), __functionAddress);
	}

	// --- [ glMapBuffer ] ---

	/** JNI method for {@link #glMapBuffer} */
	public static native long nglMapBuffer(int target, int access, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMapBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Maps a buffer object's data store.
	 * <p/>
	 * <b>LWJGL note</b>: This method comes in 3 flavors:
	 * <ol>
	 * 	<li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteri(int, int)} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
	 * 	<li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteri(int, int)} to retrieve the buffer size and the {@code old_buffer} parameter is reused if the returned size and pointer match the buffer capacity and address, respectively.</li>
	 * 	<li>{@link #glMapBuffer(int, int, int, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if {@code size} and the returned pointer match the buffer capacity and address, respectively. This is the most efficient method.</li>
	 * </ol>
	 *
	 * @param target the target buffer object being mapped. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<p/>{@link #GL_READ_ONLY}, {@link #GL_WRITE_ONLY}, {@link #GL_READ_WRITE}
	 */
	public static ByteBuffer glMapBuffer(int target, int access) {
		long __functionAddress = getInstance().glMapBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglMapBuffer(target, access, __functionAddress);
		return memByteBuffer(__result, glGetBufferParameteri(target, GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapBuffer} */
	public static ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
		long __functionAddress = getInstance().glMapBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglMapBuffer(target, access, __functionAddress);
		int length = glGetBufferParameteri(target, GL_BUFFER_SIZE);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #glMapBuffer} */
	public static ByteBuffer glMapBuffer(int target, int access, int length, ByteBuffer old_buffer) {
		long __functionAddress = getInstance().glMapBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglMapBuffer(target, access, __functionAddress);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ glUnmapBuffer ] ---

	/** JNI method for {@link #glUnmapBuffer} */
	public static native boolean nglUnmapBuffer(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUnmapBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.
	 * <p/>
	 * Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
	 * the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
	 * memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
	 * If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.
	 *
	 * @param target the target buffer object being unmapped. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 */
	public static boolean glUnmapBuffer(int target) {
		long __functionAddress = getInstance().glUnmapBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglUnmapBuffer(target, __functionAddress);
	}

	// --- [ glGetBufferParameteriv ] ---

	/** JNI method for {@link #glGetBufferParameteri(int, int, ByteBuffer)} */
	public static native void nglGetBufferParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetBufferParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param pname  the symbolic name of a buffer object parameter. One of:<p/>{@link #GL_BUFFER_SIZE}, {@link #GL_BUFFER_USAGE}, {@link #GL_BUFFER_ACCESS}, {@link #GL_BUFFER_MAPPED}
	 * @param params the request parameter
	 */
	public static void glGetBufferParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetBufferParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetBufferParameteri(int, int, ByteBuffer)} */
	public static void glGetBufferParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetBufferParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetBufferParameteri(int, int, ByteBuffer)} */
	public static int glGetBufferParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetBufferParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetBufferParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetBufferPointerv ] ---

	/** JNI method for {@link #glGetBufferPointer(int, int, ByteBuffer)} */
	public static native void nglGetBufferPointerv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetBufferPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the pointer to a mapped buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<p/>{@link GL15#GL_ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER}
	 * @param pname  the pointer to be returned. Must be:<p/>{@link #GL_BUFFER_MAP_POINTER}
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void glGetBufferPointer(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetBufferPointerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferPointerv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetBufferPointer(int, int, ByteBuffer)} */
	public static void glGetBufferPointer(int target, int pname, PointerBuffer params) {
		long __functionAddress = getInstance().glGetBufferPointerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetBufferPointerv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetBufferPointer(int, int, ByteBuffer)} */
	public static long glGetBufferPointer(int target, int pname) {
		long __functionAddress = getInstance().glGetBufferPointerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetBufferPointerv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.pointerValue(params);
	}

	// --- [ glGenQueries ] ---

	/** JNI method for {@link #glGenQueries} */
	public static native void nglGenQueries(int n, long ids, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenQueries.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates query object names.
	 *
	 * @param n   the number of query object names to be generated
	 * @param ids an array in which the generated query object names are stored
	 */
	public static void glGenQueries(int n, ByteBuffer ids) {
		long __functionAddress = getInstance().glGenQueries;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ids, n << 2);
		}
		nglGenQueries(n, memAddress(ids), __functionAddress);
	}

	/** Alternative version of: {@link #glGenQueries} */
	public static void glGenQueries(IntBuffer ids) {
		long __functionAddress = getInstance().glGenQueries;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenQueries(ids.remaining(), memAddress(ids), __functionAddress);
	}

	/** Single return value version of: {@link #glGenQueries} */
	public static int glGenQueries() {
		long __functionAddress = getInstance().glGenQueries;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenQueries(1, __buffer.address() + ids, __functionAddress);
		return __buffer.intValue(ids);
	}

	// --- [ glDeleteQueries ] ---

	/** JNI method for {@link #glDeleteQueries} */
	public static native void nglDeleteQueries(int n, long ids, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteQueries.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes named query objects.
	 *
	 * @param n   the number of query objects to be deleted
	 * @param ids an array of query objects to be deleted
	 */
	public static void glDeleteQueries(int n, ByteBuffer ids) {
		long __functionAddress = getInstance().glDeleteQueries;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ids, n << 2);
		}
		nglDeleteQueries(n, memAddress(ids), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteQueries} */
	public static void glDeleteQueries(IntBuffer ids) {
		long __functionAddress = getInstance().glDeleteQueries;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteQueries(ids.remaining(), memAddress(ids), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteQueries} */
	public static void glDeleteQueries(int id) {
		long __functionAddress = getInstance().glDeleteQueries;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		__buffer.intValue(ids, id);
		nglDeleteQueries(1, __buffer.address() + ids, __functionAddress);
	}

	// --- [ glIsQuery ] ---

	/** JNI method for {@link #glIsQuery} */
	public static native boolean nglIsQuery(int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsQuery.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determine if a name corresponds to a query object.
	 *
	 * @param id a value that may be the name of a query object
	 */
	public static boolean glIsQuery(int id) {
		long __functionAddress = getInstance().glIsQuery;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsQuery(id, __functionAddress);
	}

	// --- [ glBeginQuery ] ---

	/** JNI method for {@link #glBeginQuery} */
	public static native void nglBeginQuery(int target, int id, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginQuery.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Creates a query object and makes it active.
	 *
	 * @param target the target type of query object established. One of:<p/>{@link GL15#GL_SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param id     the name of a query object
	 */
	public static void glBeginQuery(int target, int id) {
		long __functionAddress = getInstance().glBeginQuery;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBeginQuery(target, id, __functionAddress);
	}

	// --- [ glEndQuery ] ---

	/** JNI method for {@link #glEndQuery} */
	public static native void nglEndQuery(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBeginQuery.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.
	 *
	 * @param target the query object target. One of:<p/>{@link GL15#GL_SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE}
	 */
	public static void glEndQuery(int target) {
		long __functionAddress = getInstance().glEndQuery;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndQuery(target, __functionAddress);
	}

	// --- [ glGetQueryiv ] ---

	/** JNI method for {@link #glGetQueryi(int, int, ByteBuffer)} */
	public static native void nglGetQueryiv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQuery.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns parameters of a query object target.
	 *
	 * @param target the query object target. One of:<p/>{@link GL15#GL_SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param pname  the symbolic name of a query object target parameter. One of:<p/>{@link #GL_QUERY_COUNTER_BITS}, {@link #GL_CURRENT_QUERY}
	 * @param params the requested data
	 */
	public static void glGetQueryi(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetQueryiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryi(int, int, ByteBuffer)} */
	public static void glGetQuery(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetQueryiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryiv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryi(int, int, ByteBuffer)} */
	public static int glGetQueryi(int target, int pname) {
		long __functionAddress = getInstance().glGetQueryiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryiv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectiv ] ---

	/** JNI method for {@link #glGetQueryObjecti(int, int, ByteBuffer)} */
	public static native void nglGetQueryObjectiv(int id, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQueryObject.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the integer value of a query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<p/>{@link #GL_QUERY_RESULT}, {@link #GL_QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjecti(int id, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetQueryObjectiv(id, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryObjecti(int, int, ByteBuffer)} */
	public static void glGetQueryObject(int id, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryObjectiv(id, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryObjecti(int, int, ByteBuffer)} */
	public static int glGetQueryObjecti(int id, int pname) {
		long __functionAddress = getInstance().glGetQueryObjectiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectiv(id, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectuiv ] ---

	/** JNI method for {@link #glGetQueryObjectui(int, int, ByteBuffer)} */
	public static native void nglGetQueryObjectuiv(int id, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQueryObject.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned version of {@link #glGetQueryObjecti(int, int, ByteBuffer)}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<p/>{@link #GL_QUERY_RESULT}, {@link #GL_QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjectui(int id, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetQueryObjectuiv(id, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryObjectui(int, int, ByteBuffer)} */
	public static void glGetQueryObjectu(int id, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryObjectuiv(id, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryObjectui(int, int, ByteBuffer)} */
	public static int glGetQueryObjectui(int id, int pname) {
		long __functionAddress = getInstance().glGetQueryObjectuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectuiv(id, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL15;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL15") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glBindBuffer) &&
			GL.isFunctionSupported(funcs.glDeleteBuffers) &&
			GL.isFunctionSupported(funcs.glGenBuffers) &&
			GL.isFunctionSupported(funcs.glIsBuffer) &&
			GL.isFunctionSupported(funcs.glBufferData) &&
			GL.isFunctionSupported(funcs.glBufferSubData) &&
			GL.isFunctionSupported(funcs.glGetBufferSubData) &&
			GL.isFunctionSupported(funcs.glMapBuffer) &&
			GL.isFunctionSupported(funcs.glUnmapBuffer) &&
			GL.isFunctionSupported(funcs.glGetBufferParameteriv) &&
			GL.isFunctionSupported(funcs.glGetBufferPointerv) &&
			GL.isFunctionSupported(funcs.glGenQueries) &&
			GL.isFunctionSupported(funcs.glDeleteQueries) &&
			GL.isFunctionSupported(funcs.glIsQuery) &&
			GL.isFunctionSupported(funcs.glBeginQuery) &&
			GL.isFunctionSupported(funcs.glEndQuery) &&
			GL.isFunctionSupported(funcs.glGetQueryiv) &&
			GL.isFunctionSupported(funcs.glGetQueryObjectiv) &&
			GL.isFunctionSupported(funcs.glGetQueryObjectuiv);

		return GL.checkExtension("OpenGL15", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL15}. */
	public static final class Functions implements FunctionMap {

		public final long
			glBindBuffer,
			glDeleteBuffers,
			glGenBuffers,
			glIsBuffer,
			glBufferData,
			glBufferSubData,
			glGetBufferSubData,
			glMapBuffer,
			glUnmapBuffer,
			glGetBufferParameteriv,
			glGetBufferPointerv,
			glGenQueries,
			glDeleteQueries,
			glIsQuery,
			glBeginQuery,
			glEndQuery,
			glGetQueryiv,
			glGetQueryObjectiv,
			glGetQueryObjectuiv;

		public Functions(FunctionProvider provider) {
			glBindBuffer = provider.getFunctionAddress("glBindBuffer");
			glDeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
			glGenBuffers = provider.getFunctionAddress("glGenBuffers");
			glIsBuffer = provider.getFunctionAddress("glIsBuffer");
			glBufferData = provider.getFunctionAddress("glBufferData");
			glBufferSubData = provider.getFunctionAddress("glBufferSubData");
			glGetBufferSubData = provider.getFunctionAddress("glGetBufferSubData");
			glMapBuffer = provider.getFunctionAddress("glMapBuffer");
			glUnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
			glGetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
			glGetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
			glGenQueries = provider.getFunctionAddress("glGenQueries");
			glDeleteQueries = provider.getFunctionAddress("glDeleteQueries");
			glIsQuery = provider.getFunctionAddress("glIsQuery");
			glBeginQuery = provider.getFunctionAddress("glBeginQuery");
			glEndQuery = provider.getFunctionAddress("glEndQuery");
			glGetQueryiv = provider.getFunctionAddress("glGetQueryiv");
			glGetQueryObjectiv = provider.getFunctionAddress("glGetQueryObjectiv");
			glGetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
		}

	}

}