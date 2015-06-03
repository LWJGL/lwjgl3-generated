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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_buffer_object.txt">ARB_vertex_buffer_object</a> extension.
 * 
 * <p>This extension defines an interface that allows various types of data (especially vertex array data) to be cached in high-performance graphics memory on
 * the server, thereby increasing the rate of data transfers.</p>
 * 
 * <p>Chunks of data are encapsulated within "buffer objects", which conceptually are nothing more than arrays of bytes, just like any chunk of memory. An API
 * is provided whereby applications can read from or write to buffers, either via the GL itself ({@link #glBufferDataARB BufferDataARB}, {@link #glBufferSubDataARB BufferSubDataARB},
 * {@link #glGetBufferSubDataARB GetBufferSubDataARB}) or via a pointer to the memory.</p>
 * 
 * <p>The latter technique is known as "mapping" a buffer.  When an application maps a buffer, it is given a pointer to the memory. When the application
 * finishes reading from or writing to the memory, it is required to "unmap" the buffer before it is once again permitted to use that buffer as a GL data
 * source or sink. Mapping often allows applications to eliminate an extra data copy otherwise required to access the buffer, thereby enhancing
 * performance. In addition, requiring that applications unmap the buffer to use it as a data source or sink ensures that certain classes of latent
 * synchronization bugs cannot occur.</p>
 * 
 * <p>Although this extension only defines hooks for buffer objects to be used with OpenGL's vertex array APIs, the API defined in this extension permits
 * buffer objects to be used as either data sources or sinks for any GL command that takes a pointer as an argument. Normally, in the absence of this
 * extension, a pointer passed into the GL is simply a pointer to the user's data. This extension defines a mechanism whereby this pointer is used not as a
 * pointer to the data itself, but as an offset into a currently bound buffer object. The buffer object ID zero is reserved, and when buffer object zero is
 * bound to a given target, the commands affected by that buffer binding behave normally. When a nonzero buffer ID is bound, then the pointer represents an
 * offset.</p>
 * 
 * <p>In the case of vertex arrays, this extension defines not merely one binding for all attributes, but a separate binding for each individual attribute. As
 * a result, applications can source their attributes from multiple buffers. An application might, for example, have a model with constant texture
 * coordinates and variable geometry. The texture coordinates might be retrieved from a buffer object with the usage mode "STATIC_DRAW", indicating to the
 * GL that the application does not expect to update the contents of the buffer frequently or even at all, while the vertices might be retrieved from a
 * buffer object with the usage mode "STREAM_DRAW", indicating that the vertices will be updated on a regular basis.</p>
 * 
 * <p>In addition, a binding is defined by which applications can source index data (as used by {@link GL11#glDrawElements DrawElements}, {@link GL12#glDrawRangeElements DrawRangeElements}, and
 * {@link GL14#glMultiDrawElements MultiDrawElements}) from a buffer object. On some platforms, this enables very large models to be rendered with no more than a few small commands
 * to the graphics device.</p>
 * 
 * <p>It is expected that a future extension will allow sourcing pixel data from and writing pixel data to a buffer object.</p>
 * 
 * <p>Promoted to core in {@link GL15 OpenGL 1.5}.</p>
 */
public final class ARBVertexBufferObject {

	/**
	 * Accepted by the {@code target} parameters of BindBufferARB, BufferDataARB, BufferSubDataARB, MapBufferARB, UnmapBufferARB, GetBufferSubDataARB,
	 * GetBufferParameterivARB, and GetBufferPointervARB.
	 */
	public static final int
		GL_ARRAY_BUFFER_ARB         = 0x8892,
		GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_ARRAY_BUFFER_BINDING_ARB                 = 0x8894,
		GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB         = 0x8895,
		GL_VERTEX_ARRAY_BUFFER_BINDING_ARB          = 0x8896,
		GL_NORMAL_ARRAY_BUFFER_BINDING_ARB          = 0x8897,
		GL_COLOR_ARRAY_BUFFER_BINDING_ARB           = 0x8898,
		GL_INDEX_ARRAY_BUFFER_BINDING_ARB           = 0x8899,
		GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB   = 0x889A,
		GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB       = 0x889B,
		GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C,
		GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB  = 0x889D,
		GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB          = 0x889E;

	/** Accepted by the {@code pname} parameter of GetVertexAttribivARB. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;

	/** Accepted by the {@code usage} parameter of BufferDataARB. */
	public static final int
		GL_STREAM_DRAW_ARB  = 0x88E0,
		GL_STREAM_READ_ARB  = 0x88E1,
		GL_STREAM_COPY_ARB  = 0x88E2,
		GL_STATIC_DRAW_ARB  = 0x88E4,
		GL_STATIC_READ_ARB  = 0x88E5,
		GL_STATIC_COPY_ARB  = 0x88E6,
		GL_DYNAMIC_DRAW_ARB = 0x88E8,
		GL_DYNAMIC_READ_ARB = 0x88E9,
		GL_DYNAMIC_COPY_ARB = 0x88EA;

	/** Accepted by the {@code access} parameter of MapBufferARB. */
	public static final int
		GL_READ_ONLY_ARB  = 0x88B8,
		GL_WRITE_ONLY_ARB = 0x88B9,
		GL_READ_WRITE_ARB = 0x88BA;

	/** Accepted by the {@code pname} parameter of GetBufferParameterivARB. */
	public static final int
		GL_BUFFER_SIZE_ARB   = 0x8764,
		GL_BUFFER_USAGE_ARB  = 0x8765,
		GL_BUFFER_ACCESS_ARB = 0x88BB,
		GL_BUFFER_MAPPED_ARB = 0x88BC;

	/** Accepted by the {@code pname} parameter of GetBufferPointervARB. */
	public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;

	/** Function address. */
	@JavadocExclude
	public final long
		BindBufferARB,
		DeleteBuffersARB,
		GenBuffersARB,
		IsBufferARB,
		BufferDataARB,
		BufferSubDataARB,
		GetBufferSubDataARB,
		MapBufferARB,
		UnmapBufferARB,
		GetBufferParameterivARB,
		GetBufferPointervARB;

	@JavadocExclude
	public ARBVertexBufferObject(FunctionProvider provider) {
		BindBufferARB = provider.getFunctionAddress("glBindBufferARB");
		DeleteBuffersARB = provider.getFunctionAddress("glDeleteBuffersARB");
		GenBuffersARB = provider.getFunctionAddress("glGenBuffersARB");
		IsBufferARB = provider.getFunctionAddress("glIsBufferARB");
		BufferDataARB = provider.getFunctionAddress("glBufferDataARB");
		BufferSubDataARB = provider.getFunctionAddress("glBufferSubDataARB");
		GetBufferSubDataARB = provider.getFunctionAddress("glGetBufferSubDataARB");
		MapBufferARB = provider.getFunctionAddress("glMapBufferARB");
		UnmapBufferARB = provider.getFunctionAddress("glUnmapBufferARB");
		GetBufferParameterivARB = provider.getFunctionAddress("glGetBufferParameterivARB");
		GetBufferPointervARB = provider.getFunctionAddress("glGetBufferPointervARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexBufferObject} instance for the current context. */
	public static ARBVertexBufferObject getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBVertexBufferObject);
	}

	static ARBVertexBufferObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_buffer_object") ) return null;

		ARBVertexBufferObject funcs = new ARBVertexBufferObject(provider);

		boolean supported = checkFunctions(
			funcs.BindBufferARB, funcs.DeleteBuffersARB, funcs.GenBuffersARB, funcs.IsBufferARB, funcs.BufferDataARB, funcs.BufferSubDataARB, 
			funcs.GetBufferSubDataARB, funcs.MapBufferARB, funcs.UnmapBufferARB, funcs.GetBufferParameterivARB, funcs.GetBufferPointervARB
		);

		return GL.checkExtension("GL_ARB_vertex_buffer_object", funcs, supported);
	}

	// --- [ glBindBufferARB ] ---

	/** JNI method for {@link #glBindBufferARB BindBufferARB} */
	@JavadocExclude
	public static native void nglBindBufferARB(int target, int buffer, long __functionAddress);

	/**
	 * Binds a named buffer object.
	 *
	 * @param target the target to which the buffer object is bound. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param buffer the name of a buffer object
	 */
	public static void glBindBufferARB(int target, int buffer) {
		long __functionAddress = getInstance().BindBufferARB;
		nglBindBufferARB(target, buffer, __functionAddress);
	}

	// --- [ glDeleteBuffersARB ] ---

	/** JNI method for {@link #glDeleteBuffersARB DeleteBuffersARB} */
	@JavadocExclude
	public static native void nglDeleteBuffersARB(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteBuffersARB DeleteBuffersARB} */
	@JavadocExclude
	public static void nglDeleteBuffersARB(int n, long buffers) {
		long __functionAddress = getInstance().DeleteBuffersARB;
		nglDeleteBuffersARB(n, buffers, __functionAddress);
	}

	/**
	 * Deletes named buffer objects.
	 *
	 * @param n       the number of buffer objects to be deleted
	 * @param buffers an array of buffer objects to be deleted
	 */
	public static void glDeleteBuffersARB(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglDeleteBuffersARB(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glDeleteBuffersARB DeleteBuffersARB} */
	public static void glDeleteBuffersARB(IntBuffer buffers) {
		nglDeleteBuffersARB(buffers.remaining(), memAddress(buffers));
	}

	/** Single value version of: {@link #glDeleteBuffersARB DeleteBuffersARB} */
	public static void glDeleteBuffersARB(int buffer) {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam(buffer);
		nglDeleteBuffersARB(1, __buffer.address(buffers));
	}

	// --- [ glGenBuffersARB ] ---

	/** JNI method for {@link #glGenBuffersARB GenBuffersARB} */
	@JavadocExclude
	public static native void nglGenBuffersARB(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glGenBuffersARB GenBuffersARB} */
	@JavadocExclude
	public static void nglGenBuffersARB(int n, long buffers) {
		long __functionAddress = getInstance().GenBuffersARB;
		nglGenBuffersARB(n, buffers, __functionAddress);
	}

	/**
	 * Generates buffer object names.
	 *
	 * @param n       the number of buffer object names to be generated
	 * @param buffers a buffer in which the generated buffer object names are stored
	 */
	public static void glGenBuffersARB(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglGenBuffersARB(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glGenBuffersARB GenBuffersARB} */
	public static void glGenBuffersARB(IntBuffer buffers) {
		nglGenBuffersARB(buffers.remaining(), memAddress(buffers));
	}

	/** Single return value version of: {@link #glGenBuffersARB GenBuffersARB} */
	public static int glGenBuffersARB() {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		nglGenBuffersARB(1, __buffer.address(buffers));
		return __buffer.intValue(buffers);
	}

	// --- [ glIsBufferARB ] ---

	/** JNI method for {@link #glIsBufferARB IsBufferARB} */
	@JavadocExclude
	public static native boolean nglIsBufferARB(int buffer, long __functionAddress);

	/**
	 * Determines if a name corresponds to a buffer object.
	 *
	 * @param buffer a value that may be the name of a buffer object
	 */
	public static boolean glIsBufferARB(int buffer) {
		long __functionAddress = getInstance().IsBufferARB;
		return nglIsBufferARB(buffer, __functionAddress);
	}

	// --- [ glBufferDataARB ] ---

	/** JNI method for {@link #glBufferDataARB BufferDataARB} */
	@JavadocExclude
	public static native void nglBufferDataARB(int target, long size, long data, int usage, long __functionAddress);

	/** Unsafe version of {@link #glBufferDataARB BufferDataARB} */
	@JavadocExclude
	public static void nglBufferDataARB(int target, long size, long data, int usage) {
		long __functionAddress = getInstance().BufferDataARB;
		nglBufferDataARB(target, size, data, usage, __functionAddress);
	}

	/**
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
	 * @param target the target buffer object. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param data   a pointer to data that will be copied into the data store for initialization, or NULL if no data is to be copied
	 * @param usage  the expected usage pattern of the data store. One of:<br>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}, {@link #GL_STREAM_READ_ARB STREAM_READ_ARB}, {@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}, {@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}, {@link #GL_STATIC_READ_ARB STATIC_READ_ARB}, {@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}, {@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}, {@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}, {@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}
	 */
	public static void glBufferDataARB(int target, long size, ByteBuffer data, int usage) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglBufferDataARB(target, size, memAddressSafe(data), usage);
	}

	/** Alternative version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, long size, int usage) {
		nglBufferDataARB(target, size, 0L, usage);
	}

	/** ByteBuffer version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, ByteBuffer data, int usage) {
		nglBufferDataARB(target, data.remaining(), memAddress(data), usage);
	}

	/** ShortBuffer version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, ShortBuffer data, int usage) {
		nglBufferDataARB(target, data.remaining() << 1, memAddress(data), usage);
	}

	/** IntBuffer version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, IntBuffer data, int usage) {
		nglBufferDataARB(target, data.remaining() << 2, memAddress(data), usage);
	}

	/** FloatBuffer version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, FloatBuffer data, int usage) {
		nglBufferDataARB(target, data.remaining() << 2, memAddress(data), usage);
	}

	/** DoubleBuffer version of: {@link #glBufferDataARB BufferDataARB} */
	public static void glBufferDataARB(int target, DoubleBuffer data, int usage) {
		nglBufferDataARB(target, data.remaining() << 3, memAddress(data), usage);
	}

	// --- [ glBufferSubDataARB ] ---

	/** JNI method for {@link #glBufferSubDataARB BufferSubDataARB} */
	@JavadocExclude
	public static native void nglBufferSubDataARB(int target, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glBufferSubDataARB BufferSubDataARB} */
	@JavadocExclude
	public static void nglBufferSubDataARB(int target, long offset, long size, long data) {
		long __functionAddress = getInstance().BufferSubDataARB;
		nglBufferSubDataARB(target, offset, size, data, __functionAddress);
	}

	/**
	 * Updates a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param size   the size in bytes of the data store region being replaced
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void glBufferSubDataARB(int target, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglBufferSubDataARB(target, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #glBufferSubDataARB BufferSubDataARB} */
	public static void glBufferSubDataARB(int target, long offset, ByteBuffer data) {
		nglBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
	}

	// --- [ glGetBufferSubDataARB ] ---

	/** JNI method for {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	@JavadocExclude
	public static native void nglGetBufferSubDataARB(int target, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	@JavadocExclude
	public static void nglGetBufferSubDataARB(int target, long offset, long size, long data) {
		long __functionAddress = getInstance().GetBufferSubDataARB;
		nglGetBufferSubDataARB(target, offset, size, data, __functionAddress);
	}

	/**
	 * Returns a subset of a buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param size   the size in bytes of the data store region being returned
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void glGetBufferSubDataARB(int target, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglGetBufferSubDataARB(target, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	public static void glGetBufferSubDataARB(int target, long offset, ByteBuffer data) {
		nglGetBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	public static void glGetBufferSubDataARB(int target, long offset, ShortBuffer data) {
		nglGetBufferSubDataARB(target, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	public static void glGetBufferSubDataARB(int target, long offset, IntBuffer data) {
		nglGetBufferSubDataARB(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	public static void glGetBufferSubDataARB(int target, long offset, FloatBuffer data) {
		nglGetBufferSubDataARB(target, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
	public static void glGetBufferSubDataARB(int target, long offset, DoubleBuffer data) {
		nglGetBufferSubDataARB(target, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glMapBufferARB ] ---

	/** JNI method for {@link #glMapBufferARB MapBufferARB} */
	@JavadocExclude
	public static native long nglMapBufferARB(int target, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapBufferARB MapBufferARB} */
	@JavadocExclude
	public static long nglMapBufferARB(int target, int access) {
		long __functionAddress = getInstance().MapBufferARB;
		return nglMapBufferARB(target, access, __functionAddress);
	}

	/**
	 * Maps a buffer object's data store.
	 * 
	 * <p><b>LWJGL note</b>: This method comes in 3 flavors:
	 * <ol>
	 * <li>{@link #glMapBufferARB(int, int)} - Calls {@link #glGetBufferParameteriARB GetBufferParameteriARB} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
	 * <li>{@link #glMapBufferARB(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriARB GetBufferParameteriARB} to retrieve the buffer size and the {@code old_buffer} parameter is reused if the returned size and pointer match the buffer capacity and address, respectively.</li>
	 * <li>{@link #glMapBufferARB(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if {@code size} and the returned pointer match the buffer capacity and address, respectively. This is the most efficient method.</li>
	 * </ol></p>
	 *
	 * @param target the target buffer object being mapped. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br>{@link #GL_READ_ONLY_ARB READ_ONLY_ARB}, {@link #GL_WRITE_ONLY_ARB WRITE_ONLY_ARB}, {@link #GL_READ_WRITE_ARB READ_WRITE_ARB}
	 */
	public static ByteBuffer glMapBufferARB(int target, int access) {
		long __result = nglMapBufferARB(target, access);
		return memByteBuffer(__result, (int)glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB));
	}

	/** Alternative version of: {@link #glMapBufferARB MapBufferARB} */
	public static ByteBuffer glMapBufferARB(int target, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferARB(target, access);
		int length = glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #glMapBufferARB MapBufferARB} */
	public static ByteBuffer glMapBufferARB(int target, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapBufferARB(target, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glUnmapBufferARB ] ---

	/** JNI method for {@link #glUnmapBufferARB UnmapBufferARB} */
	@JavadocExclude
	public static native boolean nglUnmapBufferARB(int target, long __functionAddress);

	/**
	 * Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.
	 * 
	 * <p>Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
	 * the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
	 * memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
	 * If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.</p>
	 *
	 * @param target the target buffer object being unmapped. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 */
	public static boolean glUnmapBufferARB(int target) {
		long __functionAddress = getInstance().UnmapBufferARB;
		return nglUnmapBufferARB(target, __functionAddress);
	}

	// --- [ glGetBufferParameterivARB ] ---

	/** JNI method for {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
	@JavadocExclude
	public static native void nglGetBufferParameterivARB(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
	@JavadocExclude
	public static void nglGetBufferParameterivARB(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferParameterivARB;
		nglGetBufferParameterivARB(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the value of a buffer object parameter.
	 *
	 * @param target the target buffer object. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}, {@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}, {@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}, {@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}, {@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}, {@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}, {@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}, {@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}, {@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}
	 * @param params the requested parameter
	 */
	public static void glGetBufferParameterivARB(int target, int pname, ByteBuffer params) {
		nglGetBufferParameterivARB(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
	public static void glGetBufferParameterivARB(int target, int pname, IntBuffer params) {
		nglGetBufferParameterivARB(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
	public static int glGetBufferParameteriARB(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetBufferParameterivARB(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetBufferPointervARB ] ---

	/** JNI method for {@link #glGetBufferPointervARB GetBufferPointervARB} */
	@JavadocExclude
	public static native void nglGetBufferPointervARB(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferPointervARB GetBufferPointervARB} */
	@JavadocExclude
	public static void nglGetBufferPointervARB(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferPointervARB;
		nglGetBufferPointervARB(target, pname, params, __functionAddress);
	}

	/**
	 * Returns the pointer to a mapped buffer object's data store.
	 *
	 * @param target the target buffer object. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param pname  the pointer to be returned. Must be:<br>{@link #GL_BUFFER_MAP_POINTER_ARB BUFFER_MAP_POINTER_ARB}
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void glGetBufferPointervARB(int target, int pname, ByteBuffer params) {
		nglGetBufferPointervARB(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferPointervARB GetBufferPointervARB} */
	public static void glGetBufferPointervARB(int target, int pname, PointerBuffer params) {
		nglGetBufferPointervARB(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferPointervARB GetBufferPointervARB} */
	public static long glGetBufferPointerARB(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetBufferPointervARB(target, pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

}