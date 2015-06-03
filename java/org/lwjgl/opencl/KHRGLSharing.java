/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/khr/cl_khr_gl_sharing.txt">khr_gl_sharing</a> extension. */
public final class KHRGLSharing {

	/**
	 * Returned by {@link CL10#clCreateContext CreateContext}, {@link CL10#clCreateContextFromType CreateContextFromType}, and {@link #clGetGLContextInfoKHR GetGLContextInfoKHR} when an invalid OpenGL context or
	 * share group object handle is specified in {@code properties}.
	 */
	public static final int CL_INVALID_GL_SHAREGROUP_REFERENCE_KHR = 0xFFFFFC18;

	/**
	 * Accepted as the {@code param_name} argument of {@link #clGetGLContextInfoKHR GetGLContextInfoKHR}. Returns a list of all CL devices which may be associated with the
	 * specified OpenGL context.
	 */
	public static final int CL_DEVICES_FOR_GL_CONTEXT_KHR = 0x2007;

	/**
	 * Accepted as the {@code param_name} argument of {@link #clGetGLContextInfoKHR GetGLContextInfoKHR}. Returns the CL device currently associated with the specified OpenGL
	 * context.
	 */
	public static final int CL_CURRENT_DEVICE_FOR_GL_CONTEXT_KHR = 0x2006;

	/** Accepted as an attribute name in the {@code properties} argument of {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType}. */
	public static final int
		CL_GL_CONTEXT_KHR     = 0x2008,
		CL_EGL_DISPLAY_KHR    = 0x2009,
		CL_GLX_DISPLAY_KHR    = 0x200A,
		CL_WGL_HDC_KHR        = 0x200B,
		CL_CGL_SHAREGROUP_KHR = 0x200C;

	/** Function address. */
	@JavadocExclude
	public final long GetGLContextInfoKHR;

