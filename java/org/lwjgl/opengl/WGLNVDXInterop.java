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
 * 
 * <p>This extension allows OpenGL to directly access DirectX buffers and surfaces. A DirectX vertex buffer may be shared as an OpenGL buffer object and a
 * DirectX surface may be shared as an OpenGL texture or renderbuffer object.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}.</p>
 */
public final class WGLNVDXInterop {

	/** Accepted by the {@code access} parameters of {@link #wglDXRegisterObjectNV DXRegisterObjectNV} and {@link #wglDXObjectAccessNV DXObjectAccessNV}. */
	public static final int
		WGL_ACCESS_READ_ONLY_NV     = 0x0,
		WGL_ACCESS_READ_WRITE_NV    = 0x1,
		WGL_ACCESS_WRITE_DISCARD_NV = 0x2;

	/** Function address. */
	@JavadocExclude
	public final long
		DXSetResourceShareHandleNV,
		DXOpenDeviceNV,
		DXCloseDeviceNV,
		DXRegisterObjectNV,
		DXUnregisterObjectNV,
		DXObjectAccessNV,
		DXLockObjectsNV,
		DXUnlockObjectsNV;

	@JavadocExclude
	public WGLNVDXInterop(FunctionProvider provider) {
		DXSetResourceShareHandleNV = provider.getFunctionAddress("wglDXSetResourceShareHandleNV");
		DXOpenDeviceNV = provider.getFunctionAddress("wglDXOpenDeviceNV");
		DXCloseDeviceNV = provider.getFunctionAddress("wglDXCloseDeviceNV");
		DXRegisterObjectNV = provider.getFunctionAddress("wglDXRegisterObjectNV");
		DXUnregisterObjectNV = provider.getFunctionAddress("wglDXUnregisterObjectNV");
		DXObjectAccessNV = provider.getFunctionAddress("wglDXObjectAccessNV");
		DXLockObjectsNV = provider.getFunctionAddress("wglDXLockObjectsNV");
		DXUnlockObjectsNV = provider.getFunctionAddress("wglDXUnlockObjectsNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVDXInterop} instance for the current context. */
	public static WGLNVDXInterop getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLNVDXInterop);
	}

	static WGLNVDXInterop create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_DX_interop") ) return null;

		WGLNVDXInterop funcs = new WGLNVDXInterop(provider);

		boolean supported = checkFunctions(
			funcs.DXSetResourceShareHandleNV, funcs.DXOpenDeviceNV, funcs.DXCloseDeviceNV, funcs.DXRegisterObjectNV, funcs.DXUnregisterObjectNV, 
			funcs.DXObjectAccessNV, funcs.DXLockObjectsNV, funcs.DXUnlockObjectsNV
		);

