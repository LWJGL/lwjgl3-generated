/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 1.5 functionality.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/vertex_buffer_object.txt">ARB_vertex_buffer_object</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/ARB/occlusion_query.txt">ARB_occlusion_query</a></li>
 * <li><a target="_blank" href="http://www.opengl.org/registry/specs/EXT/shadow_funcs.txt">EXT_shadow_funcs</a></li>
 * </ul>
 */
public class GL15 {

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

    static { GL.initialize(); }

    protected GL15() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glBindBuffer, caps.glDeleteBuffers, caps.glGenBuffers, caps.glIsBuffer, caps.glBufferData, caps.glBufferSubData, caps.glGetBufferSubData, 
            caps.glMapBuffer, caps.glUnmapBuffer, caps.glGetBufferParameteriv, caps.glGetBufferPointerv, caps.glGenQueries, caps.glDeleteQueries, 
            caps.glIsQuery, caps.glBeginQuery, caps.glEndQuery, caps.glGetQueryiv, caps.glGetQueryObjectiv, caps.glGetQueryObjectuiv
        );
    }

    // --- [ glBindBuffer ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBindBuffer">Reference Page</a></p>
     * 
     * Binds a named buffer object.
     *
     * @param target the target to which the buffer object is bound. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param buffer the name of a buffer object
     */
    public static native void glBindBuffer(int target, int buffer);

    // --- [ glDeleteBuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteBuffers DeleteBuffers}
     *
     * @param n the number of buffer objects to be deleted
     */
    public static native void nglDeleteBuffers(int n, long buffers);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteBuffers">Reference Page</a></p>
     * 
     * Deletes named buffer objects.
     *
     * @param buffers an array of buffer objects to be deleted
     */
    public static void glDeleteBuffers(IntBuffer buffers) {
        nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteBuffers">Reference Page</a></p>
     * 
     * Deletes named buffer objects.
     */
    public static void glDeleteBuffers(int buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.ints(buffer);
            nglDeleteBuffers(1, memAddress(buffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenBuffers ] ---

    /**
     * Unsafe version of: {@link #glGenBuffers GenBuffers}
     *
     * @param n the number of buffer object names to be generated
     */
    public static native void nglGenBuffers(int n, long buffers);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenBuffers">Reference Page</a></p>
     * 
     * Generates buffer object names.
     *
     * @param buffers a buffer in which the generated buffer object names are stored
     */
    public static void glGenBuffers(IntBuffer buffers) {
        nglGenBuffers(buffers.remaining(), memAddress(buffers));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenBuffers">Reference Page</a></p>
     * 
     * Generates buffer object names.
     */
    public static int glGenBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglGenBuffers(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsBuffer ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glIsBuffer">Reference Page</a></p>
     * 
     * Determines if a name corresponds to a buffer object.
     *
     * @param buffer a value that may be the name of a buffer object
     */
    public static native boolean glIsBuffer(int buffer);

    // --- [ glBufferData ] ---

    /**
     * Unsafe version of: {@link #glBufferData BufferData}
     *
     * @param size the size in bytes of the buffer object's new data store
     */
    public static native void nglBufferData(int target, long size, long data, int usage);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param size   the size in bytes of the buffer object's new data store
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, long size, int usage) {
        nglBufferData(target, size, NULL, usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, ByteBuffer data, int usage) {
        nglBufferData(target, data.remaining(), memAddress(data), usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, ShortBuffer data, int usage) {
        nglBufferData(target, data.remaining() << 1, memAddress(data), usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, IntBuffer data, int usage) {
        nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, FloatBuffer data, int usage) {
        nglBufferData(target, data.remaining() << 2, memAddress(data), usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link #GL_STREAM_READ STREAM_READ}</td><td>{@link #GL_STREAM_COPY STREAM_COPY}</td><td>{@link #GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link #GL_STATIC_READ STATIC_READ}</td><td>{@link #GL_STATIC_COPY STATIC_COPY}</td><td>{@link #GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link #GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link #GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glBufferData(int target, DoubleBuffer data, int usage) {
        nglBufferData(target, data.remaining() << 3, memAddress(data), usage);
    }

    // --- [ glBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glBufferSubData BufferSubData}
     *
     * @param size the size in bytes of the data store region being replaced
     */
    public static native void nglBufferSubData(int target, long offset, long size, long data);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubData(int target, long offset, ByteBuffer data) {
        nglBufferSubData(target, offset, data.remaining(), memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubData(int target, long offset, ShortBuffer data) {
        nglBufferSubData(target, offset, data.remaining() << 1, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubData(int target, long offset, IntBuffer data) {
        nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubData(int target, long offset, FloatBuffer data) {
        nglBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubData(int target, long offset, DoubleBuffer data) {
        nglBufferSubData(target, offset, data.remaining() << 3, memAddress(data));
    }

    // --- [ glGetBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glGetBufferSubData GetBufferSubData}
     *
     * @param size the size in bytes of the data store region being returned
     */
    public static native void nglGetBufferSubData(int target, long offset, long size, long data);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining(), memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining() << 1, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubData(int target, long offset, IntBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining() << 2, memAddress(data));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining() << 3, memAddress(data));
    }

    // --- [ glMapBuffer ] ---

    /** Unsafe version of: {@link #glMapBuffer MapBuffer} */
    public static native long nglMapBuffer(int target, int access);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glMapBuffer">Reference Page</a></p>
     * 
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY READ_ONLY}</td><td>{@link #GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link #GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    public static ByteBuffer glMapBuffer(int target, int access) {
        long __result = nglMapBuffer(target, access);
        return memByteBuffer(__result, glGetBufferParameteri(target, GL_BUFFER_SIZE));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glMapBuffer">Reference Page</a></p>
     * 
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY READ_ONLY}</td><td>{@link #GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link #GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    public static ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        long __result = nglMapBuffer(target, access);
        int length = glGetBufferParameteri(target, GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glMapBuffer">Reference Page</a></p>
     * 
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY READ_ONLY}</td><td>{@link #GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link #GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    public static ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        long __result = nglMapBuffer(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBuffer ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glUnmapBuffer">Reference Page</a></p>
     * 
     * Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.
     * 
     * <p>Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
     * the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
     * memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
     * If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.</p>
     *
     * @param target the target buffer object being unmapped. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     */
    public static native boolean glUnmapBuffer(int target);

    // --- [ glGetBufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetBufferParameteriv GetBufferParameteriv} */
    public static native void nglGetBufferParameteriv(int target, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferParameter">Reference Page</a></p>
     * 
     * Returns the value of a buffer object parameter.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link #GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link #GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link #GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link #GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     */
    public static void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameteriv(target, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferParameter">Reference Page</a></p>
     * 
     * Returns the value of a buffer object parameter.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link #GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link #GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link #GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link #GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     */
    public static int glGetBufferParameteri(int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetBufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferPointerv ] ---

    /** Unsafe version of: {@link #glGetBufferPointerv GetBufferPointerv} */
    public static native void nglGetBufferPointerv(int target, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferPointerv">Reference Page</a></p>
     * 
     * Returns the pointer to a mapped buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link #GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     * @param params the pointer value specified by {@code pname}
     */
    public static void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointerv(target, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferPointerv">Reference Page</a></p>
     * 
     * Returns the pointer to a mapped buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link #GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link #GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link #GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     */
    public static long glGetBufferPointer(int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointerv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenQueries ] ---

    /**
     * Unsafe version of: {@link #glGenQueries GenQueries}
     *
     * @param n the number of query object names to be generated
     */
    public static native void nglGenQueries(int n, long ids);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenQueries">Reference Page</a></p>
     * 
     * Generates query object names.
     *
     * @param ids a buffer in which the generated query object names are stored
     */
    public static void glGenQueries(IntBuffer ids) {
        nglGenQueries(ids.remaining(), memAddress(ids));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenQueries">Reference Page</a></p>
     * 
     * Generates query object names.
     */
    public static int glGenQueries() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueries(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueries ] ---

    /**
     * Unsafe version of: {@link #glDeleteQueries DeleteQueries}
     *
     * @param n the number of query objects to be deleted
     */
    public static native void nglDeleteQueries(int n, long ids);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteQueries">Reference Page</a></p>
     * 
     * Deletes named query objects.
     *
     * @param ids an array of query objects to be deleted
     */
    public static void glDeleteQueries(IntBuffer ids) {
        nglDeleteQueries(ids.remaining(), memAddress(ids));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteQueries">Reference Page</a></p>
     * 
     * Deletes named query objects.
     */
    public static void glDeleteQueries(int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueries(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQuery ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glIsQuery">Reference Page</a></p>
     * 
     * Determine if a name corresponds to a query object.
     *
     * @param id a value that may be the name of a query object
     */
    public static native boolean glIsQuery(int id);

    // --- [ glBeginQuery ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBeginQuery">Reference Page</a></p>
     * 
     * Creates a query object and makes it active.
     *
     * @param target the target type of query object established. One of:<br><table><tr><td>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param id     the name of a query object
     */
    public static native void glBeginQuery(int target, int id);

    // --- [ glEndQuery ] ---

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glEndQuery">Reference Page</a></p>
     * 
     * Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.
     *
     * @param target the query object target. One of:<br><table><tr><td>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     */
    public static native void glEndQuery(int target);

    // --- [ glGetQueryiv ] ---

    /** Unsafe version of: {@link #glGetQueryiv GetQueryiv} */
    public static native void nglGetQueryiv(int target, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQuery">Reference Page</a></p>
     * 
     * Returns parameters of a query object target.
     *
     * @param target the query object target. One of:<br><table><tr><td>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param pname  the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link #GL_QUERY_COUNTER_BITS QUERY_COUNTER_BITS}</td><td>{@link #GL_CURRENT_QUERY CURRENT_QUERY}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryiv(int target, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryiv(target, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQuery">Reference Page</a></p>
     * 
     * Returns parameters of a query object target.
     *
     * @param target the query object target. One of:<br><table><tr><td>{@link #GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param pname  the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link #GL_QUERY_COUNTER_BITS QUERY_COUNTER_BITS}</td><td>{@link #GL_CURRENT_QUERY CURRENT_QUERY}</td></tr></table>
     */
    public static int glGetQueryi(int target, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectiv ] ---

    /** Unsafe version of: {@link #glGetQueryObjectiv GetQueryObjectiv} */
    public static native void nglGetQueryObjectiv(int id, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Returns the integer value of a query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectiv(id, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Returns the integer value of a query object parameter.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     */
    public static int glGetQueryObjecti(int id, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectiv(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuiv ] ---

    /** Unsafe version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv} */
    public static native void nglGetQueryObjectuiv(int id, int pname, long params);

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuiv(id, pname, memAddress(params));
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     */
    public static int glGetQueryObjectui(int id, int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuiv(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteBuffers">Reference Page</a></p>
     * 
     * Array version of: {@link #glDeleteBuffers DeleteBuffers}
     */
    public static void glDeleteBuffers(int[] buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, buffers.length, buffers);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenBuffers">Reference Page</a></p>
     * 
     * Array version of: {@link #glGenBuffers GenBuffers}
     */
    public static void glGenBuffers(int[] buffers) {
        long __functionAddress = GL.getICD().glGenBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, buffers.length, buffers);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferData BufferData}
     */
    public static void glBufferData(int target, short[] data, int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, target, (long)(data.length << 1), data, usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferData BufferData}
     */
    public static void glBufferData(int target, int[] data, int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, target, (long)(data.length << 2), data, usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferData BufferData}
     */
    public static void glBufferData(int target, float[] data, int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, target, (long)(data.length << 2), data, usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferData BufferData}
     */
    public static void glBufferData(int target, double[] data, int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, target, (long)(data.length << 3), data, usage);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferSubData BufferSubData}
     */
    public static void glBufferSubData(int target, long offset, short[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 1), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferSubData BufferSubData}
     */
    public static void glBufferSubData(int target, long offset, int[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 2), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferSubData BufferSubData}
     */
    public static void glBufferSubData(int target, long offset, float[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 2), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glBufferSubData BufferSubData}
     */
    public static void glBufferSubData(int target, long offset, double[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 3), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetBufferSubData GetBufferSubData}
     */
    public static void glGetBufferSubData(int target, long offset, short[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 1), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetBufferSubData GetBufferSubData}
     */
    public static void glGetBufferSubData(int target, long offset, int[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 2), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetBufferSubData GetBufferSubData}
     */
    public static void glGetBufferSubData(int target, long offset, float[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 2), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferSubData">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetBufferSubData GetBufferSubData}
     */
    public static void glGetBufferSubData(int target, long offset, double[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, target, offset, (long)(data.length << 3), data);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetBufferParameter">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetBufferParameteriv GetBufferParameteriv}
     */
    public static void glGetBufferParameteriv(int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGenQueries">Reference Page</a></p>
     * 
     * Array version of: {@link #glGenQueries GenQueries}
     */
    public static void glGenQueries(int[] ids) {
        long __functionAddress = GL.getICD().glGenQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glDeleteQueries">Reference Page</a></p>
     * 
     * Array version of: {@link #glDeleteQueries DeleteQueries}
     */
    public static void glDeleteQueries(int[] ids) {
        long __functionAddress = GL.getICD().glDeleteQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQuery">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetQueryiv GetQueryiv}
     */
    public static void glGetQueryiv(int target, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetQueryiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetQueryObjectiv GetQueryObjectiv}
     */
    public static void glGetQueryObjectiv(int id, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /**
     * <p><a target="_blank" href="http://docs.gl/gl4/glGetQueryObject">Reference Page</a></p>
     * 
     * Array version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv}
     */
    public static void glGetQueryObjectuiv(int id, int pname, int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

}