	@JavadocExclude
	public KHRGLSharing(FunctionProvider provider) {
		GetGLContextInfoKHR = provider.getFunctionAddress("clGetGLContextInfoKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRGLSharing} instance for the currently loaded ICD. */
	public static KHRGLSharing getInstance() {
		return checkFunctionality(CL.getICD().__KHRGLSharing);
	}

	static KHRGLSharing create(FunctionProvider provider) {
		KHRGLSharing funcs = new KHRGLSharing(provider);

		boolean supported = checkFunctions(
			funcs.GetGLContextInfoKHR
		);

		return supported ? funcs : null;
	}

	// --- [ clGetGLContextInfoKHR ] ---

	/** JNI method for {@link #clGetGLContextInfoKHR GetGLContextInfoKHR} */
	@JavadocExclude
	public static native int nclGetGLContextInfoKHR(long properties, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetGLContextInfoKHR GetGLContextInfoKHR} */
	@JavadocExclude
	public static int nclGetGLContextInfoKHR(long properties, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetGLContextInfoKHR;
		return nclGetGLContextInfoKHR(properties, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Queries the OpenCL device currently corresponding to an OpenGL context.
	 * 
	 * <p>Such a device may not always exist (for example, if an OpenGL context is specified on a GPU not supporting OpenCL command queues, but which does support
	 * shared CL/GL objects), and if it does exist, may change over time. When such a device does exist, acquiring and releasing shared CL/GL objects may be
	 * faster on a command queue corresponding to this device than on command queues corresponding to other devices available to an OpenCL context.</p>
	 *
	 * @param properties           points to an attribute list whose format and valid contents are identical to the {code properties} argument of {@link CL10#clCreateContext CreateContext}.
	 *                             {@code properties} must identify a single valid GL context or GL share group object.
	 * @param param_name           a constant that specifies the GL context information to query. One of:<br>{@link #CL_DEVICES_FOR_GL_CONTEXT_KHR DEVICES_FOR_GL_CONTEXT_KHR}, {@link #CL_CURRENT_DEVICE_FOR_GL_CONTEXT_KHR CURRENT_DEVICE_FOR_GL_CONTEXT_KHR}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. If no device(s) exist corresponding to {@code param_name}, the call will not fail, but the value
	 *         of {@code param_value_size_ret} will be zero.
	 *         
	 *         <p>Returns {@link #CL_INVALID_GL_SHAREGROUP_REFERENCE_KHR INVALID_GL_SHAREGROUP_REFERENCE_KHR} if a context was specified by any of the following means:
	 *         <ul>
	 *         <li>A context was specified for an EGL-based OpenGL ES or OpenGL implementation by setting the attributes {@link #CL_GL_CONTEXT_KHR GL_CONTEXT_KHR} and {@link #CL_EGL_DISPLAY_KHR EGL_DISPLAY_KHR}.</li>
	 *         <li>A context was specified for a GLX-based OpenGL implementation by setting the attributes {@link #CL_GL_CONTEXT_KHR GL_CONTEXT_KHR} and {@link #CL_GLX_DISPLAY_KHR GLX_DISPLAY_KHR}.</li>
	 *         <li>A context was specified for a WGL-based OpenGL implementation by setting the attributes {@link #CL_GL_CONTEXT_KHR GL_CONTEXT_KHR} and {@link #CL_WGL_HDC_KHR WGL_HDC_KHR}.</li>
	 *         </ul>
	 *         and any of the following conditions hold:
	 *         <ul>
	 *         <li>The specified display and context attributes do not identify a valid OpenGL or OpenGL ES context.</li>
	 *         <li>The specified context does not support buffer and renderbuffer objects.</li>
	 *         <li>The specified context is not compatible with the OpenCL context being created (for example, it exists in a physically distinct address space, such
	 *         as another hardware device; or it does not support sharing data with OpenCL due to implementation restrictions).</li>
	 *         </ul></p>
	 *         
	 *         <p>Returns {@link #CL_INVALID_GL_SHAREGROUP_REFERENCE_KHR INVALID_GL_SHAREGROUP_REFERENCE_KHR} if a share group was specified for a CGL-based OpenGL implementation by setting the attribute
	 *         {@link #CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR}, and the specified share group does not identify a valid CGL share group object.</p>
	 *         
	 *         <p>Returns {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if a context was specified as described above and any of the following conditions hold:
	 *         <ul>
	 *         <li>A context or share group object was specified for one of CGL, EGL, GLX, or WGL and the OpenGL implementation does not support that window-system
	 *         binding API.</li>
	 *         <li>More than one of the attributes {@link #CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR}, {@link #CL_EGL_DISPLAY_KHR EGL_DISPLAY_KHR}, {@link #CL_GLX_DISPLAY_KHR GLX_DISPLAY_KHR}, and
	 *         {@link #CL_WGL_HDC_KHR WGL_HDC_KHR} is set to a non-default value.</li>
	 *         <li>Both of the attributes {@link #CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR} and {@link #CL_GL_CONTEXT_KHR GL_CONTEXT_KHR} are set to non-default values.</li>
	 *         <li>Any of the devices specified in the {@code devices} argument cannot support OpenCL objects which share the data store of an OpenGL object.</li>
	 *         </ul></p>
	 *         
	 *         <p>Returns {@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an invalid attribute name is specified in {@code properties}.</p>
	 *         
	 *         <p>Additionally, returns {@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is invalid, or if the size in bytes specified by {@code param_value_size} is
	 *         less than the size of the return type and {@code param_value} is not a {@code NULL} value, {@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate
	 *         resources required by the OpenCL implementation on the device, or {@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by
	 *         the OpenCL implementation on the host.</p>
	 */
	public static int clGetGLContextInfoKHR(ByteBuffer properties, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 5 << POINTER_SHIFT);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetGLContextInfoKHR(memAddress(properties), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetGLContextInfoKHR GetGLContextInfoKHR} */
	public static int clGetGLContextInfoKHR(PointerBuffer properties, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 5);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetGLContextInfoKHR(memAddress(properties), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetGLContextInfoKHR GetGLContextInfoKHR} */
	public static int clGetGLContextInfoKHR(PointerBuffer properties, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 5);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetGLContextInfoKHR(memAddress(properties), param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

}