/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_disjoint_timer_query.txt">EXT_disjoint_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. glFinish() can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to
 * be polled asynchronously by the application.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTDisjointTimerQuery {

    /** Accepted by the {@code pname} parameter of GetQueryivEXT. */
    public static final int
        GL_QUERY_COUNTER_BITS_EXT = 0x8864,
        GL_CURRENT_QUERY_EXT      = 0x8865;

    /** Accepted by the {@code pname} parameter of GetQueryObjectivEXT, GetQueryObjectuivEXT, GetQueryObjecti64vEXT, and GetQueryObjectui64vEXT. */
    public static final int
        GL_QUERY_RESULT_EXT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

    /** Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT. */
    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

    /**
     * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int GL_TIMESTAMP_EXT = 0x8E28;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_GPU_DISJOINT_EXT = 0x8FBB;

    static { GLES.initialize(); }

    protected EXTDisjointTimerQuery() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glGenQueriesEXT, caps.glDeleteQueriesEXT, caps.glIsQueryEXT, caps.glBeginQueryEXT, caps.glEndQueryEXT, caps.glQueryCounterEXT, 
            caps.glGetQueryivEXT, caps.glGetQueryObjectuivEXT, caps.glGetQueryObjecti64vEXT, caps.glGetQueryObjectui64vEXT
        );
    }

    // --- [ glGenQueriesEXT ] ---

    public static native void nglGenQueriesEXT(int n, long ids);

    public static void glGenQueriesEXT(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueriesEXT(ids.remaining(), memAddress(ids));
    }

    @NativeType("void")
    public static int glGenQueriesEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueriesEXT(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueriesEXT ] ---

    public static native void nglDeleteQueriesEXT(int n, long ids);

    public static void glDeleteQueriesEXT(@NativeType("const GLuint *") IntBuffer ids) {
        nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
    }

    public static void glDeleteQueriesEXT(@NativeType("const GLuint *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueriesEXT(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQueryEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsQueryEXT(@NativeType("GLuint") int id);

    // --- [ glBeginQueryEXT ] ---

    public static native void glBeginQueryEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQueryEXT ] ---

    public static native void glEndQueryEXT(@NativeType("GLenum") int target);

    // --- [ glQueryCounterEXT ] ---

    public static native void glQueryCounterEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryivEXT ] ---

    public static native void nglGetQueryivEXT(int target, int pname, long params);

    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryivEXT(target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectivEXT ] ---

    public static native void nglGetQueryObjectivEXT(int id, int pname, long params);

    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectivEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryObjectiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuivEXT ] ---

    public static native void nglGetQueryObjectuivEXT(int id, int pname, long params);

    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuivEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryObjectuiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjecti64vEXT ] ---

    public static native void nglGetQueryObjecti64vEXT(int id, int pname, long params);

    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetQueryObjecti64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64vEXT ] ---

    public static native void nglGetQueryObjectui64vEXT(int id, int pname, long params);

    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetQueryObjectui64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGenQueriesEXT GenQueriesEXT} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glGenQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

    /** Array version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
    public static void glDeleteQueriesEXT(@NativeType("const GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glDeleteQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

    /** Array version of: {@link #glGetQueryivEXT GetQueryivEXT} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, id, pname, params);
    }

}