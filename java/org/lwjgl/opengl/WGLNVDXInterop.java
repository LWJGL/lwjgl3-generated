/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/DX_interop.txt">WGL_NV_DX_interop</a> extension.
 * 
 * <p>This extension allows OpenGL to directly access DirectX buffers and surfaces. A DirectX vertex buffer may be shared as an OpenGL buffer object and a
 * DirectX surface may be shared as an OpenGL texture or renderbuffer object.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}.</p>
 */
public class WGLNVDXInterop {

	/** Accepted by the {@code access} parameters of {@link #wglDXRegisterObjectNV DXRegisterObjectNV} and {@link #wglDXObjectAccessNV DXObjectAccessNV}. */
	public static final int
		WGL_ACCESS_READ_ONLY_NV     = 0x0,
		WGL_ACCESS_READ_WRITE_NV    = 0x1,
		WGL_ACCESS_WRITE_DISCARD_NV = 0x2;

	protected WGLNVDXInterop() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglDXSetResourceShareHandleNV, caps.wglDXOpenDeviceNV, caps.wglDXCloseDeviceNV, caps.wglDXRegisterObjectNV, caps.wglDXUnregisterObjectNV, 
			caps.wglDXObjectAccessNV, caps.wglDXLockObjectsNV, caps.wglDXUnlockObjectsNV
		);
	}

	// --- [ wglDXSetResourceShareHandleNV ] ---

	/**
	 * 
	 *
	 * @param dxObject    a pointer to the DirectX resource that will be shared
	 * @param shareHandle the share handle that the OS generated for the resource
	 */
	public static boolean wglDXSetResourceShareHandleNV(long dxObject, long shareHandle) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXSetResourceShareHandleNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dxObject);
			checkPointer(shareHandle);
		}
		return callPPI(__functionAddress, dxObject, shareHandle) != 0;
	}

	// --- [ wglDXOpenDeviceNV ] ---

	/**
	 * Prepares a DirectX device for interoperability and returns a handle to a GL/DirectX interop device.
	 *
	 * @param dxDevice a pointer to a supported Direct3D device object
	 */
	public static long wglDXOpenDeviceNV(long dxDevice) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXOpenDeviceNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dxDevice);
		}
		return callPP(__functionAddress, dxDevice);
	}

	// --- [ wglDXCloseDeviceNV ] ---

	public static boolean wglDXCloseDeviceNV(long device) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXCloseDeviceNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return callPI(__functionAddress, device) != 0;
	}

	// --- [ wglDXRegisterObjectNV ] ---

	/**
	 * Prepares a DirectX object for use by the GL and returns a handle to a GL/DirectX interop object.
	 *
	 * @param device     a GL/DirectX interop device handle, as returned by {@link #wglDXOpenDeviceNV DXOpenDeviceNV}
	 * @param dxResource a pointer to a DirectX resource to be registered with the GL
	 * @param name       the GL object name to be assigned to the DirectX resource in the namespace of the objects identified by {@code type} in the current GL context
	 * @param type       the GL object type that will map to the DirectX resource being shared
	 * @param access     indicates the intended usage of the resource in GL. One of:<br><table><tr><td>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}</td><td>{@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}</td><td>{@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}</td></tr></table>
	 */
	public static long wglDXRegisterObjectNV(long device, long dxResource, int name, int type, int access) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXRegisterObjectNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkPointer(dxResource);
		}
		return callPPP(__functionAddress, device, dxResource, name, type, access);
	}

	// --- [ wglDXUnregisterObjectNV ] ---

	public static boolean wglDXUnregisterObjectNV(long device, long object) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXUnregisterObjectNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkPointer(object);
		}
		return callPPI(__functionAddress, device, object) != 0;
	}

	// --- [ wglDXObjectAccessNV ] ---

	/**
	 * Modifies the access mode of an interop object, if a different access mode is required after the object has been registered.
	 *
	 * @param object the GL/DirectX interop object
	 * @param access the new access mode. One of:<br><table><tr><td>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}</td><td>{@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}</td><td>{@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}</td></tr></table>
	 */
	public static boolean wglDXObjectAccessNV(long object, int access) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXObjectAccessNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(object);
		}
		return callPI(__functionAddress, object, access) != 0;
	}

	// --- [ wglDXLockObjectsNV ] ---

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
	public static int nwglDXLockObjectsNV(long device, int count, long objects) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXLockObjectsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return callPPI(__functionAddress, device, count, objects);
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
	 * @param objects an array of {@code count} interop objects
	 */
	public static boolean wglDXLockObjectsNV(long device, PointerBuffer objects) {
		return nwglDXLockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
	}

	// --- [ wglDXUnlockObjectsNV ] ---

	/**
	 * Return control of an object to DirectX.
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param count   the number of objects to unlock
	 * @param objects an array of {@code count} interop objects
	 */
	public static int nwglDXUnlockObjectsNV(long device, int count, long objects) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDXUnlockObjectsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return callPPI(__functionAddress, device, count, objects);
	}

	/**
	 * Return control of an object to DirectX.
	 *
	 * @param device  the GL/DirectX interop device handle
	 * @param objects an array of {@code count} interop objects
	 */
	public static boolean wglDXUnlockObjectsNV(long device, PointerBuffer objects) {
		return nwglDXUnlockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
	}

}