		return GL.checkExtension("WGL_NV_DX_interop", funcs, supported);
	}

	// --- [ wglDXSetResourceShareHandleNV ] ---

	/** JNI method for {@link #wglDXSetResourceShareHandleNV DXSetResourceShareHandleNV} */
	@JavadocExclude
	public static native int nwglDXSetResourceShareHandleNV(long dxObject, long shareHandle, long __functionAddress);

	/**
	 * 
	 *
	 * @param dxObject    a pointer to the DirectX resource that will be shared
	 * @param shareHandle the share handle that the OS generated for the resource
	 */
	public static int wglDXSetResourceShareHandleNV(long dxObject, long shareHandle) {
		long __functionAddress = getInstance().DXSetResourceShareHandleNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dxObject);
			checkPointer(shareHandle);
		}
		return nwglDXSetResourceShareHandleNV(dxObject, shareHandle, __functionAddress);
	}

	// --- [ wglDXOpenDeviceNV ] ---

	/** JNI method for {@link #wglDXOpenDeviceNV DXOpenDeviceNV} */
	@JavadocExclude
	public static native long nwglDXOpenDeviceNV(long dxDevice, long __functionAddress);

	/**
	 * Prepares a DirectX device for interoperability and returns a handle to a GL/DirectX interop device.
	 *
	 * @param dxDevice a pointer to a supported Direct3D device object
	 */
	public static long wglDXOpenDeviceNV(long dxDevice) {
		long __functionAddress = getInstance().DXOpenDeviceNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dxDevice);
		return nwglDXOpenDeviceNV(dxDevice, __functionAddress);
	}

	// --- [ wglDXCloseDeviceNV ] ---

	/** JNI method for {@link #wglDXCloseDeviceNV DXCloseDeviceNV} */
	@JavadocExclude
	public static native int nwglDXCloseDeviceNV(long device, long __functionAddress);

	/**
	 * 
	 *
	 * @param device 
	 */
	public static int wglDXCloseDeviceNV(long device) {
		long __functionAddress = getInstance().DXCloseDeviceNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return nwglDXCloseDeviceNV(device, __functionAddress);
	}

	// --- [ wglDXRegisterObjectNV ] ---

	/** JNI method for {@link #wglDXRegisterObjectNV DXRegisterObjectNV} */
	@JavadocExclude
	public static native long nwglDXRegisterObjectNV(long device, long dxResource, int name, int type, int access, long __functionAddress);

	/**
	 * Prepares a DirectX object for use by the GL and returns a handle to a GL/DirectX interop object.
	 *
	 * @param device     a GL/DirectX interop device handle, as returned by {@link #wglDXOpenDeviceNV DXOpenDeviceNV}
	 * @param dxResource a pointer to a DirectX resource to be registered with the GL
	 * @param name       the GL object name to be assigned to the DirectX resource in the namespace of the objects identified by {@code type} in the current GL context
	 * @param type       the GL object type that will map to the DirectX resource being shared
	 * @param access     indicates the intended usage of the resource in GL. One of:<br>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}, {@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}, {@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}
	 */
	public static long wglDXRegisterObjectNV(long device, long dxResource, int name, int type, int access) {
		long __functionAddress = getInstance().DXRegisterObjectNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(device);
			checkPointer(dxResource);
		}
		return nwglDXRegisterObjectNV(device, dxResource, name, type, access, __functionAddress);
	}

	// --- [ wglDXUnregisterObjectNV ] ---

	/** JNI method for {@link #wglDXUnregisterObjectNV DXUnregisterObjectNV} */
	@JavadocExclude
	public static native int nwglDXUnregisterObjectNV(long device, long object, long __functionAddress);

	/**
	 * 
	 *
	 * @param device 
	 * @param object 
	 */
	public static int wglDXUnregisterObjectNV(long device, long object) {
		long __functionAddress = getInstance().DXUnregisterObjectNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(device);
			checkPointer(object);
		}
		return nwglDXUnregisterObjectNV(device, object, __functionAddress);
	}

	// --- [ wglDXObjectAccessNV ] ---

	/** JNI method for {@link #wglDXObjectAccessNV DXObjectAccessNV} */
	@JavadocExclude
	public static native int nwglDXObjectAccessNV(long object, int access, long __functionAddress);

	/**
	 * Modifies the access mode of an interop object, if a different access mode is required after the object has been registered.
	 *
	 * @param object the GL/DirectX interop object
	 * @param access the new access mode. One of:<br>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}, {@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}, {@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}
	 */
	public static int wglDXObjectAccessNV(long object, int access) {
		long __functionAddress = getInstance().DXObjectAccessNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(object);
		return nwglDXObjectAccessNV(object, access, __functionAddress);
	}

	// --- [ wglDXLockObjectsNV ] ---

	/** JNI method for {@link #wglDXLockObjectsNV DXLockObjectsNV} */
	@JavadocExclude
	public static native int nwglDXLockObjectsNV(long device, int count, long objects, long __functionAddress);

	/** Unsafe version of {@link #wglDXLockObjectsNV DXLockObjectsNV} */
	@JavadocExclude
	public static int nwglDXLockObjectsNV(long device, int count, long objects) {
		long __functionAddress = getInstance().DXLockObjectsNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return nwglDXLockObjectsNV(device, count, objects, __functionAddress);
	}

	/**
	 * Before a GL object which is associated with a DirectX resource may be used, it must be locked with this function.
	 * 
	 * <p>A return value of TRUE indicates that all objects were successfully locked.  A return value of FALSE indicates an error. If the function returns FALSE,
	 * none of the objects will be locked.</p>
	 * 
	 * <p>Attempting to access an interop object via GL when the object is not locked, or attempting to access the DirectX resource through the DirectX API when
	 * it is locked by GL, will result in undefined behavior and may result in data corruption or program termination. Likewise, passing invalid interop device
	 * or object handles to this function has undefined results, including program termination.</p>
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param count   the number of objects to lock
	 * @param objects an array of {@code count} interop objects
	 */
	public static int wglDXLockObjectsNV(long device, int count, ByteBuffer objects) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(objects, count << POINTER_SHIFT);
		return nwglDXLockObjectsNV(device, count, memAddress(objects));
	}

	/** Alternative version of: {@link #wglDXLockObjectsNV DXLockObjectsNV} */
	public static int wglDXLockObjectsNV(long device, PointerBuffer objects) {
		return nwglDXLockObjectsNV(device, objects.remaining(), memAddress(objects));
	}

	// --- [ wglDXUnlockObjectsNV ] ---

	/** JNI method for {@link #wglDXUnlockObjectsNV DXUnlockObjectsNV} */
	@JavadocExclude
	public static native int nwglDXUnlockObjectsNV(long device, int count, long objects, long __functionAddress);

	/** Unsafe version of {@link #wglDXUnlockObjectsNV DXUnlockObjectsNV} */
	@JavadocExclude
	public static int nwglDXUnlockObjectsNV(long device, int count, long objects) {
		long __functionAddress = getInstance().DXUnlockObjectsNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return nwglDXUnlockObjectsNV(device, count, objects, __functionAddress);
	}

	/**
	 * Return control of an object to DirectX.
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param count   the number of objects to unlock
	 * @param objects an array of {@code count} interop objects
	 */
	public static int wglDXUnlockObjectsNV(long device, int count, ByteBuffer objects) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(objects, count << POINTER_SHIFT);
		return nwglDXUnlockObjectsNV(device, count, memAddress(objects));
	}

	/** Alternative version of: {@link #wglDXUnlockObjectsNV DXUnlockObjectsNV} */
	public static int wglDXUnlockObjectsNV(long device, PointerBuffer objects) {
		return nwglDXUnlockObjectsNV(device, objects.remaining(), memAddress(objects));
	}

}