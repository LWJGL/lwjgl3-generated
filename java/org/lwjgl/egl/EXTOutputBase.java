/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_output_base.txt">EXT_output_base</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension defines new EGL resource types for referencing display control hardware associated with an EGL device. Its purpose is to allow rendering
 * to be directed to a screen in the absence of (or bypassing) a window system. Because the use models for these resources are potentially diverse, only
 * the objects themselves and basic functions to acquire and query them are defined here. More detailed functions and enumerants required to operate on
 * outputs are provided by separate extensions.</p>
 * 
 * <p>Requires {@link EXTDeviceBase EXT_device_base}.</p>
 */
public final class EXTOutputBase {

	/**  */
	public static final int
		EGL_BAD_OUTPUT_LAYER_EXT = 0x322D,
		EGL_BAD_OUTPUT_PORT_EXT  = 0x322E,
		EGL_SWAP_INTERVAL_EXT    = 0x322F;

	/**  */
	public static final long
		EGL_NO_OUTPUT_LAYER_EXT = 0x0L,
		EGL_NO_OUTPUT_PORT_EXT  = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long
		GetOutputLayersEXT,
		GetOutputPortsEXT,
		OutputLayerAttribEXT,
		QueryOutputLayerAttribEXT,
		QueryOutputLayerStringEXT,
		OutputPortAttribEXT,
		QueryOutputPortAttribEXT,
		QueryOutputPortStringEXT;

	@JavadocExclude
	public EXTOutputBase(FunctionProvider provider) {
		GetOutputLayersEXT = provider.getFunctionAddress("eglGetOutputLayersEXT");
		GetOutputPortsEXT = provider.getFunctionAddress("eglGetOutputPortsEXT");
		OutputLayerAttribEXT = provider.getFunctionAddress("eglOutputLayerAttribEXT");
		QueryOutputLayerAttribEXT = provider.getFunctionAddress("eglQueryOutputLayerAttribEXT");
		QueryOutputLayerStringEXT = provider.getFunctionAddress("eglQueryOutputLayerStringEXT");
		OutputPortAttribEXT = provider.getFunctionAddress("eglOutputPortAttribEXT");
		QueryOutputPortAttribEXT = provider.getFunctionAddress("eglQueryOutputPortAttribEXT");
		QueryOutputPortStringEXT = provider.getFunctionAddress("eglQueryOutputPortStringEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTOutputBase} instance. */
	public static EXTOutputBase getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTOutputBase);
	}

	static EXTOutputBase create(FunctionProvider provider) {
		EXTOutputBase funcs = new EXTOutputBase(provider);

		boolean supported = checkFunctions(
			funcs.GetOutputLayersEXT, funcs.GetOutputPortsEXT, funcs.OutputLayerAttribEXT, funcs.QueryOutputLayerAttribEXT, funcs.QueryOutputLayerStringEXT, 
			funcs.OutputPortAttribEXT, funcs.QueryOutputPortAttribEXT, funcs.QueryOutputPortStringEXT
		);

		return supported ? funcs : null;
	}

	// --- [ eglGetOutputLayersEXT ] ---

	/** JNI method for {@link #eglGetOutputLayersEXT GetOutputLayersEXT} */
	@JavadocExclude
	public static native boolean neglGetOutputLayersEXT(long dpy, long attrib_list, long layers, int max_layers, long num_layers, long __functionAddress);

	/** Unsafe version of {@link #eglGetOutputLayersEXT GetOutputLayersEXT} */
	@JavadocExclude
	public static boolean neglGetOutputLayersEXT(long dpy, long attrib_list, long layers, int max_layers, long num_layers) {
		long __functionAddress = getInstance().GetOutputLayersEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglGetOutputLayersEXT(dpy, attrib_list, layers, max_layers, num_layers, __functionAddress);
	}

