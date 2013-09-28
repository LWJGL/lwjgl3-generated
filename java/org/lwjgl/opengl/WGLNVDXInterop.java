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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/DX_interop.txt">WGL_NV_DX_interop</a> extension.
 * <p/>
 * This extension allows OpenGL to directly access DirectX buffers and surfaces. A DirectX vertex buffer may be shared as an OpenGL buffer object and a
 * DirectX surface may be shared as an OpenGL texture or renderbuffer object.
 */
public final class WGLNVDXInterop {

	/** Accepted by the {@code access} parameters of {@link #wglDXRegisterObjectNV} and {@link #wglDXObjectAccessNV}. */
	public static final int
		WGL_ACCESS_READ_ONLY_NV     = 0x0,
		WGL_ACCESS_READ_WRITE_NV    = 0x1,
		WGL_ACCESS_WRITE_DISCARD_NV = 0x2;

	private WGLNVDXInterop() {}

	// --- [ wglDXSetResourceShareHandleNV ] ---

	/** JNI method for {@link #wglDXSetResourceShareHandleNV wglDXSetResourceShareHandleNV} */
	public static native int nwglDXSetResourceShareHandleNV(long dxObject, long shareHandle, long __functionAddress);

	/**
	 * 
	 *
	 * @param dxObject    a pointer to the DirectX resource that will be shared
	 * @param shareHandle the share handle that the OS generated for the resource
	 */
	public static int wglDXSetResourceShareHandleNV(long dxObject, long shareHandle) {
		long __functionAddress = getInstance().wglDXSetResourceShareHandleNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dxObject);
			checkPointer(shareHandle);
		}
		return nwglDXSetResourceShareHandleNV(dxObject, shareHandle, __functionAddress);
	}

	// --- [ wglDXOpenDeviceNV ] ---

	/** JNI method for {@link #wglDXOpenDeviceNV wglDXOpenDeviceNV} */
	public static native long nwglDXOpenDeviceNV(long dxDevice, long __functionAddress);

	/**
	 * Prepares a DirectX device for interoperability and returns a handle to a GL/DirectX interop device.
	 *
	 * @param dxDevice a pointer to a supported Direct3D device object
	 */
	public static long wglDXOpenDeviceNV(long dxDevice) {
		long __functionAddress = getInstance().wglDXOpenDeviceNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dxDevice);
		}
		return nwglDXOpenDeviceNV(dxDevice, __functionAddress);
	}

	// --- [ wglDXCloseDeviceNV ] ---

	/** JNI method for {@link #wglDXCloseDeviceNV wglDXCloseDeviceNV} */
	public static native int nwglDXCloseDeviceNV(long device, long __functionAddress);

	/**
	 * 
	 *
	 * @param device 
	 */
	public static int wglDXCloseDeviceNV(long device) {
		long __functionAddress = getInstance().wglDXCloseDeviceNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return nwglDXCloseDeviceNV(device, __functionAddress);
	}

	// --- [ wglDXRegisterObjectNV ] ---

	/** JNI method for {@link #wglDXRegisterObjectNV wglDXRegisterObjectNV} */
	public static native long nwglDXRegisterObjectNV(long device, long dxResource, int name, int type, int access, long __functionAddress);

	/**
	 * Prepares a DirectX object for use by the GL and returns a handle to a GL/DirectX interop object.
	 *
	 * @param device     a GL/DirectX interop device handle, as returned by {@link #wglDXOpenDeviceNV}
	 * @param dxResource a pointer to a DirectX resource to be registered with the GL
	 * @param name       the GL object name to be assigned to the DirectX resource in the namespace of the objects identified by {@code type} in the current GL context
	 * @param type       the GL object type that will map to the DirectX resource being shared
	 * @param access     indicates the intended usage of the resource in GL. One of:<p/>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}, {@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}, {@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}
	 */
	public static long wglDXRegisterObjectNV(long device, long dxResource, int name, int type, int access) {
		long __functionAddress = getInstance().wglDXRegisterObjectNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkPointer(dxResource);
		}
		return nwglDXRegisterObjectNV(device, dxResource, name, type, access, __functionAddress);
	}

	// --- [ wglDXUnregisterObjectNV ] ---

	/** JNI method for {@link #wglDXUnregisterObjectNV wglDXUnregisterObjectNV} */
	public static native int nwglDXUnregisterObjectNV(long device, long object, long __functionAddress);

	/**
	 * 
	 *
	 * @param device 
	 * @param object 
	 */
	public static int wglDXUnregisterObjectNV(long device, long object) {
		long __functionAddress = getInstance().wglDXUnregisterObjectNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkPointer(object);
		}
		return nwglDXUnregisterObjectNV(device, object, __functionAddress);
	}

	// --- [ wglDXObjectAccessNV ] ---

	/** JNI method for {@link #wglDXObjectAccessNV wglDXObjectAccessNV} */
	public static native int nwglDXObjectAccessNV(long object, int access, long __functionAddress);

	/**
	 * Modifies the access mode of an interop object, if a different access mode is required after the object has been registered.
	 *
	 * @param object the GL/DirectX interop object
	 * @param access the new access mode. One of:<p/>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}, {@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}, {@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}
	 */
	public static int wglDXObjectAccessNV(long object, int access) {
		long __functionAddress = getInstance().wglDXObjectAccessNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(object);
		}
		return nwglDXObjectAccessNV(object, access, __functionAddress);
	}

	// --- [ wglDXLockObjectsNV ] ---

	/** JNI method for {@link #wglDXLockObjectsNV wglDXLockObjectsNV} */
	public static native int nwglDXLockObjectsNV(long device, int count, long objects, long __functionAddress);

	/**
	 * Before a GL object which is associated with a DirectX resource may be used, it must be locked with this function.
	 * <p/>
	 * A return value of TRUE indicates that all objects were successfully locked.  A return value of FALSE indicates an error. If the function returns FALSE,
	 * none of the objects will be locked.
	 * <p/>
	 * Attempting to access an interop object via GL when the object is not locked, or attempting to access the DirectX resource through the DirectX API when
	 * it is locked by GL, will result in undefined behavior and may result in data corruption or program termination. Likewise, passing invalid interop device
	 * or object handles to this function has undefined results, including program termination.
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param count   the number of objects to lock
	 * @param objects an array of {@code count} interop objects
	 */
	public static int wglDXLockObjectsNV(long device, int count, ByteBuffer objects) {
		long __functionAddress = getInstance().wglDXLockObjectsNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkBuffer(objects, count << POINTER_SHIFT);
		}
		return nwglDXLockObjectsNV(device, count, memAddress(objects), __functionAddress);
	}

	/** Alternative version of: {@link #wglDXLockObjectsNV wglDXLockObjectsNV} */
	public static int wglDXLockObjectsNV(long device, PointerBuffer objects) {
		long __functionAddress = getInstance().wglDXLockObjectsNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return nwglDXLockObjectsNV(device, objects.remaining(), memAddress(objects), __functionAddress);
	}

	// --- [ wglDXUnlockObjectsNV ] ---

	/** JNI method for {@link #wglDXUnlockObjectsNV wglDXUnlockObjectsNV} */
	public static native int nwglDXUnlockObjectsNV(long device, int count, long objects, long __functionAddress);

	/**
	 * Return control of an object to DirectX.
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param count   the number of objects to unlock
	 * @param objects an array of {@code count} interop objects
	 */
	public static int wglDXUnlockObjectsNV(long device, int count, ByteBuffer objects) {
		long __functionAddress = getInstance().wglDXUnlockObjectsNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkBuffer(objects, count << POINTER_SHIFT);
		}
		return nwglDXUnlockObjectsNV(device, count, memAddress(objects), __functionAddress);
	}

	/** Alternative version of: {@link #wglDXUnlockObjectsNV wglDXUnlockObjectsNV} */
	public static int wglDXUnlockObjectsNV(long device, PointerBuffer objects) {
		long __functionAddress = getInstance().wglDXUnlockObjectsNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return nwglDXUnlockObjectsNV(device, objects.remaining(), memAddress(objects), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLNVDXInterop;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_DX_interop") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglDXSetResourceShareHandleNV) &&
			GL.isFunctionSupported(funcs.wglDXOpenDeviceNV) &&
			GL.isFunctionSupported(funcs.wglDXCloseDeviceNV) &&
			GL.isFunctionSupported(funcs.wglDXRegisterObjectNV) &&
			GL.isFunctionSupported(funcs.wglDXUnregisterObjectNV) &&
			GL.isFunctionSupported(funcs.wglDXObjectAccessNV) &&
			GL.isFunctionSupported(funcs.wglDXLockObjectsNV) &&
			GL.isFunctionSupported(funcs.wglDXUnlockObjectsNV);

		return GL.checkExtension("WGL_NV_DX_interop", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLNVDXInterop}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			wglDXSetResourceShareHandleNV,
			wglDXOpenDeviceNV,
			wglDXCloseDeviceNV,
			wglDXRegisterObjectNV,
			wglDXUnregisterObjectNV,
			wglDXObjectAccessNV,
			wglDXLockObjectsNV,
			wglDXUnlockObjectsNV;

		public Functions(FunctionProvider provider) {
			wglDXSetResourceShareHandleNV = provider.getFunctionAddress("wglDXSetResourceShareHandleNV");
			wglDXOpenDeviceNV = provider.getFunctionAddress("wglDXOpenDeviceNV");
			wglDXCloseDeviceNV = provider.getFunctionAddress("wglDXCloseDeviceNV");
			wglDXRegisterObjectNV = provider.getFunctionAddress("wglDXRegisterObjectNV");
			wglDXUnregisterObjectNV = provider.getFunctionAddress("wglDXUnregisterObjectNV");
			wglDXObjectAccessNV = provider.getFunctionAddress("wglDXObjectAccessNV");
			wglDXLockObjectsNV = provider.getFunctionAddress("wglDXLockObjectsNV");
			wglDXUnlockObjectsNV = provider.getFunctionAddress("wglDXUnlockObjectsNV");
		}

	}

}