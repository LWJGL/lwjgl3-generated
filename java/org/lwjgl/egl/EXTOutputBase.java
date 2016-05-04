/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class EXTOutputBase {

	/**  */
	public static final int
		EGL_BAD_OUTPUT_LAYER_EXT = 0x322D,
		EGL_BAD_OUTPUT_PORT_EXT  = 0x322E,
		EGL_SWAP_INTERVAL_EXT    = 0x322F;

	/**  */
	public static final long
		EGL_NO_OUTPUT_LAYER_EXT = 0x0L,
		EGL_NO_OUTPUT_PORT_EXT  = 0x0L;

	protected EXTOutputBase() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglGetOutputLayersEXT, caps.eglGetOutputPortsEXT, caps.eglOutputLayerAttribEXT, caps.eglQueryOutputLayerAttribEXT, 
			caps.eglQueryOutputLayerStringEXT, caps.eglOutputPortAttribEXT, caps.eglQueryOutputPortAttribEXT, caps.eglQueryOutputPortStringEXT
		);
	}

	// --- [ eglGetOutputLayersEXT ] ---

	public static int neglGetOutputLayersEXT(long dpy, long attrib_list, long layers, int max_layers, long num_layers) {
		long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPPPI(__functionAddress, dpy, attrib_list, layers, max_layers, num_layers);
	}

	public static boolean eglGetOutputLayersEXT(long dpy, PointerBuffer attrib_list, PointerBuffer layers, IntBuffer num_layers) {
		if ( CHECKS ) {
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_layers, 1);
		}
		return neglGetOutputLayersEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), layers == null ? 0 : layers.remaining(), memAddress(num_layers)) != 0;
	}

	// --- [ eglGetOutputPortsEXT ] ---

	public static int neglGetOutputPortsEXT(long dpy, long attrib_list, long ports, int max_ports, long num_ports) {
		long __functionAddress = EGL.getCapabilities().eglGetOutputPortsEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPPPI(__functionAddress, dpy, attrib_list, ports, max_ports, num_ports);
	}

	public static boolean eglGetOutputPortsEXT(long dpy, PointerBuffer attrib_list, PointerBuffer ports, IntBuffer num_ports) {
		if ( CHECKS ) {
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_ports, 1);
		}
		return neglGetOutputPortsEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), ports == null ? 0 : ports.remaining(), memAddress(num_ports)) != 0;
	}

	// --- [ eglOutputLayerAttribEXT ] ---

	public static boolean eglOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglOutputLayerAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(layer);
		}
		return callPPPI(__functionAddress, dpy, layer, attribute, value) != 0;
	}

	// --- [ eglQueryOutputLayerAttribEXT ] ---

	public static int neglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(layer);
		}
		return callPPPI(__functionAddress, dpy, layer, attribute, value);
	}

	public static boolean eglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, memAddress(value)) != 0;
	}

	// --- [ eglQueryOutputLayerStringEXT ] ---

	public static long neglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
		long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerStringEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(layer);
		}
		return callPPP(__functionAddress, dpy, layer, name);
	}

	public static String eglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
		long __result = neglQueryOutputLayerStringEXT(dpy, layer, name);
		return memASCII(__result);
	}

	// --- [ eglOutputPortAttribEXT ] ---

	public static boolean eglOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglOutputPortAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(port);
		}
		return callPPPI(__functionAddress, dpy, port, attribute, value) != 0;
	}

	// --- [ eglQueryOutputPortAttribEXT ] ---

	public static int neglQueryOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryOutputPortAttribEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(port);
		}
		return callPPPI(__functionAddress, dpy, port, attribute, value);
	}

	public static boolean eglQueryOutputPortAttribEXT(long dpy, long port, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryOutputPortAttribEXT(dpy, port, attribute, memAddress(value)) != 0;
	}

	// --- [ eglQueryOutputPortStringEXT ] ---

	public static long neglQueryOutputPortStringEXT(long dpy, long port, int name) {
		long __functionAddress = EGL.getCapabilities().eglQueryOutputPortStringEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(port);
		}
		return callPPP(__functionAddress, dpy, port, name);
	}

	public static String eglQueryOutputPortStringEXT(long dpy, long port, int name) {
		long __result = neglQueryOutputPortStringEXT(dpy, port, name);
		return memASCII(__result);
	}

	/** Array version of: {@link #eglGetOutputLayersEXT GetOutputLayersEXT} */
	public static boolean eglGetOutputLayersEXT(long dpy, PointerBuffer attrib_list, PointerBuffer layers, int[] num_layers) {
		long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_layers, 1);
		}
		return callPPPPI(__functionAddress, dpy, memAddressSafe(attrib_list), memAddressSafe(layers), layers == null ? 0 : layers.remaining(), num_layers) != 0;
	}

	/** Array version of: {@link #eglGetOutputPortsEXT GetOutputPortsEXT} */
	public static boolean eglGetOutputPortsEXT(long dpy, PointerBuffer attrib_list, PointerBuffer ports, int[] num_ports) {
		long __functionAddress = EGL.getCapabilities().eglGetOutputPortsEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_ports, 1);
		}
		return callPPPPI(__functionAddress, dpy, memAddressSafe(attrib_list), memAddressSafe(ports), ports == null ? 0 : ports.remaining(), num_ports) != 0;
	}

}