	public static boolean eglGetOutputLayersEXT(long dpy, ByteBuffer attrib_list, ByteBuffer layers, int max_layers, ByteBuffer num_layers) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
			if ( layers != null ) checkBuffer(layers, max_layers << POINTER_SHIFT);
			checkBuffer(num_layers, 1 << 2);
		}
		return neglGetOutputLayersEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), max_layers, memAddress(num_layers));
	}

	/** Alternative version of: {@link #eglGetOutputLayersEXT GetOutputLayersEXT} */
	public static boolean eglGetOutputLayersEXT(long dpy, PointerBuffer attrib_list, PointerBuffer layers, IntBuffer num_layers) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_layers, 1);
		}
		return neglGetOutputLayersEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), layers == null ? 0 : layers.remaining(), memAddress(num_layers));
	}

	// --- [ eglGetOutputPortsEXT ] ---

	/** JNI method for {@link #eglGetOutputPortsEXT GetOutputPortsEXT} */
	@JavadocExclude
	public static native boolean neglGetOutputPortsEXT(long dpy, long attrib_list, long ports, int max_ports, long num_ports, long __functionAddress);

	/** Unsafe version of {@link #eglGetOutputPortsEXT GetOutputPortsEXT} */
	@JavadocExclude
	public static boolean neglGetOutputPortsEXT(long dpy, long attrib_list, long ports, int max_ports, long num_ports) {
		long __functionAddress = getInstance().GetOutputPortsEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglGetOutputPortsEXT(dpy, attrib_list, ports, max_ports, num_ports, __functionAddress);
	}

	public static boolean eglGetOutputPortsEXT(long dpy, ByteBuffer attrib_list, ByteBuffer ports, int max_ports, ByteBuffer num_ports) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
			if ( ports != null ) checkBuffer(ports, max_ports << POINTER_SHIFT);
			checkBuffer(num_ports, 1 << 2);
		}
		return neglGetOutputPortsEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), max_ports, memAddress(num_ports));
	}

	/** Alternative version of: {@link #eglGetOutputPortsEXT GetOutputPortsEXT} */
	public static boolean eglGetOutputPortsEXT(long dpy, PointerBuffer attrib_list, PointerBuffer ports, IntBuffer num_ports) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_ports, 1);
		}
		return neglGetOutputPortsEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), ports == null ? 0 : ports.remaining(), memAddress(num_ports));
	}

	// --- [ eglOutputLayerAttribEXT ] ---

	/** JNI method for {@link #eglOutputLayerAttribEXT OutputLayerAttribEXT} */
	@JavadocExclude
	public static native boolean neglOutputLayerAttribEXT(long dpy, long layer, int attribute, long value, long __functionAddress);

	public static boolean eglOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
		long __functionAddress = getInstance().OutputLayerAttribEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(layer);
		}
		return neglOutputLayerAttribEXT(dpy, layer, attribute, value, __functionAddress);
	}

	// --- [ eglQueryOutputLayerAttribEXT ] ---

	/** JNI method for {@link #eglQueryOutputLayerAttribEXT QueryOutputLayerAttribEXT} */
	@JavadocExclude
	public static native boolean neglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #eglQueryOutputLayerAttribEXT QueryOutputLayerAttribEXT} */
	@JavadocExclude
	public static boolean neglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
		long __functionAddress = getInstance().QueryOutputLayerAttribEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(layer);
		}
		return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, value, __functionAddress);
	}

	public static boolean eglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryOutputLayerAttribEXT QueryOutputLayerAttribEXT} */
	public static boolean eglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, memAddress(value));
	}

	// --- [ eglQueryOutputLayerStringEXT ] ---

	/** JNI method for {@link #eglQueryOutputLayerStringEXT QueryOutputLayerStringEXT} */
	@JavadocExclude
	public static native long neglQueryOutputLayerStringEXT(long dpy, long layer, int name, long __functionAddress);

	/** Unsafe version of {@link #eglQueryOutputLayerStringEXT QueryOutputLayerStringEXT} */
	@JavadocExclude
	public static long neglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
		long __functionAddress = getInstance().QueryOutputLayerStringEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(layer);
		}
		return neglQueryOutputLayerStringEXT(dpy, layer, name, __functionAddress);
	}

	public static String eglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
		long __result = neglQueryOutputLayerStringEXT(dpy, layer, name);
		return memDecodeASCII(__result);
	}

	// --- [ eglOutputPortAttribEXT ] ---

	/** JNI method for {@link #eglOutputPortAttribEXT OutputPortAttribEXT} */
	@JavadocExclude
	public static native boolean neglOutputPortAttribEXT(long dpy, long port, int attribute, long value, long __functionAddress);

	public static boolean eglOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
		long __functionAddress = getInstance().OutputPortAttribEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(port);
		}
		return neglOutputPortAttribEXT(dpy, port, attribute, value, __functionAddress);
	}

	// --- [ eglQueryOutputPortAttribEXT ] ---

	/** JNI method for {@link #eglQueryOutputPortAttribEXT QueryOutputPortAttribEXT} */
	@JavadocExclude
	public static native boolean neglQueryOutputPortAttribEXT(long dpy, long port, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #eglQueryOutputPortAttribEXT QueryOutputPortAttribEXT} */
	@JavadocExclude
	public static boolean neglQueryOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
		long __functionAddress = getInstance().QueryOutputPortAttribEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(port);
		}
		return neglQueryOutputPortAttribEXT(dpy, port, attribute, value, __functionAddress);
	}

	public static boolean eglQueryOutputPortAttribEXT(long dpy, long port, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQueryOutputPortAttribEXT(dpy, port, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryOutputPortAttribEXT QueryOutputPortAttribEXT} */
	public static boolean eglQueryOutputPortAttribEXT(long dpy, long port, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQueryOutputPortAttribEXT(dpy, port, attribute, memAddress(value));
	}

	// --- [ eglQueryOutputPortStringEXT ] ---

	/** JNI method for {@link #eglQueryOutputPortStringEXT QueryOutputPortStringEXT} */
	@JavadocExclude
	public static native long neglQueryOutputPortStringEXT(long dpy, long port, int name, long __functionAddress);

	/** Unsafe version of {@link #eglQueryOutputPortStringEXT QueryOutputPortStringEXT} */
	@JavadocExclude
	public static long neglQueryOutputPortStringEXT(long dpy, long port, int name) {
		long __functionAddress = getInstance().QueryOutputPortStringEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(port);
		}
		return neglQueryOutputPortStringEXT(dpy, port, name, __functionAddress);
	}

	public static String eglQueryOutputPortStringEXT(long dpy, long port, int name) {
		long __result = neglQueryOutputPortStringEXT(dpy, port, name);
		return memDecodeASCII(__result);
	}

}